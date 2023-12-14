package com.BlackCoffer.VisualizationApplication.repo;

import com.BlackCoffer.VisualizationApplication.model.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDataRepo extends JpaRepository<DataEntity,Long> {
    List<DataEntity> findAllByEndYear(int endYear);

    List<DataEntity> findAllByTopics(String topics);

    List<DataEntity> findAllBySector(String sector);

    List<DataEntity> findAllByRegion(String region);

    List<DataEntity> findAllByPestle(String pest);

    List<DataEntity> findAllBySource(String source);

    List<DataEntity> findAllBySwot(String swot);

    List<DataEntity> findAllByCountry(String country);

    List<DataEntity> findAllByCity(String city);
}
