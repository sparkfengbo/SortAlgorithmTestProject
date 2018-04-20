package 非线性时间比较类排序.插入排序;

import main.SortStrategy;

/**
 * 希尔排序
 * <p>
 * 时间复杂度（平均）： O(n1.3)
 * <p>
 * 时间复杂度（最坏）： O(n2)
 * <p>
 * 时间复杂度（最好）： O(n)
 * <p>
 * 空间复杂度： O(1)
 * <p>
 * 稳定性 ：不稳定
 * <p>
 * <p>
 * 基本思想：
 * <p>
 * <p>
 * 1959年Shell发明，第一个突破O(n2)的排序算法，是简单插入排序的改进版。
 * 它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
 * <p>
 * 算法描述：
 * <p>
 * <p>
 * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，具体算法描述：
 * <p>
 * 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 按增量序列个数k，对序列进行k 趟排序；
 * 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，
 * 分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 */
public class ShellSort extends SortStrategy {

    public ShellSort() {
        sortName = "希尔排序";
        averTimeComplexity = "O(n1.3)";
        bestTimeComplexity = "O(n)";
        worstTimeComplexity = "O(n2)";
        spaceComplexity = "O(1)";
        stability = false;
    }

    @Override
    protected void sort(int[] array) {
        super.sort(array);
        int j = 0;
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            //插入排序简洁写法
            for (int i = gap; i < array.length; i++) {
                int num = array[i];
                for (j = i - gap; j >= 0 && array[j] > num; j -= gap)
                    array[j + gap] = array[j];
                array[j + gap] = num;
            }
        }
    }
}
