package com.amazon.aps.iva.xx;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.q.e1;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
/* compiled from: CarouselItemViewHolder.kt */
/* loaded from: classes2.dex */
public abstract class f extends RecyclerView.f0 {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] d = {q.a(f.class, "carousel", "getCarousel()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final SparseIntArray b;
    public final v c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SparseIntArray sparseIntArray, View view) {
        super(view);
        com.amazon.aps.iva.yb0.j.f(sparseIntArray, "scrollPositions");
        this.b = sparseIntArray;
        this.c = com.amazon.aps.iva.xw.g.g(this, R.id.carousel_recycler_view);
    }

    public final void b1() {
        boolean z;
        if (this.b.indexOfKey(getBindingAdapterPosition()) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((RecyclerView) this.c.getValue(this, d[0])).post(new e1(this, 5));
        }
    }
}
