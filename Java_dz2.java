// import java.io.BufferedReader;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;

// /**
//  * В файле содержится строка с исходными данными в такой форме:
//  * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//  * Требуется на её основе построить и вывести на экран новую строку, в форме SQL
//  * запроса:
//  * SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city
//  * = "Moscow";
//  */

// public class Java_dz2 {

//   public static String reader() {
//     StringBuilder sb = new StringBuilder();
//     try (BufferedReader reader = Files.newBufferedReader(Paths.get("Txt1.txt"))) {
//       String line;
//       while ((line = reader.readLine()) != null) {
//         sb.append(line).append(System.lineSeparator());
//       }
//     } catch (IOException e) {
//       e.printStackTrace();
//     }
//     String str = sb.toString();
//     return str;

//   }

//   public static void split(String str) {
//     String str2 = str.replace("{", "")
//         .replace("}", "")
//         .replace("\"", "");
//     String[] newStr = str2.split(", ");

//     Map<String, String> dictionary = new HashMap<String, String>();
//     for (String item : newStr) {
//       String[] strnew = item.split(":");
//       System.out.println(Arrays.toString(strnew));
//       for (int i = 0; i < newStr.length; i++) {
//         dictionary.put(strnew[0], strnew[1]);

//       }
//     }
//     System.out.println(dictionary.entrySet());
//     StringBuilder WHERE = new StringBuilder();
//     Set<Map.Entry<String, String>> pair = dictionary.entrySet();
//     List<Map.Entry<String, String>> list = new ArrayList<>(pair);
//     for (int i = 0; i < list.size(); i++) {
//       if (!list.get(i).getValue().equals("null")) {
//         WHERE.append(list.get(i).getKey() + " = " + list.get(i).getValue() + " and ");
        
//       }
//     }
//     System.out.println(WHERE);

//   }

//   public static void main(String[] args) {

//     split(reader());

//   }
// }


// import java.io.IOException;
// import java.util.Arrays;
// import java.util.Random;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// public class Java_dz2 {

//     public static int[] randomArr() {
//         Random rand = new Random();
//         int arr[] = new int[10];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = rand.nextInt(100);
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("");
//         return arr;
//     }

//     public static int[] babblSort(int arr[]) throws IOException {
//         Logger loger = Logger.getLogger(Java_dz2.class.getName());
//         FileHandler fHandler = new FileHandler("Task2_2.txt");
//         SimpleFormatter sFormatter = new SimpleFormatter();
//         fHandler.setFormatter(sFormatter);
//         loger.addHandler(fHandler);

//         int temp;
//         for (int i = arr.length - 1; i >= 0; i--) {
//             for (int j = 0; j < arr.length - 1; j++) {
//                 if (arr[j] < arr[j + 1]) {
//                     temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }

//             loger.info(Arrays.toString(arr));
//         }
//         return arr;

//     }

//     public static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) throws IOException {

//         print(babblSort(randomArr()));
//     }

// }



// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;

// public class Java_dz2 {
//     public static String getLineOffile(String fileName) {
//         String strOffile = null;
//         try {
//             File file = new File(fileName);
//             FileReader fr = new FileReader(file);
//             BufferedReader reader = new BufferedReader(fr);
//             strOffile = reader.readLine();

//             reader.close();
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         return strOffile;
//     }

//     private static String[][] jsnparsetoarray(String jsnstr) {
//         String line = jsnstr.substring(1, jsnstr.length() - 1);

//         String[] jsnarray = line.split(", ");

//         String[][] jsnarrayofBase = new String[jsnarray.length][3];
//         for (int i = 0; i < jsnarray.length; i++) {
//             line = jsnarray[i].substring(1, jsnarray[i].length() - 1);
//             for (int j = 0; j < 3; j++) {
//                 String[] minJsnarray = line.split(",");
//                 String[] microJsnarray = minJsnarray[j].split(":");
//                 jsnarrayofBase[i][j] = microJsnarray[1].substring(1, microJsnarray[1].length() - 1);

//             }
//         }
//         return jsnarrayofBase;
//     }

//     private static String[] gluing_strings(String[][] arraystr) {
//         String[] gluing_str = new String[arraystr.length];
//         StringBuilder Newstr = new StringBuilder();
//         for (int i = 0; i < arraystr.length; i++) {
//             Newstr.append("Студент ");
//             Newstr.append(arraystr[i][0]);
//             Newstr.append(" получил  ");
//             Newstr.append(arraystr[i][1]);
//             Newstr.append(" по предмету ");
//             Newstr.append(arraystr[i][2]);
//             gluing_str[i] = Newstr.toString();
//             Newstr.delete(0, Newstr.length());
//         }
//         return gluing_str;
//     }

//     public static void main(String[] args) {
//         String strjsn_offile = getLineOffile("text2.jsn");
//         System.out.println(strjsn_offile);
//         String[] array = gluing_strings(jsnparsetoarray(strjsn_offile));
//         for (int i = 0; i < array.length; i++)
//             System.out.println(array[i]);
//     }
// }
