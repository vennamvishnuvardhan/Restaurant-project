class MyThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Thread is running"+i);
        }
    }
    public static void main(String[] args) {
        MyThread my=new MyThread();
        my.start();
    }
}
