package com.kwad.sdk.collector.a;

import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.core.network.d;
import com.kwad.sdk.h;
import com.kwad.sdk.utils.t;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends d {
    private C0244a ajT;

    /* renamed from: com.kwad.sdk.collector.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0244a {
        private List<String> ajU;

        public C0244a(List<String> list) {
            this.ajU = list;
        }

        public final JSONObject toJson() {
            JSONObject jSONObject = new JSONObject();
            t.putValue(jSONObject, DBDefinition.PACKAGE_NAME, this.ajU);
            return jSONObject;
        }
    }

    public a(List<String> list) {
        C0244a c0244a = new C0244a(list);
        this.ajT = c0244a;
        putBody("targetAppInfo", c0244a.toJson());
        putBody("sdkVersion", BuildConfig.VERSION_NAME);
        putBody("sdkVersionCode", BuildConfig.VERSION_CODE);
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final String getUrl() {
        return h.xh();
    }
}
