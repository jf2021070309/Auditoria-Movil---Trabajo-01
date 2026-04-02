package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcai extends zzcae {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcai(zzcal zzcalVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze(List<Uri> list) {
        this.zza.onSuccess(list);
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzf(String str) {
        this.zza.onFailure(str);
    }
}
