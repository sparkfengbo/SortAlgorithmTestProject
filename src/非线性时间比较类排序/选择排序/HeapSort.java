package 非线性时间比较类排序.选择排序;


import main.SortStrategy;
/**
 * 堆排序
 * <p>
 * 时间复杂度（平均）： O(nlog2n)
 * <p>
 * 时间复杂度（最坏）： O(nlog2n)
 * <p>
 * 时间复杂度（最好）： O(nlog2n)
 * <p>
 * 空间复杂度： O(1)
 * <p>
 * 稳定性 ：不稳定
 * <p>
 * <p>
 * 基本思想：
 * <p>
 * <p>
 * 堆排序（Heapsort）是指利用堆这种数据结构所设计的一种排序算法。
 * 堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。
 * <p>
 * 算法描述：
 * <p>
 * <p>
 * 将初始待排序关键字序列(R1,R2….Rn)构建成大顶堆，此堆为初始的无序区；
 * 将堆顶元素R[1]与最后一个元素R[n]交换，此时得到新的无序区(R1,R2,……Rn-1)和新的有序区(Rn),且满足R[1,2…n-1]<=R[n]；
 * 由于交换后新的堆顶R[1]可能违反堆的性质，因此需要对当前无序区(R1,R2,……Rn-1)调整为新堆，
 * 然后再次将R[1]与无序区最后一个元素交换，得到新的无序区(R1,R2….Rn-2)和新的有序区(Rn-1,Rn)。不断重复此过程直到有序区的元素个数为n-1，则整个排序过程完成。
 */
public class HeapSort extends SortStrategy {

    public HeapSort() {
        sortName = "堆排序";
        averTimeComplexity = "O(nlog2n)";
        bestTimeComplexity = "O(nlog2n)";
        worstTimeComplexity = "O(nlog2n)";
        spaceComplexity = "O(1)";
        stability = false;
    }

    @Override
    protected void sort(int[] array) {
        super.sort(array);

        /**
         * 关键1：建立大根堆
         *
         * 以19个元素为例，构建顺序：
         *
         * 9 -(19, 20); 8 - 17, 18; 7 - 15, 16; 6 - 13, 14; 5 - 11, 12;
         * 4 -  9, 10 ; 3 -  7,  8; 2 -  5,  6;
         * 1 -  3,  4 ;
         * 0 -  1,  2 ;
         */
        int length = array.length;

        for (int i = length / 2; i >= 0; i--) {
            heapify(array, i, array.length - 1);
        }

        //关键2：调整堆

        for (int i = array.length - 1; i >= 0; i--) {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(array, 0, i);
        }
    }

    /**
     * 调整大根堆
     * @param arr
     * @param parentIndex  父节点的index
     */
    private void heapify(int[] arr, int parentIndex, int length) {
        //左儿子的index
        int leftChild = 2 * parentIndex + 1;

        //右儿子的index
        int rightChild = 2 * parentIndex + 2;

        int parent = parentIndex;

        //如果左儿子比父节点小，说明需要更换
        if (leftChild < length && arr[leftChild] > arr[parent]) {
            parent = leftChild;
        }

        if (rightChild < length && arr[rightChild] > arr[parent]) {
            parent = rightChild;
        }

        if (parent != parentIndex) {
            int tmp = arr[parent];
            arr[parent] = arr[parentIndex];
            arr[parentIndex] = tmp;
            heapify(arr, parent, length);
        }
    }
}
