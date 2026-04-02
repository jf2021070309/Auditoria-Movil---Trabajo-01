package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzclj extends zzcla implements zzcir {
    public static final /* synthetic */ int zzd = 0;
    private zzcis zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzcks zzi;
    private long zzj;
    private long zzk;

    public zzclj(zzcjb zzcjbVar, zzcja zzcjaVar) {
        super(zzcjbVar);
        zzcis zzckiVar;
        Context context = zzcjbVar.getContext();
        if (zzcjaVar.zzm) {
            zzckiVar = new zzcmb(context, zzcjaVar, this.zzc.get());
        } else {
            zzckiVar = new zzcki(context, zzcjaVar, this.zzc.get());
        }
        this.zze = zzckiVar;
        zzckiVar.zzr(this);
    }

    protected static final String zzt(String str) {
        String valueOf = String.valueOf(zzcgm.zzd(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzw(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcli
            private final zzclj zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk();
            }
        }, j);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(message);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcla, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcis zzcisVar = this.zze;
        if (zzcisVar != null) {
            zzcisVar.zzr(null);
            this.zze.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzC() {
        com.google.android.gms.ads.internal.util.zze.zzi("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zza(final boolean z, final long j) {
        final zzcjb zzcjbVar = this.zzc.get();
        if (zzcjbVar != null) {
            zzchg.zze.execute(new Runnable(zzcjbVar, z, j) { // from class: com.google.android.gms.internal.ads.zzclh
                private final zzcjb zza;
                private final boolean zzb;
                private final long zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zzcjbVar;
                    this.zzb = z;
                    this.zzc = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcjb zzcjbVar2 = this.zza;
                    boolean z2 = this.zzb;
                    long j2 = this.zzc;
                    int i = zzclj.zzd;
                    zzcjbVar2.zzv(z2, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzc(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zzd(String str) {
        return zze(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcla] */
    /* JADX WARN: Type inference failed for: r5v10, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zze(String str, String[] strArr) {
        String str2;
        String str3;
        zzclj zzcljVar;
        long j;
        long j2;
        long j3;
        ?? r1;
        long j4;
        String str4;
        long j5;
        long j6;
        long j7;
        zzclj zzcljVar2 = this;
        String str5 = str;
        zzcljVar2.zzf = str5;
        String zzt = zzt(str);
        String str6 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            zzcljVar2.zze.zzp(uriArr, zzcljVar2.zzb);
            zzcjb zzcjbVar = zzcljVar2.zzc.get();
            if (zzcjbVar != null) {
                zzcjbVar.zzu(zzt, zzcljVar2);
            }
            Clock zzj = com.google.android.gms.ads.internal.zzt.zzj();
            long currentTimeMillis = zzj.currentTimeMillis();
            long longValue = ((Long) zzbet.zzc().zzc(zzbjl.zzt)).longValue();
            long longValue2 = ((Long) zzbet.zzc().zzc(zzbjl.zzs)).longValue() * 1000;
            long intValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzr)).intValue();
            boolean booleanValue = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();
            long j8 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzj.currentTimeMillis() - currentTimeMillis <= longValue2) {
                            if (!zzcljVar2.zzg) {
                                if (zzcljVar2.zzh) {
                                    break;
                                } else if (zzcljVar2.zze.zzA()) {
                                    long zzH = zzcljVar2.zze.zzH();
                                    if (zzH > 0) {
                                        long zzN = zzcljVar2.zze.zzN();
                                        if (zzN != j8) {
                                            try {
                                                j = intValue;
                                                j7 = zzH;
                                                j2 = longValue2;
                                                j4 = longValue;
                                                str4 = zzt;
                                            } catch (Throwable th) {
                                                th = th;
                                                zzcljVar = this;
                                                str2 = str;
                                                str3 = zzt;
                                            }
                                            try {
                                                zzn(str, zzt, zzN, j7, zzN > 0, booleanValue ? zzcljVar2.zze.zzI() : -1L, booleanValue ? zzcljVar2.zze.zzJ() : -1L, booleanValue ? zzcljVar2.zze.zzK() : -1L, zzcis.zzP(), zzcis.zzQ());
                                                j6 = zzN;
                                                j5 = zzH;
                                                str2 = j7;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                zzcljVar = this;
                                                str2 = str;
                                                str3 = str4;
                                                try {
                                                    throw th;
                                                } catch (Exception e) {
                                                    e = e;
                                                    String str7 = str6;
                                                    String message = e.getMessage();
                                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                                                    sb.append("Failed to preload url ");
                                                    sb.append(str2);
                                                    sb.append(" Exception: ");
                                                    sb.append(message);
                                                    com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
                                                    com.google.android.gms.ads.internal.zzt.zzg().zzl(e, "VideoStreamExoPlayerCache.preload");
                                                    release();
                                                    zzcljVar.zzr(str2, str3, str7, zzx(str7, e));
                                                    return false;
                                                }
                                            }
                                        } else {
                                            j = intValue;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            str4 = zzt;
                                            j5 = zzH;
                                            j6 = j8;
                                            str2 = intValue;
                                        }
                                        zzcljVar = (zzN > j5 ? 1 : (zzN == j5 ? 0 : -1));
                                        if (zzcljVar < 0) {
                                            try {
                                                zzclj zzcljVar3 = this;
                                                str2 = str;
                                                str3 = str4;
                                                if (zzcljVar3.zze.zzO() < j || zzN <= 0) {
                                                    j3 = j4;
                                                    r1 = j6;
                                                    zzcljVar = zzcljVar3;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                throw th;
                                            }
                                        } else {
                                            zzq(str, str4, j5);
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        str2 = str5;
                                        str3 = zzt;
                                        zzcljVar = zzcljVar2;
                                        j3 = longValue;
                                        r1 = j8;
                                    }
                                    try {
                                        try {
                                            zzcljVar.wait(j3);
                                        } catch (InterruptedException unused) {
                                            throw new IOException("Wait interrupted.");
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str6 = r1;
                                        throw th;
                                    }
                                } else {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                            } else {
                                throw new IOException("Abort requested before buffering finished. ");
                            }
                        } else {
                            long j9 = longValue2;
                            StringBuilder sb2 = new StringBuilder(47);
                            sb2.append("Timeout reached. Limit: ");
                            sb2.append(j9);
                            sb2.append(" ms");
                            throw new IOException(sb2.toString());
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = zzt;
                        zzcljVar = zzcljVar2;
                    }
                }
                longValue = j3;
                zzcljVar2 = zzcljVar;
                str5 = str2;
                zzt = str3;
                intValue = j;
                longValue2 = j2;
                j8 = r1;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            str2 = str5;
            str3 = zzt;
            zzcljVar = zzcljVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zzf(String str, String[] strArr, zzcks zzcksVar) {
        this.zzf = str;
        this.zzi = zzcksVar;
        String zzt = zzt(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzp(uriArr, this.zzb);
            zzcjb zzcjbVar = this.zzc.get();
            if (zzcjbVar != null) {
                zzcjbVar.zzu(zzt, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
            this.zzk = -1L;
            zzw(0L);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            com.google.android.gms.ads.internal.util.zze.zzi(sb.toString());
            com.google.android.gms.ads.internal.zzt.zzg().zzl(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzr(str, zzt, "error", zzx("error", e));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzg(int i) {
        this.zze.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzh(int i) {
        this.zze.zzF(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzi(int i) {
        this.zze.zzx(i);
    }

    public final zzcis zzj() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzr(null);
        zzcis zzcisVar = this.zze;
        this.zze = null;
        return zzcisVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.zzclj, com.google.android.gms.internal.ads.zzcla] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.zzclj] */
    /* JADX WARN: Type inference failed for: r2v31 */
    public final /* synthetic */ void zzk() {
        String str;
        zzclj zzcljVar;
        zzclj zzcljVar2;
        zzbjj zzc;
        long longValue;
        long intValue;
        zzclj zzcljVar3;
        long j;
        long j2;
        String str2;
        long j3;
        String zzt = zzt(this.zzf);
        String str3 = "error";
        try {
            zzbjd<Long> zzbjdVar = zzbjl.zzs;
            zzc = zzbet.zzc();
            longValue = ((Long) zzc.zzc(zzbjdVar)).longValue() * 1000;
            intValue = ((Integer) zzbet.zzc().zzc(zzbjl.zzr)).intValue();
            zzcljVar = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            str = zzt;
            zzcljVar = this;
        }
        synchronized (this) {
            try {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
                long j4 = this.zzj;
                if (currentTimeMillis - j4 <= longValue) {
                    try {
                        if (!this.zzg) {
                            if (!this.zzh) {
                                if (!this.zze.zzA()) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                long zzH = this.zze.zzH();
                                if (zzH > 0) {
                                    long zzN = this.zze.zzN();
                                    if (zzN != this.zzk) {
                                        try {
                                            j2 = intValue;
                                            str2 = zzt;
                                            try {
                                                zzn(this.zzf, zzt, zzN, zzH, zzN > 0, zzcljVar != 0 ? this.zze.zzI() : -1L, zzcljVar != 0 ? this.zze.zzJ() : -1L, zzcljVar != 0 ? this.zze.zzK() : -1L, zzcis.zzP(), zzcis.zzQ());
                                                zzcljVar = this;
                                                j = zzN;
                                                try {
                                                    zzcljVar.zzk = j;
                                                    j3 = zzH;
                                                    zzcljVar = zzcljVar;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    str = str2;
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                zzcljVar = this;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            zzcljVar = this;
                                            str = zzt;
                                        }
                                    } else {
                                        j = zzN;
                                        j2 = intValue;
                                        str2 = zzt;
                                        zzcljVar = this;
                                        j3 = zzH;
                                    }
                                    if (j >= j3) {
                                        zzcljVar.zzq(zzcljVar.zzf, str2, j3);
                                        zzcljVar2 = zzcljVar;
                                    } else {
                                        int i = (zzcljVar.zze.zzO() > j2 ? 1 : (zzcljVar.zze.zzO() == j2 ? 0 : -1));
                                        zzcljVar3 = zzcljVar;
                                        if (i >= 0) {
                                            zzcljVar3 = zzcljVar;
                                            if (j > 0) {
                                                zzcljVar2 = zzcljVar;
                                            }
                                        }
                                    }
                                } else {
                                    zzcljVar3 = this;
                                }
                                zzcljVar3.zzw(((Long) zzbet.zzc().zzc(zzbjl.zzt)).longValue());
                                return;
                            }
                            zzcljVar2 = this;
                            com.google.android.gms.ads.internal.zzt.zzy().zzd(zzcljVar2.zzi);
                        }
                        throw new IOException("Abort requested before buffering finished. ");
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzc;
                        str = j4;
                    }
                } else {
                    str = zzt;
                    zzcljVar = this;
                    try {
                        StringBuilder sb = new StringBuilder(47);
                        sb.append("Timeout reached. Limit: ");
                        sb.append(longValue);
                        sb.append(" ms");
                        throw new IOException(sb.toString());
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = zzt;
                zzcljVar = this;
            }
            try {
                throw th;
            } catch (Exception e2) {
                e = e2;
                String str4 = str3;
                String str5 = zzcljVar.zzf;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + String.valueOf(message).length());
                sb2.append("Failed to preload url ");
                sb2.append(str5);
                sb2.append(" Exception: ");
                sb2.append(message);
                com.google.android.gms.ads.internal.util.zze.zzi(sb2.toString());
                com.google.android.gms.ads.internal.zzt.zzg().zzl(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcljVar.zzr(zzcljVar.zzf, str, str4, zzx(str4, e));
                zzcljVar2 = zzcljVar;
                com.google.android.gms.ads.internal.zzt.zzy().zzd(zzcljVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzl(int i) {
        this.zze.zzy(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzm() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzr(this.zzf, zzt(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzu(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.zze.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzg().zzl(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzv(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.zze.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzg().zzl(exc, "VideoStreamExoPlayerCache.onException");
    }
}
