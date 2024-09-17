package com.douglasbello.decorators;

public interface DataSource {
    void writeData(String data);
    String readData();
}