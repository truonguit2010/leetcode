import java.util.HashMap;
import java.util.Map;

public class SumIntArray {
//    Tính tổng các số nguyên từ 1 -> n
//    Bài này ai dùng công thức thì 1 dòng là ra: n*(n+1)/2. Giải thuật này có độ phức tạp là O(1) (1 phép toán)
//    Với các bạn dùng vòng lặp từ 1 -> n để tính tổng, độ phức tạp là O(n). Với n bằng 1 tỷ, tương đương bạn thực hiện 1 tỷ lần phép toán cộng
//    Bạn hiểu thời gian chạy chênh lêch lớn như thế nào rồi chứ?


    // https://codelearn.io/sharing/do-phuc-tap-cua-thuat-toan-va-lua-chon-cach-giai-thuat
    public static class Solution {
        public int sumFrom1To(int n) {
            return n * (n + 1) / 2;
        }
    }


}
