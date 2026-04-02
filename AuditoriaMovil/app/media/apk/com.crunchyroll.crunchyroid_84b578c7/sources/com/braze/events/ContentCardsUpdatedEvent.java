package com.braze.events;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.Card;
import com.braze.support.DateTimeUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B/\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006$"}, d2 = {"Lcom/braze/events/ContentCardsUpdatedEvent;", "", "", "ageSeconds", "", "isTimestampOlderThan", "", "toString", "", "Lcom/braze/models/cards/Card;", "contentCards", "Ljava/util/List;", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "timestampSeconds", "J", "getTimestampSeconds", "()J", "isFromOfflineStorage", "Z", "()Z", "", "getAllCards", "()Ljava/util/List;", "allCards", "", "getCardCount", "()I", "cardCount", "getUnviewedCardCount", "unviewedCardCount", "<init>", "(Ljava/util/List;Ljava/lang/String;JZ)V", "Companion", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContentCardsUpdatedEvent {
    public static final Companion Companion = new Companion(null);
    private final List<Card> contentCards;
    private final boolean isFromOfflineStorage;
    private final long timestampSeconds;
    private final String userId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/braze/events/ContentCardsUpdatedEvent$Companion;", "", "()V", "emptyUpdate", "Lcom/braze/events/ContentCardsUpdatedEvent;", "getEmptyUpdate$annotations", "getEmptyUpdate", "()Lcom/braze/events/ContentCardsUpdatedEvent;", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ContentCardsUpdatedEvent getEmptyUpdate() {
            return new ContentCardsUpdatedEvent(z.b, null, DateTimeUtils.nowInSeconds(), true);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentCardsUpdatedEvent(List<? extends Card> list, String str, long j, boolean z) {
        j.f(list, "contentCards");
        this.contentCards = list;
        this.userId = str;
        this.timestampSeconds = j;
        this.isFromOfflineStorage = z;
    }

    public final List<Card> getAllCards() {
        return x.Z0(this.contentCards);
    }

    public final int getCardCount() {
        return this.contentCards.size();
    }

    public final int getUnviewedCardCount() {
        boolean z;
        List<Card> list = this.contentCards;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Card card : list) {
            if (!card.getViewed() && !card.isControl()) {
                z = true;
            } else {
                z = false;
            }
            if (z && (i = i + 1) < 0) {
                f1.R();
                throw null;
            }
        }
        return i;
    }

    public final boolean isFromOfflineStorage() {
        return this.isFromOfflineStorage;
    }

    public final boolean isTimestampOlderThan(long j) {
        if (TimeUnit.SECONDS.toMillis(this.timestampSeconds + j) < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "ContentCardsUpdatedEvent{userId='" + this.userId + "', timestampSeconds=" + this.timestampSeconds + ", isFromOfflineStorage=" + this.isFromOfflineStorage + ", card count=" + getCardCount() + '}';
    }
}
