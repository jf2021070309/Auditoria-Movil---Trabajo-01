package c.m.b.n0;

import androidx.fragment.app.Fragment;
/* loaded from: classes.dex */
public final class k extends m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Fragment fragment, Fragment fragment2, int i2) {
        super(fragment, "Attempting to set target fragment " + fragment2 + " with request code " + i2 + " for fragment " + fragment);
        h.o.c.j.e(fragment, "fragment");
        h.o.c.j.e(fragment2, "targetFragment");
    }
}
