import { WebPlugin } from '@capacitor/core';

import type { FirebaseAppCheckPlugin } from './definitions';

export class FirebaseAppCheckWeb extends WebPlugin implements FirebaseAppCheckPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
