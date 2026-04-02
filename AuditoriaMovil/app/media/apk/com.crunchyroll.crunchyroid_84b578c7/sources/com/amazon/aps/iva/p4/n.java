package com.amazon.aps.iva.p4;

import com.amazon.aps.iva.r4.y0;
/* compiled from: GlanceModifier.kt */
/* loaded from: classes.dex */
public interface n {
    public static final /* synthetic */ int a = 0;

    /* compiled from: GlanceModifier.kt */
    /* loaded from: classes.dex */
    public static final class a implements n {
        public static final /* synthetic */ a b = new a();

        @Override // com.amazon.aps.iva.p4.n
        public final <R> R a(R r, com.amazon.aps.iva.xb0.p<? super R, ? super c, ? extends R> pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "operation");
            return r;
        }

        @Override // com.amazon.aps.iva.p4.n
        public final boolean b(y0.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "predicate");
            return true;
        }

        @Override // com.amazon.aps.iva.p4.n
        public final boolean c(com.amazon.aps.iva.xb0.l<? super c, Boolean> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
            return false;
        }

        @Override // com.amazon.aps.iva.p4.n
        public final n d(n nVar) {
            com.amazon.aps.iva.yb0.j.f(nVar, "other");
            return nVar;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    /* compiled from: GlanceModifier.kt */
    /* loaded from: classes.dex */
    public static final class b {
        public static n a(n nVar, n nVar2) {
            com.amazon.aps.iva.yb0.j.f(nVar2, "other");
            int i = n.a;
            if (nVar2 != a.b) {
                return new g(nVar, nVar2);
            }
            return nVar;
        }
    }

    /* compiled from: GlanceModifier.kt */
    /* loaded from: classes.dex */
    public interface c extends n {

        /* compiled from: GlanceModifier.kt */
        /* loaded from: classes.dex */
        public static final class a {
            public static boolean a(c cVar, com.amazon.aps.iva.xb0.l<? super c, Boolean> lVar) {
                com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
                return lVar.invoke(cVar).booleanValue();
            }

            public static boolean b(c cVar, com.amazon.aps.iva.xb0.l<? super c, Boolean> lVar) {
                com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
                return lVar.invoke(cVar).booleanValue();
            }
        }
    }

    <R> R a(R r, com.amazon.aps.iva.xb0.p<? super R, ? super c, ? extends R> pVar);

    boolean b(y0.c cVar);

    boolean c(com.amazon.aps.iva.xb0.l<? super c, Boolean> lVar);

    n d(n nVar);
}
