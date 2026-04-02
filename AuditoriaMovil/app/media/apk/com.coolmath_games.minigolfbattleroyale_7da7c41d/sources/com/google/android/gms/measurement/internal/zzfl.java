package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzfl extends zzke implements zzad {
    final LruCache<String, com.google.android.gms.internal.measurement.zzc> zza;
    final com.google.android.gms.internal.measurement.zzr zzb;
    private final Map<String, Map<String, String>> zzc;
    private final Map<String, Map<String, Boolean>> zzd;
    private final Map<String, Map<String, Boolean>> zze;
    private final Map<String, com.google.android.gms.internal.measurement.zzfc> zzg;
    private final Map<String, Map<String, Integer>> zzh;
    private final Map<String, String> zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfl(zzkn zzknVar) {
        super(zzknVar);
        this.zzc = new ArrayMap();
        this.zzd = new ArrayMap();
        this.zze = new ArrayMap();
        this.zzg = new ArrayMap();
        this.zzi = new ArrayMap();
        this.zzh = new ArrayMap();
        this.zza = new zzfi(this, 20);
        this.zzb = new zzfj(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.google.android.gms.internal.measurement.zzc zzo(zzfl zzflVar, String str) {
        zzflVar.zzZ();
        Preconditions.checkNotEmpty(str);
        zzpt.zzb();
        if (zzflVar.zzs.zzc().zzn(null, zzea.zzaD) && zzflVar.zzh(str)) {
            if (!zzflVar.zzg.containsKey(str) || zzflVar.zzg.get(str) == null) {
                zzflVar.zzq(str);
            } else {
                zzflVar.zzs(str, zzflVar.zzg.get(str));
            }
            return zzflVar.zza.snapshot().get(str);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0121: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:42:0x0121 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzq(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfl.zzq(java.lang.String):void");
    }

    private final void zzr(String str, com.google.android.gms.internal.measurement.zzfb zzfbVar) {
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (zzfbVar != null) {
            for (int i = 0; i < zzfbVar.zza(); i++) {
                com.google.android.gms.internal.measurement.zzez zzbu = zzfbVar.zzb(i).zzbu();
                if (TextUtils.isEmpty(zzbu.zza())) {
                    this.zzs.zzau().zze().zza("EventConfig contained null event name");
                } else {
                    String zza = zzbu.zza();
                    String zzb = zzgr.zzb(zzbu.zza());
                    if (!TextUtils.isEmpty(zzb)) {
                        zzbu.zzb(zzb);
                        zzfbVar.zzc(i, zzbu);
                    }
                    arrayMap.put(zza, Boolean.valueOf(zzbu.zzc()));
                    arrayMap2.put(zzbu.zza(), Boolean.valueOf(zzbu.zzd()));
                    if (zzbu.zze()) {
                        if (zzbu.zzf() < 2 || zzbu.zzf() > 65535) {
                            this.zzs.zzau().zze().zzc("Invalid sampling rate. Event name, sample rate", zzbu.zza(), Integer.valueOf(zzbu.zzf()));
                        } else {
                            arrayMap3.put(zzbu.zza(), Integer.valueOf(zzbu.zzf()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, arrayMap);
        this.zze.put(str, arrayMap2);
        this.zzh.put(str, arrayMap3);
    }

    private final void zzs(final String str, com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        if (zzfcVar.zzk() != 0) {
            this.zzs.zzau().zzk().zzb("EES programs found", Integer.valueOf(zzfcVar.zzk()));
            com.google.android.gms.internal.measurement.zzgo zzgoVar = zzfcVar.zzj().get(0);
            try {
                com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
                zzcVar.zza("internal.remoteConfig", new Callable(this, str) { // from class: com.google.android.gms.measurement.internal.zzfg
                    private final zzfl zza;
                    private final String zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = str;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfk(this.zza, this.zzb));
                    }
                });
                zzcVar.zza("internal.logger", new Callable(this) { // from class: com.google.android.gms.measurement.internal.zzfh
                    private final zzfl zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzt(this.zza.zzb);
                    }
                });
                zzcVar.zzf(zzgoVar);
                this.zza.put(str, zzcVar);
                this.zzs.zzau().zzk().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgoVar.zzb().zzb()));
                for (com.google.android.gms.internal.measurement.zzgm zzgmVar : zzgoVar.zzb().zza()) {
                    this.zzs.zzau().zzk().zzb("EES program activity", zzgmVar.zza());
                }
                return;
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.zzs.zzau().zzb().zzb("Failed to load EES program. appId", str);
                return;
            }
        }
        this.zza.remove(str);
    }

    private final com.google.android.gms.internal.measurement.zzfc zzt(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzfc.zzn();
        }
        try {
            com.google.android.gms.internal.measurement.zzfc zzaA = ((com.google.android.gms.internal.measurement.zzfb) zzkp.zzt(com.google.android.gms.internal.measurement.zzfc.zzm(), bArr)).zzaA();
            this.zzs.zzau().zzk().zzc("Parsed config. version, gmp_app_id", zzaA.zza() ? Long.valueOf(zzaA.zzb()) : null, zzaA.zzc() ? zzaA.zzd() : null);
            return zzaA;
        } catch (com.google.android.gms.internal.measurement.zzkn e) {
            this.zzs.zzau().zze().zzc("Unable to merge remote config. appId", zzem.zzl(str), e);
            return com.google.android.gms.internal.measurement.zzfc.zzn();
        } catch (RuntimeException e2) {
            this.zzs.zzau().zze().zzc("Unable to merge remote config. appId", zzem.zzl(str), e2);
            return com.google.android.gms.internal.measurement.zzfc.zzn();
        }
    }

    private static final Map<String, String> zzu(com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzfcVar != null) {
            for (com.google.android.gms.internal.measurement.zzfe zzfeVar : zzfcVar.zze()) {
                arrayMap.put(zzfeVar.zza(), zzfeVar.zzb());
            }
        }
        return arrayMap;
    }

    @Override // com.google.android.gms.measurement.internal.zzad
    public final String zza(String str, String str2) {
        zzg();
        zzq(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzke
    protected final boolean zzaA() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.measurement.zzfc zzb(String str) {
        zzZ();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzq(str);
        return this.zzg.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzc(String str) {
        zzg();
        return this.zzi.get(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzd(String str) {
        zzg();
        this.zzi.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze(String str) {
        zzg();
        this.zzg.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzf(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzfc zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        return zzb.zzi();
    }

    public final boolean zzh(String str) {
        com.google.android.gms.internal.measurement.zzfc zzfcVar;
        zzpt.zzb();
        return (!this.zzs.zzc().zzn(null, zzea.zzaD) || TextUtils.isEmpty(str) || (zzfcVar = this.zzg.get(str)) == null || zzfcVar.zzk() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzi(String str, byte[] bArr, String str2) {
        zzZ();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfb zzbu = zzt(str, bArr).zzbu();
        if (zzbu == null) {
            return false;
        }
        zzr(str, zzbu);
        zzpt.zzb();
        if (this.zzs.zzc().zzn(null, zzea.zzaD)) {
            zzs(str, zzbu.zzaA());
        }
        this.zzg.put(str, zzbu.zzaA());
        this.zzi.put(str, str2);
        this.zzc.put(str, zzu(zzbu.zzaA()));
        this.zzf.zzi().zzL(str, new ArrayList(zzbu.zzd()));
        try {
            zzbu.zze();
            bArr = zzbu.zzaA().zzbp();
        } catch (RuntimeException e) {
            this.zzs.zzau().zze().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzem.zzl(str), e);
        }
        zzpn.zzb();
        if (!this.zzs.zzc().zzn(null, zzea.zzaB)) {
            this.zzf.zzi().zzw(str, bArr, null);
        } else {
            this.zzf.zzi().zzw(str, bArr, str2);
        }
        this.zzg.put(str, zzbu.zzaA());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzj(String str, String str2) {
        Boolean bool;
        zzg();
        zzq(str);
        if (zzm(str) && zzku.zzR(str2)) {
            return true;
        }
        if (zzn(str) && zzku.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzd.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzk(String str, String str2) {
        Boolean bool;
        zzg();
        zzq(str);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzl(String str, String str2) {
        Integer num;
        zzg();
        zzq(str);
        Map<String, Integer> map = this.zzh.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzn(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }
}
