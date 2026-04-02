package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
/* loaded from: classes2.dex */
public class FirebaseAuthException extends FirebaseException {
    private final String a;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        this.a = Preconditions.checkNotEmpty(str);
    }

    public String getErrorCode() {
        return this.a;
    }
}
