package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzbzh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzdx {
    private final Date zza;
    private final String zzb;
    private final List zzc;
    private final int zzd;
    private final Set zze;
    private final Bundle zzf;
    private final Map zzg;
    private final String zzh;
    private final String zzi;
    private final SearchAdRequest zzj;
    private final int zzk;
    private final Set zzl;
    private final Bundle zzm;
    private final Set zzn;
    private final boolean zzo;
    private final String zzp;
    private final int zzq;

    public zzdx(zzdw zzdwVar, SearchAdRequest searchAdRequest) {
        Date date;
        String str;
        List list;
        int i;
        HashSet hashSet;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i2;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z;
        String str4;
        int i3;
        date = zzdwVar.zzg;
        this.zza = date;
        str = zzdwVar.zzh;
        this.zzb = str;
        list = zzdwVar.zzi;
        this.zzc = list;
        i = zzdwVar.zzj;
        this.zzd = i;
        hashSet = zzdwVar.zza;
        this.zze = Collections.unmodifiableSet(hashSet);
        bundle = zzdwVar.zzb;
        this.zzf = bundle;
        hashMap = zzdwVar.zzc;
        this.zzg = Collections.unmodifiableMap(hashMap);
        str2 = zzdwVar.zzk;
        this.zzh = str2;
        str3 = zzdwVar.zzl;
        this.zzi = str3;
        this.zzj = searchAdRequest;
        i2 = zzdwVar.zzm;
        this.zzk = i2;
        hashSet2 = zzdwVar.zzd;
        this.zzl = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzdwVar.zze;
        this.zzm = bundle2;
        hashSet3 = zzdwVar.zzf;
        this.zzn = Collections.unmodifiableSet(hashSet3);
        z = zzdwVar.zzn;
        this.zzo = z;
        str4 = zzdwVar.zzo;
        this.zzp = str4;
        i3 = zzdwVar.zzp;
        this.zzq = i3;
    }

    @Deprecated
    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzq;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.zzf.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.zzm;
    }

    public final Bundle zzf(Class cls) {
        return this.zzf.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.zzf;
    }

    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.zzg.get(cls);
    }

    public final SearchAdRequest zzi() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzp;
    }

    public final String zzk() {
        return this.zzb;
    }

    public final String zzl() {
        return this.zzh;
    }

    public final String zzm() {
        return this.zzi;
    }

    @Deprecated
    public final Date zzn() {
        return this.zza;
    }

    public final List zzo() {
        return new ArrayList(this.zzc);
    }

    public final Set zzp() {
        return this.zzn;
    }

    public final Set zzq() {
        return this.zze;
    }

    @Deprecated
    public final boolean zzr() {
        return this.zzo;
    }

    public final boolean zzs(Context context) {
        RequestConfiguration zzc = zzej.zzf().zzc();
        zzay.zzb();
        String zzy = zzbzh.zzy(context);
        if (!this.zzl.contains(zzy) && !zzc.getTestDeviceIds().contains(zzy)) {
            return false;
        }
        return true;
    }
}
