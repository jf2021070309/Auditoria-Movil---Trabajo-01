package com.amazon.aps.iva.n4;

import android.view.View;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;

    public b0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.b = i;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i = 0; i < this.b; i++) {
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            g0.i.v((View) this.c.get(i), (String) this.d.get(i));
            g0.i.v((View) this.e.get(i), (String) this.f.get(i));
        }
    }
}
