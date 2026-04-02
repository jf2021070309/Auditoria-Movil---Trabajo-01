package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzbh extends zzaw {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzbh() {
        this.zza.add(zzbl.FOR_IN);
        this.zza.add(zzbl.FOR_IN_CONST);
        this.zza.add(zzbl.FOR_IN_LET);
        this.zza.add(zzbl.FOR_LET);
        this.zza.add(zzbl.FOR_OF);
        this.zza.add(zzbl.FOR_OF_CONST);
        this.zza.add(zzbl.FOR_OF_LET);
        this.zza.add(zzbl.WHILE);
    }

    private static zzap zzc(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        return zze(zzbfVar, zzapVar.zzf(), zzapVar2);
    }

    private static zzap zzd(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof Iterable) {
            return zze(zzbfVar, ((Iterable) zzapVar).iterator(), zzapVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static zzap zze(zzbf zzbfVar, Iterator<zzap> it, zzap zzapVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzap zzb = zzbfVar.zza(it.next()).zzb((zzae) zzapVar);
                if (zzb instanceof zzag) {
                    zzag zzagVar = (zzag) zzb;
                    if ("break".equals(zzagVar.zzg())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzg())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List<zzap> list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    zzh.zza(zzbl.FOR_IN.name(), 3, list);
                    if (!(list.get(0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                    }
                    return zzc(new zzbg(zzgVar, list.get(0).zzc()), zzgVar.zza(list.get(1)), zzgVar.zza(list.get(2)));
                case 27:
                    zzh.zza(zzbl.FOR_IN_CONST.name(), 3, list);
                    if (!(list.get(0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    }
                    return zzc(new zzbd(zzgVar, list.get(0).zzc()), zzgVar.zza(list.get(1)), zzgVar.zza(list.get(2)));
                case 28:
                    zzh.zza(zzbl.FOR_IN_LET.name(), 3, list);
                    if (!(list.get(0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                    }
                    return zzc(new zzbe(zzgVar, list.get(0).zzc()), zzgVar.zza(list.get(1)), zzgVar.zza(list.get(2)));
                case 29:
                    zzh.zza(zzbl.FOR_LET.name(), 4, list);
                    zzap zza = zzgVar.zza(list.get(0));
                    if (!(zza instanceof zzae)) {
                        throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                    }
                    zzae zzaeVar = (zzae) zza;
                    zzap zzapVar = list.get(1);
                    zzap zzapVar2 = list.get(2);
                    zzap zza2 = zzgVar.zza(list.get(3));
                    zzg zzc = zzgVar.zzc();
                    for (int i = 0; i < zzaeVar.zzh(); i++) {
                        String zzc2 = zzaeVar.zzl(i).zzc();
                        zzc.zze(zzc2, zzgVar.zzh(zzc2));
                    }
                    while (zzgVar.zza(zzapVar).zze().booleanValue()) {
                        zzap zzb = zzgVar.zzb((zzae) zza2);
                        if (zzb instanceof zzag) {
                            zzag zzagVar = (zzag) zzb;
                            if ("break".equals(zzagVar.zzg())) {
                                return zzap.zzf;
                            }
                            if ("return".equals(zzagVar.zzg())) {
                                return zzagVar;
                            }
                        }
                        zzg zzc3 = zzgVar.zzc();
                        for (int i2 = 0; i2 < zzaeVar.zzh(); i2++) {
                            String zzc4 = zzaeVar.zzl(i2).zzc();
                            zzc3.zze(zzc4, zzc.zzh(zzc4));
                        }
                        zzc3.zza(zzapVar2);
                        zzc = zzc3;
                    }
                    return zzap.zzf;
                case 30:
                    zzh.zza(zzbl.FOR_OF.name(), 3, list);
                    if (!(list.get(0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    }
                    return zzd(new zzbg(zzgVar, list.get(0).zzc()), zzgVar.zza(list.get(1)), zzgVar.zza(list.get(2)));
                case 31:
                    zzh.zza(zzbl.FOR_OF_CONST.name(), 3, list);
                    if (!(list.get(0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    }
                    return zzd(new zzbd(zzgVar, list.get(0).zzc()), zzgVar.zza(list.get(1)), zzgVar.zza(list.get(2)));
                case 32:
                    zzh.zza(zzbl.FOR_OF_LET.name(), 3, list);
                    if (!(list.get(0) instanceof zzat)) {
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    }
                    return zzd(new zzbe(zzgVar, list.get(0).zzc()), zzgVar.zza(list.get(1)), zzgVar.zza(list.get(2)));
                default:
                    return super.zzb(str);
            }
        }
        zzh.zza(zzbl.WHILE.name(), 4, list);
        zzap zzapVar3 = list.get(0);
        zzap zzapVar4 = list.get(1);
        zzap zza3 = zzgVar.zza(list.get(3));
        if (zzgVar.zza(list.get(2)).zze().booleanValue()) {
            zzap zzb2 = zzgVar.zzb((zzae) zza3);
            if (zzb2 instanceof zzag) {
                zzag zzagVar2 = (zzag) zzb2;
                if ("break".equals(zzagVar2.zzg())) {
                    return zzap.zzf;
                }
                if ("return".equals(zzagVar2.zzg())) {
                    return zzagVar2;
                }
            }
        }
        while (zzgVar.zza(zzapVar3).zze().booleanValue()) {
            zzap zzb3 = zzgVar.zzb((zzae) zza3);
            if (zzb3 instanceof zzag) {
                zzag zzagVar3 = (zzag) zzb3;
                if ("break".equals(zzagVar3.zzg())) {
                    return zzap.zzf;
                }
                if ("return".equals(zzagVar3.zzg())) {
                    return zzagVar3;
                }
            }
            zzgVar.zza(zzapVar4);
        }
        return zzap.zzf;
    }
}
