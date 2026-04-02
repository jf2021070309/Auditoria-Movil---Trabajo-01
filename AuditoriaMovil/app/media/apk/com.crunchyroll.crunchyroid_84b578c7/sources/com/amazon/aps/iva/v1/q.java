package com.amazon.aps.iva.v1;

import androidx.compose.ui.platform.AndroidComposeView;
/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
public final class q extends com.amazon.aps.iva.p3.a {
    public final /* synthetic */ androidx.compose.ui.node.e a;
    public final /* synthetic */ AndroidComposeView b;
    public final /* synthetic */ AndroidComposeView c;

    /* compiled from: AndroidComposeView.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.e, Boolean> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(androidx.compose.ui.node.e eVar) {
            androidx.compose.ui.node.e eVar2 = eVar;
            com.amazon.aps.iva.yb0.j.f(eVar2, "it");
            return Boolean.valueOf(eVar2.z.d(8));
        }
    }

    public q(androidx.compose.ui.node.e eVar, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.a = eVar;
        this.b = androidComposeView;
        this.c = androidComposeView2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r0.intValue() == r1.getSemanticsOwner().a().g) goto L25;
     */
    @Override // com.amazon.aps.iva.p3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onInitializeAccessibilityNodeInfo(android.view.View r8, com.amazon.aps.iva.q3.l r9) {
        /*
            r7 = this;
            java.lang.String r0 = "host"
            com.amazon.aps.iva.yb0.j.f(r8, r0)
            java.lang.String r0 = "info"
            com.amazon.aps.iva.yb0.j.f(r9, r0)
            super.onInitializeAccessibilityNodeInfo(r8, r9)
            androidx.compose.ui.node.e r8 = r7.a
            com.amazon.aps.iva.v1.q$a r0 = com.amazon.aps.iva.v1.q.a.h
            androidx.compose.ui.node.e r0 = com.amazon.aps.iva.a2.t.b(r8, r0)
            if (r0 == 0) goto L1e
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L1f
        L1e:
            r0 = 0
        L1f:
            androidx.compose.ui.platform.AndroidComposeView r1 = r7.b
            if (r0 == 0) goto L33
            com.amazon.aps.iva.a2.u r2 = r1.getSemanticsOwner()
            com.amazon.aps.iva.a2.r r2 = r2.a()
            int r3 = r0.intValue()
            int r2 = r2.g
            if (r3 != r2) goto L38
        L33:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L38:
            int r0 = r0.intValue()
            r9.b = r0
            android.view.accessibility.AccessibilityNodeInfo r9 = r9.a
            androidx.compose.ui.platform.AndroidComposeView r2 = r7.c
            r9.setParent(r2, r0)
            int r8 = r8.c
            androidx.compose.ui.platform.a r0 = r1.n
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r0.w
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            androidx.compose.ui.platform.a r3 = r1.n
            java.lang.String r4 = "info.unwrap()"
            if (r0 == 0) goto L7c
            int r5 = r0.intValue()
            com.amazon.aps.iva.v1.x0 r6 = r1.getAndroidViewsHandler$ui_release()
            int r0 = r0.intValue()
            com.amazon.aps.iva.p2.a r0 = androidx.compose.ui.platform.c.j(r6, r0)
            if (r0 == 0) goto L71
            r9.setTraversalBefore(r0)
            goto L74
        L71:
            r9.setTraversalBefore(r2, r5)
        L74:
            com.amazon.aps.iva.yb0.j.e(r9, r4)
            java.lang.String r0 = r3.y
            androidx.compose.ui.platform.AndroidComposeView.s(r1, r8, r9, r0)
        L7c:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r3.x
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.get(r5)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lab
            int r5 = r0.intValue()
            com.amazon.aps.iva.v1.x0 r6 = r1.getAndroidViewsHandler$ui_release()
            int r0 = r0.intValue()
            com.amazon.aps.iva.p2.a r0 = androidx.compose.ui.platform.c.j(r6, r0)
            if (r0 == 0) goto La0
            r9.setTraversalAfter(r0)
            goto La3
        La0:
            r9.setTraversalAfter(r2, r5)
        La3:
            com.amazon.aps.iva.yb0.j.e(r9, r4)
            java.lang.String r0 = r3.z
            androidx.compose.ui.platform.AndroidComposeView.s(r1, r8, r9, r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v1.q.onInitializeAccessibilityNodeInfo(android.view.View, com.amazon.aps.iva.q3.l):void");
    }
}
