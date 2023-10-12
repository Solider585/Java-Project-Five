package Threads;

public interface Sum {
    /**
     *@param n the upper limit
     *@param k the number of threads
     *@return the sum 1 + 2 + ... + n computed with k threads
     */
    int sum(int n, int k);
}
