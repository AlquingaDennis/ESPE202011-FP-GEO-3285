/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.ConcessionarySystem.model;

/**
 *
 * @author Asus
 */
public class Motorcycle {
    private String mark;
    private String color;
    private int year;
    private int route;
    private int cost;

    public Motorcycle(String mark, String color, int year, int route, int cost) {
        this.mark = mark;
        this.color = color;
        this.year = year;
        this.route = route;
        this.cost = cost;
    }
    
    

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the route
     */
    public int getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(int route) {
        this.route = route;
    }

    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
    
    

    
}
