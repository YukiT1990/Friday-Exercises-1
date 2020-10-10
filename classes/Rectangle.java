package week1.classes;

import java.lang.*;


public class Rectangle {
    private int width;
    private int height;
    private String color;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
        this.color = "Blue";
    }

    public Rectangle(int width, int height) {
        setWidth(width);
        setHeight(height);
        this.color = "Blue";
    }

    public Rectangle(int width, int height, String color) {
        setWidth(width);
        setHeight(height);
        setColor(color);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.length() > 2 && color.length() < 20 && isCapitalized(color) == true) {
            this.color = color;
        } else {
            this.color = "Blue";
        }

    }

    private static boolean isCapitalized(String s) {
        if (Character.isUpperCase(s.charAt(0))) {
            for (int i = 1; i < s.length(); i++) {
                if (!Character.isLowerCase(s.charAt(i))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(color.charAt(0));
            }
            System.out.println("");
        }
    }

}
