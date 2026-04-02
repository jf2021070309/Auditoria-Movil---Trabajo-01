package com.amazon.aps.iva.f8;

import com.amazon.aps.iva.f8.a0;
import com.amazon.aps.iva.f8.f0;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: MediaRouteProvider.java */
/* loaded from: classes.dex */
public final class c0 implements Runnable {
    public final /* synthetic */ a0.b.InterfaceC0243b b;
    public final /* synthetic */ y c;
    public final /* synthetic */ Collection d;
    public final /* synthetic */ a0.b e;

    public c0(a0.b bVar, a0.b.InterfaceC0243b interfaceC0243b, y yVar, ArrayList arrayList) {
        this.e = bVar;
        this.b = interfaceC0243b;
        this.c = yVar;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((f0.d.b) this.b).a(this.e, this.c, this.d);
    }
}
