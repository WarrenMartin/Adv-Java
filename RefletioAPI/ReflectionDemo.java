import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;

public class ReflectionDemo {

    public static void main(String[] args) {


        Class c = "c-dac".getClass();
        System.out.println(c.getName());  // java.lang.String

        Method[] strMethods =c.getDeclaredMethods();
        for (Method m:strMethods){
            System.out.println("Look at methods: "+m.getName());

            Class<?> parameterType[]  =m.getParameterTypes();
            for (int i = 0; i <parameterType.length ; i++) {
                System.out.println("Parameter" +(i+1)+"Parameter type" + parameterType[i].getName() );
            }

        }


    }
}
