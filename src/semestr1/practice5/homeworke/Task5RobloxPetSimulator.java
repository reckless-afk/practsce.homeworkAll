package semestr1.practice5.homeworke;

public class Task5RobloxPetSimulator {
    public static void main(String[] args) {
        String[] heroes = {"Pudge", "Invoker", "Juggernaut", "Crystal Maiden", "Earthshaker"};
        int[] kills = {8, 12, 10, 2, 4};
        int[] deaths = {6, 3, 2, 9, 5};
        int[] assists = {14, 9, 8, 18, 16};
        int[] netWorth = {14500, 21200, 24800, 9800, 12300};

        double[] kdaRatios = new double[5];
        for (int i = 0; i < heroes.length; i++) {
            kdaRatios[i] = (double) (kills[i] + assists[i]) / Math.max(i, deaths[i]);
        }



        int sum = 0;
        int gold = 0;
        double[] Participation = new double[5];



        for (int i = 0; i < heroes.length; i++) {
            sum = sum + kills[i];
        }
        for (int i = 0; i < netWorth.length; i++){
            gold = gold + netWorth[i];
        }
        for(int i = 0; i < kills.length; i++) {
           Participation[i] = ((kills[i] + assists[i]) / (double) sum * 100);
        }
        double maxKDA = kdaRatios[0];
        int mvpIndex = 0;

        for (int i = 0; i < kdaRatios.length; i++){
            if (kdaRatios[i] > maxKDA) {
                maxKDA = kdaRatios[i];
                mvpIndex = i;
            }
        }
        System.out.println("========================================================================");
        System.out.println("                 DOTA 2: POST-MATCH REPORT");
        System.out.println("========================================================================");
        System.out.println("Hero             | K / D / A  | Net Worth | KDA Ratio | Kill Participation");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < heroes.length; i++) {
            System.out.println(
                    heroes[i] + " | "
                            + kills[i] + " / " + deaths[i] + " / " + assists[i]
                            + " | " + netWorth[i]
                            + " | " + Math.round(kdaRatios[i] * 100.0) / 100.0
                            + " | " + Math.round(Participation[i] * 100.0) / 100.0 + "%"
            );
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Total team kills: " + sum);
        System.out.println("Total team Net Worth: " + gold + " gold");
        System.out.println("MVP: " + heroes[mvpIndex]
                + " (KDA: " + maxKDA + ")");
        System.out.println("========================================================================");
    }
}