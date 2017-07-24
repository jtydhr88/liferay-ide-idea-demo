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
public class LiferayModuleType extends ModuleType<LiferayModuleBuilder> {
    private static final String ID = "LIFERAY_MODULE_TYPE";

    public LiferayModuleType() {
        super(ID);
    }

    public static LiferayModuleType getInstance() {
        return (LiferayModuleType) ModuleTypeManager.getInstance().findByID(ID);
    }

    @NotNull
    @Override
    public  LiferayModuleBuilder createModuleBuilder() {
        return new LiferayModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return "Liferay Modules";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Liferay Modules";
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
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull LiferayModuleBuilder moduleBuilder, @NotNull ModulesProvider modulesProvider) {
        return super.createWizardSteps(wizardContext, moduleBuilder, modulesProvider);
    }
}