package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.Card;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.google.android.gms.cast.MediaTrack;
import kotlin.Metadata;
/* compiled from: TextAnnouncementContentCardView.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/contentcards/view/TextAnnouncementContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/braze/models/cards/TextAnnouncementCard;", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "createViewHolder", "viewHolder", "Lcom/braze/models/cards/Card;", "card", "Lcom/amazon/aps/iva/kb0/q;", "bindViewHolder", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ViewHolder", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class TextAnnouncementContentCardView extends BaseContentCardView<TextAnnouncementCard> {

    /* compiled from: TextAnnouncementContentCardView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/contentcards/view/TextAnnouncementContentCardView$ViewHolder;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "view", "Landroid/view/View;", "(Lcom/braze/ui/contentcards/view/TextAnnouncementContentCardView;Landroid/view/View;)V", MediaTrack.ROLE_DESCRIPTION, "Landroid/widget/TextView;", "getDescription", "()Landroid/widget/TextView;", "title", "getTitle", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public final class ViewHolder extends ContentCardViewHolder {
        private final TextView description;
        final /* synthetic */ TextAnnouncementContentCardView this$0;
        private final TextView title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(TextAnnouncementContentCardView textAnnouncementContentCardView, View view) {
            super(view, textAnnouncementContentCardView.isUnreadIndicatorEnabled());
            j.f(view, "view");
            this.this$0 = textAnnouncementContentCardView;
            this.title = (TextView) view.findViewById(R$id.com_braze_content_cards_text_announcement_card_title);
            this.description = (TextView) view.findViewById(R$id.com_braze_content_cards_text_announcement_card_description);
        }

        public final TextView getDescription() {
            return this.description;
        }

        public final TextView getTitle() {
            return this.title;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAnnouncementContentCardView(Context context) {
        super(context);
        j.f(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        boolean z;
        String domain;
        j.f(contentCardViewHolder, "viewHolder");
        j.f(card, "card");
        if (card instanceof TextAnnouncementCard) {
            super.bindViewHolder(contentCardViewHolder, card);
            ViewHolder viewHolder = (ViewHolder) contentCardViewHolder;
            TextView title = viewHolder.getTitle();
            if (title != null) {
                setOptionalTextView(title, ((TextAnnouncementCard) card).getTitle());
            }
            TextView description = viewHolder.getDescription();
            if (description != null) {
                setOptionalTextView(description, ((TextAnnouncementCard) card).getDescription());
            }
            TextAnnouncementCard textAnnouncementCard = (TextAnnouncementCard) card;
            String domain2 = textAnnouncementCard.getDomain();
            if (domain2 != null && !m.b0(domain2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                domain = card.getUrl();
            } else {
                domain = textAnnouncementCard.getDomain();
            }
            if (domain != null) {
                viewHolder.setActionHintText(domain);
            }
            View view = contentCardViewHolder.itemView;
            view.setContentDescription(textAnnouncementCard.getTitle() + " . " + textAnnouncementCard.getDescription());
        }
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        j.f(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_text_announcement_content_card, viewGroup, false);
        j.e(inflate, "view");
        setViewBackground(inflate);
        return new ViewHolder(this, inflate);
    }
}
