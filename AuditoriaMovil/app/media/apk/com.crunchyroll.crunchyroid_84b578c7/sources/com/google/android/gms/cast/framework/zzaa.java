package com.google.android.gms.cast.framework;

import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzaa extends com.google.android.gms.cast.zzq {
    final /* synthetic */ CastSession zza;

    public /* synthetic */ zzaa(CastSession castSession, zzz zzzVar) {
        this.zza = castSession;
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zza() {
        zzam zzamVar;
        Logger logger;
        zzs zzsVar;
        zzs zzsVar2;
        RemoteMediaClient remoteMediaClient;
        zzam zzamVar2;
        RemoteMediaClient remoteMediaClient2;
        CastSession castSession = this.zza;
        zzamVar = castSession.zze;
        if (zzamVar != null) {
            try {
                remoteMediaClient = castSession.zzj;
                if (remoteMediaClient != null) {
                    remoteMediaClient2 = castSession.zzj;
                    remoteMediaClient2.zzq();
                }
                zzamVar2 = this.zza.zze;
                zzamVar2.zzh(null);
            } catch (RemoteException e) {
                logger = CastSession.zzb;
                logger.d(e, "Unable to call %s on %s.", "onConnected", "zzam");
            }
            CastSession castSession2 = this.zza;
            zzsVar = castSession2.zzm;
            if (zzsVar != null) {
                zzsVar2 = castSession2.zzm;
                zzsVar2.zza();
            }
        }
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zzb(int i) {
        zzam zzamVar;
        Logger logger;
        zzam zzamVar2;
        CastSession castSession = this.zza;
        zzamVar = castSession.zze;
        if (zzamVar != null) {
            try {
                zzamVar2 = castSession.zze;
                zzamVar2.zzi(new ConnectionResult(i));
            } catch (RemoteException e) {
                logger = CastSession.zzb;
                logger.d(e, "Unable to call %s on %s.", "onConnectionFailed", "zzam");
            }
        }
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zzc(int i) {
        zzam zzamVar;
        Logger logger;
        zzam zzamVar2;
        CastSession castSession = this.zza;
        zzamVar = castSession.zze;
        if (zzamVar != null) {
            try {
                zzamVar2 = castSession.zze;
                zzamVar2.zzj(i);
            } catch (RemoteException e) {
                logger = CastSession.zzb;
                logger.d(e, "Unable to call %s on %s.", "onConnectionSuspended", "zzam");
            }
        }
    }

    @Override // com.google.android.gms.cast.zzq
    public final void zzd(int i) {
        zzam zzamVar;
        Logger logger;
        zzam zzamVar2;
        CastSession castSession = this.zza;
        zzamVar = castSession.zze;
        if (zzamVar != null) {
            try {
                zzamVar2 = castSession.zze;
                zzamVar2.zzi(new ConnectionResult(i));
            } catch (RemoteException e) {
                logger = CastSession.zzb;
                logger.d(e, "Unable to call %s on %s.", "onDisconnected", "zzam");
            }
        }
    }
}
