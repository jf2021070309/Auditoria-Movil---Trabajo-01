package com.amazon.aps.iva.fr;

import com.google.android.gms.ads.AdRequest;
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
/* compiled from: ErrorEvent.kt */
/* loaded from: classes2.dex */
public final class b {
    public final long a;
    public final C0276b b;
    public final String c;
    public final m d;
    public final o e;
    public final c0 f;
    public final b0 g;
    public final f h;
    public final a0 i;
    public final d j;
    public final t k;
    public final j l;
    public final h m;
    public final g n;
    public final l o;
    public final a p;

    /* compiled from: ErrorEvent.kt */
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class a0 {
        public final String a;
        public final String b;
        public final Boolean c;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static a0 a(String str) throws JsonParseException {
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
                    return new a0(asString, asString2, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public a0(String str, String str2, Boolean bool) {
            this.a = str;
            this.b = str2;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a0)) {
                return false;
            }
            a0 a0Var = (a0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, a0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, a0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, a0Var.c)) {
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

    /* compiled from: ErrorEvent.kt */
    /* renamed from: com.amazon.aps.iva.fr.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0276b {
        public final String a;

        public C0276b(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0276b) && com.amazon.aps.iva.yb0.j.a(this.a, ((C0276b) obj).a)) {
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public final String a;
        public final String b;

        /* compiled from: ErrorEvent.kt */
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class c0 {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final Boolean e;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static c0 a(String str) throws JsonParseException {
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
                    return new c0(asString3, asString, asString4, asString2, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public /* synthetic */ c0(String str, String str2, String str3, String str4, int i) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (Boolean) null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, c0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, c0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, c0Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, c0Var.d) && com.amazon.aps.iva.yb0.j.a(this.e, c0Var.e)) {
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

        public c0(String str, String str2, String str3, String str4, Boolean bool) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(str3, ImagesContract.URL);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bool;
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class d {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && com.amazon.aps.iva.yb0.j.a(this.a, ((d) obj).a)) {
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class e {
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[Catch: NumberFormatException -> 0x01d5, IllegalStateException -> 0x01e0, TryCatch #7 {IllegalStateException -> 0x01e0, NumberFormatException -> 0x01d5, blocks: (B:3:0x0004, B:5:0x003b, B:9:0x004a, B:16:0x0076, B:23:0x009d, B:30:0x00b3, B:37:0x00c9, B:44:0x00f6, B:51:0x010e, B:58:0x0126, B:65:0x014f, B:73:0x018c, B:68:0x0169, B:76:0x0194, B:77:0x019d, B:79:0x019f, B:80:0x01a8, B:61:0x0140, B:64:0x0149, B:54:0x0117, B:57:0x0120, B:47:0x00ff, B:50:0x0108, B:40:0x00d2, B:82:0x01aa, B:83:0x01b3, B:85:0x01b5, B:86:0x01be, B:33:0x00bc, B:36:0x00c4, B:26:0x00a6, B:29:0x00ae, B:19:0x0090, B:22:0x0098, B:12:0x0064, B:15:0x006c, B:8:0x0045, B:88:0x01c0, B:89:0x01c9, B:91:0x01cb, B:92:0x01d4, B:71:0x0172, B:43:0x00da, B:4:0x0023), top: B:101:0x0004, inners: #8, #6, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bc A[Catch: NumberFormatException -> 0x01d5, IllegalStateException -> 0x01e0, TryCatch #7 {IllegalStateException -> 0x01e0, NumberFormatException -> 0x01d5, blocks: (B:3:0x0004, B:5:0x003b, B:9:0x004a, B:16:0x0076, B:23:0x009d, B:30:0x00b3, B:37:0x00c9, B:44:0x00f6, B:51:0x010e, B:58:0x0126, B:65:0x014f, B:73:0x018c, B:68:0x0169, B:76:0x0194, B:77:0x019d, B:79:0x019f, B:80:0x01a8, B:61:0x0140, B:64:0x0149, B:54:0x0117, B:57:0x0120, B:47:0x00ff, B:50:0x0108, B:40:0x00d2, B:82:0x01aa, B:83:0x01b3, B:85:0x01b5, B:86:0x01be, B:33:0x00bc, B:36:0x00c4, B:26:0x00a6, B:29:0x00ae, B:19:0x0090, B:22:0x0098, B:12:0x0064, B:15:0x006c, B:8:0x0045, B:88:0x01c0, B:89:0x01c9, B:91:0x01cb, B:92:0x01d4, B:71:0x0172, B:43:0x00da, B:4:0x0023), top: B:101:0x0004, inners: #8, #6, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d2 A[Catch: NumberFormatException -> 0x01d5, IllegalStateException -> 0x01e0, TRY_LEAVE, TryCatch #7 {IllegalStateException -> 0x01e0, NumberFormatException -> 0x01d5, blocks: (B:3:0x0004, B:5:0x003b, B:9:0x004a, B:16:0x0076, B:23:0x009d, B:30:0x00b3, B:37:0x00c9, B:44:0x00f6, B:51:0x010e, B:58:0x0126, B:65:0x014f, B:73:0x018c, B:68:0x0169, B:76:0x0194, B:77:0x019d, B:79:0x019f, B:80:0x01a8, B:61:0x0140, B:64:0x0149, B:54:0x0117, B:57:0x0120, B:47:0x00ff, B:50:0x0108, B:40:0x00d2, B:82:0x01aa, B:83:0x01b3, B:85:0x01b5, B:86:0x01be, B:33:0x00bc, B:36:0x00c4, B:26:0x00a6, B:29:0x00ae, B:19:0x0090, B:22:0x0098, B:12:0x0064, B:15:0x006c, B:8:0x0045, B:88:0x01c0, B:89:0x01c9, B:91:0x01cb, B:92:0x01d4, B:71:0x0172, B:43:0x00da, B:4:0x0023), top: B:101:0x0004, inners: #8, #6, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fe A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ff A[Catch: NumberFormatException -> 0x01d5, IllegalStateException -> 0x01e0, TryCatch #7 {IllegalStateException -> 0x01e0, NumberFormatException -> 0x01d5, blocks: (B:3:0x0004, B:5:0x003b, B:9:0x004a, B:16:0x0076, B:23:0x009d, B:30:0x00b3, B:37:0x00c9, B:44:0x00f6, B:51:0x010e, B:58:0x0126, B:65:0x014f, B:73:0x018c, B:68:0x0169, B:76:0x0194, B:77:0x019d, B:79:0x019f, B:80:0x01a8, B:61:0x0140, B:64:0x0149, B:54:0x0117, B:57:0x0120, B:47:0x00ff, B:50:0x0108, B:40:0x00d2, B:82:0x01aa, B:83:0x01b3, B:85:0x01b5, B:86:0x01be, B:33:0x00bc, B:36:0x00c4, B:26:0x00a6, B:29:0x00ae, B:19:0x0090, B:22:0x0098, B:12:0x0064, B:15:0x006c, B:8:0x0045, B:88:0x01c0, B:89:0x01c9, B:91:0x01cb, B:92:0x01d4, B:71:0x0172, B:43:0x00da, B:4:0x0023), top: B:101:0x0004, inners: #8, #6, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0116 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0117 A[Catch: NumberFormatException -> 0x01d5, IllegalStateException -> 0x01e0, TryCatch #7 {IllegalStateException -> 0x01e0, NumberFormatException -> 0x01d5, blocks: (B:3:0x0004, B:5:0x003b, B:9:0x004a, B:16:0x0076, B:23:0x009d, B:30:0x00b3, B:37:0x00c9, B:44:0x00f6, B:51:0x010e, B:58:0x0126, B:65:0x014f, B:73:0x018c, B:68:0x0169, B:76:0x0194, B:77:0x019d, B:79:0x019f, B:80:0x01a8, B:61:0x0140, B:64:0x0149, B:54:0x0117, B:57:0x0120, B:47:0x00ff, B:50:0x0108, B:40:0x00d2, B:82:0x01aa, B:83:0x01b3, B:85:0x01b5, B:86:0x01be, B:33:0x00bc, B:36:0x00c4, B:26:0x00a6, B:29:0x00ae, B:19:0x0090, B:22:0x0098, B:12:0x0064, B:15:0x006c, B:8:0x0045, B:88:0x01c0, B:89:0x01c9, B:91:0x01cb, B:92:0x01d4, B:71:0x0172, B:43:0x00da, B:4:0x0023), top: B:101:0x0004, inners: #8, #6, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x013f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0140 A[Catch: NumberFormatException -> 0x01d5, IllegalStateException -> 0x01e0, TryCatch #7 {IllegalStateException -> 0x01e0, NumberFormatException -> 0x01d5, blocks: (B:3:0x0004, B:5:0x003b, B:9:0x004a, B:16:0x0076, B:23:0x009d, B:30:0x00b3, B:37:0x00c9, B:44:0x00f6, B:51:0x010e, B:58:0x0126, B:65:0x014f, B:73:0x018c, B:68:0x0169, B:76:0x0194, B:77:0x019d, B:79:0x019f, B:80:0x01a8, B:61:0x0140, B:64:0x0149, B:54:0x0117, B:57:0x0120, B:47:0x00ff, B:50:0x0108, B:40:0x00d2, B:82:0x01aa, B:83:0x01b3, B:85:0x01b5, B:86:0x01be, B:33:0x00bc, B:36:0x00c4, B:26:0x00a6, B:29:0x00ae, B:19:0x0090, B:22:0x0098, B:12:0x0064, B:15:0x006c, B:8:0x0045, B:88:0x01c0, B:89:0x01c9, B:91:0x01cb, B:92:0x01d4, B:71:0x0172, B:43:0x00da, B:4:0x0023), top: B:101:0x0004, inners: #8, #6, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0168 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0169 A[Catch: NumberFormatException -> 0x01d5, IllegalStateException -> 0x01e0, TRY_LEAVE, TryCatch #7 {IllegalStateException -> 0x01e0, NumberFormatException -> 0x01d5, blocks: (B:3:0x0004, B:5:0x003b, B:9:0x004a, B:16:0x0076, B:23:0x009d, B:30:0x00b3, B:37:0x00c9, B:44:0x00f6, B:51:0x010e, B:58:0x0126, B:65:0x014f, B:73:0x018c, B:68:0x0169, B:76:0x0194, B:77:0x019d, B:79:0x019f, B:80:0x01a8, B:61:0x0140, B:64:0x0149, B:54:0x0117, B:57:0x0120, B:47:0x00ff, B:50:0x0108, B:40:0x00d2, B:82:0x01aa, B:83:0x01b3, B:85:0x01b5, B:86:0x01be, B:33:0x00bc, B:36:0x00c4, B:26:0x00a6, B:29:0x00ae, B:19:0x0090, B:22:0x0098, B:12:0x0064, B:15:0x006c, B:8:0x0045, B:88:0x01c0, B:89:0x01c9, B:91:0x01cb, B:92:0x01d4, B:71:0x0172, B:43:0x00da, B:4:0x0023), top: B:101:0x0004, inners: #8, #6, #5 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.amazon.aps.iva.fr.b a(java.lang.String r22) throws com.google.gson.JsonParseException {
            /*
                Method dump skipped, instructions count: 491
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.b.e.a(java.lang.String):com.amazon.aps.iva.fr.b");
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class f {
        public final z a;
        public final List<r> b;
        public final c c;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static f a(String str) throws JsonParseException {
                String jsonElement;
                c a;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    z.a aVar = z.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString, "it");
                    aVar.getClass();
                    z a2 = z.a.a(asString);
                    JsonArray<JsonElement> asJsonArray = asJsonObject.get("interfaces").getAsJsonArray();
                    ArrayList arrayList = new ArrayList(asJsonArray.size());
                    for (JsonElement jsonElement2 : asJsonArray) {
                        r.a aVar2 = r.Companion;
                        String asString2 = jsonElement2.getAsString();
                        com.amazon.aps.iva.yb0.j.e(asString2, "it.asString");
                        aVar2.getClass();
                        arrayList.add(r.a.a(asString2));
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
        public f(z zVar, List<? extends r> list, c cVar) {
            com.amazon.aps.iva.yb0.j.f(zVar, "status");
            this.a = zVar;
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class h {
        public final i a;
        public final String b;
        public final long c;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[Catch: NumberFormatException -> 0x0068, IllegalStateException -> 0x0073, TryCatch #4 {IllegalStateException -> 0x0073, NumberFormatException -> 0x0068, blocks: (B:2:0x0000, B:9:0x003f, B:13:0x004c, B:12:0x0048, B:5:0x0012, B:16:0x0053, B:17:0x005c, B:19:0x005e, B:20:0x0067, B:8:0x001a), top: B:27:0x0000, inners: #3 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static com.amazon.aps.iva.fr.b.h a(java.lang.String r4) throws com.google.gson.JsonParseException {
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
                    com.amazon.aps.iva.fr.b$u$a r2 = com.amazon.aps.iva.fr.b.u.Companion     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    java.lang.String r3 = "it"
                    com.amazon.aps.iva.yb0.j.e(r0, r3)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    r2.getClass()     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    com.amazon.aps.iva.fr.b$u r0 = com.amazon.aps.iva.fr.b.u.a.a(r0)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    com.amazon.aps.iva.fr.b$i r2 = new com.amazon.aps.iva.fr.b$i     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                L3f:
                    java.lang.String r0 = "browser_sdk_version"
                    com.google.gson.JsonElement r4 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    if (r4 != 0) goto L48
                    goto L4c
                L48:
                    java.lang.String r1 = r4.getAsString()     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                L4c:
                    com.amazon.aps.iva.fr.b$h r4 = new com.amazon.aps.iva.fr.b$h     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
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
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.b.h.a.a(java.lang.String):com.amazon.aps.iva.fr.b$h");
            }
        }

        public h() {
            this((i) null, 3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, hVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, hVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            i iVar = this.a;
            if (iVar == null) {
                hashCode = 0;
            } else {
                hashCode = iVar.hashCode();
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

        public /* synthetic */ h(i iVar, int i) {
            this((i & 1) != 0 ? null : iVar, (String) null);
        }

        public h(i iVar, String str) {
            this.a = iVar;
            this.b = str;
            this.c = 2L;
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class i {
        public final u a;

        public i(u uVar) {
            com.amazon.aps.iva.yb0.j.f(uVar, "plan");
            this.a = uVar;
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class j {
        public final k a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: ErrorEvent.kt */
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

    /* compiled from: ErrorEvent.kt */
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

        /* compiled from: ErrorEvent.kt */
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class l {
        public final String a;
        public final String b;
        public final p c;
        public final String d;
        public final Boolean e;
        public final String f;
        public final q g;
        public final String h;
        public final y i;
        public final x j;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0090 A[Catch: NumberFormatException -> 0x00d0, IllegalStateException -> 0x00db, TryCatch #2 {IllegalStateException -> 0x00db, NumberFormatException -> 0x00d0, blocks: (B:3:0x0002, B:7:0x001a, B:11:0x0049, B:15:0x005c, B:19:0x006b, B:26:0x0086, B:30:0x0095, B:37:0x00b0, B:44:0x00c6, B:40:0x00b9, B:43:0x00c1, B:33:0x009e, B:36:0x00a6, B:29:0x0090, B:22:0x0074, B:25:0x007c, B:18:0x0066, B:14:0x0053, B:10:0x0044, B:6:0x0015), top: B:52:0x0002 }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b8 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[Catch: NumberFormatException -> 0x00d0, IllegalStateException -> 0x00db, TryCatch #2 {IllegalStateException -> 0x00db, NumberFormatException -> 0x00d0, blocks: (B:3:0x0002, B:7:0x001a, B:11:0x0049, B:15:0x005c, B:19:0x006b, B:26:0x0086, B:30:0x0095, B:37:0x00b0, B:44:0x00c6, B:40:0x00b9, B:43:0x00c1, B:33:0x009e, B:36:0x00a6, B:29:0x0090, B:22:0x0074, B:25:0x007c, B:18:0x0066, B:14:0x0053, B:10:0x0044, B:6:0x0015), top: B:52:0x0002 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static com.amazon.aps.iva.fr.b.l a(java.lang.String r14) throws com.google.gson.JsonParseException {
                /*
                    java.lang.String r0 = "message"
                    com.google.gson.JsonElement r14 = com.google.gson.JsonParser.parseString(r14)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    com.google.gson.JsonObject r14 = r14.getAsJsonObject()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    java.lang.String r1 = "id"
                    com.google.gson.JsonElement r1 = r14.get(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r2 = 0
                    if (r1 != 0) goto L15
                    r4 = r2
                    goto L1a
                L15:
                    java.lang.String r1 = r1.getAsString()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r4 = r1
                L1a:
                    com.google.gson.JsonElement r1 = r14.get(r0)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    java.lang.String r5 = r1.getAsString()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    java.lang.String r1 = "source"
                    com.google.gson.JsonElement r1 = r14.get(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    java.lang.String r1 = r1.getAsString()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    com.amazon.aps.iva.fr.b$p$a r3 = com.amazon.aps.iva.fr.b.p.Companion     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    java.lang.String r6 = "it"
                    com.amazon.aps.iva.yb0.j.e(r1, r6)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r3.getClass()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    com.amazon.aps.iva.fr.b$p r6 = com.amazon.aps.iva.fr.b.p.a.a(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    java.lang.String r1 = "stack"
                    com.google.gson.JsonElement r1 = r14.get(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r1 != 0) goto L44
                    r7 = r2
                    goto L49
                L44:
                    java.lang.String r1 = r1.getAsString()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r7 = r1
                L49:
                    java.lang.String r1 = "is_crash"
                    com.google.gson.JsonElement r1 = r14.get(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r1 != 0) goto L53
                    r8 = r2
                    goto L5c
                L53:
                    boolean r1 = r1.getAsBoolean()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r8 = r1
                L5c:
                    java.lang.String r1 = "type"
                    com.google.gson.JsonElement r1 = r14.get(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r1 != 0) goto L66
                    r9 = r2
                    goto L6b
                L66:
                    java.lang.String r1 = r1.getAsString()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r9 = r1
                L6b:
                    java.lang.String r1 = "handling"
                    com.google.gson.JsonElement r1 = r14.get(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r1 != 0) goto L74
                    goto L7a
                L74:
                    java.lang.String r1 = r1.getAsString()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r1 != 0) goto L7c
                L7a:
                    r10 = r2
                    goto L86
                L7c:
                    com.amazon.aps.iva.fr.b$q$a r3 = com.amazon.aps.iva.fr.b.q.Companion     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r3.getClass()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    com.amazon.aps.iva.fr.b$q r1 = com.amazon.aps.iva.fr.b.q.a.a(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r10 = r1
                L86:
                    java.lang.String r1 = "handling_stack"
                    com.google.gson.JsonElement r1 = r14.get(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r1 != 0) goto L90
                    r11 = r2
                    goto L95
                L90:
                    java.lang.String r1 = r1.getAsString()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r11 = r1
                L95:
                    java.lang.String r1 = "source_type"
                    com.google.gson.JsonElement r1 = r14.get(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r1 != 0) goto L9e
                    goto La4
                L9e:
                    java.lang.String r1 = r1.getAsString()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r1 != 0) goto La6
                La4:
                    r12 = r2
                    goto Lb0
                La6:
                    com.amazon.aps.iva.fr.b$y$a r3 = com.amazon.aps.iva.fr.b.y.Companion     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r3.getClass()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    com.amazon.aps.iva.fr.b$y r1 = com.amazon.aps.iva.fr.b.y.a.a(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r12 = r1
                Lb0:
                    java.lang.String r1 = "resource"
                    com.google.gson.JsonElement r14 = r14.get(r1)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r14 != 0) goto Lb9
                    goto Lbf
                Lb9:
                    java.lang.String r14 = r14.toString()     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    if (r14 != 0) goto Lc1
                Lbf:
                    r13 = r2
                    goto Lc6
                Lc1:
                    com.amazon.aps.iva.fr.b$x r2 = com.amazon.aps.iva.fr.b.x.a.a(r14)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    goto Lbf
                Lc6:
                    com.amazon.aps.iva.fr.b$l r14 = new com.amazon.aps.iva.fr.b$l     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    com.amazon.aps.iva.yb0.j.e(r5, r0)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    r3 = r14
                    r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.NumberFormatException -> Ld0 java.lang.IllegalStateException -> Ldb
                    return r14
                Ld0:
                    r14 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
                    java.lang.String r14 = r14.getMessage()
                    r0.<init>(r14)
                    throw r0
                Ldb:
                    r14 = move-exception
                    com.google.gson.JsonParseException r0 = new com.google.gson.JsonParseException
                    java.lang.String r14 = r14.getMessage()
                    r0.<init>(r14)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.b.l.a.a(java.lang.String):com.amazon.aps.iva.fr.b$l");
            }
        }

        public /* synthetic */ l(String str, p pVar, String str2, Boolean bool, String str3, y yVar, x xVar, int i) {
            this(null, str, pVar, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : str3, null, null, (i & 256) != 0 ? null : yVar, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : xVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, lVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, lVar.b) && this.c == lVar.c && com.amazon.aps.iva.yb0.j.a(this.d, lVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, lVar.e) && com.amazon.aps.iva.yb0.j.a(this.f, lVar.f) && this.g == lVar.g && com.amazon.aps.iva.yb0.j.a(this.h, lVar.h) && this.i == lVar.i && com.amazon.aps.iva.yb0.j.a(this.j, lVar.j)) {
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
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode8 = (this.c.hashCode() + com.amazon.aps.iva.c80.a.b(this.b, hashCode * 31, 31)) * 31;
            String str2 = this.d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i2 = (hashCode8 + hashCode2) * 31;
            Boolean bool = this.e;
            if (bool == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = bool.hashCode();
            }
            int i3 = (i2 + hashCode3) * 31;
            String str3 = this.f;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            q qVar = this.g;
            if (qVar == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = qVar.hashCode();
            }
            int i5 = (i4 + hashCode5) * 31;
            String str4 = this.h;
            if (str4 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str4.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            y yVar = this.i;
            if (yVar == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = yVar.hashCode();
            }
            int i7 = (i6 + hashCode7) * 31;
            x xVar = this.j;
            if (xVar != null) {
                i = xVar.hashCode();
            }
            return i7 + i;
        }

        public final String toString() {
            return "Error(id=" + this.a + ", message=" + this.b + ", source=" + this.c + ", stack=" + this.d + ", isCrash=" + this.e + ", type=" + this.f + ", handling=" + this.g + ", handlingStack=" + this.h + ", sourceType=" + this.i + ", resource=" + this.j + ")";
        }

        public l(String str, String str2, p pVar, String str3, Boolean bool, String str4, q qVar, String str5, y yVar, x xVar) {
            com.amazon.aps.iva.yb0.j.f(str2, "message");
            com.amazon.aps.iva.yb0.j.f(pVar, FirebaseAnalytics.Param.SOURCE);
            this.a = str;
            this.b = str2;
            this.c = pVar;
            this.d = str3;
            this.e = bool;
            this.f = str4;
            this.g = qVar;
            this.h = str5;
            this.i = yVar;
            this.j = xVar;
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class m {
        public final String a;
        public final n b;
        public final Boolean c;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static m a(String str) throws JsonParseException {
                Boolean valueOf;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("id").getAsString();
                    String asString2 = asJsonObject.get("type").getAsString();
                    n.a aVar = n.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString2, "it");
                    aVar.getClass();
                    n a = n.a.a(asString2);
                    JsonElement jsonElement = asJsonObject.get("has_replay");
                    if (jsonElement == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(jsonElement.getAsBoolean());
                    }
                    com.amazon.aps.iva.yb0.j.e(asString, "id");
                    return new m(asString, a, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public m(String str, n nVar, Boolean bool) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(nVar, "type");
            this.a = str;
            this.b = nVar;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, mVar.a) && this.b == mVar.b && com.amazon.aps.iva.yb0.j.a(this.c, mVar.c)) {
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
            return "ErrorEventSession(id=" + this.a + ", type=" + this.b + ", hasReplay=" + this.c + ")";
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum n {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
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
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum o {
        ANDROID(CredentialsData.CREDENTIALS_TYPE_ANDROID),
        IOS(CredentialsData.CREDENTIALS_TYPE_IOS),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ErrorEvent.kt */
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum p {
        NETWORK("network"),
        SOURCE(FirebaseAnalytics.Param.SOURCE),
        CONSOLE("console"),
        LOGGER("logger"),
        AGENT("agent"),
        WEBVIEW("webview"),
        CUSTOM("custom"),
        REPORT("report");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ErrorEvent.kt */
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum q {
        HANDLED("handled"),
        UNHANDLED("unhandled");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static q a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                q[] values = q.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    q qVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(qVar.jsonValue, str)) {
                        return qVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        q(String str) {
            this.jsonValue = str;
        }

        public static final q fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum r {
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

        /* compiled from: ErrorEvent.kt */
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
                    if (com.amazon.aps.iva.yb0.j.a(rVar.jsonValue, str)) {
                        return rVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        r(String str) {
            this.jsonValue = str;
        }

        public static final r fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum s {
        POST("POST"),
        GET("GET"),
        HEAD("HEAD"),
        PUT("PUT"),
        DELETE("DELETE"),
        PATCH("PATCH");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static s a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                s[] values = s.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    s sVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(sVar.jsonValue, str)) {
                        return sVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        s(String str) {
            this.jsonValue = str;
        }

        public static final s fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class t {
        public final String a;
        public final String b;
        public final String c;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static t a(String str) throws JsonParseException {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME).getAsString();
                    String asString2 = asJsonObject.get("version").getAsString();
                    String asString3 = asJsonObject.get("version_major").getAsString();
                    com.amazon.aps.iva.yb0.j.e(asString, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    com.amazon.aps.iva.yb0.j.e(asString2, "version");
                    com.amazon.aps.iva.yb0.j.e(asString3, "versionMajor");
                    return new t(asString, asString2, asString3);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public t(String str, String str2, String str3) {
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
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, tVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, tVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, tVar.c)) {
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum u {
        PLAN_1(1),
        PLAN_2(2);
        
        public static final a Companion = new a();
        private final Number jsonValue;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static u a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                u[] values = u.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    u uVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(uVar.jsonValue.toString(), str)) {
                        return uVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        u(Number number) {
            this.jsonValue = number;
        }

        public static final u fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class v {
        public final String a;
        public final String b;
        public final w c;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static v a(String str) throws JsonParseException {
                String asString;
                String asString2;
                String asString3;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("domain");
                    w wVar = null;
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
                        w.Companion.getClass();
                        wVar = w.a.a(asString3);
                    }
                    return new v(asString, asString2, wVar);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public v() {
            this((String) null, (w) null, 7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, vVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, vVar.b) && this.c == vVar.c) {
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
            w wVar = this.c;
            if (wVar != null) {
                i = wVar.hashCode();
            }
            return i3 + i;
        }

        public final String toString() {
            return "Provider(domain=" + this.a + ", name=" + this.b + ", type=" + this.c + ")";
        }

        public /* synthetic */ v(String str, w wVar, int i) {
            this((i & 1) != 0 ? null : str, (String) null, (i & 4) != 0 ? null : wVar);
        }

        public v(String str, String str2, w wVar) {
            this.a = str;
            this.b = str2;
            this.c = wVar;
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum w {
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

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static w a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                w[] values = w.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    w wVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(wVar.jsonValue, str)) {
                        return wVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        w(String str) {
            this.jsonValue = str;
        }

        public static final w fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class x {
        public final s a;
        public final long b;
        public final String c;
        public final v d;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static x a(String str) throws JsonParseException {
                String jsonElement;
                v a;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get(FirebaseAnalytics.Param.METHOD).getAsString();
                    s.a aVar = s.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString, "it");
                    aVar.getClass();
                    s a2 = s.a.a(asString);
                    long asLong = asJsonObject.get("status_code").getAsLong();
                    String asString2 = asJsonObject.get(ImagesContract.URL).getAsString();
                    JsonElement jsonElement2 = asJsonObject.get("provider");
                    if (jsonElement2 != null && (jsonElement = jsonElement2.toString()) != null) {
                        a = v.a.a(jsonElement);
                        v vVar = a;
                        com.amazon.aps.iva.yb0.j.e(asString2, ImagesContract.URL);
                        return new x(a2, asLong, asString2, vVar);
                    }
                    a = null;
                    v vVar2 = a;
                    com.amazon.aps.iva.yb0.j.e(asString2, ImagesContract.URL);
                    return new x(a2, asLong, asString2, vVar2);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public x(s sVar, long j, String str, v vVar) {
            com.amazon.aps.iva.yb0.j.f(sVar, FirebaseAnalytics.Param.METHOD);
            com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
            this.a = sVar;
            this.b = j;
            this.c = str;
            this.d = vVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            x xVar = (x) obj;
            if (this.a == xVar.a && this.b == xVar.b && com.amazon.aps.iva.yb0.j.a(this.c, xVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, xVar.d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int b = com.amazon.aps.iva.c80.a.b(this.c, com.amazon.aps.iva.b8.i.a(this.b, this.a.hashCode() * 31, 31), 31);
            v vVar = this.d;
            if (vVar == null) {
                hashCode = 0;
            } else {
                hashCode = vVar.hashCode();
            }
            return b + hashCode;
        }

        public final String toString() {
            return "Resource(method=" + this.a + ", statusCode=" + this.b + ", url=" + this.c + ", provider=" + this.d + ")";
        }
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum y {
        ANDROID(CredentialsData.CREDENTIALS_TYPE_ANDROID),
        BROWSER("browser"),
        IOS(CredentialsData.CREDENTIALS_TYPE_IOS),
        REACT_NATIVE("react-native"),
        FLUTTER("flutter");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ErrorEvent.kt */
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

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public enum z {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: ErrorEvent.kt */
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

    public /* synthetic */ b(long j2, C0276b c0276b, String str, m mVar, o oVar, c0 c0Var, b0 b0Var, f fVar, t tVar, j jVar, h hVar, g gVar, l lVar, a aVar, int i2) {
        this(j2, c0276b, (i2 & 4) != 0 ? null : str, mVar, (i2 & 16) != 0 ? null : oVar, c0Var, (i2 & 64) != 0 ? null : b0Var, (i2 & 128) != 0 ? null : fVar, null, null, (i2 & 1024) != 0 ? null : tVar, (i2 & 2048) != 0 ? null : jVar, hVar, (i2 & 8192) != 0 ? null : gVar, lVar, (i2 & 32768) != 0 ? null : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && com.amazon.aps.iva.yb0.j.a(this.b, bVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, bVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, bVar.d) && this.e == bVar.e && com.amazon.aps.iva.yb0.j.a(this.f, bVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, bVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, bVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, bVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, bVar.j) && com.amazon.aps.iva.yb0.j.a(this.k, bVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, bVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, bVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, bVar.n) && com.amazon.aps.iva.yb0.j.a(this.o, bVar.o) && com.amazon.aps.iva.yb0.j.a(this.p, bVar.p)) {
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
        o oVar = this.e;
        if (oVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = oVar.hashCode();
        }
        int hashCode12 = (this.f.hashCode() + ((hashCode11 + hashCode2) * 31)) * 31;
        b0 b0Var = this.g;
        if (b0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = b0Var.hashCode();
        }
        int i3 = (hashCode12 + hashCode3) * 31;
        f fVar = this.h;
        if (fVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fVar.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        a0 a0Var = this.i;
        if (a0Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = a0Var.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        d dVar = this.j;
        if (dVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dVar.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        t tVar = this.k;
        if (tVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = tVar.hashCode();
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
        return "ErrorEvent(date=" + this.a + ", application=" + this.b + ", service=" + this.c + ", session=" + this.d + ", source=" + this.e + ", view=" + this.f + ", usr=" + this.g + ", connectivity=" + this.h + ", synthetics=" + this.i + ", ciTest=" + this.j + ", os=" + this.k + ", device=" + this.l + ", dd=" + this.m + ", context=" + this.n + ", error=" + this.o + ", action=" + this.p + ")";
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class g {
        public final Map<String, Object> a;

        /* compiled from: ErrorEvent.kt */
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

    public b(long j2, C0276b c0276b, String str, m mVar, o oVar, c0 c0Var, b0 b0Var, f fVar, a0 a0Var, d dVar, t tVar, j jVar, h hVar, g gVar, l lVar, a aVar) {
        this.a = j2;
        this.b = c0276b;
        this.c = str;
        this.d = mVar;
        this.e = oVar;
        this.f = c0Var;
        this.g = b0Var;
        this.h = fVar;
        this.i = a0Var;
        this.j = dVar;
        this.k = tVar;
        this.l = jVar;
        this.m = hVar;
        this.n = gVar;
        this.o = lVar;
        this.p = aVar;
    }

    /* compiled from: ErrorEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b0 {
        public static final String[] e = {"id", AppMeasurementSdk.ConditionalUserProperty.NAME, Scopes.EMAIL};
        public final String a;
        public final String b;
        public final String c;
        public final Map<String, Object> d;

        /* compiled from: ErrorEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static b0 a(String str) throws JsonParseException {
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
                        if (!com.amazon.aps.iva.lb0.o.N(b0.e, entry.getKey())) {
                            String key = entry.getKey();
                            com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new b0(asString, asString2, str2, linkedHashMap);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public b0(String str, String str2, String str3, Map<String, ? extends Object> map) {
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
            if (!(obj instanceof b0)) {
                return false;
            }
            b0 b0Var = (b0) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, b0Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, b0Var.b) && com.amazon.aps.iva.yb0.j.a(this.c, b0Var.c) && com.amazon.aps.iva.yb0.j.a(this.d, b0Var.d)) {
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

        public b0() {
            this(null, null, null, com.amazon.aps.iva.lb0.a0.b);
        }
    }
}
