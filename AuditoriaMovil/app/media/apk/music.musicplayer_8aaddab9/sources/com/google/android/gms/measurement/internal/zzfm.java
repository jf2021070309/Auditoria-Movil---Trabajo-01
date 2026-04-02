package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import c.f.a;
import c.f.f;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznl;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class zzfm extends zzki implements zzae {
    @VisibleForTesting
    public final Map<String, Map<String, Boolean>> zza;
    @VisibleForTesting
    public final Map<String, Map<String, Boolean>> zzb;
    @VisibleForTesting
    public final f<String, com.google.android.gms.internal.measurement.zzc> zzc;
    public final com.google.android.gms.internal.measurement.zzr zzd;
    private final Map<String, Map<String, String>> zze;
    private final Map<String, com.google.android.gms.internal.measurement.zzfc> zzg;
    private final Map<String, Map<String, Integer>> zzh;
    private final Map<String, String> zzi;

    public zzfm(zzks zzksVar) {
        super(zzksVar);
        this.zze = new a();
        this.zza = new a();
        this.zzb = new a();
        this.zzg = new a();
        this.zzi = new a();
        this.zzh = new a();
        this.zzc = new zzfj(this, 20);
        this.zzd = new zzfk(this);
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfm zzfmVar, String str) {
        zzfmVar.zzY();
        Preconditions.checkNotEmpty(str);
        zzpe.zzc();
        if (zzfmVar.zzs.zzf().zzs(null, zzdy.zzat) && zzfmVar.zzl(str)) {
            if (!zzfmVar.zzg.containsKey(str) || zzfmVar.zzg.get(str) == null) {
                zzfmVar.zzt(str);
            } else {
                zzfmVar.zzu(str, zzfmVar.zzg.get(str));
            }
            return zzfmVar.zzc.snapshot().get(str);
        }
        return null;
    }

    private final com.google.android.gms.internal.measurement.zzfc zzr(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzfc zzaA = ((com.google.android.gms.internal.measurement.zzfb) zzku.zzl(com.google.android.gms.internal.measurement.zzfc.zze(), bArr)).zzaA();
            this.zzs.zzay().zzj().zzc("Parsed config. version, gmp_app_id", zzaA.zzq() ? Long.valueOf(zzaA.zzc()) : null, zzaA.zzp() ? zzaA.zzh() : null);
            return zzaA;
        } catch (com.google.android.gms.internal.measurement.zzkh e2) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzel.zzn(str), e2);
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        } catch (RuntimeException e3) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzel.zzn(str), e3);
            return com.google.android.gms.internal.measurement.zzfc.zzg();
        }
    }

    private final void zzs(String str, com.google.android.gms.internal.measurement.zzfb zzfbVar) {
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (zzfbVar != null) {
            for (int i2 = 0; i2 < zzfbVar.zza(); i2++) {
                com.google.android.gms.internal.measurement.zzez zzbv = zzfbVar.zzb(i2).zzbv();
                if (TextUtils.isEmpty(zzbv.zzc())) {
                    e.a.d.a.a.H(this.zzs, "EventConfig contained null event name");
                } else {
                    String zzc = zzbv.zzc();
                    String zzb = zzgs.zzb(zzbv.zzc());
                    if (!TextUtils.isEmpty(zzb)) {
                        zzbv.zzb(zzb);
                        zzfbVar.zzd(i2, zzbv);
                    }
                    zznl.zzc();
                    zzaf zzf = this.zzs.zzf();
                    zzdx<Boolean> zzdxVar = zzdy.zzaC;
                    if (!zzf.zzs(null, zzdxVar)) {
                        aVar.put(zzc, Boolean.valueOf(zzbv.zzd()));
                    } else if (zzbv.zzf() && zzbv.zzd()) {
                        aVar.put(zzc, Boolean.TRUE);
                    }
                    zznl.zzc();
                    if (!this.zzs.zzf().zzs(null, zzdxVar)) {
                        aVar2.put(zzbv.zzc(), Boolean.valueOf(zzbv.zze()));
                    } else if (zzbv.zzg() && zzbv.zze()) {
                        aVar2.put(zzbv.zzc(), Boolean.TRUE);
                    }
                    if (zzbv.zzh()) {
                        if (zzbv.zza() < 2 || zzbv.zza() > 65535) {
                            this.zzs.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzbv.zzc(), Integer.valueOf(zzbv.zza()));
                        } else {
                            aVar3.put(zzbv.zzc(), Integer.valueOf(zzbv.zza()));
                        }
                    }
                }
            }
        }
        this.zza.put(str, aVar);
        this.zzb.put(str, aVar2);
        this.zzh.put(str, aVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x011b: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:39:0x011b */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzt(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfm.zzt(java.lang.String):void");
    }

    private final void zzu(final String str, com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        if (zzfcVar.zza() == 0) {
            this.zzc.remove(str);
            return;
        }
        this.zzs.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzfcVar.zza()));
        com.google.android.gms.internal.measurement.zzgo zzgoVar = zzfcVar.zzj().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfl(zzfm.this, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfm zzfmVar = zzfm.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfh
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfm zzfmVar2 = zzfm.this;
                            String str3 = str2;
                            zzg zzj = zzfmVar2.zzf.zzi().zzj(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            zzfmVar2.zzs.zzf().zzh();
                            hashMap.put("gmp_version", 46000L);
                            if (zzj != null) {
                                String zzw = zzj.zzw();
                                if (zzw != null) {
                                    hashMap.put("app_version", zzw);
                                }
                                hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
                                hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzff
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(zzfm.this.zzd);
                }
            });
            zzcVar.zzc(zzgoVar);
            this.zzc.put(str, zzcVar);
            this.zzs.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgoVar.zza().zza()));
            for (com.google.android.gms.internal.measurement.zzgm zzgmVar : zzgoVar.zza().zzd()) {
                this.zzs.zzay().zzj().zzb("EES program activity", zzgmVar.zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzs.zzay().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map<String, String> zzv(com.google.android.gms.internal.measurement.zzfc zzfcVar) {
        a aVar = new a();
        if (zzfcVar != null) {
            for (com.google.android.gms.internal.measurement.zzfe zzfeVar : zzfcVar.zzk()) {
                aVar.put(zzfeVar.zzb(), zzfeVar.zzc());
            }
        }
        return aVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzae
    public final String zza(String str, String str2) {
        zzg();
        zzt(str);
        Map<String, String> map = this.zze.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzki
    public final boolean zzb() {
        return false;
    }

    public final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzt(str);
        Map<String, Integer> map = this.zzh.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.zzfc zze(String str) {
        zzY();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzt(str);
        return this.zzg.get(str);
    }

    public final String zzf(String str) {
        zzg();
        return this.zzi.get(str);
    }

    public final void zzi(String str) {
        zzg();
        this.zzi.put(str, null);
    }

    public final void zzj(String str) {
        zzg();
        this.zzg.remove(str);
    }

    public final boolean zzk(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzfc zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.zzo();
    }

    public final boolean zzl(String str) {
        com.google.android.gms.internal.measurement.zzfc zzfcVar;
        zzpe.zzc();
        return (!this.zzs.zzf().zzs(null, zzdy.zzat) || TextUtils.isEmpty(str) || (zzfcVar = this.zzg.get(str)) == null || zzfcVar.zza() == 0) ? false : true;
    }

    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzn(String str, String str2) {
        Boolean bool;
        zzg();
        zzt(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzb.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzo(String str, String str2) {
        Boolean bool;
        zzg();
        zzt(str);
        if (zzm(str) && zzkz.zzag(str2)) {
            return true;
        }
        if (zzp(str) && zzkz.zzah(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zza.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzq(String str, byte[] bArr, String str2) {
        zzY();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfb zzbv = zzr(str, bArr).zzbv();
        if (zzbv == null) {
            return false;
        }
        zzs(str, zzbv);
        zzpe.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzat)) {
            zzu(str, zzbv.zzaA());
        }
        this.zzg.put(str, zzbv.zzaA());
        this.zzi.put(str, str2);
        this.zze.put(str, zzv(zzbv.zzaA()));
        this.zzf.zzi().zzC(str, new ArrayList(zzbv.zze()));
        try {
            zzbv.zzc();
            bArr = zzbv.zzaA().zzbs();
        } catch (RuntimeException e2) {
            this.zzs.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzel.zzn(str), e2);
        }
        zzoy.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzaq)) {
            this.zzf.zzi().zzG(str, bArr, str2);
        } else {
            this.zzf.zzi().zzG(str, bArr, null);
        }
        this.zzg.put(str, zzbv.zzaA());
        return true;
    }
}
