package com.amazon.aps.iva.ir;

import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.CredentialsData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.NoSuchElementException;
/* compiled from: TelemetryErrorEvent.kt */
/* loaded from: classes2.dex */
public final class b {
    public final d a;
    public final long b;
    public final String c;
    public final g d;
    public final String e;
    public final C0388b f;
    public final f g;
    public final i h;
    public final a i;
    public final h j;
    public final String k;

    /* compiled from: TelemetryErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && j.a(this.a, ((a) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Action(id="), this.a, ")");
        }
    }

    /* compiled from: TelemetryErrorEvent.kt */
    /* renamed from: com.amazon.aps.iva.ir.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0388b {
        public final String a;

        public C0388b(String str) {
            j.f(str, "id");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0388b) && j.a(this.a, ((C0388b) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Application(id="), this.a, ")");
        }
    }

    /* compiled from: TelemetryErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[Catch: NumberFormatException -> 0x0168, IllegalStateException -> 0x0173, TRY_LEAVE, TryCatch #9 {IllegalStateException -> 0x0173, NumberFormatException -> 0x0168, blocks: (B:3:0x0006, B:7:0x004f, B:11:0x006f, B:18:0x0098, B:25:0x00c1, B:33:0x00ec, B:28:0x00ca, B:36:0x0111, B:37:0x011a, B:39:0x011c, B:40:0x0125, B:21:0x00a1, B:42:0x0127, B:43:0x0130, B:45:0x0132, B:46:0x013b, B:14:0x0078, B:48:0x013d, B:49:0x0146, B:51:0x0148, B:52:0x0151, B:54:0x0153, B:55:0x015c, B:57:0x015e, B:58:0x0167, B:24:0x00a9, B:10:0x0057, B:17:0x0080, B:31:0x00d3), top: B:67:0x0006, inners: #10, #8, #7, #6 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.ir.b a(java.lang.String r17) throws com.google.gson.JsonParseException {
            /*
                Method dump skipped, instructions count: 382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ir.b.c.a(java.lang.String):com.amazon.aps.iva.ir.b");
        }
    }

    /* compiled from: TelemetryErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class d {
    }

    /* compiled from: TelemetryErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class e {
        public final String a;
        public final String b;

        /* compiled from: TelemetryErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static e a(String str) throws JsonParseException {
                String asString;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("stack");
                    String str2 = null;
                    if (jsonElement == null) {
                        asString = null;
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    JsonElement jsonElement2 = asJsonObject.get("kind");
                    if (jsonElement2 != null) {
                        str2 = jsonElement2.getAsString();
                    }
                    return new e(asString, str2);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public e() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (j.a(this.a, eVar.a) && j.a(this.b, eVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(stack=");
            sb.append(this.a);
            sb.append(", kind=");
            return defpackage.b.c(sb, this.b, ")");
        }

        public e(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: TelemetryErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class f {
        public final String a;

        public f(String str) {
            j.f(str, "id");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && j.a(this.a, ((f) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Session(id="), this.a, ")");
        }
    }

    /* compiled from: TelemetryErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum g {
        ANDROID(CredentialsData.CREDENTIALS_TYPE_ANDROID),
        IOS(CredentialsData.CREDENTIALS_TYPE_IOS),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: TelemetryErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static g a(String str) {
                j.f(str, "serializedObject");
                g[] values = g.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    g gVar = values[i];
                    i++;
                    if (j.a(gVar.jsonValue, str)) {
                        return gVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        g(String str) {
            this.jsonValue = str;
        }

        public static final g fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: TelemetryErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class h {
        public final String a;
        public final e b;
        public final String c;

        /* compiled from: TelemetryErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static h a(String str) throws JsonParseException {
                String jsonElement;
                e a;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("message").getAsString();
                    JsonElement jsonElement2 = asJsonObject.get("error");
                    if (jsonElement2 != null && (jsonElement = jsonElement2.toString()) != null) {
                        a = e.a.a(jsonElement);
                        j.e(asString, "message");
                        return new h(asString, a);
                    }
                    a = null;
                    j.e(asString, "message");
                    return new h(asString, a);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public h(String str, e eVar) {
            j.f(str, "message");
            this.a = str;
            this.b = eVar;
            this.c = "error";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (j.a(this.a, hVar.a) && j.a(this.b, hVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            e eVar = this.b;
            if (eVar == null) {
                hashCode = 0;
            } else {
                hashCode = eVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "Telemetry(message=" + this.a + ", error=" + this.b + ")";
        }
    }

    /* compiled from: TelemetryErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class i {
        public final String a;

        public i(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof i) && j.a(this.a, ((i) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("View(id="), this.a, ")");
        }
    }

    public b(d dVar, long j, String str, g gVar, String str2, C0388b c0388b, f fVar, i iVar, a aVar, h hVar) {
        j.f(gVar, FirebaseAnalytics.Param.SOURCE);
        j.f(str2, "version");
        this.a = dVar;
        this.b = j;
        this.c = str;
        this.d = gVar;
        this.e = str2;
        this.f = c0388b;
        this.g = fVar;
        this.h = iVar;
        this.i = aVar;
        this.j = hVar;
        this.k = "telemetry";
    }

    public final JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        this.a.getClass();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("format_version", (Number) 2L);
        jsonObject.add("_dd", jsonObject2);
        jsonObject.addProperty("type", this.k);
        jsonObject.addProperty("date", Long.valueOf(this.b));
        jsonObject.addProperty("service", this.c);
        jsonObject.add(FirebaseAnalytics.Param.SOURCE, this.d.toJson());
        jsonObject.addProperty("version", this.e);
        C0388b c0388b = this.f;
        if (c0388b != null) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("id", c0388b.a);
            jsonObject.add("application", jsonObject3);
        }
        f fVar = this.g;
        if (fVar != null) {
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("id", fVar.a);
            jsonObject.add("session", jsonObject4);
        }
        i iVar = this.h;
        if (iVar != null) {
            JsonObject jsonObject5 = new JsonObject();
            jsonObject5.addProperty("id", iVar.a);
            jsonObject.add("view", jsonObject5);
        }
        a aVar = this.i;
        if (aVar != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("id", aVar.a);
            jsonObject.add("action", jsonObject6);
        }
        h hVar = this.j;
        hVar.getClass();
        JsonObject jsonObject7 = new JsonObject();
        jsonObject7.addProperty("status", hVar.c);
        jsonObject7.addProperty("message", hVar.a);
        e eVar = hVar.b;
        if (eVar != null) {
            JsonObject jsonObject8 = new JsonObject();
            String str = eVar.a;
            if (str != null) {
                jsonObject8.addProperty("stack", str);
            }
            String str2 = eVar.b;
            if (str2 != null) {
                jsonObject8.addProperty("kind", str2);
            }
            jsonObject7.add("error", jsonObject8);
        }
        jsonObject.add("telemetry", jsonObject7);
        return jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && this.b == bVar.b && j.a(this.c, bVar.c) && this.d == bVar.d && j.a(this.e, bVar.e) && j.a(this.f, bVar.f) && j.a(this.g, bVar.g) && j.a(this.h, bVar.h) && j.a(this.i, bVar.i) && j.a(this.j, bVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int b = com.amazon.aps.iva.c80.a.b(this.e, (this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31);
        int i2 = 0;
        C0388b c0388b = this.f;
        if (c0388b == null) {
            hashCode = 0;
        } else {
            hashCode = c0388b.hashCode();
        }
        int i3 = (b + hashCode) * 31;
        f fVar = this.g;
        if (fVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fVar.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        i iVar = this.h;
        if (iVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = iVar.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        a aVar = this.i;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return this.j.hashCode() + ((i5 + i2) * 31);
    }

    public final String toString() {
        return "TelemetryErrorEvent(dd=" + this.a + ", date=" + this.b + ", service=" + this.c + ", source=" + this.d + ", version=" + this.e + ", application=" + this.f + ", session=" + this.g + ", view=" + this.h + ", action=" + this.i + ", telemetry=" + this.j + ")";
    }
}
