import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map m=new Hashtable();
        System.out.println();
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"张三");
        map.put(2,"李四");
        for (int i=1;i<=map.size();i++){
            System.out.println(map.get(i));
        }
        int arr[]={1,51,8,-5,3,4,6,-9};
        Integer abb[]={1,51,8,5,3,4,6,9};
        String str[]={"1","2","3","4","5"};
        List<String> list=Arrays.asList(str);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println(" ");



        Test1 t=new Test1();
              t.max(arr);
        System.out.println("");
              t.arr(arr);
        System.out.println("");
              t.sjx(5);
        System.out.println("");
        t.test("z",16);

    }

    private void sjx(int index) {
        int n=index;
        for (int i=1;i<n;i++){
            for (int x=1;x <= n-i;x++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    private void arr(int[] arr) {
        int zhong=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                if (arr[i]<arr[j]){
                    zhong=arr[i];
                    arr[i]=arr[j];
                    arr[j]=zhong;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    private void max(int[] arr) {
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max:"+max);
    }
    private void test(String key,Integer size){
        int hash=key.hashCode();
        int index = (0x7FFFFFFF & 0x7FFFFFFF);
        System.out.println("index:"+index);
    }

}
