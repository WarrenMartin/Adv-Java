import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class AccessingPrivate {
    private  int age=10;
    private String str="Private";

    public int getAge() {
        return age;
    }

    public String getStr() {
        return str;
    }

    public static void main(String[] args) {
        AccessingPrivate ac=new AccessingPrivate();

        Class acp=ac.getClass();

        Field[] fields= acp.getDeclaredFields();
        for(Field f:fields){
            System.out.println(f.getName()+" "+ Modifier.toString(f.getModifiers()));
        }

    }


}
