package com.amazon.aps.iva.f8;

import android.util.SparseArray;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.f8.t0;
/* compiled from: RegisteredMediaRouteProvider.java */
/* loaded from: classes.dex */
public final class s0 implements Runnable {
    public final /* synthetic */ t0.a b;

    public s0(t0.a aVar) {
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray<f0.c> sparseArray = this.b.i;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).a(null);
        }
        sparseArray.clear();
    }
}
