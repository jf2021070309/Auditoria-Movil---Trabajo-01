package com.braze.ui.contentcards;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.pb0.a;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: ContentCardsFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/kb0/q;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@e(c = "com.braze.ui.contentcards.ContentCardsFragment$onViewStateRestored$1", f = "ContentCardsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ContentCardsFragment$onViewStateRestored$1 extends i implements p<g0, d<? super q>, Object> {
    final /* synthetic */ Bundle $savedInstanceState;
    int label;
    final /* synthetic */ ContentCardsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardsFragment$onViewStateRestored$1(Bundle bundle, ContentCardsFragment contentCardsFragment, d<? super ContentCardsFragment$onViewStateRestored$1> dVar) {
        super(2, dVar);
        this.$savedInstanceState = bundle;
        this.this$0 = contentCardsFragment;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final d<q> create(Object obj, d<?> dVar) {
        return new ContentCardsFragment$onViewStateRestored$1(this.$savedInstanceState, this.this$0, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, d<? super q> dVar) {
        return ((ContentCardsFragment$onViewStateRestored$1) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Parcelable parcelable;
        ArrayList<String> stringArrayList;
        Object parcelable2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            x.i0(obj);
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = this.$savedInstanceState.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", Parcelable.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                parcelable = this.$savedInstanceState.getParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY");
            }
            RecyclerView contentCardsRecyclerView = this.this$0.getContentCardsRecyclerView();
            if (contentCardsRecyclerView != null) {
                RecyclerView.p layoutManager = contentCardsRecyclerView.getLayoutManager();
                if (parcelable != null && layoutManager != null) {
                    layoutManager.onRestoreInstanceState(parcelable);
                }
            }
            ContentCardAdapter contentCardAdapter = this.this$0.cardAdapter;
            if (contentCardAdapter != null && (stringArrayList = this.$savedInstanceState.getStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY")) != null) {
                contentCardAdapter.setImpressedCardIds(stringArrayList);
            }
            return q.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
