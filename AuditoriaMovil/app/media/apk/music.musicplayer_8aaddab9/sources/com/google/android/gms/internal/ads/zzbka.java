package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbka {
    private final List<zzbjx> zza = new LinkedList();
    private final Map<String, String> zzb;
    private final Object zzc;

    public zzbka(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbjx zzf() {
        return new zzbjx(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime(), null, null);
    }

    public final void zza(zzbka zzbkaVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbjx zzbjxVar, long j2, String... strArr) {
        synchronized (this.zzc) {
            for (int i2 = 0; i2 <= 0; i2++) {
                this.zza.add(new zzbjx(j2, strArr[i2], zzbjxVar));
            }
        }
        return true;
    }

    public final zzbjz zzc() {
        zzbjz zzbjzVar;
        boolean booleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbjx zzbjxVar : this.zza) {
                long zza = zzbjxVar.zza();
                String zzb = zzbjxVar.zzb();
                zzbjx zzc = zzbjxVar.zzc();
                if (zzc != null && zza > 0) {
                    sb.append(zzb);
                    sb.append(CoreConstants.DOT);
                    sb.append(zza - zzc.zza());
                    sb.append(CoreConstants.COMMA_CHAR);
                    if (booleanValue) {
                        if (hashMap.containsKey(Long.valueOf(zzc.zza()))) {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzc.zza()));
                            sb2.append('+');
                            sb2.append(zzb);
                        } else {
                            hashMap.put(Long.valueOf(zzc.zza()), new StringBuilder(zzb));
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append(CoreConstants.DOT);
                    long longValue = ((Long) entry.getKey()).longValue();
                    sb3.append((longValue - com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime()) + com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis());
                    sb3.append(CoreConstants.COMMA_CHAR);
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbjzVar = new zzbjz(sb.toString(), str);
        }
        return zzbjzVar;
    }

    public final void zzd(String str, String str2) {
        zzbjq zze;
        if (TextUtils.isEmpty(str2) || (zze = com.google.android.gms.ads.internal.zzt.zzg().zze()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbjw zzd = zze.zzd(str);
            Map<String, String> map = this.zzb;
            map.put(str, zzd.zza(map.get(str), str2));
        }
    }

    @VisibleForTesting
    public final Map<String, String> zze() {
        Map<String, String> map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzg().zze();
            map = this.zzb;
        }
        return map;
    }
}
