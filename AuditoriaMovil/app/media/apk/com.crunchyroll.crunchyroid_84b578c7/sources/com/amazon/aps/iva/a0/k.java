package com.amazon.aps.iva.a0;

import android.app.NotificationChannel;
import android.content.Context;
import android.webkit.CookieManager;
import androidx.compose.foundation.BorderModifierNodeElement;
import com.amazon.aps.iva.me0.a;
import com.crunchyroll.player.truex.TruexManagerImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: Border.kt */
/* loaded from: classes.dex */
public final class k implements a.c, com.amazon.aps.iva.fz.g, com.amazon.aps.iva.gw.a, com.amazon.aps.iva.sl.a, com.amazon.aps.iva.vn.b, com.amazon.aps.iva.yl.d, com.amazon.aps.iva.zc.c {
    public static com.amazon.aps.iva.cg.p c;
    public static final k b = new k();
    public static final k d = new k();
    public static final com.amazon.aps.iva.xe0.s e = new com.amazon.aps.iva.xe0.s("EMPTY");
    public static final com.amazon.aps.iva.xe0.s f = new com.amazon.aps.iva.xe0.s("OFFER_SUCCESS");
    public static final com.amazon.aps.iva.xe0.s g = new com.amazon.aps.iva.xe0.s("OFFER_FAILED");
    public static final com.amazon.aps.iva.xe0.s h = new com.amazon.aps.iva.xe0.s("POLL_FAILED");
    public static final com.amazon.aps.iva.xe0.s i = new com.amazon.aps.iva.xe0.s("ENQUEUE_FAILED");
    public static final com.amazon.aps.iva.xe0.s j = new com.amazon.aps.iva.xe0.s("ON_CLOSE_HANDLER_INVOKED");
    public static final com.amazon.aps.iva.xe0.s k = new com.amazon.aps.iva.xe0.s("CONDITION_FALSE");
    public static final k l = new k();

    public static final com.amazon.aps.iva.a1.f f(com.amazon.aps.iva.a1.f fVar, p pVar, com.amazon.aps.iva.f1.u0 u0Var) {
        com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(pVar, "border");
        com.amazon.aps.iva.yb0.j.f(u0Var, "shape");
        com.amazon.aps.iva.f1.s sVar = pVar.b;
        com.amazon.aps.iva.yb0.j.f(sVar, "brush");
        return fVar.o(new BorderModifierNodeElement(pVar.a, sVar, u0Var));
    }

    public static final com.amazon.aps.iva.a1.f g(com.amazon.aps.iva.a1.f fVar, float f2, long j2, com.amazon.aps.iva.f1.u0 u0Var) {
        com.amazon.aps.iva.yb0.j.f(fVar, "$this$border");
        com.amazon.aps.iva.yb0.j.f(u0Var, "shape");
        return fVar.o(new BorderModifierNodeElement(f2, new com.amazon.aps.iva.f1.x0(j2), u0Var));
    }

    public static final com.amazon.aps.iva.ee0.e0 j(ArrayList arrayList, List list, com.amazon.aps.iva.lc0.k kVar) {
        com.amazon.aps.iva.ee0.e0 k2 = com.amazon.aps.iva.ee0.q1.e(new com.amazon.aps.iva.ee0.t0(arrayList)).k((com.amazon.aps.iva.ee0.e0) com.amazon.aps.iva.lb0.x.t0(list), com.amazon.aps.iva.ee0.v1.OUT_VARIANCE);
        if (k2 == null) {
            return kVar.n();
        }
        return k2;
    }

    public static final long k(long j2, float f2) {
        return defpackage.i.f(Math.max(0.0f, com.amazon.aps.iva.e1.a.b(j2) - f2), Math.max(0.0f, com.amazon.aps.iva.e1.a.c(j2) - f2));
    }

