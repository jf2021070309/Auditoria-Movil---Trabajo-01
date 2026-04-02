package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzawt {
    @VisibleForTesting
    public int zza;
    private final Object zzb = new Object();
    private final List<zzaws> zzc = new LinkedList();

    public final zzaws zza(boolean z) {
        synchronized (this.zzb) {
            zzaws zzawsVar = null;
            if (this.zzc.size() == 0) {
                zzcgt.zzd("Queue empty");
                return null;
            }
            int i2 = 0;
            if (this.zzc.size() < 2) {
                zzaws zzawsVar2 = this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzawsVar2.zze();
                }
                return zzawsVar2;
            }
            int i3 = Level.ALL_INT;
            int i4 = 0;
            for (zzaws zzawsVar3 : this.zzc) {
                int zzm = zzawsVar3.zzm();
                if (zzm > i3) {
                    i2 = i4;
                }
                int i5 = zzm > i3 ? zzm : i3;
                if (zzm > i3) {
                    zzawsVar = zzawsVar3;
                }
                i4++;
                i3 = i5;
            }
            this.zzc.remove(i2);
            return zzawsVar;
        }
    }

    public final boolean zzb(zzaws zzawsVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzawsVar);
        }
    }

    public final boolean zzc(zzaws zzawsVar) {
        synchronized (this.zzb) {
            Iterator<zzaws> it = this.zzc.iterator();
            while (it.hasNext()) {
                zzaws next = it.next();
                if (com.google.android.gms.ads.internal.zzt.zzg().zzp().zzd()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzg().zzp().zzh() && zzawsVar != next && next.zzd().equals(zzawsVar.zzd())) {
                        it.remove();
                        return true;
                    }
                } else if (zzawsVar != next && next.zzb().equals(zzawsVar.zzb())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzd(zzaws zzawsVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int size = this.zzc.size();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                zzcgt.zzd(sb.toString());
                this.zzc.remove(0);
            }
            int i2 = this.zza;
            this.zza = i2 + 1;
            zzawsVar.zzn(i2);
            zzawsVar.zzj();
            this.zzc.add(zzawsVar);
        }
    }
}
