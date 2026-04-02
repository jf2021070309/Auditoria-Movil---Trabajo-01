package com.amazon.aps.iva.m3;

import android.os.Handler;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.g3.i;
import com.amazon.aps.iva.m3.j;
/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class c {
    public final x a;
    public final Handler b;

    public c(i.a aVar, Handler handler) {
        this.a = aVar;
        this.b = handler;
    }

    public final void a(j.a aVar) {
        boolean z;
        int i = aVar.b;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Handler handler = this.b;
        x xVar = this.a;
        if (z) {
            handler.post(new a(xVar, aVar.a));
        } else {
            handler.post(new b(xVar, i));
        }
    }
}
