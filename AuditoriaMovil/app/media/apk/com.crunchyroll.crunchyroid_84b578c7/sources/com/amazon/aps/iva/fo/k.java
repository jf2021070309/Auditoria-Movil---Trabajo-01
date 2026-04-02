package com.amazon.aps.iva.fo;

import com.amazon.aps.iva.go.b;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: WatchDataNotificationMonitor.kt */
/* loaded from: classes2.dex */
public final class k extends l implements com.amazon.aps.iva.xb0.l<WatchDataStatus, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<WatchDataStatus, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b.a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(WatchDataStatus watchDataStatus) {
        this.h.invoke(watchDataStatus);
        return q.a;
    }
}
