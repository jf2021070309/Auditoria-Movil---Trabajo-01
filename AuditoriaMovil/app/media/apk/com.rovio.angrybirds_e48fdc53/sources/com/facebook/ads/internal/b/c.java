package com.facebook.ads.internal.b;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.io.Serializable;
/* loaded from: classes2.dex */
public class c implements Serializable {
    private a a;
    private a b;

    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        private double a;
        private double b;
        private double c;
        private double d;
        private double e;
        private double f;
        private double g;
        private int h;
        private double i;
        private double j;
        private double k;

        public a(double d) {
            this.e = d;
        }

        public void a() {
            this.a = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
            this.c = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
            this.d = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
            this.f = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
            this.h = 0;
            this.i = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
            this.j = 1.0d;
            this.k = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        }

        public void a(double d, double d2) {
            this.h++;
            this.i += d;
            this.c = d2;
            this.k += d2 * d;
            this.a = this.k / this.i;
            this.j = Math.min(this.j, d2);
            this.f = Math.max(this.f, d2);
            if (d2 < this.e) {
                this.b = PangleAdapterUtils.CPM_DEFLAUT_VALUE;
                return;
            }
            this.d += d;
            this.b += d;
            this.g = Math.max(this.g, this.b);
        }

        public double b() {
            return this.h == 0 ? PangleAdapterUtils.CPM_DEFLAUT_VALUE : this.j;
        }

        public double c() {
            return this.a;
        }

        public double d() {
            return this.f;
        }

        public double e() {
            return this.i;
        }

        public double f() {
            return this.d;
        }

        public double g() {
            return this.g;
        }
    }

    public c() {
        this(0.5d, 0.05d);
    }

    public c(double d) {
        this(d, 0.05d);
    }

    public c(double d, double d2) {
        this.a = new a(d);
        this.b = new a(d2);
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.a.a();
        this.b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(double d, double d2) {
        this.a.a(d, d2);
    }

    public a b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(double d, double d2) {
        this.b.a(d, d2);
    }

    public a c() {
        return this.b;
    }
}
