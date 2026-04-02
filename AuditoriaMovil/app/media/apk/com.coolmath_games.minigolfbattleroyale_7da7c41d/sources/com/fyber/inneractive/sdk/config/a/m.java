package com.fyber.inneractive.sdk.config.a;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class m implements com.fyber.inneractive.sdk.a.a<l> {
    @Override // com.fyber.inneractive.sdk.a.a
    public final String a() {
        return "IALastModifiedFromHeader.remote";
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final /* bridge */ /* synthetic */ void a(l lVar) {
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final String b() {
        return "ia-remote.config";
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final /* synthetic */ l a(String str) throws Exception {
        return b(str);
    }

    private static l b(String str) throws Exception {
        try {
            return l.a(new JSONObject(str));
        } catch (Exception e) {
            IAlog.e("internal error while parsing remote features config file", new Object[0]);
            if (IAlog.a <= 5) {
                e.printStackTrace();
            }
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.a.a
    public final String c() {
        if (com.fyber.inneractive.sdk.config.f.i() == null) {
            return String.format(Locale.ENGLISH, "https://%sfeatures_config.json", "cdn2.inner-active.mobi/ia-sdk-config/");
        }
        return com.fyber.inneractive.sdk.config.f.i();
    }
}
