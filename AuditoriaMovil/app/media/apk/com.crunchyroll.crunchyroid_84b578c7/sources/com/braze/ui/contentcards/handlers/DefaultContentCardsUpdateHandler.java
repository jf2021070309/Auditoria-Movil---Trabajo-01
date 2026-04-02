package com.braze.ui.contentcards.handlers;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.models.cards.Card;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DefaultContentCardsUpdateHandler.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "Lcom/braze/events/ContentCardsUpdatedEvent;", "event", "", "Lcom/braze/models/cards/Card;", "handleCardUpdate", "", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "Lcom/amazon/aps/iva/kb0/q;", "writeToParcel", "<init>", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class DefaultContentCardsUpdateHandler implements IContentCardsUpdateHandler {
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefaultContentCardsUpdateHandler> CREATOR = new Parcelable.Creator<DefaultContentCardsUpdateHandler>() { // from class: com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler createFromParcel(Parcel parcel) {
            j.f(parcel, FirebaseAnalytics.Param.SOURCE);
            return new DefaultContentCardsUpdateHandler();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DefaultContentCardsUpdateHandler[] newArray(int i) {
            return new DefaultContentCardsUpdateHandler[i];
        }
    };

    /* compiled from: DefaultContentCardsUpdateHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/braze/ui/contentcards/handlers/DefaultContentCardsUpdateHandler;", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public static final int handleCardUpdate$lambda$0(Card card, Card card2) {
        j.f(card, "cardA");
        j.f(card2, "cardB");
        if (card.isPinned() && !card2.isPinned()) {
            return -1;
        }
        if (card.isPinned() || !card2.isPinned()) {
            if (card.getCreated() > card2.getCreated()) {
                return -1;
            }
            if (card.getCreated() >= card2.getCreated()) {
                return 0;
            }
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler
    public List<Card> handleCardUpdate(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        j.f(contentCardsUpdatedEvent, "event");
        com.amazon.aps.iva.m6.j jVar = new com.amazon.aps.iva.m6.j(5);
        ArrayList arrayList = new ArrayList();
        for (Object obj : contentCardsUpdatedEvent.getAllCards()) {
            if (!BrazeActionUtils.containsInvalidBrazeAction((Card) obj)) {
                arrayList.add(obj);
            }
        }
        return x.T0(arrayList, jVar);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        j.f(parcel, "dest");
    }
}
