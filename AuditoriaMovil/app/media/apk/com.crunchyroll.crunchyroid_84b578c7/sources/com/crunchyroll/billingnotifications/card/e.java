package com.crunchyroll.billingnotifications.card;

import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.billingnotifications.card.c;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BillingNotificationCardUiModel.kt */
/* loaded from: classes.dex */
public final class e extends c {
    public final c.f d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c.g gVar) {
        super(R.string.renew_dialog_subtitle, R.string.renew_dialog_cta, R.drawable.ic_info, gVar);
        j.f(gVar, "timeLeft");
        this.d = gVar;
    }

    @Override // com.crunchyroll.billingnotifications.card.c
    public final c.f a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && j.a(this.d, ((e) obj).d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "RenewSubscriptionCardUiModel(timeLeft=" + this.d + ")";
    }
}
