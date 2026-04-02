package com.ellation.crunchyroll.crunchylists.crunchylist;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
/* compiled from: CrunchylistActivity.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends i implements l<Integer, q> {
    public a(RecyclerView recyclerView) {
        super(1, recyclerView, RecyclerView.class, "smoothScrollToPosition", "smoothScrollToPosition(I)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Integer num) {
        ((RecyclerView) this.receiver).smoothScrollToPosition(num.intValue());
        return q.a;
    }
}
