package com.vungle.publisher.inject;

import dagger.Module;
import dagger.Provides;
@Module
/* loaded from: classes4.dex */
public class EndpointModule {
    private String a = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public String a() {
        return this.a;
    }

    public EndpointModule setVungleBaseUrl(String str) {
        this.a = str;
        return this;
    }
}
