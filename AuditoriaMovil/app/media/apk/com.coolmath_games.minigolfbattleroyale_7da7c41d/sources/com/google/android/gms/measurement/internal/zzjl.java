package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzjl extends zzke {
    public final zzey zza;
    public final zzey zzb;
    public final zzey zzc;
    public final zzey zzd;
    public final zzey zze;
    private String zzg;
    private boolean zzh;
    private long zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjl(zzkn zzknVar) {
        super(zzknVar);
        zzfb zzd = this.zzs.zzd();
        zzd.getClass();
        this.zza = new zzey(zzd, "last_delete_stale", 0L);
        zzfb zzd2 = this.zzs.zzd();
        zzd2.getClass();
        this.zzb = new zzey(zzd2, "backoff", 0L);
        zzfb zzd3 = this.zzs.zzd();
        zzd3.getClass();
        this.zzc = new zzey(zzd3, "last_upload", 0L);
        zzfb zzd4 = this.zzs.zzd();
        zzd4.getClass();
        this.zzd = new zzey(zzd4, "last_upload_attempt", 0L);
        zzfb zzd5 = this.zzs.zzd();
        zzd5.getClass();
        this.zze = new zzey(zzd5, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzke
    protected final boolean zzaA() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> zzc(String str, zzaf zzafVar) {
        if (zzafVar.zzf()) {
            return zzd(str);
        }
        return new Pair<>("", false);
    }

    @Deprecated
    final Pair<String, Boolean> zzd(String str) {
        zzg();
        long elapsedRealtime = this.zzs.zzay().elapsedRealtime();
        String str2 = this.zzg;
        if (str2 == null || elapsedRealtime >= this.zzi) {
            this.zzi = elapsedRealtime + this.zzs.zzc().zzj(str, zzea.zza);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzax());
                this.zzg = "";
                String id = advertisingIdInfo.getId();
                if (id != null) {
                    this.zzg = id;
                }
                this.zzh = advertisingIdInfo.isLimitAdTrackingEnabled();
            } catch (Exception e) {
                this.zzs.zzau().zzj().zzb("Unable to get advertising id", e);
                this.zzg = "";
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair<>(this.zzg, Boolean.valueOf(this.zzh));
        }
        return new Pair<>(str2, Boolean.valueOf(this.zzh));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final String zzf(String str) {
        zzg();
        String str2 = (String) zzd(str).first;
        MessageDigest zzN = zzku.zzN();
        if (zzN == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzN.digest(str2.getBytes())));
    }
}
