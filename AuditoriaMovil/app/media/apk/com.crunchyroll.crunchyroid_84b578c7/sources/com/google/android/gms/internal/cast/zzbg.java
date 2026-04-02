package com.google.android.gms.internal.cast;

import android.content.Context;
import com.amazon.aps.iva.f8.f0;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzbg {
    public f0 zza;
    private final Context zzb;

    public zzbg(Context context) {
        this.zzb = context;
    }

    public final f0 zza() {
        if (this.zza == null) {
            this.zza = f0.d(this.zzb);
        }
        return this.zza;
    }

    public final void zzb(f0.a aVar) {
        f0 zza = zza();
        if (zza != null) {
            zza.i(aVar);
        }
    }
}
