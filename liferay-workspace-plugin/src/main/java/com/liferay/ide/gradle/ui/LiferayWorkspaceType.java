package com.liferay.ide.gradle.ui;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by wswdk on 2017/7/23.
 */
public class LiferayWorkspaceType extends ModuleType<LiferayWorkspaceBuilder> {
    private static final String ID = "LIFERAY_WORKSPACE_TYPE";

    public LiferayWorkspaceType() {
        super(ID);
    }

    public static LiferayWorkspaceType getInstance() {
        return (LiferayWorkspaceType) ModuleTypeManager.getInstance().findByID(ID);
    }

    @NotNull
    @Override
    public LiferayWorkspaceBuilder createModuleBuilder() {
        return new LiferayWorkspaceBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return "Liferay Workspace";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Liferay Workspace";
    }

    @Override
    public Icon getBigIcon() {
        return IconLoader.getIcon("/icons/liferay.png");
    }

    @Override
    public Icon getNodeIcon(@Deprecated boolean b) {
        return IconLoader.getIcon("/icons/liferay.png");
    }

    @NotNull
    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull LiferayWorkspaceBuilder moduleBuilder, @NotNull ModulesProvider modulesProvider) {
        return super.createWizardSteps(wizardContext, moduleBuilder, modulesProvider);
    }
}