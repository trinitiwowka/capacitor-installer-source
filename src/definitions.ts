export interface CapacitorInstallerSourcePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
