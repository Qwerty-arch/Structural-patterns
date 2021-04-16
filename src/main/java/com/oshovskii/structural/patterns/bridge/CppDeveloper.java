package com.oshovskii.structural.patterns.bridge;

public class CppDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes c++ code...");
    }
}
