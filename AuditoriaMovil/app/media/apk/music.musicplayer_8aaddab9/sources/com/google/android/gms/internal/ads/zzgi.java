package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class zzgi implements zzhh {
    private final ArrayList<zzhg> zza = new ArrayList<>(1);
    private final HashSet<zzhg> zzb = new HashSet<>(1);
    private final zzho zzc = new zzho();
    private final zzfa zzd = new zzfa();
    private Looper zze;
    private zzaiq zzf;

    public void zzF() {
    }

    public abstract void zza(zzay zzayVar);

    public void zzc() {
    }

    public abstract void zzd();

    public final void zze(zzaiq zzaiqVar) {
        this.zzf = zzaiqVar;
        ArrayList<zzhg> arrayList = this.zza;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).zza(this, zzaiqVar);
        }
    }

    public final zzho zzf(zzhf zzhfVar) {
        return this.zzc.zza(0, zzhfVar, 0L);
    }

    public final zzho zzg(int i2, zzhf zzhfVar, long j2) {
        return this.zzc.zza(i2, zzhfVar, 0L);
    }

    public final zzfa zzh(zzhf zzhfVar) {
        return this.zzd.zza(0, zzhfVar);
    }

    public final zzfa zzi(int i2, zzhf zzhfVar) {
        return this.zzd.zza(i2, zzhfVar);
    }

    public final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzk(Handler handler, zzhp zzhpVar) {
        Objects.requireNonNull(zzhpVar);
        this.zzc.zzb(handler, zzhpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzl(zzhp zzhpVar) {
        this.zzc.zzc(zzhpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzm(Handler handler, zzfb zzfbVar) {
        Objects.requireNonNull(zzfbVar);
        this.zzd.zzb(handler, zzfbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzn(zzfb zzfbVar) {
        this.zzd.zzc(zzfbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzo(zzhg zzhgVar, zzay zzayVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzakt.zza(z);
        zzaiq zzaiqVar = this.zzf;
        this.zza.add(zzhgVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzhgVar);
            zza(zzayVar);
        } else if (zzaiqVar != null) {
            zzp(zzhgVar);
            zzhgVar.zza(this, zzaiqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzp(zzhg zzhgVar) {
        Objects.requireNonNull(this.zze);
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zzhgVar);
        if (isEmpty) {
            zzF();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzq(zzhg zzhgVar) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzhgVar);
        if ((!isEmpty) && this.zzb.isEmpty()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzr(zzhg zzhgVar) {
        this.zza.remove(zzhgVar);
        if (!this.zza.isEmpty()) {
            zzq(zzhgVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzb.clear();
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzaiq zzs() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final boolean zzt() {
        return true;
    }
}
