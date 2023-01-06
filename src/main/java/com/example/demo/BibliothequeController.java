package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class BibliothequeController {

    @Autowired
    BibliothequeDatabaseService bibliothequeDatabaseService;

    @PostMapping("categorie")
    public void createCategorie(@RequestBody Categorie categorie) {
        bibliothequeDatabaseService.addCategorie(categorie);
    }
}
