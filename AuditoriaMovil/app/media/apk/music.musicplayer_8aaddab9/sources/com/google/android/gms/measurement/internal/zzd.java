package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import c.f.a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzd extends zze {
    private final Map<String, Long> zza;
    private final Map<String, Integer> zzb;
    private long zzc;

    public zzd(zzfv zzfvVar) {
        super(zzfvVar);
        this.zzb = new a();
        this.zza = new a();
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j2) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j2;
        }
        Integer num = zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            e.a.d.a.a.H(zzdVar.zzs, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j2));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j2) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = zzdVar.zzb.get(str);
        if (num == null) {
            zzdVar.zzs.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzih zzj = zzdVar.zzs.zzs().zzj(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzb.remove(str);
        Long l2 = zzdVar.zza.get(str);
        if (l2 == null) {
            e.a.d.a.a.F(zzdVar.zzs, "First ad unit exposure time was never set");
        } else {
            long longValue = l2.longValue();
            zzdVar.zza.remove(str);
            zzdVar.zzi(str, j2 - longValue, zzj);
        }
        if (zzdVar.zzb.isEmpty()) {
            long j3 = zzdVar.zzc;
            if (j3 == 0) {
                e.a.d.a.a.F(zzdVar.zzs, "First ad exposure time was never set");
                return;
            }
            zzdVar.zzh(j2 - j3, zzj);
            zzdVar.zzc = 0L;
        }
    }

    private final void zzh(long j2, zzih zzihVar) {
        if (zzihVar == null) {
            e.a.d.a.a.G(this.zzs, "Not logging ad exposure. No active activity");
        } else if (j2 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j2);
            zzkz.zzJ(zzihVar, bundle, true);
            this.zzs.zzq().zzG("am", "_xa", bundle);
        }
    }

    private final void zzi(String str, long j2, zzih zzihVar) {
        if (zzihVar == null) {
            e.a.d.a.a.G(this.zzs, "Not logging ad unit exposure. No active activity");
        } else if (j2 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j2);
            zzkz.zzJ(zzihVar, bundle, true);
            this.zzs.zzq().zzG("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j2) {
        for (String str : this.zza.keySet()) {
            this.zza.put(str, Long.valueOf(j2));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j2;
    }

    public final void zzd(String str, long j2) {
        if (str == null || str.length() == 0) {
            e.a.d.a.a.F(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new zza(this, str, j2));
        }
    }

    public final void zze(String str, long j2) {
        if (str == null || str.length() == 0) {
            e.a.d.a.a.F(this.zzs, "Ad unit id must be a non-empty string");
        } else {
            this.zzs.zzaz().zzp(new zzb(this, str, j2));
        }
    }

    public final void zzf(long j2) {
        zzih zzj = this.zzs.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j2 - this.zza.get(str).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j2 - this.zzc, zzj);
        }
        zzj(j2);
    }
}
