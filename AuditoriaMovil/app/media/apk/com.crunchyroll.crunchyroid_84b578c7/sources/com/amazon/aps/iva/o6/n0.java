package com.amazon.aps.iva.o6;

import android.util.SparseArray;
/* compiled from: SpannedData.java */
/* loaded from: classes.dex */
public final class n0<V> {
    public final com.amazon.aps.iva.t5.g<V> c;
    public final SparseArray<V> b = new SparseArray<>();
    public int a = -1;

    public n0(com.amazon.aps.iva.q5.z zVar) {
        this.c = zVar;
    }

    public final V a(int i) {
        SparseArray<V> sparseArray;
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            sparseArray = this.b;
            if (i2 <= 0 || i >= sparseArray.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.a + 1)) {
            this.a++;
        }
        return sparseArray.valueAt(this.a);
    }
}
