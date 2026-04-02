package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Future;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzui extends zzuo {
    private static final Logger zza = Logger.getLogger(zzui.class.getName());
    private zzsk zzc;

    public zzui(zzsk zzskVar, boolean z, boolean z2) {
        super(zzskVar.size());
        this.zzc = zzskVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final String zza() {
        zzsk zzskVar = this.zzc;
        if (zzskVar != null) {
            return "futures=".concat(zzskVar.toString());
        }
        return super.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzub
    public final void zzb() {
        zzsk zzskVar = this.zzc;
        boolean z = true;
        zzr(1);
        boolean isCancelled = isCancelled();
        if (zzskVar == null) {
            z = false;
        }
        if (z & isCancelled) {
            boolean zzo = zzo();
            zztx listIterator = ((zzso) zzskVar).listIterator(0);
            while (listIterator.hasNext()) {
                ((Future) listIterator.next()).cancel(zzo);
            }
        }
    }

    public abstract void zzp();

    public final void zzq() {
        zzsk zzskVar = this.zzc;
        zzskVar.getClass();
        if (zzskVar.isEmpty()) {
            zzp();
            return;
        }
        Runnable runnable = new Runnable(null) { // from class: com.google.ads.interactivemedia.v3.internal.zzuh
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                zzui zzuiVar = zzui.this;
                int zzt = zzuiVar.zzt();
                if (zzt >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                zzrm.zzh(z, "Less than 0 remaining futures");
                if (zzt == 0) {
                    zzuiVar.zzv();
                    zzuiVar.zzp();
                    zzuiVar.zzr(2);
                }
            }
        };
        zztx listIterator = ((zzso) this.zzc).listIterator(0);
        while (listIterator.hasNext()) {
            ((zzvq) listIterator.next()).zzm(runnable, zzus.INSTANCE);
        }
    }

    public void zzr(int i) {
        this.zzc = null;
    }
}
