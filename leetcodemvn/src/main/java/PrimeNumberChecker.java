public class PrimeNumberChecker {
    public static class Solution {


//        Bài toán kiểm tra số nguyên tố
//        Bài này cũng đơn giản thôi. Nhưng nhiều bạn cũng chọn giải thuật phức tạp
//        Các bạn chạy để kiểm tra từ 1->n, độ phức tạp là O(n). Các bạn chạy từ 1->sqrt(n) (căn bậc 2 của n) thì đã giảm rất nhiều phép toán, nếu bạn nào còn tăng bước nhảy lên bằng 2 (kiểm tra có chia hết cho 2,3, 5, 7, 9, 11, ... thay vì 2,3,4,5,6, ....) thì số phép toán lại giảm thêm nữa.
//        Do đó, ngay từ bài số nguyên tố, việc sử dụng vòng lặp để kiểm tra các bạn đã có thể tối ưu cực nhiều. Bạn có thể thử bài này với số n cực lớn và gọi đi gọi lại nhiều lần để đo độ chênh lệch thời gian nha.
//
//        Định nghĩa: số nguyên tố là số lớn hơn 1 và chỉ chia hết cho 1 và chính nó.
//        Ví dụ: 2, 3, 5, 7, 11, 13, 17, ... là những số nguyên tố.
//        Chú ý: Số 0 và 1 không phải là số nguyên tố. Chỉ có số 2 là số nguyên tố chẵn, tất cả các số chẵn khác không phải là số nguyên tố vì chúng chia hết cho 2.
        public boolean isPrimeNumber(int n) {
            if (n == 2) {
                return true;
            } else if (n < 2) {
                return false;
            } else if (n % 2 == 0) {
                return false;
            } else {
//                square root: a number which produces a specified quantity when multiplied by itself.
//                "7 is a square root of 49"
                int squareRoot = (int) Math.sqrt(n);
                for (int i = 3; i <= squareRoot; i += 2) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }
    }
}
