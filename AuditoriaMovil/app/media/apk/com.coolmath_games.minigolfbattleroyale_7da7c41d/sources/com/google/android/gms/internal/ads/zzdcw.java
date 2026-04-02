package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdcw extends zzdgm<zzfid> implements zzbor {
    private final Bundle zzb;

    public zzdcw(Set<zzdih<zzfid>> set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbor
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzk(zzdcv.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
