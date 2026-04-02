package com.amazon.aps.iva.dr;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import androidx.fragment.app.l;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fr.e;
import com.amazon.aps.iva.gr.g;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import java.util.Map;
/* compiled from: AndroidXFragmentLifecycleCallbacks.kt */
/* loaded from: classes2.dex */
public final class a extends FragmentManager.l implements b<h> {
    public final l<Fragment, Map<String, Object>> a;
    public final com.amazon.aps.iva.gr.f<Fragment> b;
    public final f c;
    public final com.amazon.aps.iva.sq.f d;
    public final com.amazon.aps.iva.ar.a e;

    public a(g gVar, com.amazon.aps.iva.gr.f fVar, com.amazon.aps.iva.sq.f fVar2, com.amazon.aps.iva.ar.a aVar) {
        f fVar3 = new f();
        j.f(fVar, "componentPredicate");
        j.f(fVar2, "rumMonitor");
        this.a = gVar;
        this.b = fVar;
        this.c = fVar3;
        this.d = fVar2;
        this.e = aVar;
    }

    @Override // com.amazon.aps.iva.dr.b
    public final void a(h hVar) {
        h hVar2 = hVar;
        j.f(hVar2, "activity");
        hVar2.getSupportFragmentManager().n.a.add(new l.a(this, true));
    }

    @Override // com.amazon.aps.iva.dr.b
    public final void b(h hVar) {
        h hVar2 = hVar;
        j.f(hVar2, "activity");
        hVar2.getSupportFragmentManager().h0(this);
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void c(FragmentManager fragmentManager, Fragment fragment) {
        Window window;
        j.f(fragmentManager, "fm");
        j.f(fragment, "f");
        Context context = fragment.getContext();
        if ((fragment instanceof androidx.fragment.app.g) && context != null) {
            Dialog dialog = ((androidx.fragment.app.g) fragment).getDialog();
            if (dialog == null) {
                window = null;
            } else {
                window = dialog.getWindow();
            }
            com.amazon.aps.iva.tq.c.f.getClass();
            com.amazon.aps.iva.tq.c.k.g().a(context, window);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void d(FragmentManager fragmentManager, Fragment fragment, Context context) {
        j.f(fragmentManager, "fm");
        j.f(fragment, "f");
        j.f(context, "context");
        if (this.b.a(fragment)) {
            try {
                this.c.c(fragment);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void e(FragmentManager fragmentManager, Fragment fragment) {
        j.f(fragmentManager, "fm");
        j.f(fragment, "f");
        if (this.b.a(fragment)) {
            try {
                f fVar = this.c;
                fVar.getClass();
                fVar.a.remove(fragment);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void f(FragmentManager fragmentManager, Fragment fragment) {
        j.f(fragmentManager, "fm");
        j.f(fragment, "f");
        if (this.b.a(fragment)) {
            try {
                this.d.e(fragment, a0.b);
                this.c.e(fragment);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void g(FragmentManager fragmentManager, Fragment fragment) {
        e.r rVar;
        f fVar = this.c;
        j.f(fragmentManager, "fm");
        j.f(fragment, "f");
        com.amazon.aps.iva.gr.f<Fragment> fVar2 = this.b;
        if (fVar2.a(fragment)) {
            try {
                fVar.d(fragment);
                fVar2.b(fragment);
                this.d.l(fragment, this.a.invoke(fragment), l1.F(fragment));
                Long a = fVar.a(fragment);
                if (a != null) {
                    com.amazon.aps.iva.ar.a aVar = this.e;
                    long longValue = a.longValue();
                    if (fVar.b(fragment)) {
                        rVar = e.r.FRAGMENT_DISPLAY;
                    } else {
                        rVar = e.r.FRAGMENT_REDISPLAY;
                    }
                    aVar.m(fragment, longValue, rVar);
                }
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void h(FragmentManager fragmentManager, Fragment fragment) {
        j.f(fragmentManager, "fm");
        j.f(fragment, "f");
        if (this.b.a(fragment)) {
            try {
                this.c.f(fragment);
            } catch (Exception e) {
                l1.z(com.amazon.aps.iva.dq.c.a, "Internal operation failed", e, 4);
            }
        }
    }
}
