package com.lab111.labwork6.element;
import com.lab111.labwork6.visitor.NetworkVisitor;

public interface NetworkElement {
    void accept(NetworkVisitor visitor);
}