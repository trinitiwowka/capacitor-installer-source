export interface InstallerSourceInfo {
  /**
   * Android package name of the installer, for example `com.android.vending`.
   * An empty string means that the installer is unavailable or unsupported.
   */
  bundleId: string;
}

export interface CapacitorInstallerSourcePlugin {
  /**
   * Returns the Android package name of the app store or package installer.
   * iOS and web resolve with an empty `bundleId` because those platforms do
   * not expose an equivalent package identifier.
   */
  getSourceInfo(): Promise<InstallerSourceInfo>;
}
