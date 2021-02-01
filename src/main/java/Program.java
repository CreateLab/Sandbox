public class Program {
    public static void main(String[] args) {
        Test t = new Test();
        t.A(() -> {
            int a = 0;
            System.out.println(a);
        });
        t.C(() -> {
            int a = 0;
            System.out.println(a);
        });
        t.A(() -> {
            int a = 0;
            System.out.println(a);
        });
    }
}
