package practice.ExceptionHandling;

public class BoxingUnboxing {
    public static void main(String[] args) {
        byte b = 1;
        Byte byteObj = new Byte(b);
        int i = 123;
        Integer intObj = new Integer(i);
        float f = 4.5f;
        Float floatObj = new Float(f);
        double d = 234.564;
        Double doubleObj = new Double(d);
        char ch = 'a';
        Character charObj = new Character(ch);
        System.out.println("Wrapper values are as follows which are presented as objects :-");
        System.out.println("Byte value is : " + byteObj);
        System.out.println("Integer value is : " + intObj);
        System.out.println("Float value is : "+ floatObj);
        System.out.println("Double value is : " + doubleObj);
        System.out.println("Character value is : " + charObj);
        byte bv = byteObj;
        int iv = intObj;
        float fv = floatObj;
        double dv = doubleObj;
        char cv = charObj;
        System.out.println("Unwrapped values are as follows which are presented as primitive datatypes :-");
        System.out.println("Byte value of bv is : " + bv);
        System.out.println("Integer value of iv is : "+ iv);
        System.out.println("Float value of fv is : " + iv);
        System.out.println("Double value of dv is : "+ dv);
        System.out.println("Character value of cv is : " + cv);

    }
}
