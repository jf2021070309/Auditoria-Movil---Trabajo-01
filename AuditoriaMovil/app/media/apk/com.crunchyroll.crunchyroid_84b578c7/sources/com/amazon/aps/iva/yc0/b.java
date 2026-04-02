package com.amazon.aps.iva.yc0;

import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes4.dex */
public class b implements com.amazon.aps.iva.pc0.c, com.amazon.aps.iva.zc0.g {
    public static final /* synthetic */ l<Object>[] f = {e0.c(new v(e0.a(b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    public final com.amazon.aps.iva.nd0.c a;
    public final t0 b;
    public final com.amazon.aps.iva.de0.i c;
    public final com.amazon.aps.iva.ed0.b d;
    public final boolean e;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<m0> {
        public final /* synthetic */ com.amazon.aps.iva.la0.c h;
        public final /* synthetic */ b i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.la0.c cVar, b bVar) {
            super(0);
            this.h = cVar;
            this.i = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final m0 invoke() {
            m0 m = this.h.a().j().j(this.i.a).m();
            com.amazon.aps.iva.yb0.j.e(m, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return m;
        }
    }

    public b(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.a aVar, com.amazon.aps.iva.nd0.c cVar2) {
        t0 t0Var;
        com.amazon.aps.iva.ed0.b bVar;
        ArrayList d;
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        com.amazon.aps.iva.yb0.j.f(cVar2, "fqName");
        this.a = cVar2;
        this.b = (aVar == null || (t0Var = ((com.amazon.aps.iva.ad0.c) cVar.a).j.a(aVar)) == null) ? t0.a : t0Var;
        this.c = cVar.b().g(new a(cVar, this));
        if (aVar != null && (d = aVar.d()) != null) {
            bVar = (com.amazon.aps.iva.ed0.b) x.u0(d);
        } else {
            bVar = null;
        }
        this.d = bVar;
        if (aVar != null) {
            aVar.j();
        }
        this.e = false;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> a() {
        return a0.b;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final com.amazon.aps.iva.nd0.c c() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final t0 g() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final com.amazon.aps.iva.ee0.e0 getType() {
        return (m0) com.amazon.aps.iva.ab.x.T(this.c, f[0]);
    }

    @Override // com.amazon.aps.iva.zc0.g
    public final boolean j() {
        return this.e;
    }
}
