package String;

public class StringClass {
    public static void main(String[] args) {
        String name="Sivaji_kadapala";
        String name1="Karna";
        if (name.equals(name1)) {
            System.out.println("Both are same");
        }else {
            String str3=name.concat(name1);
            System.out.println(str3);
            System.out.println();
            System.out.println("Both are not same");
            System.out.println(name.charAt(0));
            System.out.println(name.chars());
            System.out.println(name.codePointAt(1));
            System.out.println(name.codePointBefore(1));
            System.out.println(name.compareTo(name1));
            System.out.println(name.compareToIgnoreCase(name1));
            System.out.println(name.concat(name1));
            System.out.println(name.contains("l"));
            System.out.println(name.endsWith("la"));
            System.out.println(String.format("Sivaji %s","human"));
            System.out.println(name.indexOf("i"));
            System.out.println(name.intern());
            System.out.println(name.isBlank());
            System.out.println(name.isEmpty());
            System.out.println(name.lastIndexOf("a"));
            System.out.println(name.length());
            System.out.println(name.replace("i","a"));
            String name2="   Thiru Acadamey";
            String[] arr=name2.split(" ");
            System.out.println(arr[1]);
//            System.out.println(arr[2]);
            System.out.println(name2.substring(7));
            System.out.println(name2.substring(1,7));
            char[] ch=name2.toCharArray();
            System.out.println(ch[2]);
            Integer number=2;
            System.out.println(number.toString());
            System.out.println(name2.toLowerCase());
            System.out.println(name2.toUpperCase());
            System.out.println(name2.trim());
            System.out.println(String.valueOf(number));
        }
    }
}
