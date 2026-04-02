package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzer extends WebViewClient {
    final /* synthetic */ zzes zza;

    public zzer(zzes zzesVar) {
        this.zza = zzesVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.zza.zzb.zza(str);
        for (CompanionAdSlot.ClickListener clickListener : this.zza.zzc) {
            clickListener.onCompanionAdClick();
        }
        return true;
    }
}
