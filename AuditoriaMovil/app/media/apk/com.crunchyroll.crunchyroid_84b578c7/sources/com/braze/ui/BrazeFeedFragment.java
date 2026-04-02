package com.braze.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.h;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amazon.aps.iva.d6.a;
import com.amazon.aps.iva.i4.d;
import com.amazon.aps.iva.n4.d0;
import com.amazon.aps.iva.p3.e;
import com.amazon.aps.iva.rb.b;
import com.braze.Braze;
import com.braze.enums.CardCategory;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeFeedFragment;
import com.braze.ui.adapters.BrazeListAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class BrazeFeedFragment extends d0 implements SwipeRefreshLayout.f {
    private static final String TAG = BrazeLogger.getBrazeLogTag(BrazeFeedFragment.class);
    private BrazeListAdapter mAdapter;
    private EnumSet<CardCategory> mCategories;
    private LinearLayout mEmptyFeedLayout;
    private RelativeLayout mFeedRootLayout;
    private SwipeRefreshLayout mFeedSwipeLayout;
    private IEventSubscriber<FeedUpdatedEvent> mFeedUpdatedSubscriber;
    private e mGestureDetector;
    private ProgressBar mLoadingSpinner;
    private LinearLayout mNetworkErrorLayout;
    private View mTransparentFullBoundsContainerView;
    private final Handler mMainThreadLooper = new Handler(Looper.getMainLooper());
    private final Runnable mShowNetworkError = new Runnable() { // from class: com.braze.ui.BrazeFeedFragment.1
        @Override // java.lang.Runnable
        public void run() {
            if (BrazeFeedFragment.this.mLoadingSpinner != null) {
                BrazeFeedFragment.this.mLoadingSpinner.setVisibility(8);
            }
            if (BrazeFeedFragment.this.mNetworkErrorLayout != null) {
                BrazeFeedFragment.this.mNetworkErrorLayout.setVisibility(0);
            }
        }
    };
    private boolean mSortEnabled = false;
    boolean mSkipCardImpressionsReset = false;
    int mPreviousVisibleHeadCardIndex = 0;
    int mCurrentCardIndexAtBottomOfScreen = 0;

    /* loaded from: classes.dex */
    public class FeedGestureListener extends GestureDetector.SimpleOnGestureListener {
        public FeedGestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            long eventTime = (motionEvent2.getEventTime() - motionEvent.getEventTime()) * 2;
            BrazeFeedFragment.this.getListView().smoothScrollBy(-((int) ((f2 * ((float) eventTime)) / 1000.0f)), (int) (eventTime * 2));
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            BrazeFeedFragment.this.getListView().smoothScrollBy((int) f2, 0);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onRefresh$5() {
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onViewCreated$0(View view, MotionEvent motionEvent) {
        return this.mGestureDetector.a(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$onViewCreated$1(View view, MotionEvent motionEvent) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$2(FeedUpdatedEvent feedUpdatedEvent, ListView listView) {
        String str = TAG;
        BrazeLogger.v(str, "Updating feed views in response to FeedUpdatedEvent: " + feedUpdatedEvent);
        this.mMainThreadLooper.removeCallbacks(this.mShowNetworkError);
        this.mNetworkErrorLayout.setVisibility(8);
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            listView.setVisibility(8);
            this.mAdapter.clear();
        } else {
            this.mEmptyFeedLayout.setVisibility(8);
            this.mLoadingSpinner.setVisibility(8);
            this.mTransparentFullBoundsContainerView.setVisibility(8);
        }
        if (feedUpdatedEvent.isFromOfflineStorage() && (feedUpdatedEvent.lastUpdatedInSecondsFromEpoch() + 60) * 1000 < System.currentTimeMillis()) {
            BrazeLogger.i(str, "Feed received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.");
            Braze.getInstance(getContext()).requestFeedRefresh();
            if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
                BrazeLogger.d(str, "Old feed was empty, putting up a network spinner and registering the network error message with a delay of 5000ms.");
                this.mEmptyFeedLayout.setVisibility(8);
                this.mLoadingSpinner.setVisibility(0);
                this.mTransparentFullBoundsContainerView.setVisibility(0);
                this.mMainThreadLooper.postDelayed(this.mShowNetworkError, 5000L);
                return;
            }
        }
        if (feedUpdatedEvent.getCardCount(this.mCategories) == 0) {
            this.mLoadingSpinner.setVisibility(8);
            this.mEmptyFeedLayout.setVisibility(0);
            this.mTransparentFullBoundsContainerView.setVisibility(0);
        } else {
            if (this.mSortEnabled && feedUpdatedEvent.getCardCount(this.mCategories) != feedUpdatedEvent.getUnreadCardCount(this.mCategories)) {
                this.mAdapter.replaceFeed(sortFeedCards(feedUpdatedEvent.getFeedCards(this.mCategories)));
            } else {
                this.mAdapter.replaceFeed(feedUpdatedEvent.getFeedCards(this.mCategories));
            }
            listView.setVisibility(0);
        }
        this.mFeedSwipeLayout.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$3(ListView listView, FeedUpdatedEvent feedUpdatedEvent) {
        h activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new d(this, 5, feedUpdatedEvent, listView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortFeedCards$4(Card card, Card card2) {
        if (card.isIndicatorHighlighted() == card2.isIndicatorHighlighted()) {
            return 0;
        }
        if (card.isIndicatorHighlighted()) {
            return 1;
        }
        return -1;
    }

    private void setOnScreenCardsToRead() {
        this.mAdapter.batchSetCardsToRead(this.mPreviousVisibleHeadCardIndex, this.mCurrentCardIndexAtBottomOfScreen);
    }

    public void loadFragmentStateFromSavedInstanceState(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (this.mCategories == null) {
            this.mCategories = CardCategory.getAllCategories();
        }
        this.mPreviousVisibleHeadCardIndex = bundle.getInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", 0);
        this.mCurrentCardIndexAtBottomOfScreen = bundle.getInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", 0);
        this.mSkipCardImpressionsReset = bundle.getBoolean("SKIP_CARD_IMPRESSIONS_RESET", false);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("CARD_CATEGORY");
        if (stringArrayList != null) {
            this.mCategories.clear();
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                this.mCategories.add(CardCategory.valueOf(it.next()));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.mAdapter == null) {
            this.mAdapter = new BrazeListAdapter(context, R$id.tag, new ArrayList());
            this.mCategories = CardCategory.getAllCategories();
        }
        this.mGestureDetector = new e(context, new FeedGestureListener());
    }

    @Override // com.amazon.aps.iva.n4.d0, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R$layout.com_braze_feed, viewGroup, false);
        this.mNetworkErrorLayout = (LinearLayout) inflate.findViewById(R$id.com_braze_feed_network_error);
        this.mLoadingSpinner = (ProgressBar) inflate.findViewById(R$id.com_braze_feed_loading_spinner);
        this.mEmptyFeedLayout = (LinearLayout) inflate.findViewById(R$id.com_braze_feed_empty_feed);
        this.mFeedRootLayout = (RelativeLayout) inflate.findViewById(R$id.com_braze_feed_root);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.braze_feed_swipe_container);
        this.mFeedSwipeLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.mFeedSwipeLayout.setEnabled(false);
        this.mFeedSwipeLayout.setColorSchemeResources(R$color.com_braze_newsfeed_swipe_refresh_color_1, R$color.com_braze_newsfeed_swipe_refresh_color_2, R$color.com_braze_newsfeed_swipe_refresh_color_3, R$color.com_braze_newsfeed_swipe_refresh_color_4);
        this.mTransparentFullBoundsContainerView = inflate.findViewById(R$id.com_braze_feed_transparent_full_bounds_container_view);
        return inflate;
    }

    @Override // com.amazon.aps.iva.n4.d0, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Braze.getInstance(getContext()).removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        setOnScreenCardsToRead();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        setListAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        setOnScreenCardsToRead();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void onRefresh() {
        Braze.getInstance(getContext()).requestFeedRefresh();
        this.mMainThreadLooper.postDelayed(new com.amazon.aps.iva.m6.e(this, 4), 2500L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Braze.getInstance(getContext()).logFeedDisplayed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("PREVIOUS_VISIBLE_HEAD_CARD_INDEX", this.mPreviousVisibleHeadCardIndex);
        bundle.putInt("CURRENT_CARD_INDEX_AT_BOTTOM_OF_SCREEN", this.mCurrentCardIndexAtBottomOfScreen);
        bundle.putBoolean("SKIP_CARD_IMPRESSIONS_RESET", this.mSkipCardImpressionsReset);
        if (this.mCategories == null) {
            this.mCategories = CardCategory.getAllCategories();
        }
        ArrayList<String> arrayList = new ArrayList<>(this.mCategories.size());
        Iterator<E> it = this.mCategories.iterator();
        while (it.hasNext()) {
            arrayList.add(((CardCategory) it.next()).name());
        }
        bundle.putStringArrayList("CARD_CATEGORY", arrayList);
        super.onSaveInstanceState(bundle);
        if (isVisible()) {
            this.mSkipCardImpressionsReset = true;
        }
    }

    @Override // com.amazon.aps.iva.n4.d0, androidx.fragment.app.Fragment
    @SuppressLint({"InflateParams"})
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        loadFragmentStateFromSavedInstanceState(bundle);
        if (this.mSkipCardImpressionsReset) {
            this.mSkipCardImpressionsReset = false;
        } else {
            this.mAdapter.resetCardImpressionTracker();
            BrazeLogger.d(TAG, "Resetting card impressions.");
        }
        LayoutInflater from = LayoutInflater.from(getActivity());
        final ListView listView = getListView();
        listView.addHeaderView(from.inflate(R$layout.com_braze_feed_header, (ViewGroup) null));
        listView.addFooterView(from.inflate(R$layout.com_braze_feed_footer, (ViewGroup) null));
        this.mFeedRootLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.aps.iva.rb.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$onViewCreated$0;
                lambda$onViewCreated$0 = BrazeFeedFragment.this.lambda$onViewCreated$0(view2, motionEvent);
                return lambda$onViewCreated$0;
            }
        });
        listView.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: com.braze.ui.BrazeFeedFragment.2
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                boolean z;
                SwipeRefreshLayout swipeRefreshLayout = BrazeFeedFragment.this.mFeedSwipeLayout;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                swipeRefreshLayout.setEnabled(z);
                if (i2 == 0) {
                    return;
                }
                int i4 = i - 1;
                BrazeFeedFragment brazeFeedFragment = BrazeFeedFragment.this;
                if (i4 > brazeFeedFragment.mPreviousVisibleHeadCardIndex) {
                    brazeFeedFragment.mAdapter.batchSetCardsToRead(BrazeFeedFragment.this.mPreviousVisibleHeadCardIndex, i4);
                }
                BrazeFeedFragment brazeFeedFragment2 = BrazeFeedFragment.this;
                brazeFeedFragment2.mPreviousVisibleHeadCardIndex = i4;
                brazeFeedFragment2.mCurrentCardIndexAtBottomOfScreen = i + i2;
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i) {
            }
        });
        this.mTransparentFullBoundsContainerView.setOnTouchListener(new b());
        Braze.getInstance(getContext()).removeSingleSubscription(this.mFeedUpdatedSubscriber, FeedUpdatedEvent.class);
        this.mFeedUpdatedSubscriber = new IEventSubscriber() { // from class: com.amazon.aps.iva.rb.c
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                BrazeFeedFragment.this.lambda$onViewCreated$3(listView, (FeedUpdatedEvent) obj);
            }
        };
        Braze.getInstance(getContext()).subscribeToFeedUpdates(this.mFeedUpdatedSubscriber);
        listView.setAdapter((ListAdapter) this.mAdapter);
        Braze.getInstance(getContext()).requestFeedRefreshFromCache();
    }

    public List<Card> sortFeedCards(List<Card> list) {
        Collections.sort(list, new a(2));
        return list;
    }
}
