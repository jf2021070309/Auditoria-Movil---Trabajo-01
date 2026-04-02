package com.google.android.gms.internal.cast;

import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzx {
    public static final /* synthetic */ int zzc = 0;
    private static final Logger zzd = new Logger("SessionFlowSummary");
    private static final String zze = "21.4.0";
    private static long zzf = System.currentTimeMillis();
    CastSession zza;
    public Integer zzb;
    private final zzg zzl;
    private final String zzm;
    private final long zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private final zzfc zzg = zzff.zza(new zzfc() { // from class: com.google.android.gms.internal.cast.zzw
        @Override // com.google.android.gms.internal.cast.zzfc
        public final Object zza() {
            int i = zzx.zzc;
            return ((CastContext) Preconditions.checkNotNull(CastContext.getSharedInstance())).getCastOptions().getReceiverApplicationId();
        }
    });
    private final List zzh = Collections.synchronizedList(new ArrayList());
    private final List zzi = Collections.synchronizedList(new ArrayList());
    private final List zzj = Collections.synchronizedList(new ArrayList());
    private final Map zzk = Collections.synchronizedMap(new HashMap());
    private final long zzn = DefaultClock.getInstance().currentTimeMillis();

    private zzx(zzg zzgVar, String str) {
        this.zzl = zzgVar;
        this.zzm = str;
        long j = zzf;
        zzf = 1 + j;
        this.zzo = j;
    }

    public static zzx zza(zzg zzgVar, String str) {
        return new zzx(zzgVar, str);
    }

    public final void zzb(zzq zzqVar) {
        zzqVar.zzb(this.zzn);
        this.zzj.add(zzqVar);
    }

    public final void zzc(zzz zzzVar) {
        zzzVar.zzb(this.zzn);
        this.zzh.add(zzzVar);
    }

    public final void zzd(zzab zzabVar) {
        zzabVar.zzb(this.zzn);
        this.zzi.add(zzabVar);
    }

    public final void zze() {
        long j;
        CastSession castSession = this.zza;
        if (castSession != null) {
            castSession.zzj(null);
            this.zza = null;
        }
        long j2 = this.zzo;
        zznn zzc2 = zzno.zzc();
        zzc2.zzm(j2);
        String str = this.zzq;
        if (str != null) {
            zzc2.zzj(str);
        }
        String str2 = this.zzr;
        if (str2 != null) {
            zzc2.zzg(str2);
        }
        zznd zza = zzne.zza();
        zza.zzb(zze);
        zza.zza(this.zzm);
        zzc2.zzb((zzne) zza.zzq());
        zzfc zzfcVar = this.zzg;
        zznt zza2 = zznu.zza();
        Object zza3 = zzfcVar.zza();
        if (zza3 != null) {
            zzoj zza4 = zzok.zza();
            zza4.zza((String) zza3);
            zza2.zze((zzok) zza4.zzq());
        }
        String str3 = this.zzp;
        if (str3 != null) {
            try {
                String replace = str3.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                zzd.w(e, "receiverSessionId %s is not valid for hash", str3);
                j = 0;
            }
            zza2.zzf(j);
        }
        if (!this.zzh.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (zzz zzzVar : this.zzh) {
                arrayList.add(zzzVar.zza());
            }
            zza2.zza(arrayList);
        }
        if (!this.zzi.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (zzab zzabVar : this.zzi) {
                arrayList2.add(zzabVar.zza());
            }
            zza2.zzc(arrayList2);
        }
        if (!this.zzj.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (zzq zzqVar : this.zzj) {
                arrayList3.add(zzqVar.zza());
            }
            zza2.zzb(arrayList3);
        }
        if (!this.zzk.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            for (zzad zzadVar : this.zzk.values()) {
                arrayList4.add(zzadVar.zza());
            }
            zza2.zzd(arrayList4);
        }
        zzc2.zzl((zznu) zza2.zzq());
        this.zzl.zze((zzno) zzc2.zzq(), 233);
    }

    public final void zzf(CastSession castSession) {
        if (castSession == null) {
            zzh(2);
            return;
        }
        CastDevice castDevice = castSession.getCastDevice();
        if (castDevice == null) {
            zzh(3);
            return;
        }
        this.zza = castSession;
        String str = this.zzq;
        if (str == null) {
            this.zzq = castDevice.zzc();
            this.zzr = castDevice.getModelName();
            this.zzb = Integer.valueOf(castSession.zzm());
        } else if (!TextUtils.equals(str, castDevice.zzc())) {
            zzh(5);
        }
    }

    public final void zzg(String str) {
        String str2 = this.zzp;
        if (str2 == null) {
            this.zzp = str;
        } else if (!TextUtils.equals(str, str2)) {
            zzh(4);
        }
    }

    public final void zzh(int i) {
        Map map = this.zzk;
        Integer valueOf = Integer.valueOf(i - 1);
        zzad zzadVar = (zzad) map.get(valueOf);
        if (zzadVar == null) {
            zzad zzadVar2 = new zzad(new zzac(i));
            zzadVar2.zzc(this.zzn);
            this.zzk.put(valueOf, zzadVar2);
            return;
        }
        zzadVar.zzb();
    }
}
