public class StringConcatenationPerformace {
    public static void main(String[] args) {
        int numOperations = 1_000_000;
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < numOperations; i++) {
            str += "a";
        }
        long stringTime = System.nanoTime() - startTime;
        System.out.println("String Concatenation Time: " + stringTime / 1_000_000.0 + " ms");
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numOperations; i++) {
            sb.append("a");
        }
        long stringBuilderTime = System.nanoTime() - startTime;
        System.out.println("StringBuilder Concatenation Time: " + stringBuilderTime / 1_000_000.0 + " ms");
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < numOperations; i++) {
            sbf.append("a");
        }
        long stringBufferTime = System.nanoTime() - startTime;
        System.out.println("StringBuffer Concatenation Time: " + stringBufferTime / 1_000_000.0 + " ms");
    }
}
