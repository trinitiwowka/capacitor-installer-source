export interface CapacitorInstallerSourcePlugin {
  getSourceInfo(): Promise<{ bundleId: string }>;
}
