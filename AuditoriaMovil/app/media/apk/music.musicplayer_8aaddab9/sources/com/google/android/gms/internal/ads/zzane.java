package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class zzane extends Handler {
    public final /* synthetic */ zzanf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzane(zzanf zzanfVar, Looper looper) {
        super(looper);
        this.zza = zzanfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzs(message);
    }
}
