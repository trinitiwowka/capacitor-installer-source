# capacitor-installer-source

Get the Android package name of the app store or package installer that
installed your application.

On Android, `getSourceInfo()` returns identifiers such as
`com.android.vending` for Google Play. A sideloaded application or a platform
that does not expose an Android-style installer identifier returns an empty
string.

## Compatibility

| Plugin version | Capacitor version |
| --- | --- |
| `8.x` | `8.x` |
| `7.x` | `7.x` |
| `6.x` | `6.x` |

Version `7.0.0` is preserved in the Git tag and GitHub Release named `7.0.0`.

## Install

```bash
npm install capacitor-installer-source@^8
npx cap sync
```

## Usage

```typescript
import { CapacitorInstallerSource } from 'capacitor-installer-source';

const { bundleId } = await CapacitorInstallerSource.getSourceInfo();
```

## Platform behavior

| Platform | Result |
| --- | --- |
| Android | Installer package name, or `""` when unavailable |
| iOS | `""` because iOS does not expose an equivalent package identifier |
| Web | `""` because browsers do not expose an installer package identifier |

## API

<docgen-index>

* [`getSourceInfo()`](#getsourceinfo)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### getSourceInfo()

```typescript
getSourceInfo() => Promise<InstallerSourceInfo>
```

Returns the Android package name of the app store or package installer.
iOS and web resolve with an empty `bundleId` because those platforms do
not expose an equivalent package identifier.

**Returns:** <code>Promise&lt;<a href="#installersourceinfo">InstallerSourceInfo</a>&gt;</code>

--------------------


### Interfaces


#### InstallerSourceInfo

| Prop           | Type                | Description                                                                                                                                       |
| -------------- | ------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------- |
| **`bundleId`** | <code>string</code> | Android package name of the installer, for example `com.android.vending`. An empty string means that the installer is unavailable or unsupported. |

</docgen-api>
