package com.amit.java8.lambda.model;

public class MEmployee {
    private Integer empId;
    private String name;
    private Integer salary;
    private Status status;
    private Integer deptId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public MEmployee() {
    }


    public MEmployee(Integer empId, String name, Integer salary, Status status, Integer deptId) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.status = status;
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "MEmployee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", status=" + status +
                ", deptId=" + deptId +
                '}';
    }
}
