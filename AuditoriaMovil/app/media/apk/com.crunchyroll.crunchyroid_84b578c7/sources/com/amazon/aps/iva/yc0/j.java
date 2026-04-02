package com.amazon.aps.iva.yc0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ed0.m;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.pc0.n;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
import java.util.EnumSet;
import java.util.Map;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes4.dex */
public final class j extends b {
    public static final /* synthetic */ l<Object>[] h = {e0.c(new v(e0.a(j.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    public final com.amazon.aps.iva.de0.i g;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.sd0.g<? extends Object>>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.sd0.g<? extends Object>> invoke() {
            com.amazon.aps.iva.sd0.b bVar;
            com.amazon.aps.iva.ed0.b bVar2 = j.this.d;
            Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.sd0.g<? extends Object>> map = null;
            if (bVar2 instanceof com.amazon.aps.iva.ed0.e) {
                Map<String, EnumSet<n>> map2 = e.a;
                bVar = e.a(((com.amazon.aps.iva.ed0.e) bVar2).c());
            } else if (bVar2 instanceof m) {
                Map<String, EnumSet<n>> map3 = e.a;
                bVar = e.a(f1.J(bVar2));
            } else {
                bVar = null;
            }
            if (bVar != null) {
                map = com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j(c.b, bVar));
            }
            if (map == null) {
                return a0.b;
            }
            return map;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.ed0.a aVar, com.amazon.aps.iva.la0.c cVar) {
        super(cVar, aVar, o.a.t);
        com.amazon.aps.iva.yb0.j.f(aVar, "annotation");
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        this.g = cVar.b().g(new a());
    }

    @Override // com.amazon.aps.iva.yc0.b, com.amazon.aps.iva.pc0.c
    public final Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<Object>> a() {
        return (Map) x.T(this.g, h[0]);
    }
}
