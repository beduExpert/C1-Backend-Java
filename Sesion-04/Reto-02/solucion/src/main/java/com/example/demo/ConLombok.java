package com.example.demo;

import lombok.Data;

// Esta clase y la clase SinLombok son equivalentes
// Data es un alias para las anotaciones:
// @Getter y @Setter en todos los campos y
// @RequiredArgsConstructor, @ToString, @EqualsAndHashCode
@Data
public class ConLombok {
    int campo1;
    int campo2;
    String campo3;
    int campo4;
}
