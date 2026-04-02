package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgi implements zzhh {
    private final ArrayList<zzhg> zza = new ArrayList<>(1);
    private final HashSet<zzhg> zzb = new HashSet<>(1);
    private final zzho zzc = new zzho();
    private final zzfa zzd = new zzfa();
    private Looper zze;
    private zzaiq zzf;

    protected void zzF() {
    }

    protected abstract void zza(zzay zzayVar);

    protected void zzc() {
    }

    protected abstract void zzd();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zze(zzaiq zzaiqVar) {
        this.zzf = zzaiqVar;
        ArrayList<zzhg> arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).zza(this, zzaiqVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzho zzf(zzhf zzhfVar) {
        return this.zzc.zza(0, zzhfVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzho zzg(int i, zzhf zzhfVar, long j) {
        return this.zzc.zza(i, zzhfVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzfa zzh(zzhf zzhfVar) {
        return this.zzd.zza(0, zzhfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzfa zzi(int i, zzhf zzhfVar) {
        return this.zzd.zza(i, zzhfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzj() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzl(zzhp zzhpVar) {
        this.zzc.zzc(zzhpVar);
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
        if (this.zze != null) {
            boolean isEmpty = this.zzb.isEmpty();
            this.zzb.add(zzhgVar);
            if (isEmpty) {
                zzF();
                return;
            }
            return;
        }
        throw null;
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
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzb.clear();
            zzd();
            return;
        }
        zzq(zzhgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final zzaiq zzs() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final boolean zzt() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzk(Handler handler, zzhp zzhpVar) {
        if (zzhpVar != null) {
            this.zzc.zzb(handler, zzhpVar);
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzhh
    public final void zzm(Handler handler, zzfb zzfbVar) {
        if (zzfbVar != null) {
            this.zzd.zzb(handler, zzfbVar);
            return;
        }
        throw null;
    }
}
