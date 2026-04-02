package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzbb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzap zza(String str, zzae zzaeVar, zzg zzgVar, List<zzap> list) {
        String str2;
        String str3;
        char c;
        String str4;
        double min;
        zzai zzaiVar;
        switch (str.hashCode()) {
            case -1776922004:
                str2 = "toString";
                str3 = "filter";
                if (str.equals(str2)) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -1354795244:
                str3 = "filter";
                if (str.equals("concat")) {
                    str2 = "toString";
                    c = 0;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -1274492040:
                str3 = "filter";
                if (str.equals(str3)) {
                    str2 = "toString";
                    c = 2;
                    break;
                }
                str2 = "toString";
                c = 65535;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c = '\n';
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 17;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 3;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 19;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 107868:
                if (str.equals("map")) {
                    c = 7;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\b';
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = 5;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = '\t';
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = 15;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = 16;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 96891675:
                if (str.equals("every")) {
                    str2 = "toString";
                    str3 = "filter";
                    c = 1;
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = '\r';
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 14;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 11;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = '\f';
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 4;
                    str2 = "toString";
                    str3 = "filter";
                    break;
                }
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
            default:
                str2 = "toString";
                str3 = "filter";
                c = 65535;
                break;
        }
        String str5 = str2;
        String str6 = str3;
        double d = 0.0d;
        switch (c) {
            case 0:
                zzap zzt = zzaeVar.zzt();
                if (!list.isEmpty()) {
                    for (zzap zzapVar : list) {
                        zzap zza = zzgVar.zza(zzapVar);
                        if (!(zza instanceof zzag)) {
                            zzae zzaeVar2 = (zzae) zzt;
                            int zzh = zzaeVar2.zzh();
                            if (zza instanceof zzae) {
                                zzae zzaeVar3 = (zzae) zza;
                                Iterator<Integer> zzg = zzaeVar3.zzg();
                                while (zzg.hasNext()) {
                                    Integer next = zzg.next();
                                    zzaeVar2.zzn(next.intValue() + zzh, zzaeVar3.zzl(next.intValue()));
                                }
                            } else {
                                zzaeVar2.zzn(zzh, zza);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return zzt;
            case 1:
                zzh.zza("every", 1, list);
                zzap zza2 = zzgVar.zza(list.get(0));
                if (!(zza2 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzh() != 0 && zzc(zzaeVar, zzgVar, (zzao) zza2, false, true).zzh() != zzaeVar.zzh()) {
                    return zzap.zzl;
                }
                return zzap.zzk;
            case 2:
                zzh.zza(str6, 1, list);
                zzap zza3 = zzgVar.zza(list.get(0));
                if (!(zza3 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzi() == 0) {
                    return new zzae();
                }
                zzap zzt2 = zzaeVar.zzt();
                zzae zzc = zzc(zzaeVar, zzgVar, (zzao) zza3, null, true);
                zzae zzaeVar4 = new zzae();
                Iterator<Integer> zzg2 = zzc.zzg();
                while (zzg2.hasNext()) {
                    zzaeVar4.zzn(zzaeVar4.zzh(), ((zzae) zzt2).zzl(zzg2.next().intValue()));
                }
                return zzaeVar4;
            case 3:
                zzh.zza("forEach", 1, list);
                zzap zza4 = zzgVar.zza(list.get(0));
                if (!(zza4 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzi() == 0) {
                    return zzap.zzf;
                }
                zzc(zzaeVar, zzgVar, (zzao) zza4, null, null);
                return zzap.zzf;
            case 4:
                zzh.zzc("indexOf", 2, list);
                zzap zzapVar2 = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVar2 = zzgVar.zza(list.get(0));
                }
                if (list.size() > 1) {
                    double zzi = zzh.zzi(zzgVar.zza(list.get(1)).zzd().doubleValue());
                    if (zzi >= zzaeVar.zzh()) {
                        return new zzah(Double.valueOf(-1.0d));
                    }
                    d = zzi < 0.0d ? zzaeVar.zzh() + zzi : zzi;
                }
                Iterator<Integer> zzg3 = zzaeVar.zzg();
                while (zzg3.hasNext()) {
                    int intValue = zzg3.next().intValue();
                    double d2 = intValue;
                    if (d2 >= d && zzh.zzf(zzaeVar.zzl(intValue), zzapVar2)) {
                        return new zzah(Double.valueOf(d2));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 5:
                zzh.zzc("join", 1, list);
                if (zzaeVar.zzh() == 0) {
                    return zzap.zzm;
                }
                if (list.size() > 0) {
                    zzap zza5 = zzgVar.zza(list.get(0));
                    str4 = ((zza5 instanceof zzan) || (zza5 instanceof zzau)) ? "" : zza5.zzc();
                } else {
                    str4 = ",";
                }
                return new zzat(zzaeVar.zzs(str4));
            case 6:
                zzh.zzc("lastIndexOf", 2, list);
                zzap zzapVar3 = zzap.zzf;
                if (!list.isEmpty()) {
                    zzapVar3 = zzgVar.zza(list.get(0));
                }
                double zzh2 = zzaeVar.zzh() - 1;
                if (list.size() > 1) {
                    zzap zza6 = zzgVar.zza(list.get(1));
                    zzh2 = Double.isNaN(zza6.zzd().doubleValue()) ? zzaeVar.zzh() - 1 : zzh.zzi(zza6.zzd().doubleValue());
                    if (zzh2 < 0.0d) {
                        zzh2 += zzaeVar.zzh();
                    }
                }
                if (zzh2 < 0.0d) {
                    return new zzah(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(zzaeVar.zzh(), zzh2); min2 >= 0; min2--) {
                    if (zzaeVar.zzo(min2) && zzh.zzf(zzaeVar.zzl(min2), zzapVar3)) {
                        return new zzah(Double.valueOf(min2));
                    }
                }
                return new zzah(Double.valueOf(-1.0d));
            case 7:
                zzh.zza("map", 1, list);
                zzap zza7 = zzgVar.zza(list.get(0));
                if (!(zza7 instanceof zzao)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzh() == 0) {
                    return new zzae();
                }
                return zzc(zzaeVar, zzgVar, (zzao) zza7, null, null);
            case '\b':
                zzh.zza("pop", 0, list);
                int zzh3 = zzaeVar.zzh();
                if (zzh3 == 0) {
                    return zzap.zzf;
                }
                int i = zzh3 - 1;
                zzap zzl = zzaeVar.zzl(i);
                zzaeVar.zzr(i);
                return zzl;
            case '\t':
                if (!list.isEmpty()) {
                    for (zzap zzapVar4 : list) {
                        zzaeVar.zzn(zzaeVar.zzh(), zzgVar.zza(zzapVar4));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzh()));
            case '\n':
                return zzb(zzaeVar, zzgVar, list, true);
            case 11:
                return zzb(zzaeVar, zzgVar, list, false);
            case '\f':
                zzh.zza("reverse", 0, list);
                int zzh4 = zzaeVar.zzh();
                if (zzh4 != 0) {
                    for (int i2 = 0; i2 < zzh4 / 2; i2++) {
                        if (zzaeVar.zzo(i2)) {
                            zzap zzl2 = zzaeVar.zzl(i2);
                            zzaeVar.zzn(i2, null);
                            int i3 = (zzh4 - 1) - i2;
                            if (zzaeVar.zzo(i3)) {
                                zzaeVar.zzn(i2, zzaeVar.zzl(i3));
                            }
                            zzaeVar.zzn(i3, zzl2);
                        }
                    }
                }
                return zzaeVar;
            case '\r':
                zzh.zza("shift", 0, list);
                if (zzaeVar.zzh() == 0) {
                    return zzap.zzf;
                }
                zzap zzl3 = zzaeVar.zzl(0);
                zzaeVar.zzr(0);
                return zzl3;
            case 14:
                zzh.zzc("slice", 2, list);
                if (list.isEmpty()) {
                    return zzaeVar.zzt();
                }
                double zzh5 = zzaeVar.zzh();
                double zzi2 = zzh.zzi(zzgVar.zza(list.get(0)).zzd().doubleValue());
                if (zzi2 < 0.0d) {
                    min = Math.max(zzi2 + zzh5, 0.0d);
                } else {
                    min = Math.min(zzi2, zzh5);
                }
                if (list.size() == 2) {
                    double zzi3 = zzh.zzi(zzgVar.zza(list.get(1)).zzd().doubleValue());
                    if (zzi3 < 0.0d) {
                        zzh5 = Math.max(zzh5 + zzi3, 0.0d);
                    } else {
                        zzh5 = Math.min(zzh5, zzi3);
                    }
                }
                zzae zzaeVar5 = new zzae();
                for (int i4 = (int) min; i4 < zzh5; i4++) {
                    zzaeVar5.zzn(zzaeVar5.zzh(), zzaeVar.zzl(i4));
                }
                return zzaeVar5;
            case 15:
                zzh.zza("some", 1, list);
                zzap zza8 = zzgVar.zza(list.get(0));
                if (!(zza8 instanceof zzai)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (zzaeVar.zzh() == 0) {
                    return zzap.zzl;
                }
                zzai zzaiVar2 = (zzai) zza8;
                Iterator<Integer> zzg4 = zzaeVar.zzg();
                while (zzg4.hasNext()) {
                    int intValue2 = zzg4.next().intValue();
                    if (zzaeVar.zzo(intValue2) && zzaiVar2.zza(zzgVar, Arrays.asList(zzaeVar.zzl(intValue2), new zzah(Double.valueOf(intValue2)), zzaeVar)).zze().booleanValue()) {
                        return zzap.zzk;
                    }
                }
                return zzap.zzl;
            case 16:
                zzh.zzc("sort", 1, list);
                if (zzaeVar.zzh() >= 2) {
                    List<zzap> zzb = zzaeVar.zzb();
                    if (list.isEmpty()) {
                        zzaiVar = null;
                    } else {
                        zzap zza9 = zzgVar.zza(list.get(0));
                        if (!(zza9 instanceof zzai)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        zzaiVar = (zzai) zza9;
                    }
                    Collections.sort(zzb, new zzba(zzaiVar, zzgVar));
                    zzaeVar.zzp();
                    int i5 = 0;
                    for (zzap zzapVar5 : zzb) {
                        zzaeVar.zzn(i5, zzapVar5);
                        i5++;
                    }
                }
                return zzaeVar;
            case 17:
                if (list.isEmpty()) {
                    return new zzae();
                }
                int zzi4 = (int) zzh.zzi(zzgVar.zza(list.get(0)).zzd().doubleValue());
                if (zzi4 < 0) {
                    zzi4 = Math.max(0, zzi4 + zzaeVar.zzh());
                } else if (zzi4 > zzaeVar.zzh()) {
                    zzi4 = zzaeVar.zzh();
                }
                int zzh6 = zzaeVar.zzh();
                zzae zzaeVar6 = new zzae();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) zzh.zzi(zzgVar.zza(list.get(1)).zzd().doubleValue()));
                    if (max > 0) {
                        for (int i6 = zzi4; i6 < Math.min(zzh6, zzi4 + max); i6++) {
                            zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(zzi4));
                            zzaeVar.zzr(zzi4);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i7 = 2; i7 < list.size(); i7++) {
                            zzap zza10 = zzgVar.zza(list.get(i7));
                            if (!(zza10 instanceof zzag)) {
                                zzaeVar.zzq((zzi4 + i7) - 2, zza10);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                } else {
                    while (zzi4 < zzh6) {
                        zzaeVar6.zzn(zzaeVar6.zzh(), zzaeVar.zzl(zzi4));
                        zzaeVar.zzn(zzi4, null);
                        zzi4++;
                    }
                }
                return zzaeVar6;
            case 18:
                zzh.zza(str5, 0, list);
                return new zzat(zzaeVar.zzs(","));
            case 19:
                if (!list.isEmpty()) {
                    zzae zzaeVar7 = new zzae();
                    for (zzap zzapVar6 : list) {
                        zzap zza11 = zzgVar.zza(zzapVar6);
                        if (!(zza11 instanceof zzag)) {
                            zzaeVar7.zzn(zzaeVar7.zzh(), zza11);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int zzh7 = zzaeVar7.zzh();
                    Iterator<Integer> zzg5 = zzaeVar.zzg();
                    while (zzg5.hasNext()) {
                        Integer next2 = zzg5.next();
                        zzaeVar7.zzn(next2.intValue() + zzh7, zzaeVar.zzl(next2.intValue()));
                    }
                    zzaeVar.zzp();
                    Iterator<Integer> zzg6 = zzaeVar7.zzg();
                    while (zzg6.hasNext()) {
                        Integer next3 = zzg6.next();
                        zzaeVar.zzn(next3.intValue(), zzaeVar7.zzl(next3.intValue()));
                    }
                }
                return new zzah(Double.valueOf(zzaeVar.zzh()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static zzap zzb(zzae zzaeVar, zzg zzgVar, List<zzap> list, boolean z) {
        zzap zzapVar;
        zzh.zzb("reduce", 1, list);
        zzh.zzc("reduce", 2, list);
        zzap zza = zzgVar.zza(list.get(0));
        if (!(zza instanceof zzai)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            zzapVar = zzgVar.zza(list.get(1));
            if (zzapVar instanceof zzag) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else if (zzaeVar.zzh() == 0) {
            throw new IllegalStateException("Empty array with no initial value error");
        } else {
            zzapVar = null;
        }
        zzai zzaiVar = (zzai) zza;
        int zzh = zzaeVar.zzh();
        int i = z ? 0 : zzh - 1;
        int i2 = z ? zzh - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (zzapVar == null) {
            zzapVar = zzaeVar.zzl(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (zzaeVar.zzo(i)) {
                zzapVar = zzaiVar.zza(zzgVar, Arrays.asList(zzapVar, zzaeVar.zzl(i), new zzah(Double.valueOf(i)), zzaeVar));
                if (zzapVar instanceof zzag) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return zzapVar;
    }

    private static zzae zzc(zzae zzaeVar, zzg zzgVar, zzai zzaiVar, Boolean bool, Boolean bool2) {
        zzae zzaeVar2 = new zzae();
        Iterator<Integer> zzg = zzaeVar.zzg();
        while (zzg.hasNext()) {
            int intValue = zzg.next().intValue();
            if (zzaeVar.zzo(intValue)) {
                zzap zza = zzaiVar.zza(zzgVar, Arrays.asList(zzaeVar.zzl(intValue), new zzah(Double.valueOf(intValue)), zzaeVar));
                if (zza.zze().equals(bool)) {
                    return zzaeVar2;
                }
                if (bool2 == null || zza.zze().equals(bool2)) {
                    zzaeVar2.zzn(intValue, zza);
                }
            }
        }
        return zzaeVar2;
    }
}
