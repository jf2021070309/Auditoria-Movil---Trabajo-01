package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class zzcla implements Releasable {
    public final Context zza;
    public final String zzb;
    public final WeakReference<zzcjb> zzc;

    public zzcla(zzcjb zzcjbVar) {
        Context context = zzcjbVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zzi(context, zzcjbVar.zzt().zza);
        this.zzc = new WeakReference<>(zzcjbVar);
    }

    public static /* synthetic */ void zzs(zzcla zzclaVar, String str, Map map) {
        zzcjb zzcjbVar = zzclaVar.zzc.get();
        if (zzcjbVar != null) {
            zzcjbVar.zze("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract boolean zzd(String str);

    public boolean zze(String str, String[] strArr) {
        return zzd(str);
    }

    public boolean zzf(String str, String[] strArr, zzcks zzcksVar) {
        return zzd(str);
    }

    public void zzg(int i2) {
    }

    public void zzh(int i2) {
    }

    public void zzi(int i2) {
    }

    public void zzl(int i2) {
    }

    public abstract void zzm();

    @VisibleForTesting
    public final void zzn(String str, String str2, long j2, long j3, boolean z, long j4, long j5, long j6, int i2, int i3) {
        zzcgm.zza.post(new zzckv(this, str, str2, j2, j3, j4, j5, j6, z, i2, i3));
    }

    @VisibleForTesting
    public final void zzo(String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        zzcgm.zza.post(new zzckw(this, str, str2, i2, i3, j2, j3, z, i4, i5));
    }

    public final void zzp(String str, String str2, int i2) {
        zzcgm.zza.post(new zzckx(this, str, str2, i2));
    }

    @VisibleForTesting
    public final void zzq(String str, String str2, long j2) {
        zzcgm.zza.post(new zzcky(this, str, str2, j2));
    }

    @VisibleForTesting
    public final void zzr(String str, String str2, String str3, String str4) {
        zzcgm.zza.post(new zzckz(this, str, str2, str3, str4));
    }
}
