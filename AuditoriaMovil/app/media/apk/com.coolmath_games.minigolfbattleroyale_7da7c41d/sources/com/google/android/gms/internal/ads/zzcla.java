package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class zzcla implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference<zzcjb> zzc;

    public zzcla(zzcjb zzcjbVar) {
        this.zza = zzcjbVar.getContext();
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zza, zzcjbVar.zzt().zza);
        this.zzc = new WeakReference<>(zzcjbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzg(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzh(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzi(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzl(int i) {
    }

    public abstract void zzm();

    public final void zzn(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        zzcgm.zza.post(new zzckv(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public final void zzo(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzcgm.zza.post(new zzckw(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzp(String str, String str2, int i) {
        zzcgm.zza.post(new zzckx(this, str, str2, i));
    }

    public final void zzq(String str, String str2, long j) {
        zzcgm.zza.post(new zzcky(this, str, str2, j));
    }

    public final void zzr(String str, String str2, String str3, String str4) {
        zzcgm.zza.post(new zzckz(this, str, str2, str3, str4));
    }
}
