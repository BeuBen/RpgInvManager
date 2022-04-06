package com.beuben.rpginvmanager.controllers;

import com.beuben.rpginvmanager.entities.Character;
import com.beuben.rpginvmanager.entities.Inventory;
import com.beuben.rpginvmanager.utils.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/character")
public class CharacterController {

  @GetMapping()
  public String getCharacter(@RequestParam final Integer id, final ModelMap model) {
    var inventory = new Inventory(Constants.INITIAL_INVENTORY_SIZE);
    model.addAttribute("character", new Character(id, "Legolas", inventory));
    return "character";
  }
}
