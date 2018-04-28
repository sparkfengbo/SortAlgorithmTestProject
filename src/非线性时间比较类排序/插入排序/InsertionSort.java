package 非线性时间比较类排序.插入排序;

import main.SortStrategy;
/**
 * 插入排序
 * <p>
 * 时间复杂度（平均）： O(n2)
 * <p>
 * 时间复杂度（最坏）： O(n2)
 * <p>
 * 时间复杂度（最好）： O(n)
 * <p>
 * 空间复杂度： O(1)
 * <p>
 * 稳定性 ：稳定
 * <p>
 * <p>
 * 基本思想：
 * <p>
 * <p>
 * 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * <p>
 * 算法描述：
 * <p>
 * <p>
 * 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
 *
 * 从第一个元素开始，该元素可以认为已经被排序；
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 将新元素插入到该位置后；
 * 重复步骤2~5。
 */
public class InsertionSort extends SortStrategy {

    public InsertionSort() {
        sortName = "插入排序";
        averTimeComplexity = "O(n2)";
        bestTimeComplexity = "O(n)";
        worstTimeComplexity = "O(n2)";
        spaceComplexity = "O(1)";
        stability = true;
    }


    @Override
    protected void sort(int[] array) {
        super.sort(array);

        for (int i = 1; i < array.length; i++) {
            int preIndex = i - 1;
            int current = array[i];
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }

        //插入排序的简洁写法
//        int j = 0;
//        for (int i = 1; i < array.length; i++) {
//            int num = array[i];
//            for (j = i - 1; j >= 0 && array[j] > num; j -= 1)
//                array[j + 1] = array[j];
//            array[j + 1] = num;
//        }
    }
}
