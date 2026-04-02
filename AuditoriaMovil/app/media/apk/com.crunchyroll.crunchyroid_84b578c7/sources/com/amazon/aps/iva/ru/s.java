package com.amazon.aps.iva.ru;

import java.util.List;
/* compiled from: CommentRepliesParentAdapter.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ t h;
    public final /* synthetic */ com.amazon.aps.iva.fu.a i;
    public final /* synthetic */ int j;
    public final /* synthetic */ List<Object> k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, com.amazon.aps.iva.fu.a aVar, int i, List<Object> list) {
        super(0);
        this.h = tVar;
        this.i = aVar;
        this.j = i;
        this.k = list;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        super/*androidx.recyclerview.widget.RecyclerView.h*/.onBindViewHolder(this.i, this.j, this.k);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
