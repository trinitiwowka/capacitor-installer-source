import Foundation
import Capacitor

@objc(CapacitorInstallerSourcePlugin)
public class CapacitorInstallerSourcePlugin: CAPPlugin, CAPBridgedPlugin {
    public let identifier = "CapacitorInstallerSourcePlugin"
    public let jsName = "CapacitorInstallerSource"
    public let pluginMethods: [CAPPluginMethod] = [
        CAPPluginMethod(name: "getSourceInfo", returnType: CAPPluginReturnPromise)
    ]
    private let implementation = CapacitorInstallerSource()

    @objc func getSourceInfo(_ call: CAPPluginCall) {
        call.resolve(implementation.getSourceInfo())
    }
}
