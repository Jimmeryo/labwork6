package com.lab111.labwork6.visitor;

import com.lab111.labwork6.element.*;

public class CostCalculator implements NetworkVisitor {
   private double totalCost = 0;

   @Override
   public void visit(Cable cable) {
       totalCost += cable.getLength() * cable.getPricePerMeter();
       System.out.println("Додано вартість кабелю: " + (cable.getLength() * cable.getPricePerMeter()));
   }

   @Override
   public void visit(Server server) {
       totalCost += server.getPrice();
       System.out.println("Додано вартість сервера " + server.getModel() + ": " + server.getPrice());
   }

   @Override
   public void visit(Workstation workstation) {
       totalCost += workstation.getPrice();
       System.out.println("Додано вартість робочої станції " + workstation.getModel() + ": " + workstation.getPrice());
   }

   public double getTotalCost() {
       return totalCost;
   }
}
