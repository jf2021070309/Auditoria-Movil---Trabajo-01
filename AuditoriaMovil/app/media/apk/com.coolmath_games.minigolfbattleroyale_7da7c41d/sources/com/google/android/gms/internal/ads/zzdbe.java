package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdbe extends zzdgm<zzdbf> implements zzdbf {
    public zzdbe(Set<zzdih<zzdbf>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzbD(final zzbcz zzbczVar) {
        zzk(new zzdgl(zzbczVar) { // from class: com.google.android.gms.internal.ads.zzdbd
            private final zzbcz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzbczVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgl
            public final void zza(Object obj) {
                ((zzdbf) obj).zzbD(this.zza);
            }
        });
    }
}
