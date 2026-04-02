package com.google.firebase.iid;
/* loaded from: classes2.dex */
public final class zzal extends Exception {
    private final int a;

    public zzal(int i, String str) {
        super(str);
        this.a = i;
    }

    public final int getErrorCode() {
        return this.a;
    }
}
