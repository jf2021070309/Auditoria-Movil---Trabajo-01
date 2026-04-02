package c.m.b.n0;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f2397b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        h.o.c.j.e(fragment, "fragment");
        this.f2397b = viewGroup;
    }
}
