package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.webkit.WebView;
import com.amazon.aps.iva.i9.a;
import com.amazon.aps.iva.i9.d;
import com.amazon.aps.iva.i9.g;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzfp implements g.b {
    final /* synthetic */ zzft zza;

    public zzfp(zzft zzftVar) {
        this.zza = zzftVar;
    }

    @Override // com.amazon.aps.iva.i9.g.b
    public final void onPostMessage(WebView webView, d dVar, Uri uri, boolean z, a aVar) {
        this.zza.zzf(dVar.a(), "4");
    }
}
