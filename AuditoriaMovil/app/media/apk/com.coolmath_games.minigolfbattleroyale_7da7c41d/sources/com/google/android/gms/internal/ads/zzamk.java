package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzamk implements zzalf {
    private Message zza;
    private zzaml zzb;

    private zzamk() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzamk(zzamj zzamjVar) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzaml.zzk(this);
    }

    public final zzamk zzb(Message message, zzaml zzamlVar) {
        this.zza = message;
        this.zzb = zzamlVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzalf
    public final void zza() {
        Message message = this.zza;
        if (message != null) {
            message.sendToTarget();
            zzd();
            return;
        }
        throw null;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        if (message != null) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            zzd();
            return sendMessageAtFrontOfQueue;
        }
        throw null;
    }
}
