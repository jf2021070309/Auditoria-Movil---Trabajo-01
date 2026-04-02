package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zabh extends com.google.android.gms.internal.base.zaq {
    public final /* synthetic */ zabi zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabh(zabi zabiVar, Looper looper) {
        super(looper);
        this.zaa = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            ((zabg) message.obj).zab(this.zaa);
        } else if (i2 == 2) {
            throw ((RuntimeException) message.obj);
        } else {
            a.D(31, "Unknown message id: ", i2, "GACStateManager");
        }
    }
}
