//package test;
//
///* This class decodes the messages received from a far satellite station.
//        * Please find below examples to implement the decoding algorithm along with the key sent.
//        *
//        * Input Message : PLLTTKEAOGBZ1
//        * Key : P:M#1:5#L:E#K:H#A:D#Z:Y
//        *
//        * Implementation :
//        *
//        * From the key P would be replaced with M, 1 with 5, L with E, K with H,A with D and finally Z with Y.
//        * After decoding the message would be MEETTHEDOGBY5
//        *
//        */
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class MessageDecoder {
//    public static void main(String[] args) {
//        String inputTxt=args[0];//Input text that needs to be decoded
//        String key=args[1];//The key which is to be used to decode the message
//        System.out.println(inputTxt + "   " + key);
//        String decodedMessage = MessageDecoder.decodeMessage(inputTxt, key);
//        System.out.println(decodedMessage);
//    }​
//
//    /**
//     * Decode the message here, split the keys and start replacing
//     the characters to decrypt the input message.
//     * Return the decoded message back to the caller.
//     * @paraminputTxt the input text to be decoded
//     * @paramkey the key to be used to decode the message
//     * @return decodedMessage in String format.
//     */
//    private static String decodeMessage(String inputTxt, String key) {​
////Build the logic here
//        String decodedMessage="";
//        Map<Character,Character> mChar = new HashMap<>();
//        String[] keyStr = key.split("#");
//        for(int i=0;i<keyStr.length;i++){
//            String str = keyStr[i];
//            Character mKey = str.charAt(0);
//            Character mValue = str.charAt(2);
//            mChar.put(mKey,mValue);
//        }
//        char[] chars = inputTxt.toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<chars.length;i++){
//            Character c = chars[i];
//            if(mChar.containsKey(c)){
//                c = mChar.get(c);
//            }
//            sb.append(c);
//        }
//        decodedMessage = sb.toString();
//        return decodedMessage;
//    }​
//
//}
