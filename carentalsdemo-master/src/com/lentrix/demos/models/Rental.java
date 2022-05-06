/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lentrix.demos.models;

import java.sql.Date;
/**
 *
 * @author e8tum
 */
public class Rental {
    private Customer customer;
    private Car car;
    private Date dateTaken;
    private Date dateReturned;
    private float deposit;

    public Rental(Customer customer, Car car, Date dateTaken, Date dateReturned, float deposit) {
        this.customer = customer;
        this.car = car;
        this.dateTaken = dateTaken;
        this.dateReturned = dateReturned;
        this.deposit = deposit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public Date getDateReturned() {
        return dateReturned;
    }

    public void setDateReturned(Date dateReturned) {
        this.dateReturned = dateReturned;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return customer.getFname() + " "
                + customer.getLname() + " - " 
                + car.getMake() + " " 
                + car.getModel();
    }
    
    
    
}
