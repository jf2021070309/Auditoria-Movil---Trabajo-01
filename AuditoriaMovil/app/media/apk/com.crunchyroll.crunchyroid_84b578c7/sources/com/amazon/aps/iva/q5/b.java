package com.amazon.aps.iva.q5;

import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.q1;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.b8.x1;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.q5.c;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.s6.w;
import com.amazon.aps.iva.t5.o;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements k.a, o.a, com.amazon.aps.iva.t5.g, w.a, p1.d {
    public final /* synthetic */ int b;

    public /* synthetic */ b(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        ((e.a) obj).c();
    }

    @Override // com.amazon.aps.iva.s6.w.a
    public final void b() {
        int i = com.amazon.aps.iva.m6.f.n;
    }

    @Override // com.amazon.aps.iva.b8.p1.d
    public final void d(v1 v1Var, q.e eVar) {
        q1.k(v1Var, eVar);
    }

    @Override // com.amazon.aps.iva.q5.k.a
    public final k e(Bundle bundle) {
        Uri[] uriArr;
        long[] jArr;
        ImmutableList a;
        int i = 0;
        switch (this.b) {
            case 0:
                long j = bundle.getLong(c.a.j);
                int i2 = bundle.getInt(c.a.k);
                int i3 = bundle.getInt(c.a.q);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(c.a.l);
                int[] intArray = bundle.getIntArray(c.a.m);
                long[] longArray = bundle.getLongArray(c.a.n);
                long j2 = bundle.getLong(c.a.o);
                boolean z = bundle.getBoolean(c.a.p);
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                if (parcelableArrayList == null) {
                    uriArr = new Uri[0];
                } else {
                    uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
                }
                if (longArray == null) {
                    jArr = new long[0];
                } else {
                    jArr = longArray;
                }
                return new c.a(j, i2, i3, iArr, uriArr, jArr, j2, z);
            case 1:
                v vVar = v.J;
                v.a aVar = new v.a();
                if (bundle != null) {
                    ClassLoader classLoader = com.amazon.aps.iva.t5.c.class.getClassLoader();
                    int i4 = com.amazon.aps.iva.t5.g0.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(v.K);
                v vVar2 = v.J;
                String str = vVar2.b;
                if (string == null) {
                    string = str;
                }
                aVar.a = string;
                String string2 = bundle.getString(v.L);
                if (string2 == null) {
                    string2 = vVar2.c;
                }
                aVar.b = string2;
                String string3 = bundle.getString(v.M);
                if (string3 == null) {
                    string3 = vVar2.d;
                }
                aVar.c = string3;
                aVar.d = bundle.getInt(v.N, vVar2.e);
                aVar.e = bundle.getInt(v.O, vVar2.f);
                aVar.f = bundle.getInt(v.P, vVar2.g);
                aVar.g = bundle.getInt(v.Q, vVar2.h);
                String string4 = bundle.getString(v.R);
                if (string4 == null) {
                    string4 = vVar2.j;
                }
                aVar.h = string4;
                f0 f0Var = (f0) bundle.getParcelable(v.S);
                if (f0Var == null) {
                    f0Var = vVar2.k;
                }
                aVar.i = f0Var;
                String string5 = bundle.getString(v.T);
                if (string5 == null) {
                    string5 = vVar2.l;
                }
                aVar.j = string5;
                String string6 = bundle.getString(v.U);
                if (string6 == null) {
                    string6 = vVar2.m;
                }
                aVar.k = string6;
                aVar.l = bundle.getInt(v.V, vVar2.n);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(v.d(i));
                    if (byteArray == null) {
                        aVar.m = arrayList;
                        aVar.n = (r) bundle.getParcelable(v.X);
                        aVar.o = bundle.getLong(v.Y, vVar2.q);
                        aVar.p = bundle.getInt(v.Z, vVar2.r);
                        aVar.q = bundle.getInt(v.k0, vVar2.s);
                        aVar.r = bundle.getFloat(v.v0, vVar2.t);
                        aVar.s = bundle.getInt(v.w0, vVar2.u);
                        aVar.t = bundle.getFloat(v.x0, vVar2.v);
                        aVar.u = bundle.getByteArray(v.y0);
                        aVar.v = bundle.getInt(v.z0, vVar2.x);
                        Bundle bundle2 = bundle.getBundle(v.A0);
                        if (bundle2 != null) {
                            aVar.w = (n) n.l.e(bundle2);
                        }
                        aVar.x = bundle.getInt(v.B0, vVar2.z);
                        aVar.y = bundle.getInt(v.C0, vVar2.A);
                        aVar.z = bundle.getInt(v.D0, vVar2.B);
                        aVar.A = bundle.getInt(v.E0, vVar2.C);
                        aVar.B = bundle.getInt(v.F0, vVar2.D);
                        aVar.C = bundle.getInt(v.G0, vVar2.E);
                        aVar.D = bundle.getInt(v.I0, vVar2.F);
                        aVar.E = bundle.getInt(v.J0, vVar2.G);
                        aVar.F = bundle.getInt(v.H0, vVar2.H);
                        return new v(aVar);
                    }
                    arrayList.add(byteArray);
                    i++;
                }
            case 2:
                return new p0(bundle.getInt(p0.e, 0), bundle.getInt(p0.f, 0), bundle.getInt(p0.g, 0));
            case 3:
                int i5 = bundle.getInt(n0.b, -1);
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                return (n0) q0.h.e(bundle);
                            }
                            throw new IllegalArgumentException(com.amazon.aps.iva.q.c0.a("Unknown RatingType: ", i5));
                        }
                        return (n0) o0.h.e(bundle);
                    }
                    return (n0) i0.f.e(bundle);
                }
                return (n0) x.h.e(bundle);
            case 4:
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(v0.d);
                if (parcelableArrayList2 == null) {
                    a = ImmutableList.of();
                } else {
                    a = com.amazon.aps.iva.t5.c.a(v0.a.k, parcelableArrayList2);
                }
                return new v0(a);
            default:
                int i6 = bundle.getInt(x1.g, 0);
                if (i6 != 0) {
                    return new x1(i6);
                }
                String string7 = bundle.getString(x1.h);
                string7.getClass();
                Bundle bundle3 = bundle.getBundle(x1.i);
                if (bundle3 == null) {
                    bundle3 = Bundle.EMPTY;
                }
                return new x1(string7, bundle3);
        }
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        ((l0.c) obj).V();
    }
}
