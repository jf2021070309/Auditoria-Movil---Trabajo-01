package com.amazon.aps.iva.eq;

import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: UserInfo.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final String[] e = {"id", AppMeasurementSdk.ConditionalUserProperty.NAME, Scopes.EMAIL};
    public final String a;
    public final String b;
    public final String c;
    public final Map<String, Object> d;

    /* compiled from: UserInfo.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static b a(String str) throws JsonParseException {
            String asString;
            String asString2;
            try {
                JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                JsonElement jsonElement = asJsonObject.get("id");
                String str2 = null;
                if (jsonElement == null) {
                    asString = null;
                } else {
                    asString = jsonElement.getAsString();
                }
                JsonElement jsonElement2 = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (jsonElement2 == null) {
                    asString2 = null;
                } else {
                    asString2 = jsonElement2.getAsString();
                }
                JsonElement jsonElement3 = asJsonObject.get(Scopes.EMAIL);
                if (jsonElement3 != null) {
                    str2 = jsonElement3.getAsString();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                    if (!o.N(b.e, entry.getKey())) {
                        String key = entry.getKey();
                        j.e(key, "entry.key");
                        linkedHashMap.put(key, entry.getValue());
                    }
                }
                return new b(asString, asString2, str2, linkedHashMap);
            } catch (IllegalStateException e) {
                throw new JsonParseException(e.getMessage());
            } catch (NumberFormatException e2) {
                throw new JsonParseException(e2.getMessage());
            }
        }
    }

    public b() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b) && j.a(this.c, bVar.c) && j.a(this.d, bVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.d.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        return "UserInfo(id=" + this.a + ", name=" + this.b + ", email=" + this.c + ", additionalProperties=" + this.d + ")";
    }

    public b(String str, String str2, String str3, Map<String, ? extends Object> map) {
        j.f(map, "additionalProperties");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public /* synthetic */ b(int i) {
        this(null, null, null, a0.b);
    }
}
