package com.test;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public final class Employee {
    //name,id,joiningDate,qualification
    private final String name;
    private final Long id;
    private final Date joiningDate;
    private final List<String> qualifications;

    public Employee(Long id,String name,Date joiningDate,List<String> qualifications){
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
        this.qualifications = qualifications;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public List<String> getQualifications() {
        return qualifications;
    }

//    public int hashCode(){
//
//    }
    // object of this class as a key to hashmap;s


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(id, employee.id) &&
                Objects.equals(joiningDate, employee.joiningDate) &&
                Objects.equals(qualifications, employee.qualifications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, joiningDate, qualifications);
    }
}
