package com.braze.support;

import android.os.Bundle;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.l;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\t\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\f\u001a\u001d\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u000f\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0018\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0016*\u0004\u0018\u00010\u0002\u001a\u0012\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018*\u0004\u0018\u00010\u000e\u001a\u0016\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0015\u0010\u001e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0086\u0002\u001a\f\u0010\u001f\u001a\u00020\u0004*\u0004\u0018\u00010\u0002\u001a\u001f\u0010!\u001a\u0004\u0018\u00010 *\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001a\u0010&\u001a\u00020%2\b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010'\u001a\u00020%*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\n\u0010(\u001a\u00020\u0002*\u00020\u0002\u001a\f\u0010*\u001a\u00020)*\u0004\u0018\u00010\u0004\"\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"", "TargetEnum", "Lcom/amazon/aps/iva/if0/c;", "jsonObject", "", "key", "Ljava/lang/Class;", "targetEnumClass", "defaultEnum", "optEnum", "(Lcom/amazon/aps/iva/if0/c;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Enum;)Ljava/lang/Enum;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lcom/braze/models/IPutIntoJson;", "Lcom/amazon/aps/iva/if0/a;", "constructJsonArray", "", "([Ljava/lang/Object;)Lcom/amazon/aps/iva/if0/a;", "getOptionalString", "", "getDoubleOrNull", "(Lcom/amazon/aps/iva/if0/c;Ljava/lang/String;)Ljava/lang/Double;", "", "convertJSONObjectToMap", "", "convertStringJsonArrayToList", "oldJson", "newJson", "mergeJsonObjects", "otherJson", "plus", "getPrettyPrintedString", "", "getColorIntegerOrNull", "(Lcom/amazon/aps/iva/if0/c;Ljava/lang/String;)Ljava/lang/Integer;", "target", FirebaseAnalytics.Param.SOURCE, "", "areJsonObjectsEqual", "isEqualTo", "deepcopy", "Landroid/os/Bundle;", "parseJsonObjectIntoBundle", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class JsonUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("JsonUtils");

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;
        final /* synthetic */ com.amazon.aps.iva.if0.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, com.amazon.aps.iva.if0.a aVar) {
            super(0);
            this.b = i;
            this.c = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get string for item at index: " + this.b + " and array: " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve color integer from JSON";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Caught Throwable while generating pretty printed json. Returning blank string.";
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
            return "Caught exception merging JSON for old key " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Caught exception merging JSON for new key " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends l implements com.amazon.aps.iva.xb0.a {
        public static final k b = new k();

        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Unable parse JSON into a bundle.";
        }
    }

    public static final boolean areJsonObjectsEqual(com.amazon.aps.iva.if0.c cVar, com.amazon.aps.iva.if0.c cVar2) {
        if (cVar == null && cVar2 == null) {
            return true;
        }
        if (cVar == null || cVar2 == null || cVar.length() != cVar2.length()) {
            return false;
        }
        Iterator<String> keys = cVar.keys();
        com.amazon.aps.iva.yb0.j.e(keys, "target.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (!cVar2.has(next)) {
                return false;
            }
            Object opt = cVar.opt(next);
            Object opt2 = cVar2.opt(next);
            if ((opt instanceof com.amazon.aps.iva.if0.c) && (opt2 instanceof com.amazon.aps.iva.if0.c)) {
                if (!isEqualTo((com.amazon.aps.iva.if0.c) opt, (com.amazon.aps.iva.if0.c) opt2)) {
                    return false;
                }
            } else if (opt != null && opt2 != null && !com.amazon.aps.iva.yb0.j.a(opt, opt2)) {
                return false;
            }
        }
        return true;
    }

    public static final <T> com.amazon.aps.iva.if0.a constructJsonArray(Collection<? extends IPutIntoJson<T>> collection) {
        com.amazon.aps.iva.yb0.j.f(collection, "<this>");
        com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
        for (IPutIntoJson<T> iPutIntoJson : collection) {
            aVar.put(iPutIntoJson.forJsonPut());
        }
        return aVar;
    }

    public static final Map<String, String> convertJSONObjectToMap(com.amazon.aps.iva.if0.c cVar) {
        if (cVar == null) {
            return a0.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = cVar.keys();
        com.amazon.aps.iva.yb0.j.e(keys, "this.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            com.amazon.aps.iva.yb0.j.e(next, "key");
            String string = cVar.getString(next);
            com.amazon.aps.iva.yb0.j.e(string, "this.getString(key)");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    public static final List<String> convertStringJsonArrayToList(com.amazon.aps.iva.if0.a aVar) {
        ArrayList arrayList = new ArrayList();
        if (aVar == null) {
            return arrayList;
        }
        int e = aVar.e();
        for (int i2 = 0; i2 < e; i2++) {
            try {
                arrayList.add(aVar.d(i2));
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e2, (com.amazon.aps.iva.xb0.a<String>) new a(i2, aVar));
            }
        }
        return arrayList;
    }

    public static final com.amazon.aps.iva.if0.c deepcopy(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        return new com.amazon.aps.iva.if0.c(cVar.toString());
    }

    public static final Integer getColorIntegerOrNull(com.amazon.aps.iva.if0.c cVar, String str) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        if (str == null || !cVar.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(cVar.getInt(str));
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (com.amazon.aps.iva.xb0.a<String>) b.b);
            return null;
        }
    }

    public static final Double getDoubleOrNull(com.amazon.aps.iva.if0.c cVar, String str) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        if (cVar.has(str) && !cVar.isNull(str)) {
            return Double.valueOf(cVar.optDouble(str));
        }
        return null;
    }

    public static final String getOptionalString(com.amazon.aps.iva.if0.c cVar, String str) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        if (cVar.has(str) && !cVar.isNull(str)) {
            return cVar.optString(str);
        }
        return null;
    }

    public static final String getPrettyPrintedString(com.amazon.aps.iva.if0.c cVar) {
        String str = "";
        if (cVar != null) {
            try {
                str = cVar.toString(2);
            } catch (Throwable th) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (com.amazon.aps.iva.xb0.a<String>) c.b);
            }
            com.amazon.aps.iva.yb0.j.e(str, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        }
        return str;
    }

    public static final boolean isEqualTo(com.amazon.aps.iva.if0.c cVar, com.amazon.aps.iva.if0.c cVar2) {
        return areJsonObjectsEqual(cVar, cVar2);
    }

    public static final com.amazon.aps.iva.if0.c mergeJsonObjects(com.amazon.aps.iva.if0.c cVar, com.amazon.aps.iva.if0.c cVar2) {
        com.amazon.aps.iva.yb0.j.f(cVar, "oldJson");
        com.amazon.aps.iva.yb0.j.f(cVar2, "newJson");
        com.amazon.aps.iva.if0.c cVar3 = new com.amazon.aps.iva.if0.c();
        Iterator<String> keys = cVar.keys();
        com.amazon.aps.iva.yb0.j.e(keys, "oldJson.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                cVar3.put(next, cVar.get(next));
            } catch (com.amazon.aps.iva.if0.b e) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, (com.amazon.aps.iva.xb0.a<String>) new i(next));
            }
        }
        Iterator<String> keys2 = cVar2.keys();
        com.amazon.aps.iva.yb0.j.e(keys2, "newJson.keys()");
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            try {
                cVar3.put(next2, cVar2.get(next2));
            } catch (com.amazon.aps.iva.if0.b e2) {
                BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e2, (com.amazon.aps.iva.xb0.a<String>) new j(next2));
            }
        }
        return cVar3;
    }

    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum optEnum(com.amazon.aps.iva.if0.c cVar, String str, Class<TargetEnum> cls, TargetEnum targetenum) {
        com.amazon.aps.iva.yb0.j.f(cVar, "jsonObject");
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(cls, "targetEnumClass");
        try {
            String string = cVar.getString(str);
            com.amazon.aps.iva.yb0.j.e(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            com.amazon.aps.iva.yb0.j.e(locale, "US");
            String upperCase = string.toUpperCase(locale);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            TargetEnum targetenum2 = (TargetEnum) com.braze.support.c.a(upperCase, cls);
            if (targetenum2 != null) {
                return targetenum2;
            }
            return targetenum;
        } catch (Exception unused) {
            return targetenum;
        }
    }

    public static final Bundle parseJsonObjectIntoBundle(String str) {
        boolean z;
        Bundle bundle = new Bundle();
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return bundle;
        }
        try {
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c(str);
            Iterator<String> keys = cVar.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, cVar.getString(next));
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, (Throwable) e, (com.amazon.aps.iva.xb0.a<String>) k.b);
        }
        return bundle;
    }

    public static final com.amazon.aps.iva.if0.c plus(com.amazon.aps.iva.if0.c cVar, com.amazon.aps.iva.if0.c cVar2) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(cVar2, "otherJson");
        return mergeJsonObjects(cVar, cVar2);
    }

    public static final <T> com.amazon.aps.iva.if0.a constructJsonArray(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        com.amazon.aps.iva.if0.a aVar = new com.amazon.aps.iva.if0.a();
        for (T t : tArr) {
            aVar.put(t);
        }
        return aVar;
    }
}
