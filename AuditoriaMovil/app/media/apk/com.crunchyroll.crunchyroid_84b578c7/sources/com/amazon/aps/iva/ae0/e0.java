package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.b8.l1;
import com.amazon.aps.iva.id0.b;
import com.amazon.aps.iva.oc0.t0;
/* compiled from: ProtoContainer.kt */
/* loaded from: classes4.dex */
public abstract class e0 {
    public final com.amazon.aps.iva.kd0.c a;
    public final com.amazon.aps.iva.kd0.g b;
    public final t0 c;

    /* compiled from: ProtoContainer.kt */
    /* loaded from: classes4.dex */
    public static final class a extends e0 {
        public final com.amazon.aps.iva.id0.b d;
        public final a e;
        public final com.amazon.aps.iva.nd0.b f;
        public final b.c g;
        public final boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.id0.b bVar, com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, t0 t0Var, a aVar) {
            super(cVar, gVar, t0Var);
            com.amazon.aps.iva.yb0.j.f(bVar, "classProto");
            com.amazon.aps.iva.yb0.j.f(cVar, "nameResolver");
            com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
            this.d = bVar;
            this.e = aVar;
            this.f = com.amazon.aps.iva.aq.j.s(cVar, bVar.f);
            b.c cVar2 = (b.c) com.amazon.aps.iva.kd0.b.f.c(bVar.e);
            this.g = cVar2 == null ? b.c.CLASS : cVar2;
            this.h = l1.c(com.amazon.aps.iva.kd0.b.g, bVar.e, "IS_INNER.get(classProto.flags)");
        }

        @Override // com.amazon.aps.iva.ae0.e0
        public final com.amazon.aps.iva.nd0.c a() {
            com.amazon.aps.iva.nd0.c b = this.f.b();
            com.amazon.aps.iva.yb0.j.e(b, "classId.asSingleFqName()");
            return b;
        }
    }

    /* compiled from: ProtoContainer.kt */
    /* loaded from: classes4.dex */
    public static final class b extends e0 {
        public final com.amazon.aps.iva.nd0.c d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.kd0.c cVar2, com.amazon.aps.iva.kd0.g gVar, com.amazon.aps.iva.ce0.j jVar) {
            super(cVar2, gVar, jVar);
            com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
            com.amazon.aps.iva.yb0.j.f(cVar2, "nameResolver");
            com.amazon.aps.iva.yb0.j.f(gVar, "typeTable");
            this.d = cVar;
        }

        @Override // com.amazon.aps.iva.ae0.e0
        public final com.amazon.aps.iva.nd0.c a() {
            return this.d;
        }
    }

    public e0(com.amazon.aps.iva.kd0.c cVar, com.amazon.aps.iva.kd0.g gVar, t0 t0Var) {
        this.a = cVar;
        this.b = gVar;
        this.c = t0Var;
    }

    public abstract com.amazon.aps.iva.nd0.c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
