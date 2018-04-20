package 非线性时间比较类排序.交换排序;

import main.SortStrategy;

/**
 * 冒泡排序
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
 * 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。走访数列的工作是
 * 重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 * <p>
 * <p>
 * 算法描述：
 * <p>
 * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 针对所有的元素重复以上的步骤，除了最后一个；
 * 重复步骤1~3，直到排序完成。
 */
public class BubbleSort extends SortStrategy {

    public BubbleSort() {
        sortName = "冒泡排序";
        averTimeComplexity = "O(n2)";
        bestTimeComplexity = "O(n)";
        worstTimeComplexity = "O(n2)";
        stability = true;
        spaceComplexity = "O(1)";
    }

    @Override
    public void sort(int[] arg) {
        super.sort(arg);
        for (int i = arg.length; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (j < (arg.length - 1) && arg[j] > arg[j + 1]) {
                    //swap
                    int t = arg[j];
                    arg[j] = arg[j + 1];
                    arg[j + 1] = t;
                }
            }
        }
    }

}
