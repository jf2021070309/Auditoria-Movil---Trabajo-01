package com.braze.ui.contentcards;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.braze.events.ContentCardsUpdatedEvent;
import kotlin.Metadata;
/* compiled from: ContentCardsFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.braze.ui.contentcards.ContentCardsFragment$handleContentCardsUpdatedEvent$1", f = "ContentCardsFragment.kt", l = {268}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ContentCardsFragment$handleContentCardsUpdatedEvent$1 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ ContentCardsUpdatedEvent $event;
    int label;
    final /* synthetic */ ContentCardsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$handleContentCardsUpdatedEvent$1(ContentCardsFragment contentCardsFragment, ContentCardsUpdatedEvent contentCardsUpdatedEvent, d<? super ContentCardsFragment$handleContentCardsUpdatedEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = contentCardsFragment;
        this.$event = contentCardsUpdatedEvent;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new ContentCardsFragment$handleContentCardsUpdatedEvent$1(this.this$0, this.$event, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((ContentCardsFragment$handleContentCardsUpdatedEvent$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            ContentCardsFragment contentCardsFragment = this.this$0;
            ContentCardsUpdatedEvent contentCardsUpdatedEvent = this.$event;
            this.label = 1;
            if (contentCardsFragment.contentCardsUpdate(contentCardsUpdatedEvent, this) == aVar) {
                return aVar;
            }
        }
        return q.a;
    }
}
