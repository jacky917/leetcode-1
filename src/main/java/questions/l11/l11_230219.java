package questions.l11;

public class l11_230219 {
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (numbers[right] > numbers[mid]) {
                right = mid;
            } else if (numbers[right] < numbers[mid]) {
                left = mid + 1;
            } else {
                right --;
            }
        }
        return numbers[left];
    }
}
