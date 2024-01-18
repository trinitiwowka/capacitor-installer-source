package io.github.trinitiwowka.capacitor.installer.source;

import com.getcapacitor.JSObject;
import android.os.Build; // Импортируйте Build из стандартных Android классов
import android.os.Bundle;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

@CapacitorPlugin(name = "CapacitorInstallerSource")
public class CapacitorInstallerSourcePlugin extends Plugin {

    private CapacitorInstallerSource implementation = new CapacitorInstallerSource();

    @PluginMethod
    public void getSourceInfo(PluginCall call) {
        PackageManager packageManager = getContext().getPackageManager();
        ApplicationInfo appInfo;
        String installerBundleId;
        JSObject result = new JSObject();

        try {
            // Используйте com.getcapacitor.Build
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                // Ваша логика для версии Android R и выше
                installerBundleId = packageManager.getInstallSourceInfo(getContext().getPackageName()).getInstallingPackageName();

            } else {
                // Ваша логика для версии Android ниже R
                installerBundleId = packageManager.getInstallerPackageName(getContext().getPackageName());
            }

            if (installerBundleId == null) {
              installerBundleId = "";
            }

            result.put("bundleId", installerBundleId);
            call.success(result);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            call.reject("An unexpected error occurred: " + e.getMessage());
        }
    }
}
