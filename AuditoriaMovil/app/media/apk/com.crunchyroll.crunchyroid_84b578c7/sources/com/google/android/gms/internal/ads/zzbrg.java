package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbrg extends zzbge {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbrg(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbgf
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
