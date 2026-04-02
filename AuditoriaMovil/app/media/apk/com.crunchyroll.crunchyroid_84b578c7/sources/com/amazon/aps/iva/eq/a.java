package com.amazon.aps.iva.eq;

import com.amazon.aps.iva.yb0.j;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.NoSuchElementException;
/* compiled from: NetworkInfo.kt */
/* loaded from: classes2.dex */
public final class a {
    public final b a;
    public final String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final String g;

    /* compiled from: NetworkInfo.kt */
    /* renamed from: com.amazon.aps.iva.eq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0228a {
        public static a a(String str) throws JsonParseException {
            String asString;
            Long valueOf;
            Long valueOf2;
            Long valueOf3;
            Long valueOf4;
            String asString2;
            try {
                JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                String asString3 = asJsonObject.get("connectivity").getAsString();
                b.C0229a c0229a = b.Companion;
                j.e(asString3, "it");
                c0229a.getClass();
                b a = b.C0229a.a(asString3);
                JsonElement jsonElement = asJsonObject.get("carrier_name");
                if (jsonElement == null) {
                    asString = null;
                } else {
                    asString = jsonElement.getAsString();
                }
                JsonElement jsonElement2 = asJsonObject.get("carrier_id");
                if (jsonElement2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(jsonElement2.getAsLong());
                }
                JsonElement jsonElement3 = asJsonObject.get("up_kbps");
                if (jsonElement3 == null) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(jsonElement3.getAsLong());
                }
                JsonElement jsonElement4 = asJsonObject.get("down_kbps");
                if (jsonElement4 == null) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(jsonElement4.getAsLong());
                }
                JsonElement jsonElement5 = asJsonObject.get("strength");
                if (jsonElement5 == null) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Long.valueOf(jsonElement5.getAsLong());
                }
                JsonElement jsonElement6 = asJsonObject.get("cellular_technology");
                if (jsonElement6 == null) {
                    asString2 = null;
                } else {
                    asString2 = jsonElement6.getAsString();
                }
                return new a(a, asString, valueOf, valueOf2, valueOf3, valueOf4, asString2);
            } catch (IllegalStateException e) {
                throw new JsonParseException(e.getMessage());
            } catch (NumberFormatException e2) {
                throw new JsonParseException(e2.getMessage());
            }
        }
    }

    /* compiled from: NetworkInfo.kt */
    /* loaded from: classes2.dex */
    public enum b {
        NETWORK_NOT_CONNECTED("network_not_connected"),
        NETWORK_ETHERNET("network_ethernet"),
        NETWORK_WIFI("network_wifi"),
        NETWORK_WIMAX("network_wimax"),
        NETWORK_BLUETOOTH("network_bluetooth"),
        NETWORK_2G("network_2G"),
        NETWORK_3G("network_3G"),
        NETWORK_4G("network_4G"),
        NETWORK_5G("network_5G"),
        NETWORK_MOBILE_OTHER("network_mobile_other"),
        NETWORK_CELLULAR("network_cellular"),
        NETWORK_OTHER("network_other");
        
        public static final C0229a Companion = new C0229a();
        private final String jsonValue;

        /* compiled from: NetworkInfo.kt */
        /* renamed from: com.amazon.aps.iva.eq.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0229a {
            public static b a(String str) {
                j.f(str, "serializedObject");
                b[] values = b.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    b bVar = values[i];
                    i++;
                    if (j.a(bVar.jsonValue, str)) {
                        return bVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        b(String str) {
            this.jsonValue = str;
        }

        public static final b fromJson(String str) {
            Companion.getClass();
            return C0229a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    public a() {
        this(null, null, null, null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && j.a(this.b, aVar.b) && j.a(this.c, aVar.c) && j.a(this.d, aVar.d) && j.a(this.e, aVar.e) && j.a(this.f, aVar.f) && j.a(this.g, aVar.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        Long l = this.c;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l2 = this.d;
        if (l2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Long l3 = this.e;
        if (l3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l4 = this.f;
        if (l4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkInfo(connectivity=");
        sb.append(this.a);
        sb.append(", carrierName=");
        sb.append(this.b);
        sb.append(", carrierId=");
        sb.append(this.c);
        sb.append(", upKbps=");
        sb.append(this.d);
        sb.append(", downKbps=");
        sb.append(this.e);
        sb.append(", strength=");
        sb.append(this.f);
        sb.append(", cellularTechnology=");
        return defpackage.b.c(sb, this.g, ")");
    }

    public a(b bVar, String str, Long l, Long l2, Long l3, Long l4, String str2) {
        j.f(bVar, "connectivity");
        this.a = bVar;
        this.b = str;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = str2;
    }

    public /* synthetic */ a(b bVar, String str, Long l, Long l2, Long l3, Long l4, String str2, int i) {
        this((i & 1) != 0 ? b.NETWORK_NOT_CONNECTED : bVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : l4, (i & 64) == 0 ? str2 : null);
    }
}
