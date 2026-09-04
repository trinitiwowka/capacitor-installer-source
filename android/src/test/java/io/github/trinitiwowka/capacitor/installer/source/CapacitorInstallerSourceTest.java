package io.github.trinitiwowka.capacitor.installer.source;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CapacitorInstallerSourceTest {

    @Test
    public void normalizeInstallerPackageNameKeepsKnownInstaller() {
        assertEquals("com.android.vending", CapacitorInstallerSource.normalizeInstallerPackageName("com.android.vending"));
    }

    @Test
    public void normalizeInstallerPackageNameReturnsEmptyStringForUnknownInstaller() {
        assertEquals("", CapacitorInstallerSource.normalizeInstallerPackageName(null));
    }
}
