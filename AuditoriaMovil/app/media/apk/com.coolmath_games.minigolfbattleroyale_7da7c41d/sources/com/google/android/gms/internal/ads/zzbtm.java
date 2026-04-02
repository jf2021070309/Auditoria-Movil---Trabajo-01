package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbtm extends zzchs<zzbtt> {
    private final Object zza = new Object();
    private final zzbtr zzb;
    private boolean zzc;

    public zzbtm(zzbtr zzbtrVar) {
        this.zzb = zzbtrVar;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zzf(new zzbtj(this), new zzcho());
            zzf(new zzbtk(this), new zzbtl(this));
        }
    }
}
