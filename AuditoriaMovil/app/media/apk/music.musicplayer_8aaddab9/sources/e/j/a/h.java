package e.j.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c.p.q;
import e.j.d.w;
import i.a.g1;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class h extends FragmentManager.j {
    public final /* synthetic */ k a;

    public h(k kVar) {
        this.a = kVar;
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public void a(FragmentManager fragmentManager, Fragment fragment) {
        h.o.c.j.e(fragmentManager, "fm");
        h.o.c.j.e(fragment, "f");
        if ((fragment instanceof l) && this.a.f8475c.g()) {
            this.a.f8474b.j(fragment);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public void b(FragmentManager fragmentManager, Fragment fragment) {
        h.o.c.j.e(fragmentManager, "fm");
        h.o.c.j.e(fragment, "f");
        if (!(fragment instanceof l) || this.a.f8475c.g()) {
            return;
        }
        b bVar = this.a.f8474b;
        Objects.requireNonNull(bVar);
        h.o.c.j.e(fragment, "fragment");
        List<m> a = ((l) fragment).a();
        HashMap<String, g1> hashMap = bVar.f8434d;
        String fragment2 = fragment.toString();
        h.o.c.j.d(fragment2, "fragment.toString()");
        hashMap.put(fragment2, w.Y(q.a(fragment), null, null, new e(a, fragment, bVar, null), 3, null));
    }

    @Override // androidx.fragment.app.FragmentManager.j
    public void c(FragmentManager fragmentManager, Fragment fragment) {
        h.o.c.j.e(fragmentManager, "fm");
        h.o.c.j.e(fragment, "f");
        if (fragment instanceof l) {
            this.a.f8474b.j(fragment);
        }
    }
}
