package com.amazon.aps.iva.z5;
/* compiled from: Buffer.java */
/* loaded from: classes.dex */
public abstract class a {
    public int b;

    public final void h(int i) {
        this.b = i | this.b;
    }

    public final boolean i(int i) {
        if ((this.b & i) == i) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return i(Integer.MIN_VALUE);
    }
}
