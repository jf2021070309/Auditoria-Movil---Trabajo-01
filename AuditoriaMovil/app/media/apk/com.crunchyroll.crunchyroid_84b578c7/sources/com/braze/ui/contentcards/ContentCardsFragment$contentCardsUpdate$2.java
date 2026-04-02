package com.braze.ui.contentcards;

import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import com.braze.events.ContentCardsUpdatedEvent;
import kotlin.Metadata;
/* compiled from: ContentCardsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentCardsFragment$contentCardsUpdate$2 extends l implements a<String> {
    final /* synthetic */ ContentCardsUpdatedEvent $event;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$contentCardsUpdate$2(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        super(0);
        this.$event = contentCardsUpdatedEvent;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        return "Updating Content Cards views in response to ContentCardsUpdatedEvent: " + this.$event;
    }
}
