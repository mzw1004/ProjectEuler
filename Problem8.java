/**
 * The four adjacent digits in the 1000-digit number
 * that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 *  DIGIT_NUMBER
 * Find the thirteen adjacent digits in the 1000-digit
 * number that have the greatest product. What is the
 * value of this product?
 */

public class Problem8 {

    public long compute_product(String number) {
        if (number.length() == 1) {
            return Integer.parseInt(number);
        }
        else {
            long product = Integer.parseInt(number.substring(0, 1));
            product *= compute_product(number.substring(1));
            return product;
        }
    }

    public long find_greatest_product(String number) {
        int NUMBER_LENGTH = 13;
        long greatest_product = 1;

        for (int i = 0; i + NUMBER_LENGTH <= number.length(); i += 1) {
            String subnumber = number.substring(i, i + NUMBER_LENGTH);
            if (subnumber.indexOf("0") == -1) {
                long temp = compute_product(subnumber);
                if (temp > greatest_product) {
                    greatest_product = temp;
                }
            }
        }

        return greatest_product;
    }

    public static void main(String[] args) {
        String DIGIT_NUMBER = "731671765313306249192251196744265747" +
                "42355349194934969835203127745063262395783180169848" +
                "01869478851843858615607891129494954595017379583319" +
                "52853208805511125406987471585238630507156932909632" +
                "95227443043557668966489504452445231617318564030987" +
                "11121722383113622298934233803081353362766142828064" +
                "44486645238749303589072962904915604407723907138105" +
                "15859307960866701724271218839987979087922749219016" +
                "99720888093776657273330010533678812202354218097512" +
                "54540594752243525849077116705560136048395864467063" +
                "24415722155397536978179778461740649551492908625693" +
                "21978468622482839722413756570560574902614079729686" +
                "52414535100474821663704844031998900088952434506585" +
                "41227588666881164271714799244429282308634656748139" +
                "19123162824586178664583591245665294765456828489128" +
                "83142607690042242190226710556263211111093705442175" +
                "06941658960408071984038509624554443629812309878799" +
                "27244284909188845801561660979191338754992005240636" +
                "89912560717606058861164671094050775410022569831552" +
                "00055935729725716362695618826704282524836008232575" +
                "30420752963450";

        Problem8 problem = new Problem8();
//        System.out.println(DIGIT_NUMBER.length());
//        System.out.println(problem.compute_product("12345"));
        System.out.print("The greatest product: ");
        System.out.println(problem.find_greatest_product(DIGIT_NUMBER));
    }
}
