package fst_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextArea textArea;
    private JButton mainBtn;
    private JScrollPane txtAreaScroll;


    public MainFrame() {
        super("Simple Gui app!");
        initFrame();
        initComps();
        layoutComps();
        activateFrame();
    }

    private void initFrame(){
        setSize(650,500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComps() {
        textArea = new JTextArea();
        mainBtn = new JButton("Submit");
        txtAreaScroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }

    private void layoutComps() {

        setLayout(new BorderLayout());
        add(txtAreaScroll, BorderLayout.CENTER);
        add(mainBtn, BorderLayout.SOUTH);
    }

    private void activateFrame() {
        mainBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String line=ae.toString()+ae.paramString()+Integer.toHexString(ae.hashCode())+"\n";
            }
        });

        toolBar.setToolBarListener(new ToolBarListener() {
            @Override
            public void toolBarEventOccured(String eventCommand) {
                if (eventCommand.equals("RESET")){
                    resetTxtArea();
                }
            }
        })
    }

    private void setText2TextAreas(String txt){
        textArea.append(txt);
    }

    private void resetTxtArea(){
        textArea.setText("");
    }

}
