package com.amazon.aps.iva.n0;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: RippleContainer.android.kt */
/* loaded from: classes.dex */
public final class n {
    public final Serializable a;
    public final Map b;

    public n(int i) {
        if (i != 1) {
            this.a = new LinkedHashMap();
            this.b = new LinkedHashMap();
            return;
        }
        this.a = new AtomicReference();
        this.b = new com.amazon.aps.iva.x.a();
    }

    public final void a(b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "indicationInstance");
        Map map = (Map) this.a;
        o oVar = (o) map.get(bVar);
        if (oVar != null) {
            b bVar2 = (b) this.b.remove(oVar);
        }
        map.remove(bVar);
    }
}
