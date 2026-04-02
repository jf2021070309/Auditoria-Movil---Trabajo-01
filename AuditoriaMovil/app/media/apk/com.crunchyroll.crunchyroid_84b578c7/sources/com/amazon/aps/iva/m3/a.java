package com.amazon.aps.iva.m3;

import android.graphics.Typeface;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.f3.f;
import com.amazon.aps.iva.g3.i;
/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ x b;
    public final /* synthetic */ Typeface c;

    public a(x xVar, Typeface typeface) {
        this.b = xVar;
        this.c = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((i.a) this.b).e;
        if (eVar != null) {
            eVar.lambda$callbackSuccessAsync$0(this.c);
        }
    }
}
