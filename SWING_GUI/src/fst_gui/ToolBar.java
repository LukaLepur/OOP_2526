package fst_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel{

    private JButton resetBtn;
    private JButton saveBtn;
    private JButton loadBtn;

    public ToolBar() {
        initComps();
        layoutComps();
        activate();
    }

    private void initComps() {
        resetBtn=new JButton("Reset");
        saveBtn=new JButton("Save");
        loadBtn=new JButton("Load");
        resetBtn.addActionCommand("RESET");
        resetBtn.addACtionCommand("LOAD");
        saveBtn.addActionCOmmand("SAVE");
    }

    private void layoutComps() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(resetBtn);
        add(saveBtn);
        add(loadBtn);
    }

    private void activate() {
        resetBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toolBarListener!=null){
                    toolBarListener.toolBarEventOccured(resetBtn.getActionCommand());
                }
            }
        });
    }



}
