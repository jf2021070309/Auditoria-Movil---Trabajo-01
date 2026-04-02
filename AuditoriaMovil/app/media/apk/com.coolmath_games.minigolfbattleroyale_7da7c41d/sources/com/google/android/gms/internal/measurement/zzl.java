package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzl extends zzam {
    private final zzab zzb;

    public zzl(zzab zzabVar) {
        this.zzb = zzabVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzam, com.google.android.gms.internal.measurement.zzap
    public final zzap zzbK(String str, zzg zzgVar, List<zzap> list) {
        char c;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            zzh.zza("getEventName", 0, list);
            return new zzat(this.zzb.zzc().zzb());
        } else if (c == 1) {
            zzh.zza("getParamValue", 1, list);
            return zzi.zza(this.zzb.zzc().zze(zzgVar.zza(list.get(0)).zzc()));
        } else if (c == 2) {
            zzh.zza("getParams", 0, list);
            Map<String, Object> zzf = this.zzb.zzc().zzf();
            zzam zzamVar = new zzam();
            for (String str2 : zzf.keySet()) {
                zzamVar.zzm(str2, zzi.zza(zzf.get(str2)));
            }
            return zzamVar;
        } else if (c == 3) {
            zzh.zza("getTimestamp", 0, list);
            return new zzah(Double.valueOf(this.zzb.zzc().zza()));
        } else if (c == 4) {
            zzh.zza("setEventName", 1, list);
            zzap zza = zzgVar.zza(list.get(0));
            if (zzf.equals(zza) || zzg.equals(zza)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            this.zzb.zzc().zzc(zza.zzc());
            return new zzat(zza.zzc());
        } else {
            if (c == 5) {
                zzh.zza("setParamValue", 2, list);
                String zzc = zzgVar.zza(list.get(0)).zzc();
                zzap zza2 = zzgVar.zza(list.get(1));
                this.zzb.zzc().zzd(zzc, zzh.zzj(zza2));
                return zza2;
            }
            return super.zzbK(str, zzgVar, list);
        }
    }
}
