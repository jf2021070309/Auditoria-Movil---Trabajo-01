package com.google.android.gms.cast.framework.media;

import android.os.Handler;
import java.util.Set;
import java.util.TimerTask;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzbo extends TimerTask {
    final /* synthetic */ RemoteMediaClient zza;
    final /* synthetic */ zzbp zzb;

    public zzbo(zzbp zzbpVar, RemoteMediaClient remoteMediaClient) {
        this.zzb = zzbpVar;
        this.zza = remoteMediaClient;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Set set;
        Handler handler;
        long j;
        zzbp zzbpVar = this.zzb;
        RemoteMediaClient remoteMediaClient = zzbpVar.zza;
        set = zzbpVar.zzb;
        remoteMediaClient.zzx(set);
        zzbp zzbpVar2 = this.zzb;
        handler = zzbpVar2.zza.zzc;
        j = zzbpVar2.zzc;
        handler.postDelayed(this, j);
    }
}
