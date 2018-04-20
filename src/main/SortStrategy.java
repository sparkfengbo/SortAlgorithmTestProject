package main;

public abstract class SortStrategy {

    protected String sortName;
    protected String averTimeComplexity;
    protected String bestTimeComplexity;
    protected String worstTimeComplexity;
    protected String spaceComplexity;
    protected boolean stability;

    protected void sort(int[] array) {
        int length = array.length;

        if (length <= 0) {
            System.out.println("empty int array");
            return;
        }

        System.out.println("开始" + sortName + "\t" +
                "[时间复杂度(平均)]：" +  averTimeComplexity + "," +
                "[时间复杂度(最坏)]：" +  worstTimeComplexity + "," +
                "[时间复杂度(最好)]：" + bestTimeComplexity + "," +
                "[空间复杂度]：" +  spaceComplexity + "," +
                "[稳定性]：" +  (stability ? "稳定" : "不稳定"));

        System.out.println("排序前：");
        print(array);
    }

    public void print(int[] array) {
        int length = array.length;

        if (length <= 0) {
            System.out.println("empty int array");
            return;
        }

        for (int j = 0; j < length; j++) {
            if (j != length - 1) {
                System.out.print(array[j] + ",");
            } else {
                System.out.println(array[j]);
                System.out.println();
            }
        }
    }
}
