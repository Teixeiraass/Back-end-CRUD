package com.project.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "employees")
public class ManagementModel implements Serializable {

    private static final long  serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 3000)
    private String name;

    @Column(nullable = false)
    private double salary;

    @Column()
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataEntrada;

    @Column()
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dataSaida;

    @Column(nullable = false, length = 3000)
    private String office;

    @Column(length = 1000000000)
    private String image;

    @Column()
    private String observacoes;

    public ManagementModel(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ManagementModel that)) return false;
        return Double.compare(salary, that.salary) == 0 && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(dataEntrada, that.dataEntrada) && Objects.equals(dataSaida, that.dataSaida) && Objects.equals(office, that.office) && Objects.equals(image, that.image) && Objects.equals(observacoes, that.observacoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, dataEntrada, dataSaida, office, image, observacoes);
    }
}
