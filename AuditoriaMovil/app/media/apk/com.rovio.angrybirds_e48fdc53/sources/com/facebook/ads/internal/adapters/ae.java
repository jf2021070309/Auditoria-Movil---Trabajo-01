package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class ae implements AdAdapter {
    RewardData a;
    int b;

    public abstract int a();

    public void a(int i) {
        this.b = i;
    }

    public abstract void a(Context context, af afVar, Map<String, Object> map, boolean z);

    public void a(RewardData rewardData) {
        this.a = rewardData;
    }

    public abstract boolean b();

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public AdPlacementType getPlacementType() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
