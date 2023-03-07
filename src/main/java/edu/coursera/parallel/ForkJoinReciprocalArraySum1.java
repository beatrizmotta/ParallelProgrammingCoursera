//package edu.coursera.parallel;
//import java.util.concurrent.ForkJoinPool;
//import java.util.concurrent.RecursiveAction;
//
//public class ForkJoinReciprocalArraySum1 {
//
//    public static double parArraySum(double[] x) {
//        SumArray t = new SumArray(x, 0, x.length);
//        ForkJoinPool.commonPool().invoke(t);
//        double sum = t.ans;
//
//        return sum;
//    }
//
//    private static class SumArray extends RecursiveAction {
//        static int SEQUENTIAL_THRESHOLD = 1000;
//        int lo, hi;
//        double[] arr;
//        double ans = 0;
//
//        SumArray(double[] a, int l, int h) {
//            lo = l;
//            hi = h;
//            arr = a;
//        }
//
//        protected void compute() {
//            if (hi - lo <= SEQUENTIAL_THRESHOLD) {
//                for (int i = lo; i < hi; ++i) {
//                    ans += 1 / arr[i];
//                }
//            } else {
//                SumArray left = new SumArray(arr, lo, (hi+lo)/2);
//                SumArray right = new SumArray(arr, (hi + lo) / 2, hi);
//                left.fork();
//                right.compute();
//                left.join();
//                ans = left.ans + right.ans;
//            }
//        }
//
//
//    }
//
//
//}
