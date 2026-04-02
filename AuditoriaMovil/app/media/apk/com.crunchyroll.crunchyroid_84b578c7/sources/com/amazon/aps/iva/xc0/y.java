package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.xc0.f0;
/* compiled from: JavaTypeEnhancementState.kt */
/* loaded from: classes4.dex */
public final class y {
    public static final y d;
    public final b0 a;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.c, h0> b;
    public final boolean c;

    /* compiled from: JavaTypeEnhancementState.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.c, h0> {
        public static final a b = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final com.amazon.aps.iva.fc0.f getOwner() {
            return com.amazon.aps.iva.yb0.e0.a.c(w.class, "compiler.common.jvm");
        }

        @Override // com.amazon.aps.iva.yb0.b
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final h0 invoke(com.amazon.aps.iva.nd0.c cVar) {
            h0 h0Var;
            com.amazon.aps.iva.nd0.c cVar2 = cVar;
            com.amazon.aps.iva.yb0.j.f(cVar2, "p0");
            com.amazon.aps.iva.nd0.c cVar3 = w.a;
            f0.a.getClass();
            g0 g0Var = f0.a.b;
            com.amazon.aps.iva.kb0.d dVar = new com.amazon.aps.iva.kb0.d(7, 20);
            com.amazon.aps.iva.yb0.j.f(g0Var, "configuredReportLevels");
            h0 h0Var2 = (h0) g0Var.c.invoke(cVar2);
            if (h0Var2 == null) {
                g0 g0Var2 = w.c;
                g0Var2.getClass();
                x xVar = (x) g0Var2.c.invoke(cVar2);
                if (xVar == null) {
                    return h0.IGNORE;
                }
                com.amazon.aps.iva.kb0.d dVar2 = xVar.b;
                if (dVar2 != null && dVar2.e - dVar.e <= 0) {
                    h0Var = xVar.c;
                } else {
                    h0Var = xVar.a;
                }
                return h0Var;
            }
            return h0Var2;
        }
    }

    static {
        h0 h0Var;
        h0 h0Var2;
        com.amazon.aps.iva.nd0.c cVar = w.a;
        com.amazon.aps.iva.kb0.d dVar = com.amazon.aps.iva.kb0.d.f;
        com.amazon.aps.iva.yb0.j.f(dVar, "configuredKotlinVersion");
        x xVar = w.d;
        com.amazon.aps.iva.kb0.d dVar2 = xVar.b;
        if (dVar2 != null && dVar2.e - dVar.e <= 0) {
            h0Var = xVar.c;
        } else {
            h0Var = xVar.a;
        }
        com.amazon.aps.iva.yb0.j.f(h0Var, "globalReportLevel");
        if (h0Var == h0.WARN) {
            h0Var2 = null;
        } else {
            h0Var2 = h0Var;
        }
        d = new y(new b0(h0Var, h0Var2), a.b);
    }

    public y(b0 b0Var, a aVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(aVar, "getReportLevelForAnnotation");
        this.a = b0Var;
        this.b = aVar;
        if (!b0Var.d && aVar.invoke(w.a) != h0.IGNORE) {
            z = false;
        } else {
            z = true;
        }
        this.c = z;
    }

    public final String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.a + ", getReportLevelForAnnotation=" + this.b + ')';
    }
}
