package com.amazon.aps.iva.q5;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.amazon.aps.iva.b8.c2;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.r1;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.b8.z1;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.u0;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.common.collect.ImmutableList;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements k.a, com.amazon.aps.iva.t5.g, p1.c, ShapeAppearanceModel.CornerSizeUnaryOperator, LibraryVersionComponent.VersionExtractor {
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        switch (this.b) {
            case 8:
                ((v1) obj).pause();
                return;
            default:
                ((v1) obj).T0();
                return;
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize) {
        return MaskableFrameLayout.b(cornerSize);
    }

    @Override // com.amazon.aps.iva.b8.p1.c
    public final void b(v1 v1Var, q.d dVar, List list) {
        int i = p1.i;
        v1Var.O0(list);
    }

    @Override // com.amazon.aps.iva.q5.k.a
    public final k e(Bundle bundle) {
        boolean z;
        b0 b0Var;
        ImmutableList a;
        z1 z1Var;
        l0.d dVar;
        l0.d dVar2;
        k0 k0Var;
        r0 r0Var;
        y0 y0Var;
        d0 d0Var;
        f fVar;
        com.amazon.aps.iva.s5.b bVar;
        q qVar;
        d0 d0Var2;
        v0 v0Var;
        u0 u0Var;
        b0.f fVar2 = null;
        j0 j0Var = null;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                return new n(bundle.getInt(n.h, -1), bundle.getByteArray(n.k), bundle.getInt(n.i, -1), bundle.getInt(n.j, -1));
            case 1:
                b0.c.a aVar = new b0.c.a();
                b0.d dVar3 = b0.c.g;
                long j = bundle.getLong(b0.c.h, dVar3.b);
                if (j >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.t(z);
                aVar.a = j;
                long j2 = bundle.getLong(b0.c.i, dVar3.c);
                if (j2 != Long.MIN_VALUE && j2 < 0) {
                    z2 = false;
                }
                com.amazon.aps.iva.cq.b.t(z2);
                aVar.b = j2;
                aVar.c = bundle.getBoolean(b0.c.j, dVar3.d);
                aVar.d = bundle.getBoolean(b0.c.k, dVar3.e);
                aVar.e = bundle.getBoolean(b0.c.l, dVar3.f);
                return new b0.d(aVar);
            case 2:
                return new j0(bundle);
            case 3:
                Bundle bundle2 = bundle.getBundle(r0.d.v);
                if (bundle2 != null) {
                    b0Var = (b0) b0.o.e(bundle2);
                } else {
                    b0Var = b0.h;
                }
                b0 b0Var2 = b0Var;
                long j3 = bundle.getLong(r0.d.w, -9223372036854775807L);
                long j4 = bundle.getLong(r0.d.x, -9223372036854775807L);
                long j5 = bundle.getLong(r0.d.y, -9223372036854775807L);
                boolean z3 = bundle.getBoolean(r0.d.z, false);
                boolean z4 = bundle.getBoolean(r0.d.A, false);
                Bundle bundle3 = bundle.getBundle(r0.d.B);
                if (bundle3 != null) {
                    fVar2 = (b0.f) b0.f.m.e(bundle3);
                }
                boolean z5 = bundle.getBoolean(r0.d.C, false);
                long j6 = bundle.getLong(r0.d.D, 0L);
                long j7 = bundle.getLong(r0.d.E, -9223372036854775807L);
                int i = bundle.getInt(r0.d.F, 0);
                int i2 = bundle.getInt(r0.d.G, 0);
                long j8 = bundle.getLong(r0.d.H, 0L);
                r0.d dVar4 = new r0.d();
                dVar4.c(r0.d.t, b0Var2, null, j3, j4, j5, z3, z4, fVar2, j6, j7, i, i2, j8);
                dVar4.m = z5;
                return dVar4;
            case 4:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.amazon.aps.iva.s5.b.e);
                if (parcelableArrayList == null) {
                    a = ImmutableList.of();
                } else {
                    a = com.amazon.aps.iva.t5.c.a(com.amazon.aps.iva.s5.a.K, parcelableArrayList);
                }
                return new com.amazon.aps.iva.s5.b(a, bundle.getLong(com.amazon.aps.iva.s5.b.f));
            case 11:
                Bundle bundle4 = bundle.getBundle(r1.Y);
                if (bundle4 != null) {
                    j0Var = (j0) j0.i.e(bundle4);
                }
                j0 j0Var2 = j0Var;
                int i3 = bundle.getInt(r1.k0, 0);
                Bundle bundle5 = bundle.getBundle(r1.Z);
                if (bundle5 == null) {
                    z1Var = z1.m;
                } else {
                    z1Var = (z1) z1.x.e(bundle5);
                }
                z1 z1Var2 = z1Var;
                Bundle bundle6 = bundle.getBundle(r1.v0);
                if (bundle6 == null) {
                    dVar = z1.l;
                } else {
                    dVar = (l0.d) l0.d.r.e(bundle6);
                }
                l0.d dVar5 = dVar;
                Bundle bundle7 = bundle.getBundle(r1.w0);
                if (bundle7 == null) {
                    dVar2 = z1.l;
                } else {
                    dVar2 = (l0.d) l0.d.r.e(bundle7);
                }
                l0.d dVar6 = dVar2;
                int i4 = bundle.getInt(r1.x0, 0);
                Bundle bundle8 = bundle.getBundle(r1.H);
                if (bundle8 == null) {
                    k0Var = k0.e;
                } else {
                    k0Var = (k0) k0.h.e(bundle8);
                }
                k0 k0Var2 = k0Var;
                int i5 = bundle.getInt(r1.I, 0);
                boolean z6 = bundle.getBoolean(r1.J, false);
                Bundle bundle9 = bundle.getBundle(r1.K);
                if (bundle9 == null) {
                    r0Var = r0.b;
                } else {
                    r0Var = (r0) r0.f.e(bundle9);
                }
                r0 r0Var2 = r0Var;
                int i6 = bundle.getInt(r1.F0, 0);
                Bundle bundle10 = bundle.getBundle(r1.L);
                if (bundle10 == null) {
                    y0Var = y0.f;
                } else {
                    y0Var = (y0) y0.k.e(bundle10);
                }
                y0 y0Var2 = y0Var;
                Bundle bundle11 = bundle.getBundle(r1.M);
                if (bundle11 == null) {
                    d0Var = d0.J;
                } else {
                    d0Var = (d0) d0.L0.e(bundle11);
                }
                d0 d0Var3 = d0Var;
                float f = bundle.getFloat(r1.N, 1.0f);
                Bundle bundle12 = bundle.getBundle(r1.O);
                if (bundle12 == null) {
                    fVar = f.h;
                } else {
                    fVar = (f) f.n.e(bundle12);
                }
                f fVar3 = fVar;
                Bundle bundle13 = bundle.getBundle(r1.y0);
                if (bundle13 == null) {
                    bVar = com.amazon.aps.iva.s5.b.d;
                } else {
                    bVar = (com.amazon.aps.iva.s5.b) com.amazon.aps.iva.s5.b.g.e(bundle13);
                }
                com.amazon.aps.iva.s5.b bVar2 = bVar;
                Bundle bundle14 = bundle.getBundle(r1.P);
                if (bundle14 == null) {
                    qVar = q.f;
                } else {
                    qVar = (q) q.k.e(bundle14);
                }
                q qVar2 = qVar;
                int i7 = bundle.getInt(r1.Q, 0);
                boolean z7 = bundle.getBoolean(r1.R, false);
                boolean z8 = bundle.getBoolean(r1.S, false);
                int i8 = bundle.getInt(r1.T, 1);
                int i9 = bundle.getInt(r1.U, 0);
                int i10 = bundle.getInt(r1.V, 1);
                boolean z9 = bundle.getBoolean(r1.W, false);
                boolean z10 = bundle.getBoolean(r1.X, false);
                Bundle bundle15 = bundle.getBundle(r1.z0);
                if (bundle15 == null) {
                    d0Var2 = d0.J;
                } else {
                    d0Var2 = (d0) d0.L0.e(bundle15);
                }
                d0 d0Var4 = d0Var2;
                long j9 = bundle.getLong(r1.A0, 0L);
                long j10 = bundle.getLong(r1.B0, 0L);
                long j11 = bundle.getLong(r1.C0, 0L);
                Bundle bundle16 = bundle.getBundle(r1.E0);
                if (bundle16 == null) {
                    v0Var = v0.c;
                } else {
                    v0Var = (v0) v0.e.e(bundle16);
                }
                v0 v0Var2 = v0Var;
                Bundle bundle17 = bundle.getBundle(r1.D0);
                if (bundle17 == null) {
                    u0Var = u0.B;
                } else {
                    u0Var = new u0(new u0.a(bundle17));
                }
                return new r1(j0Var2, i3, z1Var2, dVar5, dVar6, i4, k0Var2, i5, z6, y0Var2, r0Var2, i6, d0Var3, f, fVar3, bVar2, qVar2, i7, z7, z8, i8, i9, i10, z9, z10, d0Var4, j9, j10, j11, v0Var2, u0Var);
            default:
                String str = c2.k;
                com.amazon.aps.iva.cq.b.v(bundle.containsKey(str), "uid should be set.");
                int i11 = bundle.getInt(str);
                String str2 = c2.l;
                com.amazon.aps.iva.cq.b.v(bundle.containsKey(str2), "type should be set.");
                int i12 = bundle.getInt(str2);
                int i13 = bundle.getInt(c2.m, 0);
                int i14 = bundle.getInt(c2.s, 0);
                String string = bundle.getString(c2.n);
                com.amazon.aps.iva.cq.b.y(string, "package name should be set.");
                String string2 = bundle.getString(c2.o, "");
                IBinder a2 = com.amazon.aps.iva.k3.d.a(bundle, c2.q);
                ComponentName componentName = (ComponentName) bundle.getParcelable(c2.p);
                Bundle bundle18 = bundle.getBundle(c2.r);
                if (bundle18 == null) {
                    bundle18 = Bundle.EMPTY;
                }
                return new c2(i11, i12, i13, i14, string, string2, componentName, a2, bundle18);
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.a((Context) obj);
    }
}
