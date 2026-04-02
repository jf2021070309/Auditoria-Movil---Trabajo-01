package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzhc {
    private final Queue zza;
    private final zzfr zzb;
    private int zzc;
    private final zzhw zzd;

    public zzhc(zzfr zzfrVar) {
        zzhw zzhwVar = new zzhw();
        this.zza = new ConcurrentLinkedQueue();
        this.zzc = 1;
        this.zzd = zzhwVar;
        this.zzb = zzfrVar;
    }

    private final void zze(com.google.ads.interactivemedia.v3.impl.data.zzbg zzbgVar) {
        zzff zzffVar = new zzff(zzfd.adsLoader, zzfe.nativeInstrumentation, "*", zzbgVar);
        int i = this.zzc;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                this.zzb.zzp(zzffVar);
                return;
            } else if (this.zza.size() > 2) {
                this.zzc = 3;
                return;
            } else {
                this.zza.add(zzffVar);
                return;
            }
        }
        throw null;
    }

    public final void zza(AdErrorEvent adErrorEvent) {
        zze(com.google.ads.interactivemedia.v3.impl.data.zzbg.create(System.currentTimeMillis(), adErrorEvent));
    }

    public final void zzb(com.google.ads.interactivemedia.v3.impl.data.zzbe zzbeVar, com.google.ads.interactivemedia.v3.impl.data.zzbf zzbfVar, Exception exc) {
        zze(com.google.ads.interactivemedia.v3.impl.data.zzbg.create(System.currentTimeMillis(), zzbeVar, zzbfVar, exc));
    }

    public final void zzc(final zzvq zzvqVar, zzvr zzvrVar, final com.google.ads.interactivemedia.v3.impl.data.zzbe zzbeVar, final com.google.ads.interactivemedia.v3.impl.data.zzbf zzbfVar) {
        zzvqVar.zzm(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.zzhb
            @Override // java.lang.Runnable
            public final void run() {
                zzhc zzhcVar = zzhc.this;
                zzvq zzvqVar2 = zzvqVar;
                com.google.ads.interactivemedia.v3.impl.data.zzbe zzbeVar2 = zzbeVar;
                com.google.ads.interactivemedia.v3.impl.data.zzbf zzbfVar2 = zzbfVar;
                try {
                    zzvd.zzb(zzvqVar2, Exception.class);
                } catch (Exception e) {
                    String valueOf = String.valueOf(zzbeVar2);
                    String valueOf2 = String.valueOf(zzbfVar2);
                    zzhd.zzb("Exception in " + valueOf + "." + valueOf2, e);
                    zzhcVar.zzb(zzbeVar2, zzbfVar2, e);
                }
            }
        }, zzvrVar);
    }

    public final void zzd(boolean z) {
        if (z) {
            this.zzc = 2;
            zzff zzffVar = (zzff) this.zza.poll();
            while (zzffVar != null) {
                this.zzb.zzp(zzffVar);
                zzffVar = (zzff) this.zza.poll();
            }
            return;
        }
        this.zzc = 3;
        this.zza.clear();
    }
}
