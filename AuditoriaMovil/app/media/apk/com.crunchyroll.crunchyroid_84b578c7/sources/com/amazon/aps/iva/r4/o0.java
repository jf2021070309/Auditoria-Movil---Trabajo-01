package com.amazon.aps.iva.r4;

import android.content.Context;
import com.amazon.aps.iva.r4.z;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: WidgetLayout.kt */
/* loaded from: classes.dex */
public final class o0 {
    public static final a g = new a();
    public final Context a;
    public final Map<com.amazon.aps.iva.u4.g, Integer> b;
    public int c;
    public final int d;
    public final Set<Integer> e;
    public final Set<Integer> f;

    /* compiled from: WidgetLayout.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: WidgetLayout.kt */
        @com.amazon.aps.iva.qb0.e(c = "androidx.glance.appwidget.LayoutConfiguration$Companion", f = "WidgetLayout.kt", l = {96}, m = "load$glance_appwidget_release")
        /* renamed from: com.amazon.aps.iva.r4.o0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0663a extends com.amazon.aps.iva.qb0.c {
            public Context h;
            public int i;
            public /* synthetic */ Object j;
            public int l;

            public C0663a(com.amazon.aps.iva.ob0.d<? super C0663a> dVar) {
                super(dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                this.j = obj;
                this.l |= Integer.MIN_VALUE;
                return a.this.a(null, 0, this);
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:3|(12:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(1:30))|12|13|(1:15)|16|(2:19|17)|20|21|22))|33|6|7|(0)(0)|12|13|(0)|16|(1:17)|20|21|22) */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
            r9 = com.amazon.aps.iva.u4.e.o();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
            r9 = com.amazon.aps.iva.u4.e.o();
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[LOOP:0: B:28:0x0082->B:30:0x0088, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(android.content.Context r7, int r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.r4.o0> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof com.amazon.aps.iva.r4.o0.a.C0663a
                if (r0 == 0) goto L13
                r0 = r9
                com.amazon.aps.iva.r4.o0$a$a r0 = (com.amazon.aps.iva.r4.o0.a.C0663a) r0
                int r1 = r0.l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.l = r1
                goto L18
            L13:
                com.amazon.aps.iva.r4.o0$a$a r0 = new com.amazon.aps.iva.r4.o0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.j
                com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r2 = r0.l
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                int r8 = r0.i
                android.content.Context r7 = r0.h
                com.amazon.aps.iva.ab.x.i0(r9)     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                goto L55
            L2b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L33:
                com.amazon.aps.iva.ab.x.i0(r9)
                com.amazon.aps.iva.z4.a r9 = com.amazon.aps.iva.z4.a.a     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                com.amazon.aps.iva.r4.b1 r2 = com.amazon.aps.iva.r4.b1.a     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                java.lang.String r5 = "appWidgetLayout-"
                r4.<init>(r5)     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                r4.append(r8)     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                r0.h = r7     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                r0.i = r8     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                r0.l = r3     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                java.lang.Object r9 = r9.c(r7, r2, r4, r0)     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                if (r9 != r1) goto L55
                return r1
            L55:
                com.amazon.aps.iva.u4.e r9 = (com.amazon.aps.iva.u4.e) r9     // Catch: java.io.IOException -> L58 com.amazon.aps.iva.z3.a -> L5d
                goto L61
            L58:
                com.amazon.aps.iva.u4.e r9 = com.amazon.aps.iva.u4.e.o()
                goto L61
            L5d:
                com.amazon.aps.iva.u4.e r9 = com.amazon.aps.iva.u4.e.o()
            L61:
                r1 = r7
                r4 = r8
                com.amazon.aps.iva.v4.y$d r7 = r9.p()
                java.lang.String r8 = "config.layoutList"
                com.amazon.aps.iva.yb0.j.e(r7, r8)
                int r8 = com.amazon.aps.iva.lb0.r.Y(r7)
                int r8 = com.amazon.aps.iva.aq.k.w(r8)
                r0 = 16
                if (r8 >= r0) goto L79
                r8 = r0
            L79:
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>(r8)
                java.util.Iterator r7 = r7.iterator()
            L82:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L9f
                java.lang.Object r8 = r7.next()
                com.amazon.aps.iva.u4.f r8 = (com.amazon.aps.iva.u4.f) r8
                com.amazon.aps.iva.u4.g r2 = r8.n()
                int r8 = r8.o()
                java.lang.Integer r3 = new java.lang.Integer
                r3.<init>(r8)
                r0.put(r2, r3)
                goto L82
            L9f:
                java.util.LinkedHashMap r2 = com.amazon.aps.iva.lb0.i0.b0(r0)
                com.amazon.aps.iva.r4.o0 r7 = new com.amazon.aps.iva.r4.o0
                int r3 = r9.q()
                java.util.Collection r8 = r2.values()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.Set r5 = com.amazon.aps.iva.lb0.x.b1(r8)
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.r4.o0.a.a(android.content.Context, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
        }
    }

    public o0() {
        throw null;
    }

    public o0(Context context, LinkedHashMap linkedHashMap, int i, int i2, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.a = context;
        this.b = linkedHashMap;
        this.c = i;
        this.d = i2;
        this.e = linkedHashSet;
        this.f = set;
    }

    public final int a(com.amazon.aps.iva.p4.i iVar) {
        boolean z;
        com.amazon.aps.iva.u4.g q = com.amazon.aps.iva.gr.n.q(this.a, iVar);
        synchronized (this) {
            Integer num = this.b.get(q);
            if (num != null) {
                int intValue = num.intValue();
                this.e.add(Integer.valueOf(intValue));
                return intValue;
            }
            int i = this.c;
            while (this.f.contains(Integer.valueOf(i))) {
                i = (i + 1) % y0.c;
                if (i != this.c) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.".toString());
                }
            }
            this.c = (i + 1) % y0.c;
            this.e.add(Integer.valueOf(i));
            this.f.add(Integer.valueOf(i));
            this.b.put(q, Integer.valueOf(i));
            return i;
        }
    }

    public final Object b(z.b bVar) {
        com.amazon.aps.iva.z4.a aVar = com.amazon.aps.iva.z4.a.a;
        Context context = this.a;
        b1 b1Var = b1.a;
        Object d = aVar.d(context, b1Var, "appWidgetLayout-" + this.d, new p0(this, null), bVar);
        if (d == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return d;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
