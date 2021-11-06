<p align="center"><br><img src="https://user-images.githubusercontent.com/236501/85893648-1c92e880-b7a8-11ea-926d-95355b8175c7.png" width="128" height="128" /></p>
<h3 align="center">Firebase App Check</h3>
<p align="center"><strong><code>@robingenz/capacitor-firebase-app-check</code></strong></p>
<p align="center">
  Capacitor plugin for Firebase App Check. 
</p>

<p align="center">
  <img src="https://img.shields.io/maintenance/yes/2021?style=flat-square" />
  <a href="https://github.com/robingenz/capacitor-firebase-app-check/actions?query=workflow%3A%22CI%22"><img src="https://img.shields.io/github/workflow/status/robingenz/capacitor-firebase-app-check/CI/main?style=flat-square" /></a>
  <a href="https://www.npmjs.com/package/@robingenz/capacitor-firebase-app-check"><img src="https://img.shields.io/npm/l/@robingenz/capacitor-firebase-app-check?style=flat-square" /></a>
<br>
  <a href="https://www.npmjs.com/package/@robingenz/capacitor-firebase-app-check"><img src="https://img.shields.io/npm/dw/@robingenz/capacitor-firebase-app-check?style=flat-square" /></a>
  <a href="https://www.npmjs.com/package/@robingenz/capacitor-firebase-app-check"><img src="https://img.shields.io/npm/v/@robingenz/capacitor-firebase-app-check?style=flat-square" /></a>
<!-- ALL-CONTRIBUTORS-BADGE:START - Do not remove or modify this section -->
<a href="#contributors-"><img src="https://img.shields.io/badge/all%20contributors-1-orange?style=flat-square" /></a>
<!-- ALL-CONTRIBUTORS-BADGE:END -->
</p>

> 🚧 This project is currently under active development and has not yet been sufficiently tested. It might be changed in backward-incompatible ways. Only Android is currently supported.

## Maintainers

| Maintainer | GitHub                                    | Social                                        |
| ---------- | ----------------------------------------- | --------------------------------------------- |
| Robin Genz | [robingenz](https://github.com/robingenz) | [@robin_genz](https://twitter.com/robin_genz) |

## Installation

```bash
npm install @robingenz/capacitor-firebase-app-check
npx cap sync
```

Add Firebase to your project if you haven't already ([Android](https://firebase.google.com/docs/android/setup)).

### Android

See [Set up your Firebase project](https://firebase.google.com/docs/app-check/android/safetynet-provider#project-setup) and follow the instructions to set up your Firebase project correctly.

#### Variables

This plugin will use the following project variables (defined in your app’s `variables.gradle` file):
- `$firebaseAppcheckSafetynetVersion` version of `com.google.firebase:firebase-appcheck-safetynet` (default: `16.0.0-beta03`)

## Configuration

No configuration required for this plugin.

## Usage

The plugin only needs to be installed.

## API

<docgen-index>



</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->



</docgen-api>

## Changelog

See [CHANGELOG.md](https://github.com/robingenz/capacitor-firebase-app-check/blob/master/CHANGELOG.md).

## License

See [LICENSE](https://github.com/robingenz/capacitor-firebase-app-check/blob/master/LICENSE).
