package com.amazon.aps.iva.ko;

import com.amazon.aps.iva.co.j;
import com.amazon.aps.iva.ks.l;
import java.util.List;
/* compiled from: UserMigrationWelcomePresenter.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.co.j, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.co.j jVar) {
        com.amazon.aps.iva.co.j jVar2 = jVar;
        com.amazon.aps.iva.yb0.j.f(jVar2, "userType");
        o oVar = this.h;
        oVar.getView().b();
        if (oVar.e) {
            oVar.getView().J3();
        } else {
            oVar.getView().mg();
        }
        boolean a = com.amazon.aps.iva.yb0.j.a(jVar2, j.c.b);
        g gVar = oVar.i;
        com.amazon.aps.iva.co.b bVar = oVar.h;
        if (a) {
            oVar.getView().N8();
            oVar.getView().Sa(bVar.isEnabled());
            gVar.z(l.a.a);
        } else if (jVar2 instanceof j.f) {
            List<String> list = jVar2.a;
            if (!list.isEmpty()) {
                oVar.getView().X6(list, bVar.isEnabled());
            }
            gVar.z(l.b.a);
        } else if (com.amazon.aps.iva.yb0.j.a(jVar2, j.a.b)) {
            oVar.getView().Nb(bVar.isEnabled());
            gVar.z(l.e.a);
        } else if (com.amazon.aps.iva.yb0.j.a(jVar2, j.b.b)) {
            oVar.getView().N5(bVar.isEnabled());
            gVar.z(l.d.a);
        } else if (com.amazon.aps.iva.yb0.j.a(jVar2, j.e.b)) {
            oVar.getView().ng(bVar.isEnabled());
            gVar.z(l.f.a);
        } else if (com.amazon.aps.iva.yb0.j.a(jVar2, j.d.b)) {
            oVar.getView().X3(bVar.isEnabled());
            gVar.z(l.c.a);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
