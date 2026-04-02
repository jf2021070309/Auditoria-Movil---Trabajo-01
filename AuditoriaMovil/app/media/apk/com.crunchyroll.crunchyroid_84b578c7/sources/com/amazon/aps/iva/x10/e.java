package com.amazon.aps.iva.x10;

import com.amazon.aps.iva.es.k;
import com.amazon.aps.iva.js.w;
/* compiled from: NotificationPermissionAnalytics.kt */
/* loaded from: classes2.dex */
public final class e implements d {
    public final com.amazon.aps.iva.ds.a a;

    public e(com.amazon.aps.iva.ds.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.x10.d
    public final void a(boolean z) {
        w wVar;
        if (z) {
            wVar = w.ALLOW;
        } else {
            wVar = w.DENY;
        }
        this.a.e(new k(wVar));
    }
}
