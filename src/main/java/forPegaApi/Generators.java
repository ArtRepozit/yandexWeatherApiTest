package forPegaApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generators {

    /**
     * получено путём (9-0) + 1, где 9 и 0 макс и мин значения цифр в инн.
     * (Math.random() * (max - min) + 1); - позволяет получить ранодомное число типа double [0, 10)
     */

    /**
     * Ебануть сервис на спринге который будет всё это генерить и возвращать + ебануть ui на реакте
     */
    private final byte RANDOM_COEFFICIENT = 10;

    public int getRandomDigit(int randomCoefficient) {

        return (int) (Math.random() * randomCoefficient);
    }

    public List<Integer> getControlNumbers(int size) {
        if (size == 9) {
            return Arrays.asList(2, 4, 10, 3, 5, 9, 4, 6, 8);
        } else if (size == 10) {
            return Arrays.asList(7, 2, 4, 10, 3, 5, 9, 4, 6, 8);
        }
        return Arrays.asList(3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8);
    }

    public int getControlsDigits(List<Integer> blankInn) {
        List<Integer> controlNumbers;
        int controlSum = 0;
        int controlDigit;

        controlNumbers = getControlNumbers(blankInn.size());

        for (int i = 0; i < blankInn.size(); i++)
            controlSum += blankInn.get(i) * controlNumbers.get(i);

        controlDigit = controlSum % 11;

        if (controlDigit > 9)
            controlDigit = controlDigit % 10;

        return controlDigit;
    }

    public StringBuilder generateInnByUL() {
        List<Integer> blankForInnUl = new ArrayList<>();
        StringBuilder innUl = new StringBuilder();

        for (int i = 0; i < 9; i++)
            blankForInnUl.add(getRandomDigit(RANDOM_COEFFICIENT));

        blankForInnUl.add(getControlsDigits(blankForInnUl));
        blankForInnUl.forEach(innUl::append);

        return innUl;
    }

    public StringBuilder generateInnByIP() {
        List<Integer> blankForInn = new ArrayList<>();
        StringBuilder innIP = new StringBuilder();

        for (int i = 0; i < 10; i++)
            blankForInn.add(getRandomDigit(RANDOM_COEFFICIENT));

        blankForInn.add(getControlsDigits(blankForInn));
        blankForInn.add(getControlsDigits(blankForInn));
        blankForInn.forEach(innIP::append);
        return innIP;
    }

    public StringBuilder generateOgrnUl() {
        List<Integer> blankForOgrnUl = new ArrayList<>();
        StringBuilder ogrnUl = new StringBuilder();

        if (getRandomDigit(RANDOM_COEFFICIENT) < 4.5)
            blankForOgrnUl.add(1);
        else
            blankForOgrnUl.add(5);

        if (getRandomDigit(RANDOM_COEFFICIENT) < 4.5) {
            blankForOgrnUl.add(0);
            blankForOgrnUl.add(getRandomDigit(RANDOM_COEFFICIENT));
        } else {
            blankForOgrnUl.add(1);
            blankForOgrnUl.add(getRandomDigit(RANDOM_COEFFICIENT / 2 + 1));
        }

        for (int i = 0; i < 9; i++)
            blankForOgrnUl.add(getRandomDigit(RANDOM_COEFFICIENT));

        blankForOgrnUl.forEach(ogrnUl::append);
        long blankOgrn = Long.parseLong(ogrnUl.toString()) % 11;

        if (blankOgrn == 10)
            ogrnUl.append(0);
        else
            ogrnUl.append(blankOgrn);

        return ogrnUl;
    }

    public StringBuilder generateOgrnIp() {
        StringBuilder ogrnIp = new StringBuilder();

        ogrnIp.append(3);

        for (int i = 0; i < 13; i++) {
            ogrnIp.append(getRandomDigit(RANDOM_COEFFICIENT));
        }

        ogrnIp.append(Long.parseLong(ogrnIp.toString()) % 13 % 10);

        return ogrnIp;
    }

    public String generateObjectId() {

        byte length = 24;
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while (sb.length() < length)
            sb.append(Integer.toHexString(r.nextInt()));
        return sb.toString().substring(0, length);
    }

    public String generateFiasId(){
        return "";
    }

    public String printClassName(){
        return this.getClass().getSimpleName();
    }

}
