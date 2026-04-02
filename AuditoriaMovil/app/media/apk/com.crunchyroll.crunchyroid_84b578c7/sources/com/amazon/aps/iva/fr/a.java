package com.amazon.aps.iva.fr;

import com.amazon.aps.iva.lb0.a0;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
/* compiled from: ActionEvent.kt */
/* loaded from: classes2.dex */
public final class a {
    public final long a;
    public final e b;
    public final String c;
    public final b d;
    public final u e;
    public final z f;
    public final y g;
    public final h h;
    public final w i;
    public final g j;
    public final r k;
    public final m l;
    public final k m;
    public final i n;
    public final C0257a o;

    /* compiled from: ActionEvent.kt */
    /* renamed from: com.amazon.aps.iva.fr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0257a {
        public final d a;
        public final String b;
        public final Long c;
        public final x d;
        public final o e;
        public final j f;
        public final q g;
        public final t h;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0258a {
            /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: NumberFormatException -> 0x0182, IllegalStateException -> 0x018d, TRY_LEAVE, TryCatch #10 {IllegalStateException -> 0x018d, NumberFormatException -> 0x0182, blocks: (B:2:0x0000, B:6:0x0030, B:10:0x0043, B:19:0x006f, B:23:0x007a, B:28:0x0098, B:36:0x00bf, B:44:0x00e6, B:52:0x010d, B:47:0x00ef, B:55:0x0115, B:56:0x011e, B:58:0x0120, B:59:0x0129, B:39:0x00c8, B:61:0x012b, B:62:0x0134, B:64:0x0136, B:65:0x013f, B:31:0x00a1, B:67:0x0141, B:68:0x014a, B:70:0x014c, B:71:0x0155, B:73:0x0157, B:74:0x0160, B:76:0x0162, B:77:0x016b, B:13:0x004c, B:79:0x016d, B:80:0x0176, B:82:0x0178, B:83:0x0181, B:9:0x003a, B:5:0x002b, B:50:0x00f7, B:26:0x0082, B:42:0x00d0, B:17:0x0056, B:34:0x00a9), top: B:94:0x0000, inners: #12, #11, #9, #8, #7 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00c7 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00c8 A[Catch: NumberFormatException -> 0x0182, IllegalStateException -> 0x018d, TRY_LEAVE, TryCatch #10 {IllegalStateException -> 0x018d, NumberFormatException -> 0x0182, blocks: (B:2:0x0000, B:6:0x0030, B:10:0x0043, B:19:0x006f, B:23:0x007a, B:28:0x0098, B:36:0x00bf, B:44:0x00e6, B:52:0x010d, B:47:0x00ef, B:55:0x0115, B:56:0x011e, B:58:0x0120, B:59:0x0129, B:39:0x00c8, B:61:0x012b, B:62:0x0134, B:64:0x0136, B:65:0x013f, B:31:0x00a1, B:67:0x0141, B:68:0x014a, B:70:0x014c, B:71:0x0155, B:73:0x0157, B:74:0x0160, B:76:0x0162, B:77:0x016b, B:13:0x004c, B:79:0x016d, B:80:0x0176, B:82:0x0178, B:83:0x0181, B:9:0x003a, B:5:0x002b, B:50:0x00f7, B:26:0x0082, B:42:0x00d0, B:17:0x0056, B:34:0x00a9), top: B:94:0x0000, inners: #12, #11, #9, #8, #7 }] */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00ee A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00ef A[Catch: NumberFormatException -> 0x0182, IllegalStateException -> 0x018d, TRY_LEAVE, TryCatch #10 {IllegalStateException -> 0x018d, NumberFormatException -> 0x0182, blocks: (B:2:0x0000, B:6:0x0030, B:10:0x0043, B:19:0x006f, B:23:0x007a, B:28:0x0098, B:36:0x00bf, B:44:0x00e6, B:52:0x010d, B:47:0x00ef, B:55:0x0115, B:56:0x011e, B:58:0x0120, B:59:0x0129, B:39:0x00c8, B:61:0x012b, B:62:0x0134, B:64:0x0136, B:65:0x013f, B:31:0x00a1, B:67:0x0141, B:68:0x014a, B:70:0x014c, B:71:0x0155, B:73:0x0157, B:74:0x0160, B:76:0x0162, B:77:0x016b, B:13:0x004c, B:79:0x016d, B:80:0x0176, B:82:0x0178, B:83:0x0181, B:9:0x003a, B:5:0x002b, B:50:0x00f7, B:26:0x0082, B:42:0x00d0, B:17:0x0056, B:34:0x00a9), top: B:94:0x0000, inners: #12, #11, #9, #8, #7 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static com.amazon.aps.iva.fr.a.C0257a a(java.lang.String r12) throws com.google.gson.JsonParseException {
                /*
                    Method dump skipped, instructions count: 408
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.a.C0257a.C0258a.a(java.lang.String):com.amazon.aps.iva.fr.a$a");
            }
        }

        public C0257a(d dVar, String str, Long l, x xVar, o oVar, j jVar, q qVar, t tVar) {
            com.amazon.aps.iva.yb0.j.f(dVar, "type");
            this.a = dVar;
            this.b = str;
            this.c = l;
            this.d = xVar;
            this.e = oVar;
            this.f = jVar;
            this.g = qVar;
            this.h = tVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0257a)) {
                return false;
            }
            C0257a c0257a = (C0257a) obj;
            if (this.a == c0257a.a && com.amazon.aps.iva.yb0.j.a(this.b, c0257a.b) && com.amazon.aps.iva.yb0.j.a(this.c, c0257a.c) && com.amazon.aps.iva.yb0.j.a(this.d, c0257a.d) && com.amazon.aps.iva.yb0.j.a(this.e, c0257a.e) && com.amazon.aps.iva.yb0.j.a(this.f, c0257a.f) && com.amazon.aps.iva.yb0.j.a(this.g, c0257a.g) && com.amazon.aps.iva.yb0.j.a(this.h, c0257a.h)) {
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
            int hashCode7 = this.a.hashCode() * 31;
            int i = 0;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode7 + hashCode) * 31;
            Long l = this.c;
            if (l == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = l.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            x xVar = this.d;
            if (xVar == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = xVar.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            o oVar = this.e;
            if (oVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = oVar.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            j jVar = this.f;
            if (jVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = jVar.hashCode();
            }
            int i6 = (i5 + hashCode5) * 31;
            q qVar = this.g;
            if (qVar == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = qVar.hashCode();
            }
            int i7 = (i6 + hashCode6) * 31;
            t tVar = this.h;
            if (tVar != null) {
                i = tVar.hashCode();
            }
            return i7 + i;
        }

        public final String toString() {
            return "Action(type=" + this.a + ", id=" + this.b + ", loadingTime=" + this.c + ", target=" + this.d + ", error=" + this.e + ", crash=" + this.f + ", longTask=" + this.g + ", resource=" + this.h + ")";
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;
        public final c b;
        public final Boolean c;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0259a {
            public static b a(String str) throws JsonParseException {
                Boolean valueOf;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("id").getAsString();
                    String asString2 = asJsonObject.get("type").getAsString();
                    c.C0260a c0260a = c.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString2, "it");
                    c0260a.getClass();
                    c a = c.C0260a.a(asString2);
                    JsonElement jsonElement = asJsonObject.get("has_replay");
                    if (jsonElement == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(jsonElement.getAsBoolean());
                    }
                    com.amazon.aps.iva.yb0.j.e(asString, "id");
                    return new b(asString, a, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public b(String str, c cVar, Boolean bool) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(cVar, "type");
            this.a = str;
            this.b = cVar;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, bVar.a) && this.b == bVar.b && com.amazon.aps.iva.yb0.j.a(this.c, bVar.c)) {
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
            return "ActionEventSession(id=" + this.a + ", type=" + this.b + ", hasReplay=" + this.c + ")";
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public enum c {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");
        
        public static final C0260a Companion = new C0260a();
        private final String jsonValue;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0260a {
            public static c a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                c[] values = c.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    c cVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(cVar.jsonValue, str)) {
                        return cVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        c(String str) {
            this.jsonValue = str;
        }

        public static final c fromJson(String str) {
            Companion.getClass();
            return C0260a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public enum d {
        CUSTOM("custom"),
        CLICK("click"),
        TAP("tap"),
        SCROLL("scroll"),
        SWIPE("swipe"),
        APPLICATION_START("application_start"),
        BACK("back");
        
        public static final C0261a Companion = new C0261a();
        private final String jsonValue;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0261a {
            public static d a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                d[] values = d.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    d dVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(dVar.jsonValue, str)) {
                        return dVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        d(String str) {
            this.jsonValue = str;
        }

        public static final d fromJson(String str) {
            Companion.getClass();
            return C0261a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class e {
        public final String a;

        public e(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && com.amazon.aps.iva.yb0.j.a(this.a, ((e) obj).a)) {
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

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class f {
        public final String a;
        public final String b;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0262a {
            public static f a(String str) throws JsonParseException {
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
                    return new f(asString, str2);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public f() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, fVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, fVar.b)) {
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

        public f(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class g {
        public final String a;

        public g(String str) {
            this.a = str;
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
            return defpackage.b.c(new StringBuilder("CiTest(testExecutionId="), this.a, ")");
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class h {
        public final v a;
        public final List<p> b;
        public final f c;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$h$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0263a {
            public static h a(String str) throws JsonParseException {
                String jsonElement;
                f a;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    v.C0272a c0272a = v.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString, "it");
                    c0272a.getClass();
                    v a2 = v.C0272a.a(asString);
                    JsonArray<JsonElement> asJsonArray = asJsonObject.get("interfaces").getAsJsonArray();
                    ArrayList arrayList = new ArrayList(asJsonArray.size());
                    for (JsonElement jsonElement2 : asJsonArray) {
                        p.C0268a c0268a = p.Companion;
                        String asString2 = jsonElement2.getAsString();
                        com.amazon.aps.iva.yb0.j.e(asString2, "it.asString");
                        c0268a.getClass();
                        arrayList.add(p.C0268a.a(asString2));
                    }
                    JsonElement jsonElement3 = asJsonObject.get("cellular");
                    if (jsonElement3 != null && (jsonElement = jsonElement3.toString()) != null) {
                        a = f.C0262a.a(jsonElement);
                        return new h(a2, arrayList, a);
                    }
                    a = null;
                    return new h(a2, arrayList, a);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public h(v vVar, ArrayList arrayList, f fVar) {
            com.amazon.aps.iva.yb0.j.f(vVar, "status");
            this.a = vVar;
            this.b = arrayList;
            this.c = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (this.a == hVar.a && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, hVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a = defpackage.a.a(this.b, this.a.hashCode() * 31, 31);
            f fVar = this.c;
            if (fVar == null) {
                hashCode = 0;
            } else {
                hashCode = fVar.hashCode();
            }
            return a + hashCode;
        }

        public final String toString() {
            return "Connectivity(status=" + this.a + ", interfaces=" + this.b + ", cellular=" + this.c + ")";
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class j {
        public final long a;

        public j(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof j) && this.a == ((j) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Crash(count="), this.a, ")");
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class k {
        public final l a;
        public final String b;
        public final long c;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$k$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0265a {
            /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[Catch: NumberFormatException -> 0x0068, IllegalStateException -> 0x0073, TryCatch #4 {IllegalStateException -> 0x0073, NumberFormatException -> 0x0068, blocks: (B:2:0x0000, B:9:0x003f, B:13:0x004c, B:12:0x0048, B:5:0x0012, B:16:0x0053, B:17:0x005c, B:19:0x005e, B:20:0x0067, B:8:0x001a), top: B:27:0x0000, inners: #3 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static com.amazon.aps.iva.fr.a.k a(java.lang.String r4) throws com.google.gson.JsonParseException {
                /*
                    com.google.gson.JsonElement r4 = com.google.gson.JsonParser.parseString(r4)     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    com.google.gson.JsonObject r4 = r4.getAsJsonObject()     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    java.lang.String r0 = "session"
                    com.google.gson.JsonElement r0 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    r1 = 0
                    if (r0 != 0) goto L12
                    goto L18
                L12:
                    java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    if (r0 != 0) goto L1a
                L18:
                    r2 = r1
                    goto L3f
                L1a:
                    com.google.gson.JsonElement r0 = com.google.gson.JsonParser.parseString(r0)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    com.google.gson.JsonObject r0 = r0.getAsJsonObject()     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    java.lang.String r2 = "plan"
                    com.google.gson.JsonElement r0 = r0.get(r2)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    java.lang.String r0 = r0.getAsString()     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    com.amazon.aps.iva.fr.a$s$a r2 = com.amazon.aps.iva.fr.a.s.Companion     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    java.lang.String r3 = "it"
                    com.amazon.aps.iva.yb0.j.e(r0, r3)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    r2.getClass()     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    com.amazon.aps.iva.fr.a$s r0 = com.amazon.aps.iva.fr.a.s.C0270a.a(r0)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    com.amazon.aps.iva.fr.a$l r2 = new com.amazon.aps.iva.fr.a$l     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                L3f:
                    java.lang.String r0 = "browser_sdk_version"
                    com.google.gson.JsonElement r4 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    if (r4 != 0) goto L48
                    goto L4c
                L48:
                    java.lang.String r1 = r4.getAsString()     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                L4c:
                    com.amazon.aps.iva.fr.a$k r4 = new com.amazon.aps.iva.fr.a$k     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    r4.<init>(r2, r1)     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    return r4
                L52:
                    r4 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    java.lang.String r4 = r4.getMessage()     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    r0.<init>(r4)     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    throw r0     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                L5d:
                    r4 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    java.lang.String r4 = r4.getMessage()     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    r0.<init>(r4)     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    throw r0     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                L68:
                    r4 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
                    java.lang.String r4 = r4.getMessage()
                    r0.<init>(r4)
                    throw r0
                L73:
                    r4 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
                    java.lang.String r4 = r4.getMessage()
                    r0.<init>(r4)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.a.k.C0265a.a(java.lang.String):com.amazon.aps.iva.fr.a$k");
            }
        }

        public k() {
            this((l) null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, kVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, kVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            l lVar = this.a;
            if (lVar == null) {
                hashCode = 0;
            } else {
                hashCode = lVar.hashCode();
            }
            int i2 = hashCode * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            return "Dd(session=" + this.a + ", browserSdkVersion=" + this.b + ")";
        }

        public /* synthetic */ k(l lVar, int i) {
            this((i & 1) != 0 ? null : lVar, (String) null);
        }

        public k(l lVar, String str) {
            this.a = lVar;
            this.b = str;
            this.c = 2L;
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class l {
        public final s a;

        public l(s sVar) {
            com.amazon.aps.iva.yb0.j.f(sVar, "plan");
            this.a = sVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof l) && this.a == ((l) obj).a) {
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

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class m {
        public final n a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$m$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0266a {
            public static m a(String str) throws JsonParseException {
                String asString;
                String asString2;
                String asString3;
                String asString4;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString5 = asJsonObject.get("type").getAsString();
                    n.C0267a c0267a = n.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString5, "it");
                    c0267a.getClass();
                    n a = n.C0267a.a(asString5);
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
                    return new m(a, asString, asString2, asString3, asString4);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public m(n nVar, String str, String str2, String str3, String str4) {
            com.amazon.aps.iva.yb0.j.f(nVar, "type");
            this.a = nVar;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (this.a == mVar.a && com.amazon.aps.iva.yb0.j.a(this.b, mVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, mVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, mVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, mVar.e)) {
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

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public enum n {
        MOBILE("mobile"),
        DESKTOP("desktop"),
        TABLET("tablet"),
        TV("tv"),
        GAMING_CONSOLE("gaming_console"),
        BOT("bot"),
        OTHER("other");
        
        public static final C0267a Companion = new C0267a();
        private final String jsonValue;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$n$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0267a {
            public static n a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                n[] values = n.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    n nVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(nVar.jsonValue, str)) {
                        return nVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        n(String str) {
            this.jsonValue = str;
        }

        public static final n fromJson(String str) {
            Companion.getClass();
            return C0267a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class o {
        public final long a;

        public o(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof o) && this.a == ((o) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Error(count="), this.a, ")");
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public enum p {
        BLUETOOTH("bluetooth"),
        CELLULAR("cellular"),
        ETHERNET("ethernet"),
        WIFI("wifi"),
        WIMAX("wimax"),
        MIXED("mixed"),
        OTHER("other"),
        UNKNOWN("unknown"),
        NONE("none");
        
        public static final C0268a Companion = new C0268a();
        private final String jsonValue;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$p$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0268a {
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
            return C0268a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class q {
        public final long a;

        public q(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof q) && this.a == ((q) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("LongTask(count="), this.a, ")");
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class r {
        public final String a;
        public final String b;
        public final String c;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$r$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0269a {
            public static r a(String str) throws JsonParseException {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME).getAsString();
                    String asString2 = asJsonObject.get("version").getAsString();
                    String asString3 = asJsonObject.get("version_major").getAsString();
                    com.amazon.aps.iva.yb0.j.e(asString, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    com.amazon.aps.iva.yb0.j.e(asString2, "version");
                    com.amazon.aps.iva.yb0.j.e(asString3, "versionMajor");
                    return new r(asString, asString2, asString3);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public r(String str, String str2, String str3) {
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
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, rVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, rVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, rVar.c)) {
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

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public enum s {
        PLAN_1(1),
        PLAN_2(2);
        
        public static final C0270a Companion = new C0270a();
        private final Number jsonValue;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$s$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0270a {
            public static s a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                s[] values = s.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    s sVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(sVar.jsonValue.toString(), str)) {
                        return sVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        s(Number number) {
            this.jsonValue = number;
        }

        public static final s fromJson(String str) {
            Companion.getClass();
            return C0270a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class t {
        public final long a;

        public t(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof t) && this.a == ((t) obj).a) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Resource(count="), this.a, ")");
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public enum u {
        ANDROID(CredentialsData.CREDENTIALS_TYPE_ANDROID),
        IOS(CredentialsData.CREDENTIALS_TYPE_IOS),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native");
        
        public static final C0271a Companion = new C0271a();
        private final String jsonValue;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$u$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0271a {
            public static u a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                u[] values = u.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    u uVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(uVar.jsonValue, str)) {
                        return uVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        u(String str) {
            this.jsonValue = str;
        }

        public static final u fromJson(String str) {
            Companion.getClass();
            return C0271a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public enum v {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");
        
        public static final C0272a Companion = new C0272a();
        private final String jsonValue;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$v$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0272a {
            public static v a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                v[] values = v.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    v vVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(vVar.jsonValue, str)) {
                        return vVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        v(String str) {
            this.jsonValue = str;
        }

        public static final v fromJson(String str) {
            Companion.getClass();
            return C0272a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class w {
        public final String a;
        public final String b;
        public final Boolean c;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$w$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0273a {
            public static w a(String str) throws JsonParseException {
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
                    return new w(asString, asString2, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public w(String str, String str2, Boolean bool) {
            this.a = str;
            this.b = str2;
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
            if (com.amazon.aps.iva.yb0.j.a(this.a, wVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, wVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, wVar.c)) {
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

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class x {
        public final String a;

        public x(String str) {
            com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof x) && com.amazon.aps.iva.yb0.j.a(this.a, ((x) obj).a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("Target(name="), this.a, ")");
        }
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class z {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Boolean e;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$z$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0275a {
            public static z a(String str) throws JsonParseException {
                String asString;
                String asString2;
                Boolean valueOf;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString3 = asJsonObject.get("id").getAsString();
                    JsonElement jsonElement = asJsonObject.get("referrer");
                    if (jsonElement == null) {
                        asString = null;
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    String asString4 = asJsonObject.get(ImagesContract.URL).getAsString();
                    JsonElement jsonElement2 = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (jsonElement2 == null) {
                        asString2 = null;
                    } else {
                        asString2 = jsonElement2.getAsString();
                    }
                    JsonElement jsonElement3 = asJsonObject.get("in_foreground");
                    if (jsonElement3 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(jsonElement3.getAsBoolean());
                    }
                    com.amazon.aps.iva.yb0.j.e(asString3, "id");
                    com.amazon.aps.iva.yb0.j.e(asString4, ImagesContract.URL);
                    return new z(asString3, asString, asString4, asString2, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public /* synthetic */ z(String str, String str2, String str3) {
            this(str, null, str2, str3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof z)) {
                return false;
            }
            z zVar = (z) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, zVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, zVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, zVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, zVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, zVar.e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.a.hashCode() * 31;
            int i = 0;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int b = com.amazon.aps.iva.c80.a.b(this.c, (hashCode3 + hashCode) * 31, 31);
            String str2 = this.d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i2 = (b + hashCode2) * 31;
            Boolean bool = this.e;
            if (bool != null) {
                i = bool.hashCode();
            }
            return i2 + i;
        }

        public final String toString() {
            return "View(id=" + this.a + ", referrer=" + this.b + ", url=" + this.c + ", name=" + this.d + ", inForeground=" + this.e + ")";
        }

        public z(String str, String str2, String str3, String str4, Boolean bool) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bool;
        }
    }

    public /* synthetic */ a(long j2, e eVar, b bVar, u uVar, z zVar, y yVar, r rVar, m mVar, k kVar, i iVar, C0257a c0257a) {
        this(j2, eVar, null, bVar, uVar, zVar, yVar, null, null, null, rVar, mVar, kVar, iVar, c0257a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d) && this.e == aVar.e && com.amazon.aps.iva.yb0.j.a(this.f, aVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, aVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, aVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, aVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, aVar.j) && com.amazon.aps.iva.yb0.j.a(this.k, aVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, aVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, aVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, aVar.n) && com.amazon.aps.iva.yb0.j.a(this.o, aVar.o)) {
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
        int hashCode9 = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        int i2 = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode10 = (this.d.hashCode() + ((hashCode9 + hashCode) * 31)) * 31;
        u uVar = this.e;
        if (uVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = uVar.hashCode();
        }
        int hashCode11 = (this.f.hashCode() + ((hashCode10 + hashCode2) * 31)) * 31;
        y yVar = this.g;
        if (yVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = yVar.hashCode();
        }
        int i3 = (hashCode11 + hashCode3) * 31;
        h hVar = this.h;
        if (hVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = hVar.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        w wVar = this.i;
        if (wVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = wVar.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        g gVar = this.j;
        if (gVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = gVar.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        r rVar = this.k;
        if (rVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = rVar.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        m mVar = this.l;
        if (mVar == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = mVar.hashCode();
        }
        int hashCode12 = (this.m.hashCode() + ((i7 + hashCode8) * 31)) * 31;
        i iVar = this.n;
        if (iVar != null) {
            i2 = iVar.hashCode();
        }
        return this.o.hashCode() + ((hashCode12 + i2) * 31);
    }

    public final String toString() {
        return "ActionEvent(date=" + this.a + ", application=" + this.b + ", service=" + this.c + ", session=" + this.d + ", source=" + this.e + ", view=" + this.f + ", usr=" + this.g + ", connectivity=" + this.h + ", synthetics=" + this.i + ", ciTest=" + this.j + ", os=" + this.k + ", device=" + this.l + ", dd=" + this.m + ", context=" + this.n + ", action=" + this.o + ")";
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class i {
        public final Map<String, Object> a;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$i$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0264a {
            public static i a(String str) throws JsonParseException {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                        String key = entry.getKey();
                        com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                        linkedHashMap.put(key, entry.getValue());
                    }
                    return new i(linkedHashMap);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public i(Map<String, ? extends Object> map) {
            com.amazon.aps.iva.yb0.j.f(map, "additionalProperties");
            this.a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof i) && com.amazon.aps.iva.yb0.j.a(this.a, ((i) obj).a)) {
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

        public i() {
            this(a0.b);
        }
    }

    public a(long j2, e eVar, String str, b bVar, u uVar, z zVar, y yVar, h hVar, w wVar, g gVar, r rVar, m mVar, k kVar, i iVar, C0257a c0257a) {
        this.a = j2;
        this.b = eVar;
        this.c = str;
        this.d = bVar;
        this.e = uVar;
        this.f = zVar;
        this.g = yVar;
        this.h = hVar;
        this.i = wVar;
        this.j = gVar;
        this.k = rVar;
        this.l = mVar;
        this.m = kVar;
        this.n = iVar;
        this.o = c0257a;
    }

    /* compiled from: ActionEvent.kt */
    /* loaded from: classes2.dex */
    public static final class y {
        public static final String[] e = {"id", AppMeasurementSdk.ConditionalUserProperty.NAME, Scopes.EMAIL};
        public final String a;
        public final String b;
        public final String c;
        public final Map<String, Object> d;

        /* compiled from: ActionEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.a$y$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0274a {
            public static y a(String str) throws JsonParseException {
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
                        if (!com.amazon.aps.iva.lb0.o.N(y.e, entry.getKey())) {
                            String key = entry.getKey();
                            com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new y(asString, asString2, str2, linkedHashMap);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public y(String str, String str2, String str3, Map<String, ? extends Object> map) {
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
            if (!(obj instanceof y)) {
                return false;
            }
            y yVar = (y) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, yVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, yVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, yVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, yVar.d)) {
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

        public y() {
            this(null, null, null, a0.b);
        }
    }
}
