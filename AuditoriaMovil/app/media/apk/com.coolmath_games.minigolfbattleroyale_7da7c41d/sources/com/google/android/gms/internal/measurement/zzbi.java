package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzbi extends zzaw {
    /* JADX INFO: Access modifiers changed from: protected */
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
            zzh.zza(zzbl.ADD.name(), 2, list);
            zzap zza = zzgVar.zza(list.get(0));
            zzap zza2 = zzgVar.zza(list.get(1));
            if ((zza instanceof zzal) || (zza instanceof zzat) || (zza2 instanceof zzal) || (zza2 instanceof zzat)) {
                String valueOf = String.valueOf(zza.zzc());
                String valueOf2 = String.valueOf(zza2.zzc());
                return new zzat(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
            }
            return new zzah(Double.valueOf(zza.zzd().doubleValue() + zza2.zzd().doubleValue()));
        } else if (ordinal == 21) {
            zzh.zza(zzbl.DIVIDE.name(), 2, list);
            return new zzah(Double.valueOf(zzgVar.zza(list.get(0)).zzd().doubleValue() / zzgVar.zza(list.get(1)).zzd().doubleValue()));
        } else if (ordinal == 59) {
            zzh.zza(zzbl.SUBTRACT.name(), 2, list);
            return new zzah(Double.valueOf(zzgVar.zza(list.get(0)).zzd().doubleValue() + new zzah(Double.valueOf(-zzgVar.zza(list.get(1)).zzd().doubleValue())).zzd().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            zzh.zza(str, 2, list);
            zzap zza3 = zzgVar.zza(list.get(0));
            zzgVar.zza(list.get(1));
            return zza3;
        } else if (ordinal != 55 && ordinal != 56) {
            switch (ordinal) {
                case 44:
                    zzh.zza(zzbl.MODULUS.name(), 2, list);
                    return new zzah(Double.valueOf(zzgVar.zza(list.get(0)).zzd().doubleValue() % zzgVar.zza(list.get(1)).zzd().doubleValue()));
                case 45:
                    zzh.zza(zzbl.MULTIPLY.name(), 2, list);
                    return new zzah(Double.valueOf(zzgVar.zza(list.get(0)).zzd().doubleValue() * zzgVar.zza(list.get(1)).zzd().doubleValue()));
                case 46:
                    zzh.zza(zzbl.NEGATE.name(), 1, list);
                    return new zzah(Double.valueOf(-zzgVar.zza(list.get(0)).zzd().doubleValue()));
                default:
                    return super.zzb(str);
            }
        } else {
            zzh.zza(str, 1, list);
            return zzgVar.zza(list.get(0));
        }
    }
}
