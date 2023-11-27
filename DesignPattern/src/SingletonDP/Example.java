package SingletonDP;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {
    public static void main(String[] args) throws Exception,CloneNotSupportedException{
        //For samosa class
//        Samosa samosa1 = Samosa.getSamosa();
//        System.out.println(samosa1.hashCode());
//        Samosa samosa2 = Samosa.getSamosa();
//        System.out.println(samosa2.hashCode());
//
//        //For jalebi class
//        System.out.println(Jalebi.getJalebi().hashCode());
//        System.out.println(Jalebi.getJalebi().hashCode());

        /*
        * 1 :- Refelection Api to break Singleton Pattern
        * Solution 1:- If object is there ==> throw Exception from inside Constructor
        *          2:- Use enum
        *
        * 2 :1 Deserialization to break Singleton Pattern
        * Solution
        *
        * 3:- Cloning to break Singleton Pattern
        *
        * */

//        Samosa s1 = Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Samosa s2 = constructor.newInstance();
//        System.out.println(s2.hashCode());

        Samosa samosa = Samosa.getSamosa();
        System.out.println(samosa.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(samosa);
//        System.out.println("serialization dane...........");
//
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2 = (Samosa) ois.readObject();
//        System.out.println(s2.hashCode());
       Samosa s2 =   (Samosa) samosa.clone();
        System.out.println(s2.hashCode());
    }
}
