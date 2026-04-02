package com.segment.analytics;

import com.segment.analytics.Middleware;
import com.segment.analytics.integrations.BasePayload;
import java.util.List;
/* loaded from: classes4.dex */
class MiddlewareChainRunner implements Middleware.Chain {
    private final Middleware.Callback callback;
    private int index;
    private final List<Middleware> middleware;
    private final BasePayload payload;

    public MiddlewareChainRunner(int i, BasePayload basePayload, List<Middleware> list, Middleware.Callback callback) {
        this.index = i;
        this.payload = basePayload;
        this.middleware = list;
        this.callback = callback;
    }

    @Override // com.segment.analytics.Middleware.Chain
    public BasePayload payload() {
        return this.payload;
    }

    @Override // com.segment.analytics.Middleware.Chain
    public void proceed(BasePayload basePayload) {
        if (this.index < this.middleware.size()) {
            this.middleware.get(this.index).intercept(new MiddlewareChainRunner(this.index + 1, basePayload, this.middleware, this.callback));
            return;
        }
        this.callback.invoke(basePayload);
    }
}
