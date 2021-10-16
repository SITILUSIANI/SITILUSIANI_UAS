package com.example.data;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {
    private @Id @GeneratedValue Long id;
    private Long nip;
    private String name;
    private String address;
    private String position;
    private String tax_deduction;
    private Long salary;

    Data() {
    }

    Data(Long nip, String name, String address, String position, String tax_deduction, Long salary) {
        this.nip = nip;
        this.name = name;
        this.address = address;
        this.position = position;
        this.tax_deduction = tax_deduction;
        this.salary = salary;
    }

    public Long getId() {
        return this.id;
    }

    public Long getNip() {
        return this.nip;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPosition() {
        return this.position;
    }

    public String getTax_deduction() {
        return this.tax_deduction;
    }

    public Long getSalary() {
        return this.salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNip(Long nip) {
        this.nip = nip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTax_deduction(String tax_deduction) {
        this.tax_deduction = tax_deduction;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Data))
            return false;
        Data data = (Data) o;
        return Objects.equals(this.id, data.id) && Objects.equals(this.nip, data.nip)
                && Objects.equals(this.name, data.name) && Objects.equals(this.address, data.address)
                && Objects.equals(this.position, data.position) && Objects.equals(this.tax_deduction, data.tax_deduction)
                && Objects.equals(this.salary, data.salary);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.nip, this.name, this.address, this.position, this.tax_deduction, this.salary);
    }

    @Override
    public String toString() {
        return "Data pegawai{" + "id=" + this.id + ", NIP='" + this.nip + '\'' + ", name='" + this.name + '\''
                + ", address='" + this.address + '\'' + ", position='" + this.position + '\'' + ", tax_deduction='"
                + this.tax_deduction + '\'' + ", salary='" + this.salary + '\'' +  '}';
    }

}
