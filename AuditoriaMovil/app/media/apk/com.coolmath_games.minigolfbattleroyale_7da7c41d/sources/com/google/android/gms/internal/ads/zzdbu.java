package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdbu extends zzdgm<zzdbw> {
    private boolean zzb;

    public zzdbu(Set<zzdih<zzdbw>> set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzk(zzdbt.zza);
        this.zzb = true;
    }
}
