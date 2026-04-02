package com.kwad.components.core.n.b.a;

import android.text.TextUtils;
import com.kwad.components.offline.api.core.api.ICache;
import com.kwad.sdk.KsAdSDKImpl;
import java.io.File;
/* loaded from: classes.dex */
final class b implements ICache {
    @Override // com.kwad.components.offline.api.core.api.ICache
    public final String getPreCacheUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int zy = com.kwad.sdk.core.config.d.zy();
        if (zy >= 0) {
            return zy == 0 ? str : com.kwad.sdk.core.videocache.c.a.bl(KsAdSDKImpl.get().getContext()).dN(str);
        }
        File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(str);
        if (bP == null || !bP.exists()) {
            return null;
        }
        return bP.getAbsolutePath();
    }
}
