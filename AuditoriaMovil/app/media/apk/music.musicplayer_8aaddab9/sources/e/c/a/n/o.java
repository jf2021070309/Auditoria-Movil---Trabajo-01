package e.c.a.n;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public class o extends Fragment {
    public final e.c.a.n.a a;

    /* renamed from: b  reason: collision with root package name */
    public final m f5969b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<o> f5970c;

    /* renamed from: d  reason: collision with root package name */
    public o f5971d;

    /* renamed from: e  reason: collision with root package name */
    public e.c.a.i f5972e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f5973f;

    /* loaded from: classes.dex */
    public class a implements m {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        e.c.a.n.a aVar = new e.c.a.n.a();
        this.f5969b = new a();
        this.f5970c = new HashSet();
        this.a = aVar;
    }

    public final Fragment b() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f5973f;
    }

    public final void c(Context context, FragmentManager fragmentManager) {
        d();
        l lVar = e.c.a.b.b(context).f5442h;
        Objects.requireNonNull(lVar);
        o g2 = lVar.g(fragmentManager, null, l.h(context));
        this.f5971d = g2;
        if (equals(g2)) {
            return;
        }
        this.f5971d.f5970c.add(this);
    }

    public final void d() {
        o oVar = this.f5971d;
        if (oVar != null) {
            oVar.f5970c.remove(this);
            this.f5971d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            c(getContext(), fragmentManager);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f5973f = null;
        d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + b() + "}";
    }
}
