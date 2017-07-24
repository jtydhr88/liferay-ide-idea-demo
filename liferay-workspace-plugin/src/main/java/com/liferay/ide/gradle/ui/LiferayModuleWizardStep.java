package com.liferay.ide.gradle.ui;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by wswdk on 2017/7/23.
 */
public class LiferayModuleWizardStep extends ModuleWizardStep {
    @Override
    public JComponent getComponent() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1,2));

        JLabel userLabel = new JLabel("Type:");

        JComboBox types = new JComboBox();

       types.addItem("type1");
        types.addItem("type2");
        types.addItem("type3");

        mainPanel.add(userLabel);
        mainPanel.add(types);

        return mainPanel;
    }

    @Override
    public void updateDataModel() {
        //todo update model according to UI
    }

}
