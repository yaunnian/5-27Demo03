import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap();
        map.put("1","愿念");
        map.put("2","yiyi");
        map.put("3","erer");
        map.put("4","sansan");
        System.out.println(map.get(2));
    }
}
