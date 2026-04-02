package androidx.compose.ui.platform;

import android.view.ViewGroup;
/* compiled from: Wrapper.android.kt */
/* loaded from: classes.dex */
public final class j {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.amazon.aps.iva.o0.f0 a(com.amazon.aps.iva.v1.a r7, com.amazon.aps.iva.o0.g0 r8, com.amazon.aps.iva.v0.a r9) {
        /*
            java.lang.String r0 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r7, r0)
            java.lang.String r0 = "parent"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = com.amazon.aps.iva.v1.p1.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L45
            r0 = -1
            r4 = 6
            com.amazon.aps.iva.ue0.a r0 = com.amazon.aps.iva.dg.b.c(r0, r3, r4)
            com.amazon.aps.iva.kb0.m r4 = com.amazon.aps.iva.v1.t0.m
            java.lang.Object r4 = r4.getValue()
            com.amazon.aps.iva.ob0.g r4 = (com.amazon.aps.iva.ob0.g) r4
            com.amazon.aps.iva.xe0.d r4 = com.amazon.aps.iva.e.z.i(r4)
            com.amazon.aps.iva.v1.n1 r5 = new com.amazon.aps.iva.v1.n1
            r5.<init>(r0, r3)
            r6 = 3
            com.amazon.aps.iva.se0.i.d(r4, r3, r3, r5, r6)
            com.amazon.aps.iva.v1.o1 r4 = new com.amazon.aps.iva.v1.o1
            r4.<init>(r0)
            java.lang.Object r0 = com.amazon.aps.iva.y0.m.c
            monitor-enter(r0)
            java.util.ArrayList r5 = com.amazon.aps.iva.y0.m.i     // Catch: java.lang.Throwable -> L42
            r5.add(r4)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            com.amazon.aps.iva.y0.m.a()
            goto L45
        L42:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L45:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L56
            android.view.View r0 = r7.getChildAt(r1)
            boolean r4 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r4 == 0) goto L59
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L5a
        L56:
            r7.removeAllViews()
        L59:
            r0 = r3
        L5a:
            if (r0 != 0) goto L77
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r4 = r7.getContext()
            java.lang.String r5 = "context"
            com.amazon.aps.iva.yb0.j.e(r4, r5)
            com.amazon.aps.iva.ob0.g r5 = r8.g()
            r0.<init>(r4, r5)
            android.view.View r4 = r0.getView()
            android.view.ViewGroup$LayoutParams r5 = androidx.compose.ui.platform.j.a
            r7.addView(r4, r5)
        L77:
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r7 < r4) goto L8b
            com.amazon.aps.iva.v1.l3 r7 = com.amazon.aps.iva.v1.l3.a
            java.util.Map r7 = r7.a(r0)
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r2
            if (r7 == 0) goto L8b
            r1 = r2
        L8b:
            if (r1 == 0) goto Lac
            java.util.WeakHashMap r7 = new java.util.WeakHashMap
            r7.<init>()
            java.util.Set r7 = java.util.Collections.newSetFromMap(r7)
            r1 = 2131428449(0x7f0b0461, float:1.8478543E38)
            r0.setTag(r1, r7)
            com.amazon.aps.iva.v1.t1$a r7 = com.amazon.aps.iva.v1.t1.a
            java.lang.Class<com.amazon.aps.iva.v1.t1> r7 = com.amazon.aps.iva.v1.t1.class
            java.lang.String r1 = "b"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lac
            r7.setAccessible(r2)     // Catch: java.lang.Exception -> Lac
            r7.setBoolean(r3, r2)     // Catch: java.lang.Exception -> Lac
        Lac:
            com.amazon.aps.iva.u1.m1 r7 = new com.amazon.aps.iva.u1.m1
            androidx.compose.ui.node.e r1 = r0.getRoot()
            r7.<init>(r1)
            com.amazon.aps.iva.o0.i0 r7 = com.amazon.aps.iva.o0.j0.a(r7, r8)
            android.view.View r8 = r0.getView()
            r1 = 2131429438(0x7f0b083e, float:1.8480549E38)
            java.lang.Object r8 = r8.getTag(r1)
            boolean r2 = r8 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r2 == 0) goto Lcb
            r3 = r8
            androidx.compose.ui.platform.WrappedComposition r3 = (androidx.compose.ui.platform.WrappedComposition) r3
        Lcb:
            if (r3 != 0) goto Ld9
            androidx.compose.ui.platform.WrappedComposition r3 = new androidx.compose.ui.platform.WrappedComposition
            r3.<init>(r0, r7)
            android.view.View r7 = r0.getView()
            r7.setTag(r1, r3)
        Ld9:
            r3.m(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.j.a(com.amazon.aps.iva.v1.a, com.amazon.aps.iva.o0.g0, com.amazon.aps.iva.v0.a):com.amazon.aps.iva.o0.f0");
    }
}
