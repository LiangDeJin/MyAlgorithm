package sort;

import sort.util.InitArr;
import sort.util.Print;

import java.util.List;

/**
 * 冒泡排序
 */
public class $1_maopao {

    public static void main(String[] args) {

        List<Integer> sList = InitArr.getList();

        sort(sList);

        Print.out(sList);

    }

    /**
     * 从小到大
     * @param sList
     */
    public static void sort(List<Integer> sList){
        int len = sList.size();
        /**
         * 从左至右遍历
         */
        for(int i = 0 ; i < len ; i++){
            /**
             * 从右至左遍历
             */
            for(int y = len - 1; y > i; y--){
                /**
                 * 若 ‘后’ 小于 ‘前’ 则将 ‘后’ 的冒到前面
                 */
                if(sList.get(y - 1) > sList.get(y)){
                    Integer temp = sList.get(y - 1);
                    sList.set(y - 1, sList.get(y));
                    sList.set(y, temp);
                }
            }
        }
    }
}
