package com.cadastroapp.controller;

import com.cadastroapp.model.Contato;
import com.cadastroapp.model.Pessoa;
import com.cadastroapp.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatoController {

    @Autowired
    private ContatoRepository cr;

    @RequestMapping(value = "/cadastrarContato", method = RequestMethod.GET)
    public String form() {
        return "pessoa/formContato";
    }

    @RequestMapping(value ="/cadastrarContato", method = RequestMethod.POST)
    public String form(Contato contato) {

        cr.save(contato);

        return "redirect:/cadastrarContato";
    }

    @RequestMapping("/contatos")
    public ModelAndView listaContatos() {
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<Contato> contatos = cr.findAll();
        modelAndView.addObject("contatos", contatos);

        return modelAndView;
    }

}
