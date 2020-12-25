/**
 * Created by Axin in 2020/12/25 14:26
 *
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 *
 * 输入：n = 7
 * 输出：21
 * 示例 3：
 *
 * 输入：n = 0
 * 输出：1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class C002_QingWaTiaoTaiJie {
    public static void main(String[] args) {
        System.out.println(execute(40));
        System.out.println(execute1(40));
    }

    /**
     * 迭代算法
     * @param num
     * @return
     */
    public static int execute(int num){
        if(num == 0){
            return 1;
        }
        if(num <= 2){
            return num;
        }
        int n1 = 1;
        int n2 = 2;
        int total = 0;
        for(int i = 3; i<= num ; i++  )
        {
            total = (n1 + n2) % 1000000007;
            n1 = n2;
            n2 = total;
        }
        return total;
    }

    /**
     * 递归算法
     * @param num
     * @return
     */
    public static int execute1(int num  )
    {
        if(num == 0){
            return 1;
        }
        if(num <= 2){
            return num;
        }
        return execute1(num - 1 ) +  execute1(num - 2);
    }



}
