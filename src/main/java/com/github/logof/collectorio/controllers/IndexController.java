package com.github.logof.collectorio.controllers;

import com.github.logof.collectorio.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {
    @Autowired
    private CategoryRepository categoryRepository;

    private void getMenu(Model model) {
        model.addAttribute("categories", categoryRepository.getRootCategory()) ;
    }

    @GetMapping("/")
    public String index(Model model) {
        getMenu(model);
        return "index";
    }


    @GetMapping("/category")
    public String category(Model model) {
        getMenu(model);

        return "index";
    }


}
