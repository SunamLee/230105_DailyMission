import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // 시간 측정
        Instant start = Instant.now();

        /**
         *
         * 1.빈 Integer type의 배열 생성
         * 2.ArrayList로 변환
         * 3.랜덤한 수를 ArrayList에 Input
         * 4.For 반복문으로 ArrayList 내부 인자 중 1부터 +1씩 존재하는지 검사 진행
         * 4-1. 없으면 해당 값이 정답이 됨
         * 4-2. 있으면 4번으로 이동
         */

        Random r = new Random();
        Integer[] arr = {};
        List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));

        for(int i = 0; i < 11; i++) {
            int rnum = r.nextInt(20) - 10;
            arrList.add(rnum);
        }

        for (int i : arrList) {
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 1; i < arrList.size() + 1; i++) {
            if(!arrList.contains(i)) {
                System.out.println("정답 : " + i);
                break;
            }
        }

//        arr = {1000, 1, -3000, 9, 0, -10, -1, 2, 4, 10000, -12345};
//        List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));

//        int[] arr = {1000, 1, -3000, 9, 0, -10, -1, 2, 4, 10000, -12345};
//
//        // 배열의 길이 저장
//        final int length = arr.length;
//
//        for (int i = 0; i < length; i++) {
//            // 작은값에 최소값의 인덱스를 저장
//            int x = i;
//            for (int j = i + 1; j < length; j++) {
//                // 인덱스 i + 1 항목과 비교하여 더 작은 값의 인덱스를 min에 할당
//                if (arr[x] > arr[j]) {
//                    x = j;
//                }
//            }
//            // 나보다 작은게 있으면 치환
//            if (x != i) {
//                arr[x] = arr[x] + arr[i];
//                arr[i] = arr[x] - arr[i];
//                arr[x] = arr[x] - arr[i];
//            }
//        }
//
//        for(int i = 0; i < arr.length; i++) {
//
//        }
//        int[] a = {1000, 1, -3000, 9, 0, -10, -1, 2, 4, 10000, -12345};
//
//        int x = 0;
//
//        int y = 0;
//        int z = 0;
//
//        // a 배열이 홀수면, 배열 길이 절반 숫자의 인덱스 항목을 x 에 할당, 짝수인 경우 그대로 진행
//        if((a.length % 2) > 0) {
//            x = a[a.length / 2];
//        }
//
//        for(int i = 0; i < a.length; i++) {
//            a[a.length / 2]
//        }

        Instant finish = Instant.now();
        long elapsedTime = Duration.between(start, finish).toMillis();
        System.out.println("\nelapsedTime(ms) : " + elapsedTime);
    }
}