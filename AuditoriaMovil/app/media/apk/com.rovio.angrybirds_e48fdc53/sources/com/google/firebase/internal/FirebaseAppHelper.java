package com.google.firebase.internal;

import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.GetTokenResult;
@Deprecated
/* loaded from: classes2.dex */
public class FirebaseAppHelper {
    public static Task<GetTokenResult> getToken(FirebaseApp firebaseApp, boolean z) {
        return firebaseApp.getToken(z);
    }

    public static void addIdTokenListener(FirebaseApp firebaseApp, FirebaseApp.IdTokenListener idTokenListener) {
        firebaseApp.addIdTokenListener(idTokenListener);
    }

    public static void removeIdTokenListener(FirebaseApp firebaseApp, FirebaseApp.IdTokenListener idTokenListener) {
        firebaseApp.removeIdTokenListener(idTokenListener);
    }

    public static String getUid(FirebaseApp firebaseApp) {
        return firebaseApp.getUid();
    }
}
