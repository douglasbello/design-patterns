package model;

public class Server extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}