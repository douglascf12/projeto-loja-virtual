package com.douglascf.lojavirtual.repositories;

import com.douglascf.lojavirtual.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
