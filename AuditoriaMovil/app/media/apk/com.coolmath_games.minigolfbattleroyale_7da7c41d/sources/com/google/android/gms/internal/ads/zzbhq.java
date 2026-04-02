package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbhq extends zzbgp {
    private zzbhq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zze(@Nullable zzbcz zzbczVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener;
        onAdInspectorClosedListener = zzbhs.zze().zzg;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzbczVar == null ? null : new AdInspectorError(zzbczVar.zza, zzbczVar.zzb, zzbczVar.zzc));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbhq(zzbhp zzbhpVar) {
    }
}
