package com.amazon.aps.iva.od;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.od.c;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.BannerImageCard;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.models.cards.Card;
import com.braze.models.cards.ShortNewsCard;
import com.braze.models.cards.TextAnnouncementCard;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import java.util.List;
/* compiled from: ContentCardBindingHandler.kt */
/* loaded from: classes.dex */
public final class b implements IContentCardsViewBindingHandler {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final l<Card, q> b;

    /* compiled from: ContentCardBindingHandler.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            j.f(parcel, "in");
            return new b(com.amazon.aps.iva.od.a.h);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(l<? super Card, q> lVar) {
        j.f(lVar, "cardClickHandler");
        this.b = lVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public final int getItemViewType(Context context, List<? extends Card> list, int i) {
        j.f(context, "context");
        j.f(list, "cards");
        boolean z = false;
        if (i >= 0 && i < list.size()) {
            z = true;
        }
        if (!z) {
            return -1;
        }
        return list.get(i).getCardType().getValue();
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public final void onBindViewHolder(Context context, List<? extends Card> list, ContentCardViewHolder contentCardViewHolder, int i) {
        boolean z;
        String str;
        com.amazon.aps.iva.pd.a aVar;
        String str2;
        String str3;
        String str4;
        j.f(context, "context");
        j.f(list, "cards");
        j.f(contentCardViewHolder, "viewHolder");
        boolean z2 = false;
        if (i >= 0 && i < list.size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        c cVar = (c) contentCardViewHolder;
        Card card = list.get(i);
        j.f(card, "card");
        int i2 = c.a.a[card.getCardType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        aVar = new com.amazon.aps.iva.pd.a(null, null, null, null, card.isIndicatorHighlighted(), 15);
                    } else {
                        TextAnnouncementCard textAnnouncementCard = (TextAnnouncementCard) card;
                        String title = textAnnouncementCard.getTitle();
                        String description = textAnnouncementCard.getDescription();
                        String domain = textAnnouncementCard.getDomain();
                        String url = textAnnouncementCard.getUrl();
                        if (url == null || m.b0(url)) {
                            z2 = true;
                        }
                        if (!z2) {
                            str4 = domain;
                        } else {
                            str4 = null;
                        }
                        aVar = new com.amazon.aps.iva.pd.a(title, description, null, str4, textAnnouncementCard.isIndicatorHighlighted(), 4);
                    }
                } else {
                    ShortNewsCard shortNewsCard = (ShortNewsCard) card;
                    String title2 = shortNewsCard.getTitle();
                    String description2 = shortNewsCard.getDescription();
                    String imageUrl = shortNewsCard.getImageUrl();
                    String domain2 = shortNewsCard.getDomain();
                    String url2 = shortNewsCard.getUrl();
                    if (url2 == null || m.b0(url2)) {
                        z2 = true;
                    }
                    if (!z2) {
                        str3 = domain2;
                    } else {
                        str3 = null;
                    }
                    aVar = new com.amazon.aps.iva.pd.a(title2, description2, imageUrl, str3, shortNewsCard.isIndicatorHighlighted());
                }
            } else {
                CaptionedImageCard captionedImageCard = (CaptionedImageCard) card;
                String title3 = captionedImageCard.getTitle();
                String description3 = captionedImageCard.getDescription();
                String imageUrl2 = captionedImageCard.getImageUrl();
                String domain3 = captionedImageCard.getDomain();
                String url3 = captionedImageCard.getUrl();
                if (url3 == null || m.b0(url3)) {
                    z2 = true;
                }
                if (!z2) {
                    str2 = domain3;
                } else {
                    str2 = null;
                }
                aVar = new com.amazon.aps.iva.pd.a(title3, description3, imageUrl2, str2, captionedImageCard.isIndicatorHighlighted());
            }
        } else {
            BannerImageCard bannerImageCard = (BannerImageCard) card;
            String imageUrl3 = bannerImageCard.getImageUrl();
            String domain4 = bannerImageCard.getDomain();
            String url4 = bannerImageCard.getUrl();
            if (url4 == null || m.b0(url4)) {
                z2 = true;
            }
            if (!z2) {
                str = domain4;
            } else {
                str = null;
            }
            aVar = new com.amazon.aps.iva.pd.a(null, null, imageUrl3, str, bannerImageCard.isIndicatorHighlighted(), 3);
        }
        cVar.b.setContent(com.amazon.aps.iva.v0.b.c(902968272, new f(aVar, cVar, card), true));
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler
    public final ContentCardViewHolder onCreateViewHolder(Context context, List list, ViewGroup viewGroup, int i) {
        j.f(context, "context");
        j.f(list, "cards");
        j.f(viewGroup, "viewGroup");
        return new c(new ComposeView(context, null, 6), this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "dest");
    }
}
