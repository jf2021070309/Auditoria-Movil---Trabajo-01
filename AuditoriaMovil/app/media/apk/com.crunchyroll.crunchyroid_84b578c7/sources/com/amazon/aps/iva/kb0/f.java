package com.amazon.aps.iva.kb0;
/* compiled from: LazyJVM.kt */
/* loaded from: classes4.dex */
public class f {

    /* compiled from: LazyJVM.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.SYNCHRONIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.PUBLICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final <T> e<T> a(g gVar, com.amazon.aps.iva.xb0.a<? extends T> aVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "mode");
        com.amazon.aps.iva.yb0.j.f(aVar, "initializer");
        int i = a.a[gVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new r(aVar);
                }
                throw new h();
            }
            return new l(aVar);
        }
        return new m(aVar);
    }

    public static final m b(com.amazon.aps.iva.xb0.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "initializer");
        return new m(aVar);
    }
}
