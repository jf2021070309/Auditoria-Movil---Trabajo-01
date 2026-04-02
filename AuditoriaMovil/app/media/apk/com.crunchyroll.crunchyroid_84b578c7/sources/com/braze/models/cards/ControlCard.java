package com.braze.models.cards;

import bo.app.r1;
import bo.app.t1;
import com.amazon.aps.iva.if0.c;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.CardKey;
import com.braze.enums.CardType;
import com.braze.storage.ICardStorageProvider;
import kotlin.Metadata;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/braze/models/cards/ControlCard;", "Lcom/braze/models/cards/Card;", "", "toString", "Lcom/braze/enums/CardType;", "cardType", "Lcom/braze/enums/CardType;", "getCardType", "()Lcom/braze/enums/CardType;", "Lcom/amazon/aps/iva/if0/c;", "jsonObject", "Lcom/braze/enums/CardKey$Provider;", "cardKeysProvider", "Lbo/app/r1;", "manager", "Lcom/braze/storage/ICardStorageProvider;", "cardStorageProvider", "Lbo/app/t1;", "cardAnalyticsProvider", "<init>", "(Lcom/amazon/aps/iva/if0/c;Lcom/braze/enums/CardKey$Provider;Lbo/app/r1;Lcom/braze/storage/ICardStorageProvider;Lbo/app/t1;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ControlCard extends Card {
    private final CardType cardType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlCard(c cVar, CardKey.Provider provider, r1 r1Var, ICardStorageProvider<?> iCardStorageProvider, t1 t1Var) {
        super(cVar, provider, r1Var, iCardStorageProvider, t1Var);
        j.f(cVar, "jsonObject");
        j.f(provider, "cardKeysProvider");
        this.cardType = CardType.CONTROL;
    }

    @Override // com.braze.models.cards.Card
    public CardType getCardType() {
        return this.cardType;
    }

    @Override // com.braze.models.cards.Card
    public String toString() {
        return com.amazon.aps.iva.o0.t1.b(new StringBuilder("ControlCard{"), super.toString(), '}');
    }
}
