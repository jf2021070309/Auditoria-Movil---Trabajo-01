package com.amazon.aps.iva.d0;

import com.amazon.aps.iva.a1.a;
/* compiled from: RowColumnImpl.kt */
/* loaded from: classes.dex */
public abstract class q {
    public static final /* synthetic */ int a = 0;

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends q {
        public static final /* synthetic */ int b = 0;

        static {
            new a();
        }

        @Override // com.amazon.aps.iva.d0.q
        public final int a(int i, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.s1.u0 u0Var) {
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            return i / 2;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    public static final class b extends q {
        public static final /* synthetic */ int b = 0;

        static {
            new b();
        }

        @Override // com.amazon.aps.iva.d0.q
        public final int a(int i, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.s1.u0 u0Var) {
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            if (lVar != com.amazon.aps.iva.o2.l.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    public static final class c extends q {
        public final a.b b;

        public c(a.b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "horizontal");
            this.b = bVar;
        }

        @Override // com.amazon.aps.iva.d0.q
        public final int a(int i, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.s1.u0 u0Var) {
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            return this.b.a(0, i, lVar);
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    public static final class d extends q {
        public static final /* synthetic */ int b = 0;

        static {
            new d();
        }

        @Override // com.amazon.aps.iva.d0.q
        public final int a(int i, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.s1.u0 u0Var) {
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            if (lVar == com.amazon.aps.iva.o2.l.Ltr) {
                return 0;
            }
            return i;
        }
    }

    /* compiled from: RowColumnImpl.kt */
    /* loaded from: classes.dex */
    public static final class e extends q {
        public final a.c b;

        public e(a.c cVar) {
            com.amazon.aps.iva.yb0.j.f(cVar, "vertical");
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.d0.q
        public final int a(int i, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.s1.u0 u0Var) {
            com.amazon.aps.iva.yb0.j.f(lVar, "layoutDirection");
            return this.b.a(0, i);
        }
    }

    static {
        int i = a.b;
        int i2 = d.b;
        int i3 = b.b;
    }

    public abstract int a(int i, com.amazon.aps.iva.o2.l lVar, com.amazon.aps.iva.s1.u0 u0Var);
}
