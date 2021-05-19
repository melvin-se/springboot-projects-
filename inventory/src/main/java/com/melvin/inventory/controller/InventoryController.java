package com.melvin.inventory.controller;

import com.melvin.inventory.entity.DeliveryEntity;
import com.melvin.inventory.entity.InventoryEntity;
import com.melvin.inventory.repo.DeliveryRepo;
import com.melvin.inventory.repo.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class InventoryController {

    @Autowired
    InventoryRepo inventoryRepo;

    @Autowired
    DeliveryRepo deliveryRepo;

    @RequestMapping
    public String home(){
        return "home";
    }

    @RequestMapping("/donate")
    public String donate(){
        return "donate";
    }

    @RequestMapping("/savingdonation")
    public String save(InventoryEntity inv){
        inventoryRepo.save(inv);
        return "thanks";
    }
    @RequestMapping("/choose")
    public String choose(Model model){
        List<InventoryEntity> list=(List<InventoryEntity>)inventoryRepo.findAll();
        model.addAttribute("l",list);
        return "choose";
    }

    @ResponseBody
    @RequestMapping("/save")
    public String delivered(@RequestParam long sno,@RequestParam int quantity_d,@RequestParam String address){

        InventoryEntity inventoryEntity= inventoryRepo.findById(sno).orElse(null);

        int quantity=inventoryEntity.getQuantity();
        String item=inventoryEntity.getItem();

        if(quantity_d>0 && quantity>=quantity_d)
        {
            quantity=quantity-quantity_d;
        }

        InventoryEntity inv=new InventoryEntity(sno,item,quantity);
        DeliveryEntity dev=new DeliveryEntity(item,quantity_d,address);
        deliveryRepo.save(dev);                
        inventoryRepo.save(inv);

        return "Your item will be delivered";
    }

}
