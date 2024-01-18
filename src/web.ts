import { WebPlugin } from '@capacitor/core';

import type { CapacitorInstallerSourcePlugin } from './definitions';

export class CapacitorInstallerSourceWeb
  extends WebPlugin
  implements CapacitorInstallerSourcePlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
  async getSourceInfo(): Promise<any> {
      throw 'not implemented for web'
  }
}
