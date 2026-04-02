package com.amazon.aps.iva.y60;

import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.k2.j;
/* compiled from: GestureListener.kt */
/* loaded from: classes2.dex */
public final class a extends GestureDetector.SimpleOnGestureListener {
    public final j b;
    public final ViewGroup c;

    public a(j jVar, View view) {
        com.amazon.aps.iva.yb0.j.f(jVar, "userActionNotifier");
        this.b = jVar;
        View findViewById = view.findViewById(16908290);
        com.amazon.aps.iva.yb0.j.e(findViewById, "decorView.findViewById(android.R.id.content)");
        this.c = (ViewGroup) findViewById;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onSingleTapUp(android.view.MotionEvent r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lb3
            android.view.ViewGroup r1 = r13.c
            java.util.ArrayList r1 = r1.getTouchables()
            java.lang.String r2 = "this.touchables"
            com.amazon.aps.iva.yb0.j.e(r1, r2)
            float r2 = r14.getX()
            float r14 = r14.getY()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r1.next()
            r5 = r4
            android.view.View r5 = (android.view.View) r5
            r6 = 2
            int[] r6 = new int[r6]
            r5.getLocationOnScreen(r6)
            android.graphics.RectF r7 = new android.graphics.RectF
            r8 = r6[r0]
            float r9 = (float) r8
            r10 = 1
            r11 = r6[r10]
            float r11 = (float) r11
            int r12 = r5.getWidth()
            int r12 = r12 + r8
            float r8 = (float) r12
            r6 = r6[r10]
            int r5 = r5.getHeight()
            int r5 = r5 + r6
            float r5 = (float) r5
            r7.<init>(r9, r11, r8, r5)
            boolean r5 = r7.contains(r2, r14)
            if (r5 == 0) goto L1f
            r3.add(r4)
            goto L1f
        L56:
            java.lang.Object r14 = com.amazon.aps.iva.lb0.x.E0(r3)
            android.view.View r14 = (android.view.View) r14
            r1 = 0
            if (r14 == 0) goto L88
            int r2 = r14.getId()
            if (r2 <= 0) goto L66
            goto L89
        L66:
            int r2 = r14.getId()
            if (r2 > 0) goto L88
            boolean r2 = r14 instanceof android.view.ViewGroup
            if (r2 == 0) goto L88
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            int r2 = r14.getChildCount()
            r3 = r0
        L77:
            if (r3 >= r2) goto L88
            android.view.View r4 = r14.getChildAt(r3)
            int r5 = r4.getId()
            if (r5 <= 0) goto L85
            r14 = r4
            goto L89
        L85:
            int r3 = r3 + 1
            goto L77
        L88:
            r14 = r1
        L89:
            if (r14 == 0) goto L97
            android.content.res.Resources r2 = r14.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L97
            int r14 = r14.getId()     // Catch: android.content.res.Resources.NotFoundException -> L97
            java.lang.String r1 = r2.getResourceEntryName(r14)     // Catch: android.content.res.Resources.NotFoundException -> L97
        L97:
            if (r1 == 0) goto Lb3
            com.amazon.aps.iva.k2.j r14 = r13.b
            r14.getClass()
            java.lang.Object r2 = r14.b
            com.amazon.aps.iva.y60.b r2 = (com.amazon.aps.iva.y60.b) r2
            if (r2 == 0) goto Lb3
            java.lang.Object r3 = r14.a
            com.amazon.aps.iva.y60.d r3 = (com.amazon.aps.iva.y60.d) r3
            java.lang.Object r14 = r14.c
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r14 = r3.a(r14, r1)
            r2.c(r14)
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.y60.a.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
