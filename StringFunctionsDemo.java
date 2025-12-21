public class StringFunctionsDemo {
    public static void main(String[] args) {

        String s = "Hello Java";
        String s2 = "  Java Programming  ";

        System.out.println("Original String: " + s);

        // 1. length()
        System.out.println("Length: " + s.length());

        // 2. charAt()
        System.out.println("charAt(1): " + s.charAt(1));

        // 3. substring()
        System.out.println("Substring(0, 5): " + s.substring(0, 5));

        // 4. toUpperCase()
        System.out.println("Uppercase: " + s.toUpperCase());

        // 5. toLowerCase()
        System.out.println("Lowercase: " + s.toLowerCase());

        // 6. contains()
        System.out.println("Contains 'Java': " + s.contains("Java"));

        // 7. equals() & equalsIgnoreCase()
        System.out.println("Equals 'Hello Java': " + s.equals("Hello Java"));
        System.out.println("EqualsIgnoreCase 'hello java': " + s.equalsIgnoreCase("hello java"));

        // 8. compareTo()
        System.out.println("CompareTo: " + s.compareTo("Hello Java"));

        // 9. indexOf()
        System.out.println("Index of 'J': " + s.indexOf("J"));

        // 10. lastIndexOf()
        System.out.println("Last Index of 'a': " + s.lastIndexOf("a"));

        // 11. replace()
        System.out.println("Replace 'Java' with 'World': " + s.replace("Java", "World"));

        // 12. trim()
        System.out.println("Trim: '" + s2.trim() + "'");

        // 13. startsWith() & endsWith()
        System.out.println("StartsWith 'Hello': " + s.startsWith("Hello"));
        System.out.println("EndsWith 'Java': " + s.endsWith("Java"));

        // 14. split()
        String[] parts = s.split(" ");
        System.out.println("Split words:");
        for (String part : parts) {
            System.out.println(part);
        }

        // 15. toCharArray()
        System.out.println("Characters:");
        for (char c : s.toCharArray()) {
            System.out.print(c + " ");
        }

        // 16. isEmpty()
        String emptyString = "";
        System.out.println("\nIs empty: " + emptyString.isEmpty());

        // 17. concat()
        System.out.println("Concat: " + s.concat(" Language"));

        // 18. replaceAll() (regex)
        System.out.println("Remove vowels: " + s.replaceAll("[aeiouAEIOU]", ""));
    }
}
