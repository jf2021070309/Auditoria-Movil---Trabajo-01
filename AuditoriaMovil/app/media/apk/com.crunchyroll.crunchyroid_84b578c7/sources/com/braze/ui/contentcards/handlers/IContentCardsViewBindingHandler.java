package com.braze.ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import java.util.List;
import kotlin.Metadata;
/* compiled from: IContentCardsViewBindingHandler.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&J.\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH&J&\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Landroid/os/Parcelable;", "Landroid/content/Context;", "context", "", "Lcom/braze/models/cards/Card;", "cards", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "onCreateViewHolder", "viewHolder", "adapterPosition", "Lcom/amazon/aps/iva/kb0/q;", "onBindViewHolder", "getItemViewType", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface IContentCardsViewBindingHandler extends Parcelable {
    int getItemViewType(Context context, List<? extends Card> list, int i);

    void onBindViewHolder(Context context, List<? extends Card> list, ContentCardViewHolder contentCardViewHolder, int i);

    ContentCardViewHolder onCreateViewHolder(Context context, List<? extends Card> list, ViewGroup viewGroup, int i);
}
