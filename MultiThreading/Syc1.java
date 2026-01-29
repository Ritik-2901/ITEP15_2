
class Task extends Thread {
    synchronized public void m1(){
        for(int i=1;i<=5;i++){
            System.out.println("this is case "+i);
        }
    }
    public void run()
    {
        m1();
    }
}
class Test{
    public static void main(String[] args) {
        Task t=new Task();
        Thread t1 =new Thread(t);
        t1.start();
        
    }
}