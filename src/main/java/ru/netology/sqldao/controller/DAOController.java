package ru.netology.sqldao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sqldao.repository.DAORepository;

import java.util.List;

@RestController
public class DAOController {
    private DAORepository daoRepository;

    public DAOController(DAORepository daoRepository) {
        this.daoRepository = daoRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<String> getProductName(@RequestParam String name) {
        return daoRepository.getProductName(name);
    }
}
