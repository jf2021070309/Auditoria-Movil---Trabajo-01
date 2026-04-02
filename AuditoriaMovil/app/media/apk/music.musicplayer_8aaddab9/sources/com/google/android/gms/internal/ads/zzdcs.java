package com.google.android.gms.internal.ads;

import java.util.Set;
/* loaded from: classes.dex */
public final class zzdcs extends zzdgm<zzdcu> implements zzdcu {
    public zzdcs(Set<zzdih<zzdcu>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zza(final zzcxg zzcxgVar) {
        zzk(new zzdgl(zzcxgVar) { // from class: com.google.android.gms.internal.ads.zzdcr
            private final zzcxg zza;

            {
                this.zza = zzcxgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgl
            public final void zza(Object obj) {
                ((zzdcu) obj).zza(this.zza);
            }
        });
    }
}
