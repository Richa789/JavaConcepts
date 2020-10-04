package practice.DecisionMaking;

public class ProfitableGamble {
    public static void main(String[] args) {
        boolean profit = true;
        float values = gamble(2.3f, 0.7f, 3.2f);
    }

    public static float gamble(float prof, float prize, float pay) {
        boolean profit = true;
        if ((prof * prize) > pay) {
            System.out.println("It is true");
        }
        else {
            System.out.println("It is not true");
        }
        return prof;
    }
}

            


