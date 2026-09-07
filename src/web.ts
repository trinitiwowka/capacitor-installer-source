import { WebPlugin } from '@capacitor/core';

import type { CapacitorInstallerSourcePlugin, InstallerSourceInfo } from './definitions';

export class CapacitorInstallerSourceWeb extends WebPlugin implements CapacitorInstallerSourcePlugin {
  async getSourceInfo(): Promise<InstallerSourceInfo> {
    return { bundleId: '' };
  }
}
