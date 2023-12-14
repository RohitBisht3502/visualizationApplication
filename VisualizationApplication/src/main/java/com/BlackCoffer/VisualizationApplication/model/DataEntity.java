package com.BlackCoffer.VisualizationApplication.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class DataEntity {
    @Id
    private Long id;

    private int endYear;
    private Double cityLng;
    private Double cityLat;
    private String intensity;
    private String sector;
    private String topic;
    private String insight;
    private String swot;
    private String url;
    private String region;
    private String startYear;
    private String impact;
    private String added;
    private String published;
    private String city;
    private String country;
    private String relevance;
    private String pestle;
    private String source;
    private String title;
    private String likelihood;
    private String topics;
    private int year;


}
