package com.example.demo.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// ignoramos todos los demas campos, solo tomara en cuenta `count`
@JsonIgnoreProperties(ignoreUnknown = true)
public class Informacion {
    @Getter @Setter
    Long count;
}
