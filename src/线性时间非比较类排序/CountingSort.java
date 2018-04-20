package 线性时间非比较类排序;

import main.SortStrategy;

import java.util.Arrays;

/**
 * 计数排序
 * <p>
 * 时间复杂度（平均）： O(n + k)
 * <p>
 * 时间复杂度（最坏）： O(n + k)
 * <p>
 * 时间复杂度（最好）： O(n + k)
 * <p>
 * 空间复杂度： O(n + k)
 * <p>
 * 稳定性 ：稳定
 * <p>
 * <p>
 * 基本思想：
 * <p>
 * 计数排序不是基于比较的排序算法，其核心在于将输入的数据值转化为键存储在额外开辟的数组空间中。
 * 作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数。
 * <p>
 * 算法描述：
 * <p>
 * <p>
 * 找出待排序的数组中最大和最小的元素；
 * 统计数组中每个值为i的元素出现的次数，存入数组C的第i项；
 * 对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）；
 * 反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1。
 * <p>
 * <b>当k不是很大并且序列比较集中时，计数排序是一个很有效的排序算法</b>
 * </p>
 */
public class CountingSort extends SortStrategy {

    public CountingSort() {
        sortName = "计数排序";
        averTimeComplexity = "O(n + k)";
        bestTimeComplexity = "O(n + k)";
        worstTimeComplexity = "O(n + k)";
        stability = true;
        spaceComplexity = "O(n + k)";
    }

    @Override
    protected void sort(int[] array) {
        super.sort(array);
        int length = array.length;

        //查找数组中的最大值,array是大于0的数（其实这个值应该在外面传进来，这里为了接口的统一，自己求值一遍）
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        int bucketLength = maxValue + 1;
        int[] bucket = new int[bucketLength];
        int sortedIndex = 0;

        //将数组全部赋值为0（虽然Java中int数组会初始化为0）
        Arrays.fill(bucket, 0);

        //开始计数
        for (int i = 0; i < length; i++) {
            bucket[array[i]]++;
        }

        for (int i = 0; i < bucketLength; i++) {
            while(bucket[i] > 0) {
                array[sortedIndex++] = i;
                bucket[i]--;
            }
        }
    }
}
