package com.segment.analytics;

import com.segment.analytics.integrations.BasePayload;
/* loaded from: classes4.dex */
public interface Middleware {

    /* loaded from: classes4.dex */
    public interface Callback {
        void invoke(BasePayload basePayload);
    }

    /* loaded from: classes4.dex */
    public interface Chain {
        BasePayload payload();

        void proceed(BasePayload basePayload);
    }

    void intercept(Chain chain);
}
