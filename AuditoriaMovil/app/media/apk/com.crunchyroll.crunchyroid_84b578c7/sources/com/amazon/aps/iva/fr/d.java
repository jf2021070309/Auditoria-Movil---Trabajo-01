package com.amazon.aps.iva.fr;

import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
/* compiled from: ResourceEvent.kt */
/* loaded from: classes2.dex */
public final class d {
    public final long a;
    public final b b;
    public final String c;
    public final w d;
    public final z e;
    public final e0 f;
    public final d0 g;
    public final f h;
    public final c0 i;
    public final C0278d j;
    public final q k;
    public final j l;
    public final h m;
    public final g n;
    public final v o;
    public final a p;

    /* compiled from: ResourceEvent.kt */
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
            if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.a, ((a) obj).a)) {
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

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class a0 {
        public final long a;
        public final long b;

        public a0(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            if (this.a == a0Var.a && this.b == a0Var.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ssl(duration=");
            sb.append(this.a);
            sb.append(", start=");
            return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;

        public b(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && com.amazon.aps.iva.yb0.j.a(this.a, ((b) obj).a)) {
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

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public enum b0 {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static b0 a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                b0[] values = b0.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    b0 b0Var = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(b0Var.jsonValue, str)) {
                        return b0Var;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        b0(String str) {
            this.jsonValue = str;
        }

        public static final b0 fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public final String a;
        public final String b;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static c a(String str) throws JsonParseException {
                String asString;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("technology");
                    String str2 = null;
                    if (jsonElement == null) {
                        asString = null;
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    JsonElement jsonElement2 = asJsonObject.get("carrier_name");
                    if (jsonElement2 != null) {
                        str2 = jsonElement2.getAsString();
                    }
                    return new c(asString, str2);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public c() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, cVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, cVar.b)) {
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
            StringBuilder sb = new StringBuilder("Cellular(technology=");
            sb.append(this.a);
            sb.append(", carrierName=");
            return defpackage.b.c(sb, this.b, ")");
        }

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c0 {
        public final String a;
        public final String b;
        public final Boolean c;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static c0 a(String str) throws JsonParseException {
                Boolean valueOf;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("test_id").getAsString();
                    String asString2 = asJsonObject.get("result_id").getAsString();
                    JsonElement jsonElement = asJsonObject.get("injected");
                    if (jsonElement == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(jsonElement.getAsBoolean());
                    }
                    com.amazon.aps.iva.yb0.j.e(asString, "testId");
                    com.amazon.aps.iva.yb0.j.e(asString2, "resultId");
                    return new c0(asString, asString2, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public c0(String str, String str2, Boolean bool) {
            this.a = str;
            this.b = str2;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, c0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, c0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, c0Var.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int b = com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
            Boolean bool = this.c;
            if (bool == null) {
                hashCode = 0;
            } else {
                hashCode = bool.hashCode();
            }
            return b + hashCode;
        }

        public final String toString() {
            return "Synthetics(testId=" + this.a + ", resultId=" + this.b + ", injected=" + this.c + ")";
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* renamed from: com.amazon.aps.iva.fr.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0278d {
        public final String a;

        public C0278d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0278d) && com.amazon.aps.iva.yb0.j.a(this.a, ((C0278d) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("CiTest(testExecutionId="), this.a, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class e {
        public final long a;
        public final long b;

        public e(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Connect(duration=");
            sb.append(this.a);
            sb.append(", start=");
            return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class e0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static e0 a(String str) throws JsonParseException {
                String asString;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString2 = asJsonObject.get("id").getAsString();
                    JsonElement jsonElement = asJsonObject.get("referrer");
                    String str2 = null;
                    if (jsonElement == null) {
                        asString = null;
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    String asString3 = asJsonObject.get(ImagesContract.URL).getAsString();
                    JsonElement jsonElement2 = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (jsonElement2 != null) {
                        str2 = jsonElement2.getAsString();
                    }
                    com.amazon.aps.iva.yb0.j.e(asString2, "id");
                    com.amazon.aps.iva.yb0.j.e(asString3, ImagesContract.URL);
                    return new e0(asString2, asString, asString3, str2);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public e0(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e0)) {
                return false;
            }
            e0 e0Var = (e0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, e0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, e0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, e0Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, e0Var.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            int i = 0;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int b = com.amazon.aps.iva.c80.a.b(this.c, (hashCode2 + hashCode) * 31, 31);
            String str2 = this.d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return b + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("View(id=");
            sb.append(this.a);
            sb.append(", referrer=");
            sb.append(this.b);
            sb.append(", url=");
            sb.append(this.c);
            sb.append(", name=");
            return defpackage.b.c(sb, this.d, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class f {
        public final b0 a;
        public final List<o> b;
        public final c c;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static f a(String str) throws JsonParseException {
                String jsonElement;
                c a;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    b0.a aVar = b0.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString, "it");
                    aVar.getClass();
                    b0 a2 = b0.a.a(asString);
                    JsonArray<JsonElement> asJsonArray = asJsonObject.get("interfaces").getAsJsonArray();
                    ArrayList arrayList = new ArrayList(asJsonArray.size());
                    for (JsonElement jsonElement2 : asJsonArray) {
                        o.a aVar2 = o.Companion;
                        String asString2 = jsonElement2.getAsString();
                        com.amazon.aps.iva.yb0.j.e(asString2, "it.asString");
                        aVar2.getClass();
                        arrayList.add(o.a.a(asString2));
                    }
                    JsonElement jsonElement3 = asJsonObject.get("cellular");
                    if (jsonElement3 != null && (jsonElement = jsonElement3.toString()) != null) {
                        a = c.a.a(jsonElement);
                        return new f(a2, arrayList, a);
                    }
                    a = null;
                    return new f(a2, arrayList, a);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(b0 b0Var, List<? extends o> list, c cVar) {
            com.amazon.aps.iva.yb0.j.f(b0Var, "status");
            this.a = b0Var;
            this.b = list;
            this.c = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (this.a == fVar.a && com.amazon.aps.iva.yb0.j.a(this.b, fVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, fVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a2 = defpackage.a.a(this.b, this.a.hashCode() * 31, 31);
            c cVar = this.c;
            if (cVar == null) {
                hashCode = 0;
            } else {
                hashCode = cVar.hashCode();
            }
            return a2 + hashCode;
        }

        public final String toString() {
            return "Connectivity(status=" + this.a + ", interfaces=" + this.b + ", cellular=" + this.c + ")";
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class h {
        public final i a;
        public final String b;
        public final String c;
        public final String d;
        public final long e;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: NumberFormatException -> 0x0084, IllegalStateException -> 0x008f, TryCatch #4 {IllegalStateException -> 0x008f, NumberFormatException -> 0x0084, blocks: (B:2:0x0000, B:9:0x003f, B:13:0x004d, B:17:0x005b, B:21:0x0068, B:20:0x0064, B:16:0x0057, B:12:0x0049, B:5:0x0012, B:24:0x006f, B:25:0x0078, B:27:0x007a, B:28:0x0083), top: B:35:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: NumberFormatException -> 0x0084, IllegalStateException -> 0x008f, TryCatch #4 {IllegalStateException -> 0x008f, NumberFormatException -> 0x0084, blocks: (B:2:0x0000, B:9:0x003f, B:13:0x004d, B:17:0x005b, B:21:0x0068, B:20:0x0064, B:16:0x0057, B:12:0x0049, B:5:0x0012, B:24:0x006f, B:25:0x0078, B:27:0x007a, B:28:0x0083), top: B:35:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[Catch: NumberFormatException -> 0x0084, IllegalStateException -> 0x008f, TryCatch #4 {IllegalStateException -> 0x008f, NumberFormatException -> 0x0084, blocks: (B:2:0x0000, B:9:0x003f, B:13:0x004d, B:17:0x005b, B:21:0x0068, B:20:0x0064, B:16:0x0057, B:12:0x0049, B:5:0x0012, B:24:0x006f, B:25:0x0078, B:27:0x007a, B:28:0x0083), top: B:35:0x0000 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static com.amazon.aps.iva.fr.d.h a(java.lang.String r5) throws com.google.gson.JsonParseException {
                /*
                    com.google.gson.JsonElement r5 = com.google.gson.JsonParser.parseString(r5)     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    com.google.gson.JsonObject r5 = r5.getAsJsonObject()     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    java.lang.String r0 = "session"
                    com.google.gson.JsonElement r0 = r5.get(r0)     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    r1 = 0
                    if (r0 != 0) goto L12
                    goto L18
                L12:
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    if (r0 != 0) goto L1a
                L18:
                    r2 = r1
                    goto L3f
                L1a:
                    com.google.gson.JsonElement r0 = com.google.gson.JsonParser.parseString(r0)     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                    com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                    java.lang.String r2 = "plan"
                    com.google.gson.JsonElement r0 = r0.get(r2)     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                    java.lang.String r0 = r0.getAsString()     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                    com.amazon.aps.iva.fr.d$r$a r2 = com.amazon.aps.iva.fr.d.r.Companion     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                    java.lang.String r3 = "it"
                    com.amazon.aps.iva.yb0.j.e(r0, r3)     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                    r2.getClass()     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                    com.amazon.aps.iva.fr.d$r r0 = com.amazon.aps.iva.fr.d.r.a.a(r0)     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                    com.amazon.aps.iva.fr.d$i r2 = new com.amazon.aps.iva.fr.d$i     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                    r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L6e java.lang.IllegalStateException -> L79
                L3f:
                    java.lang.String r0 = "browser_sdk_version"
                    com.google.gson.JsonElement r0 = r5.get(r0)     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    if (r0 != 0) goto L49
                    r0 = r1
                    goto L4d
                L49:
                    java.lang.String r0 = r0.getAsString()     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                L4d:
                    java.lang.String r3 = "span_id"
                    com.google.gson.JsonElement r3 = r5.get(r3)     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    if (r3 != 0) goto L57
                    r3 = r1
                    goto L5b
                L57:
                    java.lang.String r3 = r3.getAsString()     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                L5b:
                    java.lang.String r4 = "trace_id"
                    com.google.gson.JsonElement r5 = r5.get(r4)     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    if (r5 != 0) goto L64
                    goto L68
                L64:
                    java.lang.String r1 = r5.getAsString()     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                L68:
                    com.amazon.aps.iva.fr.d$h r5 = new com.amazon.aps.iva.fr.d$h     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    r5.<init>(r2, r0, r3, r1)     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    return r5
                L6e:
                    r5 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    java.lang.String r5 = r5.getMessage()     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    r0.<init>(r5)     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    throw r0     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                L79:
                    r5 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    java.lang.String r5 = r5.getMessage()     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    r0.<init>(r5)     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                    throw r0     // Catch: java.lang.NumberFormatException -> L84 java.lang.IllegalStateException -> L8f
                L84:
                    r5 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
                    java.lang.String r5 = r5.getMessage()
                    r0.<init>(r5)
                    throw r0
                L8f:
                    r5 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
                    java.lang.String r5 = r5.getMessage()
                    r0.<init>(r5)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.d.h.a.a(java.lang.String):com.amazon.aps.iva.fr.d$h");
            }
        }

        public h() {
            this((i) null, (String) null, (String) null, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, hVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, hVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, hVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int i = 0;
            i iVar = this.a;
            if (iVar == null) {
                hashCode = 0;
            } else {
                hashCode = iVar.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str2 = this.c;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str3 = this.d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return i4 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dd(session=");
            sb.append(this.a);
            sb.append(", browserSdkVersion=");
            sb.append(this.b);
            sb.append(", spanId=");
            sb.append(this.c);
            sb.append(", traceId=");
            return defpackage.b.c(sb, this.d, ")");
        }

        public /* synthetic */ h(i iVar, String str, String str2, int i) {
            this((i & 1) != 0 ? null : iVar, (String) null, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }

        public h(i iVar, String str, String str2, String str3) {
            this.a = iVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = 2L;
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class i {
        public final r a;

        public i(r rVar) {
            com.amazon.aps.iva.yb0.j.f(rVar, "plan");
            this.a = rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof i) && this.a == ((i) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DdSession(plan=" + this.a + ")";
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class j {
        public final k a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static j a(String str) throws JsonParseException {
                String asString;
                String asString2;
                String asString3;
                String asString4;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString5 = asJsonObject.get("type").getAsString();
                    k.a aVar = k.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString5, "it");
                    aVar.getClass();
                    k a = k.a.a(asString5);
                    JsonElement jsonElement = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (jsonElement == null) {
                        asString = null;
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    JsonElement jsonElement2 = asJsonObject.get("model");
                    if (jsonElement2 == null) {
                        asString2 = null;
                    } else {
                        asString2 = jsonElement2.getAsString();
                    }
                    JsonElement jsonElement3 = asJsonObject.get("brand");
                    if (jsonElement3 == null) {
                        asString3 = null;
                    } else {
                        asString3 = jsonElement3.getAsString();
                    }
                    JsonElement jsonElement4 = asJsonObject.get("architecture");
                    if (jsonElement4 == null) {
                        asString4 = null;
                    } else {
                        asString4 = jsonElement4.getAsString();
                    }
                    return new j(a, asString, asString2, asString3, asString4);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public j(k kVar, String str, String str2, String str3, String str4) {
            com.amazon.aps.iva.yb0.j.f(kVar, "type");
            this.a = kVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (this.a == jVar.a && com.amazon.aps.iva.yb0.j.a(this.b, jVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, jVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, jVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, jVar.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4 = this.a.hashCode() * 31;
            int i = 0;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode4 + hashCode) * 31;
            String str2 = this.c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.e;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return i4 + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Device(type=");
            sb.append(this.a);
            sb.append(", name=");
            sb.append(this.b);
            sb.append(", model=");
            sb.append(this.c);
            sb.append(", brand=");
            sb.append(this.d);
            sb.append(", architecture=");
            return defpackage.b.c(sb, this.e, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public enum k {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static k a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                k[] values = k.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    k kVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(kVar.jsonValue, str)) {
                        return kVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        k(String str) {
            this.jsonValue = str;
        }

        public static final k fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class l {
        public final long a;
        public final long b;

        public l(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (this.a == lVar.a && this.b == lVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dns(duration=");
            sb.append(this.a);
            sb.append(", start=");
            return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class m {
        public final long a;
        public final long b;

        public m(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (this.a == mVar.a && this.b == mVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Download(duration=");
            sb.append(this.a);
            sb.append(", start=");
            return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class n {
        public final long a;
        public final long b;

        public n(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (this.a == nVar.a && this.b == nVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FirstByte(duration=");
            sb.append(this.a);
            sb.append(", start=");
            return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public enum o {
        BLUETOOTH("bluetooth"),
        CELLULAR("cellular"),
        ETHERNET("ethernet"),
        WIFI("wifi"),
        WIMAX("wimax"),
        MIXED("mixed"),
        OTHER("other"),
        UNKNOWN("unknown"),
        NONE("none");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static o a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                o[] values = o.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    o oVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(oVar.jsonValue, str)) {
                        return oVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        o(String str) {
            this.jsonValue = str;
        }

        public static final o fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public enum p {
        POST("POST"),
        GET("GET"),
        HEAD("HEAD"),
        PUT("PUT"),
        DELETE("DELETE"),
        PATCH("PATCH");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static p a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                p[] values = p.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    p pVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(pVar.jsonValue, str)) {
                        return pVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        p(String str) {
            this.jsonValue = str;
        }

        public static final p fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class q {
        public final String a;
        public final String b;
        public final String c;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static q a(String str) throws JsonParseException {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME).getAsString();
                    String asString2 = asJsonObject.get("version").getAsString();
                    String asString3 = asJsonObject.get("version_major").getAsString();
                    com.amazon.aps.iva.yb0.j.e(asString, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    com.amazon.aps.iva.yb0.j.e(asString2, "version");
                    com.amazon.aps.iva.yb0.j.e(asString3, "versionMajor");
                    return new q(asString, asString2, asString3);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public q(String str, String str2, String str3) {
            com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(str2, "version");
            com.amazon.aps.iva.yb0.j.f(str3, "versionMajor");
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, qVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, qVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, qVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Os(name=");
            sb.append(this.a);
            sb.append(", version=");
            sb.append(this.b);
            sb.append(", versionMajor=");
            return defpackage.b.c(sb, this.c, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public enum r {
        PLAN_1(1),
        PLAN_2(2);
        
        public static final a Companion = new a();
        private final Number jsonValue;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static r a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                r[] values = r.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    r rVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(rVar.jsonValue.toString(), str)) {
                        return rVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        r(Number number) {
            this.jsonValue = number;
        }

        public static final r fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class s {
        public final String a;
        public final String b;
        public final t c;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static s a(String str) throws JsonParseException {
                String asString;
                String asString2;
                String asString3;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("domain");
                    t tVar = null;
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
                    JsonElement jsonElement3 = asJsonObject.get("type");
                    if (jsonElement3 != null && (asString3 = jsonElement3.getAsString()) != null) {
                        t.Companion.getClass();
                        tVar = t.a.a(asString3);
                    }
                    return new s(asString, asString2, tVar);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public s() {
            this((String) null, (t) null, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof s)) {
                return false;
            }
            s sVar = (s) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, sVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, sVar.b) && this.c == sVar.c) {
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
            t tVar = this.c;
            if (tVar != null) {
                i = tVar.hashCode();
            }
            return i3 + i;
        }

        public final String toString() {
            return "Provider(domain=" + this.a + ", name=" + this.b + ", type=" + this.c + ")";
        }

        public /* synthetic */ s(String str, t tVar, int i) {
            this((i & 1) != 0 ? null : str, (String) null, (i & 4) != 0 ? null : tVar);
        }

        public s(String str, String str2, t tVar) {
            this.a = str;
            this.b = str2;
            this.c = tVar;
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public enum t {
        AD("ad"),
        ADVERTISING("advertising"),
        ANALYTICS("analytics"),
        CDN("cdn"),
        CONTENT(FirebaseAnalytics.Param.CONTENT),
        CUSTOMER_SUCCESS("customer-success"),
        FIRST_PARTY("first party"),
        HOSTING("hosting"),
        MARKETING("marketing"),
        OTHER("other"),
        SOCIAL("social"),
        TAG_MANAGER("tag-manager"),
        UTILITY("utility"),
        VIDEO("video");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static t a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                t[] values = t.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    t tVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(tVar.jsonValue, str)) {
                        return tVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        t(String str) {
            this.jsonValue = str;
        }

        public static final t fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class u {
        public final long a;
        public final long b;

        public u(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            if (this.a == uVar.a && this.b == uVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Redirect(duration=");
            sb.append(this.a);
            sb.append(", start=");
            return com.amazon.aps.iva.c.b.b(sb, this.b, ")");
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class v {
        public final String a;
        public final y b;
        public final p c;
        public final String d;
        public final Long e;
        public final long f;
        public final Long g;
        public final u h;
        public final l i;
        public final e j;
        public final a0 k;
        public final n l;
        public final m m;
        public final s n;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: NumberFormatException -> 0x026a, IllegalStateException -> 0x0275, TryCatch #12 {IllegalStateException -> 0x0275, NumberFormatException -> 0x026a, blocks: (B:3:0x0004, B:7:0x001b, B:14:0x004e, B:18:0x0069, B:22:0x0084, B:26:0x008f, B:31:0x00b9, B:38:0x00f3, B:45:0x0125, B:52:0x0157, B:59:0x0189, B:66:0x01b7, B:73:0x01cc, B:69:0x01c0, B:72:0x01c8, B:62:0x0192, B:76:0x01e7, B:77:0x01f0, B:79:0x01f2, B:80:0x01fb, B:55:0x0160, B:82:0x01fd, B:83:0x0206, B:85:0x0208, B:86:0x0211, B:48:0x012e, B:88:0x0213, B:89:0x021c, B:91:0x021e, B:92:0x0227, B:41:0x00fc, B:94:0x0229, B:95:0x0232, B:97:0x0234, B:98:0x023d, B:34:0x00c2, B:100:0x023f, B:101:0x0248, B:103:0x024a, B:104:0x0253, B:106:0x0255, B:107:0x025e, B:109:0x0260, B:110:0x0269, B:21:0x007b, B:17:0x0060, B:10:0x003c, B:13:0x0044, B:6:0x0016), top: B:121:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: NumberFormatException -> 0x026a, IllegalStateException -> 0x0275, TryCatch #12 {IllegalStateException -> 0x0275, NumberFormatException -> 0x026a, blocks: (B:3:0x0004, B:7:0x001b, B:14:0x004e, B:18:0x0069, B:22:0x0084, B:26:0x008f, B:31:0x00b9, B:38:0x00f3, B:45:0x0125, B:52:0x0157, B:59:0x0189, B:66:0x01b7, B:73:0x01cc, B:69:0x01c0, B:72:0x01c8, B:62:0x0192, B:76:0x01e7, B:77:0x01f0, B:79:0x01f2, B:80:0x01fb, B:55:0x0160, B:82:0x01fd, B:83:0x0206, B:85:0x0208, B:86:0x0211, B:48:0x012e, B:88:0x0213, B:89:0x021c, B:91:0x021e, B:92:0x0227, B:41:0x00fc, B:94:0x0229, B:95:0x0232, B:97:0x0234, B:98:0x023d, B:34:0x00c2, B:100:0x023f, B:101:0x0248, B:103:0x024a, B:104:0x0253, B:106:0x0255, B:107:0x025e, B:109:0x0260, B:110:0x0269, B:21:0x007b, B:17:0x0060, B:10:0x003c, B:13:0x0044, B:6:0x0016), top: B:121:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00c1 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00c2 A[Catch: NumberFormatException -> 0x026a, IllegalStateException -> 0x0275, TRY_LEAVE, TryCatch #12 {IllegalStateException -> 0x0275, NumberFormatException -> 0x026a, blocks: (B:3:0x0004, B:7:0x001b, B:14:0x004e, B:18:0x0069, B:22:0x0084, B:26:0x008f, B:31:0x00b9, B:38:0x00f3, B:45:0x0125, B:52:0x0157, B:59:0x0189, B:66:0x01b7, B:73:0x01cc, B:69:0x01c0, B:72:0x01c8, B:62:0x0192, B:76:0x01e7, B:77:0x01f0, B:79:0x01f2, B:80:0x01fb, B:55:0x0160, B:82:0x01fd, B:83:0x0206, B:85:0x0208, B:86:0x0211, B:48:0x012e, B:88:0x0213, B:89:0x021c, B:91:0x021e, B:92:0x0227, B:41:0x00fc, B:94:0x0229, B:95:0x0232, B:97:0x0234, B:98:0x023d, B:34:0x00c2, B:100:0x023f, B:101:0x0248, B:103:0x024a, B:104:0x0253, B:106:0x0255, B:107:0x025e, B:109:0x0260, B:110:0x0269, B:21:0x007b, B:17:0x0060, B:10:0x003c, B:13:0x0044, B:6:0x0016), top: B:121:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00fb A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00fc A[Catch: NumberFormatException -> 0x026a, IllegalStateException -> 0x0275, TRY_LEAVE, TryCatch #12 {IllegalStateException -> 0x0275, NumberFormatException -> 0x026a, blocks: (B:3:0x0004, B:7:0x001b, B:14:0x004e, B:18:0x0069, B:22:0x0084, B:26:0x008f, B:31:0x00b9, B:38:0x00f3, B:45:0x0125, B:52:0x0157, B:59:0x0189, B:66:0x01b7, B:73:0x01cc, B:69:0x01c0, B:72:0x01c8, B:62:0x0192, B:76:0x01e7, B:77:0x01f0, B:79:0x01f2, B:80:0x01fb, B:55:0x0160, B:82:0x01fd, B:83:0x0206, B:85:0x0208, B:86:0x0211, B:48:0x012e, B:88:0x0213, B:89:0x021c, B:91:0x021e, B:92:0x0227, B:41:0x00fc, B:94:0x0229, B:95:0x0232, B:97:0x0234, B:98:0x023d, B:34:0x00c2, B:100:0x023f, B:101:0x0248, B:103:0x024a, B:104:0x0253, B:106:0x0255, B:107:0x025e, B:109:0x0260, B:110:0x0269, B:21:0x007b, B:17:0x0060, B:10:0x003c, B:13:0x0044, B:6:0x0016), top: B:121:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x012d A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x012e A[Catch: NumberFormatException -> 0x026a, IllegalStateException -> 0x0275, TRY_LEAVE, TryCatch #12 {IllegalStateException -> 0x0275, NumberFormatException -> 0x026a, blocks: (B:3:0x0004, B:7:0x001b, B:14:0x004e, B:18:0x0069, B:22:0x0084, B:26:0x008f, B:31:0x00b9, B:38:0x00f3, B:45:0x0125, B:52:0x0157, B:59:0x0189, B:66:0x01b7, B:73:0x01cc, B:69:0x01c0, B:72:0x01c8, B:62:0x0192, B:76:0x01e7, B:77:0x01f0, B:79:0x01f2, B:80:0x01fb, B:55:0x0160, B:82:0x01fd, B:83:0x0206, B:85:0x0208, B:86:0x0211, B:48:0x012e, B:88:0x0213, B:89:0x021c, B:91:0x021e, B:92:0x0227, B:41:0x00fc, B:94:0x0229, B:95:0x0232, B:97:0x0234, B:98:0x023d, B:34:0x00c2, B:100:0x023f, B:101:0x0248, B:103:0x024a, B:104:0x0253, B:106:0x0255, B:107:0x025e, B:109:0x0260, B:110:0x0269, B:21:0x007b, B:17:0x0060, B:10:0x003c, B:13:0x0044, B:6:0x0016), top: B:121:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:54:0x015f A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0160 A[Catch: NumberFormatException -> 0x026a, IllegalStateException -> 0x0275, TRY_LEAVE, TryCatch #12 {IllegalStateException -> 0x0275, NumberFormatException -> 0x026a, blocks: (B:3:0x0004, B:7:0x001b, B:14:0x004e, B:18:0x0069, B:22:0x0084, B:26:0x008f, B:31:0x00b9, B:38:0x00f3, B:45:0x0125, B:52:0x0157, B:59:0x0189, B:66:0x01b7, B:73:0x01cc, B:69:0x01c0, B:72:0x01c8, B:62:0x0192, B:76:0x01e7, B:77:0x01f0, B:79:0x01f2, B:80:0x01fb, B:55:0x0160, B:82:0x01fd, B:83:0x0206, B:85:0x0208, B:86:0x0211, B:48:0x012e, B:88:0x0213, B:89:0x021c, B:91:0x021e, B:92:0x0227, B:41:0x00fc, B:94:0x0229, B:95:0x0232, B:97:0x0234, B:98:0x023d, B:34:0x00c2, B:100:0x023f, B:101:0x0248, B:103:0x024a, B:104:0x0253, B:106:0x0255, B:107:0x025e, B:109:0x0260, B:110:0x0269, B:21:0x007b, B:17:0x0060, B:10:0x003c, B:13:0x0044, B:6:0x0016), top: B:121:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0191 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0192 A[Catch: NumberFormatException -> 0x026a, IllegalStateException -> 0x0275, TRY_LEAVE, TryCatch #12 {IllegalStateException -> 0x0275, NumberFormatException -> 0x026a, blocks: (B:3:0x0004, B:7:0x001b, B:14:0x004e, B:18:0x0069, B:22:0x0084, B:26:0x008f, B:31:0x00b9, B:38:0x00f3, B:45:0x0125, B:52:0x0157, B:59:0x0189, B:66:0x01b7, B:73:0x01cc, B:69:0x01c0, B:72:0x01c8, B:62:0x0192, B:76:0x01e7, B:77:0x01f0, B:79:0x01f2, B:80:0x01fb, B:55:0x0160, B:82:0x01fd, B:83:0x0206, B:85:0x0208, B:86:0x0211, B:48:0x012e, B:88:0x0213, B:89:0x021c, B:91:0x021e, B:92:0x0227, B:41:0x00fc, B:94:0x0229, B:95:0x0232, B:97:0x0234, B:98:0x023d, B:34:0x00c2, B:100:0x023f, B:101:0x0248, B:103:0x024a, B:104:0x0253, B:106:0x0255, B:107:0x025e, B:109:0x0260, B:110:0x0269, B:21:0x007b, B:17:0x0060, B:10:0x003c, B:13:0x0044, B:6:0x0016), top: B:121:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x01bf A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x01c0 A[Catch: NumberFormatException -> 0x026a, IllegalStateException -> 0x0275, TryCatch #12 {IllegalStateException -> 0x0275, NumberFormatException -> 0x026a, blocks: (B:3:0x0004, B:7:0x001b, B:14:0x004e, B:18:0x0069, B:22:0x0084, B:26:0x008f, B:31:0x00b9, B:38:0x00f3, B:45:0x0125, B:52:0x0157, B:59:0x0189, B:66:0x01b7, B:73:0x01cc, B:69:0x01c0, B:72:0x01c8, B:62:0x0192, B:76:0x01e7, B:77:0x01f0, B:79:0x01f2, B:80:0x01fb, B:55:0x0160, B:82:0x01fd, B:83:0x0206, B:85:0x0208, B:86:0x0211, B:48:0x012e, B:88:0x0213, B:89:0x021c, B:91:0x021e, B:92:0x0227, B:41:0x00fc, B:94:0x0229, B:95:0x0232, B:97:0x0234, B:98:0x023d, B:34:0x00c2, B:100:0x023f, B:101:0x0248, B:103:0x024a, B:104:0x0253, B:106:0x0255, B:107:0x025e, B:109:0x0260, B:110:0x0269, B:21:0x007b, B:17:0x0060, B:10:0x003c, B:13:0x0044, B:6:0x0016), top: B:121:0x0004 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static com.amazon.aps.iva.fr.d.v a(java.lang.String r21) throws com.google.gson.JsonParseException {
                /*
                    Method dump skipped, instructions count: 640
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.d.v.a.a(java.lang.String):com.amazon.aps.iva.fr.d$v");
            }
        }

        public v(String str, y yVar, p pVar, String str2, Long l, long j, Long l2, u uVar, l lVar, e eVar, a0 a0Var, n nVar, m mVar, s sVar) {
            com.amazon.aps.iva.yb0.j.f(yVar, "type");
            com.amazon.aps.iva.yb0.j.f(str2, ImagesContract.URL);
            this.a = str;
            this.b = yVar;
            this.c = pVar;
            this.d = str2;
            this.e = l;
            this.f = j;
            this.g = l2;
            this.h = uVar;
            this.i = lVar;
            this.j = eVar;
            this.k = a0Var;
            this.l = nVar;
            this.m = mVar;
            this.n = sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, vVar.a) && this.b == vVar.b && this.c == vVar.c && com.amazon.aps.iva.yb0.j.a(this.d, vVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, vVar.e) && this.f == vVar.f && com.amazon.aps.iva.yb0.j.a(this.g, vVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, vVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, vVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, vVar.j) && com.amazon.aps.iva.yb0.j.a(this.k, vVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, vVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, vVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, vVar.n)) {
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
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode11 = (this.b.hashCode() + (hashCode * 31)) * 31;
            p pVar = this.c;
            if (pVar == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = pVar.hashCode();
            }
            int b = com.amazon.aps.iva.c80.a.b(this.d, (hashCode11 + hashCode2) * 31, 31);
            Long l = this.e;
            if (l == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = l.hashCode();
            }
            int a2 = com.amazon.aps.iva.b8.i.a(this.f, (b + hashCode3) * 31, 31);
            Long l2 = this.g;
            if (l2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = l2.hashCode();
            }
            int i2 = (a2 + hashCode4) * 31;
            u uVar = this.h;
            if (uVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = uVar.hashCode();
            }
            int i3 = (i2 + hashCode5) * 31;
            l lVar = this.i;
            if (lVar == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = lVar.hashCode();
            }
            int i4 = (i3 + hashCode6) * 31;
            e eVar = this.j;
            if (eVar == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = eVar.hashCode();
            }
            int i5 = (i4 + hashCode7) * 31;
            a0 a0Var = this.k;
            if (a0Var == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = a0Var.hashCode();
            }
            int i6 = (i5 + hashCode8) * 31;
            n nVar = this.l;
            if (nVar == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = nVar.hashCode();
            }
            int i7 = (i6 + hashCode9) * 31;
            m mVar = this.m;
            if (mVar == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = mVar.hashCode();
            }
            int i8 = (i7 + hashCode10) * 31;
            s sVar = this.n;
            if (sVar != null) {
                i = sVar.hashCode();
            }
            return i8 + i;
        }

        public final String toString() {
            return "Resource(id=" + this.a + ", type=" + this.b + ", method=" + this.c + ", url=" + this.d + ", statusCode=" + this.e + ", duration=" + this.f + ", size=" + this.g + ", redirect=" + this.h + ", dns=" + this.i + ", connect=" + this.j + ", ssl=" + this.k + ", firstByte=" + this.l + ", download=" + this.m + ", provider=" + this.n + ")";
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class w {
        public final String a;
        public final x b;
        public final Boolean c;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static w a(String str) throws JsonParseException {
                Boolean valueOf;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("id").getAsString();
                    String asString2 = asJsonObject.get("type").getAsString();
                    x.a aVar = x.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString2, "it");
                    aVar.getClass();
                    x a = x.a.a(asString2);
                    JsonElement jsonElement = asJsonObject.get("has_replay");
                    if (jsonElement == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(jsonElement.getAsBoolean());
                    }
                    com.amazon.aps.iva.yb0.j.e(asString, "id");
                    return new w(asString, a, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public w(String str, x xVar, Boolean bool) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(xVar, "type");
            this.a = str;
            this.b = xVar;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, wVar.a) && this.b == wVar.b && com.amazon.aps.iva.yb0.j.a(this.c, wVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            Boolean bool = this.c;
            if (bool == null) {
                hashCode = 0;
            } else {
                hashCode = bool.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public final String toString() {
            return "ResourceEventSession(id=" + this.a + ", type=" + this.b + ", hasReplay=" + this.c + ")";
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public enum x {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static x a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                x[] values = x.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    x xVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(xVar.jsonValue, str)) {
                        return xVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        x(String str) {
            this.jsonValue = str;
        }

        public static final x fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public enum y {
        DOCUMENT("document"),
        XHR("xhr"),
        BEACON("beacon"),
        FETCH("fetch"),
        CSS("css"),
        JS("js"),
        IMAGE("image"),
        FONT("font"),
        MEDIA("media"),
        OTHER("other"),
        NATIVE("native");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static y a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                y[] values = y.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    y yVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(yVar.jsonValue, str)) {
                        return yVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        y(String str) {
            this.jsonValue = str;
        }

        public static final y fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public enum z {
        ANDROID(CredentialsData.CREDENTIALS_TYPE_ANDROID),
        IOS(CredentialsData.CREDENTIALS_TYPE_IOS),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static z a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                z[] values = z.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    z zVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(zVar.jsonValue, str)) {
                        return zVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        z(String str) {
            this.jsonValue = str;
        }

        public static final z fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    public d(long j2, b bVar, String str, w wVar, z zVar, e0 e0Var, d0 d0Var, f fVar, c0 c0Var, C0278d c0278d, q qVar, j jVar, h hVar, g gVar, v vVar, a aVar) {
        this.a = j2;
        this.b = bVar;
        this.c = str;
        this.d = wVar;
        this.e = zVar;
        this.f = e0Var;
        this.g = d0Var;
        this.h = fVar;
        this.i = c0Var;
        this.j = c0278d;
        this.k = qVar;
        this.l = jVar;
        this.m = hVar;
        this.n = gVar;
        this.o = vVar;
        this.p = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && com.amazon.aps.iva.yb0.j.a(this.b, dVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, dVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, dVar.d) && this.e == dVar.e && com.amazon.aps.iva.yb0.j.a(this.f, dVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, dVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, dVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, dVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, dVar.j) && com.amazon.aps.iva.yb0.j.a(this.k, dVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, dVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, dVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, dVar.n) && com.amazon.aps.iva.yb0.j.a(this.o, dVar.o) && com.amazon.aps.iva.yb0.j.a(this.p, dVar.p)) {
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
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10 = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        int i2 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode11 = (this.d.hashCode() + ((hashCode10 + hashCode) * 31)) * 31;
        z zVar = this.e;
        if (zVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = zVar.hashCode();
        }
        int hashCode12 = (this.f.hashCode() + ((hashCode11 + hashCode2) * 31)) * 31;
        d0 d0Var = this.g;
        if (d0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d0Var.hashCode();
        }
        int i3 = (hashCode12 + hashCode3) * 31;
        f fVar = this.h;
        if (fVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fVar.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        c0 c0Var = this.i;
        if (c0Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c0Var.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        C0278d c0278d = this.j;
        if (c0278d == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = c0278d.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        q qVar = this.k;
        if (qVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = qVar.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        j jVar = this.l;
        if (jVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = jVar.hashCode();
        }
        int hashCode13 = (this.m.hashCode() + ((i7 + hashCode8) * 31)) * 31;
        g gVar = this.n;
        if (gVar == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = gVar.hashCode();
        }
        int hashCode14 = (this.o.hashCode() + ((hashCode13 + hashCode9) * 31)) * 31;
        a aVar = this.p;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode14 + i2;
    }

    public final String toString() {
        return "ResourceEvent(date=" + this.a + ", application=" + this.b + ", service=" + this.c + ", session=" + this.d + ", source=" + this.e + ", view=" + this.f + ", usr=" + this.g + ", connectivity=" + this.h + ", synthetics=" + this.i + ", ciTest=" + this.j + ", os=" + this.k + ", device=" + this.l + ", dd=" + this.m + ", context=" + this.n + ", resource=" + this.o + ", action=" + this.p + ")";
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class g {
        public final Map<String, Object> a;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static g a(String str) throws JsonParseException {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                        String key = entry.getKey();
                        com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new g(linkedHashMap);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public g(Map<String, ? extends Object> map) {
            com.amazon.aps.iva.yb0.j.f(map, "additionalProperties");
            this.a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof g) && com.amazon.aps.iva.yb0.j.a(this.a, ((g) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Context(additionalProperties=" + this.a + ")";
        }

        public g() {
            this(com.amazon.aps.iva.lb0.a0.b);
        }
    }

    /* compiled from: ResourceEvent.kt */
    /* loaded from: classes2.dex */
    public static final class d0 {
        public static final String[] e = {"id", AppMeasurementSdk.ConditionalUserProperty.NAME, Scopes.EMAIL};
        public final String a;
        public final String b;
        public final String c;
        public final Map<String, Object> d;

        /* compiled from: ResourceEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static d0 a(String str) throws JsonParseException {
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
                        if (!com.amazon.aps.iva.lb0.o.N(d0.e, entry.getKey())) {
                            String key = entry.getKey();
                            com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new d0(asString, asString2, str2, linkedHashMap);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public d0(String str, String str2, String str3, Map<String, ? extends Object> map) {
            com.amazon.aps.iva.yb0.j.f(map, "additionalProperties");
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, d0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, d0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, d0Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, d0Var.d)) {
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
            return "Usr(id=" + this.a + ", name=" + this.b + ", email=" + this.c + ", additionalProperties=" + this.d + ")";
        }

        public d0() {
            this(null, null, null, com.amazon.aps.iva.lb0.a0.b);
        }
    }
}
