package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.AdError;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzbk extends zzaw {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzbk() {
        this.zza.add(zzbl.ASSIGN);
        this.zza.add(zzbl.CONST);
        this.zza.add(zzbl.CREATE_ARRAY);
        this.zza.add(zzbl.CREATE_OBJECT);
        this.zza.add(zzbl.EXPRESSION_LIST);
        this.zza.add(zzbl.GET);
        this.zza.add(zzbl.GET_INDEX);
        this.zza.add(zzbl.GET_PROPERTY);
        this.zza.add(zzbl.NULL);
        this.zza.add(zzbl.SET_PROPERTY);
        this.zza.add(zzbl.TYPEOF);
        this.zza.add(zzbl.UNDEFINED);
        this.zza.add(zzbl.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List<zzap> list) {
        String str2;
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            zzh.zza(zzbl.ASSIGN.name(), 2, list);
            zzap zza = zzgVar.zza(list.get(0));
            if (!(zza instanceof zzat)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", zza.getClass().getCanonicalName()));
            }
            if (!zzgVar.zzd(zza.zzc())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", zza.zzc()));
            }
            zzap zza2 = zzgVar.zza(list.get(1));
            zzgVar.zze(zza.zzc(), zza2);
            return zza2;
        } else if (ordinal == 14) {
            zzh.zzb(zzbl.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                    zzap zza3 = zzgVar.zza(list.get(i2));
                    if (zza3 instanceof zzat) {
                        zzgVar.zzg(zza3.zzc(), zzgVar.zza(list.get(i2 + 1)));
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", zza3.getClass().getCanonicalName()));
                    }
                }
                return zzap.zzf;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
        } else if (ordinal == 24) {
            zzh.zzb(zzbl.EXPRESSION_LIST.name(), 1, list);
            zzap zzapVar = zzap.zzf;
            while (i < list.size()) {
                zzapVar = zzgVar.zza(list.get(i));
                if (zzapVar instanceof zzag) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i++;
            }
            return zzapVar;
        } else if (ordinal == 33) {
            zzh.zza(zzbl.GET.name(), 1, list);
            zzap zza4 = zzgVar.zza(list.get(0));
            if (!(zza4 instanceof zzat)) {
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", zza4.getClass().getCanonicalName()));
            }
            return zzgVar.zzh(zza4.zzc());
        } else if (ordinal == 49) {
            zzh.zza(zzbl.NULL.name(), 0, list);
            return zzap.zzg;
        } else if (ordinal == 58) {
            zzh.zza(zzbl.SET_PROPERTY.name(), 3, list);
            zzap zza5 = zzgVar.zza(list.get(0));
            zzap zza6 = zzgVar.zza(list.get(1));
            zzap zza7 = zzgVar.zza(list.get(2));
            if (zza5 == zzap.zzf || zza5 == zzap.zzg) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", zza6.zzc(), zza5.zzc()));
            }
            if (!(zza5 instanceof zzae) || !(zza6 instanceof zzah)) {
                if (zza5 instanceof zzal) {
                    ((zzal) zza5).zzm(zza6.zzc(), zza7);
                }
            } else {
                ((zzae) zza5).zzn(zza6.zzd().intValue(), zza7);
            }
            return zza7;
        } else if (ordinal == 17) {
            if (list.isEmpty()) {
                return new zzae();
            }
            zzae zzaeVar = new zzae();
            for (zzap zzapVar2 : list) {
                zzap zza8 = zzgVar.zza(zzapVar2);
                if (!(zza8 instanceof zzag)) {
                    zzaeVar.zzn(i, zza8);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return zzaeVar;
        } else if (ordinal == 18) {
            if (list.isEmpty()) {
                return new zzam();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            zzam zzamVar = new zzam();
            while (i < list.size() - 1) {
                zzap zza9 = zzgVar.zza(list.get(i));
                zzap zza10 = zzgVar.zza(list.get(i + 1));
                if (!(zza9 instanceof zzag) && !(zza10 instanceof zzag)) {
                    zzamVar.zzm(zza9.zzc(), zza10);
                    i += 2;
                } else {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
            }
            return zzamVar;
        } else if (ordinal == 35 || ordinal == 36) {
            zzh.zza(zzbl.GET_PROPERTY.name(), 2, list);
            zzap zza11 = zzgVar.zza(list.get(0));
            zzap zza12 = zzgVar.zza(list.get(1));
            if (!(zza11 instanceof zzae) || !zzh.zzd(zza12)) {
                if (zza11 instanceof zzal) {
                    return ((zzal) zza11).zzk(zza12.zzc());
                }
                if (zza11 instanceof zzat) {
                    if ("length".equals(zza12.zzc())) {
                        return new zzah(Double.valueOf(zza11.zzc().length()));
                    }
                    if (zzh.zzd(zza12) && zza12.zzd().doubleValue() < zza11.zzc().length()) {
                        return new zzat(String.valueOf(zza11.zzc().charAt(zza12.zzd().intValue())));
                    }
                }
                return zzap.zzf;
            }
            return ((zzae) zza11).zzl(zza12.zzd().intValue());
        } else {
            switch (ordinal) {
                case 62:
                    zzh.zza(zzbl.TYPEOF.name(), 1, list);
                    zzap zza13 = zzgVar.zza(list.get(0));
                    if (zza13 instanceof zzau) {
                        str2 = AdError.UNDEFINED_DOMAIN;
                    } else if (zza13 instanceof zzaf) {
                        str2 = "boolean";
                    } else if (zza13 instanceof zzah) {
                        str2 = "number";
                    } else if (zza13 instanceof zzat) {
                        str2 = "string";
                    } else if (zza13 instanceof zzao) {
                        str2 = "function";
                    } else if ((zza13 instanceof zzaq) || (zza13 instanceof zzag)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zza13));
                    } else {
                        str2 = "object";
                    }
                    return new zzat(str2);
                case 63:
                    zzh.zza(zzbl.UNDEFINED.name(), 0, list);
                    return zzap.zzf;
                case 64:
                    zzh.zzb(zzbl.VAR.name(), 1, list);
                    for (zzap zzapVar3 : list) {
                        zzap zza14 = zzgVar.zza(zzapVar3);
                        if (zza14 instanceof zzat) {
                            zzgVar.zzf(zza14.zzc(), zzap.zzf);
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", zza14.getClass().getCanonicalName()));
                        }
                    }
                    return zzap.zzf;
                default:
                    return super.zzb(str);
            }
        }
    }
}
