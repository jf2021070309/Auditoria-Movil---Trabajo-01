package com.braze.ui.contentcards.listeners;

import android.content.Context;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.Card;
import com.braze.ui.actions.IAction;
import kotlin.Metadata;
/* compiled from: IContentCardsActionListener.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "", "Landroid/content/Context;", "context", "Lcom/braze/models/cards/Card;", "card", "Lcom/braze/ui/actions/IAction;", "cardAction", "", "onContentCardClicked", "Lcom/amazon/aps/iva/kb0/q;", "onContentCardDismissed", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IContentCardsActionListener {
    default boolean onContentCardClicked(Context context, Card card, IAction iAction) {
        j.f(context, "context");
        j.f(card, "card");
        return false;
    }

    default void onContentCardDismissed(Context context, Card card) {
        j.f(context, "context");
        j.f(card, "card");
    }
}
