package com.braze.ui.contentcards;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.xb0.l;
import kotlin.Metadata;
/* compiled from: ContentCardsFragment.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.braze.ui.contentcards.ContentCardsFragment$onRefresh$1", f = "ContentCardsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ContentCardsFragment$onRefresh$1 extends i implements l<d<? super q>, Object> {
    int label;
    final /* synthetic */ ContentCardsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$onRefresh$1(ContentCardsFragment contentCardsFragment, d<? super ContentCardsFragment$onRefresh$1> dVar) {
        super(1, dVar);
        this.this$0 = contentCardsFragment;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(d<?> dVar) {
        return new ContentCardsFragment$onRefresh$1(this.this$0, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Object invoke(d<? super q> dVar) {
        return ((ContentCardsFragment$onRefresh$1) create(dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            SwipeRefreshLayout contentCardsSwipeLayout = this.this$0.getContentCardsSwipeLayout();
            if (contentCardsSwipeLayout != null) {
                contentCardsSwipeLayout.setRefreshing(false);
            }
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
