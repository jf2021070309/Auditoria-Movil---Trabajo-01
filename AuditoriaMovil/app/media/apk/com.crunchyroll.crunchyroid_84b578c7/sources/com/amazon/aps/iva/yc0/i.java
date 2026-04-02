package com.amazon.aps.iva.yc0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
import java.util.Map;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes4.dex */
public final class i extends b {
    public static final /* synthetic */ l<Object>[] h = {e0.c(new v(e0.a(i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    public final com.amazon.aps.iva.de0.i g;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.sd0.g<?>>> {
        public a() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
        @Override // com.amazon.aps.iva.xb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.sd0.g<?>> invoke() {
            /*
                r4 = this;
                java.util.Map<java.lang.String, java.util.EnumSet<com.amazon.aps.iva.pc0.n>> r0 = com.amazon.aps.iva.yc0.e.a
                com.amazon.aps.iva.yc0.i r0 = com.amazon.aps.iva.yc0.i.this
                com.amazon.aps.iva.ed0.b r0 = r0.d
                boolean r1 = r0 instanceof com.amazon.aps.iva.ed0.m
                r2 = 0
                if (r1 == 0) goto Le
                com.amazon.aps.iva.ed0.m r0 = (com.amazon.aps.iva.ed0.m) r0
                goto Lf
            Le:
                r0 = r2
            Lf:
                if (r0 == 0) goto L3b
                java.util.Map<java.lang.String, com.amazon.aps.iva.pc0.m> r1 = com.amazon.aps.iva.yc0.e.b
                com.amazon.aps.iva.nd0.f r0 = r0.e()
                if (r0 == 0) goto L1e
                java.lang.String r0 = r0.b()
                goto L1f
            L1e:
                r0 = r2
            L1f:
                java.lang.Object r0 = r1.get(r0)
                com.amazon.aps.iva.pc0.m r0 = (com.amazon.aps.iva.pc0.m) r0
                if (r0 == 0) goto L3b
                com.amazon.aps.iva.sd0.j r1 = new com.amazon.aps.iva.sd0.j
                com.amazon.aps.iva.nd0.c r3 = com.amazon.aps.iva.lc0.o.a.v
                com.amazon.aps.iva.nd0.b r3 = com.amazon.aps.iva.nd0.b.l(r3)
                java.lang.String r0 = r0.name()
                com.amazon.aps.iva.nd0.f r0 = com.amazon.aps.iva.nd0.f.h(r0)
                r1.<init>(r3, r0)
                goto L3c
            L3b:
                r1 = r2
            L3c:
                if (r1 == 0) goto L49
                com.amazon.aps.iva.nd0.f r0 = com.amazon.aps.iva.yc0.c.c
                com.amazon.aps.iva.kb0.j r2 = new com.amazon.aps.iva.kb0.j
                r2.<init>(r0, r1)
                java.util.Map r2 = com.amazon.aps.iva.aq.k.x(r2)
            L49:
                if (r2 != 0) goto L4d
                com.amazon.aps.iva.lb0.a0 r2 = com.amazon.aps.iva.lb0.a0.b
            L4d:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.yc0.i.a.invoke():java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.amazon.aps.iva.ed0.a aVar, com.amazon.aps.iva.la0.c cVar) {
        super(cVar, aVar, o.a.w);
        com.amazon.aps.iva.yb0.j.f(aVar, "annotation");
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        this.g = cVar.b().g(new a());
    }

    @Override // com.amazon.aps.iva.yc0.b, com.amazon.aps.iva.pc0.c
    public final Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> a() {
        return (Map) x.T(this.g, h[0]);
    }
}
