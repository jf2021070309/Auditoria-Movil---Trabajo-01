package com.amazon.aps.iva.yc0;

import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.sd0.x;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.v;
import java.util.Map;
/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes4.dex */
public final class f extends b {
    public static final /* synthetic */ l<Object>[] h = {e0.c(new v(e0.a(f.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    public final com.amazon.aps.iva.de0.i g;

    /* compiled from: JavaAnnotationMapper.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Map<com.amazon.aps.iva.nd0.f, ? extends x>> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Map<com.amazon.aps.iva.nd0.f, ? extends x> invoke() {
            return com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j(c.a, new x("Deprecated in Java")));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.amazon.aps.iva.ed0.a aVar, com.amazon.aps.iva.la0.c cVar) {
        super(cVar, aVar, o.a.m);
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        this.g = cVar.b().g(a.h);
    }

    @Override // com.amazon.aps.iva.yc0.b, com.amazon.aps.iva.pc0.c
    public final Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> a() {
        return (Map) com.amazon.aps.iva.ab.x.T(this.g, h[0]);
    }
}
