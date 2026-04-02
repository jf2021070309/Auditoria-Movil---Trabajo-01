package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.internal.ads.zzazb;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcml;
import com.google.android.gms.internal.ads.zzcms;
import com.google.android.gms.internal.ads.zzcnq;
import java.io.InputStream;
import java.util.Map;
@TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
/* loaded from: classes.dex */
public class zzx extends zzw {
    @Override // com.google.android.gms.ads.internal.util.zzad
    public final CookieManager zzk(Context context) {
        if (zzad.zzu()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcgt.zzg("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzad
    public final zzcms zzl(zzcml zzcmlVar, zzazb zzazbVar, boolean z) {
        return new zzcnq(zzcmlVar, zzazbVar, z);
    }

    @Override // com.google.android.gms.ads.internal.util.zzad
    public final int zzm() {
        return 16974374;
    }

    @Override // com.google.android.gms.ads.internal.util.zzad
    public final WebResourceResponse zzn(String str, String str2, int i2, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i2, str3, map, inputStream);
    }
}
