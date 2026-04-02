package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbbj {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbck.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbcv.zza);
        zzc(arrayList, zzbcv.zzb);
        zzc(arrayList, zzbcv.zzc);
        zzc(arrayList, zzbcv.zzd);
        zzc(arrayList, zzbcv.zze);
        zzc(arrayList, zzbcv.zzu);
        zzc(arrayList, zzbcv.zzf);
        zzc(arrayList, zzbcv.zzm);
        zzc(arrayList, zzbcv.zzn);
        zzc(arrayList, zzbcv.zzo);
        zzc(arrayList, zzbcv.zzp);
        zzc(arrayList, zzbcv.zzq);
        zzc(arrayList, zzbcv.zzr);
        zzc(arrayList, zzbcv.zzs);
        zzc(arrayList, zzbcv.zzt);
        zzc(arrayList, zzbcv.zzg);
        zzc(arrayList, zzbcv.zzh);
        zzc(arrayList, zzbcv.zzi);
        zzc(arrayList, zzbcv.zzj);
        zzc(arrayList, zzbcv.zzk);
        zzc(arrayList, zzbcv.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbdj.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbck zzbckVar) {
        String str = (String) zzbckVar.zze();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
