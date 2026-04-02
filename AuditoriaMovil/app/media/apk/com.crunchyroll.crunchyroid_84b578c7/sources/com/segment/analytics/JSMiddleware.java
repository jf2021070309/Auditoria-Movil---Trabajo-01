package com.segment.analytics;

import android.content.Context;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class JSMiddleware {
    protected Context context;
    protected Map<String, List<Middleware>> destinationMiddleware;
    protected ValueMap settings;
    protected List<Middleware> sourceMiddleware;

    public JSMiddleware(Context context) {
        this.context = context;
    }

    public abstract void addToDataBridge(String str, Object obj);

    public abstract Map<String, Object> getDataBridgeSnapshot();

    public abstract void removeFromDataBridge(String str);

    public abstract void setEdgeFunctionData(ValueMap valueMap);
}
