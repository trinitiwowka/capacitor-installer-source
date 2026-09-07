import XCTest
#if canImport(CapacitorInstallerSourcePlugin)
@testable import CapacitorInstallerSourcePlugin
#else
@testable import Plugin
#endif

class CapacitorInstallerSourceTests: XCTestCase {
    func testUnsupportedPlatformReturnsEmptyBundleId() {
        let implementation = CapacitorInstallerSource()
        let result = implementation.getSourceInfo()

        XCTAssertEqual("", result["bundleId"])
    }
}
