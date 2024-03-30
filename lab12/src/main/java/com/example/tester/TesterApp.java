package com.example.tester;

public class TesterApp
{
    public static void main(String[] args)
    {
        Tester tester = new Tester("Gave", "Lirison", 54, "C2", 555.55);
        Tester.printTesterInfo(tester);
    }
}
