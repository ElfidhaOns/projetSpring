package com.example.tp1.controllers;

import com.example.tp1.entity.Bloc;
import com.example.tp1.entity.Chambre;
import com.example.tp1.entity.TypeChambre;
import com.example.tp1.services.interfaces.IchambreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Gestion Chambre")
@RestController
@AllArgsConstructor
@RequestMapping("/Chambre")
public class ChambreController {

    IchambreService ichambreService;
    @Operation(description = "récupérer toutes les chambres de la base de données")
    @GetMapping("/get")
    public List<Chambre> retrieveAllChambres() {
        return ichambreService.retrieveAllChambres();
    }

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return ichambreService.addChambre(c);
    }

    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        return ichambreService.updateChambre(c);
    }

    @GetMapping("/retrieveChambre/{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre) {
        return ichambreService.retrieveChambre(idChambre);
    }

    @GetMapping("/getChambreByAddresseUniversite/{ads}")
    public List<Chambre> getChambreByAddresseUniversite(@PathVariable String ads) {
        return ichambreService.getChambreByAddresseUniversite(ads);
    }

    @GetMapping("/getChambreByCINEtudaintEtNomBloc/{CIN}/{nom}")
    public Chambre getChambreByCINEtudaintEtNomBloc(@PathVariable Long CIN, @PathVariable String nom) {
        return ichambreService.getChambreByCINEtudaintEtNomBloc(CIN, nom);
    }
@PutMapping("affecterChambresABloc/{idBloc}")
    public Bloc affecterChambresABloc(@RequestBody List<Long> numChambre,@PathVariable long idBloc) {
        return ichambreService.affecterChambresABloc(numChambre, idBloc);
    }

    @PutMapping("getChambresParBlocEtType/{idBloc}/{typeC}")
    public List<Chambre> getChambresParBlocEtType(@PathVariable long idBloc,@PathVariable TypeChambre typeC) {
        return ichambreService.getChambresParBlocEtType(idBloc, typeC);
    }
}
