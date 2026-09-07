import assert from 'node:assert/strict';
import test from 'node:test';

import { CapacitorInstallerSourceWeb } from '../dist/esm/web.js';

test('web returns an empty installer package', async () => {
  const result = await new CapacitorInstallerSourceWeb().getSourceInfo();

  assert.deepEqual(result, { bundleId: '' });
});
