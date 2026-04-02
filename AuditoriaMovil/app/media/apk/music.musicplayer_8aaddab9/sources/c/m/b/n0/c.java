package c.m.b.n0;

import androidx.fragment.app.Fragment;
/* loaded from: classes.dex */
public final class c extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        h.o.c.j.e(fragment, "fragment");
        h.o.c.j.e(str, "previousFragmentId");
    }
}
