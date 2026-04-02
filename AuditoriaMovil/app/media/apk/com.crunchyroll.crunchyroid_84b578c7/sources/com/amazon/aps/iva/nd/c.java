package com.amazon.aps.iva.nd;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.cards.Card;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.ContentCardsFragment;
import com.braze.ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.crunchyroll.crunchyroid.R;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PersistentMessageCenterFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/aps/iva/nd/c;", "Lcom/braze/ui/contentcards/ContentCardsFragment;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class c extends ContentCardsFragment {
    public static final /* synthetic */ int b = 0;

    /* compiled from: PersistentMessageCenterFragment.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends i implements l<Card, q> {
        public a(Object obj) {
            super(1, obj, c.class, "onContentCardButtonClicked", "onContentCardButtonClicked(Lcom/braze/models/cards/Card;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Card card) {
            Card card2 = card;
            j.f(card2, "p0");
            c cVar = (c) this.receiver;
            int i = c.b;
            cVar.getClass();
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : card2.getExtras().entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.Companion;
            IBrazeDeeplinkHandler companion2 = companion.getInstance();
            String url = card2.getUrl();
            if (url == null) {
                url = "";
            }
            UriAction createUriActionFromUrlString = companion2.createUriActionFromUrlString(url, bundle, card2.getOpenUriInWebView(), card2.getChannel());
            if (createUriActionFromUrlString != null) {
                card2.logClick();
                IBrazeDeeplinkHandler companion3 = companion.getInstance();
                Context requireContext = cVar.requireContext();
                j.e(requireContext, "requireContext()");
                companion3.gotoUri(requireContext, createUriActionFromUrlString);
            }
            return q.a;
        }
    }

    public c() {
        setContentCardsViewBindingHandler(new com.amazon.aps.iva.od.b(new a(this)));
    }

    @Override // com.braze.ui.contentcards.ContentCardsFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        SwipeRefreshLayout contentCardsSwipeLayout = getContentCardsSwipeLayout();
        if (contentCardsSwipeLayout != null) {
            contentCardsSwipeLayout.setProgressBackgroundColorSchemeResource(R.color.cr_black_pearl);
        }
        SwipeRefreshLayout contentCardsSwipeLayout2 = getContentCardsSwipeLayout();
        if (contentCardsSwipeLayout2 != null) {
            contentCardsSwipeLayout2.setColorSchemeResources(R.color.primary);
        }
        setDefaultEmptyContentCardsAdapter(new b());
        return onCreateView;
    }

    @Override // com.braze.ui.contentcards.ContentCardsFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        j.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.remove("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY");
    }

    @Override // com.braze.ui.contentcards.ContentCardsFragment, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        RecyclerView contentCardsRecyclerView = getContentCardsRecyclerView();
        if (contentCardsRecyclerView != null) {
            int itemDecorationCount = contentCardsRecyclerView.getItemDecorationCount();
            int i = 0;
            while (true) {
                if (i >= itemDecorationCount) {
                    break;
                } else if (contentCardsRecyclerView.getItemDecorationAt(i) instanceof ContentCardsDividerItemDecoration) {
                    contentCardsRecyclerView.removeItemDecorationAt(i);
                    break;
                } else {
                    i++;
                }
            }
            contentCardsRecyclerView.addItemDecoration(new d(getResources().getDimensionPixelOffset(R.dimen.persistent_message_center_vertical_padding)));
        }
    }
}
