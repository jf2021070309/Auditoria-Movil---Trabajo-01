package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.BannerImageCard;
import com.braze.models.cards.Card;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import kotlin.Metadata;
/* compiled from: BannerImageContentCardView.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/contentcards/view/BannerImageContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/braze/models/cards/BannerImageCard;", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "createViewHolder", "viewHolder", "Lcom/braze/models/cards/Card;", "card", "Lcom/amazon/aps/iva/kb0/q;", "bindViewHolder", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ViewHolder", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BannerImageContentCardView extends BaseContentCardView<BannerImageCard> {

    /* compiled from: BannerImageContentCardView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/braze/ui/contentcards/view/BannerImageContentCardView$ViewHolder;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "view", "Landroid/view/View;", "(Lcom/braze/ui/contentcards/view/BannerImageContentCardView;Landroid/view/View;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public final class ViewHolder extends ContentCardViewHolder {
        private final ImageView imageView;
        final /* synthetic */ BannerImageContentCardView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(BannerImageContentCardView bannerImageContentCardView, View view) {
            super(view, bannerImageContentCardView.isUnreadIndicatorEnabled());
            j.f(view, "view");
            this.this$0 = bannerImageContentCardView;
            this.imageView = (ImageView) view.findViewById(R$id.com_braze_content_cards_banner_image_card_image);
        }

        public final ImageView getImageView() {
            return this.imageView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerImageContentCardView(Context context) {
        super(context);
        j.f(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        j.f(contentCardViewHolder, "viewHolder");
        j.f(card, "card");
        if (card instanceof BannerImageCard) {
            super.bindViewHolder(contentCardViewHolder, card);
            BannerImageCard bannerImageCard = (BannerImageCard) card;
            setOptionalCardImage(((ViewHolder) contentCardViewHolder).getImageView(), bannerImageCard.getAspectRatio(), bannerImageCard.getImageUrl(), card);
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        j.f(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_banner_image_content_card, viewGroup, false);
        j.e(inflate, "view");
        setViewBackground(inflate);
        return new ViewHolder(this, inflate);
    }
}
