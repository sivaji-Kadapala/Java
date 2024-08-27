package Generics;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

class Gen<T>{
    T ob;
    private int empId;
    Gen(T o){
        ob=o;
    }
    public T getOb(){
        return ob;
    }
}

public class GenericDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Gen<Integer> iob=new Gen<>(100);
        int x=iob.getOb();
        System.out.println(x);
        Gen<String> sob=new Gen<>("Hello");
        String str=sob.getOb();
        System.out.println(str);
        Class<Object> name= (Class<Object>) Class.forName("Generics.Gen");
        System.out.println(name);
        Object instance=name.getDeclaredConstructor().newInstance();
        Gen gen=(Gen) instance;
        Field field=name.getDeclaredField("empId");
        field.setAccessible(true);
        field.set(gen,10);
        System.out.println(field.get(gen));
    }
}
