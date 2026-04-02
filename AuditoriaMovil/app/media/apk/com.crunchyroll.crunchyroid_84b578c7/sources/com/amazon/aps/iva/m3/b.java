package com.amazon.aps.iva.m3;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.f3.f;
import com.amazon.aps.iva.g3.i;
/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class b implements Runnable {
    public final /* synthetic */ x b;
    public final /* synthetic */ int c;

    public b(x xVar, int i) {
        this.b = xVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((i.a) this.b).e;
        if (eVar != null) {
            eVar.lambda$callbackFailAsync$1(this.c);
        }
    }
}
