package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfbr implements zzdbf {
    private final HashSet<zzcfy> zza = new HashSet<>();
    private final Context zzb;
    private final zzcgi zzc;

    public zzfbr(Context context, zzcgi zzcgiVar) {
        this.zzb = context;
        this.zzc = zzcgiVar;
    }

    public final synchronized void zzb(HashSet<zzcfy> hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final synchronized void zzbD(zzbcz zzbczVar) {
        if (zzbczVar.zza != 3) {
            this.zzc.zzc(this.zza);
        }
    }

    public final Bundle zzc() {
        return this.zzc.zzk(this.zzb, this);
    }
}
