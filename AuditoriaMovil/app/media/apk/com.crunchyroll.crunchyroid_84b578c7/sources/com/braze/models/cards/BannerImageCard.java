package com.braze.models.cards;

import bo.app.r1;
import bo.app.t1;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.oe0.i;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import com.braze.support.JsonUtils;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/braze/models/cards/BannerImageCard;", "Lcom/braze/models/cards/Card;", "", "toString", "imageUrl", "Ljava/lang/String;", "getImageUrl", "()Ljava/lang/String;", ImagesContract.URL, "getUrl", "domain", "getDomain", "", "aspectRatio", "F", "getAspectRatio", "()F", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "Lcom/amazon/aps/iva/if0/c;", "jsonObject", "Lcom/braze/enums/CardKey$Provider;", "cardKeyProvider", "Lbo/app/r1;", "manager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorageProvider", "Lbo/app/t1;", "cardAnalyticsProvider", "<init>", "(Lcom/amazon/aps/iva/if0/c;Lcom/braze/enums/CardKey$Provider;Lbo/app/r1;Lcom/braze/storage/ICardStorageProvider;Lbo/app/t1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BannerImageCard extends Card {
    private final float aspectRatio;
    private final CardType cardType;
    private final String domain;
    private final String imageUrl;
    private final String url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerImageCard(c cVar, CardKey.Provider provider, r1 r1Var, ICardStorageProvider<?> iCardStorageProvider, t1 t1Var) {
        super(cVar, provider, r1Var, iCardStorageProvider, t1Var);
        j.f(cVar, "jsonObject");
        j.f(provider, "cardKeyProvider");
        String string = cVar.getString(provider.getKey(CardKey.BANNER_IMAGE_IMAGE));
        j.e(string, "jsonObject.getString(car…dKey.BANNER_IMAGE_IMAGE))");
        this.imageUrl = string;
        this.url = JsonUtils.getOptionalString(cVar, provider.getKey(CardKey.BANNER_IMAGE_URL));
        this.domain = JsonUtils.getOptionalString(cVar, provider.getKey(CardKey.BANNER_IMAGE_DOMAIN));
        this.aspectRatio = (float) cVar.optDouble(provider.getKey(CardKey.BANNER_IMAGE_ASPECT_RATIO), 0.0d);
        this.cardType = CardType.BANNER;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.braze.models.cards.Card
    public String getUrl() {
        return this.url;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        return i.T("\n            BannerImageCard{imageUrl='" + this.imageUrl + "'\n            url='" + getUrl() + "'\n            domain='" + this.domain + "'\n            aspectRatio=" + this.aspectRatio + "\n            " + super.toString() + "}\n            \n        ");
    }
}
