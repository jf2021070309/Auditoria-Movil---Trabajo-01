package com.braze.support;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to create valid enum from string: " + this.b;
        }
    }

    private c() {
    }

    public static final Enum a(String str, Class cls) {
        j.f(str, "enumValue");
        j.f(cls, "targetEnumClass");
        return Enum.valueOf(cls, str);
    }

    public static final EnumSet a(Class cls, Set set) {
        j.f(cls, "targetEnumClass");
        j.f(set, "sourceStringSet");
        EnumSet noneOf = EnumSet.noneOf(cls);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Locale locale = Locale.US;
                j.e(locale, "US");
                String upperCase = str.toUpperCase(locale);
                j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
                noneOf.add(a(upperCase, cls));
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.E, e, new a(str));
            }
        }
        j.e(noneOf, "result");
        return noneOf;
    }

    public static final Set a(EnumSet enumSet) {
        j.f(enumSet, "sourceEnumSet");
        ArrayList arrayList = new ArrayList(r.Y(enumSet));
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Enum) it.next()).name());
        }
        return x.c1(arrayList);
    }
}
