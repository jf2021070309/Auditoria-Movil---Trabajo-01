package com.amazon.aps.iva.od;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.cards.Card;
/* compiled from: ContentCardBindingHandler.kt */
/* loaded from: classes.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<Card, q> {
    public static final a h = new a();

    public a() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Card card) {
        j.f(card, "it");
        return q.a;
    }
}
