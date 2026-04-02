package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdix extends zzdgm<zzbqg> implements zzbqg {
    public zzdix(Set<zzdih<zzbqg>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final synchronized void zza() {
        zzk(zzdiu.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzb(final zzccl zzcclVar) {
        zzk(new zzdgl(zzcclVar) { // from class: com.google.android.gms.internal.ads.zzdiv
            private final zzccl zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcclVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdgl
            public final void zza(Object obj) {
                ((zzbqg) obj).zzb(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzc() {
        zzk(zzdiw.zza);
    }
}
