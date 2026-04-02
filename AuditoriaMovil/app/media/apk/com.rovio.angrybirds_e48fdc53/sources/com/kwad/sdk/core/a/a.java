package com.kwad.sdk.core.a;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ay;
import com.kwad.sdk.utils.p;
import java.util.Map;
/* loaded from: classes.dex */
public final class a implements f {
    private static String aok;

    private static String AH() {
        Context context;
        if (TextUtils.isEmpty(aok)) {
            if (((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext() == null) {
                return "";
            }
            String str = context.getPackageName() + ay.cY(context);
            aok = str;
            return str;
        }
        return aok;
    }

    @Override // com.kwad.sdk.core.a.f
    public final void a(String str, Map<String, String> map, String str2) {
        e.a(str, map, str2);
    }

    @Override // com.kwad.sdk.core.a.f
    public final String cQ(String str) {
        try {
            String db = p.db(0);
            return new String(c.AI().encode(b.d(db.getBytes("UTF-8"), b.f(str.getBytes()))), "UTF-8");
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            return str;
        }
    }

    @Override // com.kwad.sdk.core.a.f
    public final void e(Map<String, String> map) {
        map.put("Ks-PkgId", AH());
        map.put("Ks-Encoding", "2");
    }

    @Override // com.kwad.sdk.core.a.f
    public final String getResponseData(String str) {
        try {
            return new String(b.g(b.a(p.db(0), c.AK().decode(str.getBytes()))), "UTF-8");
        } catch (Exception e) {
            return str;
        }
    }
}
