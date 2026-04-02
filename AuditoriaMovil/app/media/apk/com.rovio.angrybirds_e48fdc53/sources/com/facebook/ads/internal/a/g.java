package com.facebook.ads.internal.a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.j.a;
import java.util.Map;
/* loaded from: classes2.dex */
class g extends a {
    private static final String d = g.class.getSimpleName();
    private final Uri e;
    private final Map<String, String> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri, Map<String, String> map) {
        super(context, cVar, str);
        this.e = uri;
        this.f = map;
    }

    @Override // com.facebook.ads.internal.a.a
    public a.EnumC0112a a() {
        return a.EnumC0112a.OPEN_LINK;
    }

    @Override // com.facebook.ads.internal.a.a
    public void b() {
        a(this.f);
        try {
            com.facebook.ads.internal.q.c.g.a(new com.facebook.ads.internal.q.c.g(), this.a, Uri.parse(this.e.getQueryParameter("link")), this.c);
        } catch (Exception e) {
            Log.d(d, "Failed to open link url: " + this.e.toString(), e);
        }
    }
}
