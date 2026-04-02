package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdly extends zzbmd {
    private final zzdmm zza;
    private IObjectWrapper zzb;

    public zzdly(zzdmm zzdmmVar) {
        this.zza = zzdmmVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final float zze() throws RemoteException {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeA)).booleanValue()) {
            if (this.zza.zzW() != 0.0f) {
                return this.zza.zzW();
            }
            if (this.zza.zzw() != null) {
                try {
                    return this.zza.zzw().zzm();
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzg("Remote exception getting video controller aspect ratio.", e);
                    return 0.0f;
                }
            }
            IObjectWrapper iObjectWrapper = this.zzb;
            if (iObjectWrapper != null) {
                return zzb(iObjectWrapper);
            }
            zzbmh zzB = this.zza.zzB();
            if (zzB == null) {
                return 0.0f;
            }
            float zze = (zzB.zze() == -1 || zzB.zzf() == -1) ? 0.0f : zzB.zze() / zzB.zzf();
            return zze == 0.0f ? zzb(zzB.zzb()) : zze;
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final IObjectWrapper zzg() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbmh zzB = this.zza.zzB();
        if (zzB == null) {
            return null;
        }
        return zzB.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final float zzh() throws RemoteException {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue() && this.zza.zzw() != null) {
            return this.zza.zzw().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final float zzi() throws RemoteException {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue() && this.zza.zzw() != null) {
            return this.zza.zzw().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final zzbhc zzj() throws RemoteException {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue()) {
            return this.zza.zzw();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final boolean zzk() throws RemoteException {
        return ((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue() && this.zza.zzw() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zzl(zzbnp zzbnpVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeB)).booleanValue() && (this.zza.zzw() instanceof zzcnh)) {
            ((zzcnh) this.zza.zzw()).zzv(zzbnpVar);
        }
    }
}
