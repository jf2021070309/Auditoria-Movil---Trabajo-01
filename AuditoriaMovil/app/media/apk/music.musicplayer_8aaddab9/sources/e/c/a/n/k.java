package e.c.a.n;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Deprecated
/* loaded from: classes.dex */
public class k extends Fragment {
    public final e.c.a.n.a a;

    /* renamed from: b  reason: collision with root package name */
    public final m f5954b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<k> f5955c;

    /* renamed from: d  reason: collision with root package name */
    public e.c.a.i f5956d;

    /* renamed from: e  reason: collision with root package name */
    public k f5957e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f5958f;

    /* loaded from: classes.dex */
    public class a implements m {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        e.c.a.n.a aVar = new e.c.a.n.a();
        this.f5954b = new a();
        this.f5955c = new HashSet();
        this.a = aVar;
    }

    public final void a(Activity activity) {
        b();
        l lVar = e.c.a.b.b(activity).f5442h;
        Objects.requireNonNull(lVar);
        k f2 = lVar.f(activity.getFragmentManager(), null, l.h(activity));
        this.f5957e = f2;
        if (equals(f2)) {
            return;
        }
        this.f5957e.f5955c.add(this);
    }

    public final void b() {
        k kVar = this.f5957e;
        if (kVar != null) {
            kVar.f5955c.remove(this);
            this.f5957e = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        b();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f5958f;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
