public class BoundedGenericsExample {
    class Machine{

    }
    class Mobile extends Machine{

    }
    class Computer extends Machine{

    }
    class Hardwear<E extends Machine>{

    }

    public static void main(String[] args) {
        Hardwear<Machine> machineHardwear = new Hardwear<>();
        Hardwear<Mobile> mobileHardwear = new Hardwear<>();
        Hardwear<Computer> computerHardwear = new  Hardwear<>();
    }
}
