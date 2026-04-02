package com.braze.ui.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.amazon.aps.iva.dc.a;
import com.braze.models.cards.BannerImageCard;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$drawable;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.braze.ui.actions.IAction;
import com.braze.ui.feed.view.BaseFeedCardView;
/* loaded from: classes.dex */
public class BannerImageCardView extends BaseFeedCardView<BannerImageCard> {
    private static final String TAG = BrazeLogger.getBrazeLogTag(BannerImageCardView.class);
    private float mAspectRatio;
    private IAction mCardAction;
    private final ImageView mImage;

    public BannerImageCardView(Context context) {
        this(context, null);
    }

    public /* synthetic */ void lambda$onSetCard$0(BannerImageCard bannerImageCard, View view) {
        handleCardClick(this.applicationContext, bannerImageCard, this.mCardAction);
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public int getLayoutResource() {
        return R$layout.com_braze_banner_image_card;
    }

    public BannerImageCardView(Context context, BannerImageCard bannerImageCard) {
        super(context);
        this.mAspectRatio = 6.0f;
        ImageView imageView = (ImageView) getProperViewFromInflatedStub(R$id.com_braze_banner_image_card_imageview_stub);
        this.mImage = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(true);
        if (bannerImageCard != null) {
            setCard(bannerImageCard);
        }
        setBackground(getResources().getDrawable(R$drawable.com_braze_card_background));
    }

    @Override // com.braze.ui.feed.view.BaseFeedCardView
    public void onSetCard(BannerImageCard bannerImageCard) {
        if (bannerImageCard.getAspectRatio() != 0.0f) {
            this.mAspectRatio = bannerImageCard.getAspectRatio();
        }
        setImageViewToUrl(this.mImage, bannerImageCard.getImageUrl(), this.mAspectRatio, bannerImageCard);
        this.mCardAction = BaseCardView.getUriActionForCard(bannerImageCard);
        setOnClickListener(new a(0, this, bannerImageCard));
    }
}
