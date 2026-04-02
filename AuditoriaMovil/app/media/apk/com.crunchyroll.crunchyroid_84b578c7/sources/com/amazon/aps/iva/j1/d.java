package com.amazon.aps.iva.j1;

import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.lb0.z;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ImageVector.kt */
/* loaded from: classes.dex */
public final class d {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final n f;
    public final long g;
    public final int h;
    public final boolean i;

    /* compiled from: ImageVector.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final String a = "";
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final long f;
        public final int g;
        public final boolean h;
        public final ArrayList<C0394a> i;
        public final C0394a j;
        public boolean k;

        /* compiled from: ImageVector.kt */
        /* renamed from: com.amazon.aps.iva.j1.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0394a {
            public final String a;
            public final float b;
            public final float c;
            public final float d;
            public final float e;
            public final float f;
            public final float g;
            public final float h;
            public final List<? extends f> i;
            public final List<p> j;

            public C0394a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }

            public C0394a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                str = (i & 1) != 0 ? "" : str;
                f = (i & 2) != 0 ? 0.0f : f;
                f2 = (i & 4) != 0 ? 0.0f : f2;
                f3 = (i & 8) != 0 ? 0.0f : f3;
                f4 = (i & 16) != 0 ? 1.0f : f4;
                f5 = (i & 32) != 0 ? 1.0f : f5;
                f6 = (i & 64) != 0 ? 0.0f : f6;
                f7 = (i & 128) != 0 ? 0.0f : f7;
                if ((i & 256) != 0) {
                    int i2 = o.a;
                    list = z.b;
                }
                ArrayList arrayList = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? new ArrayList() : null;
                com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
                com.amazon.aps.iva.yb0.j.f(list, "clipPathData");
                com.amazon.aps.iva.yb0.j.f(arrayList, "children");
                this.a = str;
                this.b = f;
                this.c = f2;
                this.d = f3;
                this.e = f4;
                this.f = f5;
                this.g = f6;
                this.h = f7;
                this.i = list;
                this.j = arrayList;
            }
        }

        public a(float f, float f2, float f3, float f4, long j, int i, boolean z) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j;
            this.g = i;
            this.h = z;
            ArrayList<C0394a> arrayList = new ArrayList<>();
            this.i = arrayList;
            C0394a c0394a = new C0394a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.j = c0394a;
            arrayList.add(c0394a);
        }

        public final void a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.f(list, "clipPathData");
            c();
            this.i.add(new C0394a(str, f, f2, f3, f4, f5, f6, f7, list, AdRequest.MAX_CONTENT_URL_LENGTH));
        }

        public final void b() {
            c();
            ArrayList<C0394a> arrayList = this.i;
            C0394a remove = arrayList.remove(arrayList.size() - 1);
            arrayList.get(arrayList.size() - 1).j.add(new n(remove.a, remove.b, remove.c, remove.d, remove.e, remove.f, remove.g, remove.h, remove.i, remove.j));
        }

        public final void c() {
            if (!this.k) {
                return;
            }
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }
    }

    public d(String str, float f, float f2, float f3, float f4, n nVar, long j, int i, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = nVar;
        this.g = j;
        this.h = i;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!com.amazon.aps.iva.yb0.j.a(this.a, dVar.a) || !com.amazon.aps.iva.o2.e.a(this.b, dVar.b) || !com.amazon.aps.iva.o2.e.a(this.c, dVar.c)) {
            return false;
        }
        if (this.d == dVar.d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.e == dVar.e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !com.amazon.aps.iva.yb0.j.a(this.f, dVar.f) || !x.c(this.g, dVar.g)) {
            return false;
        }
        if (this.h == dVar.h) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && this.i == dVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int b = t0.b(this.e, t0.b(this.d, t0.b(this.c, t0.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        int i = x.h;
        return Boolean.hashCode(this.i) + com.amazon.aps.iva.a0.r.a(this.h, com.amazon.aps.iva.b8.i.a(this.g, (this.f.hashCode() + b) * 31, 31), 31);
    }
}
