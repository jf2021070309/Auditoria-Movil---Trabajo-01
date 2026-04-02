package com.amazon.aps.iva.ae0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.lc0.o;
import java.util.Set;
/* compiled from: ClassDeserializer.kt */
/* loaded from: classes4.dex */
public final class j {
    public static final Set<com.amazon.aps.iva.nd0.b> c = l1.H(com.amazon.aps.iva.nd0.b.l(o.a.c.h()));
    public final l a;
    public final com.amazon.aps.iva.de0.h b;

    /* compiled from: ClassDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final com.amazon.aps.iva.nd0.b a;
        public final h b;

        public a(com.amazon.aps.iva.nd0.b bVar, h hVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "classId");
            this.a = bVar;
            this.b = hVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (com.amazon.aps.iva.yb0.j.a(this.a, ((a) obj).a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a, com.amazon.aps.iva.oc0.e> {
        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x00c8 A[EDGE_INSN: B:49:0x00c8->B:41:0x00c8 ?: BREAK  , SYNTHETIC] */
        @Override // com.amazon.aps.iva.xb0.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.amazon.aps.iva.oc0.e invoke(com.amazon.aps.iva.ae0.j.a r15) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ae0.j.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public j(l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "components");
        this.a = lVar;
        this.b = lVar.a.h(new b());
    }

    public final com.amazon.aps.iva.oc0.e a(com.amazon.aps.iva.nd0.b bVar, h hVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "classId");
        return (com.amazon.aps.iva.oc0.e) this.b.invoke(new a(bVar, hVar));
    }
}
