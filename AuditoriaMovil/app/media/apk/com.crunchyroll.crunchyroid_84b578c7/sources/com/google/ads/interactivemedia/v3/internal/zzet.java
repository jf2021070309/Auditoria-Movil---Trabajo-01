package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import java.util.List;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class zzet extends WebView {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzet(Context context, zzfm zzfmVar, CompanionData companionData, List list, zzhy zzhyVar) {
        super(context);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportMultipleWindows(true);
        setWebChromeClient(new zzes(this, context, zzhyVar, list));
        if (companionData.type() == com.google.ads.interactivemedia.v3.impl.data.zzav.Html) {
            loadData(Base64.encodeToString(companionData.src().getBytes(), 1), "text/html", "base64");
        } else if (companionData.type() == com.google.ads.interactivemedia.v3.impl.data.zzav.IFrame) {
            loadUrl(companionData.src());
        } else {
            throw new IllegalArgumentException(e.e("Companion type ", String.valueOf(companionData.type()), " is not valid for a CompanionWebView"));
        }
    }
}
