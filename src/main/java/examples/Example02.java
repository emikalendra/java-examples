package examples;

/**
 * Created by emikalendra on 5/19/14.
 */
public class Example02 {
    public static void main(String[] args) {
        Cat myCat = new Cat("reko", "white");
        myCat.sayHi();
        System.out.println("get name by getter: " + myCat.getName());

        System.out.println("returnString: " + myCat.returnString());
        System.out.println("give back: " + myCat.giveMeWhatIGiveYou("something in"));
    }
}

class Cat {
    private String name;
    private String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String returnString() {
        String newString = "something";
        return newString;
    }

    public String giveMeWhatIGiveYou(String input) {
        return input;
    }

    public void sayHi() {
        System.out.println("I am a Cat. Hi I am " + getName() + " and my color is " + color);
    }
}
