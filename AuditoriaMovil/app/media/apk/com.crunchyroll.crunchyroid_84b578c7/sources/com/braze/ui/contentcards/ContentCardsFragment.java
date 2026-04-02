package com.braze.ui.contentcards;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;
import androidx.recyclerview.widget.q;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.tb.a;
import com.amazon.aps.iva.xe0.k;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.ye0.c;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$color;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.braze.ui.R$string;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter;
import com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ContentCardsFragment.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0016\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB\u0007¢\u0006\u0004\bc\u0010dJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\bJ&\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0012\u0010\u0018\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0004J\b\u0010\u001a\u001a\u00020\u0006H\u0004J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0004J\u001b\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0084@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0006H\u0084@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0014\u0010$\u001a\u00020\u00062\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0004R$\u0010&\u001a\u0004\u0018\u00010%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u0010.\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u00108\u001a\u0002078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010?\u001a\u0004\u0018\u00010>8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010F\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010E8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR*\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010E8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bM\u0010G\u001a\u0004\bN\u0010I\"\u0004\bO\u0010KR\u001a\u0010P\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR$\u0010T\u001a\u0004\u0018\u00010\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bT\u0010Q\u001a\u0004\bU\u0010S\"\u0004\bV\u0010WR\u001a\u0010X\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R$\u0010\\\u001a\u0004\u0018\u00010\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010[\"\u0004\b^\u0010_R\u0018\u0010b\u001a\u0006\u0012\u0002\b\u00030\"8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006f"}, d2 = {"Lcom/braze/ui/contentcards/ContentCardsFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getContentCardUpdateHandler", "value", "Lcom/amazon/aps/iva/kb0/q;", "setContentCardUpdateHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getContentCardsViewBindingHandler", "setContentCardsViewBindingHandler", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onRefresh", "onResume", "onPause", "outState", "onSaveInstanceState", "onViewStateRestored", "initializeRecyclerView", "attachSwipeHelperCallback", "Lcom/braze/events/ContentCardsUpdatedEvent;", "event", "handleContentCardsUpdatedEvent", "contentCardsUpdate", "(Lcom/braze/events/ContentCardsUpdatedEvent;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "networkUnavailable", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Landroidx/recyclerview/widget/RecyclerView$h;", "newAdapter", "swapRecyclerViewAdapter", "Lcom/amazon/aps/iva/se0/j1;", "networkUnavailableJob", "Lcom/amazon/aps/iva/se0/j1;", "getNetworkUnavailableJob", "()Lcom/amazon/aps/iva/se0/j1;", "setNetworkUnavailableJob", "(Lcom/amazon/aps/iva/se0/j1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "<set-?>", "contentCardsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getContentCardsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setContentCardsRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "cardAdapter", "Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "defaultEmptyContentCardsAdapter", "Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "getDefaultEmptyContentCardsAdapter", "()Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "setDefaultEmptyContentCardsAdapter", "(Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;)V", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "contentCardsSwipeLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getContentCardsSwipeLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setContentCardsSwipeLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "Lcom/braze/events/IEventSubscriber;", "contentCardsUpdatedSubscriber", "Lcom/braze/events/IEventSubscriber;", "getContentCardsUpdatedSubscriber", "()Lcom/braze/events/IEventSubscriber;", "setContentCardsUpdatedSubscriber", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "getSdkDataWipeEventSubscriber", "setSdkDataWipeEventSubscriber", "defaultContentCardUpdateHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getDefaultContentCardUpdateHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "customContentCardUpdateHandler", "getCustomContentCardUpdateHandler", "setCustomContentCardUpdateHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;)V", "defaultContentCardsViewBindingHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getDefaultContentCardsViewBindingHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "customContentCardsViewBindingHandler", "getCustomContentCardsViewBindingHandler", "setCustomContentCardsViewBindingHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "getEmptyCardsAdapter", "()Landroidx/recyclerview/widget/RecyclerView$h;", "emptyCardsAdapter", "<init>", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class ContentCardsFragment extends Fragment implements SwipeRefreshLayout.f {
    public static final Companion Companion = new Companion(null);
    public ContentCardAdapter cardAdapter;
    private RecyclerView contentCardsRecyclerView;
    private SwipeRefreshLayout contentCardsSwipeLayout;
    private IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;
    private IContentCardsUpdateHandler customContentCardUpdateHandler;
    private IContentCardsViewBindingHandler customContentCardsViewBindingHandler;
    private j1 networkUnavailableJob;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private EmptyContentCardsAdapter defaultEmptyContentCardsAdapter = new EmptyContentCardsAdapter();
    private final IContentCardsUpdateHandler defaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();
    private final IContentCardsViewBindingHandler defaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();

    /* compiled from: ContentCardsFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/braze/ui/contentcards/ContentCardsFragment$Companion;", "", "()V", "AUTO_HIDE_REFRESH_INDICATOR_DELAY_MS", "", "KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY", "", "LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", "MAX_CONTENT_CARDS_TTL_SECONDS", "", "NETWORK_PROBLEM_WARNING_MS", "UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", "VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public static final void onResume$lambda$0(ContentCardsFragment contentCardsFragment, ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        j.f(contentCardsFragment, "this$0");
        j.f(contentCardsUpdatedEvent, "event");
        contentCardsFragment.handleContentCardsUpdatedEvent(contentCardsUpdatedEvent);
    }

    public static final void onResume$lambda$2(ContentCardsFragment contentCardsFragment, SdkDataWipeEvent sdkDataWipeEvent) {
        j.f(contentCardsFragment, "this$0");
        j.f(sdkDataWipeEvent, "it");
        contentCardsFragment.handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent.Companion.getEmptyUpdate());
    }

    public final void attachSwipeHelperCallback() {
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            new q(new SimpleItemTouchHelperCallback(contentCardAdapter)).f(this.contentCardsRecyclerView);
        }
    }

    public final Object contentCardsUpdate(ContentCardsUpdatedEvent contentCardsUpdatedEvent, d<? super com.amazon.aps.iva.kb0.q> dVar) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardsFragment$contentCardsUpdate$2(contentCardsUpdatedEvent), 2, (Object) null);
        List<Card> handleCardUpdate = getContentCardUpdateHandler().handleCardUpdate(contentCardsUpdatedEvent);
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.replaceCards(handleCardUpdate);
        }
        j1 j1Var = this.networkUnavailableJob;
        if (j1Var != null) {
            j1Var.a(null);
        }
        this.networkUnavailableJob = null;
        if (contentCardsUpdatedEvent.isFromOfflineStorage() && contentCardsUpdatedEvent.isTimestampOlderThan(60L)) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, ContentCardsFragment$contentCardsUpdate$3.INSTANCE, 2, (Object) null);
            Braze.Companion companion = Braze.Companion;
            Context requireContext = requireContext();
            j.e(requireContext, "requireContext()");
            companion.getInstance(requireContext).requestContentCardsRefresh();
            if (handleCardUpdate.isEmpty()) {
                SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(true);
                }
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, ContentCardsFragment$contentCardsUpdate$4.INSTANCE, 3, (Object) null);
                j1 j1Var2 = this.networkUnavailableJob;
                if (j1Var2 != null) {
                    j1Var2.a(null);
                }
                BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
                Long l = new Long(5000L);
                c cVar = r0.a;
                this.networkUnavailableJob = brazeCoroutineScope.launchDelayed(l, k.a, new ContentCardsFragment$contentCardsUpdate$5(this, null));
                return com.amazon.aps.iva.kb0.q.a;
            }
        }
        if (!handleCardUpdate.isEmpty()) {
            ContentCardAdapter contentCardAdapter2 = this.cardAdapter;
            if (contentCardAdapter2 != null) {
                swapRecyclerViewAdapter(contentCardAdapter2);
            }
        } else {
            swapRecyclerViewAdapter(getEmptyCardsAdapter());
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler == null) {
            return this.defaultContentCardUpdateHandler;
        }
        return iContentCardsUpdateHandler;
    }

    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    public final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    public final IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler == null) {
            return this.defaultContentCardsViewBindingHandler;
        }
        return iContentCardsViewBindingHandler;
    }

    public final RecyclerView.h<?> getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    public final void handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        j.f(contentCardsUpdatedEvent, "event");
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        c cVar = r0.a;
        i.d(brazeCoroutineScope, k.a, null, new ContentCardsFragment$handleContentCardsUpdatedEvent$1(this, contentCardsUpdatedEvent, null), 2);
    }

    public final void initializeRecyclerView() {
        RecyclerView.m mVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        ContentCardAdapter contentCardAdapter = new ContentCardAdapter(requireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = contentCardAdapter;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(contentCardAdapter);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        if (recyclerView3 != null) {
            mVar = recyclerView3.getItemAnimator();
        } else {
            mVar = null;
        }
        if (mVar instanceof e0) {
            ((e0) mVar).g = false;
        }
        RecyclerView recyclerView4 = this.contentCardsRecyclerView;
        if (recyclerView4 != null) {
            Context requireContext2 = requireContext();
            j.e(requireContext2, "requireContext()");
            recyclerView4.addItemDecoration(new ContentCardsDividerItemDecoration(requireContext2));
        }
    }

    public final Object networkUnavailable(d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Context applicationContext;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, ContentCardsFragment$networkUnavailable$2.INSTANCE, 2, (Object) null);
        Context context = getContext();
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            Toast.makeText(applicationContext, applicationContext.getString(R$string.com_braze_feed_connection_error_title), 1).show();
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.com_braze_content_cards, viewGroup, false);
        this.contentCardsRecyclerView = (RecyclerView) inflate.findViewById(R$id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.braze_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(R$color.com_braze_content_cards_swipe_refresh_color_1, R$color.com_braze_content_cards_swipe_refresh_color_2, R$color.com_braze_content_cards_swipe_refresh_color_3, R$color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Braze.Companion companion = Braze.Companion;
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        companion.getInstance(requireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        Context requireContext2 = requireContext();
        j.e(requireContext2, "requireContext()");
        companion.getInstance(requireContext2).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        j1 j1Var = this.networkUnavailableJob;
        if (j1Var != null) {
            j1Var.a(null);
        }
        this.networkUnavailableJob = null;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.markOnScreenCardsAsRead();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void onRefresh() {
        Braze.Companion companion = Braze.Companion;
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        companion.getInstance(requireContext).requestContentCardsRefresh();
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 2500L, null, new ContentCardsFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Braze.Companion companion = Braze.Companion;
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        companion.getInstance(requireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            this.contentCardsUpdatedSubscriber = new a(this, 0);
        }
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = this.contentCardsUpdatedSubscriber;
        if (iEventSubscriber != null) {
            Context requireContext2 = requireContext();
            j.e(requireContext2, "requireContext()");
            companion.getInstance(requireContext2).subscribeToContentCardsUpdates(iEventSubscriber);
        }
        Context requireContext3 = requireContext();
        j.e(requireContext3, "requireContext()");
        companion.getInstance(requireContext3).requestContentCardsRefreshFromCache();
        Context requireContext4 = requireContext();
        j.e(requireContext4, "requireContext()");
        companion.getInstance(requireContext4).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        if (this.sdkDataWipeEventSubscriber == null) {
            this.sdkDataWipeEventSubscriber = new com.amazon.aps.iva.y9.j(this, 1);
        }
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber2 = this.sdkDataWipeEventSubscriber;
        if (iEventSubscriber2 != null) {
            Context requireContext5 = requireContext();
            j.e(requireContext5, "requireContext()");
            companion.getInstance(requireContext5).addSingleSynchronousSubscription(iEventSubscriber2, SdkDataWipeEvent.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        RecyclerView.p layoutManager;
        j.f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            bundle.putParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", layoutManager.onSaveInstanceState());
        }
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            bundle.putStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY", new ArrayList<>(contentCardAdapter.getImpressedCardIds()));
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            bundle.putParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            bundle.putParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsUpdateHandler);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        IContentCardsUpdateHandler iContentCardsUpdateHandler;
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler;
        Object parcelable;
        Object parcelable2;
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                parcelable2 = bundle.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsUpdateHandler.class);
                iContentCardsUpdateHandler = (IContentCardsUpdateHandler) parcelable2;
            } else {
                iContentCardsUpdateHandler = (IContentCardsUpdateHandler) bundle.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY");
            }
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            if (i >= 33) {
                parcelable = bundle.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsViewBindingHandler.class);
                iContentCardsViewBindingHandler = (IContentCardsViewBindingHandler) parcelable;
            } else {
                iContentCardsViewBindingHandler = (IContentCardsViewBindingHandler) bundle.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY");
            }
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
            c cVar = r0.a;
            i.d(brazeCoroutineScope, k.a, null, new ContentCardsFragment$onViewStateRestored$1(bundle, this, null), 2);
        }
        initializeRecyclerView();
    }

    public final void setContentCardUpdateHandler(IContentCardsUpdateHandler iContentCardsUpdateHandler) {
        this.customContentCardUpdateHandler = iContentCardsUpdateHandler;
    }

    public final void setContentCardsViewBindingHandler(IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        this.customContentCardsViewBindingHandler = iContentCardsViewBindingHandler;
    }

    public final void setDefaultEmptyContentCardsAdapter(EmptyContentCardsAdapter emptyContentCardsAdapter) {
        j.f(emptyContentCardsAdapter, "<set-?>");
        this.defaultEmptyContentCardsAdapter = emptyContentCardsAdapter;
    }

    public final void swapRecyclerViewAdapter(RecyclerView.h<?> hVar) {
        j.f(hVar, "newAdapter");
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && recyclerView.getAdapter() != hVar) {
            recyclerView.setAdapter(hVar);
        }
    }
}
