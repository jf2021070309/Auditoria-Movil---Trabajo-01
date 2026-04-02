package com.amazon.aps.iva.f5;

import android.graphics.PointF;
import com.amazon.aps.iva.f5.f;
/* compiled from: GridLayoutManager.java */
/* loaded from: classes.dex */
public final class g extends f.c {
    public final /* synthetic */ f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super();
        this.c = fVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0
    public final PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        f fVar = this.c;
        boolean z = false;
        int position = fVar.getPosition(fVar.getChildAt(0));
        int i2 = 1;
        if ((fVar.k & 262144) == 0 ? i < position : i > position) {
            z = true;
        }
        if (z) {
            i2 = -1;
        }
        if (fVar.c == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }
}
