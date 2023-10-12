package Threads;

public class Summer extends Thread {
    private int n,k, sum = 0;

    public Summer(int n, int k){
        this.n = n;
        this.k = k;
        this.sum = sum;
    }

    public void run(){
        System.out.println("Thread running.");
    }

    public synchronized int add(int  n, int k){
        for(int i = 0; i < n; i++){
            this.sum += i;
        }

        return this.sum;
    }

    public int getSum() {
        return this.sum;
    }

    public static void main(String [] args){

        int k = 10;
        int n = 500;
        Summer  sumAll = new Summer(n,k);
        int sum = 0;
//        System.out.println(sum);
        System.out.println("Actual Sum : "+((n+1)*n/2));
        Summer [] thread = new Summer[k];
        for(int i = 0; i < k; i++){
            thread[i] = new Summer((i*n)/k+1, ((i+1)*n)/k);
            thread[i].start();
//            sum += thread[i].add(n,k);
        }

    }

}
