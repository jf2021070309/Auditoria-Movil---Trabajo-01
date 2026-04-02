package com.amazon.aps.iva.t20;

import com.crunchyroll.crunchyroid.R;
/* compiled from: ManageMembershipTierLabelProvider.kt */
/* loaded from: classes2.dex */
public final class p implements com.amazon.aps.iva.j30.b {
    public final String a;
    public final boolean b;

    public p(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "currentSubscriptionSku");
        this.a = str;
        this.b = z;
    }

    @Override // com.amazon.aps.iva.j30.b
    public final Integer a(String str) {
        int i;
        com.amazon.aps.iva.yb0.j.f(str, "sku");
        if (com.amazon.aps.iva.yb0.j.a(str, this.a)) {
            if (this.b) {
                i = R.string.active_subscription_label;
            } else {
                i = R.string.cancelled_subscription_label;
            }
            return Integer.valueOf(i);
        }
        return null;
    }
}
