package com.amazon.aps.iva.c8;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ t c;

    public /* synthetic */ p(t tVar, int i) {
        this.b = i;
        this.c = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.b
            com.amazon.aps.iva.c8.t r1 = r11.c
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto Le
        L8:
            android.animation.AnimatorSet r0 = r1.m
            r0.start()
            return
        Le:
            android.view.ViewGroup r0 = r1.f
            if (r0 == 0) goto Lc8
            android.view.ViewGroup r2 = r1.g
            if (r2 != 0) goto L18
            goto Lc8
        L18:
            androidx.media3.ui.c r3 = r1.a
            int r4 = r3.getWidth()
            int r5 = r3.getPaddingLeft()
            int r4 = r4 - r5
            int r3 = r3.getPaddingRight()
            int r4 = r4 - r3
        L28:
            int r3 = r2.getChildCount()
            r5 = 1
            r6 = 0
            if (r3 <= r5) goto L41
            int r3 = r2.getChildCount()
            int r3 = r3 + (-2)
            android.view.View r5 = r2.getChildAt(r3)
            r2.removeViewAt(r3)
            r0.addView(r5, r6)
            goto L28
        L41:
            android.view.View r3 = r1.k
            if (r3 == 0) goto L4a
            r7 = 8
            r3.setVisibility(r7)
        L4a:
            android.view.ViewGroup r7 = r1.i
            int r7 = com.amazon.aps.iva.c8.t.d(r7)
            int r8 = r0.getChildCount()
            int r8 = r8 - r5
            r9 = r6
        L56:
            if (r9 >= r8) goto L64
            android.view.View r10 = r0.getChildAt(r9)
            int r10 = com.amazon.aps.iva.c8.t.d(r10)
            int r7 = r7 + r10
            int r9 = r9 + 1
            goto L56
        L64:
            if (r7 <= r4) goto Lae
            if (r3 == 0) goto L70
            r3.setVisibility(r6)
            int r1 = com.amazon.aps.iva.c8.t.d(r3)
            int r7 = r7 + r1
        L70:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = r6
        L76:
            if (r3 >= r8) goto L8a
            android.view.View r9 = r0.getChildAt(r3)
            int r10 = com.amazon.aps.iva.c8.t.d(r9)
            int r7 = r7 - r10
            r1.add(r9)
            if (r7 > r4) goto L87
            goto L8a
        L87:
            int r3 = r3 + 1
            goto L76
        L8a:
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto Lc8
            int r3 = r1.size()
            r0.removeViews(r6, r3)
        L97:
            int r0 = r1.size()
            if (r6 >= r0) goto Lc8
            int r0 = r2.getChildCount()
            int r0 = r0 - r5
            java.lang.Object r3 = r1.get(r6)
            android.view.View r3 = (android.view.View) r3
            r2.addView(r3, r0)
            int r6 = r6 + 1
            goto L97
        Lae:
            android.view.ViewGroup r0 = r1.h
            if (r0 == 0) goto Lc8
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lc8
            android.animation.ValueAnimator r0 = r1.r
            boolean r2 = r0.isStarted()
            if (r2 != 0) goto Lc8
            android.animation.ValueAnimator r1 = r1.q
            r1.cancel()
            r0.start()
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c8.p.run():void");
    }
}
