package com.amazon.aps.iva.f5;

import android.os.Parcelable;
import android.util.SparseArray;
/* compiled from: ViewsStateBundle.java */
/* loaded from: classes.dex */
public final class a0 {
    public int a = 0;
    public int b = 100;
    public com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> c;

    public final void a() {
        int i = this.a;
        if (i == 2) {
            if (this.b > 0) {
                com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar = this.c;
                if (gVar == null || gVar.maxSize() != this.b) {
                    this.c = new com.amazon.aps.iva.x.g<>(this.b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException();
        } else if (i != 3 && i != 1) {
            this.c = null;
        } else {
            com.amazon.aps.iva.x.g<String, SparseArray<Parcelable>> gVar2 = this.c;
            if (gVar2 == null || gVar2.maxSize() != Integer.MAX_VALUE) {
                this.c = new com.amazon.aps.iva.x.g<>(Integer.MAX_VALUE);
            }
        }
    }
}
