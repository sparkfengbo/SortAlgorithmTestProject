package main;

import 线性时间非比较类排序.BucketSort;
import 线性时间非比较类排序.CountingSort;
import 线性时间非比较类排序.RadixSort;
import 非线性时间比较类排序.交换排序.BubbleSort;
import 非线性时间比较类排序.交换排序.QuickSort;
import 非线性时间比较类排序.归并排序.MergeSort;
import 非线性时间比较类排序.插入排序.InsertionSort;
import 非线性时间比较类排序.插入排序.ShellSort;
import 非线性时间比较类排序.选择排序.HeapSort;
import 非线性时间比较类排序.选择排序.SelectionSort;

/**
 * 参考文章 包括：
 *
 * <a href= ""></>
 * <a href= ""></><a href= ""></><a href= ""></><a href= ""></><a href= ""></>
 */
public class Main {

    public static void main(String[] args) {

        Class[] sortClsArray = new Class[]{
                //非线性时间比较类排序
                BubbleSort.class, QuickSort.class,          //交换排序
                InsertionSort.class, ShellSort.class,       //插入排序
                SelectionSort.class, HeapSort.class,        //选择排序
                MergeSort.class,                            //归并排序

                //线性时间非比较类排序
                CountingSort.class,                         //计数排序
                BucketSort.class,                           //桶排序
                RadixSort.class                             //基数排序
        };
        int[] s = new int[19];

        for (int i = 0; i < sortClsArray.length; i++) {
            try {
                SortStrategy strategy = (SortStrategy) sortClsArray[i].newInstance();
                //随机生成0-100的int数组
                for (int j = 0; j < s.length; j++) {
                    s[j] = (int) (Math.random() * 100);
                }
                System.out.print(i + 1 + ".");
                strategy.sort(s);
                System.out.println("排序后：");
                strategy.print(s);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
