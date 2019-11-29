package com.example.demo.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

// ignoramos todos los demas campos, solo tomara en cuenta `count`
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@RequiredArgsConstructor
public class Informacion {
    @Getter @Setter
    Long count;
}
