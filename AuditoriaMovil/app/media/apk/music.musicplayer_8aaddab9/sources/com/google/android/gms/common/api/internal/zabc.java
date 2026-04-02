package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zabc extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ zabe zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabc(zabe zabeVar, Looper looper) {
        super(looper);
        this.zaa = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            zabe.zaj(this.zaa);
        } else if (i2 != 2) {
            a.D(31, "Unknown message id: ", i2, "GoogleApiClientImpl");
        } else {
            zabe.zai(this.zaa);
        }
    }
}
