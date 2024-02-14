public class variableargument98 {
    static void show(int ...A){
        for(int x: A)
        {
        System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show();
        show(12,20);
    }
}
