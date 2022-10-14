public class Main {
    public static void main(String[] args) {
        String input = "ercanakcan";
        String output = convert(input, 2);
        System.out.println(output);
    }

    public static String convert(String s, int numRows) {

        String[] rows = new String[numRows];

//        for (String str : rows) {
//            str = "";
//        }

        boolean isVertical = true;

        for (int i = 0; i < s.length(); i++) {

            if (isVertical) {
                for (int j = 0; j < numRows; j++) {
                    if (i + 1 > s.length())
                        break;
                    rows[j] += Character.toString(s.charAt(i++));
                }
                isVertical = false;
                i--;

            } else if (!isVertical) {
                for (int k = numRows - 2; k > 0; k--) {
                    if (i + 1 > s.length())
                        break;
                    rows[k] += Character.toString(s.charAt(i++));
                }
                isVertical = true;
                i--;
            }
        }

        String line = "";



        for (int i = 0; i < numRows; i++) {
            line = line + rows[i];
        }

        return line;
    }

}