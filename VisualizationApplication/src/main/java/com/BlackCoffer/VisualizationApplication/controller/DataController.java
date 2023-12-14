package com.BlackCoffer.VisualizationApplication.controller;

import com.BlackCoffer.VisualizationApplication.model.DataEntity;
import com.BlackCoffer.VisualizationApplication.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    DataService dataService;

    // Endpoint to get data filtered by End Year
    @GetMapping("/filterByEndYear/{endYear}")
    public ResponseEntity<List<DataEntity>> filterByEndYear(@PathVariable int endYear) {
        List<DataEntity> filteredData = dataService.filterByEndYear(endYear);
        return ResponseEntity.ok(filteredData);
    }


    @GetMapping("/filterByTopics/{topics}")
    public ResponseEntity<List<DataEntity>> filterByTopics(@PathVariable String topics) {
        List<DataEntity> filteredData = dataService.filterByTopics(topics);
        return ResponseEntity.ok(filteredData);
    }

    // Endpoint to get data filtered by Sector
    @GetMapping("/filterBySector/{sector}")
    public ResponseEntity<List<DataEntity>> filterBySector(@PathVariable String sector) {
        List<DataEntity> filteredData = dataService.filterBySector(sector);
        return ResponseEntity.ok(filteredData);
    }

    // Endpoint to get data filtered by Region
    @GetMapping("/filterByRegion/{region}")
    public ResponseEntity<List<DataEntity>> filterByRegion(@PathVariable String region) {
        List<DataEntity> filteredData = dataService.filterByRegion(region);
        return ResponseEntity.ok(filteredData);
    }

    // Endpoint to get data filtered by PEST
    @GetMapping("/filterByPEST/{pest}")
    public ResponseEntity<List<DataEntity>> filterByPEST(@PathVariable String pestle) {
        List<DataEntity> filteredData = dataService.filterByPEST(pestle);
        return ResponseEntity.ok(filteredData);
    }

    // Endpoint to get data filtered by Source
    @GetMapping("/filterBySource/{source}")
    public ResponseEntity<List<DataEntity>> filterBySource(@PathVariable String source) {
        List<DataEntity> filteredData = dataService.filterBySource(source);
        return ResponseEntity.ok(filteredData);
    }

    // Endpoint to get data filtered by SWOT
    @GetMapping("/filterBySWOT/{swot}")
    public ResponseEntity<List<DataEntity>> filterBySWOT(@PathVariable String swot) {
        List<DataEntity> filteredData = dataService.filterBySWOT(swot);
        return ResponseEntity.ok(filteredData);
    }

    // Endpoint to get data filtered by Country
    @GetMapping("/filterByCountry/{country}")
    public ResponseEntity<List<DataEntity>> filterByCountry(@PathVariable String country) {
        List<DataEntity> filteredData = dataService.filterByCountry(country);
        return ResponseEntity.ok(filteredData);
    }

    // Endpoint to get data filtered by City
    @GetMapping("/filterByCity/{city}")
    public ResponseEntity<List<DataEntity>> filterByCity(@PathVariable String city) {
        List<DataEntity> filteredData = dataService.filterByCity(city);
        return ResponseEntity.ok(filteredData);
    }
}
