package com.google.android.gms.auth.api.signin.internal;
/* loaded from: classes2.dex */
public class HashAccumulator {
    private static int zaah = 31;
    private int zaai = 1;

    public HashAccumulator addObject(Object obj) {
        this.zaai = (obj == null ? 0 : obj.hashCode()) + (this.zaai * zaah);
        return this;
    }

    public final HashAccumulator zaa(boolean z) {
        this.zaai = (z ? 1 : 0) + (this.zaai * zaah);
        return this;
    }

    public int hash() {
        return this.zaai;
    }
}
