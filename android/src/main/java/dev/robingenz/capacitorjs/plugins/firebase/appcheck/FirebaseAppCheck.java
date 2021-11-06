package dev.robingenz.capacitorjs.plugins.firebase.appcheck;

import com.google.firebase.appcheck.safetynet.SafetyNetAppCheckProviderFactory;

public class FirebaseAppCheck {

    private final com.google.firebase.appcheck.FirebaseAppCheck appCheckInstance;

    FirebaseAppCheck() {
        appCheckInstance = com.google.firebase.appcheck.FirebaseAppCheck.getInstance();
        appCheckInstance.installAppCheckProviderFactory(SafetyNetAppCheckProviderFactory.getInstance());
    }
}
