package androidx.compose.ui.platform;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.v1.h2;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ h2 h;
    public final /* synthetic */ a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, h2 h2Var) {
        super(0);
        this.h = h2Var;
        this.i = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r7 == false) goto L23;
     */
    @Override // com.amazon.aps.iva.xb0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.kb0.q invoke() {
        /*
            r10 = this;
            com.amazon.aps.iva.v1.h2 r0 = r10.h
            com.amazon.aps.iva.a2.j r1 = r0.f
            com.amazon.aps.iva.a2.j r2 = r0.g
            java.lang.Float r3 = r0.d
            java.lang.Float r4 = r0.e
            r5 = 0
            if (r1 == 0) goto L21
            if (r3 == 0) goto L21
            com.amazon.aps.iva.xb0.a<java.lang.Float> r6 = r1.a
            java.lang.Object r6 = r6.invoke()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r3 = r3.floatValue()
            float r6 = r6 - r3
            goto L22
        L21:
            r6 = r5
        L22:
            if (r2 == 0) goto L38
            if (r4 == 0) goto L38
            com.amazon.aps.iva.xb0.a<java.lang.Float> r3 = r2.a
            java.lang.Object r3 = r3.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r4 = r4.floatValue()
            float r3 = r3 - r4
            goto L39
        L38:
            r3 = r5
        L39:
            int r4 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L41
            r4 = r8
            goto L42
        L41:
            r4 = r7
        L42:
            if (r4 == 0) goto L4b
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 != 0) goto L49
            r7 = r8
        L49:
            if (r7 != 0) goto Lb6
        L4b:
            int r4 = r0.b
            androidx.compose.ui.platform.a r5 = r10.i
            int r4 = r5.v(r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r8 = 8
            r9 = 2048(0x800, float:2.87E-42)
            androidx.compose.ui.platform.a.A(r5, r4, r9, r7, r8)
            r7 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r4 = r5.d(r4, r7)
            if (r1 == 0) goto L86
            com.amazon.aps.iva.xb0.a<java.lang.Float> r7 = r1.a
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (int) r7
            r4.setScrollX(r7)
            com.amazon.aps.iva.xb0.a<java.lang.Float> r7 = r1.b
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (int) r7
            r4.setMaxScrollX(r7)
        L86:
            if (r2 == 0) goto La8
            com.amazon.aps.iva.xb0.a<java.lang.Float> r7 = r2.a
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (int) r7
            r4.setScrollY(r7)
            com.amazon.aps.iva.xb0.a<java.lang.Float> r7 = r2.b
            java.lang.Object r7 = r7.invoke()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (int) r7
            r4.setMaxScrollY(r7)
        La8:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r7 < r8) goto Lb3
            int r6 = (int) r6
            int r3 = (int) r3
            androidx.compose.ui.platform.a.c.a(r4, r6, r3)
        Lb3:
            r5.y(r4)
        Lb6:
            if (r1 == 0) goto Lc2
            com.amazon.aps.iva.xb0.a<java.lang.Float> r1 = r1.a
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.d = r1
        Lc2:
            if (r2 == 0) goto Lce
            com.amazon.aps.iva.xb0.a<java.lang.Float> r1 = r2.a
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.e = r1
        Lce:
            com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.b.invoke():java.lang.Object");
    }
}
