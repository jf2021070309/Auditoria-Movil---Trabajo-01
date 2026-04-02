package com.kwad.components.ad.feed.monitor;

import android.text.TextUtils;
import android.util.Pair;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.core.network.a.a;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.videocache.f;
import com.kwad.sdk.utils.q;
import java.io.File;
/* loaded from: classes.dex */
public final class a {
    public static Pair<Integer, String> d(AdTemplate adTemplate) {
        String F = com.kwad.sdk.core.response.b.a.F(d.ck(adTemplate));
        if (TextUtils.isEmpty(F)) {
            return new Pair<>(2, "empty videoUrl");
        }
        int zy = com.kwad.sdk.core.config.d.zy();
        String str = "";
        long j = 0;
        int i = 1;
        if (zy < 0) {
            File bP = com.kwad.sdk.core.diskcache.b.a.At().bP(F);
            if (!q.L(bP)) {
                a.C0256a c0256a = new a.C0256a();
                int i2 = com.kwad.sdk.core.diskcache.b.a.At().a(F, c0256a) ? 1 : 2;
                str = c0256a.msg;
                i = i2;
            }
            if (bP != null) {
                j = bP.length();
            }
        } else if (zy > 0) {
            a.C0256a c0256a2 = new a.C0256a();
            f bl = com.kwad.sdk.core.videocache.c.a.bl(KsAdSDKImpl.get().getContext());
            if (!bl.dP(F)) {
                i = bl.a(F, zy * 1024, c0256a2) ? 1 : 2;
            }
            str = c0256a2.msg;
            adTemplate.setDownloadSize(zy * 1024);
            return new Pair<>(Integer.valueOf(i), str);
        }
        adTemplate.setDownloadSize(j);
        return new Pair<>(Integer.valueOf(i), str);
    }
}
