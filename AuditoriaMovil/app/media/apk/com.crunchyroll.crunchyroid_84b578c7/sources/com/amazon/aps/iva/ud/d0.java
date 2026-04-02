package com.amazon.aps.iva.ud;

import android.content.Context;
import android.os.Handler;
import com.amazon.aps.iva.a6.b1;
/* compiled from: ErrorLayout.kt */
/* loaded from: classes.dex */
public final class d0 implements com.amazon.aps.iva.s4.a {
    public Handler a;
    public final com.amazon.aps.iva.sd.b b = com.amazon.aps.iva.gd0.j.e();

    @Override // com.amazon.aps.iva.s4.a
    public final com.amazon.aps.iva.kb0.q a(Context context, com.amazon.aps.iva.q4.d dVar) {
        if (this.a == null) {
            this.a = new Handler(context.getMainLooper());
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new b1(this, 2, dVar, context));
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("handler");
        throw null;
    }
}
