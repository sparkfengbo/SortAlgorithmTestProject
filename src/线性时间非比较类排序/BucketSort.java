package 线性时间非比较类排序;

import main.SortStrategy;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 桶排序
 * <p>
 * 时间复杂度（平均）： O(n + k)
 * <p>
 * 时间复杂度（最坏）： O(n2)
 * <p>
 * 时间复杂度（最好）： O(n)
 * <p>
 * 空间复杂度： O(n + k)
 * <p>
 * 稳定性 ：稳定
 * <p>
 * <p>
 * 基本思想：
 * <p>
 * 桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。
 * 桶排序 (Bucket sort)的工作的原理：假设输入数据服从均匀分布，将数据分到有限数量的桶里，
 * 每个桶再分别排序（有可能再使用别的排序算法或是以递归方式继续使用桶排序进行排）。
 * <p>
 * 算法描述：
 * <p>
 * <p>
 * 设置一个定量的数组当作空桶；
 * 遍历输入数据，并且把数据一个一个放到对应的桶里去；
 * 对每个不是空的桶进行排序；
 * 从不是空的桶里把排好序的数据拼接起来。
 */
public class BucketSort extends SortStrategy {

    //可以从外面传
    private static final int DEFAULT_BUCKET_SIZE = 5;

    public BucketSort() {
        sortName = "桶排序";
        averTimeComplexity = "O(n + k)";
        bestTimeComplexity = "O(n)";
        worstTimeComplexity = "O(n2)";
        stability = true;
        spaceComplexity = "O(n + k)";
    }

    @Override
    protected void sort(int[] array) {
        super.sort(array);

        //计算最大值、最小值
        int minValue = array[0];
        int maxValue = array[0];
        for(int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        //计算桶的数量，目的是均匀分布（默认桶大小是5）
        int bucketCount = (maxValue - minValue) / DEFAULT_BUCKET_SIZE  + 1;

        //因为设计的问题，原参数用的是int[]，这里修改成ArrayList<ArrayList<Integer>>
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketCount);

        //初始化
        for(int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        //将整数分布到对应的桶中
        for (int i = 0; i < array.length; i++ ) {
            int bucketIndex = (array[i] - minValue) / DEFAULT_BUCKET_SIZE;
            buckets.get(bucketIndex).add(array[i]);
        }

        //对每个桶进行排序，排序的算法可以自选，这里直接使用JDK中的方法（归并排序）
        for(int i = 0; i < buckets.size();i++ ) {
            Collections.sort(buckets.get(i));
        }

//        System.out.println(buckets);

        //将结果赋值给原int[]，以方便打印结果
        int index = 0;
        for (int i = 0; i < buckets.size(); i++) {
            ArrayList<Integer> bucket = buckets.get(i);
            for (int j = 0; j < bucket.size(); j++) {
                array[index++] = bucket.get(j);
            }
        }
    }
}
