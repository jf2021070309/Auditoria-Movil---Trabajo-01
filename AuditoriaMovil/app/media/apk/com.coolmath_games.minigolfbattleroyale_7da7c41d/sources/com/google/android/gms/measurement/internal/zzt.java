package com.google.android.gms.measurement.internal;

import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.zzog;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzt {
    final /* synthetic */ zzy zza;
    private String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzgd zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map<Integer, Long> zzg;
    private Map<Integer, List<Long>> zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzt(zzy zzyVar, String str, zzs zzsVar) {
        this.zza = zzyVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new ArrayMap();
        this.zzh = new ArrayMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ BitSet zzc(zzt zztVar) {
        return zztVar.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzw zzwVar) {
        int zza = zzwVar.zza();
        Boolean bool = zzwVar.zzd;
        if (bool != null) {
            this.zzf.set(zza, bool.booleanValue());
        }
        Boolean bool2 = zzwVar.zze;
        if (bool2 != null) {
            this.zze.set(zza, bool2.booleanValue());
        }
        if (zzwVar.zzf != null) {
            Map<Integer, Long> map = this.zzg;
            Integer valueOf = Integer.valueOf(zza);
            Long l = map.get(valueOf);
            long longValue = zzwVar.zzf.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzg.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzwVar.zzg != null) {
            Map<Integer, List<Long>> map2 = this.zzh;
            Integer valueOf2 = Integer.valueOf(zza);
            List<Long> list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList<>();
                this.zzh.put(valueOf2, list);
            }
            if (zzwVar.zzb()) {
                list.clear();
            }
            zzog.zzb();
            if (this.zza.zzs.zzc().zzn(this.zzb, zzea.zzZ) && zzwVar.zzc()) {
                list.clear();
            }
            zzog.zzb();
            if (!this.zza.zzs.zzc().zzn(this.zzb, zzea.zzZ)) {
                list.add(Long.valueOf(zzwVar.zzg.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(zzwVar.zzg.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.zzfk zzb(int i) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.zzfj zzh = com.google.android.gms.internal.measurement.zzfk.zzh();
        zzh.zza(i);
        zzh.zzd(this.zzc);
        com.google.android.gms.internal.measurement.zzgd zzgdVar = this.zzd;
        if (zzgdVar != null) {
            zzh.zzc(zzgdVar);
        }
        com.google.android.gms.internal.measurement.zzgc zzk = com.google.android.gms.internal.measurement.zzgd.zzk();
        zzk.zzc(zzkp.zzn(this.zze));
        zzk.zza(zzkp.zzn(this.zzf));
        Map<Integer, Long> map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.zzg.keySet()) {
                int intValue = num.intValue();
                Long l = this.zzg.get(Integer.valueOf(intValue));
                if (l != null) {
                    com.google.android.gms.internal.measurement.zzfl zze = com.google.android.gms.internal.measurement.zzfm.zze();
                    zze.zza(intValue);
                    zze.zzb(l.longValue());
                    arrayList2.add(zze.zzaA());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzk.zze(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.zzh;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzge zzf = com.google.android.gms.internal.measurement.zzgf.zzf();
                zzf.zza(num2.intValue());
                List<Long> list2 = this.zzh.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzf.zzb(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzgf) zzf.zzaA());
            }
            list = arrayList3;
        }
        zzk.zzg(list);
        zzh.zzb(zzk);
        return zzh.zzaA();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzt(zzy zzyVar, String str, com.google.android.gms.internal.measurement.zzgd zzgdVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzs zzsVar) {
        this.zza = zzyVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzgdVar;
    }
}
