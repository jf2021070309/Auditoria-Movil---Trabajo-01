package com.amazon.aps.iva.f8;

import com.amazon.aps.iva.f8.a0;
import com.amazon.aps.iva.f8.f0;
import java.util.Collection;
/* compiled from: MediaRouteProvider.java */
/* loaded from: classes.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ a0.b.InterfaceC0243b b;
    public final /* synthetic */ y c;
    public final /* synthetic */ Collection d;
    public final /* synthetic */ a0.b e;

    public b0(a0.b bVar, f0.d.b bVar2, y yVar, Collection collection) {
        this.e = bVar;
        this.b = bVar2;
        this.c = yVar;
        this.d = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((f0.d.b) this.b).a(this.e, this.c, this.d);
    }
}
