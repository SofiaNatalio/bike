package org.academiadecodigo.hackathon.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class BikerController {

    private HashMap<Integer,Biker> bikerMap = new HashMap<>();

    @RequestMapping
    public void addBiker(Model model){

    }






}
