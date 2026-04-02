package com.braze.ui.contentcards.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.Card;
import com.braze.ui.R$layout;
import kotlin.Metadata;
/* compiled from: DefaultContentCardView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/contentcards/view/DefaultContentCardView;", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "Lcom/braze/models/cards/Card;", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "createViewHolder", "viewHolder", "card", "Lcom/amazon/aps/iva/kb0/q;", "bindViewHolder", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class DefaultContentCardView extends BaseContentCardView<Card> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultContentCardView(Context context) {
        super(context);
        j.f(context, "context");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public void bindViewHolder(ContentCardViewHolder contentCardViewHolder, Card card) {
        j.f(contentCardViewHolder, "viewHolder");
        j.f(card, "card");
    }

    @Override // com.braze.ui.contentcards.view.BaseContentCardView
    public ContentCardViewHolder createViewHolder(ViewGroup viewGroup) {
        j.f(viewGroup, "viewGroup");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.com_braze_default_content_card, viewGroup, false);
        j.e(inflate, "view");
        return new ContentCardViewHolder(inflate, false);
    }
}
