package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzjp implements Runnable, zzjl {
    private Context zzc;
    private final zzoy zzd;
    private final Executor zze;
    private final zzm zzf;
    private final boolean zzg;
    private final AtomicReference zzb = new AtomicReference();
    final CountDownLatch zza = new CountDownLatch(1);
    private final List zzh = new ArrayList();

    public zzjp(Context context, Executor executor, zzm zzmVar) {
        boolean z = true;
        this.zzf = zzmVar;
        this.zzc = context;
        this.zze = executor;
        zznr.zza(context);
        z = (((Boolean) zznc.zzc().zzb(zznr.zzca)).booleanValue() && zzmVar.zzh()) ? z : false;
        this.zzg = z;
        this.zzd = zzoy.zza(context, executor, z);
        executor.execute(this);
    }

    private final void zzd() {
        if (!this.zzh.isEmpty() && this.zzb.get() != null) {
            for (Object[] objArr : this.zzh) {
                int length = objArr.length;
                if (length == 1) {
                    ((zzjl) this.zzb.get()).zzk((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    ((zzjl) this.zzb.get()).zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            this.zzh.clear();
        }
    }

    private final boolean zzi() {
        AtomicReference atomicReference = this.zzb;
        String zzc = this.zzf.zzc();
        Context zzj = zzj(this.zzc);
        boolean zzg = this.zzf.zzg();
        zzjq.zzr(zzj, zzg);
        atomicReference.set(new zzjr(zzj, zzc, zzg));
        return true;
    }

    private static final Context zzj(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[Catch: all -> 0x009a, NullPointerException -> 0x009c, TryCatch #0 {NullPointerException -> 0x009c, blocks: (B:3:0x0005, B:12:0x0048, B:14:0x004c, B:16:0x0057, B:17:0x0062, B:19:0x0087, B:21:0x008f, B:6:0x0013, B:8:0x003e), top: B:35:0x0005, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[Catch: all -> 0x009a, NullPointerException -> 0x009c, TryCatch #0 {NullPointerException -> 0x009c, blocks: (B:3:0x0005, B:12:0x0048, B:14:0x004c, B:16:0x0057, B:17:0x0062, B:19:0x0087, B:21:0x008f, B:6:0x0013, B:8:0x003e), top: B:35:0x0005, outer: #1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            int r3 = r3.zzk()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            int r3 = r3 + (-1)
            r4 = 3
            r5 = 2
            if (r3 == r5) goto L13
        L11:
            r3 = r5
            goto L48
        L13:
            android.content.Context r3 = r11.zzc     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            com.google.ads.interactivemedia.v3.internal.zzoy r6 = r11.zzd     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            com.google.ads.interactivemedia.v3.internal.zzjo r7 = new com.google.ads.interactivemedia.v3.internal.zzjo     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            com.google.ads.interactivemedia.v3.internal.zzqi r8 = new com.google.ads.interactivemedia.v3.internal.zzqi     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            android.content.Context r9 = r11.zzc     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            int r3 = com.google.ads.interactivemedia.v3.internal.zzpq.zzb(r3, r6)     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            com.google.ads.interactivemedia.v3.internal.zznj r6 = com.google.ads.interactivemedia.v3.internal.zznr.zzbX     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            com.google.ads.interactivemedia.v3.internal.zznp r10 = com.google.ads.interactivemedia.v3.internal.zznc.zzc()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            java.lang.Object r6 = r10.zzb(r6)     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            r8.<init>(r9, r3, r7, r6)     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            r3 = 1
            boolean r3 = r8.zzd(r3)     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            if (r3 != 0) goto L47
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            boolean r3 = r3.zzi()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            if (r3 == 0) goto L47
            goto L11
        L47:
            r3 = r4
        L48:
            int r3 = r3 + (-1)
            if (r3 == r5) goto L62
            r11.zzi()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            int r3 = r3.zzk()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            if (r3 != r4) goto L92
            java.util.concurrent.Executor r3 = r11.zze     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            com.google.ads.interactivemedia.v3.internal.zzjn r4 = new com.google.ads.interactivemedia.v3.internal.zzjn     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            r4.<init>()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            r3.execute(r4)     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            goto L92
        L62:
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            java.lang.String r3 = r3.zzc()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            android.content.Context r4 = r11.zzc     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            android.content.Context r4 = zzj(r4)     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            java.util.concurrent.Executor r5 = r11.zze     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            com.google.ads.interactivemedia.v3.internal.zzm r6 = r11.zzf     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            boolean r6 = r6.zzg()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            boolean r7 = r11.zzg     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            com.google.ads.interactivemedia.v3.internal.zzji r3 = com.google.ads.interactivemedia.v3.internal.zzji.zzb(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            java.util.concurrent.atomic.AtomicReference r4 = r11.zzb     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            r4.set(r3)     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            boolean r3 = r3.zzr()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            if (r3 != 0) goto L92
            com.google.ads.interactivemedia.v3.internal.zzm r3 = r11.zzf     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            boolean r3 = r3.zzi()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
            if (r3 == 0) goto L92
            r11.zzi()     // Catch: java.lang.Throwable -> L9a java.lang.NullPointerException -> L9c
        L92:
            r11.zzc = r2
            java.util.concurrent.CountDownLatch r0 = r11.zza
        L96:
            r0.countDown()
            return
        L9a:
            r0 = move-exception
            goto Lb9
        L9c:
            r3 = move-exception
            com.google.ads.interactivemedia.v3.internal.zzm r4 = r11.zzf     // Catch: java.lang.Throwable -> L9a
            boolean r4 = r4.zzi()     // Catch: java.lang.Throwable -> L9a
            if (r4 == 0) goto La8
            r11.zzi()     // Catch: java.lang.Throwable -> L9a
        La8:
            com.google.ads.interactivemedia.v3.internal.zzoy r4 = r11.zzd     // Catch: java.lang.Throwable -> L9a
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L9a
            long r5 = r5 - r0
            r0 = 2031(0x7ef, float:2.846E-42)
            r4.zzc(r0, r5, r3)     // Catch: java.lang.Throwable -> L9a
            r11.zzc = r2
            java.util.concurrent.CountDownLatch r0 = r11.zza
            goto L96
        Lb9:
            r11.zzc = r2
            java.util.concurrent.CountDownLatch r1 = r11.zza
            r1.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzjp.run():void");
    }

    public final zzjl zza() {
        return (zzjl) this.zzb.get();
    }

    public final /* synthetic */ void zzc() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzji.zza(this.zzf.zzc(), zzj(this.zzc), this.zzf.zzg(), this.zzg).zzo();
        } catch (NullPointerException e) {
            this.zzd.zzc(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    @Deprecated
    public final String zze(Context context, String str, View view, Activity activity) {
        if (zzs()) {
            zzd();
            return ((zzjl) this.zzb.get()).zze(zzj(context), str, view, activity);
        }
        return "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzf(Context context) {
        return zzg(context, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzg(Context context, byte[] bArr) {
        if (zzs()) {
            zzd();
            return ((zzjl) this.zzb.get()).zzf(zzj(context));
        }
        return "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final String zzh(Context context, View view, Activity activity) {
        if (zzs()) {
            return ((zzjl) this.zzb.get()).zzh(context, view, activity);
        }
        return "";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzk(MotionEvent motionEvent) {
        if (this.zzb.get() != null) {
            zzd();
            ((zzjl) this.zzb.get()).zzk(motionEvent);
            return;
        }
        this.zzh.add(new Object[]{motionEvent});
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzl(int i, int i2, int i3) {
        if (this.zzb.get() != null) {
            zzd();
            ((zzjl) this.zzb.get()).zzl(i, i2, i3);
            return;
        }
        this.zzh.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final void zzn(View view) {
        if (this.zzb.get() != null) {
            ((zzjl) this.zzb.get()).zzn(view);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzq() {
        if (this.zza.getCount() == 0 && this.zzb.get() != null && ((zzjl) this.zzb.get()).zzq()) {
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzjl
    public final boolean zzs() {
        try {
            this.zza.await();
            if (this.zzb.get() == null) {
                return false;
            }
            if (!((zzjl) this.zzb.get()).zzs()) {
                return false;
            }
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }
}
