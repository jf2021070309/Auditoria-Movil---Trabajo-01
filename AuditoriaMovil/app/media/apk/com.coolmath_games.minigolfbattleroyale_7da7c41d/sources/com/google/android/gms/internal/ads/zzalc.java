package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzalc {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzalc zza(int i) {
        zzakt.zzd(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzale zzb() {
        zzakt.zzd(!this.zzb);
        this.zzb = true;
        return new zzale(this.zza, null);
    }
}
