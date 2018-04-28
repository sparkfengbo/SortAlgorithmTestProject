package 线性时间非比较类排序;

import main.SortStrategy;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 基数排序
 * <p>
 * 时间复杂度（平均）： O(d(n+r))
 * (d : 位数    r ：基数 10)
 * <p>
 * 时间复杂度（最坏）： O(d(n+r))
 * <p>
 * 时间复杂度（最好）： O(d(n+r))
 * <p>
 * 空间复杂度： O(n + r)
 * <p>
 * 稳定性 ：稳定
 * <p>
 * <p>
 * 基本思想：
 * <p>
 * 基数排序是按照低位先排序，然后收集；再按照高位排序，然后再收集；依次类推，直到最高位。
 * 有时候有些属性是有优先级顺序的，先按低优先级排序，再按高优先级排序。
 * 最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前。
 * <p>
 * 算法描述：
 * <p>
 * <p>
 * 取得数组中的最大数，并取得位数；
 * arr为原始数组，从最低位开始取每个位组成radix数组；
 * 对radix进行计数排序（利用计数排序适用于小范围数的特点）；
 */
public class RadixSort extends SortStrategy {

    public RadixSort() {
        sortName = "基数排序";
        averTimeComplexity = "O(n * k)";
        bestTimeComplexity = "O(n * k)";
        worstTimeComplexity = "O(n * k)";
        stability = true;
        spaceComplexity = "O(n + k)";
    }

    @Override
    protected void sort(int[] array) {
        super.sort(array);

        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        //计算输入的数组的最大位数
        int maxDigits = 0;
        int tmpMax = maxValue;
        while ((tmpMax / 10 > 0) || (tmpMax / 10 <= 0 && tmpMax % 10 > 0)) {
            maxDigits++;
            tmpMax /= 10;
        }

        int mod = 10;
        int dev = 1;

        for (int i = 0; i < maxDigits; i++, mod *= 10, dev *= 10) {
            //每次都需要清空之前的操作
            ArrayList<ArrayList<Integer>> buckets = getEmptyList();

            for (int j = 0; j < array.length; j++) {
                //从低位到高位算
                int digit = array[j] % mod / dev;
                buckets.get(digit).add(array[j]);
            }

            for (int j = 0; j < buckets.size(); j++) {
                //这里应该使用计数排序
                Collections.sort(buckets.get(j));
            }

            int index = 0;
            for (int k = 0; k < buckets.size(); k++) {
                ArrayList<Integer> bucket = buckets.get(k);
                for (int j = 0; j < bucket.size(); j++) {
                    array[index++] = bucket.get(j);
                }
            }
//            print(array);
        }
    }

    private ArrayList<ArrayList<Integer>> getEmptyList() {
        int initialSize = 10;

        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
        //初始化,因为这里不知道预先有多少个桶，但是下面的去最低位的计算得到的结果的范围是0-9，所以这里直接把总数设置为10
        for (int i = 0; i < initialSize; i++) {
            buckets.add(new ArrayList<>());
        }

        return buckets;
    }
}
