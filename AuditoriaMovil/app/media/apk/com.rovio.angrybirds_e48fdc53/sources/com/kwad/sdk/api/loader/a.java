package com.kwad.sdk.api.loader;

import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.bg;
import java.io.File;
import org.json.JSONObject;
/* loaded from: classes.dex */
final class a {

    /* renamed from: com.kwad.sdk.api.loader.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0242a {
        String UF;
        int aim;
        String ain;
        transient File aio;
        long interval;
        String sdkVersion;

        C0242a() {
        }

        public final void parseJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.aim = jSONObject.optInt("dynamicType");
            this.ain = jSONObject.optString("dynamicUrl");
            this.UF = jSONObject.optString("md5");
            this.interval = jSONObject.optLong(bg.aU);
            this.sdkVersion = jSONObject.optString("sdkVersion");
        }

        public final String toString() {
            return "Data{dynamicType=" + this.aim + ", dynamicUrl='" + this.ain + "', md5='" + this.UF + "', interval=" + this.interval + ", sdkVersion='" + this.sdkVersion + "', downloadFile=" + this.aio + '}';
        }

        public final boolean yk() {
            return this.aim == 1;
        }

        public final boolean yl() {
            return this.aim == -1;
        }
    }

    /* loaded from: classes.dex */
    static class b {
        long aip;
        C0242a aiq;
        String errorMsg;

        public final void parseJson(JSONObject jSONObject) {
            this.aip = jSONObject.optLong("result");
            this.errorMsg = jSONObject.optString("errorMsg");
            C0242a c0242a = new C0242a();
            this.aiq = c0242a;
            c0242a.parseJson(jSONObject.optJSONObject(ShareConstants.WEB_DIALOG_PARAM_DATA));
        }

        public final String toString() {
            return "UpdateData{result=" + this.aip + ", errorMsg='" + this.errorMsg + "', data=" + this.aiq + '}';
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean ym() {
            return this.aip == 1 && this.aiq != null;
        }
    }
}
