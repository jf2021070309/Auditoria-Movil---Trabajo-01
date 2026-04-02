package com.braze.ui.feed.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.amazon.aps.iva.g1.m;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$id;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.BrazeFeedManager;
import com.braze.ui.feed.BrazeImageSwitcher;
import com.braze.ui.feed.view.BaseFeedCardView;
import com.braze.ui.widget.BaseCardView;
/* loaded from: classes.dex */
public abstract class BaseFeedCardView<T extends Card> extends BaseCardView<T> {
    private static final String TAG = BrazeLogger.getBrazeLogTag(BaseCardView.class);

    public BaseFeedCardView(Context context) {
        super(context);
        BrazeImageSwitcher brazeImageSwitcher;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResource(), this);
        BrazeImageSwitcher brazeImageSwitcher2 = (BrazeImageSwitcher) findViewById(R$id.com_braze_newsfeed_item_read_indicator_image_switcher);
        this.imageSwitcher = brazeImageSwitcher2;
        if (brazeImageSwitcher2 != null) {
            brazeImageSwitcher2.setFactory(new ViewSwitcher.ViewFactory() { // from class: com.amazon.aps.iva.wb.a
                @Override // android.widget.ViewSwitcher.ViewFactory
                public final View makeView() {
                    View lambda$new$0;
                    lambda$new$0 = BaseFeedCardView.this.lambda$new$0();
                    return lambda$new$0;
                }
            });
        }
        if (!isUnreadIndicatorEnabled() && (brazeImageSwitcher = this.imageSwitcher) != null) {
            brazeImageSwitcher.setVisibility(8);
        }
    }

    public static /* synthetic */ void b(BaseFeedCardView baseFeedCardView) {
        baseFeedCardView.lambda$setCard$1();
    }

    public /* synthetic */ View lambda$new$0() {
        return new ImageView(this.applicationContext);
    }

    public /* synthetic */ void lambda$setCard$1() {
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }

    public Card getCard() {
        return this.card;
    }

    public abstract int getLayoutResource();

    public View getProperViewFromInflatedStub(int i) {
        ((ViewStub) findViewById(i)).inflate();
        return findViewById(R$id.com_braze_stubbed_feed_image_view);
    }

    @Override // com.braze.ui.widget.BaseCardView
    public boolean isClickHandled(Context context, Card card, IAction iAction) {
        return BrazeFeedManager.getInstance().getFeedCardClickActionListener().onFeedCardClicked(context, card, iAction);
    }

    public abstract void onSetCard(T t);

    public void setCard(T t) {
        this.card = t;
        onSetCard(t);
        this.card.setListener(new m(this));
        setCardViewedIndicator(this.imageSwitcher, getCard());
    }
}
