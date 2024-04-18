package homework_lesson_two;

public class TemaDeAcasa2e {
    public static void main(String[] args) {
        String phrase = "I love Java";

        // a) Print the letter at index 4
        char letterAtIndex4 = phrase.charAt(4);
        System.out.println("Letter at index 4: " + letterAtIndex4);

        // b) Print the index of the letter 'J'
        int indexOfJ = phrase.indexOf('J');
        System.out.println("Index of 'J': " + indexOfJ);

        // c) Add "and QA Automation" to the phrase
        phrase += " and QA Automation";
        System.out.println("Updated phrase: " + phrase);

        // d) Check if the phrase "I love Java" is of type String
        boolean isString = phrase instanceof String;
        System.out.println("Is 'phrase' a String? " + isString);
    }
}

