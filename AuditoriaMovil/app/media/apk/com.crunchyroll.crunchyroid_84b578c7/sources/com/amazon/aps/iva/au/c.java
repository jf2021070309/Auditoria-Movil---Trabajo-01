package com.amazon.aps.iva.au;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import java.util.List;
/* compiled from: CommentsAdapterImpl.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ d h;
    public final /* synthetic */ com.amazon.aps.iva.fu.a i;
    public final /* synthetic */ int j;
    public final /* synthetic */ List<Object> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, com.amazon.aps.iva.fu.a aVar, int i, List<Object> list) {
        super(0);
        this.h = dVar;
        this.i = aVar;
        this.j = i;
        this.k = list;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        super/*androidx.recyclerview.widget.RecyclerView.h*/.onBindViewHolder(this.i, this.j, this.k);
        return q.a;
    }
}
