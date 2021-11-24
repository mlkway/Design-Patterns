package ProtoTypeDesignPattern;

public class testCloning {

    public static void main(String[] args) {

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep clondesSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);
        System.out.println(clondesSheep);
        System.out.println("Sally HashCode: "+ System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clone HashCode: "+ System.identityHashCode(System.identityHashCode(clondesSheep)));


    }


}
