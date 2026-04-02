package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzbi extends zzaw {
    public zzbi() {
        this.zza.add(zzbl.ADD);
        this.zza.add(zzbl.DIVIDE);
        this.zza.add(zzbl.MODULUS);
        this.zza.add(zzbl.MULTIPLY);
        this.zza.add(zzbl.NEGATE);
        this.zza.add(zzbl.POST_DECREMENT);
        this.zza.add(zzbl.POST_INCREMENT);
        this.zza.add(zzbl.PRE_DECREMENT);
        this.zza.add(zzbl.PRE_INCREMENT);
        this.zza.add(zzbl.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List<zzap> list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 0) {
            zzap zzb = zzgVar.zzb((zzap) a.Q(zzblVar, 2, list, 0));
            zzap zzb2 = zzgVar.zzb(list.get(1));
            if (!(zzb instanceof zzal) && !(zzb instanceof zzat) && !(zzb2 instanceof zzal) && !(zzb2 instanceof zzat)) {
                return new zzah(Double.valueOf(zzb2.zzh().doubleValue() + zzb.zzh().doubleValue()));
            }
            String valueOf = String.valueOf(zzb.zzi());
            String valueOf2 = String.valueOf(zzb2.zzi());
            return new zzat(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } else if (ordinal != 21) {
            if (ordinal == 59) {
                zzap zzb3 = zzgVar.zzb((zzap) a.Q(zzbl.SUBTRACT, 2, list, 0));
                return new zzah(Double.valueOf(new zzah(Double.valueOf(-zzgVar.zzb(list.get(1)).zzh().doubleValue())).zzh().doubleValue() + zzb3.zzh().doubleValue()));
            } else if (ordinal == 52 || ordinal == 53) {
                zzh.zzh(str, 2, list);
                zzap zzb4 = zzgVar.zzb(list.get(0));
                zzgVar.zzb(list.get(1));
                return zzb4;
            } else if (ordinal == 55 || ordinal == 56) {
                zzh.zzh(str, 1, list);
                return zzgVar.zzb(list.get(0));
            } else {
                switch (ordinal) {
                    case 44:
                        return new zzah(Double.valueOf(zzgVar.zzb((zzap) a.Q(zzbl.MODULUS, 2, list, 0)).zzh().doubleValue() % zzgVar.zzb(list.get(1)).zzh().doubleValue()));
                    case 45:
                        return new zzah(Double.valueOf(zzgVar.zzb((zzap) a.Q(zzbl.MULTIPLY, 2, list, 0)).zzh().doubleValue() * zzgVar.zzb(list.get(1)).zzh().doubleValue()));
                    case 46:
                        return new zzah(Double.valueOf(-zzgVar.zzb((zzap) a.Q(zzbl.NEGATE, 1, list, 0)).zzh().doubleValue()));
                    default:
                        return super.zzb(str);
                }
            }
        } else {
            return new zzah(Double.valueOf(zzgVar.zzb((zzap) a.Q(zzbl.DIVIDE, 2, list, 0)).zzh().doubleValue() / zzgVar.zzb(list.get(1)).zzh().doubleValue()));
        }
    }
}
