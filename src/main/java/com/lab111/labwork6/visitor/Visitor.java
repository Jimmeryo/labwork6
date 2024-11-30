package com.lab111.labwork6.visitor;

import com.lab111.labwork6.element.*;

public interface Visitor {
    void visit(Cable cable);
    void visit(Server server);
    void visit(Workstation workstation);
}