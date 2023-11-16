import java.util.Scanner;
public class RecipeMaker {
    public static void main(String[] args) {
        int arrQty = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("arrQty >>");
        arrQty = input.nextInt();
        String[] ingredients = new String[arrQty];
        String val = "";
        ingredients = askIngredients(arrQty);
        for (int i = 0; i < arrQty; i ++) {
            val += " " + ingredients[i];
        }
        System.out.println("=======\n" + val);
        System.out.println(searchIngredients(ingredients));
    }

    public static String[] askIngredients (int qty) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[qty];
        System.out.println("Ingredients >> (Type 'none' if no ingredients)");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextLine();
            if (arr[i] != "none") {
                System.out.println("Success! " + arr[i]);
            } else {
                System.out.println("Finished! You have " + arr);
            }
        }
        return arr;
    }

    public static String searchIngredients (String[] arr) {
        Scanner input = new Scanner(System.in);
        String val = "";

        String[] recipe1 = {"eggs", "flour", "water"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < recipe1.length; j++) {
                if (arr[i] == recipe1[j]) {
                    System.out.println("arr contains " + recipe1[j]);
                    // val += arr[i];
                }
                val += arr[i];
            }
        }
        return val;
    }

    // public static String getRecipes (String[] arr) {
    //     arr = searchIngrdients();
    //     return arr;
    // }
}
