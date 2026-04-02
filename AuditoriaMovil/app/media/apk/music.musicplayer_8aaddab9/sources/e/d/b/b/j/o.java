package e.d.b.b.j;

import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class o implements g.a.a {

    /* loaded from: classes.dex */
    public static final class a {
        public static final o a = new o();
    }

    @Override // g.a.a
    public Object get() {
        return new q(Executors.newSingleThreadExecutor());
    }
}
