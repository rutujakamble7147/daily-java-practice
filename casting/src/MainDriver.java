public class MainDriver {
    public static void main(String[] args) {
        laptop laptop = new laptop();
        laptop.powerOn();
        laptop.displayDocument();
        laptop.powerOff();

        printer printer = new printer();
        printer.powerOn();
        printer.printDocuments();
        printer.powerOff();

        machine machine = new printer();
        machine.powerOff();
        machine.powerOn();
    }
}
