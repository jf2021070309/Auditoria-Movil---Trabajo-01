package com.google.firebase.internal;

import com.google.android.gms.common.internal.Objects;
/* loaded from: classes2.dex */
public class InternalTokenResult {
    private String a;

    public InternalTokenResult(String str) {
        this.a = str;
    }

    public String getToken() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InternalTokenResult)) {
            return false;
        }
        return Objects.equal(this.a, ((InternalTokenResult) obj).a);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("token", this.a).toString();
    }
}
