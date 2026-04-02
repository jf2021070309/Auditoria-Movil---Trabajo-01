package com.amazon.aps.iva.ir;

import com.amazon.aps.iva.b8.i;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.cast.CredentialsData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.NoSuchElementException;
/* compiled from: TelemetryDebugEvent.kt */
/* loaded from: classes2.dex */
public final class a {
    public final d a;
    public final long b;
    public final String c;
    public final f d;
    public final String e;
    public final b f;
    public final e g;
    public final h h;
    public final C0386a i;
    public final g j;
    public final String k;

    /* compiled from: TelemetryDebugEvent.kt */
    /* renamed from: com.amazon.aps.iva.ir.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0386a {
        public final String a;

        public C0386a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0386a) && j.a(this.a, ((C0386a) obj).a)) {
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

    /* compiled from: TelemetryDebugEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;

        public b(String str) {
            j.f(str, "id");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && j.a(this.a, ((b) obj).a)) {
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

    /* compiled from: TelemetryDebugEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c9 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[Catch: NumberFormatException -> 0x0195, IllegalStateException -> 0x01a0, TRY_LEAVE, TryCatch #11 {IllegalStateException -> 0x01a0, NumberFormatException -> 0x0195, blocks: (B:3:0x0006, B:7:0x004f, B:11:0x006f, B:18:0x0098, B:25:0x00c1, B:33:0x00ec, B:35:0x0113, B:38:0x0128, B:39:0x0131, B:41:0x0133, B:42:0x013c, B:28:0x00ca, B:44:0x013e, B:45:0x0147, B:47:0x0149, B:48:0x0152, B:21:0x00a1, B:50:0x0154, B:51:0x015d, B:53:0x015f, B:54:0x0168, B:14:0x0078, B:56:0x016a, B:57:0x0173, B:59:0x0175, B:60:0x017e, B:62:0x0180, B:63:0x0189, B:65:0x018b, B:66:0x0194, B:24:0x00a9, B:34:0x00fb, B:17:0x0080, B:31:0x00d3, B:10:0x0057), top: B:75:0x0006, inners: #12, #10, #9, #8, #7 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.ir.a a(java.lang.String r17) throws com.google.gson.JsonParseException {
            /*
                Method dump skipped, instructions count: 427
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ir.a.c.a(java.lang.String):com.amazon.aps.iva.ir.a");
        }
    }

    /* compiled from: TelemetryDebugEvent.kt */
    /* loaded from: classes2.dex */
    public static final class d {
    }

    /* compiled from: TelemetryDebugEvent.kt */
    /* loaded from: classes2.dex */
    public static final class e {
        public final String a;

        public e(String str) {
            j.f(str, "id");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && j.a(this.a, ((e) obj).a)) {
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

    /* compiled from: TelemetryDebugEvent.kt */
    /* loaded from: classes2.dex */
    public enum f {
        ANDROID(CredentialsData.CREDENTIALS_TYPE_ANDROID),
        IOS(CredentialsData.CREDENTIALS_TYPE_IOS),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native");
        
        public static final C0387a Companion = new C0387a();
        private final String jsonValue;

        /* compiled from: TelemetryDebugEvent.kt */
        /* renamed from: com.amazon.aps.iva.ir.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0387a {
            public static f a(String str) {
                j.f(str, "serializedObject");
                f[] values = f.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    f fVar = values[i];
                    i++;
                    if (j.a(fVar.jsonValue, str)) {
                        return fVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        f(String str) {
            this.jsonValue = str;
        }

        public static final f fromJson(String str) {
            Companion.getClass();
            return C0387a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: TelemetryDebugEvent.kt */
    /* loaded from: classes2.dex */
    public static final class g {
        public final String a;
        public final String b;

        public g(String str) {
            j.f(str, "message");
            this.a = str;
            this.b = "debug";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof g) && j.a(this.a, ((g) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Telemetry(message="), this.a, ")");
        }
    }

    /* compiled from: TelemetryDebugEvent.kt */
    /* loaded from: classes2.dex */
    public static final class h {
        public final String a;

        public h(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof h) && j.a(this.a, ((h) obj).a)) {
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

    public a(d dVar, long j, String str, f fVar, String str2, b bVar, e eVar, h hVar, C0386a c0386a, g gVar) {
        j.f(fVar, FirebaseAnalytics.Param.SOURCE);
        j.f(str2, "version");
        this.a = dVar;
        this.b = j;
        this.c = str;
        this.d = fVar;
        this.e = str2;
        this.f = bVar;
        this.g = eVar;
        this.h = hVar;
        this.i = c0386a;
        this.j = gVar;
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
        b bVar = this.f;
        if (bVar != null) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("id", bVar.a);
            jsonObject.add("application", jsonObject3);
        }
        e eVar = this.g;
        if (eVar != null) {
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("id", eVar.a);
            jsonObject.add("session", jsonObject4);
        }
        h hVar = this.h;
        if (hVar != null) {
            JsonObject jsonObject5 = new JsonObject();
            jsonObject5.addProperty("id", hVar.a);
            jsonObject.add("view", jsonObject5);
        }
        C0386a c0386a = this.i;
        if (c0386a != null) {
            JsonObject jsonObject6 = new JsonObject();
            jsonObject6.addProperty("id", c0386a.a);
            jsonObject.add("action", jsonObject6);
        }
        g gVar = this.j;
        gVar.getClass();
        JsonObject jsonObject7 = new JsonObject();
        jsonObject7.addProperty("status", gVar.b);
        jsonObject7.addProperty("message", gVar.a);
        jsonObject.add("telemetry", jsonObject7);
        return jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && this.b == aVar.b && j.a(this.c, aVar.c) && this.d == aVar.d && j.a(this.e, aVar.e) && j.a(this.f, aVar.f) && j.a(this.g, aVar.g) && j.a(this.h, aVar.h) && j.a(this.i, aVar.i) && j.a(this.j, aVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int b2 = com.amazon.aps.iva.c80.a.b(this.e, (this.d.hashCode() + com.amazon.aps.iva.c80.a.b(this.c, i.a(this.b, this.a.hashCode() * 31, 31), 31)) * 31, 31);
        int i = 0;
        b bVar = this.f;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i2 = (b2 + hashCode) * 31;
        e eVar = this.g;
        if (eVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = eVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        h hVar = this.h;
        if (hVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = hVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        C0386a c0386a = this.i;
        if (c0386a != null) {
            i = c0386a.hashCode();
        }
        return this.j.hashCode() + ((i4 + i) * 31);
    }

    public final String toString() {
        return "TelemetryDebugEvent(dd=" + this.a + ", date=" + this.b + ", service=" + this.c + ", source=" + this.d + ", version=" + this.e + ", application=" + this.f + ", session=" + this.g + ", view=" + this.h + ", action=" + this.i + ", telemetry=" + this.j + ")";
    }
}
