package com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton.offlineaccess;

import android.content.Context;
import android.util.AttributeSet;
import com.amazon.aps.iva.f20.i;
import com.amazon.aps.iva.f30.b;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.multitiersubscription.subscriptionbutton.CrPlusSubscriptionButton;
import kotlin.Metadata;
/* compiled from: OfflineAccessSubscriptionButton.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/presentation/multitiersubscription/subscriptionbutton/offlineaccess/OfflineAccessSubscriptionButton;", "Lcom/ellation/crunchyroll/presentation/multitiersubscription/subscriptionbutton/CrPlusSubscriptionButton;", "Lcom/amazon/aps/iva/f30/b;", "multitier-subscription_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class OfflineAccessSubscriptionButton extends CrPlusSubscriptionButton implements b {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OfflineAccessSubscriptionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.f30.b
    public final void B3() {
        getButtonTextView().setText(R.string.upgrade_now);
    }

    @Override // com.amazon.aps.iva.f30.b
    public final void vh() {
        getButtonTextView().setText(R.string.go_premium);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineAccessSubscriptionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        i iVar = i.a.a;
        if (iVar != null) {
            a<Boolean> t = iVar.t();
            j.f(t, "hasPremiumSubscription");
            com.ellation.crunchyroll.mvp.lifecycle.a.b(new com.amazon.aps.iva.f30.a(this, t), this);
            return;
        }
        j.m("dependencies");
        throw null;
    }
}
