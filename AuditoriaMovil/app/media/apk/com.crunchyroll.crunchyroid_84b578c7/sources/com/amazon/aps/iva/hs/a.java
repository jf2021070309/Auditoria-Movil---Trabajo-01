package com.amazon.aps.iva.hs;

import android.net.Uri;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ImagesContract;
import com.segment.analytics.ConnectionFactory;
import java.net.HttpURLConnection;
/* compiled from: ProxyConnectionFactory.kt */
/* loaded from: classes2.dex */
public final class a extends ConnectionFactory {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // com.segment.analytics.ConnectionFactory
    public final HttpURLConnection openConnection(String str) {
        String str2;
        j.f(str, ImagesContract.URL);
        b bVar = this.a;
        bVar.getClass();
        Uri parse = Uri.parse(str);
        String authority = parse.getAuthority();
        if (authority != null && (str2 = bVar.a.get(authority)) != null) {
            Uri parse2 = Uri.parse(str2);
            str = parse.buildUpon().scheme(parse2.getScheme()).authority(parse2.getAuthority()).build().toString();
            j.e(str, "segmentUrl.buildUpon()\n …      .build().toString()");
        }
        HttpURLConnection openConnection = super.openConnection(str);
        j.e(openConnection, "super.openConnection(seg…yUrlProvider.getUrl(url))");
        return openConnection;
    }
}
