package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3851b;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: d  reason: collision with root package name */
        private final String f3855d;

        a(String str) {
            this.f3855d = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f3855d;
        }
    }

    public c(String str, m mVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f3851b = str;
        this.a = mVar;
    }

    private String a(com.applovin.impl.sdk.c.b<String> bVar) {
        for (String str : this.a.b(bVar)) {
            if (this.f3851b.startsWith(str)) {
                return str;
            }
        }
        return null;
    }

    public String a() {
        return this.f3851b;
    }

    public a b() {
        return a(com.applovin.impl.sdk.c.b.bg) != null ? a.REGULAR : a(com.applovin.impl.sdk.c.b.bh) != null ? a.AD_RESPONSE_JSON : a.UNSPECIFIED;
    }

    public String c() {
        String a2 = a(com.applovin.impl.sdk.c.b.bg);
        if (TextUtils.isEmpty(a2)) {
            String a3 = a(com.applovin.impl.sdk.c.b.bh);
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
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f3851b.substring(c().length()), 0), "UTF-8"));
                    v B = this.a.B();
                    B.b("AdToken", "Decoded token into ad response: " + jSONObject);
                    return jSONObject;
                } catch (JSONException e2) {
                    v B2 = this.a.B();
                    B2.b("AdToken", "Unable to decode token '" + this.f3851b + "' into JSON", e2);
                    return null;
                }
            } catch (UnsupportedEncodingException e3) {
                this.a.B().b("AdToken", e.a.d.a.a.r(e.a.d.a.a.y("Unable to process ad response from token '"), this.f3851b, "'"), e3);
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
            String str = this.f3851b;
            String str2 = ((c) obj).f3851b;
            return str != null ? str.equals(str2) : str2 == null;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3851b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder B = e.a.d.a.a.B("AdToken{id=", StringUtils.prefixToIndex(32, this.f3851b), ", type=");
        B.append(b());
        B.append('}');
        return B.toString();
    }
}
