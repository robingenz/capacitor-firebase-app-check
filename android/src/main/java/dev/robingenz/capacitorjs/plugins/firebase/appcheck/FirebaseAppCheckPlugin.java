package dev.robingenz.capacitorjs.plugins.firebase.appcheck;

import com.getcapacitor.Plugin;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "FirebaseAppCheck")
public class FirebaseAppCheckPlugin extends Plugin {

    private FirebaseAppCheck implementation;

    public void load() {
        implementation = new FirebaseAppCheck();
    }
}
