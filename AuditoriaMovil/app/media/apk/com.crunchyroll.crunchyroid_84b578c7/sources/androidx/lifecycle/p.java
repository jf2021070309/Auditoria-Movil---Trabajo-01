package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.ve0.g0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: SavedStateHandle.kt */
/* loaded from: classes.dex */
public final class p {
    public static final Class<? extends Object>[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final a.b e;

    /* compiled from: SavedStateHandle.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static p a(Bundle bundle, Bundle bundle2) {
            boolean z;
            if (bundle == null) {
                if (bundle2 == null) {
                    return new p();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    com.amazon.aps.iva.yb0.j.e(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new p(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parcelableArrayList.get(i);
                    com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                }
                return new p(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
    }

    public p(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new a.b() { // from class: com.amazon.aps.iva.i5.x
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                return androidx.lifecycle.p.a(androidx.lifecycle.p.this);
            }
        };
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "this$0");
        for (Map.Entry entry : i0.a0(pVar.b).entrySet()) {
            pVar.d(((a.b) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = pVar.a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return com.amazon.aps.iva.k3.e.a(new com.amazon.aps.iva.kb0.j("keys", arrayList), new com.amazon.aps.iva.kb0.j("values", arrayList2));
    }

    public final <T> T b(String str) {
        LinkedHashMap linkedHashMap = this.a;
        com.amazon.aps.iva.yb0.j.f(str, "key");
        try {
            return (T) linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            b bVar = (b) this.c.remove(str);
            if (bVar != null) {
                bVar.m = null;
            }
            this.d.remove(str);
            return null;
        }
    }

    public final <T> com.amazon.aps.iva.i5.v<T> c(String str) {
        b bVar;
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(str);
        if (obj instanceof com.amazon.aps.iva.i5.v) {
            bVar = (com.amazon.aps.iva.i5.v) obj;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap2.containsKey(str)) {
                bVar = new b(this, str, linkedHashMap2.get(str));
            } else {
                bVar = new b(this, str);
            }
            linkedHashMap.put(str, bVar);
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "key"
            com.amazon.aps.iva.yb0.j.f(r6, r0)
            if (r5 != 0) goto L8
            goto L1b
        L8:
            java.lang.Class<? extends java.lang.Object>[] r0 = androidx.lifecycle.p.f
            r1 = 0
            r2 = r1
        Lc:
            r3 = 29
            if (r2 >= r3) goto L20
            r3 = r0[r2]
            com.amazon.aps.iva.yb0.j.c(r3)
            boolean r3 = r3.isInstance(r5)
            if (r3 == 0) goto L1d
        L1b:
            r1 = 1
            goto L20
        L1d:
            int r2 = r2 + 1
            goto Lc
        L20:
            if (r1 == 0) goto L4a
            java.util.LinkedHashMap r0 = r4.c
            java.lang.Object r0 = r0.get(r6)
            boolean r1 = r0 instanceof com.amazon.aps.iva.i5.v
            if (r1 == 0) goto L2f
            com.amazon.aps.iva.i5.v r0 = (com.amazon.aps.iva.i5.v) r0
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L36
            r0.k(r5)
            goto L3b
        L36:
            java.util.LinkedHashMap r0 = r4.a
            r0.put(r6, r5)
        L3b:
            java.util.LinkedHashMap r0 = r4.d
            java.lang.Object r6 = r0.get(r6)
            com.amazon.aps.iva.ve0.g0 r6 = (com.amazon.aps.iva.ve0.g0) r6
            if (r6 != 0) goto L46
            goto L49
        L46:
            r6.setValue(r5)
        L49:
            return
        L4a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't put value with type "
            r0.<init>(r1)
            com.amazon.aps.iva.yb0.j.c(r5)
            java.lang.Class r5 = r5.getClass()
            r0.append(r5)
            java.lang.String r5 = " into saved state"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.p.d(java.lang.Object, java.lang.String):void");
    }

    /* compiled from: SavedStateHandle.kt */
    /* loaded from: classes.dex */
    public static final class b<T> extends com.amazon.aps.iva.i5.v<T> {
        public final String l;
        public p m;

        public b(p pVar, String str, T t) {
            super(t);
            this.l = str;
            this.m = pVar;
        }

        @Override // com.amazon.aps.iva.i5.v, androidx.lifecycle.LiveData
        public final void k(T t) {
            p pVar = this.m;
            if (pVar != null) {
                LinkedHashMap linkedHashMap = pVar.a;
                String str = this.l;
                linkedHashMap.put(str, t);
                g0 g0Var = (g0) pVar.d.get(str);
                if (g0Var != null) {
                    g0Var.setValue(t);
                }
            }
            super.k(t);
        }

        public b(p pVar, String str) {
            this.l = str;
            this.m = pVar;
        }
    }

    public p() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new com.amazon.aps.iva.n4.s(this, 1);
    }
}
