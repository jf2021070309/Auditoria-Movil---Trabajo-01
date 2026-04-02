package com.qq.e.ads.nativ;

import org.json.JSONObject;
/* loaded from: classes3.dex */
public class NativeUnifiedADAppInfoImpl implements NativeUnifiedADAppMiitInfo {
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final String f;

    /* loaded from: classes3.dex */
    private interface Keys {
        public static final String APP_NAME = "app_name";
        public static final String AUTHOR_NAME = "author_name";
        public static final String PACKAGE_SIZE = "package_size";
        public static final String PERMISSION_URL = "permission_url";
        public static final String PRIVACY_AGREEMENT = "privacy_agreement";
        public static final String VERSION_NAME = "version_name";
    }

    public NativeUnifiedADAppInfoImpl(JSONObject jSONObject) {
        this.a = jSONObject.optString("app_name");
        this.b = jSONObject.optString(Keys.AUTHOR_NAME);
        this.c = jSONObject.optLong(Keys.PACKAGE_SIZE);
        this.d = jSONObject.optString(Keys.PERMISSION_URL);
        this.e = jSONObject.optString(Keys.PRIVACY_AGREEMENT);
        this.f = jSONObject.optString(Keys.VERSION_NAME);
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getAppName() {
        return this.a;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getAuthorName() {
        return this.b;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public long getPackageSizeBytes() {
        return this.c;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getPermissionsUrl() {
        return this.d;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getPrivacyAgreement() {
        return this.e;
    }

    @Override // com.qq.e.ads.nativ.NativeUnifiedADAppMiitInfo
    public String getVersionName() {
        return this.f;
    }
}
