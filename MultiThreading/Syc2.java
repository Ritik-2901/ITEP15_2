class Task extends Thread {
    synchronized public void m1(){
        for(int i=1;i<=5;i++){
            System.out.println("this is first case "+i);
        }
    }
      synchronized public void m2(){
        for(int i=1;i<=5;i++){
            System.out.println("this is Second case "+i);
        }
    }
    public void run()
    {
        m1();
        m2();
    }
}
class Test{
    public static void main(String[] args) {
        Task t=new Task();
        Thread t1 =new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
        
    }
    
}
