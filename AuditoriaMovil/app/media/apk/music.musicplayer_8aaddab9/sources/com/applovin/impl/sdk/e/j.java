package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class j extends k {

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f4043c;

    public j(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.m mVar) {
        super(com.applovin.impl.sdk.ad.d.a(a(list)), null, appLovinAdLoadListener, "TaskFetchMultizoneAd", mVar);
        this.f4043c = Collections.unmodifiableList(list);
    }

    private static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("No zone identifiers specified");
        }
        return list.get(0);
    }

    @Override // com.applovin.impl.sdk.e.h
    public Map<String, String> a() {
        HashMap hashMap = new HashMap(1);
        List<String> list = this.f4043c;
        hashMap.put("zone_ids", CollectionUtils.implode(list, list.size()));
        return hashMap;
    }

    @Override // com.applovin.impl.sdk.e.h
    public com.applovin.impl.sdk.ad.b h() {
        return com.applovin.impl.sdk.ad.b.APPLOVIN_MULTIZONE;
    }
}
