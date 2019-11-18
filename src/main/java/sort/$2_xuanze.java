package sort;

import sort.util.InitArr;
import sort.util.Print;

import java.util.List;

/**
 * 选择排序
 */
public class $2_xuanze {

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
        for(int i = 0 ; i < len - 1 ; i++){
            /**
             * 假设最小值下标为i
             */
            Integer min = i;
            /**
             * y从i的下一位开始遍历
             */
            for(int y = i + 1 ; y < len ; y++){
                /**
                 * 若‘min对应值’大于‘当前下标对应值’则‘当前下标’为最小
                 */
                if(sList.get(min) > sList.get(y)){
                    min = y;
                }

            }
            /**
             * 将最小下标值与当前i值交换
             */
            if(min != i){
                Integer temp = sList.get(i);
                sList.set(i, sList.get(min));
                sList.set(min, temp);
            }

        }
    }
}
