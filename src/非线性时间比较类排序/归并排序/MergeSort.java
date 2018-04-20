package 非线性时间比较类排序.归并排序;

import main.SortStrategy;

import java.util.Arrays;

/**
 * 归并排序
 * <p>
 * 时间复杂度（平均）： O(nlog2n)
 * <p>
 * 时间复杂度（最坏）： O(nlog2n)
 * <p>
 * 时间复杂度（最好）： O(nlog2n)
 * <p>
 * 空间复杂度： O(n)
 * <p>
 * 稳定性 ：稳定
 * <p>
 * <p>
 * 基本思想：
 * <p>
 * <p>
 * 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
 * 将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。
 * <p>
 * 算法描述：
 * <p>
 * <p>
 * 把长度为n的输入序列分成两个长度为n/2的子序列；
 * 对这两个子序列分别采用归并排序；
 * 将两个排序好的子序列合并成一个最终的排序序列。
 */
public class MergeSort extends SortStrategy {

    public MergeSort() {
        sortName = "归并排序";
        averTimeComplexity = "O(nlog2n)";
        bestTimeComplexity = "O(nlog2n)";
        worstTimeComplexity = "O(nlog2n)";
        spaceComplexity = "O(n)";
        stability = true;
    }

    @Override
    protected void sort(int[] array) {
        super.sort(array);

        int[] result = mergeSort(array);

        for(int i = 0; i < result.length && i < array.length; i++) {
            array[i] = result[i];
        }
    }

    private int[] mergeSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }

        int middle = (int)( arr.length / 2.0f);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

//        System.out.print("left : ");
//
//        print(left);
//        System.out.print("right: ");
//
//        print(right);
        return merge(mergeSort(left), mergeSort(right));
    }

    private int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        Arrays.fill(result, 0);

//        System.out.print("left : ");
//        print(left);
//        System.out.print("right: ");
//        print(right);

        int i = 0, j = 0, index = 0;
        while(i < left.length  && j < right.length) {
            if (left[i] < right[j]) {
                result[index++] = left[i++];
            } else {
                result[index++] = right[j++];
            }
        }

        //left会有剩余
        if (i < left.length) {
            for (int k = i; k < left.length; k++) {
                result[index++] = left[k];
            }
        } else {
            for (int k = j; k < right.length; k++) {
                result[index++] = right[k];
            }
        }

//        System.out.print("result: ");
//        print(result);

        return result;
    }
}
