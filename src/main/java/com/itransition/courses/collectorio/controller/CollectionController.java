package com.itransition.courses.collectorio.controller;

import com.itransition.courses.collectorio.entity.Collection;
import com.itransition.courses.collectorio.repository.CollectionRepository;
import com.itransition.courses.collectorio.repository.ItemRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CollectionController {

    @Autowired
    CollectionRepository collectionRepository;

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/add/collection")
    public String addNewCollection(Model model){
        model.addAttribute("collection", new Collection());
        return "add_collection";
    }

    @PostMapping("/add/collection")
    public String processAddingCollection(Collection collection){

        return "add_collection_success";
    }

    @GetMapping("/collection/{name}")
    public String getCollectionByName(@PathVariable String name, Model model){
        Collection collection = collectionRepository.findByName(name).orElseThrow(
                () -> new UsernameNotFoundException("Cannot find the Collection by name: " + name));
        model.addAttribute("collection", collection);

        return "collection_page";
    }
}
