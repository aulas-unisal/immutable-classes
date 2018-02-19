public class Main {
    public static void main(String[] args) {
        ImmutableLogin immutableLogin = new ImmutableLogin("jether.rodrigues", "1234");
        System.out.println(immutableLogin.toString());

        MutableLogin mutableLogin = new MutableLogin();
        mutableLogin.setUsername("jether.rodrigues");
        System.out.println(mutableLogin.toString());
        mutableLogin.setPassword("123456");
        System.out.println(mutableLogin.toString());
    }
}