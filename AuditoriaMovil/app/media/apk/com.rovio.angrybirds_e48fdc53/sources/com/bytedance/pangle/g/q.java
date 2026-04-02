package com.bytedance.pangle.g;
/* loaded from: classes.dex */
public final class q extends Exception {
    public final int a;

    public q(int i, String str) {
        super(str);
        this.a = i;
    }

    public q(int i, String str, Throwable th) {
        super(str, th);
        this.a = i;
    }
}
