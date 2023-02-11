package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private boolean takeAway;
    private boolean isBill;


    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) this.price=300;
        else this.price=400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.extraCheese) {
            this.price += 80;
            this.extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.extraToppings){
            if(isVeg) this.price+=70;
            else this.price+=120;
            this.extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.takeAway){
            this.price+=20;
            this.takeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBill){
            String c1,c2="",c3="",c4="",c5;
            if(isVeg) {
                c1="Base Price Of The Pizza: 300\n";
                if(this.extraCheese)c2="Extra Cheese Added: 80\n";
                if(this.extraToppings) c3="Extra Toppings Added: 70\n";
                if(this.takeAway) c4="Paperbag Added: 20\n";
            }
            else{
                c1="Base Price Of The Pizza: 400\n";
                if(this.extraCheese)c2="Extra Cheese Added: 80\n";
                if(this.extraToppings) c3="Extra Toppings Added: 120\n";
                if(this.takeAway) c4="Paperbag Added: 20\n";
            }
            c5="Total Price: "+this.price;
            bill=c1+c2+c3+c4+c5;
            isBill=true;
        }
        return this.bill;
    }
}
