package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.amazon.aps.iva.e4.e;
import com.amazon.aps.iva.x.a;
import com.amazon.aps.iva.x.g;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzfu extends zzku implements zzaf {
    final Map zza;
    final Map zzb;
    final Map zzc;
    final g zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    public zzfu(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzg = new a();
        this.zza = new a();
        this.zzb = new a();
        this.zzc = new a();
        this.zzh = new a();
        this.zzj = new a();
        this.zzk = new a();
        this.zzl = new a();
        this.zzi = new a();
        this.zzd = new zzfr(this, 20);
        this.zze = new zzfs(this);
    }

    private final com.google.android.gms.internal.measurement.zzff zzA(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzlj.zzm(com.google.android.gms.internal.measurement.zzff.zze(), bArr)).zzaD();
            zzer zzj = this.zzt.zzaA().zzj();
            String str2 = null;
            if (zzffVar.zzu()) {
                l = Long.valueOf(zzffVar.zzc());
            } else {
                l = null;
            }
            if (zzffVar.zzt()) {
                str2 = zzffVar.zzh();
            }
            zzj.zzc("Parsed config. version, gmp_app_id", l, str2);
            return zzffVar;
        } catch (com.google.android.gms.internal.measurement.zzll e) {
            this.zzt.zzaA().zzk().zzc("Unable to merge remote config. appId", zzet.zzn(str), e);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        } catch (RuntimeException e2) {
            this.zzt.zzaA().zzk().zzc("Unable to merge remote config. appId", zzet.zzn(str), e2);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
    }

    private final void zzB(String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        HashSet hashSet = new HashSet();
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        for (com.google.android.gms.internal.measurement.zzfb zzfbVar : zzfeVar.zzg()) {
            hashSet.add(zzfbVar.zzb());
        }
        for (int i = 0; i < zzfeVar.zza(); i++) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) zzfeVar.zzb(i).zzbB();
            if (zzfcVar.zzc().isEmpty()) {
                e.e(this.zzt, "EventConfig contained null event name");
            } else {
                String zzc = zzfcVar.zzc();
                String zzb = zzhc.zzb(zzfcVar.zzc());
                if (!TextUtils.isEmpty(zzb)) {
                    zzfcVar.zzb(zzb);
                    zzfeVar.zzd(i, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    aVar.put(zzc, Boolean.TRUE);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    aVar2.put(zzfcVar.zzc(), Boolean.TRUE);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() >= 2 && zzfcVar.zza() <= 65535) {
                        aVar3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        this.zzt.zzaA().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, aVar);
        this.zzc.put(str, aVar2);
        this.zzi.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x011a: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:32:0x011a */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzC(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfu.zzC(java.lang.String):void");
    }

    private final void zzD(final String str, com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar.zza() != 0) {
            this.zzt.zzaA().zzj().zzb("EES programs found", Integer.valueOf(zzffVar.zza()));
            com.google.android.gms.internal.measurement.zzgt zzgtVar = (com.google.android.gms.internal.measurement.zzgt) zzffVar.zzo().get(0);
            try {
                com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
                zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfo
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzft(zzfu.this, str));
                    }
                });
                zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final zzfu zzfuVar = zzfu.this;
                        final String str2 = str;
                        return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfn
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                zzfu zzfuVar2 = zzfu.this;
                                String str3 = str2;
                                zzh zzj = zzfuVar2.zzf.zzh().zzj(str3);
                                HashMap hashMap = new HashMap();
                                hashMap.put("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
                                hashMap.put("package_name", str3);
                                zzfuVar2.zzt.zzf().zzh();
                                hashMap.put("gmp_version", 79000L);
                                if (zzj != null) {
                                    String zzy = zzj.zzy();
                                    if (zzy != null) {
                                        hashMap.put("app_version", zzy);
                                    }
                                    hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
                                    hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
                                }
                                return hashMap;
                            }
                        });
                    }
                });
                zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return new com.google.android.gms.internal.measurement.zzt(zzfu.this.zze);
                    }
                });
                zzcVar.zzc(zzgtVar);
                this.zzd.put(str, zzcVar);
                this.zzt.zzaA().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgtVar.zza().zza()));
                for (com.google.android.gms.internal.measurement.zzgr zzgrVar : zzgtVar.zza().zzd()) {
                    this.zzt.zzaA().zzj().zzb("EES program activity", zzgrVar.zzb());
                }
                return;
            } catch (com.google.android.gms.internal.measurement.zzd unused) {
                this.zzt.zzaA().zzd().zzb("Failed to load EES program. appId", str);
                return;
            }
        }
        this.zzd.remove(str);
    }

    private static final Map zzE(com.google.android.gms.internal.measurement.zzff zzffVar) {
        a aVar = new a();
        if (zzffVar != null) {
            for (com.google.android.gms.internal.measurement.zzfj zzfjVar : zzffVar.zzp()) {
                aVar.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return aVar;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfu zzfuVar, String str) {
        zzfuVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfuVar.zzo(str)) {
            return null;
        }
        if (zzfuVar.zzh.containsKey(str) && zzfuVar.zzh.get(str) != null) {
            zzfuVar.zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfuVar.zzh.get(str));
        } else {
            zzfuVar.zzC(str);
        }
        return (com.google.android.gms.internal.measurement.zzc) zzfuVar.zzd.snapshot().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    public final String zza(String str, String str2) {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }

    public final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.zzff zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str);
    }

    public final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    public final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    public final String zzi(String str) {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    public final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    public final void zzl(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    public final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    public final boolean zzn(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzff zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.zzs();
    }

    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzff zzffVar;
        if (TextUtils.isEmpty(str) || (zzffVar = (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str)) == null || zzffVar.zza() == 0) {
            return false;
        }
        return true;
    }

    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzq(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzr(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlp.zzaj(str2)) {
            return true;
        }
        if (zzs(str) && zzlp.zzak(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzs(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzA(str, bArr).zzbB();
        zzB(str, zzfeVar);
        zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        this.zzj.put(str, zzfeVar.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()));
        this.zzf.zzh().zzB(str, new ArrayList(zzfeVar.zzf()));
        try {
            zzfeVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()).zzbx();
        } catch (RuntimeException e) {
            this.zzt.zzaA().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzet.zzn(str), e);
        }
        zzak zzh = this.zzf.zzh();
        Preconditions.checkNotEmpty(str);
        zzh.zzg();
        zzh.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzh.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzh.zzt.zzaA().zzd().zzb("Failed to update remote config (got 0). appId", zzet.zzn(str));
            }
        } catch (SQLiteException e2) {
            zzh.zzt.zzaA().zzd().zzc("Error storing remote config. appId", zzet.zzn(str), e2);
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        return true;
    }

    public final boolean zzu(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean zzv(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null) {
            return false;
        }
        if (!((Set) this.zza.get(str)).contains("device_model") && !((Set) this.zza.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    public final boolean zzw(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    public final boolean zzx(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    public final boolean zzy(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) == null) {
            return false;
        }
        if (!((Set) this.zza.get(str)).contains("os_version") && !((Set) this.zza.get(str)).contains("device_info")) {
            return false;
        }
        return true;
    }

    public final boolean zzz(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }
}
