package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class zzkg {
    private final CopyOnWriteArrayList<zzkf> zza = new CopyOnWriteArrayList<>();

    public final void zza(Handler handler, zzkh zzkhVar) {
        zzb(zzkhVar);
        this.zza.add(new zzkf(handler, zzkhVar));
    }

    public final void zzb(zzkh zzkhVar) {
        zzkh zzkhVar2;
        Iterator<zzkf> it = this.zza.iterator();
        while (it.hasNext()) {
            zzkf next = it.next();
            zzkhVar2 = next.zzb;
            if (zzkhVar2 == zzkhVar) {
                next.zzd();
                this.zza.remove(next);
            }
        }
    }

    public final void zzc(final int i2, final long j2, final long j3) {
        boolean z;
        Handler handler;
        Iterator<zzkf> it = this.zza.iterator();
        while (it.hasNext()) {
            final zzkf next = it.next();
            z = next.zzc;
            if (!z) {
                handler = next.zza;
                handler.post(new Runnable(next, i2, j2, j3) { // from class: com.google.android.gms.internal.ads.zzke
                    private final zzkf zza;
                    private final int zzb;
                    private final long zzc;
                    private final long zzd;

                    {
                        this.zza = next;
                        this.zzb = i2;
                        this.zzc = j2;
                        this.zzd = j3;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzkh zzkhVar;
                        zzkf zzkfVar = this.zza;
                        int i3 = this.zzb;
                        long j4 = this.zzc;
                        long j5 = this.zzd;
                        zzkhVar = zzkfVar.zzb;
                        zzkhVar.zzW(i3, j4, j5);
                    }
                });
            }
        }
    }
}
