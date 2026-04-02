package c.m.b;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public class c0 {
    public final ArrayList<Fragment> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, b0> f2312b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, FragmentState> f2313c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public z f2314d;

    public void a(Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public void b() {
        this.f2312b.values().removeAll(Collections.singleton(null));
    }

    public Fragment c(String str) {
        b0 b0Var = this.f2312b.get(str);
        if (b0Var != null) {
            return b0Var.f2309c;
        }
        return null;
    }

    public Fragment d(String str) {
        Fragment findFragmentByWho;
        for (b0 b0Var : this.f2312b.values()) {
            if (b0Var != null && (findFragmentByWho = b0Var.f2309c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public List<b0> e() {
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : this.f2312b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var);
            }
        }
        return arrayList;
    }

    public List<Fragment> f() {
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : this.f2312b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var.f2309c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public b0 g(String str) {
        return this.f2312b.get(str);
    }

    public List<Fragment> h() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public void i(b0 b0Var) {
        Fragment fragment = b0Var.f2309c;
        if (this.f2312b.get(fragment.mWho) != null) {
            return;
        }
        this.f2312b.put(fragment.mWho, b0Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f2314d.c(fragment);
            } else {
                this.f2314d.f(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.L(2)) {
            String str = "Added fragment to active set " + fragment;
        }
    }

    public void j(b0 b0Var) {
        Fragment fragment = b0Var.f2309c;
        if (fragment.mRetainInstance) {
            this.f2314d.f(fragment);
        }
        if (this.f2312b.put(fragment.mWho, null) != null && FragmentManager.L(2)) {
            String str = "Removed fragment from active set " + fragment;
        }
    }

    public void k(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    public FragmentState l(String str, FragmentState fragmentState) {
        return fragmentState != null ? this.f2313c.put(str, fragmentState) : this.f2313c.remove(str);
    }
}
