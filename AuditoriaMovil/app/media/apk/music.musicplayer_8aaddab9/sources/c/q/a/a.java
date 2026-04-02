package c.q.a;

import android.os.Bundle;
import c.p.n0;
import c.p.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c.q.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0047a<D> {
        c.q.b.b<D> onCreateLoader(int i2, Bundle bundle);

        void onLoadFinished(c.q.b.b<D> bVar, D d2);

        void onLoaderReset(c.q.b.b<D> bVar);
    }

    public static <T extends p & n0> a b(T t) {
        return new b(t, t.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
