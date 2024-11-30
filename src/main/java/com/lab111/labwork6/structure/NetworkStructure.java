package com.lab111.labwork6.structure;

import com.lab111.labwork6.element.NetworkElement;
import com.lab111.labwork6.visitor.NetworkVisitor;
import java.util.ArrayList;
import java.util.List;

public class NetworkStructure {
   private List<NetworkElement> elements = new ArrayList<>();

   public void addElement(NetworkElement element) {
       elements.add(element);
   }

   public void accept(NetworkVisitor visitor) {
       for (NetworkElement element : elements) {
           element.accept(visitor);
       }
   }
}