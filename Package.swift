// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "CapacitorInstallerSource",
    platforms: [.iOS(.v15)],
    products: [
        .library(
            name: "CapacitorInstallerSource",
            targets: ["CapacitorInstallerSourcePlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "8.0.0")
    ],
    targets: [
        .target(
            name: "CapacitorInstallerSourcePlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/CapacitorInstallerSourcePlugin",
            exclude: ["Info.plist"]),
        .testTarget(
            name: "CapacitorInstallerSourcePluginTests",
            dependencies: ["CapacitorInstallerSourcePlugin"],
            path: "ios/Tests/CapacitorInstallerSourcePluginTests",
            exclude: ["Info.plist"])
    ]
)
