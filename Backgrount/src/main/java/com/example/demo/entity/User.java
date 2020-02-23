package com.example.demo.entity;

public class User {
    private Integer id;

    public Integer getCompany_number() {
        return company_number;
    }

    public void setCompany_number(Integer company_number) {
        this.company_number = company_number;
    }

    private Integer company_number;
    private String company_name;
    private String company_position;
    private Integer employee_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_position() {
        return company_position;
    }

    public void setCompany_position(String company_position) {
        this.company_position = company_position;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", company_number=" + company_number +
                ", company_name='" + company_name + '\'' +
                ", company_position='" + company_position + '\'' +
                ", employee_id=" + employee_id +
                '}';
    }
}

