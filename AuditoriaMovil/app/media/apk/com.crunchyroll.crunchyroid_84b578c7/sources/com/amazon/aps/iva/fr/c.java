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
/* compiled from: LongTaskEvent.kt */
/* loaded from: classes2.dex */
public final class c {
    public final long a;
    public final b b;
    public final String c;
    public final n d;
    public final r e;
    public final v f;
    public final u g;
    public final f h;
    public final t i;
    public final d j;
    public final p k;
    public final j l;
    public final h m;
    public final g n;
    public final m o;
    public final a p;

    /* compiled from: LongTaskEvent.kt */
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

    /* compiled from: LongTaskEvent.kt */
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

    /* compiled from: LongTaskEvent.kt */
    /* renamed from: com.amazon.aps.iva.fr.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0277c {
        public final String a;
        public final String b;

        /* compiled from: LongTaskEvent.kt */
        /* renamed from: com.amazon.aps.iva.fr.c$c$a */
        /* loaded from: classes2.dex */
        public static final class a {
            public static C0277c a(String str) throws JsonParseException {
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
                    return new C0277c(asString, str2);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public C0277c() {
            this(null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0277c)) {
                return false;
            }
            C0277c c0277c = (C0277c) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, c0277c.a) && com.amazon.aps.iva.yb0.j.a(this.b, c0277c.b)) {
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

        public C0277c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* compiled from: LongTaskEvent.kt */
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

    /* compiled from: LongTaskEvent.kt */
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
        public static com.amazon.aps.iva.fr.c a(java.lang.String r22) throws com.google.gson.JsonParseException {
            /*
                Method dump skipped, instructions count: 491
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.c.e.a(java.lang.String):com.amazon.aps.iva.fr.c");
        }
    }

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class f {
        public final s a;
        public final List<l> b;
        public final C0277c c;

        /* compiled from: LongTaskEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static f a(String str) throws JsonParseException {
                String jsonElement;
                C0277c a;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("status").getAsString();
                    s.a aVar = s.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString, "it");
                    aVar.getClass();
                    s a2 = s.a.a(asString);
                    JsonArray<JsonElement> asJsonArray = asJsonObject.get("interfaces").getAsJsonArray();
                    ArrayList arrayList = new ArrayList(asJsonArray.size());
                    for (JsonElement jsonElement2 : asJsonArray) {
                        l.a aVar2 = l.Companion;
                        String asString2 = jsonElement2.getAsString();
                        com.amazon.aps.iva.yb0.j.e(asString2, "it.asString");
                        aVar2.getClass();
                        arrayList.add(l.a.a(asString2));
                    }
                    JsonElement jsonElement3 = asJsonObject.get("cellular");
                    if (jsonElement3 != null && (jsonElement = jsonElement3.toString()) != null) {
                        a = C0277c.a.a(jsonElement);
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
        public f(s sVar, List<? extends l> list, C0277c c0277c) {
            com.amazon.aps.iva.yb0.j.f(sVar, "status");
            this.a = sVar;
            this.b = list;
            this.c = c0277c;
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
            C0277c c0277c = this.c;
            if (c0277c == null) {
                hashCode = 0;
            } else {
                hashCode = c0277c.hashCode();
            }
            return a2 + hashCode;
        }

        public final String toString() {
            return "Connectivity(status=" + this.a + ", interfaces=" + this.b + ", cellular=" + this.c + ")";
        }
    }

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class h {
        public final i a;
        public final String b;
        public final long c;

        /* compiled from: LongTaskEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[Catch: NumberFormatException -> 0x0068, IllegalStateException -> 0x0073, TryCatch #4 {IllegalStateException -> 0x0073, NumberFormatException -> 0x0068, blocks: (B:2:0x0000, B:9:0x003f, B:13:0x004c, B:12:0x0048, B:5:0x0012, B:16:0x0053, B:17:0x005c, B:19:0x005e, B:20:0x0067, B:8:0x001a), top: B:27:0x0000, inners: #3 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static com.amazon.aps.iva.fr.c.h a(java.lang.String r4) throws com.google.gson.JsonParseException {
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
                    com.amazon.aps.iva.fr.c$q$a r2 = com.amazon.aps.iva.fr.c.q.Companion     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    java.lang.String r3 = "it"
                    com.amazon.aps.iva.yb0.j.e(r0, r3)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    r2.getClass()     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    com.amazon.aps.iva.fr.c$q r0 = com.amazon.aps.iva.fr.c.q.a.a(r0)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    com.amazon.aps.iva.fr.c$i r2 = new com.amazon.aps.iva.fr.c$i     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                    r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L52 java.lang.IllegalStateException -> L5d
                L3f:
                    java.lang.String r0 = "browser_sdk_version"
                    com.google.gson.JsonElement r4 = r4.get(r0)     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                    if (r4 != 0) goto L48
                    goto L4c
                L48:
                    java.lang.String r1 = r4.getAsString()     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
                L4c:
                    com.amazon.aps.iva.fr.c$h r4 = new com.amazon.aps.iva.fr.c$h     // Catch: java.lang.NumberFormatException -> L68 java.lang.IllegalStateException -> L73
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
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.fr.c.h.a.a(java.lang.String):com.amazon.aps.iva.fr.c$h");
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

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class i {
        public final q a;

        public i(q qVar) {
            com.amazon.aps.iva.yb0.j.f(qVar, "plan");
            this.a = qVar;
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

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class j {
        public final k a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        /* compiled from: LongTaskEvent.kt */
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

    /* compiled from: LongTaskEvent.kt */
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

        /* compiled from: LongTaskEvent.kt */
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

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public enum l {
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

        /* compiled from: LongTaskEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static l a(String str) {
                com.amazon.aps.iva.yb0.j.f(str, "serializedObject");
                l[] values = l.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    l lVar = values[i];
                    i++;
                    if (com.amazon.aps.iva.yb0.j.a(lVar.jsonValue, str)) {
                        return lVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        l(String str) {
            this.jsonValue = str;
        }

        public static final l fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class m {
        public final String a;
        public final long b;
        public final Boolean c;

        /* compiled from: LongTaskEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static m a(String str) throws JsonParseException {
                String asString;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    JsonElement jsonElement = asJsonObject.get("id");
                    Boolean bool = null;
                    if (jsonElement == null) {
                        asString = null;
                    } else {
                        asString = jsonElement.getAsString();
                    }
                    long asLong = asJsonObject.get("duration").getAsLong();
                    JsonElement jsonElement2 = asJsonObject.get("is_frozen_frame");
                    if (jsonElement2 != null) {
                        bool = Boolean.valueOf(jsonElement2.getAsBoolean());
                    }
                    return new m(asString, asLong, bool);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public m(String str, long j, Boolean bool) {
            this.a = str;
            this.b = j;
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
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int a2 = com.amazon.aps.iva.b8.i.a(this.b, hashCode * 31, 31);
            Boolean bool = this.c;
            if (bool != null) {
                i = bool.hashCode();
            }
            return a2 + i;
        }

        public final String toString() {
            return "LongTask(id=" + this.a + ", duration=" + this.b + ", isFrozenFrame=" + this.c + ")";
        }
    }

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class n {
        public final String a;
        public final o b;
        public final Boolean c;

        /* compiled from: LongTaskEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static n a(String str) throws JsonParseException {
                Boolean valueOf;
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get("id").getAsString();
                    String asString2 = asJsonObject.get("type").getAsString();
                    o.a aVar = o.Companion;
                    com.amazon.aps.iva.yb0.j.e(asString2, "it");
                    aVar.getClass();
                    o a = o.a.a(asString2);
                    JsonElement jsonElement = asJsonObject.get("has_replay");
                    if (jsonElement == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(jsonElement.getAsBoolean());
                    }
                    com.amazon.aps.iva.yb0.j.e(asString, "id");
                    return new n(asString, a, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public n(String str, o oVar, Boolean bool) {
            com.amazon.aps.iva.yb0.j.f(str, "id");
            com.amazon.aps.iva.yb0.j.f(oVar, "type");
            this.a = str;
            this.b = oVar;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, nVar.a) && this.b == nVar.b && com.amazon.aps.iva.yb0.j.a(this.c, nVar.c)) {
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
            return "LongTaskEventSession(id=" + this.a + ", type=" + this.b + ", hasReplay=" + this.c + ")";
        }
    }

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public enum o {
        USER("user"),
        SYNTHETICS("synthetics"),
        CI_TEST("ci_test");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: LongTaskEvent.kt */
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

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class p {
        public final String a;
        public final String b;
        public final String c;

        /* compiled from: LongTaskEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static p a(String str) throws JsonParseException {
                try {
                    JsonObject asJsonObject = JsonParser.parseString(str).getAsJsonObject();
                    String asString = asJsonObject.get(AppMeasurementSdk.ConditionalUserProperty.NAME).getAsString();
                    String asString2 = asJsonObject.get("version").getAsString();
                    String asString3 = asJsonObject.get("version_major").getAsString();
                    com.amazon.aps.iva.yb0.j.e(asString, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    com.amazon.aps.iva.yb0.j.e(asString2, "version");
                    com.amazon.aps.iva.yb0.j.e(asString3, "versionMajor");
                    return new p(asString, asString2, asString3);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public p(String str, String str2, String str3) {
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
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, pVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, pVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, pVar.c)) {
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

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public enum q {
        PLAN_1(1),
        PLAN_2(2);
        
        public static final a Companion = new a();
        private final Number jsonValue;

        /* compiled from: LongTaskEvent.kt */
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
                    if (com.amazon.aps.iva.yb0.j.a(qVar.jsonValue.toString(), str)) {
                        return qVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        q(Number number) {
            this.jsonValue = number;
        }

        public static final q fromJson(String str) {
            Companion.getClass();
            return a.a(str);
        }

        public final JsonElement toJson() {
            return new JsonPrimitive(this.jsonValue);
        }
    }

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public enum r {
        ANDROID(CredentialsData.CREDENTIALS_TYPE_ANDROID),
        IOS(CredentialsData.CREDENTIALS_TYPE_IOS),
        BROWSER("browser"),
        FLUTTER("flutter"),
        REACT_NATIVE("react-native");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: LongTaskEvent.kt */
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

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public enum s {
        CONNECTED("connected"),
        NOT_CONNECTED("not_connected"),
        MAYBE("maybe");
        
        public static final a Companion = new a();
        private final String jsonValue;

        /* compiled from: LongTaskEvent.kt */
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

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class t {
        public final String a;
        public final String b;
        public final Boolean c;

        /* compiled from: LongTaskEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static t a(String str) throws JsonParseException {
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
                    return new t(asString, asString2, valueOf);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public t(String str, String str2, Boolean bool) {
            this.a = str;
            this.b = str2;
            this.c = bool;
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

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class v {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        /* compiled from: LongTaskEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static v a(String str) throws JsonParseException {
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
                    return new v(asString2, asString, asString3, str2);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public v(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            v vVar = (v) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, vVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, vVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, vVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, vVar.d)) {
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

    public c(long j2, b bVar, String str, n nVar, r rVar, v vVar, u uVar, f fVar, t tVar, d dVar, p pVar, j jVar, h hVar, g gVar, m mVar, a aVar) {
        this.a = j2;
        this.b = bVar;
        this.c = str;
        this.d = nVar;
        this.e = rVar;
        this.f = vVar;
        this.g = uVar;
        this.h = fVar;
        this.i = tVar;
        this.j = dVar;
        this.k = pVar;
        this.l = jVar;
        this.m = hVar;
        this.n = gVar;
        this.o = mVar;
        this.p = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a == cVar.a && com.amazon.aps.iva.yb0.j.a(this.b, cVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, cVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, cVar.d) && this.e == cVar.e && com.amazon.aps.iva.yb0.j.a(this.f, cVar.f) && com.amazon.aps.iva.yb0.j.a(this.g, cVar.g) && com.amazon.aps.iva.yb0.j.a(this.h, cVar.h) && com.amazon.aps.iva.yb0.j.a(this.i, cVar.i) && com.amazon.aps.iva.yb0.j.a(this.j, cVar.j) && com.amazon.aps.iva.yb0.j.a(this.k, cVar.k) && com.amazon.aps.iva.yb0.j.a(this.l, cVar.l) && com.amazon.aps.iva.yb0.j.a(this.m, cVar.m) && com.amazon.aps.iva.yb0.j.a(this.n, cVar.n) && com.amazon.aps.iva.yb0.j.a(this.o, cVar.o) && com.amazon.aps.iva.yb0.j.a(this.p, cVar.p)) {
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
        r rVar = this.e;
        if (rVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = rVar.hashCode();
        }
        int hashCode12 = (this.f.hashCode() + ((hashCode11 + hashCode2) * 31)) * 31;
        u uVar = this.g;
        if (uVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = uVar.hashCode();
        }
        int i3 = (hashCode12 + hashCode3) * 31;
        f fVar = this.h;
        if (fVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fVar.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        t tVar = this.i;
        if (tVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = tVar.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        d dVar = this.j;
        if (dVar == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = dVar.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        p pVar = this.k;
        if (pVar == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = pVar.hashCode();
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
        return "LongTaskEvent(date=" + this.a + ", application=" + this.b + ", service=" + this.c + ", session=" + this.d + ", source=" + this.e + ", view=" + this.f + ", usr=" + this.g + ", connectivity=" + this.h + ", synthetics=" + this.i + ", ciTest=" + this.j + ", os=" + this.k + ", device=" + this.l + ", dd=" + this.m + ", context=" + this.n + ", longTask=" + this.o + ", action=" + this.p + ")";
    }

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class g {
        public final Map<String, Object> a;

        /* compiled from: LongTaskEvent.kt */
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
            this(a0.b);
        }
    }

    /* compiled from: LongTaskEvent.kt */
    /* loaded from: classes2.dex */
    public static final class u {
        public static final String[] e = {"id", AppMeasurementSdk.ConditionalUserProperty.NAME, Scopes.EMAIL};
        public final String a;
        public final String b;
        public final String c;
        public final Map<String, Object> d;

        /* compiled from: LongTaskEvent.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            public static u a(String str) throws JsonParseException {
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
                        if (!com.amazon.aps.iva.lb0.o.N(u.e, entry.getKey())) {
                            String key = entry.getKey();
                            com.amazon.aps.iva.yb0.j.e(key, "entry.key");
                            linkedHashMap.put(key, entry.getValue());
                        }
                    }
                    return new u(asString, asString2, str2, linkedHashMap);
                } catch (IllegalStateException e) {
                    throw new JsonParseException(e.getMessage());
                } catch (NumberFormatException e2) {
                    throw new JsonParseException(e2.getMessage());
                }
            }
        }

        public u(String str, String str2, String str3, Map<String, ? extends Object> map) {
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
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, uVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, uVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, uVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, uVar.d)) {
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

        public u() {
            this(null, null, null, a0.b);
        }
    }
}
