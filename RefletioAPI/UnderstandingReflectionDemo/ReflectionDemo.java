import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;

public class ReflectionDemo {

    public static void main(String[] args) {


       SimpleClass sc=new SimpleClass();
        System.out.println(sc.getClass());  // java.lang.String

        Method[] strMethods =sc.getClass().getDeclaredMethods();
        for (Method m:strMethods){
            System.out.println("Look at methods: "+m.getName());

            Class<?> parameterType[]  =m.getParameterTypes();
            for (int i = 0; i <parameterType.length ; i++) {
                System.out.println("Parameter" +(i+1)+"Parameter type" + parameterType[i].getName() );
            }

        }


    }
}
