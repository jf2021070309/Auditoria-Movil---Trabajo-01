package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class i extends j {
    private final List<String> a;

    public i(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super(com.applovin.impl.sdk.a.d.a(a(list)), appLovinAdLoadListener, "TaskFetchMultizoneAd", kVar);
        this.a = Collections.unmodifiableList(list);
    }

    private static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("No zone identifiers specified");
        }
        return list.get(0);
    }

    @Override // com.applovin.impl.sdk.e.j
    Map<String, String> a() {
        HashMap hashMap = new HashMap(1);
        List<String> list = this.a;
        hashMap.put("zone_ids", CollectionUtils.implode(list, list.size()));
        return hashMap;
    }

    @Override // com.applovin.impl.sdk.e.j
    protected com.applovin.impl.sdk.a.b b() {
        return com.applovin.impl.sdk.a.b.APPLOVIN_MULTIZONE;
    }
}
