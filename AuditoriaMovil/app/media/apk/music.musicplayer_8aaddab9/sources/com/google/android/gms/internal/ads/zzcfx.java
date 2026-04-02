package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
/* loaded from: classes.dex */
public final class zzcfx {
    public final /* synthetic */ zzcfy zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzcfx(zzcfy zzcfyVar) {
        this.zza = zzcfyVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        Clock clock;
        clock = this.zza.zza;
        this.zzc = clock.elapsedRealtime();
    }

    public final void zzc() {
        Clock clock;
        clock = this.zza.zza;
        this.zzb = clock.elapsedRealtime();
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }
}
