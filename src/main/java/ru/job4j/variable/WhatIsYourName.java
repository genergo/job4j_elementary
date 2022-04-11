package ru.job4j.variable;

import javax.swing.*;

    public class WhatIsYourName {

        public static void main(String[] args) {
            String name;
            name = JOptionPane.showInputDialog("Добрый день! Ваш вес?");
            JOptionPane.showMessageDialog(null, "Принято \n " + name + "!");
        }
}
