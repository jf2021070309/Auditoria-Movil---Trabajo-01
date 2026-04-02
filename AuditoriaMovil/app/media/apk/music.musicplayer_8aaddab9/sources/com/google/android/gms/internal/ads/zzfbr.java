package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzfbr implements zzdbf {
    @GuardedBy("this")
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
