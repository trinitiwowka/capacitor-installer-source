package io.github.trinitiwowka.capacitor.installer.source;

import android.content.pm.PackageManager;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorInstallerSource")
public class CapacitorInstallerSourcePlugin extends Plugin {

    private final CapacitorInstallerSource implementation = new CapacitorInstallerSource();

    @PluginMethod
    public void getSourceInfo(PluginCall call) {
        JSObject result = new JSObject();

        try {
            result.put("bundleId", implementation.getInstallerPackageName(getContext()));
            call.resolve(result);
        } catch (PackageManager.NameNotFoundException e) {
            call.reject("Unable to determine the installer source.", "INSTALLER_SOURCE_UNAVAILABLE", e);
        }
    }
}
