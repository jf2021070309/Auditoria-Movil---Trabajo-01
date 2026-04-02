package com.google.android.gms.measurement.internal;

import android.util.Log;
/* loaded from: classes2.dex */
public final class zzei implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ Object zze;
    public final /* synthetic */ zzel zzf;

    public zzei(zzel zzelVar, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzelVar;
        this.zza = i2;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        long j2;
        char c3;
        long j3;
        zzfa zzm = this.zzf.zzs.zzm();
        if (!zzm.zzx()) {
            Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c2 = this.zzf.zza;
        if (c2 == 0) {
            if (this.zzf.zzs.zzf().zzy()) {
                zzel zzelVar = this.zzf;
                zzelVar.zzs.zzaw();
                zzelVar.zza = 'C';
            } else {
                zzel zzelVar2 = this.zzf;
                zzelVar2.zzs.zzaw();
                zzelVar2.zza = 'c';
            }
        }
        j2 = this.zzf.zzb;
        if (j2 < 0) {
            zzel zzelVar3 = this.zzf;
            zzelVar3.zzs.zzf().zzh();
            zzelVar3.zzb = 46000L;
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        c3 = this.zzf.zza;
        j3 = this.zzf.zzb;
        String zzo = zzel.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder(zzo.length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c3);
        sb.append(j3);
        sb.append(":");
        sb.append(zzo);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.zzb.substring(0, 1024);
        }
        zzey zzeyVar = zzm.zzb;
        if (zzeyVar != null) {
            zzeyVar.zzb(sb2, 1L);
        }
    }
}
