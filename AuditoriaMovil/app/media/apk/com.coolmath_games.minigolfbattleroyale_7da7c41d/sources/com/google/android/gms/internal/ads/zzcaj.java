package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcaj extends zzcae {
    final /* synthetic */ UpdateClickUrlCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcaj(zzcal zzcalVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zze(List<Uri> list) {
        this.zza.onSuccess(list.get(0));
    }

    @Override // com.google.android.gms.internal.ads.zzcaf
    public final void zzf(String str) {
        this.zza.onFailure(str);
    }
}
