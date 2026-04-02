package com.braze.ui.contentcards.handlers;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.CardType;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.view.BannerImageContentCardView;
import com.braze.ui.contentcards.view.BaseContentCardView;
import com.braze.ui.contentcards.view.CaptionedImageContentCardView;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import com.braze.ui.contentcards.view.DefaultContentCardView;
import com.braze.ui.contentcards.view.ShortNewsContentCardView;
import com.braze.ui.contentcards.view.TextAnnouncementContentCardView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: DefaultContentCardsViewBindingHandler.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ.\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J.\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0016J&\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u001c\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u0016\u001a\u00020\tH\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\tH\u0016R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "Landroid/content/Context;", "context", "", "Lcom/braze/models/cards/Card;", "cards", "Landroid/view/ViewGroup;", "viewGroup", "", "viewType", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "onCreateViewHolder", "viewHolder", "adapterPosition", "Lcom/amazon/aps/iva/kb0/q;", "onBindViewHolder", "getItemViewType", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/ui/contentcards/view/BaseContentCardView;", "getContentCardsViewFromCache", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "", "contentCardViewCache", "Ljava/util/Map;", "<init>", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class DefaultContentCardsViewBindingHandler implements IContentCardsViewBindingHandler {
    private final Map<CardType, BaseContentCardView<?>> contentCardViewCache = new LinkedHashMap();
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultContentCardsViewBindingHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsViewBindingHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsViewBindingHandler createFromParcel(Parcel parcel) {
            j.f(parcel, FirebaseAnalytics.Param.SOURCE);
            return new DefaultContentCardsViewBindingHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsViewBindingHandler[] newArray(int i) {
            return new DefaultContentCardsViewBindingHandler[i];
        }
    };

    /* compiled from: DefaultContentCardsViewBindingHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/braze/ui/contentcards/handlers/DefaultContentCardsViewBindingHandler;", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    /* compiled from: DefaultContentCardsViewBindingHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardType.values().length];
            try {
                iArr[CardType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final BaseContentCardView<?> getContentCardsViewFromCache(Context context, CardType cardType) {
        BaseContentCardView<?> bannerImageContentCardView;
        j.f(context, "context");
        j.f(cardType, "cardType");
        if (!this.contentCardViewCache.containsKey(cardType) || this.contentCardViewCache.get(cardType) == null) {
            int i = WhenMappings.$EnumSwitchMapping$0[cardType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            bannerImageContentCardView = new DefaultContentCardView(context);
                        } else {
                            bannerImageContentCardView = new TextAnnouncementContentCardView(context);
                        }
                    } else {
                        bannerImageContentCardView = new ShortNewsContentCardView(context);
                    }
                } else {
                    bannerImageContentCardView = new CaptionedImageContentCardView(context);
                }
            } else {
                bannerImageContentCardView = new BannerImageContentCardView(context);
            }
            this.contentCardViewCache.put(cardType, bannerImageContentCardView);
        }
        BaseContentCardView<?> baseContentCardView = this.contentCardViewCache.get(cardType);
        if (baseContentCardView == null) {
            return new DefaultContentCardView(context);
        }
        return baseContentCardView;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public int getItemViewType(Context context, List<? extends Card> list, int i) {
        j.f(context, "context");
        j.f(list, "cards");
        if (i >= 0 && i < list.size()) {
            return list.get(i).getCardType().getValue();
        }
        return -1;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public void onBindViewHolder(Context context, List<? extends Card> list, ContentCardViewHolder contentCardViewHolder, int i) {
        j.f(context, "context");
        j.f(list, "cards");
        j.f(contentCardViewHolder, "viewHolder");
        if (i >= 0 && i < list.size()) {
            Card card = list.get(i);
            getContentCardsViewFromCache(context, card.getCardType()).bindViewHolder(contentCardViewHolder, card);
        }
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public ContentCardViewHolder onCreateViewHolder(Context context, List<? extends Card> list, ViewGroup viewGroup, int i) {
        j.f(context, "context");
        j.f(list, "cards");
        j.f(viewGroup, "viewGroup");
        return getContentCardsViewFromCache(context, CardType.Companion.fromValue(i)).createViewHolder(viewGroup);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "dest");
    }
}
