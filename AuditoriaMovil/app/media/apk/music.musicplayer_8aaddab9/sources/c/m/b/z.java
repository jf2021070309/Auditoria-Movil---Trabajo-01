package c.m.b;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class z extends c.p.g0 {

    /* renamed from: c  reason: collision with root package name */
    public static final c.p.i0 f2414c = new a();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2418g;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, Fragment> f2415d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, z> f2416e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<String, c.p.m0> f2417f = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f2419h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2420i = false;

    /* loaded from: classes.dex */
    public class a implements c.p.i0 {
        @Override // c.p.i0
        public <T extends c.p.g0> T a(Class<T> cls) {
            return new z(true);
        }
    }

    public z(boolean z) {
        this.f2418g = z;
    }

    @Override // c.p.g0
    public void a() {
        if (FragmentManager.L(3)) {
            String str = "onCleared called for " + this;
        }
        this.f2419h = true;
    }

    public void c(Fragment fragment) {
        if (this.f2420i) {
            FragmentManager.L(2);
        } else if (this.f2415d.containsKey(fragment.mWho)) {
        } else {
            this.f2415d.put(fragment.mWho, fragment);
            if (FragmentManager.L(2)) {
                String str = "Updating retained Fragments: Added " + fragment;
            }
        }
    }

    public void d(Fragment fragment) {
        if (FragmentManager.L(3)) {
            String str = "Clearing non-config state for " + fragment;
        }
        e(fragment.mWho);
    }

    public final void e(String str) {
        z zVar = this.f2416e.get(str);
        if (zVar != null) {
            zVar.a();
            this.f2416e.remove(str);
        }
        c.p.m0 m0Var = this.f2417f.get(str);
        if (m0Var != null) {
            m0Var.a();
            this.f2417f.remove(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f2415d.equals(zVar.f2415d) && this.f2416e.equals(zVar.f2416e) && this.f2417f.equals(zVar.f2417f);
    }

    public void f(Fragment fragment) {
        if (this.f2420i) {
            FragmentManager.L(2);
            return;
        }
        if ((this.f2415d.remove(fragment.mWho) != null) && FragmentManager.L(2)) {
            String str = "Updating retained Fragments: Removed " + fragment;
        }
    }

    public boolean g(Fragment fragment) {
        if (this.f2415d.containsKey(fragment.mWho) && this.f2418g) {
            return this.f2419h;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f2416e.hashCode();
        return this.f2417f.hashCode() + ((hashCode + (this.f2415d.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2415d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2416e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2417f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }
}
