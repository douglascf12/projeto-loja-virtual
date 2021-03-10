package com.douglascf.lojavirtual.controllers;

import com.douglascf.lojavirtual.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProdutoController {
    
    @Autowired
    private ProdutoRepository ProdutoRepository;
    
    
    
}
