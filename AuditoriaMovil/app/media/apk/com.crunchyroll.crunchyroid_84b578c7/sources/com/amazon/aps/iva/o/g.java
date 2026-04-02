package com.amazon.aps.iva.o;

import android.view.View;
import android.view.animation.Interpolator;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.p3.s0;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public final class g {
    public Interpolator c;
    public s0 d;
    public boolean e;
    public long b = -1;
    public final a f = new a();
    public final ArrayList<r0> a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes.dex */
    public class a extends k0 {
        public boolean j = false;
        public int k = 0;

        public a() {
        }

        @Override // com.amazon.aps.iva.a9.k0, com.amazon.aps.iva.p3.s0
        public final void c() {
            if (this.j) {
                return;
            }
            this.j = true;
            s0 s0Var = g.this.d;
            if (s0Var != null) {
                s0Var.c();
            }
        }

        @Override // com.amazon.aps.iva.p3.s0
        public final void onAnimationEnd() {
            int i = this.k + 1;
            this.k = i;
            g gVar = g.this;
            if (i == gVar.a.size()) {
                s0 s0Var = gVar.d;
                if (s0Var != null) {
                    s0Var.onAnimationEnd();
                }
                this.k = 0;
                this.j = false;
                gVar.e = false;
            }
        }
    }

    public final void a() {
        if (!this.e) {
            return;
        }
        Iterator<r0> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.e = false;
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator<r0> it = this.a.iterator();
        while (it.hasNext()) {
            r0 next = it.next();
            long j = this.b;
            if (j >= 0) {
                next.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = next.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                next.d(this.f);
            }
            View view2 = next.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
