export interface FirebaseAppCheckPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
