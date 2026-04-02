package com.amazon.aps.iva.fe;

import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;
/* compiled from: ResendOtpCountdownTimer.kt */
/* loaded from: classes.dex */
public final class y extends CountDownTimer implements x {
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> a;
    public com.amazon.aps.iva.xb0.l<? super Integer, com.amazon.aps.iva.kb0.q> b;

    public y() {
        super(15000L, 1000L);
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar = this.a;
        if (aVar != null) {
            aVar.invoke();
        } else {
            com.amazon.aps.iva.yb0.j.m("onFinished");
            throw null;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        com.amazon.aps.iva.xb0.l<? super Integer, com.amazon.aps.iva.kb0.q> lVar = this.b;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(j)));
        } else {
            com.amazon.aps.iva.yb0.j.m("onTicked");
            throw null;
        }
    }
}
