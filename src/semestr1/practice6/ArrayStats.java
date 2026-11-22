package semestr1.practice6;

public class ArrayStats {
    private int[] numbers;
    public void setNumbers(int[] nums){
        numbers = nums;
    }
    public int countEvens() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;

            }
        }
        return count;
    }

    int countOdds() {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int calculateSum(){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum = sum + numbers[i];
        }
        return sum;
    }

}

