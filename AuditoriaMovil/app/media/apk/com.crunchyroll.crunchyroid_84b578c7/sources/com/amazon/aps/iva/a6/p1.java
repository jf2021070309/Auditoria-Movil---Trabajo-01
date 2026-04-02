package com.amazon.aps.iva.a6;

import android.annotation.SuppressLint;
/* compiled from: RendererCapabilities.java */
/* loaded from: classes.dex */
public interface p1 {

    /* compiled from: RendererCapabilities.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    @SuppressLint({"WrongConstant"})
    static int i(int i) {
        return i & 384;
    }

    @SuppressLint({"WrongConstant"})
    static int q(int i) {
        return i & 64;
    }

    static int s(int i, int i2, int i3) {
        return i | i2 | i3 | 0 | 128;
    }

    int c(com.amazon.aps.iva.q5.v vVar) throws l;

    String getName();

    int v() throws l;
}
