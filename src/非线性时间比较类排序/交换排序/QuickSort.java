package 非线性时间比较类排序.交换排序;

import main.SortStrategy;

/**
 * 快速排序
 * <p>
 * 时间复杂度（平均）： O(nlog2n)
 * <p>
 * 时间复杂度（最坏）： O(n2)
 * <p>
 * 时间复杂度（最好）： O(nlog2n)
 * <p>
 * 空间复杂度： O(nlog2n)
 * <p>
 * 稳定性 ：稳定
 * <p>
 * <p>
 * 基本思想：
 * <p>
 * <p>
 * 通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，
 * 则可分别对这两部分记录继续进行排序，以达到整个序列有序。
 * <p>
 * 算法描述：
 * <p>
 * <p>
 * 快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：
 * <p>
 * 从数列中挑出一个元素，称为 “基准”（pivot）;
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 * 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
 * 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 */
public class QuickSort extends SortStrategy {

    public QuickSort() {
        sortName = "快速排序";
        averTimeComplexity = "O(nlog2n)";
        bestTimeComplexity = "O(nlog2n)";
        worstTimeComplexity = "O(n2)";
        stability = true;
        spaceComplexity = "O(nlog2n)";
    }

    @Override
    public void sort(int[] arg) {
        super.sort(arg);
        quickSort(arg, 0, arg.length - 1);
    }

    private void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int privotIndex = partition(array, left, right);
            quickSort(array, left, privotIndex - 1);
            quickSort(array, privotIndex + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        //选取基准元素
        int privot = array[left];
        int tmp;

        while (left < right) {
            while(left  < right && array[right] >= privot) {
                right--;
            }

            tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;

            while(left  < right && array[left] <= privot) {
                left++;
            }

            tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
        return left;
    }
}
