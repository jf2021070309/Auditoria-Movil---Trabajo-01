package com.amazon.aps.iva.od;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.pd.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.cards.Card;
/* compiled from: PersistentMessageCardViewHolder.kt */
/* loaded from: classes.dex */
public final class e extends l implements p<i, Integer, q> {
    public final /* synthetic */ com.amazon.aps.iva.pd.a h;
    public final /* synthetic */ c i;
    public final /* synthetic */ Card j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.amazon.aps.iva.pd.a aVar, c cVar, Card card) {
        super(2);
        this.h = aVar;
        this.i = cVar;
        this.j = card;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            g.a(this.h, null, new d(this.i, this.j), iVar2, 0, 2);
        }
        return q.a;
    }
}
