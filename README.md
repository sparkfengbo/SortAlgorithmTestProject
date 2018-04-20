（本工程是 IntelliJ Idea 2018的工程，参考部分文章，复习一遍各大排序算法，记录之）

## 十大排序算法

**【参考文章】**

- [十大经典排序算法（动图演示）](http://www.cnblogs.com/onepixel/p/7674659.html)
- [Java实现归并排序](https://www.cnblogs.com/of-fanruice/p/7678801.html)
- [排序算法总结](http://www.runoob.com/w3cnote/sort-algorithm-summary.html)
- [八大经典排序算法](https://blog.csdn.net/youzhouliu/article/details/52311443)
- [算法篇之堆排序](https://blog.csdn.net/qq_21492635/article/details/73105580)(这里仅引用了图片，貌似他的代码有点问题)

------

**总结如下**

### 1.算法的分类

> - 非线性时间比较类排序：通过比较来决定元素间的相对次序，由于其时间复杂度不能突破O(nlogn)，因此称为非线性时间比较类排序。
>
> - 线性时间非比较类排序：不通过比较来决定元素间的相对次序，它可以突破基于比较排序的时间下界，以线性时间运行，因此称为线性时间非比较类排序。 
> 


![分类](https://github.com/sparkfengbo/SortAlgorithmTestProject/blob/master/picres/%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95%E7%9A%84%E5%88%86%E7%B1%BB.png?raw=true)
![复杂度](https://github.com/sparkfengbo/SortAlgorithmTestProject/blob/master/picres/%E5%90%84%E6%8E%92%E5%BA%8F%E7%AE%97%E6%B3%95%E8%B4%9F%E8%B4%A3%E5%BA%A6%E5%88%86%E6%9E%90.png?raw=true)

### 2.算法的介绍

#### 2.1 冒泡排序（Bubble Sort）

 <p>
 时间复杂度（平均）： O(n2)
 <p>
 时间复杂度（最坏）： O(n2)
 <p>
 时间复杂度（最好）： O(n)
 <p>
 空间复杂度： O(1)
 <p>
 稳定性 ：稳定
 <p>
 <p>

**基本思想**
 <p>
 
 冒泡排序是一种简单的排序算法。它重复地走访过要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。走访数列的工作是
 重复地进行直到没有再需要交换，也就是说该数列已经排序完成。这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 <p>
 <p>
 
**算法描述**
 <p>
 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 针对所有的元素重复以上的步骤，除了最后一个；
 重复步骤1~3，直到排序完成。

![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015223238449-2146169197.gif)


#### 2.2 快速排序（Quick Sort）
 时间复杂度（平均）： O(nlog2n)
 <p>
 时间复杂度（最坏）： O(n2)
 <p>
 时间复杂度（最好）： O(nlog2n)
 <p>
 空间复杂度： O(nlog2n)
 <p>
 稳定性 ：稳定
 <p>
 <p>
 
**基本思想**
 <p>
 <p>
 通过一趟排序将待排记录分隔成独立的两部分，其中一部分记录的关键字均比另一部分的关键字小，
 则可分别对这两部分记录继续进行排序，以达到整个序列有序。
 <p>
 
**算法描述**
 <p>
 <p>
 快速排序使用分治法来把一个串（list）分为两个子串（sub-lists）。具体算法描述如下：
 <p>
 从数列中挑出一个元素，称为 “基准”（pivot）;
 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 

![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015230936371-1413523412.gif)

#### 2.3 插入排序（Insertion Sort）

 <p>
 时间复杂度（平均）： O(n2)
 <p>
 时间复杂度（最坏）： O(n2)
 <p>
 时间复杂度（最好）： O(n)
 <p>
 空间复杂度： O(1)
 <p>
 稳定性 ：稳定
 <p>
 <p>
 
**基本思想**
 <p>
 <p>
 插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 <p>
 
**算法描述**
 <p>
 <p>
 一般来说，插入排序都采用in-place在数组上实现。具体算法描述如下：
 
 从第一个元素开始，该元素可以认为已经被排序；
 取出下一个元素，在已经排序的元素序列中从后向前扫描；
 如果该元素（已排序）大于新元素，将该元素移到下一位置；
 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 将新元素插入到该位置后；
 重复步骤2~5。


![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015225645277-1151100000.gif)

#### 2.4 希尔排序（Shell Sort）

 <p>
 时间复杂度（平均）： O(n1.3)
 <p>
 时间复杂度（最坏）： O(n2)
 <p>
 时间复杂度（最好）： O(n)
 <p>
 空间复杂度： O(1)
 <p>
 稳定性 ：不稳定
 <p>
 <p>
 
**基本思想**
 <p>
 <p>
 1959年Shell发明，第一个突破O(n2)的排序算法，是简单插入排序的改进版。
 它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
 <p>
 
 
**算法描述**
 <p>
 <p>
 先将整个待排序的记录序列分割成为若干子序列，使得每个子序列的元素个数相对较少，
 分别进行直接插入排序，然后对各个子序列分别进行直接插入排序，待整个待排序列“基本有序”后，最后在对所有元素进行一次直接插入排序。
 
 具体算法描述：

 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 按增量序列个数k，对序列进行k 趟排序；
 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，
 分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。


![](https://github.com/sparkfengbo/SortAlgorithmTestProject/blob/master/picres/%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F.png?raw=true)

#### 2.5 选择排序（Selection Sort）

 <p>
 时间复杂度（平均）： O(n2)
 <p>
 时间复杂度（最坏）： O(n2)
 <p>
 时间复杂度（最好）： O(n2)
 <p>
 空间复杂度： O(1)
 <p>
 稳定性 ：不稳定
 <p>
 <p>
 
**基本思想**
 <p>
 <p>
 选择排序(Selection-sort)是一种简单直观的排序算法。它的工作原理：首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
 然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 <p>
 
**算法描述**
 <p>
 <p>
 n个记录的直接选择排序可经过n-1趟直接选择排序得到有序结果。具体算法描述如下：
 <p>
 初始状态：无序区为R[1..n]，有序区为空；
 第i趟排序(i=1,2,3…n-1)开始时，当前有序区和无序区分别为R[1..i-1]和R(i..n）。
 该趟排序从当前无序区中-选出关键字最小的记录 R[k]，将它与无序区的第1个记录R交换，
 使R[1..i]和R[i+1..n)分别变为记录个数增加1个的新有序区和记录个数减少1个的新无序区；
 n-1趟结束，数组有序化了。


![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015224719590-1433219824.gif)

#### 2.6 堆排序（Heap Sort）
 <p>
 时间复杂度（平均）： O(nlog2n)
 <p>
 时间复杂度（最坏）： O(nlog2n)
 <p>
 时间复杂度（最好）： O(nlog2n)
 <p>
 空间复杂度： O(1)
 <p>
 稳定性 ：不稳定
 <p>
 <p>
 
**基本思想**
 <p>
 <p>
 堆排序（Heapsort）是指利用堆这种数据结构所设计的一种排序算法。
 堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。
 <p>
 
**算法描述**
 <p>
 <p>
 将初始待排序关键字序列(R1,R2….Rn)构建成大顶堆，此堆为初始的无序区；
 将堆顶元素R[1]与最后一个元素R[n]交换，此时得到新的无序区(R1,R2,……Rn-1)和新的有序区(Rn),且满足R[1,2…n-1]<=R[n]；
 由于交换后新的堆顶R[1]可能违反堆的性质，因此需要对当前无序区(R1,R2,……Rn-1)调整为新堆，
 然后再次将R[1]与无序区最后一个元素交换，得到新的无序区(R1,R2….Rn-2)和新的有序区(Rn-1,Rn)。不断重复此过程直到有序区的元素个数为n-1，则整个排序过程完成。
 
**关键点**

- 1.建立大根堆
- 2.调整堆

![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015231308699-356134237.gif)


![堆的构建](https://github.com/sparkfengbo/SortAlgorithmTestProject/blob/master/picres/%E5%A0%86%E7%9A%84%E6%9E%84%E5%BB%BA.png?raw=true)

![堆的排序1](https://github.com/sparkfengbo/SortAlgorithmTestProject/blob/master/picres/%E5%A0%86%E6%8E%92%E5%BA%8F1.png?raw=true)
![堆的排序2](https://github.com/sparkfengbo/SortAlgorithmTestProject/blob/master/picres/%E5%A0%86%E6%8E%92%E5%BA%8F6.png?raw=true)
![堆的排序3](https://github.com/sparkfengbo/SortAlgorithmTestProject/blob/master/picres/%E5%A0%86%E6%8E%92%E5%BA%8F10.png?raw=true)

#### 2.7 归并排序（Merge Sort）
 <p>
 时间复杂度（平均）： O(nlog2n)
 <p>
 时间复杂度（最坏）： O(nlog2n)
 <p>
 时间复杂度（最好）： O(nlog2n)
 <p>
 空间复杂度： O(n)
 <p>
 稳定性 ：稳定
 <p>
 <p>
 
**基本思想**
 <p>
 <p>
 归并排序是建立在归并操作上的一种有效的排序算法。该算法是采用分治法（Divide and Conquer）的一个非常典型的应用。
 将已有序的子序列合并，得到完全有序的序列；即先使每个子序列有序，再使子序列段间有序。若将两个有序表合并成一个有序表，称为2-路归并。
 <p>
 
**算法描述**
 <p>
 <p>
 把长度为n的输入序列分成两个长度为n/2的子序列；
 对这两个子序列分别采用归并排序；
 将两个排序好的子序列合并成一个最终的排序序列。

![](https://github.com/sparkfengbo/SortAlgorithmTestProject/blob/master/picres/%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F%E5%8E%9F%E7%90%86%E5%9B%BE.jpg?raw=true)

#### 2.8 计数排序（Counting Sort）

 <p>
 时间复杂度（平均）： O(n + k)
 <p>
 时间复杂度（最坏）： O(n + k)
 <p>
 时间复杂度（最好）： O(n + k)
 <p>
 空间复杂度： O(n + k)
 <p>
 稳定性 ：稳定
 <p>
 <p>
 
**基本思想**
 <p>
 计数排序不是基于比较的排序算法，其核心在于将输入的数据值转化为键存储在额外开辟的数组空间中。
 作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数。
 <p>
 
**算法描述**
 <p>
 <p>
 找出待排序的数组中最大和最小的元素；
 统计数组中每个值为i的元素出现的次数，存入数组C的第i项；
 对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）；
 反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1。
 <p>
 <b>当k不是很大并且序列比较集中时，计数排序是一个很有效的排序算法</b>
 </p>

![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015231740840-6968181.gif)

#### 2.9 桶排序（Bucket Sort）


 <p>
 时间复杂度（平均）： O(n + k)
 <p>
 时间复杂度（最坏）： O(n + k)
 <p>
 时间复杂度（最好）： O(n + k)
 <p>
 空间复杂度： O(n + k)
 <p>
 稳定性 ：稳定
 <p>
 <p>
 
**基本思想**
 <p>
 计数排序不是基于比较的排序算法，其核心在于将输入的数据值转化为键存储在额外开辟的数组空间中。
 作为一种线性时间复杂度的排序，计数排序要求输入的数据必须是有确定范围的整数。
 <p>
 
**算法描述**
 <p>
 <p>
 找出待排序的数组中最大和最小的元素；
 统计数组中每个值为i的元素出现的次数，存入数组C的第i项；
 对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）；
 反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1。
 <p>
 <b>当k不是很大并且序列比较集中时，计数排序是一个很有效的排序算法</b>
 </p>
 
#### 2.10 基数排序（Radix Sort）


 <p>
 时间复杂度（平均）： O(n k)
 <p>
 时间复杂度（最坏）： O(n k)
 <p>
 时间复杂度（最好）： O(n k)
 <p>
 空间复杂度： O(n + k)
 <p>
 稳定性 ：稳定
 <p>
 <p>
 
**基本思想**
 <p>
 基数排序是按照低位先排序，然后收集；再按照高位排序，然后再收集；依次类推，直到最高位。
 有时候有些属性是有优先级顺序的，先按低优先级排序，再按高优先级排序。
 最后的次序就是高优先级高的在前，高优先级相同的低优先级高的在前。
 <p>
 
**算法描述**
 <p>
 <p>
 取得数组中的最大数，并取得位数；
 arr为原始数组，从最低位开始取每个位组成radix数组；
 对radix进行计数排序（利用计数排序适用于小范围数的特点）；


![](https://images2017.cnblogs.com/blog/849589/201710/849589-20171015232453668-1397662527.gif)
