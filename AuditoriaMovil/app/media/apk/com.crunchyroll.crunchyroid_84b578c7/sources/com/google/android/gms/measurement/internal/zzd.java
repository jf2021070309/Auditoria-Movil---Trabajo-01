package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.k6.p;
import com.amazon.aps.iva.x.a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzb = new a();
        this.zza = new a();
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            e.e(zzdVar.zzt, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzir zzj = zzdVar.zzt.zzs().zzj(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzdVar.zzb.remove(str);
                Long l = (Long) zzdVar.zza.get(str);
                if (l == null) {
                    com.amazon.aps.iva.m80.a.a(zzdVar.zzt, "First ad unit exposure time was never set");
                } else {
                    zzdVar.zza.remove(str);
                    zzdVar.zzi(str, j - l.longValue(), zzj);
                }
                if (zzdVar.zzb.isEmpty()) {
                    long j2 = zzdVar.zzc;
                    if (j2 == 0) {
                        com.amazon.aps.iva.m80.a.a(zzdVar.zzt, "First ad exposure time was never set");
                        return;
                    }
                    zzdVar.zzh(j - j2, zzj);
                    zzdVar.zzc = 0L;
                    return;
                }
                return;
            }
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzt.zzaA().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void zzh(long j, zzir zzirVar) {
        if (zzirVar == null) {
            p.e(this.zzt, "Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzlp.zzK(zzirVar, bundle, true);
            this.zzt.zzq().zzG("am", "_xa", bundle);
        }
    }

    private final void zzi(String str, long j, zzir zzirVar) {
        if (zzirVar == null) {
            p.e(this.zzt, "Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzlp.zzK(zzirVar, bundle, true);
            this.zzt.zzq().zzG("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j) {
        for (String str : this.zza.keySet()) {
            this.zza.put(str, Long.valueOf(j));
        }
        if (!this.zza.isEmpty()) {
            this.zzc = j;
        }
    }

    public final void zzd(String str, long j) {
        if (str != null && str.length() != 0) {
            this.zzt.zzaB().zzp(new zza(this, str, j));
        } else {
            com.amazon.aps.iva.m80.a.a(this.zzt, "Ad unit id must be a non-empty string");
        }
    }

    public final void zze(String str, long j) {
        if (str != null && str.length() != 0) {
            this.zzt.zzaB().zzp(new zzb(this, str, j));
        } else {
            com.amazon.aps.iva.m80.a.a(this.zzt, "Ad unit id must be a non-empty string");
        }
    }

    public final void zzf(long j) {
        zzir zzj = this.zzt.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j - this.zzc, zzj);
        }
        zzj(j);
    }
}
