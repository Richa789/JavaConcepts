package objectcasting;

import java.sql.SQLOutput;

public class castingdemo {
    public static void main(String[] args) {
        police p1 = new people();
        p1.lockdown();
        people b1 = (people) p1;
        b1.lockdown();
        b1.shopping();
    }
}
    class police
    {
        public void lockdown()
        {
            System.out.println("stay at home");
        }
    }
    class people extends police{
        public void lockdown()
        {
            System.out.println("want to go out");
        }
        public void shopping()
        {
            System.out.println("go for shopping");
        }
    }

