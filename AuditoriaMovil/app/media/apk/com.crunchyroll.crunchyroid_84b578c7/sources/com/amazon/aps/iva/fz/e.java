package com.amazon.aps.iva.fz;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mf0.a;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements IEventSubscriber {
    @Override // com.braze.events.IEventSubscriber
    public final void trigger(Object obj) {
        ContentCardsUpdatedEvent contentCardsUpdatedEvent = (ContentCardsUpdatedEvent) obj;
        com.amazon.aps.iva.yb0.j.f(contentCardsUpdatedEvent, "it");
        a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
        c0515a.c("subscribeToContentCardsUpdates: " + contentCardsUpdatedEvent, new Object[0]);
        com.amazon.aps.iva.xb0.l<? super Integer, q> lVar = f.d;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(contentCardsUpdatedEvent.getUnviewedCardCount()));
        }
    }
}
