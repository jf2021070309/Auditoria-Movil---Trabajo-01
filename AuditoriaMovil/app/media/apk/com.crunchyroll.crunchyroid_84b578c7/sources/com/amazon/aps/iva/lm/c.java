package com.amazon.aps.iva.lm;
/* compiled from: ManageProfileController.kt */
/* loaded from: classes2.dex */
public interface c extends com.amazon.aps.iva.ri.a<f, g> {

    /* compiled from: ManageProfileController.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static b a(com.amazon.aps.iva.ui.c cVar) {
            com.amazon.aps.iva.fm.g gVar = com.amazon.aps.iva.fm.g.f;
            if (gVar != null) {
                com.amazon.aps.iva.yb0.j.f(cVar, "navigator");
                com.amazon.aps.iva.zl.b bVar = gVar.d;
                com.amazon.aps.iva.yb0.j.f(bVar, "profilesGateway");
                return new b(cVar, bVar);
            }
            com.amazon.aps.iva.yb0.j.m("feature");
            throw null;
        }
    }
}
