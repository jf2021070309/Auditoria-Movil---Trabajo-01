package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.ka0.y;
/* compiled from: Delegates.kt */
/* loaded from: classes4.dex */
public final class z extends com.amazon.aps.iva.bc0.a<y.a<?>> {
    public z() {
        super(null);
    }

    @Override // com.amazon.aps.iva.bc0.a
    public final void a(Object obj, com.amazon.aps.iva.fc0.l lVar, Object obj2) {
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        y.a aVar = (y.a) obj2;
        y.a aVar2 = (y.a) obj;
        if (aVar2 != null) {
            aVar2.a("watcher replaced");
        }
    }
}
