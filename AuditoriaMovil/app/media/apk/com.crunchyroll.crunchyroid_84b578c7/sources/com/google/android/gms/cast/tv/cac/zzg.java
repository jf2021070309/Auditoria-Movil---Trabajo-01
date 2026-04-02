package com.google.android.gms.cast.tv.cac;

import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.media.MediaException;
import com.google.android.gms.internal.cast_tv.zzcb;
import com.google.android.gms.internal.cast_tv.zzeq;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzg {
    private static final Logger zza = new Logger("C2N_RCC");
    private final com.google.android.gms.internal.cast_tv.zzi zzb = com.google.android.gms.cast.tv.internal.zzc.zze().zzd(new zzf(this, null));
    private final zza zzc;
    private final zzcb zzd;

    public zzg(zza zzaVar, zzcb zzcbVar) {
        this.zzc = zzaVar;
        this.zzd = zzcbVar;
    }

    public static /* bridge */ /* synthetic */ MediaError zza(long j, Exception exc) {
        if (!(exc instanceof MediaException)) {
            zza.w(exc, "Caught a non-media exception", new Object[0]);
            return new MediaError.Builder().setType(MediaError.ERROR_TYPE_ERROR).setRequestId(j).setDetailedErrorCode(Integer.valueOf((int) MediaError.DetailedErrorCode.GENERIC)).build();
        }
        return ((MediaException) exc).getMediaError();
    }

    public final void zzf(String str, String str2, zzeq zzeqVar) {
        com.google.android.gms.internal.cast_tv.zzi zziVar = this.zzb;
        if (zziVar != null) {
            try {
                zziVar.zzb(str, str2, zzeqVar);
            } catch (RemoteException e) {
                zza.e("Failed to forward message to impl:  ".concat(String.valueOf(e.getMessage())), new Object[0]);
            }
        }
    }
}
