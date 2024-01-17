import { registerPlugin } from '@capacitor/core';

import type { CapacitorInstallerSourcePlugin } from './definitions';

const CapacitorInstallerSource = registerPlugin<CapacitorInstallerSourcePlugin>(
  'CapacitorInstallerSource',
  {
    web: () => import('./web').then(m => new m.CapacitorInstallerSourceWeb()),
  },
);

export * from './definitions';
export { CapacitorInstallerSource };
