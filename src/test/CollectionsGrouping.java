//package test;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * This class implements collection grouping of various books and its authors.
// * The implementation is defined below, the program is responsible for grouping the books and maintaining a bookshelf
// * based on authors, genre, and publishing year. The book data is supplied by a simple notepad that has the data in below format.
// *
// * Input Notepad:
// * Bookname|AuthorName|Genre|YearofPublish
// * SecretSeven|Enid Blyton|Children|2002
// * You Can Win|Shiv|Motivation|2009
// * .....
// *
// * The program needs to read this input and then generate the data into a probable collection.
// * Once the collection is formed, the user must be able to query any books easily by referring to below params.
// *
// * Search by book name - includes wild card.
// * Search by publish year
// * Search by Genre
// * Search by author name - includes wild card.
// */
//public class CollectionsGrouping {
//    //You can declare your static collection class objects here.
//    private static Map<List<String>,String> map = new HashMap<>();
//    private static List<String> booksList = new ArrayList<>();
//    /**
//     * Main method
//     * @param args
//     */
//    public static void main(String[] args) {
//        //Step 1 - read the notepad and parse the date
//        List<String> strList;
//        BufferedReader objReader = null;
//        try {
//            String strCurrentLine;
//            objReader = new BufferedReader(new FileReader("books.txt"));
//            while ((strCurrentLine = objReader.readLine()) != null) {
//                booksList.add(strCurrentLine);
//                System.out.println(strCurrentLine);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (objReader != null)
//                    objReader.close();
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//
//    private static List<String> keyList(String key){
//        List<String> keyList=null;
//         String[] keys = key.split("|");
//         for(int i=0;i<keys.length;i++){
//             keyList.add(keys[i]);
//         }
//         return keyList;
//    }
//    //Step 2 - build Collection
//    /**
//     * Call this method and start building your collection objects.
//     * Make sure you use optimial collection classes there by achieve all search functions listed below.
//     * Search by book name - includes wild card.
//     * Search by publish year
//     * Search by Genre
//     * Search by author name - includes wild card.
//     *     */
//    private static void groupCollections() {
//
//        // take a map key : ? , value : each line
//        // key: - List<String>
//        fillBookMap();
//
//
//    }
//
//    private static void fillBookMap(){
//        for(String str:booksList){
//            List<String> keys = keyList(str);
//            map.put(keys,str);
//        }
//    }
//
//    private static String searchByBookName(String bookKey){
//        for(List<String> keyList : map.keySet()){
//            for(String keyword:keyList){
//                if(keyword.contains(bookKey)){
//
//                }
//            }
//        }
//    }
//}
