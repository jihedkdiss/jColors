package jcolors;

public class Main {

    public static void main(String[] args) {
        // Styles (normal, bold, underline, inverse)
        System.out.println(styles.normal("Welcome to jColors developed by Jihed Kdiss"));
        System.out.println(styles.bold("This is bold text"));
        System.out.println(styles.underline("This is underlined text"));
        System.out.println(styles.inverse("This is inversed text"));
        System.out.println();

        // Foreground Colors
        System.out.println(fgColors.black("This is black text") + " (black)");
        System.out.println(fgColors.red("This is red text"));
        System.out.println(fgColors.green("This is green text"));
        System.out.println(fgColors.yellow("This is yellow text"));
        System.out.println(fgColors.blue("This is blue text"));
        System.out.println(fgColors.magenta("This is magenta text"));
        System.out.println(fgColors.cyan("This is cyan text"));
        System.out.println(fgColors.white("This is white text"));
        System.out.println();

        // Background Colors
        System.out.println(bgColors.black("This is black text") + " (black)");
        System.out.println(bgColors.red("This is red text"));
        System.out.println(bgColors.green("This is green text"));
        System.out.println(bgColors.yellow("This is yellow text"));
        System.out.println(bgColors.blue("This is blue text"));
        System.out.println(bgColors.magenta("This is magenta text"));
        System.out.println(bgColors.cyan("This is cyan text"));
        System.out.println(bgColors.white("This is white text"));
        System.out.println();

        // Strong Foreground Colors
        System.out.println(fgColorsStrong.black("This is black text") + " (black)");
        System.out.println(fgColorsStrong.red("This is red text"));
        System.out.println(fgColorsStrong.green("This is green text"));
        System.out.println(fgColorsStrong.yellow("This is yellow text"));
        System.out.println(fgColorsStrong.blue("This is blue text"));
        System.out.println(fgColorsStrong.magenta("This is magenta text"));
        System.out.println(fgColorsStrong.cyan("This is cyan text"));
        System.out.println(fgColorsStrong.white("This is white text"));
        System.out.println();
    }
}
