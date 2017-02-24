package presentations.module_1._1_3;

public class TypeCasting {

    public static void main(String[] args) {

        primitivesSizes();
    }

    private static void primitivesSizes() {

        System.out.format("byte: %d bytes%n", Byte.SIZE);
        System.out.format("short: %d bytes%n", Short.SIZE);
        System.out.format("char: %d bytes%n", Character.SIZE);
        System.out.format("int: %d bytes%n", Integer.SIZE);
        System.out.format("long: %d bytes%n", Long.SIZE);
        System.out.format("float: %d bytes%n", Float.SIZE);
        System.out.format("double: %d bytes%n", Double.SIZE);

        float f = 10.4f;
        double d = f; //10
    }
}
