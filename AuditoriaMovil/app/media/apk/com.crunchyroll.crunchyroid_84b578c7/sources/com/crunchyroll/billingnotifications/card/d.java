package com.crunchyroll.billingnotifications.card;

import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.billingnotifications.card.c;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BillingNotificationCardUiModel.kt */
/* loaded from: classes.dex */
public final class d extends c {
    public final c.f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c.f fVar) {
        super(R.string.in_grace_notification_card_title, R.string.in_grace_notification_card_cta, R.drawable.in_grace_card_icon, fVar);
        j.f(fVar, "timeLeft");
        this.d = fVar;
    }

    @Override // com.crunchyroll.billingnotifications.card.c
    public final c.f a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && j.a(this.d, ((d) obj).d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "InGraceCardUiModel(timeLeft=" + this.d + ")";
    }
}
