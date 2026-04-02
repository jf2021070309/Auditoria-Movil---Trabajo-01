package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import java.security.KeyPair;
/* loaded from: classes2.dex */
final class ar {
    private final KeyPair a;
    private final long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ar(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final KeyPair a() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ar) {
            ar arVar = (ar) obj;
            return this.b == arVar.b && this.a.getPublic().equals(arVar.a.getPublic()) && this.a.getPrivate().equals(arVar.a.getPrivate());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() {
        return Base64.encodeToString(this.a.getPublic().getEncoded(), 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        return Base64.encodeToString(this.a.getPrivate().getEncoded(), 11);
    }
}
