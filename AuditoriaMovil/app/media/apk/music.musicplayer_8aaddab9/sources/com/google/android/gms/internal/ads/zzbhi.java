package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbhi {
    private Date zzg;
    private String zzh;
    private Location zzk;
    private String zzl;
    private String zzm;
    private boolean zzo;
    private AdInfo zzp;
    private String zzq;
    private final HashSet<String> zza = new HashSet<>();
    private final Bundle zzb = new Bundle();
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzc = new HashMap<>();
    private final HashSet<String> zzd = new HashSet<>();
    private final Bundle zze = new Bundle();
    private final HashSet<String> zzf = new HashSet<>();
    private final List<String> zzi = new ArrayList();
    private int zzj = -1;
    private int zzn = -1;
    private int zzr = 60000;

    public static /* synthetic */ HashSet zza(zzbhi zzbhiVar) {
        return zzbhiVar.zza;
    }

    public static /* synthetic */ Bundle zzb(zzbhi zzbhiVar) {
        return zzbhiVar.zzb;
    }

    public static /* synthetic */ HashMap zzc(zzbhi zzbhiVar) {
        return zzbhiVar.zzc;
    }

    public static /* synthetic */ HashSet zzd(zzbhi zzbhiVar) {
        return zzbhiVar.zzd;
    }

    public static /* synthetic */ Bundle zze(zzbhi zzbhiVar) {
        return zzbhiVar.zze;
    }

    public static /* synthetic */ HashSet zzf(zzbhi zzbhiVar) {
        return zzbhiVar.zzf;
    }

    public static /* synthetic */ Date zzg(zzbhi zzbhiVar) {
        return zzbhiVar.zzg;
    }

    public static /* synthetic */ String zzh(zzbhi zzbhiVar) {
        return zzbhiVar.zzh;
    }

    public static /* synthetic */ List zzi(zzbhi zzbhiVar) {
        return zzbhiVar.zzi;
    }

    public static /* synthetic */ int zzj(zzbhi zzbhiVar) {
        return zzbhiVar.zzj;
    }

    public static /* synthetic */ Location zzk(zzbhi zzbhiVar) {
        return zzbhiVar.zzk;
    }

    public static /* synthetic */ String zzl(zzbhi zzbhiVar) {
        return zzbhiVar.zzl;
    }

    public static /* synthetic */ String zzm(zzbhi zzbhiVar) {
        return zzbhiVar.zzm;
    }

    public static /* synthetic */ int zzn(zzbhi zzbhiVar) {
        return zzbhiVar.zzn;
    }

    public static /* synthetic */ boolean zzo(zzbhi zzbhiVar) {
        return zzbhiVar.zzo;
    }

    public static /* synthetic */ AdInfo zzp(zzbhi zzbhiVar) {
        return zzbhiVar.zzp;
    }

    public static /* synthetic */ String zzq(zzbhi zzbhiVar) {
        return zzbhiVar.zzq;
    }

    public static /* synthetic */ int zzr(zzbhi zzbhiVar) {
        return zzbhiVar.zzr;
    }

    public final void zzA(List<String> list) {
        this.zzi.clear();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                zzcgt.zzi("neighboring content URL should not be null or empty");
            } else {
                this.zzi.add(str);
            }
        }
    }

    @Deprecated
    public final void zzB(int i2) {
        this.zzj = i2;
    }

    public final void zzC(Location location) {
        this.zzk = location;
    }

    public final void zzD(String str) {
        this.zzl = str;
    }

    public final void zzE(String str) {
        this.zzm = str;
    }

    @Deprecated
    public final void zzF(boolean z) {
        this.zzn = z ? 1 : 0;
    }

    public final void zzG(String str, String str2) {
        this.zze.putString(str, str2);
    }

    public final void zzH(String str) {
        this.zzf.add(str);
    }

    @Deprecated
    public final void zzI(boolean z) {
        this.zzo = z;
    }

    public final void zzJ(AdInfo adInfo) {
        this.zzp = adInfo;
    }

    public final void zzK(String str) {
        this.zzq = str;
    }

    public final void zzL(int i2) {
        this.zzr = i2;
    }

    public final void zzs(String str) {
        this.zza.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void zzt(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zzu(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzc.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zzu(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.zzb.putBundle(cls.getName(), bundle);
    }

    public final void zzv(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzb.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.checkNotNull(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zzw(String str) {
        this.zzd.add(str);
    }

    public final void zzx(String str) {
        this.zzd.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public final void zzy(Date date) {
        this.zzg = date;
    }

    public final void zzz(String str) {
        this.zzh = str;
    }
}
