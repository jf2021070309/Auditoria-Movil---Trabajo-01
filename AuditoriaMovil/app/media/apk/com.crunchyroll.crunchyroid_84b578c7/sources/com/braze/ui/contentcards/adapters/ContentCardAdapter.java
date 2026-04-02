package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.n;
import com.amazon.aps.iva.b8.s1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ContentCardAdapter.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001>B-\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0014\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0006\u0010\u001d\u001a\u00020\u000eJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0004J\u0012\u0010 \u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J\u0012\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u001aH\u0007R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001a0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00105\u001a\b\u0012\u0004\u0012\u000204038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R0\u00107\u001a\b\u0012\u0004\u0012\u0002040\u00192\f\u00107\u001a\b\u0012\u0004\u0012\u0002040\u00198F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "", FirebaseAnalytics.Param.INDEX, "", "isInvalidIndex", "Landroid/view/ViewGroup;", "viewGroup", "viewType", "onCreateViewHolder", "viewHolder", "position", "Lcom/amazon/aps/iva/kb0/q;", "onBindViewHolder", "getItemViewType", "getItemCount", "onItemDismiss", "isItemDismissable", "holder", "onViewAttachedToWindow", "onViewDetachedFromWindow", "", "getItemId", "", "Lcom/braze/models/cards/Card;", "newCardData", "replaceCards", "markOnScreenCardsAsRead", "adapterPosition", "isControlCardAtPosition", "getCardAtIndex", "isAdapterPositionOnScreen", "card", "logImpression", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "", "cardData", "Ljava/util/List;", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "contentCardsViewBindingHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "", "impressedCardIdsInternal", "Ljava/util/Set;", "impressedCardIds", "getImpressedCardIds", "()Ljava/util/List;", "setImpressedCardIds", "(Ljava/util/List;)V", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "CardListDiffCallback", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class ContentCardAdapter extends RecyclerView.h<ContentCardViewHolder> implements ItemTouchHelperAdapter {
    private final List<Card> cardData;
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;
    private final Context context;
    private final Handler handler;
    private Set<String> impressedCardIdsInternal;
    private final LinearLayoutManager layoutManager;

    /* compiled from: ContentCardAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter$CardListDiffCallback;", "Landroidx/recyclerview/widget/n$b;", "", "oldItemPosition", "newItemPosition", "", "doItemsShareIds", "getOldListSize", "getNewListSize", "areItemsTheSame", "areContentsTheSame", "", "Lcom/braze/models/cards/Card;", "oldCards", "Ljava/util/List;", "newCards", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class CardListDiffCallback extends n.b {
        private final List<Card> newCards;
        private final List<Card> oldCards;

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(List<? extends Card> list, List<? extends Card> list2) {
            j.f(list, "oldCards");
            j.f(list2, "newCards");
            this.oldCards = list;
            this.newCards = list2;
        }

        private final boolean doItemsShareIds(int i, int i2) {
            return j.a(this.oldCards.get(i).getId(), this.newCards.get(i2).getId());
        }

        @Override // androidx.recyclerview.widget.n.b
        public boolean areContentsTheSame(int i, int i2) {
            return doItemsShareIds(i, i2);
        }

        @Override // androidx.recyclerview.widget.n.b
        public boolean areItemsTheSame(int i, int i2) {
            return doItemsShareIds(i, i2);
        }

        @Override // androidx.recyclerview.widget.n.b
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // androidx.recyclerview.widget.n.b
        public int getOldListSize() {
            return this.oldCards.size();
        }
    }

    public ContentCardAdapter(Context context, LinearLayoutManager linearLayoutManager, List<Card> list, IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        j.f(context, "context");
        j.f(linearLayoutManager, "layoutManager");
        j.f(list, "cardData");
        j.f(iContentCardsViewBindingHandler, "contentCardsViewBindingHandler");
        this.context = context;
        this.layoutManager = linearLayoutManager;
        this.cardData = list;
        this.contentCardsViewBindingHandler = iContentCardsViewBindingHandler;
        this.handler = new Handler(Looper.getMainLooper());
        this.impressedCardIdsInternal = new LinkedHashSet();
        setHasStableIds(true);
    }

    private final boolean isInvalidIndex(int i) {
        if (i >= 0 && i < this.cardData.size()) {
            return false;
        }
        return true;
    }

    public static final void markOnScreenCardsAsRead$lambda$1(int i, int i2, ContentCardAdapter contentCardAdapter) {
        j.f(contentCardAdapter, "this$0");
        contentCardAdapter.notifyItemRangeChanged(i2, (i - i2) + 1);
    }

    public static final void onViewDetachedFromWindow$lambda$0(ContentCardAdapter contentCardAdapter, int i) {
        j.f(contentCardAdapter, "this$0");
        contentCardAdapter.notifyItemChanged(i);
    }

    public final Card getCardAtIndex(int i) {
        if (isInvalidIndex(i)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new ContentCardAdapter$getCardAtIndex$1(i, this), 3, (Object) null);
            return null;
        }
        return this.cardData.get(i);
    }

    public final List<String> getImpressedCardIds() {
        return x.X0(this.impressedCardIdsInternal);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i) {
        String id;
        Card cardAtIndex = getCardAtIndex(i);
        if (cardAtIndex != null && (id = cardAtIndex.getId()) != null) {
            return id.hashCode();
        }
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, i);
    }

    public final boolean isAdapterPositionOnScreen(int i) {
        int min = Math.min(this.layoutManager.findFirstVisibleItemPosition(), this.layoutManager.findFirstCompletelyVisibleItemPosition());
        int max = Math.max(this.layoutManager.findLastVisibleItemPosition(), this.layoutManager.findLastCompletelyVisibleItemPosition());
        if (min > i || i > max) {
            return false;
        }
        return true;
    }

    public final boolean isControlCardAtPosition(int i) {
        Card cardAtIndex = getCardAtIndex(i);
        if (cardAtIndex != null && cardAtIndex.isControl()) {
            return true;
        }
        return false;
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int i) {
        if (!this.cardData.isEmpty() && !isInvalidIndex(i)) {
            return this.cardData.get(i).isDismissibleByUser();
        }
        return false;
    }

    public final void logImpression(Card card) {
        if (card == null) {
            return;
        }
        if (!this.impressedCardIdsInternal.contains(card.getId())) {
            card.logImpression();
            this.impressedCardIdsInternal.add(card.getId());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardAdapter$logImpression$1(card), 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardAdapter$logImpression$2(card), 2, (Object) null);
        }
        if (!card.getViewed()) {
            card.setViewed(true);
        }
    }

    public final void markOnScreenCardsAsRead() {
        if (this.cardData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, ContentCardAdapter$markOnScreenCardsAsRead$1.INSTANCE, 3, (Object) null);
            return;
        }
        int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition >= 0 && findLastVisibleItemPosition >= 0) {
            if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                int i = findFirstVisibleItemPosition;
                while (true) {
                    Card cardAtIndex = getCardAtIndex(i);
                    if (cardAtIndex != null) {
                        cardAtIndex.setIndicatorHighlighted(true);
                    }
                    if (i == findLastVisibleItemPosition) {
                        break;
                    }
                    i++;
                }
            }
            this.handler.post(new s1(findLastVisibleItemPosition, findFirstVisibleItemPosition, this));
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new ContentCardAdapter$markOnScreenCardsAsRead$2(findFirstVisibleItemPosition, findLastVisibleItemPosition), 3, (Object) null);
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(int i) {
        if (isInvalidIndex(i)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new ContentCardAdapter$onItemDismiss$1(i, this), 3, (Object) null);
            return;
        }
        Card remove = this.cardData.remove(i);
        remove.setDismissed(true);
        notifyItemRemoved(i);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.Companion.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener != null) {
            contentCardsActionListener.onContentCardDismissed(this.context, remove);
        }
    }

    public final synchronized void replaceCards(List<? extends Card> list) {
        j.f(list, "newCardData");
        n.d a = n.a(new CardListDiffCallback(this.cardData, list));
        this.cardData.clear();
        this.cardData.addAll(list);
        a.a(new b(this));
    }

    public final void setImpressedCardIds(List<String> list) {
        j.f(list, "impressedCardIds");
        this.impressedCardIdsInternal = x.b1(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(ContentCardViewHolder contentCardViewHolder, int i) {
        j.f(contentCardViewHolder, "viewHolder");
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, contentCardViewHolder, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        j.f(viewGroup, "viewGroup");
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(ContentCardViewHolder contentCardViewHolder) {
        j.f(contentCardViewHolder, "holder");
        super.onViewAttachedToWindow((ContentCardAdapter) contentCardViewHolder);
        if (this.cardData.isEmpty()) {
            return;
        }
        int bindingAdapterPosition = contentCardViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && isAdapterPositionOnScreen(bindingAdapterPosition)) {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardAdapter$onViewAttachedToWindow$1(bindingAdapterPosition), 2, (Object) null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(ContentCardViewHolder contentCardViewHolder) {
        j.f(contentCardViewHolder, "holder");
        super.onViewDetachedFromWindow((ContentCardAdapter) contentCardViewHolder);
        if (this.cardData.isEmpty()) {
            return;
        }
        final int bindingAdapterPosition = contentCardViewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && isAdapterPositionOnScreen(bindingAdapterPosition)) {
            Card cardAtIndex = getCardAtIndex(bindingAdapterPosition);
            if (cardAtIndex == null || cardAtIndex.isIndicatorHighlighted()) {
                return;
            }
            cardAtIndex.setIndicatorHighlighted(true);
            this.handler.post(new Runnable() { // from class: com.amazon.aps.iva.ub.a
                @Override // java.lang.Runnable
                public final void run() {
                    ContentCardAdapter.onViewDetachedFromWindow$lambda$0(ContentCardAdapter.this, bindingAdapterPosition);
                }
            });
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new ContentCardAdapter$onViewDetachedFromWindow$1(bindingAdapterPosition), 2, (Object) null);
    }
}
