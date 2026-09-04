package io.github.trinitiwowka.capacitor.installer.source;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public class CapacitorInstallerSource {

    @SuppressWarnings("deprecation")
    public String getInstallerPackageName(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        String installerPackageName;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            installerPackageName = packageManager.getInstallSourceInfo(packageName).getInstallingPackageName();
        } else {
            installerPackageName = packageManager.getInstallerPackageName(packageName);
        }

        return normalizeInstallerPackageName(installerPackageName);
    }

    static String normalizeInstallerPackageName(String installerPackageName) {
        return installerPackageName == null ? "" : installerPackageName;
    }
}
