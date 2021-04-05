/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Mouse.model;

/**
 *
 * @author Asus
 */
public class Mouse {
    private String mark;
    private String color;
    private int cost;
    private String wireless;
    private String ergonomic;
    public String getWireless;

    public Mouse(String mark, String color, int cost, String wireless, String ergonomic) {
        this.mark = mark;
        this.color = color;
        this.cost = cost;
        this.wireless = wireless;
        this.ergonomic = ergonomic;
        
        
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
    
     /**
     * @return the year
     */
    public String getYear() {
        return wireless;
    }

    /**
     * @param wireless the year to set
     */
    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    /**
     * @return the route
     */
    public String getErgonomic() {
        return ergonomic;
    }

    /**
     * @param ergonomic the route to set
     */
    public void setErgonomic(String ergonomic) {
        this.ergonomic = ergonomic;
    }

    
}
