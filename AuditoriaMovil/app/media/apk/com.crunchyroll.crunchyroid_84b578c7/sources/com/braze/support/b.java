package com.braze.support;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.BrazeDateFormat;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class b {
    public static final b a = new b();
    private static final List b = f1.K("$add", "$remove", "$update", "$identifier_key", "$identifier_value", "$new_object");

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error parsing date " + this.b;
        }
    }

    /* renamed from: com.braze.support.b$b */
    /* loaded from: classes.dex */
    public static final class C0941b extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0941b(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "JSON Object size (" + this.b.toString().length() + " bytes) exceeds 76800";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "JSON Array size (" + this.b.toString().length() + " bytes) exceeds 76800";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj) {
            super(0);
            this.b = obj;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not add unsupported custom attribute type with value: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "JSON Object nested too deep (limit 50). Returning null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "JSON Object nested too deep (limit 50). Returning null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Nested Custom Attribute Key '"), this.b, "' is invalid.");
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends l implements com.amazon.aps.iva.xb0.a {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return t1.b(new StringBuilder("Custom attribute key cannot be blocklisted attribute: "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends l implements com.amazon.aps.iva.xb0.a {
        public static final j b = new j();

        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Custom attribute value cannot be null.";
        }
    }

    private b() {
    }

    public static final boolean a(String str, Set set) {
        com.amazon.aps.iva.yb0.j.f(set, "blocklistedAttributes");
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, h.b, 2, (Object) null);
            return false;
        } else if (set.contains(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, new i(str), 2, (Object) null);
            return false;
        } else {
            return true;
        }
    }

    public static final boolean b(String str) {
        if (str == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, BrazeLogger.Priority.W, (Throwable) null, j.b, 2, (Object) null);
            return false;
        }
        return true;
    }

    private final boolean a(String str) {
        return (!b.contains(str)) & (m.b0(str) | q.i0(str, "$", false) | q.i0(str, ".", false));
    }

    private final com.amazon.aps.iva.if0.c a(com.amazon.aps.iva.if0.c cVar, int i2) {
        if (i2 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f.b, 3, (Object) null);
            return null;
        }
        com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
        Iterator<String> keys = cVar.keys();
        com.amazon.aps.iva.yb0.j.e(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(next);
            b bVar = a;
            if (bVar.a(ensureBrazeFieldLength)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, bVar, BrazeLogger.Priority.W, (Throwable) null, new g(next), 2, (Object) null);
            }
            if (!m.b0(ensureBrazeFieldLength)) {
                if (cVar.isNull(next)) {
                    cVar2.put(next, com.amazon.aps.iva.if0.c.NULL);
                } else {
                    Object obj = cVar.get(next);
                    com.amazon.aps.iva.yb0.j.e(obj, "json.get(key)");
                    Object a2 = bVar.a(obj, i2);
                    if (a2 == null) {
                        return null;
                    }
                    cVar2.put(ensureBrazeFieldLength, a2);
                }
            }
        }
        return cVar2;
    }

    private final com.amazon.aps.iva.if0.a a(com.amazon.aps.iva.if0.a aVar, int i2) {
        if (i2 > 50) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e.b, 3, (Object) null);
            return null;
        }
        com.amazon.aps.iva.if0.a aVar2 = new com.amazon.aps.iva.if0.a();
        int e2 = aVar.e();
        for (int i3 = 0; i3 < e2; i3++) {
            Object a2 = a(aVar.get(i3), i2);
            if (a2 == null) {
                return null;
            }
            aVar2.put(a2);
        }
        return aVar2;
    }

    public static /* synthetic */ Object a(b bVar, Object obj, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return bVar.a(obj, i2);
    }

    public final Object a(Object obj, int i2) {
        com.amazon.aps.iva.yb0.j.f(obj, "value");
        if (obj instanceof Boolean ? true : obj instanceof Integer ? true : obj instanceof Float ? true : obj instanceof Long ? true : obj instanceof Double) {
            return obj;
        }
        if (obj instanceof String) {
            return ValidationUtils.ensureBrazeFieldLength((String) obj);
        }
        if (obj instanceof Date) {
            try {
                return DateTimeUtils.formatDate$default((Date) obj, BrazeDateFormat.LONG, null, 2, null);
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new a(obj));
            }
        } else if (obj instanceof com.amazon.aps.iva.if0.c) {
            if (i2 == 0 && obj.toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new C0941b(obj), 2, (Object) null);
            } else {
                return a((com.amazon.aps.iva.if0.c) obj, i2 + 1);
            }
        } else if (obj instanceof com.amazon.aps.iva.if0.a) {
            if (i2 == 0 && obj.toString().length() > 76800) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new c(obj), 2, (Object) null);
            } else {
                return a((com.amazon.aps.iva.if0.a) obj, i2 + 1);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new d(obj), 2, (Object) null);
        }
        return null;
    }

    public static final String[] a(String[] strArr) {
        com.amazon.aps.iva.yb0.j.f(strArr, "values");
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ValidationUtils.ensureBrazeFieldLength(str));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
