package bs;

import java.math.BigDecimal;
import java.math.RoundingMode;

/** 
 * @author Dinesh Bajaj
*  Blog URL : http://dineshbajajktn.blogspot.in/
 */
 public final class NumberToWords {

        private static String numberToWords(int number) {
            //if this number is 75, then this function should return seventy five
            int intQuotient = (int) (number / 10);
            StringBuilder word = new StringBuilder();

            if (intQuotient > 0) {

                if (intQuotient == 1 && (number % 10) > 0) {
                    word.append(wordInTens(number % 10));
                    return word.toString();
                }
                word.append(wordInTenMultiples(intQuotient));
            }
            int remainder = number % 10;
            if (remainder > 0) {
                if (word.length() > 0) {
                    word.append(" ");
                }
                word.append(numberInWords(remainder));
            }

            return word.toString();

        }

        private static String wordInTenMultiples(int number) {
            String[] words = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
                "Seventy", "Eighty", "Ninety"};
            return words[number - 1];
        }

        private static String wordInTens(int number) {
            String words[] = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Ninteen"};
            return words[number - 1];

        }

        private static String numberInWords(int number) {
            String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine"};
            return words[number - 1];
        }

        public static String convertNumberToWords(BigDecimal number,
                boolean prefix, boolean suffix) {
            String numberInWords = convertNumberToWords(number);
            if (prefix) {
                if (number.compareTo(BigDecimal.ONE) == 0) {
                    numberInWords = "Rupee " + numberInWords;
                } else {
                    numberInWords = "Rupees " + numberInWords;
                }
            }

            if (suffix) {
                numberInWords += " Only";
            }
            return numberInWords;
        }

        public static String convertNumberToWords(BigDecimal parameter) {

            boolean negativeAmount = false;
            
            if (parameter.signum() == -1) {
                negativeAmount = true;
                parameter = parameter.abs();
            }
            
            StringBuilder word = new StringBuilder();
            
            String numberString = parameter.setScale(2,
                    RoundingMode.HALF_UP).toPlainString();

            double number = Double.parseDouble(numberString);

            int quotient = (int) (number / 10000000);
            if (quotient > 0) {
                word.append(convertNumberToWords(new BigDecimal(quotient))
                        + " Crore ");
            }

            number = number % 10000000;

            quotient = (int) (number / 100000);
            if (quotient > 0) {
                word.append(numberToWords(quotient) + " Lakh ");
            }
            number = number % 100000;

            quotient = (int) (number / 1000);
            if (quotient > 0) {
                word.append(numberToWords(quotient) + " Thousand ");
            }

            number = number % 1000;

            quotient = (int) (number / 100);
            if (quotient > 0) {
                word.append(numberToWords(quotient) + " Hundred ");
            }

            number = number % 100;
            if (number != 0) {
                word.append(numberToWords((int) number) + " ");
            }

            int decimal = 0;
            String val;
            if (number % 1 != 0) {
                String decimalInWords = Double.toString(number);
                int index = decimalInWords.indexOf(".");
                decimalInWords = decimalInWords.substring(index + 1);
                if (decimalInWords.length() > 2) {
                    val = decimalInWords.substring(0, 2);
                    decimal = Integer.parseInt(val);
                    if (Integer.parseInt(decimalInWords.substring(2, 3)) > 5) {
                        decimal++;
                    }
                } else {
                    decimal = Integer.parseInt(decimalInWords);
                }
                if (decimalInWords.length() == 1) {
                    decimal *= 10;
                }
                if (word.toString().trim().length() > 0) {
                    word.append(("& "));
                }
                
                word.append(numberToWords(decimal));
                if (decimal > 1) {
                    word.append(" Paise");
                } else {
                    word.append(" Paisa");
                }
            }

            if (word.toString().trim().length() == 0) {
                return "Zero";
            }
            
            String result = word.toString().trim();
            if (negativeAmount) {
                result = "Minus " + result;
            }
            
            return result;

        }
    } // end of class definition - NumberToWords
