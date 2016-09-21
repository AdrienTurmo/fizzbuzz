public class Fizzbuzz {

    public String answer(int numberToConvert) {
        String answer = "";
        answer += addWordToAnswerIfNumberToConvertIsModulo(numberToConvert, 3, "Fizz");
        answer += addWordToAnswerIfNumberToConvertIsModulo(numberToConvert, 5, "Buzz");
        boolean isNumberNotAModuloThreeOrFive = answer.equals("");
        return isNumberNotAModuloThreeOrFive ? numberToConvert + "" : answer;
    }

    private String addWordToAnswerIfNumberToConvertIsModulo(int numberToConvert, int modulo, String word) {
        if ((numberToConvert % modulo) == 0) {
            return word;
        }
        return "";
    }
}

