public class sortstr {
    public static void main(String[] args) {
        String ar[] = { "1jhdgwey", "4dehghwu", "3wuhdqu", "2gvx bc","gsdkahf","azqplz" };
        int n = ar.length;
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (ar[j].compareTo(ar[j + 1]) > 0) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
    }
}
