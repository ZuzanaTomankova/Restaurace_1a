package com.engeto.ja.Restaurant;

import java.math.BigDecimal;

public class Dish {
    private int identificationOfDish;
    private String title;
    private BigDecimal price;
    private int preparationTime;
    private String image;

    public Dish(int identificationOfDish,String title, BigDecimal price, int preparationTime, String image) throws Exception {
        this.identificationOfDish=identificationOfDish;
        this.title = title;
        this.price = price;
        setPreparationTime(preparationTime);
        this.image = image;
    }
    public Dish(int identificationOfDish, String title, BigDecimal price, int preparationTime) throws Exception {
        this.identificationOfDish=identificationOfDish;
        this.title = title;
        this.price = price;
        setPreparationTime(preparationTime);
        this.image = "blanc";
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(int preparationTime)
         throws Exception
        {
            if (preparationTime<=0) {
                throw new Exception("Preparation time must be greater than zero.Given time: "
                        + preparationTime);

            }
        this.preparationTime = preparationTime;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIdentificationOfDish() {
        return identificationOfDish;
    }

    public void setIdentificationOfDish(int identificationOfDish) {
        this.identificationOfDish = identificationOfDish;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "identificationOfDish=" + identificationOfDish +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", preparationTime=" + preparationTime +
                ", image='" + image + '\n';
    }
}
