package com.amazon.aps.iva.ca;

import android.graphics.PointF;
import com.amazon.aps.iva.e4.t0;
import java.util.List;
/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class e extends g<com.amazon.aps.iva.ha.c> {
    public final com.amazon.aps.iva.ha.c i;

    public e(List<com.amazon.aps.iva.na.a<com.amazon.aps.iva.ha.c>> list) {
        super(list);
        com.amazon.aps.iva.ha.c cVar = list.get(0).b;
        int length = cVar != null ? cVar.b.length : 0;
        this.i = new com.amazon.aps.iva.ha.c(new int[length], new float[length]);
    }

    @Override // com.amazon.aps.iva.ca.a
    public final Object g(com.amazon.aps.iva.na.a aVar, float f) {
        com.amazon.aps.iva.ha.c cVar = (com.amazon.aps.iva.ha.c) aVar.b;
        com.amazon.aps.iva.ha.c cVar2 = (com.amazon.aps.iva.ha.c) aVar.c;
        com.amazon.aps.iva.ha.c cVar3 = this.i;
        cVar3.getClass();
        int[] iArr = cVar.b;
        int length = iArr.length;
        int[] iArr2 = cVar2.b;
        if (length == iArr2.length) {
            for (int i = 0; i < iArr.length; i++) {
                float f2 = cVar.a[i];
                float f3 = cVar2.a[i];
                PointF pointF = com.amazon.aps.iva.ma.f.a;
                cVar3.a[i] = t0.a(f3, f2, f, f2);
                cVar3.b[i] = com.amazon.aps.iva.gr.n.s(iArr[i], f, iArr2[i]);
            }
            return cVar3;
        }
        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb.append(iArr.length);
        sb.append(" vs ");
        throw new IllegalArgumentException(defpackage.e.f(sb, iArr2.length, ")"));
    }
}
