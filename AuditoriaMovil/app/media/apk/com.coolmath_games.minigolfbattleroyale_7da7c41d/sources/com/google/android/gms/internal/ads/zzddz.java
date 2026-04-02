package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzddz extends zzdgm<zzdeb> implements zzdeb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzddz(Set<zzdih<zzdeb>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdeb
    public final void zzbB(boolean z) {
        zzk(new zzdgl(true) { // from class: com.google.android.gms.internal.ads.zzddy
            @Override // com.google.android.gms.internal.ads.zzdgl
            public final void zza(Object obj) {
                ((zzdeb) obj).zzbB(true);
            }
        });
    }
}
