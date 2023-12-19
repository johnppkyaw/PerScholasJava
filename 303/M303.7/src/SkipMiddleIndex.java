public class SkipMiddleIndex {
    public static void main(String[] args) {
        String[] pets = {"dog", "cat", "bird", "fish", "hamster"};
        int middleIndex = pets.length / 2;
        for (int i = 0; i < pets.length; i++) {
            if(i == middleIndex) continue;
            System.out.println("i: " + i + " element: " + pets[i]);
        }

    }
}
