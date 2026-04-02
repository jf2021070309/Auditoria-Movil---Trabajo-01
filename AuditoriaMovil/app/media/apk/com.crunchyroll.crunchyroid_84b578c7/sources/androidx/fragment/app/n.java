package androidx.fragment.app;

import androidx.lifecycle.u;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.i5.g0;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public final class n extends f0 {
    public static final a h = new a();
    public final boolean e;
    public final HashMap<String, Fragment> b = new HashMap<>();
    public final HashMap<String, n> c = new HashMap<>();
    public final HashMap<String, g0> d = new HashMap<>();
    public boolean f = false;
    public boolean g = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    public class a implements u.b {
        @Override // androidx.lifecycle.u.b
        public final <T extends f0> T b(Class<T> cls) {
            return new n(true);
        }
    }

    public n(boolean z) {
        this.e = z;
    }

    public final void N8(Fragment fragment) {
        if (this.g) {
            FragmentManager.H(2);
            return;
        }
        HashMap<String, Fragment> hashMap = this.b;
        if (hashMap.containsKey(fragment.mWho)) {
            return;
        }
        hashMap.put(fragment.mWho, fragment);
        if (FragmentManager.H(2)) {
            fragment.toString();
        }
    }

    public final void O8(String str) {
        HashMap<String, n> hashMap = this.c;
        n nVar = hashMap.get(str);
        if (nVar != null) {
            nVar.onCleared();
            hashMap.remove(str);
        }
        HashMap<String, g0> hashMap2 = this.d;
        g0 g0Var = hashMap2.get(str);
        if (g0Var != null) {
            g0Var.a();
            hashMap2.remove(str);
        }
    }

    public final void P8(Fragment fragment) {
        boolean z;
        if (this.g) {
            FragmentManager.H(2);
            return;
        }
        if (this.b.remove(fragment.mWho) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && FragmentManager.H(2)) {
            fragment.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (this.b.equals(nVar.b) && this.c.equals(nVar.c) && this.d.equals(nVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    @Override // com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        if (FragmentManager.H(3)) {
            toString();
        }
        this.f = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
