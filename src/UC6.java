public class UC6 {

    // Helper method to build pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", "*       *"),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }

    // Helper method to build pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
                String.join("", " ******  "),
                String.join("", " *     * "),
                String.join("", " *     * "),
                String.join("", " ******  "),
                String.join("", " *       "),
                String.join("", " *       "),
                String.join("", " *       ")
        };
    }

    // Helper method to build pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
                String.join("", "  *****  "),
                String.join("", " *     * "),
                String.join("", " *       "),
                String.join("", "  *****  "),
                String.join("", "        *"),
                String.join("", " *     * "),
                String.join("", "  *****  ")
        };
    }

    public static void main(String[] args) {

        // Array Initialization via Methods
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();   // Reuse for second O (DRY principle)
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        // Loop-Based Rendering
        for (int i = 0; i < 7; i++) {
            System.out.println(o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}