package com.amazon.aps.iva.y0;
/* compiled from: SnapshotStateList.kt */
/* loaded from: classes.dex */
public final class v {
    public static final Object a = new Object();

    public static final void a(int i, int i2) {
        boolean z;
        if (i >= 0 && i < i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
    }
}
