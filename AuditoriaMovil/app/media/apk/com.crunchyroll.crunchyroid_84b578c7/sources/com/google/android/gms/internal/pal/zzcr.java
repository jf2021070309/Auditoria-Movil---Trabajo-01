package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzcr implements zzcq {
    protected static volatile zzdu zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;
    private double zzr;
    private double zzs;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzt = false;
    protected boolean zzp = false;

    public zzcr(Context context) {
        try {
            if (((Boolean) zzfv.zzc().zzb(zzgk.zzcw)).booleanValue()) {
                zzbn.zzd();
            } else {
                zzdv.zza(zza);
            }
            this.zzq = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(13:5|6|7|(4:9|(1:11)(1:84)|12|(1:14)(1:83))(1:85)|15|16|(4:18|19|20|21)(2:(1:78)(1:80)|79)|(1:73)(4:24|25|26|27)|28|(3:46|47|(1:49)(4:50|(3:(1:54)(1:(1:58)(1:59))|55|56)|31|32))|30|31|32)|90|7|(0)(0)|15|16|(0)(0)|(0)|73|28|(0)|30|31|32|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        r4 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[Catch: Exception -> 0x0071, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0071, blocks: (B:24:0x0062, B:37:0x0088, B:32:0x0076, B:33:0x007d), top: B:91:0x0060 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzl(android.content.Context r22, java.lang.String r23, int r24, android.view.View r25, android.app.Activity r26, byte[] r27) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.pal.zzcr.zzl(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final String zza(Context context, String str, View view, Activity activity) {
        return zzl(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final String zzb(Context context) {
        if (!zzdx.zzf()) {
            return zzl(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final String zzc(Context context, byte[] bArr) {
        if (!zzdx.zzf()) {
            return zzl(context, null, 1, null, null, bArr);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final String zzd(Context context, View view, Activity activity) {
        return zzl(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.pal.zzcq
    public final synchronized void zze(MotionEvent motionEvent) {
        Long l;
        if (this.zzt) {
            this.zzh = 0L;
            this.zzd = 0L;
            this.zze = 0L;
            this.zzf = 0L;
            this.zzg = 0L;
            this.zzi = 0L;
            this.zzj = 0L;
            if (this.zzc.size() > 0) {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    ((MotionEvent) it.next()).recycle();
                }
                this.zzc.clear();
            } else {
                MotionEvent motionEvent2 = this.zzb;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
            }
            this.zzb = null;
            this.zzt = false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.zzr;
                double d2 = rawY - this.zzs;
                this.zzk += Math.sqrt((d2 * d2) + (d * d));
                this.zzr = rawX;
                this.zzs = rawY;
            }
        } else {
            this.zzk = 0.0d;
            this.zzr = motionEvent.getRawX();
            this.zzs = motionEvent.getRawY();
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 != 1) {
                    if (action2 != 2) {
                        if (action2 == 3) {
                            this.zzg++;
                        }
                    } else {
                        this.zze += motionEvent.getHistorySize() + 1;
                        zzdw zzk = zzk(motionEvent);
                        Long l2 = zzk.zzd;
                        if (l2 != null && zzk.zzg != null) {
                            this.zzi = l2.longValue() + zzk.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l = zzk.zze) != null && zzk.zzh != null) {
                            this.zzj = l.longValue() + zzk.zzh.longValue() + this.zzj;
                        }
                    }
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zzg(new Throwable().getStackTrace());
                }
            } catch (zzdm unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    public abstract long zzg(StackTraceElement[] stackTraceElementArr) throws zzdm;

    public abstract zzr zzh(Context context, View view, Activity activity);

    public abstract zzr zzi(Context context, zzi zziVar);

    public abstract zzr zzj(Context context, View view, Activity activity);

    public abstract zzdw zzk(MotionEvent motionEvent) throws zzdm;

    @Override // com.google.android.gms.internal.pal.zzcq
    public void zzf(View view) {
    }
}
