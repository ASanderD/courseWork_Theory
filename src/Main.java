public class Main {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму!!!";
        String str2 = str1.substring(0, str1.length() / 2);
        String str3 = str1.substring(str1.length() / 2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
    }
}

