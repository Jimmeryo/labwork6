package com.lab111.labwork6.element;

import com.lab111.labwork6.visitor.NetworkVisitor;

public class Workstation implements NetworkElement {
   private String model;
   private double price;
   private int quantity;

   public Workstation(String model, double price, int quantity) {
       this.model = model;
       this.price = price;
       this.quantity = quantity;
   }

   @Override
   public void accept(NetworkVisitor visitor) {
       visitor.visit(this);
   }

   public String getModel() { return model; }
   public double getPrice() { return price; }
   public int getQuantity() { return quantity; }
}