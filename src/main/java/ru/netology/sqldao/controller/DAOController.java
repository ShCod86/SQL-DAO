package ru.netology.sqldao.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sqldao.entity.Person;
import ru.netology.sqldao.repository.DAORepository;

import java.util.List;

@RestController
@AllArgsConstructor
public class DAOController {
    private DAORepository daoRepository;


    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return daoRepository.getPersonsByCity(city);
    }
}
