package com.amazon.aps.iva.od;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.cards.Card;
/* compiled from: PersistentMessageCardViewHolder.kt */
/* loaded from: classes.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ c h;
    public final /* synthetic */ Card i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, Card card) {
        super(0);
        this.h = cVar;
        this.i = card;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.c.invoke(this.i);
        return q.a;
    }
}
