package com.google.android.gms.internal.cast_tv;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.CastReceiverOptions;
import com.google.android.gms.cast.tv.media.MediaCommandCallback;
import com.google.android.gms.cast.tv.media.MediaException;
import com.google.android.gms.cast.tv.media.MediaLoadCommandCallback;
import com.google.android.gms.cast.tv.media.MediaManager;
import com.google.android.gms.cast.tv.media.MediaQueueManager;
import com.google.android.gms.cast.tv.media.MediaStatusModifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzaj {
    private static final Logger zza = new Logger("C2N_RMCC");
    private final zzr zzb;
    private MediaCommandCallback zzc;
    private MediaLoadCommandCallback zzd;
    private final MediaStatusModifier zze;
    private final MediaQueueManager zzf;
    private final zzcb zzg;
    private MediaManager.MediaStatusInterceptor zzh;

    public zzaj(Context context, zzcb zzcbVar, CastReceiverOptions castReceiverOptions) {
        zzr zzrVar;
        this.zzg = zzcbVar;
        zzai zzaiVar = new zzai(this, null);
        com.google.android.gms.cast.tv.internal.zzc zze = com.google.android.gms.cast.tv.internal.zzc.zze();
        if (zze != null) {
            zzrVar = zze.zzf(context, zzaiVar, castReceiverOptions);
        } else {
            zzrVar = null;
        }
        this.zzb = zzrVar;
        this.zze = new MediaStatusModifier();
        this.zzf = new MediaQueueManager(this);
        zzv(null);
        zzw(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaError zzA(Exception exc) {
        Preconditions.checkNotNull(exc);
        if (!(exc instanceof MediaException)) {
            return new MediaError.Builder().setType(MediaError.ERROR_TYPE_ERROR).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC)).build();
        }
        return ((MediaException) exc).getMediaError();
    }

    public final MediaStatus zzb() {
        try {
            zzr zzrVar = this.zzb;
            if (zzrVar != null) {
                return zzrVar.zze();
            }
            return null;
        } catch (RemoteException e) {
            zza.e("Failed to get the current MediaStatus".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    public final MediaStatus zzc() {
        try {
            zzr zzrVar = this.zzb;
            if (zzrVar != null) {
                return zzrVar.zzf();
            }
            return null;
        } catch (RemoteException e) {
            zza.e("Failed to get the current MediaStatus".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    public final MediaCommandCallback zzf() {
        return this.zzc;
    }

    public final MediaQueueManager zzj() {
        return this.zzf;
    }

    public final MediaStatusModifier zzl() {
        return this.zze;
    }

    public final void zzp(int i) {
        try {
            zzr zzrVar = this.zzb;
            if (zzrVar != null) {
                zzrVar.zzg(0);
            }
        } catch (RemoteException e) {
            zza.e("Failed to broadcast media status: ".concat(String.valueOf(e.getMessage())), new Object[0]);
        }
    }

    public final /* synthetic */ void zzq(long j, String str, zzeq zzeqVar, Exception exc) {
        MediaError zzA = zzA(exc);
        zzA.setRequestId(j);
        try {
            zzr zzrVar = this.zzb;
            if (zzrVar != null) {
                zzrVar.zzi(str, zzA);
            }
        } catch (RemoteException unused) {
        }
        zzdu.zzc(zzeqVar, 3);
    }

    public final void zzr(com.google.android.gms.cast.tv.media.zzm zzmVar) {
        try {
            zzr zzrVar = this.zzb;
            if (zzrVar != null) {
                zzrVar.zzj(zzmVar);
            }
        } catch (RemoteException unused) {
        }
    }

    public final void zzs(String str, String str2, zzeq zzeqVar) {
        try {
            zzr zzrVar = this.zzb;
            if (zzrVar != null) {
                zzrVar.zzk(str, str2, zzeqVar);
            }
        } catch (RemoteException e) {
            zza.e("Failed to forward message to RMCCImpl: ".concat(String.valueOf(e.getMessage())), new Object[0]);
        }
    }

    public final void zzt(String str, com.google.android.gms.cast.tv.media.zzo zzoVar) {
        try {
            zzr zzrVar = this.zzb;
            if (zzrVar != null) {
                zzrVar.zzl(str, zzoVar);
            }
        } catch (RemoteException unused) {
        }
    }

    public final void zzu(String str, com.google.android.gms.cast.tv.media.zzr zzrVar) {
        try {
            zzr zzrVar2 = this.zzb;
            if (zzrVar2 != null) {
                zzrVar2.zzm(str, zzrVar);
            }
        } catch (RemoteException unused) {
        }
    }

    public final void zzv(MediaCommandCallback mediaCommandCallback) {
        if (mediaCommandCallback == null) {
            mediaCommandCallback = new MediaCommandCallback();
        }
        this.zzc = mediaCommandCallback;
    }

    public final void zzw(MediaLoadCommandCallback mediaLoadCommandCallback) {
        if (mediaLoadCommandCallback == null) {
            mediaLoadCommandCallback = new MediaLoadCommandCallback();
        }
        this.zzd = mediaLoadCommandCallback;
    }

    public final void zzx(MediaManager.MediaStatusInterceptor mediaStatusInterceptor) {
        this.zzh = mediaStatusInterceptor;
    }

    @TargetApi(21)
    public final void zzy(MediaSessionCompat.Token token) {
        MediaSession.Token token2;
        if (!PlatformVersion.isAtLeastLollipop()) {
            return;
        }
        try {
            zzr zzrVar = this.zzb;
            if (zzrVar != null) {
                if (token != null) {
                    token2 = (MediaSession.Token) token.c;
                } else {
                    token2 = null;
                }
                zzrVar.zzo(token2);
            }
        } catch (RemoteException e) {
            zza.e("Failed to set MediaSessionCompat token to RMCCImpl: ".concat(String.valueOf(e.getMessage())), new Object[0]);
        }
    }

    public final boolean zzz(Intent intent) {
        try {
            zzr zzrVar = this.zzb;
            if (zzrVar != null) {
                return zzrVar.zzp(intent);
            }
        } catch (RemoteException e) {
            zza.e("failed to process new intent".concat(String.valueOf(e.getMessage())), new Object[0]);
        }
        return false;
    }
}
