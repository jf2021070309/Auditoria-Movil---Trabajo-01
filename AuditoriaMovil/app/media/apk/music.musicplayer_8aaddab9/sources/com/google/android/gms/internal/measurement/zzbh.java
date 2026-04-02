package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzbh extends zzaw {
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

    private static zzap zzc(zzbf zzbfVar, Iterator<zzap> it, zzap zzapVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzap zzc = zzbfVar.zza(it.next()).zzc((zzae) zzapVar);
                if (zzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
        }
        return zzap.zzf;
    }

    private static zzap zzd(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        return zzc(zzbfVar, zzapVar.zzl(), zzapVar2);
    }

    private static zzap zze(zzbf zzbfVar, zzap zzapVar, zzap zzapVar2) {
        if (zzapVar instanceof Iterable) {
            return zzc(zzbfVar, ((Iterable) zzapVar).iterator(), zzapVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List<zzap> list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 65) {
            zzap zzapVar = (zzap) a.Q(zzbl.WHILE, 4, list, 0);
            zzap zzapVar2 = list.get(1);
            zzap zzb = zzgVar.zzb(list.get(3));
            if (zzgVar.zzb(list.get(2)).zzg().booleanValue()) {
                zzap zzc = zzgVar.zzc((zzae) zzb);
                if (zzc instanceof zzag) {
                    zzag zzagVar = (zzag) zzc;
                    if ("break".equals(zzagVar.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar.zzc())) {
                        return zzagVar;
                    }
                }
            }
            while (zzgVar.zzb(zzapVar).zzg().booleanValue()) {
                zzap zzc2 = zzgVar.zzc((zzae) zzb);
                if (zzc2 instanceof zzag) {
                    zzag zzagVar2 = (zzag) zzc2;
                    if ("break".equals(zzagVar2.zzc())) {
                        return zzap.zzf;
                    }
                    if ("return".equals(zzagVar2.zzc())) {
                        return zzagVar2;
                    }
                }
                zzgVar.zzb(zzapVar2);
            }
            return zzap.zzf;
        }
        switch (ordinal) {
            case 26:
                if (a.Q(zzbl.FOR_IN, 3, list, 0) instanceof zzat) {
                    String zzi = list.get(0).zzi();
                    return zzd(new zzbg(zzgVar, zzi), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 27:
                if (a.Q(zzbl.FOR_IN_CONST, 3, list, 0) instanceof zzat) {
                    String zzi2 = list.get(0).zzi();
                    return zzd(new zzbd(zzgVar, zzi2), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 28:
                if (a.Q(zzbl.FOR_IN_LET, 3, list, 0) instanceof zzat) {
                    String zzi3 = list.get(0).zzi();
                    return zzd(new zzbe(zzgVar, zzi3), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 29:
                zzap zzb2 = zzgVar.zzb((zzap) a.Q(zzbl.FOR_LET, 4, list, 0));
                if (zzb2 instanceof zzae) {
                    zzae zzaeVar = (zzae) zzb2;
                    zzap zzapVar3 = list.get(1);
                    zzap zzapVar4 = list.get(2);
                    zzap zzb3 = zzgVar.zzb(list.get(3));
                    zzg zza = zzgVar.zza();
                    for (int i2 = 0; i2 < zzaeVar.zzc(); i2++) {
                        String zzi4 = zzaeVar.zze(i2).zzi();
                        zza.zzg(zzi4, zzgVar.zzd(zzi4));
                    }
                    while (zzgVar.zzb(zzapVar3).zzg().booleanValue()) {
                        zzap zzc3 = zzgVar.zzc((zzae) zzb3);
                        if (zzc3 instanceof zzag) {
                            zzag zzagVar3 = (zzag) zzc3;
                            if ("break".equals(zzagVar3.zzc())) {
                                return zzap.zzf;
                            }
                            if ("return".equals(zzagVar3.zzc())) {
                                return zzagVar3;
                            }
                        }
                        zzg zza2 = zzgVar.zza();
                        for (int i3 = 0; i3 < zzaeVar.zzc(); i3++) {
                            String zzi5 = zzaeVar.zze(i3).zzi();
                            zza2.zzg(zzi5, zza.zzd(zzi5));
                        }
                        zza2.zzb(zzapVar4);
                        zza = zza2;
                    }
                    return zzap.zzf;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 30:
                if (a.Q(zzbl.FOR_OF, 3, list, 0) instanceof zzat) {
                    String zzi6 = list.get(0).zzi();
                    return zze(new zzbg(zzgVar, zzi6), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 31:
                if (a.Q(zzbl.FOR_OF_CONST, 3, list, 0) instanceof zzat) {
                    String zzi7 = list.get(0).zzi();
                    return zze(new zzbd(zzgVar, zzi7), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 32:
                if (a.Q(zzbl.FOR_OF_LET, 3, list, 0) instanceof zzat) {
                    String zzi8 = list.get(0).zzi();
                    return zze(new zzbe(zzgVar, zzi8), zzgVar.zzb(list.get(1)), zzgVar.zzb(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            default:
                return super.zzb(str);
        }
    }
}
