package com.ellation.crunchyroll.presentation.multitiersubscription.extendedupgrade;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.i;
/* compiled from: UpgradeActivity.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends i implements l<Integer, q> {
    public a(UpgradeActivity upgradeActivity) {
        super(1, upgradeActivity, UpgradeActivity.class, "selectTab", "selectTab(I)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Integer num) {
        int intValue = num.intValue();
        com.amazon.aps.iva.fc0.l<Object>[] lVarArr = UpgradeActivity.r;
        ((UpgradeActivity) this.receiver).ni().j.a(intValue);
        return q.a;
    }
}
