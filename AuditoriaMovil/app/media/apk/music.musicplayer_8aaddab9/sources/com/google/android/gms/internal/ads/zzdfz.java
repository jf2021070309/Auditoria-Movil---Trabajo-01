package com.google.android.gms.internal.ads;

import java.util.Set;
/* loaded from: classes.dex */
public final class zzdfz extends zzdgm<zzamv> implements zzbot {
    public zzdfz(Set<zzdih<zzamv>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbot
    public final synchronized void zzbA(final String str, final String str2) {
        zzk(new zzdgl(str, str2) { // from class: com.google.android.gms.internal.ads.zzdfy
            private final String zza;
            private final String zzb;

            {
                this.zza = str;
                this.zzb = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdgl
            public final void zza(Object obj) {
                ((zzamv) obj).zzbC(this.zza, this.zzb);
            }
        });
    }
}
