package com.amazon.aps.iva.ga;

import android.graphics.PointF;
import com.amazon.aps.iva.ca.n;
import java.util.List;
/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes.dex */
public final class h implements l<PointF, PointF> {
    public final b b;
    public final b c;

    public h(b bVar, b bVar2) {
        this.b = bVar;
        this.c = bVar2;
    }

    @Override // com.amazon.aps.iva.ga.l
    public final com.amazon.aps.iva.ca.a<PointF, PointF> d() {
        return new n((com.amazon.aps.iva.ca.d) this.b.d(), (com.amazon.aps.iva.ca.d) this.c.d());
    }

    @Override // com.amazon.aps.iva.ga.l
    public final List<com.amazon.aps.iva.na.a<PointF>> e() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.amazon.aps.iva.ga.l
    public final boolean k() {
        if (this.b.k() && this.c.k()) {
            return true;
        }
        return false;
    }
}
