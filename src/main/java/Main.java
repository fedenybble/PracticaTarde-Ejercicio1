public class Main {

    public static void main(String[] args) {

        Car honda = new Car("HRV", "RED", 1992);
        Car ford = new Car("F100", "BLUE", 2002);
        Car chevrolet = new Car("CRUZE", "BLACK", 2022);

        System.out.println("honda");
        System.out.println("ford");
        System.out.println("chevrolet");



        System.out.println("------------- HONDA -------------");
        System.out.println(honda.getModel()+"\n"+honda.getColor()+"\n"+honda.getYear());
        honda.start();
        honda.running();
        honda.setGearBox(6);
        honda.getGearBox();
        honda.stop();



        System.out.println("------------- FORD -------------");
        System.out.println(ford.getModel()+"\n"+ford.getColor()+"\n"+ford.getYear());
        ford.start();
        ford.running();
        ford.setGearBox(6);
        ford.getGearBox();
        ford.stop();


        System.out.println("------------- CHEVROLET -------------");
        System.out.println(chevrolet.getModel()+"\n"+chevrolet.getColor()+"\n"+chevrolet.getYear());
        chevrolet.start();
        chevrolet.running();
        chevrolet.setGearBox(6);
        chevrolet.getGearBox();
        chevrolet.stop();

    }

}
