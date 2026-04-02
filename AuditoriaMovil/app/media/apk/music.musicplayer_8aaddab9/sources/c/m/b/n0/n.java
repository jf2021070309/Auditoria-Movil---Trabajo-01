package c.m.b.n0;

import androidx.fragment.app.Fragment;
/* loaded from: classes.dex */
public abstract class n extends RuntimeException {
    public final Fragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Fragment fragment, String str) {
        super(str);
        h.o.c.j.e(fragment, "fragment");
        this.a = fragment;
    }
}
