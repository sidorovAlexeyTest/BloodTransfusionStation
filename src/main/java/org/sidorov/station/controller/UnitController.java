package org.sidorov.station.controller;

import org.sidorov.station.entity.Unit;
import org.sidorov.station.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UnitController {

    @Autowired
    private UnitService service;

    @GetMapping("/unit")
    public List<Unit> getAllUnits(){
        return service.getAllUnits();
    }

    @GetMapping("/unit/{id}")
    public Unit getUnit(@PathVariable int id){
        return service.getUnit(id);
    }

    @PostMapping(path = "/unit", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addUnit(@RequestBody Unit unit){
        service.addUnit(unit);
    }
}
