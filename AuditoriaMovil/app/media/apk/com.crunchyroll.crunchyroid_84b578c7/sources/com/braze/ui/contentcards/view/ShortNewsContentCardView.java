package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.Card;
import com.braze.models.cards.ShortNewsCard;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.google.android.gms.cast.MediaTrack;
import kotlin.Metadata;
/* compiled from: ShortNewsContentCardView.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u0011B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0012"}, d2 = {"Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/braze/models/cards/ShortNewsCard;", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "createViewHolder", "viewHolder", "Lcom/braze/models/cards/Card;", "card", "Lcom/amazon/aps/iva/kb0/q;", "bindViewHolder", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "ViewHolder", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class ShortNewsContentCardView extends BaseContentCardView<ShortNewsCard> {
    public static final Companion Companion = new Companion(null);

    /* compiled from: ShortNewsContentCardView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$Companion;", "", "()V", "ASPECT_RATIO", "", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    /* compiled from: ShortNewsContentCardView.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/contentcards/view/ShortNewsContentCardView$ViewHolder;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "view", "Landroid/view/View;", "(Lcom/braze/ui/contentcards/view/ShortNewsContentCardView;Landroid/view/View;)V", MediaTrack.ROLE_DESCRIPTION, "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "title", "getTitle", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public final class ViewHolder extends ContentCardViewHolder {
        private final TextView description;
        private final ImageView imageView;
        final /* synthetic */ ShortNewsContentCardView this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(ShortNewsContentCardView shortNewsContentCardView, View view) {
            super(view, shortNewsContentCardView.isUnreadIndicatorEnabled());
            j.f(view, "view");
            this.this$0 = shortNewsContentCardView;
            this.title = (TextView) view.findViewById(R$id.com_braze_content_cards_short_news_card_title);
            this.description = (TextView) view.findViewById(R$id.com_braze_content_cards_short_news_card_description);
            this.imageView = (ImageView) view.findViewById(R$id.com_braze_content_cards_short_news_card_image);
        }

        public final TextView getDescription() {
            return this.description;
        }

        public final ImageView getImageView() {
            return this.imageView;
        }

        public final TextView getTitle() {
            return this.title;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortNewsContentCardView(Context context) {
        super(context);
        j.f(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        boolean z;
        String domain;
        j.f(contentCardViewHolder, "viewHolder");
        j.f(card, "card");
        if (card instanceof ShortNewsCard) {
            super.bindViewHolder(contentCardViewHolder, card);
            ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
            TextView title = viewHolder.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((ShortNewsCard) card).getTitle());
            }
            TextView description = viewHolder.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((ShortNewsCard) card).getDescription());
            }
            ShortNewsCard shortNewsCard = (ShortNewsCard) card;
            String domain2 = shortNewsCard.getDomain();
            if (domain2 != null && !m.b0(domain2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                domain = card.getUrl();
            } else {
                domain = shortNewsCard.getDomain();
            }
            if (domain != null) {
                viewHolder.setActionHintText(domain);
            }
            setOptionalCardImage(viewHolder.getImageView(), 1.0f, shortNewsCard.getImageUrl(), card);
            safeSetClipToOutline(viewHolder.getImageView());
            View view = contentCardViewHolder.itemView;
            view.setContentDescription(shortNewsCard.getTitle() + " . " + shortNewsCard.getDescription());
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        j.f(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_short_news_content_card, viewGroup, false);
        j.e(inflate, "view");
        setViewBackground(inflate);
        return new ViewHolder(this, inflate);
    }
}
