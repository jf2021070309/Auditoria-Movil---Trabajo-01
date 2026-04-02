package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzash implements Runnable {
    final /* synthetic */ IOException zza;
    final /* synthetic */ zzasl zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzash(zzasl zzaslVar, IOException iOException) {
        this.zzb = zzaslVar;
        this.zza = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasm zzasmVar;
        zzasmVar = this.zzb.zze;
        zzasmVar.zzi(this.zza);
    }
}
