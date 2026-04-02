package com.amazon.aps.iva.y30;
/* compiled from: SettingsAnalytics.kt */
/* loaded from: classes2.dex */
public interface h extends com.amazon.aps.iva.us.c {

    /* compiled from: SettingsAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static i a(com.amazon.aps.iva.ds.c cVar, int i) {
            f fVar;
            if ((i & 1) != 0) {
                cVar = com.amazon.aps.iva.ds.c.b;
            }
            g gVar = null;
            if ((i & 2) != 0) {
                fVar = f.h;
            } else {
                fVar = null;
            }
            if ((i & 4) != 0) {
                gVar = g.h;
            }
            com.amazon.aps.iva.yb0.j.f(cVar, "analytics");
            com.amazon.aps.iva.yb0.j.f(fVar, "getUserId");
            com.amazon.aps.iva.yb0.j.f(gVar, "createTimer");
            return new i(cVar, fVar, gVar);
        }
    }

    void G(com.amazon.aps.iva.wg.b bVar, com.amazon.aps.iva.wg.b bVar2);

    void I(boolean z);

    void J(String str);

    void i(boolean z);

    void j();

    void k(String str);

    void z(com.amazon.aps.iva.d40.a aVar, com.amazon.aps.iva.d40.a aVar2);
}
