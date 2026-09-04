import Foundation

@objc public class CapacitorInstallerSource: NSObject {
    @objc public func getSourceInfo() -> [String: String] {
        // iOS does not expose an Android-style installer package identifier.
        return ["bundleId": ""]
    }
}
