package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.rc0.g0;
import com.amazon.aps.iva.yb0.e0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
/* compiled from: JvmBuiltInClassDescriptorFactory.kt */
/* loaded from: classes4.dex */
public final class e implements com.amazon.aps.iva.qc0.b {
    public static final com.amazon.aps.iva.nd0.f g;
    public static final com.amazon.aps.iva.nd0.b h;
    public final c0 a;
    public final com.amazon.aps.iva.xb0.l<c0, com.amazon.aps.iva.oc0.k> b;
    public final com.amazon.aps.iva.de0.i c;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {e0.c(new com.amazon.aps.iva.yb0.v(e0.a(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
    public static final a d = new a();
    public static final com.amazon.aps.iva.nd0.c f = com.amazon.aps.iva.lc0.o.k;

    /* compiled from: JvmBuiltInClassDescriptorFactory.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    static {
        com.amazon.aps.iva.nd0.d dVar = o.a.c;
        com.amazon.aps.iva.nd0.f g2 = dVar.g();
        com.amazon.aps.iva.yb0.j.e(g2, "cloneable.shortName()");
        g = g2;
        h = com.amazon.aps.iva.nd0.b.l(dVar.h());
    }

    public e() {
        throw null;
    }

    public e(com.amazon.aps.iva.de0.l lVar, g0 g0Var) {
        d dVar = d.h;
        com.amazon.aps.iva.yb0.j.f(dVar, "computeContainingDeclaration");
        this.a = g0Var;
        this.b = dVar;
        this.c = lVar.g(new f(this, lVar));
    }

    @Override // com.amazon.aps.iva.qc0.b
    public final com.amazon.aps.iva.oc0.e a(com.amazon.aps.iva.nd0.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        if (com.amazon.aps.iva.yb0.j.a(bVar, h)) {
            return (com.amazon.aps.iva.rc0.n) x.T(this.c, e[0]);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.qc0.b
    public final boolean b(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.nd0.f fVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "packageFqName");
        com.amazon.aps.iva.yb0.j.f(fVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (com.amazon.aps.iva.yb0.j.a(fVar, g) && com.amazon.aps.iva.yb0.j.a(cVar, f)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.qc0.b
    public final Collection<com.amazon.aps.iva.oc0.e> c(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "packageFqName");
        if (com.amazon.aps.iva.yb0.j.a(cVar, f)) {
            return l1.H((com.amazon.aps.iva.rc0.n) x.T(this.c, e[0]));
        }
        return b0.b;
    }
}
