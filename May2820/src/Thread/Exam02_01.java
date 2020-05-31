package Thread;
class MovieThread2 extends Thread{

   @Override
   public void run() {
      for(int i=0; i<2; i++) {
         System.out.println("동영상을 재생합니다.");

         try {
            Thread.sleep(1000);
         }catch(InterruptedException e) {}
      }
   }
}
class MusicRunnable2 extends Thread{}

public class Exam02_01 {

   public static void main(String[] args) {
      Thread thread1 = new MovieThread2();
      thread1.start();
      Thread thread2 = new Thread(new MusicRunnable() {

         @Override
         public void run() {
            for(int i=0; i<2; i++) {
               System.out.println("음악을 재생합니다.");
               try {
                  Thread.sleep(1000);
               }catch(InterruptedException e) {}
            }
         }
      });
      thread2.start();
      /*
       * 다음과 같은 출력결과물이 나올수 있게 2개의 스레드를 만들어 봅시다. 각스레드는 1초 간격으로 작동되게 한다.
       * 동영상을 재생합니다,.
       * 음악을 재생합니다.
       * 동영상을 재생합니다.
       * 음악을 재생합니다.
       */
   }

}