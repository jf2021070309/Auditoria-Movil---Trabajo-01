package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcmx {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.zzcml, java.lang.Object] */
    public static final zzcml zza(final Context context, final zzcob zzcobVar, final String str, final boolean z, final boolean z2, final zzaas zzaasVar, final zzbkk zzbkkVar, final zzcgz zzcgzVar, zzbka zzbkaVar, final com.google.android.gms.ads.internal.zzl zzlVar, final com.google.android.gms.ads.internal.zza zzaVar, final zzazb zzazbVar, final zzezz zzezzVar, final zzfac zzfacVar) throws zzcmw {
        zzbjl.zza(context);
        try {
            zzfmj zzfmjVar = new zzfmj(context, zzcobVar, str, z, z2, zzaasVar, zzbkkVar, zzcgzVar, null, zzlVar, zzaVar, zzazbVar, zzezzVar, zzfacVar) { // from class: com.google.android.gms.internal.ads.zzcmu
                private final Context zza;
                private final zzcob zzb;
                private final String zzc;
                private final boolean zzd;
                private final boolean zze;
                private final zzaas zzf;
                private final zzbkk zzg;
                private final zzcgz zzh;
                private final com.google.android.gms.ads.internal.zzl zzi;
                private final com.google.android.gms.ads.internal.zza zzj;
                private final zzazb zzk;
                private final zzezz zzl;
                private final zzfac zzm;

                {
                    this.zza = context;
                    this.zzb = zzcobVar;
                    this.zzc = str;
                    this.zzd = z;
                    this.zze = z2;
                    this.zzf = zzaasVar;
                    this.zzg = zzbkkVar;
                    this.zzh = zzcgzVar;
                    this.zzi = zzlVar;
                    this.zzj = zzaVar;
                    this.zzk = zzazbVar;
                    this.zzl = zzezzVar;
                    this.zzm = zzfacVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfmj
                public final Object zza() {
                    Context context2 = this.zza;
                    zzcob zzcobVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    boolean z4 = this.zze;
                    zzaas zzaasVar2 = this.zzf;
                    zzbkk zzbkkVar2 = this.zzg;
                    zzcgz zzcgzVar2 = this.zzh;
                    com.google.android.gms.ads.internal.zzl zzlVar2 = this.zzi;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzazb zzazbVar2 = this.zzk;
                    zzezz zzezzVar2 = this.zzl;
                    zzfac zzfacVar2 = this.zzm;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i2 = zzcne.zza;
                        zzcna zzcnaVar = new zzcna(new zzcne(new zzcoa(context2), zzcobVar2, str2, z3, z4, zzaasVar2, zzbkkVar2, zzcgzVar2, null, zzlVar2, zzaVar2, zzazbVar2, zzezzVar2, zzfacVar2));
                        zzcnaVar.setWebViewClient(com.google.android.gms.ads.internal.zzt.zze().zzl(zzcnaVar, zzazbVar2, z4));
                        zzcnaVar.setWebChromeClient(new zzcmk(zzcnaVar));
                        return zzcnaVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ?? zza = zzfmjVar.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new zzcmw("Webview initialization failed.", th);
        }
    }

    public static final zzfsm<zzcml> zzb(final Context context, final zzcgz zzcgzVar, final String str, final zzaas zzaasVar, final com.google.android.gms.ads.internal.zza zzaVar) {
        return zzfsd.zze(new zzfrj(context, zzaasVar, zzcgzVar, zzaVar, str) { // from class: com.google.android.gms.internal.ads.zzcmt
            private final Context zza;
            private final zzaas zzb;
            private final zzcgz zzc;
            private final com.google.android.gms.ads.internal.zza zzd;
            private final String zze;

            {
                this.zza = context;
                this.zzb = zzaasVar;
                this.zzc = zzcgzVar;
                this.zzd = zzaVar;
                this.zze = str;
            }

            @Override // com.google.android.gms.internal.ads.zzfrj
            public final zzfsm zza() {
                Context context2 = this.zza;
                zzaas zzaasVar2 = this.zzb;
                zzcgz zzcgzVar2 = this.zzc;
                com.google.android.gms.ads.internal.zza zzaVar2 = this.zzd;
                String str2 = this.zze;
                com.google.android.gms.ads.internal.zzt.zzd();
                zzcml zza = zzcmx.zza(context2, zzcob.zzb(), "", false, false, zzaasVar2, null, zzcgzVar2, null, null, zzaVar2, zzazb.zza(), null, null);
                final zzchk zza2 = zzchk.zza(zza);
                zza.zzR().zzy(new zzcnx(zza2) { // from class: com.google.android.gms.internal.ads.zzcmv
                    private final zzchk zza;

                    {
                        this.zza = zza2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzcnx
                    public final void zza(boolean z) {
                        this.zza.zzb();
                    }
                });
                return zza2;
            }
        }, zzchg.zze);
    }
}
