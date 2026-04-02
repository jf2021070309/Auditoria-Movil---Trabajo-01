package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.ee0.f1;
import java.util.List;
/* compiled from: TextFieldValue.kt */
/* loaded from: classes.dex */
public final class e0 {
    public final com.amazon.aps.iva.c2.b a;
    public final long b;
    public final com.amazon.aps.iva.c2.z c;

    /* compiled from: TextFieldValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.x0.o, e0, Object> {
        public static final a h = new a();

        public a() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.x0.o oVar, e0 e0Var) {
            com.amazon.aps.iva.x0.o oVar2 = oVar;
            e0 e0Var2 = e0Var;
            com.amazon.aps.iva.yb0.j.f(oVar2, "$this$Saver");
            com.amazon.aps.iva.yb0.j.f(e0Var2, "it");
            return f1.j(com.amazon.aps.iva.c2.t.a(e0Var2.a, com.amazon.aps.iva.c2.t.a, oVar2), com.amazon.aps.iva.c2.t.a(new com.amazon.aps.iva.c2.z(e0Var2.b), com.amazon.aps.iva.c2.t.m, oVar2));
        }
    }

    /* compiled from: TextFieldValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, e0> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final e0 invoke(Object obj) {
            com.amazon.aps.iva.c2.b bVar;
            com.amazon.aps.iva.c2.z zVar;
            com.amazon.aps.iva.yb0.j.f(obj, "it");
            List list = (List) obj;
            Object obj2 = list.get(0);
            com.amazon.aps.iva.x0.n nVar = com.amazon.aps.iva.c2.t.a;
            Boolean bool = Boolean.FALSE;
            if (!com.amazon.aps.iva.yb0.j.a(obj2, bool) && obj2 != null) {
                bVar = (com.amazon.aps.iva.c2.b) nVar.b.invoke(obj2);
            } else {
                bVar = null;
            }
            com.amazon.aps.iva.yb0.j.c(bVar);
            Object obj3 = list.get(1);
            int i = com.amazon.aps.iva.c2.z.c;
            com.amazon.aps.iva.x0.n nVar2 = com.amazon.aps.iva.c2.t.m;
            if (!com.amazon.aps.iva.yb0.j.a(obj3, bool) && obj3 != null) {
                zVar = (com.amazon.aps.iva.c2.z) nVar2.b.invoke(obj3);
            } else {
                zVar = null;
            }
            com.amazon.aps.iva.yb0.j.c(zVar);
            return new e0(bVar, zVar.a, (com.amazon.aps.iva.c2.z) null);
        }
    }

    static {
        com.amazon.aps.iva.x0.m.a(a.h, b.h);
    }

    public e0(com.amazon.aps.iva.c2.b bVar, long j, com.amazon.aps.iva.c2.z zVar) {
        com.amazon.aps.iva.c2.z zVar2;
        com.amazon.aps.iva.yb0.j.f(bVar, "annotatedString");
        this.a = bVar;
        String str = bVar.b;
        this.b = com.amazon.aps.iva.ab.x.C(j, str.length());
        if (zVar != null) {
            zVar2 = new com.amazon.aps.iva.c2.z(com.amazon.aps.iva.ab.x.C(zVar.a, str.length()));
        } else {
            zVar2 = null;
        }
        this.c = zVar2;
    }

    public static e0 a(e0 e0Var, com.amazon.aps.iva.c2.b bVar, long j, int i) {
        com.amazon.aps.iva.c2.z zVar;
        if ((i & 1) != 0) {
            bVar = e0Var.a;
        }
        if ((i & 2) != 0) {
            j = e0Var.b;
        }
        if ((i & 4) != 0) {
            zVar = e0Var.c;
        } else {
            zVar = null;
        }
        e0Var.getClass();
        com.amazon.aps.iva.yb0.j.f(bVar, "annotatedString");
        return new e0(bVar, j, zVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (com.amazon.aps.iva.c2.z.a(this.b, e0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, e0Var.c) && com.amazon.aps.iva.yb0.j.a(this.a, e0Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = com.amazon.aps.iva.c2.z.c;
        int a2 = com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31);
        com.amazon.aps.iva.c2.z zVar = this.c;
        if (zVar != null) {
            i = Long.hashCode(zVar.a);
        } else {
            i = 0;
        }
        return a2 + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) com.amazon.aps.iva.c2.z.g(this.b)) + ", composition=" + this.c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e0(java.lang.String r3, long r4, int r6) {
        /*
            r2 = this;
            r0 = r6 & 1
            if (r0 == 0) goto L6
            java.lang.String r3 = ""
        L6:
            r6 = r6 & 2
            if (r6 == 0) goto Lc
            long r4 = com.amazon.aps.iva.c2.z.b
        Lc:
            java.lang.String r6 = "text"
            com.amazon.aps.iva.yb0.j.f(r3, r6)
            com.amazon.aps.iva.c2.b r6 = new com.amazon.aps.iva.c2.b
            r0 = 6
            r1 = 0
            r6.<init>(r3, r1, r0)
            r2.<init>(r6, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.i2.e0.<init>(java.lang.String, long, int):void");
    }
}
