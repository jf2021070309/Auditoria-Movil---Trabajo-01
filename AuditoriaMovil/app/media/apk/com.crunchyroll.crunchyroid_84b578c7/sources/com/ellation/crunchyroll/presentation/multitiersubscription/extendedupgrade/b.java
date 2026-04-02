package com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: UpgradeActivity.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ UpgradeActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UpgradeActivity upgradeActivity) {
        super(0);
        this.h = upgradeActivity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        UpgradeActivity.mi(this.h).b();
        return q.a;
    }
}
