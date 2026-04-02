package com.amazon.aps.iva.ba;

import com.amazon.aps.iva.ca.a;
import com.amazon.aps.iva.ha.r;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TrimPathContent.java */
/* loaded from: classes.dex */
public final class t implements b, a.InterfaceC0165a {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final r.a c;
    public final com.amazon.aps.iva.ca.d d;
    public final com.amazon.aps.iva.ca.d e;
    public final com.amazon.aps.iva.ca.d f;

    public t(com.amazon.aps.iva.ia.b bVar, com.amazon.aps.iva.ha.r rVar) {
        rVar.getClass();
        this.a = rVar.e;
        this.c = rVar.a;
        com.amazon.aps.iva.ca.a<Float, Float> d = rVar.b.d();
        this.d = (com.amazon.aps.iva.ca.d) d;
        com.amazon.aps.iva.ca.a<Float, Float> d2 = rVar.c.d();
        this.e = (com.amazon.aps.iva.ca.d) d2;
        com.amazon.aps.iva.ca.a<Float, Float> d3 = rVar.d.d();
        this.f = (com.amazon.aps.iva.ca.d) d3;
        bVar.g(d);
        bVar.g(d2);
        bVar.g(d3);
        d.a(this);
        d2.a(this);
        d3.a(this);
    }

    @Override // com.amazon.aps.iva.ca.a.InterfaceC0165a
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                ((a.InterfaceC0165a) arrayList.get(i)).a();
                i++;
            } else {
                return;
            }
        }
    }

    public final void d(a.InterfaceC0165a interfaceC0165a) {
        this.b.add(interfaceC0165a);
    }

    @Override // com.amazon.aps.iva.ba.b
    public final void c(List<b> list, List<b> list2) {
    }
}
