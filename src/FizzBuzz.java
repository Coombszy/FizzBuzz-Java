public class FizzBuzz {
    public String convert(int toConvert) {
        String converted;
        if (toConvert % 3 == 0 && toConvert % 5 != 0 ) {
            converted = "Fizz";
        } else if (toConvert % 5 == 0  && toConvert % 3 != 0) {
            converted = "Buzz";
        } else if (toConvert % 15 == 0) {
            converted = "FizzBuzz";
        } else {
            converted = Integer.toString(toConvert);
        }
        return converted;
    }
    public void countToX(int X)
    {
        for (int i = 1; i <= X ; i++) {
            System.out.printf(convert(i)+"\n");
        }
    }
}
