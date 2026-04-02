package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzji implements zzjl {
    private static zzji zzb;
    private final Context zzc;
    private final zzqb zzd;
    private final zzqi zze;
    private final zzqk zzf;
    private final zzkn zzg;
    private final zzoy zzh;
    private final Executor zzi;
    private final zzqh zzj;
    private final zzlc zzl;
    private final zzku zzm;
    private final zzkl zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    public zzji(Context context, zzoy zzoyVar, zzqb zzqbVar, zzqi zzqiVar, zzqk zzqkVar, zzkn zzknVar, Executor executor, zzot zzotVar, int i, zzlc zzlcVar, zzku zzkuVar, zzkl zzklVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzoyVar;
        this.zzd = zzqbVar;
        this.zze = zzqiVar;
        this.zzf = zzqkVar;
        this.zzg = zzknVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzlcVar;
        this.zzm = zzkuVar;
        this.zzn = zzklVar;
        this.zzq = false;
        this.zzj = new zzjg(this, zzotVar);
    }

    public static synchronized zzji zza(String str, Context context, boolean z, boolean z2) {
        zzji zzb2;
        synchronized (zzji.class) {
            zzb2 = zzb(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return zzb2;
    }

    @Deprecated
    public static synchronized zzji zzb(String str, Context context, Executor executor, boolean z, boolean z2) {
        zzji zzjiVar;
        zzjw zzjwVar;
        zzlc zzlcVar;
        zzku zzkuVar;
        zzkl zzklVar;
        synchronized (zzji.class) {
            if (zzb == null) {
                zzoz zza = zzpa.zza();
                zza.zza(str);
                zza.zzc(z);
                zzpa zzd = zza.zzd();
                zzoy zza2 = zzoy.zza(context, executor, z2);
                if (((Boolean) zznc.zzc().zzb(zznr.zzcW)).booleanValue()) {
                    zzjwVar = zzjw.zzc(context);
                } else {
                    zzjwVar = null;
                }
                if (((Boolean) zznc.zzc().zzb(zznr.zzcX)).booleanValue()) {
                    zzlcVar = zzlc.zzd(context, executor);
                } else {
                    zzlcVar = null;
                }
                if (((Boolean) zznc.zzc().zzb(zznr.zzco)).booleanValue()) {
                    zzkuVar = new zzku();
                } else {
                    zzkuVar = null;
                }
                if (((Boolean) zznc.zzc().zzb(zznr.zzcq)).booleanValue()) {
                    zzklVar = new zzkl();
                } else {
                    zzklVar = null;
                }
                zzpp zze = zzpp.zze(context, executor, zza2, zzd);
                zzkm zzkmVar = new zzkm(context);
                zzkn zzknVar = new zzkn(zzd, zze, new zzla(context, zzkmVar), zzkmVar, zzjwVar, zzlcVar, zzkuVar, zzklVar);
                int zzb2 = zzpq.zzb(context, zza2);
                zzot zzotVar = new zzot();
                zzji zzjiVar2 = new zzji(context, zza2, new zzqb(context, zzb2), new zzqi(context, zzb2, new zzjf(zza2), ((Boolean) zznc.zzc().zzb(zznr.zzbX)).booleanValue()), new zzqk(context, zzknVar, zza2, zzotVar), zzknVar, executor, zzotVar, zzb2, zzlcVar, zzkuVar, zzklVar);
                zzb = zzjiVar2;
                zzjiVar2.zzm();
                zzb.zzo();
            }
            zzjiVar = zzb;
        }
        return zzjiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r4.zzc().zzi().equals(r5.zzi()) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void zzj(com.google.ads.interactivemedia.v3.internal.zzji r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzji.zzj(com.google.ads.interactivemedia.v3.internal.zzji):void");
    }

    private final void zzt() {
        zzlc zzlcVar = this.zzl;
        if (zzlcVar != null) {
            zzlcVar.zzh();
        }
    }

    private final zzqa zzu(int i) {
        if (!zzpq.zza(this.zzr)) {
            return null;
        }
        if (((Boolean) zznc.zzc().zzb(zznr.zzbV)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zze(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) zznc.zzc().zzb(zznr.zzco)).booleanValue()) {
            this.zzm.zzi();
        }
        zzo();
        zzpb zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza2 = zza.zza(context, null, str, view, activity);
            this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza2, null);
            return zza2;
        }
        return "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) zznc.zzc().zzb(zznr.zzco)).booleanValue()) {
            this.zzm.zzj();
        }
        zzo();
        zzpb zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zza.zzc(context, null);
            this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzg(Context context, byte[] bArr) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzh(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) zznc.zzc().zzb(zznr.zzco)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzo();
        zzpb zza = this.zzf.zza();
        if (zza != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb2 = zza.zzb(context, null, view, activity);
            this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, null);
            return zzb2;
        }
        return "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzk(MotionEvent motionEvent) {
        zzpb zza = this.zzf.zza();
        if (zza != null) {
            try {
                zza.zzd(null, motionEvent);
            } catch (zzqj e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzl(int i, int i2, int i3) {
    }

    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzqa zzu = zzu(1);
        if (zzu != null) {
            if (this.zzf.zzc(zzu)) {
                this.zzq = true;
                this.zzk.countDown();
                return;
            }
            return;
        }
        this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzn(View view) {
        this.zzg.zzd(view);
    }

    public final void zzo() {
        if (!this.zzp) {
            synchronized (this.zzo) {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzqa zzb2 = this.zzf.zzb();
                    if ((zzb2 == null || zzb2.zzd(3600L)) && zzpq.zza(this.zzr)) {
                        this.zzi.execute(new zzjh(this));
                    }
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzq() {
        return zzr();
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzs() {
        try {
            this.zzk.await();
        } catch (InterruptedException unused) {
        }
        return zzr();
    }
}
