package c.m.b.n0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f2398b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        h.o.c.j.e(fragment, "fragment");
        h.o.c.j.e(viewGroup, "container");
        this.f2398b = viewGroup;
    }
}
