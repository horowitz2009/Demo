package com.csc.myworkday;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

  public MainFrame() throws HeadlessException {
    setBounds(100, 100, 600, 450);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

  public static void main(String[] args) {
    MainFrame mainFrame = new MainFrame();
    mainFrame.setTitle("My Workday");
    mainFrame.setVisible(true);
  }

}
