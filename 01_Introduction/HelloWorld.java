
class UserAuth {
    public boolean authenticate(String user, String pass) {
        System.out.println("Loading........"); 
        return user.equals("admin") && pass.equals("1234");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World in Java"); 
        System.out.println(fun2(5,7));
    }
    static int fun2(int x ,int y)
    {
        return x+y;
    }
}
