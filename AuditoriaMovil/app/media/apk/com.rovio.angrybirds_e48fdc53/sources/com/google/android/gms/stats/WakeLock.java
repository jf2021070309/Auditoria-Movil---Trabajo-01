package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.providers.PooledExecutorsProvider;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class WakeLock {
    private static ScheduledExecutorService zzn;
    private static volatile zza zzo = new com.google.android.gms.stats.zza();
    private final Object zza;
    private final PowerManager.WakeLock zzb;
    private WorkSource zzc;
    private final int zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final Context zzh;
    private boolean zzi;
    private final Map<String, Integer[]> zzj;
    private final Set<Future<?>> zzk;
    private int zzl;
    private AtomicInteger zzm;

    /* loaded from: classes2.dex */
    public interface zza {
    }

    public WakeLock(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    private WakeLock(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    private WakeLock(Context context, int i, String str, String str2, String str3, String str4) {
        this.zza = this;
        this.zzi = true;
        this.zzj = new HashMap();
        this.zzk = Collections.synchronizedSet(new HashSet());
        this.zzm = new AtomicInteger(0);
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.zzd = i;
        this.zzf = null;
        this.zzg = null;
        this.zzh = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf("*gcore*:");
            String valueOf2 = String.valueOf(str);
            this.zze = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            this.zze = str;
        }
        this.zzb = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (WorkSourceUtil.hasWorkSourcePermission(context)) {
            this.zzc = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(str3) ? context.getPackageName() : str3);
            WorkSource workSource = this.zzc;
            if (workSource != null && WorkSourceUtil.hasWorkSourcePermission(this.zzh)) {
                if (this.zzc != null) {
                    this.zzc.add(workSource);
                } else {
                    this.zzc = workSource;
                }
                try {
                    this.zzb.setWorkSource(this.zzc);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (zzn == null) {
            zzn = PooledExecutorsProvider.getInstance().newSingleThreadScheduledExecutor();
        }
    }

    private final List<String> zza() {
        return WorkSourceUtil.getNames(this.zzc);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r13.zzl == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r13.zzh, com.google.android.gms.common.stats.StatsUtils.getEventKey(r13.zzb, r6), 7, r13.zze, r6, null, r13.zzd, zza(), r14);
        r13.zzl++;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void acquire(long r14) {
        /*
            r13 = this;
            r3 = 0
            r1 = 1
            r2 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = r13.zzm
            r0.incrementAndGet()
            java.lang.String r6 = r13.zza(r3)
            java.lang.Object r12 = r13.zza
            monitor-enter(r12)
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r13.zzj     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L1b
            int r0 = r13.zzl     // Catch: java.lang.Throwable -> L9f
            if (r0 <= 0) goto L2b
        L1b:
            android.os.PowerManager$WakeLock r0 = r13.zzb     // Catch: java.lang.Throwable -> L9f
            boolean r0 = r0.isHeld()     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L2b
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r13.zzj     // Catch: java.lang.Throwable -> L9f
            r0.clear()     // Catch: java.lang.Throwable -> L9f
            r0 = 0
            r13.zzl = r0     // Catch: java.lang.Throwable -> L9f
        L2b:
            boolean r0 = r13.zzi     // Catch: java.lang.Throwable -> L9f
            if (r0 == 0) goto L4c
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r13.zzj     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L9f
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L8d
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r13.zzj     // Catch: java.lang.Throwable -> L9f
            r2 = 1
            java.lang.Integer[] r2 = new java.lang.Integer[r2]     // Catch: java.lang.Throwable -> L9f
            r3 = 0
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L9f
            r2[r3] = r4     // Catch: java.lang.Throwable -> L9f
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L9f
            r0 = r1
        L4a:
            if (r0 != 0) goto L54
        L4c:
            boolean r0 = r13.zzi     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L74
            int r0 = r13.zzl     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto L74
        L54:
            com.google.android.gms.common.stats.WakeLockTracker r1 = com.google.android.gms.common.stats.WakeLockTracker.getInstance()     // Catch: java.lang.Throwable -> L9f
            android.content.Context r2 = r13.zzh     // Catch: java.lang.Throwable -> L9f
            android.os.PowerManager$WakeLock r0 = r13.zzb     // Catch: java.lang.Throwable -> L9f
            java.lang.String r3 = com.google.android.gms.common.stats.StatsUtils.getEventKey(r0, r6)     // Catch: java.lang.Throwable -> L9f
            r4 = 7
            java.lang.String r5 = r13.zze     // Catch: java.lang.Throwable -> L9f
            r7 = 0
            int r8 = r13.zzd     // Catch: java.lang.Throwable -> L9f
            java.util.List r9 = r13.zza()     // Catch: java.lang.Throwable -> L9f
            r10 = r14
            r1.registerEvent(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9f
            int r0 = r13.zzl     // Catch: java.lang.Throwable -> L9f
            int r0 = r0 + 1
            r13.zzl = r0     // Catch: java.lang.Throwable -> L9f
        L74:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L9f
            android.os.PowerManager$WakeLock r0 = r13.zzb
            r0.acquire()
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8c
            java.util.concurrent.ScheduledExecutorService r0 = com.google.android.gms.stats.WakeLock.zzn
            com.google.android.gms.stats.zzb r1 = new com.google.android.gms.stats.zzb
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L8c:
            return
        L8d:
            r1 = 0
            r3 = 0
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L9f
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L9f
            int r3 = r3 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L9f
            r0[r1] = r3     // Catch: java.lang.Throwable -> L9f
            r0 = r2
            goto L4a
        L9f:
            r0 = move-exception
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L9f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.acquire(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r11.zzl == 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        com.google.android.gms.common.stats.WakeLockTracker.getInstance().registerEvent(r11.zzh, com.google.android.gms.common.stats.StatsUtils.getEventKey(r11.zzb, r5), 8, r11.zze, r5, null, r11.zzd, zza());
        r11.zzl--;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void release() {
        /*
            r11 = this;
            r4 = 0
            r1 = 1
            r9 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = r11.zzm
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L1c
            java.lang.String r0 = "WakeLock"
            java.lang.String r2 = r11.zze
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = " release without a matched acquire!"
            java.lang.String r2 = r2.concat(r3)
            android.util.Log.e(r0, r2)
        L1c:
            java.lang.String r5 = r11.zza(r4)
            java.lang.Object r10 = r11.zza
            monitor-enter(r10)
            boolean r0 = r11.zzi     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L34
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r11.zzj     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L83
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L61
            r0 = r9
        L32:
            if (r0 != 0) goto L3c
        L34:
            boolean r0 = r11.zzi     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L5c
            int r0 = r11.zzl     // Catch: java.lang.Throwable -> L83
            if (r0 != r1) goto L5c
        L3c:
            com.google.android.gms.common.stats.WakeLockTracker r0 = com.google.android.gms.common.stats.WakeLockTracker.getInstance()     // Catch: java.lang.Throwable -> L83
            android.content.Context r1 = r11.zzh     // Catch: java.lang.Throwable -> L83
            android.os.PowerManager$WakeLock r2 = r11.zzb     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = com.google.android.gms.common.stats.StatsUtils.getEventKey(r2, r5)     // Catch: java.lang.Throwable -> L83
            r3 = 8
            java.lang.String r4 = r11.zze     // Catch: java.lang.Throwable -> L83
            r6 = 0
            int r7 = r11.zzd     // Catch: java.lang.Throwable -> L83
            java.util.List r8 = r11.zza()     // Catch: java.lang.Throwable -> L83
            r0.registerEvent(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L83
            int r0 = r11.zzl     // Catch: java.lang.Throwable -> L83
            int r0 = r0 + (-1)
            r11.zzl = r0     // Catch: java.lang.Throwable -> L83
        L5c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L83
            r11.zza(r9)
            return
        L61:
            r2 = 0
            r2 = r0[r2]     // Catch: java.lang.Throwable -> L83
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L83
            if (r2 != r1) goto L71
            java.util.Map<java.lang.String, java.lang.Integer[]> r0 = r11.zzj     // Catch: java.lang.Throwable -> L83
            r0.remove(r5)     // Catch: java.lang.Throwable -> L83
            r0 = r1
            goto L32
        L71:
            r2 = 0
            r3 = 0
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L83
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L83
            int r3 = r3 + (-1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L83
            r0[r2] = r3     // Catch: java.lang.Throwable -> L83
            r0 = r9
            goto L32
        L83:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L83
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.WakeLock.release():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i) {
        if (this.zzb.isHeld()) {
            try {
                this.zzb.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.zze).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            this.zzb.isHeld();
        }
    }

    private final String zza(String str) {
        return (!this.zzi || TextUtils.isEmpty(str)) ? this.zzf : str;
    }

    public void setReferenceCounted(boolean z) {
        this.zzb.setReferenceCounted(z);
        this.zzi = z;
    }

    public boolean isHeld() {
        return this.zzb.isHeld();
    }
}
