package com.amazon.aps.iva.ud;

import android.content.Context;
import android.os.Handler;
import com.amazon.aps.iva.a6.x0;
/* compiled from: AnonymousLayout.kt */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.s4.a {
    public Handler a;
    public final com.amazon.aps.iva.sd.b b = com.amazon.aps.iva.gd0.j.e();

    @Override // com.amazon.aps.iva.s4.a
    public final com.amazon.aps.iva.kb0.q a(Context context, com.amazon.aps.iva.q4.d dVar) {
        if (this.a == null) {
            this.a = new Handler(context.getMainLooper());
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new x0(this, 3, dVar, context));
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("handler");
        throw null;
    }
}
