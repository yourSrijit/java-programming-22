                    //Thread Sleep() Method

package Multi_Thread;
    class A5 extends Thread{
        public void run(){
            String n =Thread.currentThread().getName();
            try{
                for(int i=0;i<100;i++)
                {
                    System.out.println(n);
                    Thread.sleep(2000);
                }
            }
            catch (Exception c){
                c.getMessage();
            }
        }
    }
public class s_8_Sleep_Method {
    public static void main(String[] args) {
        A5 t1 =new A5();
        A5 t2 =new A5();
        A5 t3 =new A5();

        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}
