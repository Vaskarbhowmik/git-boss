package reviewclass;

public class arreystring {
    public static void main(String[] args) {
        String[] baking = {"spatula", "weighing scale", "measuring cups", "mixer", "weighing scale", "muffin tins",
                "piping bags", "spatula", "mixer", "butter", "buttercream", "cake batter"};

        for (int i = 0; i < baking.length; i++) {
            for (int j = i + 1; j < baking.length; j++) {
                if (baking[i] .equals ((baking)[j])){
                    System.out.println(baking[j]);
                }
            }
        }
    }
}