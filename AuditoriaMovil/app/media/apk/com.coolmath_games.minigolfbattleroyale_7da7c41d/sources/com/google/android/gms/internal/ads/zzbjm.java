package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbjm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbkn.zzd("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbkw.zza);
        zzc(arrayList, zzbkw.zzb);
        zzc(arrayList, zzbkw.zzc);
        zzc(arrayList, zzbkw.zzd);
        zzc(arrayList, zzbkw.zze);
        zzc(arrayList, zzbkw.zzk);
        zzc(arrayList, zzbkw.zzf);
        zzc(arrayList, zzbkw.zzg);
        zzc(arrayList, zzbkw.zzh);
        zzc(arrayList, zzbkw.zzi);
        zzc(arrayList, zzbkw.zzj);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzblh.zza);
        return arrayList;
    }

    private static void zzc(List<String> list, zzbkn<String> zzbknVar) {
        String zze = zzbknVar.zze();
        if (TextUtils.isEmpty(zze)) {
            return;
        }
        list.add(zze);
    }
}
