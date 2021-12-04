package com.cadastroapp.controller;

import com.cadastroapp.model.Pessoa;
import com.cadastroapp.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pr;

    @RequestMapping(value = "/cadastrarPessoa", method = RequestMethod.GET)
    public String form() {
        return "pessoa/formPessoa";
    }

    @RequestMapping(value ="/cadastrarPessoa", method = RequestMethod.POST)
    public String form(Pessoa pessoa) {

        pr.save(pessoa);

        return "redirect:/cadastrarPessoa";
    }

    @RequestMapping("/pessoas")
    public ModelAndView listaPessoa() {
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<Pessoa> pessoas = pr.findAll();
        modelAndView.addObject("pessoas", pessoas);

        return modelAndView;
    }
}
