package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzane extends Handler {
    final /* synthetic */ zzanf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
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
