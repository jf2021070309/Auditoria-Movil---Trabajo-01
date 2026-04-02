package com.google.firebase.auth;

import com.umeng.analytics.pro.as;
import java.util.Map;
/* loaded from: classes2.dex */
public class GetTokenResult {
    private String a;
    private Map<String, Object> b;

    public GetTokenResult(String str, Map<String, Object> map) {
        this.a = str;
        this.b = map;
    }

    public String getToken() {
        return this.a;
    }

    public long getExpirationTimestamp() {
        return a(as.b);
    }

    public long getAuthTimestamp() {
        return a("auth_time");
    }

    public long getIssuedAtTimestamp() {
        return a("iat");
    }

    public String getSignInProvider() {
        Map map = (Map) this.b.get("firebase");
        if (map != null) {
            return (String) map.get("sign_in_provider");
        }
        return null;
    }

    public Map<String, Object> getClaims() {
        return this.b;
    }

    private long a(String str) {
        Integer num = (Integer) this.b.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }
}
