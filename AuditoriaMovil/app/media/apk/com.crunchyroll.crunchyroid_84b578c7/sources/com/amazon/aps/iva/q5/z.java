package com.amazon.aps.iva.q5;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.amazon.aps.iva.b8.a2;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.v1;
import com.amazon.aps.iva.k6.s;
import com.amazon.aps.iva.o6.g0;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.k;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.t5.o;
import com.braze.Braze;
import com.braze.BrazeActivityLifecycleCallbackListener;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.regex.Pattern;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements k.a, o.a, s.f, com.amazon.aps.iva.t5.g, OnCompleteListener, LibraryVersionComponent.VersionExtractor {
    public final /* synthetic */ int b;

    public /* synthetic */ z(int i) {
        this.b = i;
    }

    @Override // com.amazon.aps.iva.t5.g
    public final void a(Object obj) {
        switch (this.b) {
            case 6:
                ((g0.b) obj).b.release();
                return;
            case 7:
            default:
                int i = p1.i;
                ((v1) obj).stop();
                return;
            case 8:
                int i2 = p1.i;
                ((v1) obj).y();
                return;
        }
    }

    @Override // com.amazon.aps.iva.k6.s.f
    public final int d(Object obj) {
        Pattern pattern = com.amazon.aps.iva.k6.s.a;
        return ((com.amazon.aps.iva.k6.n) obj).a.startsWith("OMX.google") ? 1 : 0;
    }

    @Override // com.amazon.aps.iva.q5.k.a
    public final k e(Bundle bundle) {
        b0.f fVar;
        d0 d0Var;
        b0.d dVar;
        b0.h hVar;
        Integer num;
        Bundle bundle2;
        Bundle bundle3;
        b0.g gVar = null;
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                String string = bundle.getString(b0.i, "");
                string.getClass();
                Bundle bundle4 = bundle.getBundle(b0.j);
                if (bundle4 == null) {
                    fVar = b0.f.g;
                } else {
                    fVar = (b0.f) b0.f.m.e(bundle4);
                }
                b0.f fVar2 = fVar;
                Bundle bundle5 = bundle.getBundle(b0.k);
                if (bundle5 == null) {
                    d0Var = d0.J;
                } else {
                    d0Var = (d0) d0.L0.e(bundle5);
                }
                d0 d0Var2 = d0Var;
                Bundle bundle6 = bundle.getBundle(b0.l);
                if (bundle6 == null) {
                    dVar = b0.d.n;
                } else {
                    dVar = (b0.d) b0.c.m.e(bundle6);
                }
                b0.d dVar2 = dVar;
                Bundle bundle7 = bundle.getBundle(b0.m);
                if (bundle7 == null) {
                    hVar = b0.h.e;
                } else {
                    hVar = (b0.h) b0.h.i.e(bundle7);
                }
                b0.h hVar2 = hVar;
                Bundle bundle8 = bundle.getBundle(b0.n);
                if (bundle8 != null) {
                    gVar = (b0.g) b0.g.q.e(bundle8);
                }
                return new b0(string, dVar2, gVar, fVar2, d0Var2, hVar2);
            case 1:
                d0.a aVar = new d0.a();
                aVar.a = bundle.getCharSequence(d0.K);
                aVar.b = bundle.getCharSequence(d0.L);
                aVar.c = bundle.getCharSequence(d0.M);
                aVar.d = bundle.getCharSequence(d0.N);
                aVar.e = bundle.getCharSequence(d0.O);
                aVar.f = bundle.getCharSequence(d0.P);
                aVar.g = bundle.getCharSequence(d0.Q);
                byte[] byteArray = bundle.getByteArray(d0.T);
                String str = d0.G0;
                if (bundle.containsKey(str)) {
                    num = Integer.valueOf(bundle.getInt(str));
                } else {
                    num = null;
                }
                if (byteArray != null) {
                    bArr = (byte[]) byteArray.clone();
                }
                aVar.j = bArr;
                aVar.k = num;
                aVar.l = (Uri) bundle.getParcelable(d0.U);
                aVar.x = bundle.getCharSequence(d0.z0);
                aVar.y = bundle.getCharSequence(d0.A0);
                aVar.z = bundle.getCharSequence(d0.B0);
                aVar.C = bundle.getCharSequence(d0.E0);
                aVar.D = bundle.getCharSequence(d0.F0);
                aVar.E = bundle.getCharSequence(d0.H0);
                aVar.G = bundle.getBundle(d0.K0);
                String str2 = d0.R;
                if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
                    aVar.h = (n0) n0.c.e(bundle3);
                }
                String str3 = d0.S;
                if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
                    aVar.i = (n0) n0.c.e(bundle2);
                }
                String str4 = d0.V;
                if (bundle.containsKey(str4)) {
                    aVar.m = Integer.valueOf(bundle.getInt(str4));
                }
                String str5 = d0.W;
                if (bundle.containsKey(str5)) {
                    aVar.n = Integer.valueOf(bundle.getInt(str5));
                }
                String str6 = d0.X;
                if (bundle.containsKey(str6)) {
                    aVar.o = Integer.valueOf(bundle.getInt(str6));
                }
                String str7 = d0.J0;
                if (bundle.containsKey(str7)) {
                    aVar.p = Boolean.valueOf(bundle.getBoolean(str7));
                }
                String str8 = d0.Y;
                if (bundle.containsKey(str8)) {
                    aVar.q = Boolean.valueOf(bundle.getBoolean(str8));
                }
                String str9 = d0.Z;
                if (bundle.containsKey(str9)) {
                    aVar.r = Integer.valueOf(bundle.getInt(str9));
                }
                String str10 = d0.k0;
                if (bundle.containsKey(str10)) {
                    aVar.s = Integer.valueOf(bundle.getInt(str10));
                }
                String str11 = d0.v0;
                if (bundle.containsKey(str11)) {
                    aVar.t = Integer.valueOf(bundle.getInt(str11));
                }
                String str12 = d0.w0;
                if (bundle.containsKey(str12)) {
                    aVar.u = Integer.valueOf(bundle.getInt(str12));
                }
                String str13 = d0.x0;
                if (bundle.containsKey(str13)) {
                    aVar.v = Integer.valueOf(bundle.getInt(str13));
                }
                String str14 = d0.y0;
                if (bundle.containsKey(str14)) {
                    aVar.w = Integer.valueOf(bundle.getInt(str14));
                }
                String str15 = d0.C0;
                if (bundle.containsKey(str15)) {
                    aVar.A = Integer.valueOf(bundle.getInt(str15));
                }
                String str16 = d0.D0;
                if (bundle.containsKey(str16)) {
                    aVar.B = Integer.valueOf(bundle.getInt(str16));
                }
                String str17 = d0.I0;
                if (bundle.containsKey(str17)) {
                    aVar.F = Integer.valueOf(bundle.getInt(str17));
                }
                return new d0(aVar);
            case 2:
                r0.a aVar2 = r0.b;
                ImmutableList a = r0.a(r0.d.I, com.amazon.aps.iva.e.z.x(bundle, r0.c));
                ImmutableList a2 = r0.a(r0.b.n, com.amazon.aps.iva.e.z.x(bundle, r0.d));
                int[] intArray = bundle.getIntArray(r0.e);
                if (intArray == null) {
                    int size = a.size();
                    int[] iArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        iArr[i] = i;
                    }
                    intArray = iArr;
                }
                return new r0.c(a, a2, intArray);
            case 3:
                return new y0(bundle.getFloat(y0.j, 1.0f), bundle.getInt(y0.g, 0), bundle.getInt(y0.h, 0), bundle.getInt(y0.i, 0));
            default:
                int i2 = bundle.getInt(a2.e, -1);
                Bundle bundle9 = bundle.getBundle(a2.f);
                long j = bundle.getLong(a2.g, SystemClock.elapsedRealtime());
                if (bundle9 == null) {
                    bundle9 = Bundle.EMPTY;
                }
                return new a2(bundle9, i2, j);
        }
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public final String extract(Object obj) {
        return FirebaseCommonRegistrar.c((Context) obj);
    }

    @Override // com.amazon.aps.iva.t5.o.a
    public final void invoke(Object obj) {
        int i = com.amazon.aps.iva.a6.m0.o0;
        ((l0.c) obj).Z(new com.amazon.aps.iva.a6.l(2, new com.amazon.aps.iva.a6.r0(1), 1003));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        com.amazon.aps.iva.i5.v<String> vVar = com.amazon.aps.iva.iz.a.a;
        com.amazon.aps.iva.yb0.j.f(task, "task");
        if (task.isComplete() && task.isSuccessful()) {
            com.amazon.aps.iva.i5.v<String> vVar2 = com.amazon.aps.iva.iz.a.a;
            InstanceIdResult instanceIdResult = (InstanceIdResult) task.getResult();
            vVar2.k((instanceIdResult == null || (r12 = instanceIdResult.getToken()) == null) ? "" : "");
            String d = vVar2.d();
            com.amazon.aps.iva.yb0.j.c(d);
            String str = d;
            if (com.amazon.aps.iva.fz.f.c != null) {
                Braze.Companion companion = Braze.Companion;
                Application application = com.amazon.aps.iva.fz.f.c;
                if (application != null) {
                    companion.getInstance(application).setRegisteredPushToken(str);
                    Application application2 = com.amazon.aps.iva.fz.f.c;
                    if (application2 != null) {
                        application2.registerActivityLifecycleCallbacks(new BrazeActivityLifecycleCallbackListener(false, false, null, null, 15, null));
                        BrazeInAppMessageManager companion2 = BrazeInAppMessageManager.Companion.getInstance();
                        Application application3 = com.amazon.aps.iva.fz.f.c;
                        if (application3 != null) {
                            companion2.setCustomInAppMessageManagerListener(new com.amazon.aps.iva.fz.b(application3));
                            com.amazon.aps.iva.xb0.l<? super Integer, com.amazon.aps.iva.kb0.q> lVar = com.amazon.aps.iva.fz.f.d;
                            if (lVar != null) {
                                Application application4 = com.amazon.aps.iva.fz.f.c;
                                if (application4 != null) {
                                    lVar.invoke(Integer.valueOf(companion.getInstance(application4).getContentCardUnviewedCount()));
                                } else {
                                    com.amazon.aps.iva.yb0.j.m("appContext");
                                    throw null;
                                }
                            }
                            Application application5 = com.amazon.aps.iva.fz.f.c;
                            if (application5 != null) {
                                companion.getInstance(application5).subscribeToContentCardsUpdates(new com.amazon.aps.iva.fz.e());
                                return;
                            } else {
                                com.amazon.aps.iva.yb0.j.m("appContext");
                                throw null;
                            }
                        }
                        com.amazon.aps.iva.yb0.j.m("appContext");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("appContext");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("appContext");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("appContext");
            throw null;
        }
    }
}
