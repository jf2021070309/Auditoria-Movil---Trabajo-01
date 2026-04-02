package c.b.c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class n {
    public static int a = -100;

    /* renamed from: b  reason: collision with root package name */
    public static final c.f.c<WeakReference<n>> f819b = new c.f.c<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f820c = new Object();

    public static void t(n nVar) {
        synchronized (f820c) {
            Iterator<WeakReference<n>> it = f819b.iterator();
            while (it.hasNext()) {
                n nVar2 = it.next().get();
                if (nVar2 == nVar || nVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(CharSequence charSequence);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public Context e(Context context) {
        return context;
    }

    public abstract <T extends View> T f(int i2);

    public int g() {
        return -100;
    }

    public abstract MenuInflater h();

    public abstract a i();

    public abstract void j();

    public abstract void k();

    public abstract void l(Configuration configuration);

    public abstract void m(Bundle bundle);

    public abstract void n();

    public abstract void o(Bundle bundle);

    public abstract void p();

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public abstract boolean u(int i2);

    public abstract void v(int i2);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(Toolbar toolbar);

    public void z(int i2) {
    }
}
