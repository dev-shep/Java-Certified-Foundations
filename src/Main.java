public class Main {
    public static void main(String[] args) {

        MethodExample method = new MethodExample();

        System.out.println("method n+5: "+ method.addFive(7));

        System.out.println();

        AccesorExample accesorExample = new AccesorExample();

        System.out.println("getRetriever : "+ accesorExample.getRetrieveThis() );


        System.out.println();

        MutatorExample mutatorExample = new MutatorExample();

        System.out.println("getRetriever : "+ mutatorExample.getMutateThis() );

        System.out.println();

        mutatorExample.setMutateThis(9);

        System.out.println("cambio de valor: "+mutatorExample.getMutateThis() );

        System.out.println();

        OverloadingExample overloadingExample = new OverloadingExample();

        overloadingExample.printThis(5);

        overloadingExample.printThis(5,4);
        System.out.println();

        ElectricVehicle electricVehicle = new ElectricVehicle();
        electricVehicle.start("Inicia");
        electricVehicle.stop();
        electricVehicle.turnLeft();
        electricVehicle.turnRigth();


        StaticExample staticExample = new StaticExample();

        System.out.println("method n+5: "+ staticExample.addFive(7));
        System.out.println("method n+5: "+ StaticExample.addSix(7));
        System.out.println("method n+5: "+ staticExample.addSix(7));

        System.out.println();

    }
}