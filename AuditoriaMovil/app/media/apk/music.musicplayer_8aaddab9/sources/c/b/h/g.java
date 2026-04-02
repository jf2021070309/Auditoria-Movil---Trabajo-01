package c.b.h;

import android.view.View;
import android.view.animation.Interpolator;
import c.i.k.f0;
import c.i.k.g0;
import c.i.k.h0;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f943c;

    /* renamed from: d  reason: collision with root package name */
    public g0 f944d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f945e;

    /* renamed from: b  reason: collision with root package name */
    public long f942b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final h0 f946f = new a();
    public final ArrayList<f0> a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends h0 {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f947b = 0;

        public a() {
        }

        @Override // c.i.k.g0
        public void b(View view) {
            int i2 = this.f947b + 1;
            this.f947b = i2;
            if (i2 == g.this.a.size()) {
                g0 g0Var = g.this.f944d;
                if (g0Var != null) {
                    g0Var.b(null);
                }
                this.f947b = 0;
                this.a = false;
                g.this.f945e = false;
            }
        }

        @Override // c.i.k.h0, c.i.k.g0
        public void c(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            g0 g0Var = g.this.f944d;
            if (g0Var != null) {
                g0Var.c(null);
            }
        }
    }

    public void a() {
        if (this.f945e) {
            Iterator<f0> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f945e = false;
        }
    }

    public void b() {
        View view;
        if (this.f945e) {
            return;
        }
        Iterator<f0> it = this.a.iterator();
        while (it.hasNext()) {
            f0 next = it.next();
            long j2 = this.f942b;
            if (j2 >= 0) {
                next.c(j2);
            }
            Interpolator interpolator = this.f943c;
            if (interpolator != null && (view = next.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f944d != null) {
                next.d(this.f946f);
            }
            View view2 = next.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f945e = true;
    }
}
