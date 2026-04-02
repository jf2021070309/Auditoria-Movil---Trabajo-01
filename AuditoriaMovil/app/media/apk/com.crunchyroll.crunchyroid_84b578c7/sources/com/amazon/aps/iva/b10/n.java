package com.amazon.aps.iva.b10;

import android.content.Context;
import android.content.Intent;
import com.ellation.crunchyroll.presentation.download.notification.NotificationsDismissService;
/* compiled from: NotificationsDismissServiceWrapper.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar) {
        super(0);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        o oVar = this.h;
        if (oVar.b.isEmpty()) {
            oVar.c.b.cancel();
            oVar.b.clear();
            Context context = oVar.a;
            context.stopService(new Intent(context, NotificationsDismissService.class));
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
