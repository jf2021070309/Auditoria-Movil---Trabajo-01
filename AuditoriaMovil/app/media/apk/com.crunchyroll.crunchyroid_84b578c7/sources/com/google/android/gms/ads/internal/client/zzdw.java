package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbzo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzdw {
    private Date zzg;
    private String zzh;
    private String zzk;
    private String zzl;
    private boolean zzn;
    private String zzo;
    private final HashSet zza = new HashSet();
    private final Bundle zzb = new Bundle();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final Bundle zze = new Bundle();
    private final HashSet zzf = new HashSet();
    private final List zzi = new ArrayList();
    private int zzj = -1;
    private int zzm = -1;
    private int zzp = 60000;

    @Deprecated
    public final void zzA(int i) {
        this.zzj = i;
    }

    public final void zzB(int i) {
        this.zzp = i;
    }

    @Deprecated
    public final void zzC(boolean z) {
        this.zzn = z;
    }

    public final void zzD(List list) {
        this.zzi.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                zzbzo.zzj("neighboring content URL should not be null or empty");
            } else {
                this.zzi.add(str);
            }
        }
    }

    public final void zzE(String str) {
        this.zzk = str;
    }

    public final void zzF(String str) {
        this.zzl = str;
    }

    @Deprecated
    public final void zzG(boolean z) {
        this.zzm = z ? 1 : 0;
    }

    public final void zzp(String str) {
        this.zzf.add(str);
    }

    public final void zzq(Class cls, Bundle bundle) {
        if (this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzb.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.checkNotNull(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zzr(String str, String str2) {
        this.zze.putString(str, str2);
    }

    public final void zzs(String str) {
        this.zza.add(str);
    }

    public final void zzt(Class cls, Bundle bundle) {
        this.zzb.putBundle(cls.getName(), bundle);
    }

    @Deprecated
    public final void zzu(NetworkExtras networkExtras) {
        this.zzc.put(networkExtras.getClass(), networkExtras);
    }

    public final void zzv(String str) {
        this.zzd.add(str);
    }

    public final void zzw(String str) {
        this.zzd.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzx(String str) {
        this.zzo = str;
    }

    @Deprecated
    public final void zzy(Date date) {
        this.zzg = date;
    }

    public final void zzz(String str) {
        this.zzh = str;
    }
}
