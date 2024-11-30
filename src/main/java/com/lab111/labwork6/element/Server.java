package com.lab111.labwork6.element;
import com.lab111.labwork6.visitor.NetworkVisitor;

public class Server implements NetworkElement {
   private String model;
   private double price;

   public Server(String model, double price) {
       this.model = model;
       this.price = price;
   }

   @Override
   public void accept(NetworkVisitor visitor) {
       visitor.visit(this);
   }

   public String getModel() { return model; }
   public double getPrice() { return price; }
}