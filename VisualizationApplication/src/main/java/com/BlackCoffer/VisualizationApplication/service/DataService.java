package com.BlackCoffer.VisualizationApplication.service;

import com.BlackCoffer.VisualizationApplication.model.DataEntity;
import com.BlackCoffer.VisualizationApplication.repo.IDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    @Autowired
    IDataRepo dataRepo;


    public List<DataEntity> filterByEndYear(int endYear) {
        return dataRepo.findAllByEndYear(endYear);
    }

    public List<DataEntity> filterByTopics(String topics) {
        return dataRepo.findAllByTopics(topics);
    }

    public List<DataEntity> filterBySector(String sector) {
        return dataRepo.findAllBySector(sector);
    }

    public List<DataEntity> filterByRegion(String region) {
        return dataRepo.findAllByRegion(region);
    }

    public List<DataEntity> filterByPEST(String pestle) {
        return dataRepo.findAllByPestle(pestle);
    }

    public List<DataEntity> filterBySource(String source) {
        return dataRepo.findAllBySource(source);
    }

    public List<DataEntity> filterBySWOT(String swot) {
        return dataRepo.findAllBySwot(swot);
    }

    public List<DataEntity> filterByCountry(String country) {
        return dataRepo.findAllByCountry(country);
    }

    public List<DataEntity> filterByCity(String city) {
        return dataRepo.findAllByCity(city);
    }
}
