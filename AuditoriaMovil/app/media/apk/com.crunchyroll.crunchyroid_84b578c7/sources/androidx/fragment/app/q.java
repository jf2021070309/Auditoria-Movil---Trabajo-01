package androidx.fragment.app;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
public final class q {
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, p> b = new HashMap<>();
    public final HashMap<String, Bundle> c = new HashMap<>();
    public n d;

    public final void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public final Fragment b(String str) {
        p pVar = this.b.get(str);
        if (pVar != null) {
            return pVar.c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment findFragmentByWho;
        for (p pVar : this.b.values()) {
            if (pVar != null && (findFragmentByWho = pVar.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (p pVar : this.b.values()) {
            if (pVar != null) {
                arrayList.add(pVar);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (p pVar : this.b.values()) {
            if (pVar != null) {
                arrayList.add(pVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(p pVar) {
        boolean z;
        Fragment fragment = pVar.c;
        String str = fragment.mWho;
        HashMap<String, p> hashMap = this.b;
        if (hashMap.get(str) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        hashMap.put(fragment.mWho, pVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.d.N8(fragment);
            } else {
                this.d.P8(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.H(2)) {
            fragment.toString();
        }
    }

    public final void h(p pVar) {
        Fragment fragment = pVar.c;
        if (fragment.mRetainInstance) {
            this.d.P8(fragment);
        }
        HashMap<String, p> hashMap = this.b;
        if (hashMap.get(fragment.mWho) == pVar && hashMap.put(fragment.mWho, null) != null && FragmentManager.H(2)) {
            fragment.toString();
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap<String, Bundle> hashMap = this.c;
        if (bundle != null) {
            return hashMap.put(str, bundle);
        }
        return hashMap.remove(str);
    }
}
