package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
/* loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {
    private final m a;

    public PostbackServiceImpl(m mVar) {
        this.a = mVar;
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(h.b(this.a).a(str).c(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(h hVar, o.a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.a.S().a(new com.applovin.impl.sdk.e.g(hVar, aVar, this.a, appLovinPostbackListener), aVar);
    }

    public void dispatchPostbackRequest(h hVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(hVar, o.a.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
