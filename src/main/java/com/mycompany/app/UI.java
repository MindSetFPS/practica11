package com.mycompany.app;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class UI {
    JFrame window;
    JTabbedPane tabs;

    public UI() {
    }

    public void init() {
        window = new JFrame();
        window.setLayout(new BorderLayout());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tabs = new JTabbedPane();
        window.add(tabs);
        window.setSize(800, 600);
        window.setVisible(true);
    }

    public void practica11() {
        Practica11 practica11 = new Practica11();
        
        practica11.calculateColumnAB();
        practica11.calculateRowCD();

        JPanel panel = new JPanel();
        String[] columnNames = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "B" };

        JTable table = new JTable(practica11.matrix.asStringArray(), columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        panel.add(scrollPane);
        tabs.addTab("first tab", panel);
    }
    
    public void practica12(){
        Practica12 practica12 = new Practica12();
        practica12.run();
        
        String[] columnNames = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

        JPanel panel = new JPanel();
        JTable table = new JTable(practica12.matrix.asStringArray(), columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        
        panel.add(scrollPane);
        tabs.addTab( "Practica 12", scrollPane);

    }
}