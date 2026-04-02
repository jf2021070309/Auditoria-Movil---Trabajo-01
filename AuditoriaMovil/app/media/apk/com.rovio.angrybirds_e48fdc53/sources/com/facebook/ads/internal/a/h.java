package com.facebook.ads.internal.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.internal.j.a;
import java.util.Map;
/* loaded from: classes2.dex */
class h extends a {
    private static final String d = h.class.getSimpleName();
    private final Uri e;
    private final Map<String, String> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri, Map<String, String> map) {
        super(context, cVar, str);
        this.e = uri;
        this.f = map;
    }

    @Override // com.facebook.ads.internal.a.a
    public a.EnumC0112a a() {
        return null;
    }

    @Override // com.facebook.ads.internal.a.a
    public void b() {
        com.facebook.ads.internal.m.e eVar = com.facebook.ads.internal.m.e.IMMEDIATE;
        String queryParameter = this.e.getQueryParameter("priority");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                eVar = com.facebook.ads.internal.m.e.values()[Integer.valueOf(queryParameter).intValue()];
            } catch (Exception e) {
            }
        }
        this.b.a(this.c, this.f, this.e.getQueryParameter("type"), eVar);
    }
}
