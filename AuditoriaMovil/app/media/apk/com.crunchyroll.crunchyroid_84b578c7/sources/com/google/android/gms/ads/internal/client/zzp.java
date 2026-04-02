package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzbzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzp {
    public static final zzp zza = new zzp();

    public final zzl zza(Context context, zzdx zzdxVar) {
        long j;
        Context context2;
        List list;
        zzfh zzfhVar;
        String str;
        Date zzn = zzdxVar.zzn();
        if (zzn != null) {
            j = zzn.getTime();
        } else {
            j = -1;
        }
        long j2 = j;
        String zzk = zzdxVar.zzk();
        int zza2 = zzdxVar.zza();
        Set zzq = zzdxVar.zzq();
        if (!zzq.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(zzq));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean zzs = zzdxVar.zzs(context2);
        Bundle zzf = zzdxVar.zzf(AdMobAdapter.class);
        String zzl = zzdxVar.zzl();
        SearchAdRequest zzi = zzdxVar.zzi();
        if (zzi != null) {
            zzfhVar = new zzfh(zzi);
        } else {
            zzfhVar = null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzay.zzb();
            str = zzbzh.zzq(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzr = zzdxVar.zzr();
        RequestConfiguration zzc = zzej.zzf().zzc();
        return new zzl(8, j2, zzf, zza2, list, zzs, Math.max(zzdxVar.zzc(), zzc.getTagForChildDirectedTreatment()), false, zzl, zzfhVar, null, zzk, zzdxVar.zzg(), zzdxVar.zze(), Collections.unmodifiableList(new ArrayList(zzdxVar.zzp())), zzdxVar.zzm(), str, zzr, null, Math.max(-1, zzc.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(null, zzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = RequestConfiguration.zza;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), zzdxVar.zzo(), zzdxVar.zzb(), zzdxVar.zzj());
    }
}
