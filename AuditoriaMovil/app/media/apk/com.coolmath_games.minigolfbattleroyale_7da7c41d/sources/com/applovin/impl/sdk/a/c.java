package com.applovin.impl.sdk.a;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private final k a;
    private final String b;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        
        private final String d;

        a(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.d;
        }
    }

    public c(String str, k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.b = str;
        this.a = kVar;
    }

    private String a(com.applovin.impl.sdk.c.b<String> bVar) {
        for (String str : this.a.b(bVar)) {
            if (this.b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }

    public String a() {
        return this.b;
    }

    public a b() {
        return a(com.applovin.impl.sdk.c.b.aW) != null ? a.REGULAR : a(com.applovin.impl.sdk.c.b.aX) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String c() {
        String a2 = a(com.applovin.impl.sdk.c.b.aW);
        if (TextUtils.isEmpty(a2)) {
            String a3 = a(com.applovin.impl.sdk.c.b.aX);
            if (TextUtils.isEmpty(a3)) {
                return null;
            }
            return a3;
        }
        return a2;
    }

    public JSONObject d() {
        if (b() == a.AD_RESPONSE_JSON) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.b.substring(c().length()), 0), "UTF-8"));
                    r z = this.a.z();
                    z.b("AdToken", "Decoded token into ad response: " + jSONObject);
                    return jSONObject;
                } catch (JSONException e) {
                    r z2 = this.a.z();
                    z2.b("AdToken", "Unable to decode token '" + this.b + "' into JSON", e);
                    return null;
                }
            } catch (UnsupportedEncodingException e2) {
                r z3 = this.a.z();
                z3.b("AdToken", "Unable to process ad response from token '" + this.b + "'", e2);
                return null;
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            String str = this.b;
            String str2 = ((c) obj).b;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String prefixToIndex = StringUtils.prefixToIndex(32, this.b);
        return "AdToken{id=" + prefixToIndex + ", type=" + b() + '}';
    }
}
