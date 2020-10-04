package encapsulationdemo;

public class encapdemo {
    public static void main(String[] args) {
        login l1 = new login();
        l1.setusr("richa");
        System.out.println(l1.getusr());
        l1.setpwd(1234);
        System.out.println(l1.getpwd());

    }
}
class login {
    String username;
    int pwd;
    public void setusr(String username)
    {
        this.username = username;
    }
    public String getusr()
    {
        if(username == "richa") {
            return username;
        }
        else
        {
            return "invalid user";
        }
    }
    public void setpwd(int pwd) {
        this.pwd = pwd;
    }
    public int getpwd() {
        if(pwd == 1234)
        {
            return pwd;
        }
        else
        {
            return 100;
        }
    }
}
