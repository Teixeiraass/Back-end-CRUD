package com.project.data.vo.v1;

import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class ManagementVO extends RepresentationModel<ManagementVO> implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    private String name;

    private double salary;

    private Date dataEntrada;

    private Date dataSaida;

    private String office;

    private String image;

    private String observacoes;

    public ManagementVO(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
        if (!(o instanceof ManagementVO that)) return false;
        if (!super.equals(o)) return false;
        return id == that.id && Double.compare(salary, that.salary) == 0 && Objects.equals(name, that.name) && Objects.equals(dataEntrada, that.dataEntrada) && Objects.equals(dataSaida, that.dataSaida) && Objects.equals(office, that.office) && Objects.equals(image, that.image) && Objects.equals(observacoes, that.observacoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, salary, dataEntrada, dataSaida, office, image, observacoes);
    }
}
