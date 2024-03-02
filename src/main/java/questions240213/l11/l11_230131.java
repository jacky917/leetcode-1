package questions240213.l11;

public class l11_230131 {
    public int minArray(int[] numbers) {
        if (numbers.length == 0) return -1;
        for (int i = 0 ; i < numbers.length - 1 ; i++) {
            if (numbers[i] > numbers[i + 1]) return numbers[i + 1];
        }
        return numbers[0];
    }
}