package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class u implements AdAdapter, com.facebook.ads.internal.q.a.o<Bundle> {
    public abstract void a(Context context, com.facebook.ads.a.a aVar, Map<String, Object> map, com.facebook.ads.internal.m.c cVar, EnumSet<CacheFlag> enumSet);

    public abstract boolean e();

    @Override // com.facebook.ads.internal.adapters.AdAdapter
    public AdPlacementType getPlacementType() {
        return AdPlacementType.INSTREAM;
    }
}
