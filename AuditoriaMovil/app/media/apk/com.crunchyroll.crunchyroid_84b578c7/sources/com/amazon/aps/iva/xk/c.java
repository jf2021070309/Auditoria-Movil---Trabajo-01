package com.amazon.aps.iva.xk;

import android.os.CountDownTimer;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xk.h;
/* compiled from: PlayerMaturityLabelCountdownTimer.kt */
/* loaded from: classes2.dex */
public final class c extends CountDownTimer implements b {
    public boolean a;
    public com.amazon.aps.iva.xb0.a<q> b;

    public c() {
        super(5000L, 1000L);
    }

    @Override // com.amazon.aps.iva.xk.b
    public final void a(h.c cVar, h.d dVar) {
        if (!this.a) {
            this.b = dVar;
            cVar.invoke();
            start();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        com.amazon.aps.iva.xb0.a<q> aVar = this.b;
        if (aVar != null) {
            aVar.invoke();
        }
        this.b = null;
        this.a = true;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // com.amazon.aps.iva.xk.b
    public final void reset() {
        this.a = false;
        cancel();
    }
}
