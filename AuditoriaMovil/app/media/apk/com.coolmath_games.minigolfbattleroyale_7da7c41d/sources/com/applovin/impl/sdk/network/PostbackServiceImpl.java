package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
/* loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {
    private final k a;

    public PostbackServiceImpl(k kVar) {
        this.a = kVar;
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(h.b(this.a).a(str).c(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(h hVar, o.a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.a.Q().a(new com.applovin.impl.sdk.e.g(hVar, aVar, this.a, appLovinPostbackListener), aVar);
    }

    public void dispatchPostbackRequest(h hVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(hVar, o.a.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