    public static final com.amazon.aps.iva.ee0.e0 l(com.amazon.aps.iva.oc0.y0 y0Var) {
        com.amazon.aps.iva.yb0.j.f(y0Var, "<this>");
        com.amazon.aps.iva.oc0.k d2 = y0Var.d();
        com.amazon.aps.iva.yb0.j.e(d2, "this.containingDeclaration");
        if (d2 instanceof com.amazon.aps.iva.oc0.i) {
            List<com.amazon.aps.iva.oc0.y0> parameters = ((com.amazon.aps.iva.oc0.i) d2).h().getParameters();
            com.amazon.aps.iva.yb0.j.e(parameters, "descriptor.typeConstructor.parameters");
            List<com.amazon.aps.iva.oc0.y0> list = parameters;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list));
            for (com.amazon.aps.iva.oc0.y0 y0Var2 : list) {
                com.amazon.aps.iva.ee0.c1 h2 = y0Var2.h();
                com.amazon.aps.iva.yb0.j.e(h2, "it.typeConstructor");
                arrayList.add(h2);
            }
            List<com.amazon.aps.iva.ee0.e0> upperBounds = y0Var.getUpperBounds();
            com.amazon.aps.iva.yb0.j.e(upperBounds, "upperBounds");
            return j(arrayList, upperBounds, com.amazon.aps.iva.ud0.b.e(y0Var));
        } else if (d2 instanceof com.amazon.aps.iva.oc0.v) {
            List<com.amazon.aps.iva.oc0.y0> typeParameters = ((com.amazon.aps.iva.oc0.v) d2).getTypeParameters();
            com.amazon.aps.iva.yb0.j.e(typeParameters, "descriptor.typeParameters");
            List<com.amazon.aps.iva.oc0.y0> list2 = typeParameters;
            ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
            for (com.amazon.aps.iva.oc0.y0 y0Var3 : list2) {
                com.amazon.aps.iva.ee0.c1 h3 = y0Var3.h();
                com.amazon.aps.iva.yb0.j.e(h3, "it.typeConstructor");
                arrayList2.add(h3);
            }
            List<com.amazon.aps.iva.ee0.e0> upperBounds2 = y0Var.getUpperBounds();
            com.amazon.aps.iva.yb0.j.e(upperBounds2, "upperBounds");
            return j(arrayList2, upperBounds2, com.amazon.aps.iva.ud0.b.e(y0Var));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }

    public static final void m(int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (i2 > 0 && i3 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 > i3) {
                z2 = false;
            }
            if (z2) {
                return;
            }
            throw new IllegalArgumentException(com.amazon.aps.iva.j0.j0.e("minLines ", i2, " must be less than or equal to maxLines ", i3).toString());
        }
        throw new IllegalArgumentException(com.amazon.aps.iva.q.n.a("both minLines ", i2, " and maxLines ", i3, " must be greater than zero").toString());
    }

    @Override // com.amazon.aps.iva.yl.d
    public TruexManagerImpl a(Context context, com.amazon.aps.iva.a6.m mVar, com.amazon.aps.iva.rj.b bVar, com.amazon.aps.iva.yl.b bVar2, com.amazon.aps.iva.oj.a aVar, androidx.media3.ui.d dVar) {
        return new TruexManagerImpl(context, mVar, bVar, bVar2, aVar, dVar);
    }

    @Override // com.amazon.aps.iva.gw.a
    public List b(List list) {
        return com.amazon.aps.iva.lb0.z.b;
    }

    @Override // com.amazon.aps.iva.gw.a
    public void c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
    }

    @Override // com.amazon.aps.iva.fz.g
    public NotificationChannel d(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    @Override // com.amazon.aps.iva.gw.a
    public com.amazon.aps.iva.hw.a e(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "itemId");
        return null;
    }

    @Override // com.amazon.aps.iva.me0.a.c
    public Iterable h(Object obj) {
        int i2 = com.amazon.aps.iva.bd0.x.p;
        Collection<com.amazon.aps.iva.ee0.e0> g2 = ((com.amazon.aps.iva.oc0.e) obj).h().g();
        com.amazon.aps.iva.yb0.j.e(g2, "it.typeConstructor.supertypes");
        return new com.amazon.aps.iva.ne0.p(com.amazon.aps.iva.ne0.s.c0(com.amazon.aps.iva.lb0.x.k0(g2), com.amazon.aps.iva.bd0.v.h));
    }

    @Override // com.amazon.aps.iva.vn.b
    public void onSignOut() {
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
    }

    @Override // com.amazon.aps.iva.sl.a
    public com.amazon.aps.iva.ve0.f p() {
        return com.amazon.aps.iva.ve0.e.b;
    }

    @Override // com.amazon.aps.iva.sl.a
    public com.amazon.aps.iva.ve0.f s0() {
        return com.amazon.aps.iva.ve0.e.b;
    }

    @Override // com.amazon.aps.iva.zc.c
    public com.amazon.aps.iva.nc.w i(com.amazon.aps.iva.nc.w wVar, com.amazon.aps.iva.kc.h hVar) {
        return wVar;
    }
}
