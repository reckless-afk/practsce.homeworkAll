package semestr1.practice6;

public class Counter {
   public int count;
    public void increment(){
        count = count + 1;
    }
   public void decrement(){
        count = count - 1;
   }
  public void reset(){
        count = 0;
  }
  public void printCount(){
      System.out.println(count);
  }
}
