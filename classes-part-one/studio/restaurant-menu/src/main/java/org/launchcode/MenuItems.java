package org.launchcode;
import java.time.LocalDate;

public class MenuItems {
    private double price;
    private String description;
    private String category;
    private LocalDate date;

    public MenuItems (double price, String description, String category, LocalDate date){
        this.price = price;
        this.description = description;
        this.category = category;
        this.date = date;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDate() {
        return date;
    }
}
