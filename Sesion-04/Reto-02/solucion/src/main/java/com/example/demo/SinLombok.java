package com.example.demo;

import java.util.Objects;

// Esta clase y la clase ComLombok son equivalentes
public class SinLombok {
    int campo1;
    int campo2;
    String campo3;
    int campo4;

    public int getCampo1() {
        return campo1;
    }

    public int getCampo2() {
        return campo2;
    }

    public String getCampo3() {
        return campo3;
    }

    public int getCampo4() {
        return campo4;
    }

    public void setCampo1(int campo1) {
        this.campo1 = campo1;
    }

    public void setCampo2(int campo2) {
        this.campo2 = campo2;
    }

    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    }

    public void setCampo4(int campo4) {
        this.campo4 = campo4;
    }

    public SinLombok(int campo1, int campo2, String campo3, int campo4) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
    }

    @Override
    public String toString() {
        return "SinLombok{" +
                "campo1=" + campo1 +
                ", campo2=" + campo2 +
                ", campo3='" + campo3 + '\'' +
                ", campo4=" + campo4 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinLombok sinLombok = (SinLombok) o;
        return campo1 == sinLombok.campo1 &&
                campo2 == sinLombok.campo2 &&
                campo4 == sinLombok.campo4 &&
                Objects.equals(campo3, sinLombok.campo3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(campo1, campo2, campo3, campo4);
    }
}
