package com.amazon.aps.iva.x50;

import com.amazon.aps.iva.mf0.a;
/* compiled from: CrashlyticsTree.kt */
/* loaded from: classes2.dex */
public final class d extends a.b {
    public final com.amazon.aps.iva.y50.a b = com.amazon.aps.iva.y50.b.a;

    @Override // com.amazon.aps.iva.mf0.a.b
    public final boolean g(int i) {
        if (i == 7) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.mf0.a.b
    public final void h(String str, int i, String str2, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(str2, "message");
        if (g(i)) {
            com.amazon.aps.iva.y50.a aVar = this.b;
            if (th != null) {
                aVar.b(th);
            }
            aVar.log(str2);
        }
    }
}
