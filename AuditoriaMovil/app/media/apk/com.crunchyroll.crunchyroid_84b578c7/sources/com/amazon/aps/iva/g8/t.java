package com.amazon.aps.iva.g8;

import androidx.lifecycle.u;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: NavControllerViewModel.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.i5.f0 implements q0 {
    public static final a c = new a();
    public final LinkedHashMap b = new LinkedHashMap();

    /* compiled from: NavControllerViewModel.kt */
    /* loaded from: classes.dex */
    public static final class a implements u.b {
        @Override // androidx.lifecycle.u.b
        public final <T extends com.amazon.aps.iva.i5.f0> T b(Class<T> cls) {
            com.amazon.aps.iva.yb0.j.f(cls, "modelClass");
            return new t();
        }
    }

    @Override // com.amazon.aps.iva.g8.q0
    public final com.amazon.aps.iva.i5.g0 h1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.b;
        com.amazon.aps.iva.i5.g0 g0Var = (com.amazon.aps.iva.i5.g0) linkedHashMap.get(str);
        if (g0Var == null) {
            com.amazon.aps.iva.i5.g0 g0Var2 = new com.amazon.aps.iva.i5.g0();
            linkedHashMap.put(str, g0Var2);
            return g0Var2;
        }
        return g0Var;
    }

    @Override // com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.b;
        for (com.amazon.aps.iva.i5.g0 g0Var : linkedHashMap.values()) {
            g0Var.a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "sb.toString()");
        return sb2;
    }
}
