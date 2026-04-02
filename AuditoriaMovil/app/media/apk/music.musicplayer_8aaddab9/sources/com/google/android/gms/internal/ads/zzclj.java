package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import e.a.d.a.a;
import java.io.IOException;
@TargetApi(16)
/* loaded from: classes.dex */
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
        Context context = zzcjbVar.getContext();
        zzcis zzcmbVar = zzcjaVar.zzm ? new zzcmb(context, zzcjaVar, this.zzc.get()) : new zzcki(context, zzcjaVar, this.zzc.get());
        this.zze = zzcmbVar;
        zzcmbVar.zzr(this);
    }

    public static final String zzt(String str) {
        String valueOf = String.valueOf(zzcgm.zzd(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzw(long j2) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcli
            private final zzclj zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk();
            }
        }, j2);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        a.M(sb, str, "/", canonicalName, ":");
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
        zzcgt.zzi("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zza(final boolean z, final long j2) {
        final zzcjb zzcjbVar = this.zzc.get();
        if (zzcjbVar != null) {
            zzchg.zze.execute(new Runnable(zzcjbVar, z, j2) { // from class: com.google.android.gms.internal.ads.zzclh
                private final zzcjb zza;
                private final boolean zzb;
                private final long zzc;

                {
                    this.zza = zzcjbVar;
                    this.zzb = z;
                    this.zzc = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzv(this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzb(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzc(int i2, int i3) {
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
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v19 */
    @Override // com.google.android.gms.internal.ads.zzcla
    public final boolean zze(String str, String[] strArr) {
        String str2;
        String str3;
        zzclj zzcljVar;
        long j2;
        long j3;
        long j4;
        ?? r1;
        long j5;
        String str4;
        long j6;
        long j7;
        long j8;
        zzclj zzcljVar2 = this;
        String str5 = str;
        zzcljVar2.zzf = str5;
        String zzt = zzt(str);
        String str6 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                uriArr[i2] = Uri.parse(strArr[i2]);
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
            long j9 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (zzj.currentTimeMillis() - currentTimeMillis > longValue2) {
                            long j10 = longValue2;
                            StringBuilder sb = new StringBuilder(47);
                            sb.append("Timeout reached. Limit: ");
                            sb.append(j10);
                            sb.append(" ms");
                            throw new IOException(sb.toString());
                        } else if (zzcljVar2.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        } else {
                            if (zzcljVar2.zzh) {
                                break;
                            } else if (!zzcljVar2.zze.zzA()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            } else {
                                long zzH = zzcljVar2.zze.zzH();
                                if (zzH > 0) {
                                    long zzN = zzcljVar2.zze.zzN();
                                    if (zzN != j9) {
                                        try {
                                            j2 = intValue;
                                            j8 = zzH;
                                            j3 = longValue2;
                                            j5 = longValue;
                                            str4 = zzt;
                                        } catch (Throwable th) {
                                            th = th;
                                            zzcljVar = this;
                                            str2 = str;
                                            str3 = zzt;
                                        }
                                        try {
                                            zzn(str, zzt, zzN, j8, zzN > 0, booleanValue ? zzcljVar2.zze.zzI() : -1L, booleanValue ? zzcljVar2.zze.zzJ() : -1L, booleanValue ? zzcljVar2.zze.zzK() : -1L, zzcis.zzP(), zzcis.zzQ());
                                            j7 = zzN;
                                            j6 = zzH;
                                            str2 = j8;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zzcljVar = this;
                                            str2 = str;
                                            str3 = str4;
                                            try {
                                                throw th;
                                            } catch (Exception e2) {
                                                e = e2;
                                                String str7 = str6;
                                                String message = e.getMessage();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                                                sb2.append("Failed to preload url ");
                                                sb2.append(str2);
                                                sb2.append(" Exception: ");
                                                sb2.append(message);
                                                zzcgt.zzi(sb2.toString());
                                                com.google.android.gms.ads.internal.zzt.zzg().zzl(e, "VideoStreamExoPlayerCache.preload");
                                                release();
                                                zzcljVar.zzr(str2, str3, str7, zzx(str7, e));
                                                return false;
                                            }
                                        }
                                    } else {
                                        j2 = intValue;
                                        j3 = longValue2;
                                        j5 = longValue;
                                        str4 = zzt;
                                        j6 = zzH;
                                        j7 = j9;
                                        str2 = intValue;
                                    }
                                    zzcljVar = (zzN > j6 ? 1 : (zzN == j6 ? 0 : -1));
                                    if (zzcljVar >= 0) {
                                        zzq(str, str4, j6);
                                    } else {
                                        try {
                                            zzclj zzcljVar3 = this;
                                            str2 = str;
                                            str3 = str4;
                                            if (zzcljVar3.zze.zzO() < j2 || zzN <= 0) {
                                                j4 = j5;
                                                r1 = j7;
                                                zzcljVar = zzcljVar3;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            throw th;
                                        }
                                    }
                                } else {
                                    j2 = intValue;
                                    j3 = longValue2;
                                    str2 = str5;
                                    str3 = zzt;
                                    zzcljVar = zzcljVar2;
                                    j4 = longValue;
                                    r1 = j9;
                                }
                                try {
                                    try {
                                        zzcljVar.wait(j4);
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    str6 = r1;
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str2 = str5;
                        str3 = zzt;
                        zzcljVar = zzcljVar2;
                    }
                }
                longValue = j4;
                zzcljVar2 = zzcljVar;
                str5 = str2;
                zzt = str3;
                intValue = j2;
                longValue2 = j3;
                j9 = r1;
            }
            return true;
        } catch (Exception e3) {
            e = e3;
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
            for (int i2 = 0; i2 < strArr.length; i2++) {
                uriArr[i2] = Uri.parse(strArr[i2]);
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
        } catch (Exception e2) {
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            zzcgt.zzi(sb.toString());
            com.google.android.gms.ads.internal.zzt.zzg().zzl(e2, "VideoStreamExoPlayerCache.preload");
            release();
            zzr(str, zzt, "error", zzx("error", e2));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzg(int i2) {
        this.zze.zzG(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzh(int i2) {
        this.zze.zzF(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzi(int i2) {
        this.zze.zzx(i2);
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
        long j2;
        long j3;
        String str2;
        long j4;
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
        } catch (Exception e2) {
            e = e2;
            str = zzt;
            zzcljVar = this;
        }
        synchronized (this) {
            try {
                int i2 = ((com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() - this.zzj) > longValue ? 1 : ((com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() - this.zzj) == longValue ? 0 : -1));
                if (i2 <= 0) {
                    try {
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzA()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long zzH = this.zze.zzH();
                            if (zzH > 0) {
                                long zzN = this.zze.zzN();
                                if (zzN != this.zzk) {
                                    try {
                                        j3 = intValue;
                                        str2 = zzt;
                                        try {
                                            zzn(this.zzf, zzt, zzN, zzH, zzN > 0, zzcljVar != 0 ? this.zze.zzI() : -1L, zzcljVar != 0 ? this.zze.zzJ() : -1L, zzcljVar != 0 ? this.zze.zzK() : -1L, zzcis.zzP(), zzcis.zzQ());
                                            zzcljVar = this;
                                            j2 = zzN;
                                            try {
                                                zzcljVar.zzk = j2;
                                                j4 = zzH;
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
                                    j2 = zzN;
                                    j3 = intValue;
                                    str2 = zzt;
                                    zzcljVar = this;
                                    j4 = zzH;
                                }
                                if (j2 >= j4) {
                                    zzcljVar.zzq(zzcljVar.zzf, str2, j4);
                                    zzcljVar2 = zzcljVar;
                                } else {
                                    int i3 = (zzcljVar.zze.zzO() > j3 ? 1 : (zzcljVar.zze.zzO() == j3 ? 0 : -1));
                                    zzcljVar3 = zzcljVar;
                                    if (i3 >= 0) {
                                        zzcljVar3 = zzcljVar;
                                        if (j2 > 0) {
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
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = zzc;
                        str = i2;
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
            } catch (Exception e3) {
                e = e3;
                String str4 = str3;
                String str5 = zzcljVar.zzf;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + String.valueOf(message).length());
                sb2.append("Failed to preload url ");
                sb2.append(str5);
                sb2.append(" Exception: ");
                sb2.append(message);
                zzcgt.zzi(sb2.toString());
                com.google.android.gms.ads.internal.zzt.zzg().zzl(e, "VideoStreamExoPlayerCache.preload");
                release();
                zzcljVar.zzr(zzcljVar.zzf, str, str4, zzx(str4, e));
                zzcljVar2 = zzcljVar;
                com.google.android.gms.ads.internal.zzt.zzy().zzd(zzcljVar2.zzi);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zzl(int i2) {
        this.zze.zzy(i2);
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
        zzcgt.zzj("Precache error", exc);
        com.google.android.gms.ads.internal.zzt.zzg().zzl(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcir
    public final void zzv(String str, Exception exc) {
        zzcgt.zzj("Precache exception", exc);
        com.google.android.gms.ads.internal.zzt.zzg().zzl(exc, "VideoStreamExoPlayerCache.onException");
    }
}
