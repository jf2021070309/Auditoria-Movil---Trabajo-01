package com.amazon.aps.iva.ud;

import android.content.Context;
import android.os.Handler;
/* compiled from: ContinueWatchingCard.kt */
/* loaded from: classes.dex */
public final class n implements com.amazon.aps.iva.s4.a {
    public Handler a;
    public final com.amazon.aps.iva.sd.b b = com.amazon.aps.iva.gd0.j.e();

    @Override // com.amazon.aps.iva.s4.a
    public final com.amazon.aps.iva.kb0.q a(Context context, com.amazon.aps.iva.q4.d dVar) {
        if (this.a == null) {
            this.a = new Handler(context.getMainLooper());
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new com.amazon.aps.iva.t5.f0(dVar, 2, this, context));
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("handler");
        throw null;
    }
}
