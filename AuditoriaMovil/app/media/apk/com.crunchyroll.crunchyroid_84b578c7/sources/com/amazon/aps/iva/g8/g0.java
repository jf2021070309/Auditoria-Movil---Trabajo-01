package com.amazon.aps.iva.g8;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.g8.t0;
import com.amazon.aps.iva.g8.u;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: NavDestination.kt */
/* loaded from: classes.dex */
public class g0 {
    public static final /* synthetic */ int j = 0;
    public final String b;
    public j0 c;
    public CharSequence d;
    public final ArrayList e;
    public final com.amazon.aps.iva.x.i<d> f;
    public final LinkedHashMap g;
    public int h;
    public String i;

    /* compiled from: NavDestination.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: NavDestination.kt */
        /* renamed from: com.amazon.aps.iva.g8.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0295a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g0, g0> {
            public static final C0295a h = new C0295a();

            public C0295a() {
                super(1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final g0 invoke(g0 g0Var) {
                g0 g0Var2 = g0Var;
                com.amazon.aps.iva.yb0.j.f(g0Var2, "it");
                return g0Var2.c;
            }
        }

        public static String a(String str) {
            if (str != null) {
                return "android-app://androidx.navigation/".concat(str);
            }
            return "";
        }

        public static String b(int i, Context context) {
            String valueOf;
            com.amazon.aps.iva.yb0.j.f(context, "context");
            if (i <= 16777215) {
                return String.valueOf(i);
            }
            try {
                valueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i);
            }
            com.amazon.aps.iva.yb0.j.e(valueOf, "try {\n                co….toString()\n            }");
            return valueOf;
        }

        public static com.amazon.aps.iva.ne0.h c(g0 g0Var) {
            com.amazon.aps.iva.yb0.j.f(g0Var, "<this>");
            return com.amazon.aps.iva.ne0.k.R(g0Var, C0295a.h);
        }
    }

    /* compiled from: NavDestination.kt */
    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {
        public final g0 b;
        public final Bundle c;
        public final boolean d;
        public final int e;
        public final boolean f;
        public final int g;

        public b(g0 g0Var, Bundle bundle, boolean z, int i, boolean z2, int i2) {
            com.amazon.aps.iva.yb0.j.f(g0Var, FirebaseAnalytics.Param.DESTINATION);
            this.b = g0Var;
            this.c = bundle;
            this.d = z;
            this.e = i;
            this.f = z2;
            this.g = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public final int compareTo(b bVar) {
            com.amazon.aps.iva.yb0.j.f(bVar, "other");
            boolean z = bVar.d;
            boolean z2 = this.d;
            if (z2 && !z) {
                return 1;
            }
            if (!z2 && z) {
                return -1;
            }
            int i = this.e - bVar.e;
            if (i > 0) {
                return 1;
            }
            if (i < 0) {
                return -1;
            }
            Bundle bundle = bVar.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle == null) {
                return 1;
            }
            if (bundle2 == null && bundle != null) {
                return -1;
            }
            if (bundle2 != null) {
                int size = bundle2.size();
                com.amazon.aps.iva.yb0.j.c(bundle);
                int size2 = size - bundle.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z3 = bVar.f;
            boolean z4 = this.f;
            if (z4 && !z3) {
                return 1;
            }
            if (!z4 && z3) {
                return -1;
            }
            return this.g - bVar.g;
        }
    }

    /* compiled from: NavDestination.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, Boolean> {
        public final /* synthetic */ u h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u uVar) {
            super(1);
            this.h = uVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Boolean invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "key");
            u uVar = this.h;
            ArrayList arrayList = uVar.d;
            ArrayList arrayList2 = new ArrayList();
            for (u.a aVar : ((Map) uVar.h.getValue()).values()) {
                com.amazon.aps.iva.lb0.t.d0(arrayList2, aVar.b);
            }
            return Boolean.valueOf(!com.amazon.aps.iva.lb0.x.L0((List) uVar.k.getValue(), com.amazon.aps.iva.lb0.x.L0(arrayList2, arrayList)).contains(str2));
        }
    }

    static {
        new LinkedHashMap();
    }

    public g0(r0<? extends g0> r0Var) {
        com.amazon.aps.iva.yb0.j.f(r0Var, "navigator");
        LinkedHashMap linkedHashMap = t0.b;
        this.b = t0.a.a(r0Var.getClass());
        this.e = new ArrayList();
        this.f = new com.amazon.aps.iva.x.i<>();
        this.g = new LinkedHashMap();
    }

    public final void b(u uVar) {
        com.amazon.aps.iva.yb0.j.f(uVar, "navDeepLink");
        ArrayList H = com.amazon.aps.iva.e.z.H(g(), new c(uVar));
        if (H.isEmpty()) {
            this.e.add(uVar);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + uVar.a + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + H).toString());
    }

    public final Bundle d(Bundle bundle) {
        boolean z;
        LinkedHashMap linkedHashMap = this.g;
        if (bundle == null) {
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return null;
            }
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((e) entry.getValue()).getClass();
            com.amazon.aps.iva.yb0.j.f((String) entry.getKey(), AppMeasurementSdk.ConditionalUserProperty.NAME);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str = (String) entry2.getKey();
                ((e) entry2.getValue()).getClass();
                com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (bundle2.containsKey(str)) {
                    bundle2.get(str).getClass();
                }
                throw null;
            }
        }
        return bundle2;
    }

    public final int[] e(g0 g0Var) {
        j0 j0Var;
        com.amazon.aps.iva.lb0.k kVar = new com.amazon.aps.iva.lb0.k();
        j0 j0Var2 = this;
        while (true) {
            j0 j0Var3 = j0Var2.c;
            if (g0Var != null) {
                j0Var = g0Var.c;
            } else {
                j0Var = null;
            }
            if (j0Var != null) {
                j0 j0Var4 = g0Var.c;
                com.amazon.aps.iva.yb0.j.c(j0Var4);
                if (j0Var4.n(j0Var2.h, true) == j0Var2) {
                    kVar.addFirst(j0Var2);
                    break;
                }
            }
            if (j0Var3 == null || j0Var3.l != j0Var2.h) {
                kVar.addFirst(j0Var2);
            }
            if (com.amazon.aps.iva.yb0.j.a(j0Var3, g0Var) || j0Var3 == null) {
                break;
            }
            j0Var2 = j0Var3;
        }
        List<g0> X0 = com.amazon.aps.iva.lb0.x.X0(kVar);
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(X0));
        for (g0 g0Var2 : X0) {
            arrayList.add(Integer.valueOf(g0Var2.h));
        }
        return com.amazon.aps.iva.lb0.x.W0(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g8.g0.equals(java.lang.Object):boolean");
    }

    public final Map<String, e> g() {
        return com.amazon.aps.iva.lb0.i0.a0(this.g);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.h * 31;
        String str = this.i;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i6 + i;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            int i8 = i7 * 31;
            String str2 = uVar.a;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i9 = (i8 + i3) * 31;
            String str3 = uVar.b;
            if (str3 != null) {
                i4 = str3.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = (i9 + i4) * 31;
            String str4 = uVar.c;
            if (str4 != null) {
                i5 = str4.hashCode();
            } else {
                i5 = 0;
            }
            i7 = i10 + i5;
        }
        com.amazon.aps.iva.x.j y = com.amazon.aps.iva.a60.b.y(this.f);
        while (y.hasNext()) {
            ((d) y.next()).getClass();
            i7 = (((i7 * 31) + 0) * 31) + 0;
        }
        for (String str5 : g().keySet()) {
            int b2 = com.amazon.aps.iva.c80.a.b(str5, i7 * 31, 31);
            e eVar = g().get(str5);
            if (eVar != null) {
                i2 = eVar.hashCode();
            } else {
                i2 = 0;
            }
            i7 = b2 + i2;
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
        if (r1 != false) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.amazon.aps.iva.g8.g0.b j(com.amazon.aps.iva.g8.f0 r19) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g8.g0.j(com.amazon.aps.iva.g8.f0):com.amazon.aps.iva.g8.g0$b");
    }

    public final b k(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "route");
        Uri parse = Uri.parse(a.a(str));
        com.amazon.aps.iva.yb0.j.b(parse, "Uri.parse(this)");
        f0 f0Var = new f0(parse, null, null);
        if (this instanceof j0) {
            return ((j0) this).p(f0Var);
        }
        return j(f0Var);
    }

    public final void l(String str) {
        Object obj;
        if (str == null) {
            this.h = 0;
        } else if (!com.amazon.aps.iva.oe0.m.b0(str)) {
            String a2 = a.a(str);
            this.h = a2.hashCode();
            b(new u(a2));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        ArrayList arrayList = this.e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (com.amazon.aps.iva.yb0.j.a(((u) obj).a, a.a(this.i))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.amazon.aps.iva.yb0.h0.a(arrayList);
        arrayList.remove(obj);
        this.i = str;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        sb.append("0x");
        sb.append(Integer.toHexString(this.h));
        sb.append(")");
        String str = this.i;
        if (str != null && !com.amazon.aps.iva.oe0.m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(" route=");
            sb.append(this.i);
        }
        if (this.d != null) {
            sb.append(" label=");
            sb.append(this.d);
        }
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "sb.toString()");
        return sb2;
    }
}
