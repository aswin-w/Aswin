public class tom{
    public String demo(String a,String b){
        String c=a+b;
        return c;
    }
    public static void main(String[] args) {
        tom obj=new tom();
        String d=obj.demo("wel","com");
        System.out.println(d);
    }
}