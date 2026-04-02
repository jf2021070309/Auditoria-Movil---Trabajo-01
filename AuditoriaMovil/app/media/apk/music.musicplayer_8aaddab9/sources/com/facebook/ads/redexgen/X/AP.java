package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: assets/audience_network.dex */
public class AP extends Handler {
    public final /* synthetic */ C0535Dh A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AP(C0535Dh c0535Dh, Looper looper) {
        super(looper);
        this.A00 = c0535Dh;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A00.A0A(message);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
