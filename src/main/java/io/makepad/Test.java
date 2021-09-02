package io.makepad;

public class Test {
    public static void main(String[] args) throws Exception {
        Generator g = new Generator("/Users/idilsaglam/Documents/Makepad/SSgenerator/");
        g.takeSS("https://www.mozilla.org/fr/about/","//*[@id='c-navigation-items']","test242.png");
    }
}
