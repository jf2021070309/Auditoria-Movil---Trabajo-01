package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzamd {
    private static zzamd zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList<WeakReference<zzalz>> zzc = new CopyOnWriteArrayList<>();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzamd(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzamb(this, null), intentFilter);
    }

    public static synchronized zzamd zza(Context context) {
        zzamd zzamdVar;
        synchronized (zzamd.class) {
            if (zza == null) {
                zza = new zzamd(context);
            }
            zzamdVar = zza;
        }
        return zzamdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzamd zzamdVar, int i) {
        synchronized (zzamdVar.zzd) {
            if (zzamdVar.zze == i) {
                return;
            }
            zzamdVar.zze = i;
            Iterator<WeakReference<zzalz>> it = zzamdVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference<zzalz> next = it.next();
                zzalz zzalzVar = next.get();
                if (zzalzVar != null) {
                    zzalzVar.zza(i);
                } else {
                    zzamdVar.zzc.remove(next);
                }
            }
        }
    }

    public final void zzb(final zzalz zzalzVar) {
        Iterator<WeakReference<zzalz>> it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference<zzalz> next = it.next();
            if (next.get() == null) {
                this.zzc.remove(next);
            }
        }
        this.zzc.add(new WeakReference<>(zzalzVar));
        this.zzb.post(new Runnable(this, zzalzVar) { // from class: com.google.android.gms.internal.ads.zzalx
            private final zzamd zza;
            private final zzalz zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzalzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzb.zza(this.zza.zzc());
            }
        });
    }

    public final int zzc() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }
}
