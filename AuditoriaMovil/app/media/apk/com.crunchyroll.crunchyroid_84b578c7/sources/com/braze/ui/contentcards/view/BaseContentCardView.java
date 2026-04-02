package com.braze.ui.contentcards.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.Card;
import com.braze.ui.R$drawable;
import com.braze.ui.actions.IAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.view.BaseContentCardView;
import com.braze.ui.widget.BaseCardView;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: BaseContentCardView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0001H\u0016J*\u0010\u0012\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\u0001J\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0005J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0004¨\u0006\u001f"}, d2 = {"Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/braze/models/cards/Card;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/braze/ui/widget/BaseCardView;", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "createViewHolder", "viewHolder", "card", "Lcom/amazon/aps/iva/kb0/q;", "bindViewHolder", "Landroid/widget/ImageView;", "imageView", "", "cardAspectRatio", "", "cardImageUrl", "setOptionalCardImage", "Landroid/content/Context;", "context", "Lcom/braze/ui/actions/IAction;", "cardAction", "", "isClickHandled", "safeSetClipToOutline", "Landroid/view/View;", "view", "setViewBackground", "<init>", "(Landroid/content/Context;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class BaseContentCardView<T extends Card> extends BaseCardView<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentCardView(Context context) {
        super(context);
        j.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewHolder$lambda$0(BaseContentCardView baseContentCardView, Card card, UriAction uriAction, View view) {
        j.f(baseContentCardView, "this$0");
        j.f(card, "$card");
        baseContentCardView.handleCardClick(baseContentCardView.applicationContext, card, uriAction);
    }

    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, final Card card) {
        boolean z;
        j.f(contentCardViewHolder, "viewHolder");
        j.f(card, "card");
        contentCardViewHolder.setPinnedIconVisible(card.isPinned());
        boolean z2 = true;
        if (this.configurationProvider.isContentCardsUnreadVisualIndicatorEnabled() && !card.isIndicatorHighlighted()) {
            z = true;
        } else {
            z = false;
        }
        contentCardViewHolder.setUnreadBarVisible(z);
        final UriAction uriActionForCard = BaseCardView.getUriActionForCard(card);
        contentCardViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.amazon.aps.iva.vb.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseContentCardView.bindViewHolder$lambda$0(BaseContentCardView.this, card, uriActionForCard, view);
            }
        });
        if (uriActionForCard == null) {
            z2 = false;
        }
        contentCardViewHolder.setActionHintVisible(z2);
    }

    public abstract ContentCardViewHolder createViewHolder(ViewGroup viewGroup);

    @Override // com.braze.ui.widget.BaseCardView
    public boolean isClickHandled(Context context, Card card, IAction iAction) {
        j.f(context, "context");
        j.f(card, "card");
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.Companion.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener == null || !contentCardsActionListener.onContentCardClicked(context, card, iAction)) {
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public final void safeSetClipToOutline(ImageView imageView) {
        if (imageView != null) {
            imageView.setClipToOutline(true);
        }
    }

    public final void setOptionalCardImage(ImageView imageView, float f, String str, Card card) {
        j.f(card, "card");
        if (imageView != null && str != null) {
            setImageViewToUrl(imageView, str, f, card);
        }
    }

    public final void setViewBackground(View view) {
        j.f(view, "view");
        view.setBackground(getResources().getDrawable(R$drawable.com_braze_content_card_background));
        view.setForeground(getResources().getDrawable(R$drawable.com_braze_content_card_scrim));
    }
}
