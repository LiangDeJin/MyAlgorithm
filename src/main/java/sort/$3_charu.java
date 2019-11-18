package sort;

import sort.util.InitArr;
import sort.util.Print;

import java.util.List;

/**
 * 插入排序
 */
public class $3_charu {

    public static void main(String[] args) {

        List<Integer> sList = InitArr.getList();

        sort(sList);

        Print.out(sList);

    }

    /**
     * 从小到大
     *
     * @param sList
     */
    public static void sort(List<Integer> sList) {
        int len = sList.size();
        /**
         * 从左至右遍历，0默认有序
         */
        for (int i = 1; i < len; i++) {
            /**
             * 取‘未排序’第一个到缓存，设为‘待插入’值
             */
            Integer temp = sList.get(i);
            /**
             * 设置‘插入下标’为i
             */
            int index = i;
            /**
             * 当前光标前一个是‘已排序’最后一位，从右至左遍历
             */
            for (int y = index - 1; y >= 0; y--) {
                /**
                 * 若‘待插入’值小于当前y下标值，将y下标值右移，设置‘插入下标’为y下标，直到y下标值不大于‘待插入值’跳出循环
                 */
                if (temp < sList.get(y)) {
                    sList.set(y + 1, sList.get(y));
                    index = y;
                } else {
                    break;
                }
            }
            /**
             * 若‘待插入’值下标 为改变，说明‘已排序’列表为改变，无需操作
             */
            if (index != i) {
                sList.set(index, temp);
            }
        }
    }
}
