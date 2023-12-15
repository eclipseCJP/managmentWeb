
package com.pi.manag.controller;

import com.pi.manag.entitie.Apartamento;
import com.pi.manag.entitie.Morador;
import com.pi.manag.entitie.Veiculo;
import com.pi.manag.service.MoradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoradorController {
    @Autowired
    MoradorService service;
    
    @GetMapping("/cadMorador")
    public String pageCadastroMorador(Model model){
        //Morador morador = new Morador();
        model.addAttribute("morador", new Morador());
        model.addAttribute("apartamento", new Apartamento());
        model.addAttribute("veiculo", new Veiculo());
        return "cadMorador";
    }
}
