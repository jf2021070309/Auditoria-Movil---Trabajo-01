package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcnc implements zzbpr<zzcml> {
    final /* synthetic */ zzcne zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnc(zzcne zzcneVar) {
        this.zza = zzcneVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final /* bridge */ /* synthetic */ void zza(zzcml zzcmlVar, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zza) {
                    i = this.zza.zzG;
                    if (i != parseInt) {
                        this.zza.zzG = parseInt;
                        this.zza.requestLayout();
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Exception occurred while getting webview content height", e);
            }
        }
    }
}
