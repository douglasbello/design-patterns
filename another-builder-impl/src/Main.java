public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder()
                .setHDD("256")
                .setRAM("32")
                .setBluetoothEnabled(false)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(comp);
    }
}