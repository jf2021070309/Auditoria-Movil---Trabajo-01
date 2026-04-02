package com.amazon.aps.iva.pc0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.oc0.t0;
import java.util.Map;
/* compiled from: BuiltInAnnotationDescriptor.kt */
/* loaded from: classes4.dex */
public final class j implements c {
    public final com.amazon.aps.iva.lc0.k a;
    public final com.amazon.aps.iva.nd0.c b;
    public final Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> c;
    public final com.amazon.aps.iva.kb0.e d;

    /* compiled from: BuiltInAnnotationDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<m0> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final m0 invoke() {
            j jVar = j.this;
            return jVar.a.j(jVar.b).m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(com.amazon.aps.iva.lc0.k kVar, com.amazon.aps.iva.nd0.c cVar, Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.sd0.g<?>> map) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        this.a = kVar;
        this.b = cVar;
        this.c = map;
        this.d = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.PUBLICATION, new a());
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> a() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final com.amazon.aps.iva.nd0.c c() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final t0 g() {
        return t0.a;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final e0 getType() {
        Object value = this.d.getValue();
        com.amazon.aps.iva.yb0.j.e(value, "<get-type>(...)");
        return (e0) value;
    }
}
