package com.amazon.aps.iva.f8;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.aps.iva.f8.a0;
import com.amazon.aps.iva.f8.e0;
import com.amazon.aps.iva.f8.r;
import com.amazon.aps.iva.f8.u0;
import com.amazon.aps.iva.f8.w0;
import com.google.android.gms.cast.CredentialsData;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* compiled from: MediaRouter.java */
/* loaded from: classes.dex */
public final class f0 {
    public static d c;
    public final Context a;
    public final ArrayList<b> b = new ArrayList<>();

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static abstract class a {
        @Deprecated
        public void onRouteSelected(f0 f0Var, h hVar) {
        }

        @Deprecated
        public void onRouteUnselected(f0 f0Var, h hVar) {
        }

        public void onRouteSelected(f0 f0Var, h hVar, int i) {
            onRouteSelected(f0Var, hVar);
        }

        public void onRouteUnselected(f0 f0Var, h hVar, int i) {
            onRouteUnselected(f0Var, hVar);
        }

        public void onRouteSelected(f0 f0Var, h hVar, int i, h hVar2) {
            onRouteSelected(f0Var, hVar, i);
        }

        public void onProviderAdded(f0 f0Var, g gVar) {
        }

        public void onProviderChanged(f0 f0Var, g gVar) {
        }

        public void onProviderRemoved(f0 f0Var, g gVar) {
        }

        public void onRouteAdded(f0 f0Var, h hVar) {
        }

        public void onRouteChanged(f0 f0Var, h hVar) {
        }

        public void onRoutePresentationDisplayChanged(f0 f0Var, h hVar) {
        }

        public void onRouteRemoved(f0 f0Var, h hVar) {
        }

        public void onRouteVolumeChanged(f0 f0Var, h hVar) {
        }

        public void onRouterParamsChanged(f0 f0Var, q0 q0Var) {
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final f0 a;
        public final a b;
        public e0 c = e0.c;
        public int d;
        public long e;

        public b(f0 f0Var, a aVar) {
            this.a = f0Var;
            this.b = aVar;
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static final class d implements w0.e, u0.d {
        public int A;
        public e B;
        public f C;
        public C0244d D;
        public MediaSessionCompat E;
        public final b F;
        public final Context a;
        public boolean b;
        public w0.a c;
        public u0 d;
        public boolean e;
        public r f;
        public final boolean o;
        public j0 p;
        public q0 q;
        public h r;
        public h s;
        public h t;
        public a0.e u;
        public h v;
        public a0.b w;
        public z y;
        public z z;
        public final ArrayList<WeakReference<f0>> g = new ArrayList<>();
        public final ArrayList<h> h = new ArrayList<>();
        public final HashMap i = new HashMap();
        public final ArrayList<g> j = new ArrayList<>();
        public final ArrayList<g> k = new ArrayList<>();
        public final v0 l = new v0();
        public final f m = new f();
        public final c n = new c();
        public final HashMap x = new HashMap();

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public class a implements MediaSessionCompat.g {
            public a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.g
            public final void a() {
                d.this.getClass();
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public class b implements a0.b.InterfaceC0243b {
            public b() {
            }

            public final void a(a0.b bVar, y yVar, Collection<a0.b.a> collection) {
                d dVar = d.this;
                if (bVar == dVar.w && yVar != null) {
                    g gVar = dVar.v.a;
                    String e = yVar.e();
                    h hVar = new h(gVar, e, dVar.b(gVar, e));
                    hVar.k(yVar);
                    if (dVar.t == hVar) {
                        return;
                    }
                    dVar.i(dVar, hVar, dVar.w, 3, dVar.v, collection);
                    dVar.v = null;
                    dVar.w = null;
                } else if (bVar == dVar.u) {
                    if (yVar != null) {
                        dVar.p(dVar.t, yVar);
                    }
                    dVar.t.p(collection);
                }
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public final class c extends Handler {
            public final ArrayList<b> a = new ArrayList<>();
            public final ArrayList b = new ArrayList();

            public c() {
            }

            public static void a(b bVar, int i, Object obj, int i2) {
                h hVar;
                h hVar2;
                boolean z;
                boolean z2;
                f0 f0Var = bVar.a;
                int i3 = 65280 & i;
                a aVar = bVar.b;
                if (i3 != 256) {
                    if (i3 != 512) {
                        if (i3 == 768 && i == 769) {
                            aVar.onRouterParamsChanged(f0Var, (q0) obj);
                            return;
                        }
                        return;
                    }
                    g gVar = (g) obj;
                    switch (i) {
                        case 513:
                            aVar.onProviderAdded(f0Var, gVar);
                            return;
                        case 514:
                            aVar.onProviderRemoved(f0Var, gVar);
                            return;
                        case 515:
                            aVar.onProviderChanged(f0Var, gVar);
                            return;
                        default:
                            return;
                    }
                }
                if (i != 264 && i != 262) {
                    hVar = (h) obj;
                } else {
                    hVar = (h) ((com.amazon.aps.iva.o3.c) obj).b;
                }
                if (i != 264 && i != 262) {
                    hVar2 = null;
                } else {
                    hVar2 = (h) ((com.amazon.aps.iva.o3.c) obj).a;
                }
                if (hVar != null) {
                    boolean z3 = true;
                    if ((bVar.d & 2) == 0 && !hVar.j(bVar.c)) {
                        d c = f0.c();
                        if (c != null) {
                            q0 q0Var = c.q;
                            if (q0Var == null) {
                                z2 = false;
                            } else {
                                z2 = q0Var.d;
                            }
                            if (z2) {
                                z = true;
                                z3 = (!z && hVar.f() && i == 262 && i2 == 3 && hVar2 != null) ? true ^ hVar2.f() : false;
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                    if (z3) {
                        switch (i) {
                            case 257:
                                aVar.onRouteAdded(f0Var, hVar);
                                return;
                            case 258:
                                aVar.onRouteRemoved(f0Var, hVar);
                                return;
                            case 259:
                                aVar.onRouteChanged(f0Var, hVar);
                                return;
                            case 260:
                                aVar.onRouteVolumeChanged(f0Var, hVar);
                                return;
                            case 261:
                                aVar.onRoutePresentationDisplayChanged(f0Var, hVar);
                                return;
                            case 262:
                                aVar.onRouteSelected(f0Var, hVar, i2, hVar);
                                return;
                            case 263:
                                aVar.onRouteUnselected(f0Var, hVar, i2);
                                return;
                            case 264:
                                aVar.onRouteSelected(f0Var, hVar, i2, hVar2);
                                return;
                            default:
                                return;
                        }
                    }
                }
            }

            public final void b(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int u;
                ArrayList<b> arrayList = this.a;
                int i = message.what;
                Object obj = message.obj;
                int i2 = message.arg1;
                d dVar = d.this;
                if (i == 259 && dVar.f().c.equals(((h) obj).c)) {
                    dVar.q(true);
                }
                ArrayList arrayList2 = this.b;
                if (i != 262) {
                    if (i != 264) {
                        switch (i) {
                            case 257:
                                dVar.c.y((h) obj);
                                break;
                            case 258:
                                dVar.c.z((h) obj);
                                break;
                            case 259:
                                w0.a aVar = dVar.c;
                                h hVar = (h) obj;
                                aVar.getClass();
                                if (hVar.d() != aVar && (u = aVar.u(hVar)) >= 0) {
                                    aVar.F(aVar.s.get(u));
                                    break;
                                }
                                break;
                        }
                    } else {
                        h hVar2 = (h) ((com.amazon.aps.iva.o3.c) obj).b;
                        arrayList2.add(hVar2);
                        dVar.c.y(hVar2);
                        dVar.c.A(hVar2);
                    }
                } else {
                    h hVar3 = (h) ((com.amazon.aps.iva.o3.c) obj).b;
                    dVar.c.A(hVar3);
                    if (dVar.r != null && hVar3.f()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            dVar.c.z((h) it.next());
                        }
                        arrayList2.clear();
                    }
                }
                try {
                    int size = dVar.g.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            ArrayList<WeakReference<f0>> arrayList3 = dVar.g;
                            f0 f0Var = arrayList3.get(size).get();
                            if (f0Var == null) {
                                arrayList3.remove(size);
                            } else {
                                arrayList.addAll(f0Var.b);
                            }
                        } else {
                            int size2 = arrayList.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                a(arrayList.get(i3), i, obj, i2);
                            }
                            return;
                        }
                    }
                } finally {
                    arrayList.clear();
                }
            }
        }

        /* compiled from: MediaRouter.java */
        /* renamed from: com.amazon.aps.iva.f8.f0$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0244d {
            public final MediaSessionCompat a;
            public h0 b;

            public C0244d(MediaSessionCompat mediaSessionCompat) {
                this.a = mediaSessionCompat;
            }

            public final void a() {
                MediaSessionCompat mediaSessionCompat = this.a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.i(d.this.l.d);
                    this.b = null;
                }
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public final class e extends r.a {
            public e() {
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public final class f extends a0.a {
            public f() {
            }
        }

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public final class g {
            public g() {
                throw null;
            }
        }

        public d(Context context) {
            new a();
            this.F = new b();
            this.a = context;
            this.o = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        }

        public final void a(a0 a0Var, boolean z) {
            if (d(a0Var) == null) {
                g gVar = new g(a0Var, z);
                this.j.add(gVar);
                d dVar = f0.c;
                this.n.b(513, gVar);
                o(gVar, a0Var.h);
                f0.b();
                a0Var.e = this.m;
                a0Var.q(this.y);
            }
        }

        public final String b(g gVar, String str) {
            String b2;
            String flattenToShortString = gVar.d.a.flattenToShortString();
            boolean z = gVar.c;
            if (z) {
                b2 = str;
            } else {
                b2 = com.amazon.aps.iva.k.q.b(flattenToShortString, ":", str);
            }
            HashMap hashMap = this.i;
            if (!z && e(b2) >= 0) {
                int i = 2;
                while (true) {
                    String format = String.format(Locale.US, "%s_%d", b2, Integer.valueOf(i));
                    if (e(format) < 0) {
                        hashMap.put(new com.amazon.aps.iva.o3.c(flattenToShortString, str), format);
                        return format;
                    }
                    i++;
                }
            } else {
                hashMap.put(new com.amazon.aps.iva.o3.c(flattenToShortString, str), b2);
                return b2;
            }
        }

        public final h c() {
            boolean z;
            Iterator<h> it = this.h.iterator();
            while (it.hasNext()) {
                h next = it.next();
                if (next != this.r) {
                    if (next.d() == this.c && next.o("android.media.intent.category.LIVE_AUDIO") && !next.o("android.media.intent.category.LIVE_VIDEO")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && next.h()) {
                        return next;
                    }
                }
            }
            return this.r;
        }

        public final g d(a0 a0Var) {
            ArrayList<g> arrayList = this.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i).a == a0Var) {
                    return arrayList.get(i);
                }
            }
            return null;
        }

        public final int e(String str) {
            ArrayList<h> arrayList = this.h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i).c.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public final h f() {
            h hVar = this.t;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        public final boolean g() {
            q0 q0Var;
            if (this.e && ((q0Var = this.q) == null || q0Var.b)) {
                return true;
            }
            return false;
        }

        public final void h() {
            if (!this.t.g()) {
                return;
            }
            List<h> c2 = this.t.c();
            HashSet hashSet = new HashSet();
            for (h hVar : c2) {
                hashSet.add(hVar.c);
            }
            HashMap hashMap = this.x;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    a0.e eVar = (a0.e) entry.getValue();
                    eVar.h(0);
                    eVar.d();
                    it.remove();
                }
            }
            for (h hVar2 : c2) {
                if (!hashMap.containsKey(hVar2.c)) {
                    a0.e n = hVar2.d().n(hVar2.b, this.t.b);
                    n.e();
                    hashMap.put(hVar2.c, n);
                }
            }
        }

        public final void i(d dVar, h hVar, a0.e eVar, int i, h hVar2, Collection<a0.b.a> collection) {
            e eVar2;
            f fVar = this.C;
            if (fVar != null) {
                fVar.a();
                this.C = null;
            }
            f fVar2 = new f(dVar, hVar, eVar, i, hVar2, collection);
            this.C = fVar2;
            if (fVar2.b == 3 && (eVar2 = this.B) != null) {
                ListenableFuture<Void> onPrepareTransfer = eVar2.onPrepareTransfer(this.t, fVar2.d);
                if (onPrepareTransfer == null) {
                    this.C.b();
                    return;
                }
                f fVar3 = this.C;
                d dVar2 = fVar3.g.get();
                if (dVar2 != null && dVar2.C == fVar3) {
                    if (fVar3.h == null) {
                        fVar3.h = onPrepareTransfer;
                        com.amazon.aps.iva.v1.p pVar = new com.amazon.aps.iva.v1.p(fVar3, 7);
                        c cVar = dVar2.n;
                        Objects.requireNonNull(cVar);
                        onPrepareTransfer.addListener(pVar, new com.amazon.aps.iva.i2.l0(cVar, 3));
                        return;
                    }
                    throw new IllegalStateException("future is already set");
                }
                fVar3.a();
                return;
            }
            fVar2.b();
        }

        public final void j(a0 a0Var) {
            g d = d(a0Var);
            if (d != null) {
                a0Var.getClass();
                f0.b();
                a0Var.e = null;
                a0Var.q(null);
                o(d, null);
                this.n.b(514, d);
                this.j.remove(d);
            }
        }

        public final void k(h hVar, int i) {
            if (!this.h.contains(hVar)) {
                Objects.toString(hVar);
            } else if (!hVar.g) {
                hVar.toString();
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    a0 d = hVar.d();
                    r rVar = this.f;
                    if (d == rVar && this.t != hVar) {
                        MediaRoute2Info r = rVar.r(hVar.b);
                        if (r != null) {
                            rVar.j.transferTo(r);
                            return;
                        }
                        return;
                    }
                }
                l(hVar, i);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 != false) goto L62;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void l(com.amazon.aps.iva.f8.f0.h r13, int r14) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f8.f0.d.l(com.amazon.aps.iva.f8.f0$h, int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
            if (r21.z.b() == r2) goto L70;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00a4 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m() {
            /*
                Method dump skipped, instructions count: 377
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f8.f0.d.m():void");
        }

        @SuppressLint({"NewApi"})
        public final void n() {
            String str;
            MediaRouter2.RoutingController routingController;
            h hVar = this.t;
            if (hVar != null) {
                int i = hVar.o;
                v0 v0Var = this.l;
                v0Var.a = i;
                v0Var.b = hVar.p;
                v0Var.c = hVar.e();
                h hVar2 = this.t;
                v0Var.d = hVar2.l;
                int i2 = hVar2.k;
                v0Var.getClass();
                if (g() && this.t.d() == this.f) {
                    a0.e eVar = this.u;
                    int i3 = r.s;
                    if ((eVar instanceof r.c) && (routingController = ((r.c) eVar).g) != null) {
                        str = routingController.getId();
                    } else {
                        str = null;
                    }
                    v0Var.e = str;
                } else {
                    v0Var.e = null;
                }
                ArrayList<g> arrayList = this.k;
                int i4 = 0;
                if (arrayList.size() <= 0) {
                    C0244d c0244d = this.D;
                    if (c0244d != null) {
                        h hVar3 = this.t;
                        h hVar4 = this.r;
                        if (hVar4 != null) {
                            if (hVar3 != hVar4 && hVar3 != this.s) {
                                if (v0Var.c == 1) {
                                    i4 = 2;
                                }
                                int i5 = i4;
                                int i6 = v0Var.b;
                                int i7 = v0Var.a;
                                String str2 = v0Var.e;
                                MediaSessionCompat mediaSessionCompat = c0244d.a;
                                if (mediaSessionCompat != null) {
                                    h0 h0Var = c0244d.b;
                                    if (h0Var != null && i5 == 0 && i6 == 0) {
                                        h0Var.d(i7);
                                        return;
                                    }
                                    h0 h0Var2 = new h0(c0244d, i5, i6, i7, str2);
                                    c0244d.b = h0Var2;
                                    mediaSessionCompat.j(h0Var2);
                                    return;
                                }
                                return;
                            }
                            c0244d.a();
                            return;
                        }
                        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                    }
                    return;
                }
                arrayList.get(0).getClass();
                throw null;
            }
            C0244d c0244d2 = this.D;
            if (c0244d2 != null) {
                c0244d2.a();
            }
        }

        public final void o(g gVar, d0 d0Var) {
            boolean z;
            boolean z2;
            int i;
            if (gVar.e != d0Var) {
                gVar.e = d0Var;
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            ArrayList<h> arrayList = this.h;
            ArrayList arrayList2 = gVar.b;
            c cVar = this.n;
            if (d0Var != null && (d0Var.b() || d0Var == this.c.h)) {
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                boolean z3 = false;
                i = 0;
                for (y yVar : d0Var.a) {
                    if (yVar != null && yVar.f()) {
                        String e2 = yVar.e();
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                if (((h) arrayList2.get(i2)).b.equals(e2)) {
                                    break;
                                }
                                i2++;
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        if (i2 < 0) {
                            h hVar = new h(gVar, e2, b(gVar, e2));
                            int i3 = i + 1;
                            arrayList2.add(i, hVar);
                            arrayList.add(hVar);
                            if (yVar.c().size() > 0) {
                                arrayList3.add(new com.amazon.aps.iva.o3.c(hVar, yVar));
                            } else {
                                hVar.k(yVar);
                                d dVar = f0.c;
                                cVar.b(257, hVar);
                            }
                            i = i3;
                        } else if (i2 < i) {
                            yVar.toString();
                        } else {
                            h hVar2 = (h) arrayList2.get(i2);
                            int i4 = i + 1;
                            Collections.swap(arrayList2, i2, i);
                            if (yVar.c().size() > 0) {
                                arrayList4.add(new com.amazon.aps.iva.o3.c(hVar2, yVar));
                            } else if (p(hVar2, yVar) != 0 && hVar2 == this.t) {
                                i = i4;
                                z3 = true;
                            }
                            i = i4;
                        }
                    } else {
                        Objects.toString(yVar);
                    }
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    com.amazon.aps.iva.o3.c cVar2 = (com.amazon.aps.iva.o3.c) it.next();
                    h hVar3 = (h) cVar2.a;
                    hVar3.k((y) cVar2.b);
                    d dVar2 = f0.c;
                    cVar.b(257, hVar3);
                }
                Iterator it2 = arrayList4.iterator();
                z2 = z3;
                while (it2.hasNext()) {
                    com.amazon.aps.iva.o3.c cVar3 = (com.amazon.aps.iva.o3.c) it2.next();
                    h hVar4 = (h) cVar3.a;
                    if (p(hVar4, (y) cVar3.b) != 0 && hVar4 == this.t) {
                        z2 = true;
                    }
                }
            } else {
                Objects.toString(d0Var);
                z2 = false;
                i = 0;
            }
            for (int size2 = arrayList2.size() - 1; size2 >= i; size2--) {
                h hVar5 = (h) arrayList2.get(size2);
                hVar5.k(null);
                arrayList.remove(hVar5);
            }
            q(z2);
            for (int size3 = arrayList2.size() - 1; size3 >= i; size3--) {
                d dVar3 = f0.c;
                cVar.b(258, (h) arrayList2.remove(size3));
            }
            d dVar4 = f0.c;
            cVar.b(515, gVar);
        }

        public final int p(h hVar, y yVar) {
            int k = hVar.k(yVar);
            if (k != 0) {
                int i = k & 1;
                c cVar = this.n;
                if (i != 0) {
                    d dVar = f0.c;
                    cVar.b(259, hVar);
                }
                if ((k & 2) != 0) {
                    d dVar2 = f0.c;
                    cVar.b(260, hVar);
                }
                if ((k & 4) != 0) {
                    d dVar3 = f0.c;
                    cVar.b(261, hVar);
                }
            }
            return k;
        }

        public final void q(boolean z) {
            boolean z2;
            boolean z3;
            h hVar = this.r;
            if (hVar != null && !hVar.h()) {
                Objects.toString(this.r);
                this.r = null;
            }
            h hVar2 = this.r;
            ArrayList<h> arrayList = this.h;
            if (hVar2 == null && !arrayList.isEmpty()) {
                Iterator<h> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h next = it.next();
                    if (next.d() == this.c && next.b.equals("DEFAULT_ROUTE")) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 && next.h()) {
                        this.r = next;
                        Objects.toString(next);
                        break;
                    }
                }
            }
            h hVar3 = this.s;
            if (hVar3 != null && !hVar3.h()) {
                Objects.toString(this.s);
                this.s = null;
            }
            if (this.s == null && !arrayList.isEmpty()) {
                Iterator<h> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    h next2 = it2.next();
                    if (next2.d() == this.c && next2.o("android.media.intent.category.LIVE_AUDIO") && !next2.o("android.media.intent.category.LIVE_VIDEO")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && next2.h()) {
                        this.s = next2;
                        Objects.toString(next2);
                        break;
                    }
                }
            }
            h hVar4 = this.t;
            if (hVar4 != null && hVar4.g) {
                if (z) {
                    h();
                    n();
                    return;
                }
                return;
            }
            Objects.toString(hVar4);
            l(c(), 0);
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public interface e {
        ListenableFuture<Void> onPrepareTransfer(h hVar, h hVar2);
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static final class f {
        public final a0.e a;
        public final int b;
        public final h c;
        public final h d;
        public final h e;
        public final ArrayList f;
        public final WeakReference<d> g;
        public ListenableFuture<Void> h = null;
        public boolean i = false;
        public boolean j = false;

        public f(d dVar, h hVar, a0.e eVar, int i, h hVar2, Collection<a0.b.a> collection) {
            this.g = new WeakReference<>(dVar);
            this.d = hVar;
            this.a = eVar;
            this.b = i;
            this.c = dVar.t;
            this.e = hVar2;
            this.f = collection != null ? new ArrayList(collection) : null;
            dVar.n.postDelayed(new com.amazon.aps.iva.e.k(this, 6), 15000L);
        }

        public final void a() {
            if (!this.i && !this.j) {
                this.j = true;
                a0.e eVar = this.a;
                if (eVar != null) {
                    eVar.h(0);
                    eVar.d();
                }
            }
        }

        public final void b() {
            ListenableFuture<Void> listenableFuture;
            f0.b();
            if (!this.i && !this.j) {
                WeakReference<d> weakReference = this.g;
                d dVar = weakReference.get();
                if (dVar != null && dVar.C == this && ((listenableFuture = this.h) == null || !listenableFuture.isCancelled())) {
                    this.i = true;
                    dVar.C = null;
                    d dVar2 = weakReference.get();
                    int i = this.b;
                    h hVar = this.c;
                    if (dVar2 != null && dVar2.t == hVar) {
                        Message obtainMessage = dVar2.n.obtainMessage(263, hVar);
                        obtainMessage.arg1 = i;
                        obtainMessage.sendToTarget();
                        a0.e eVar = dVar2.u;
                        if (eVar != null) {
                            eVar.h(i);
                            dVar2.u.d();
                        }
                        HashMap hashMap = dVar2.x;
                        if (!hashMap.isEmpty()) {
                            for (a0.e eVar2 : hashMap.values()) {
                                eVar2.h(i);
                                eVar2.d();
                            }
                            hashMap.clear();
                        }
                        dVar2.u = null;
                    }
                    d dVar3 = weakReference.get();
                    if (dVar3 != null) {
                        h hVar2 = this.d;
                        dVar3.t = hVar2;
                        dVar3.u = this.a;
                        d.c cVar = dVar3.n;
                        h hVar3 = this.e;
                        if (hVar3 == null) {
                            Message obtainMessage2 = cVar.obtainMessage(262, new com.amazon.aps.iva.o3.c(hVar, hVar2));
                            obtainMessage2.arg1 = i;
                            obtainMessage2.sendToTarget();
                        } else {
                            Message obtainMessage3 = cVar.obtainMessage(264, new com.amazon.aps.iva.o3.c(hVar3, hVar2));
                            obtainMessage3.arg1 = i;
                            obtainMessage3.sendToTarget();
                        }
                        dVar3.x.clear();
                        dVar3.h();
                        dVar3.n();
                        ArrayList arrayList = this.f;
                        if (arrayList != null) {
                            dVar3.t.p(arrayList);
                            return;
                        }
                        return;
                    }
                    return;
                }
                a();
            }
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static final class g {
        public final a0 a;
        public final ArrayList b = new ArrayList();
        public final boolean c;
        public final a0.d d;
        public d0 e;

        public g(a0 a0Var, boolean z) {
            this.a = a0Var;
            this.d = a0Var.c;
            this.c = z;
        }

        public final h a(String str) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((h) arrayList.get(i)).b.equals(str)) {
                    return (h) arrayList.get(i);
                }
            }
            return null;
        }

        public final String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + this.d.a.getPackageName() + " }";
        }
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static class h {
        public final g a;
        public final String b;
        public final String c;
        public String d;
        public String e;
        public Uri f;
        public boolean g;
        public int h;
        public boolean i;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public Bundle r;
        public IntentSender s;
        public y t;
        public com.amazon.aps.iva.x.a v;
        public final ArrayList<IntentFilter> j = new ArrayList<>();
        public int q = -1;
        public ArrayList u = new ArrayList();

        /* compiled from: MediaRouter.java */
        /* loaded from: classes.dex */
        public static final class a {
            public final a0.b.a a;

            public a(a0.b.a aVar) {
                this.a = aVar;
            }
        }

        public h(g gVar, String str, String str2) {
            this.a = gVar;
            this.b = str;
            this.c = str2;
        }

        public static a0.b a() {
            f0.b();
            a0.e eVar = f0.c().u;
            if (eVar instanceof a0.b) {
                return (a0.b) eVar;
            }
            return null;
        }

        public final a b(h hVar) {
            if (hVar != null) {
                com.amazon.aps.iva.x.a aVar = this.v;
                if (aVar != null) {
                    String str = hVar.c;
                    if (aVar.containsKey(str)) {
                        return new a((a0.b.a) this.v.getOrDefault(str, null));
                    }
                }
                return null;
            }
            throw new NullPointerException("route must not be null");
        }

        public final List<h> c() {
            return Collections.unmodifiableList(this.u);
        }

        public final a0 d() {
            g gVar = this.a;
            gVar.getClass();
            f0.b();
            return gVar.a;
        }

        public final int e() {
            if (g() && !f0.h()) {
                return 0;
            }
            return this.n;
        }

        public final boolean f() {
            boolean z;
            f0.b();
            h hVar = f0.c().r;
            if (hVar != null) {
                if (hVar == this) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || this.m == 3) {
                    return true;
                }
                if (TextUtils.equals(d().c.a.getPackageName(), CredentialsData.CREDENTIALS_TYPE_ANDROID) && o("android.media.intent.category.LIVE_AUDIO") && !o("android.media.intent.category.LIVE_VIDEO")) {
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public final boolean g() {
            if (c().size() >= 1) {
                return true;
            }
            return false;
        }

        public final boolean h() {
            if (this.t != null && this.g) {
                return true;
            }
            return false;
        }

        public final boolean i() {
            f0.b();
            if (f0.c().f() == this) {
                return true;
            }
            return false;
        }

        public final boolean j(e0 e0Var) {
            if (e0Var != null) {
                f0.b();
                ArrayList<IntentFilter> arrayList = this.j;
                if (arrayList == null) {
                    return false;
                }
                e0Var.a();
                if (e0Var.b.isEmpty()) {
                    return false;
                }
                Iterator<IntentFilter> it = arrayList.iterator();
                while (it.hasNext()) {
                    IntentFilter next = it.next();
                    if (next != null) {
                        for (String str : e0Var.b) {
                            if (next.hasCategory(str)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x00f5, code lost:
            if (r5.hasNext() == false) goto L132;
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x00f9 A[EDGE_INSN: B:124:0x00f9->B:64:0x00f9 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0137  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01de  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int k(com.amazon.aps.iva.f8.y r14) {
            /*
                Method dump skipped, instructions count: 585
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f8.f0.h.k(com.amazon.aps.iva.f8.y):int");
        }

        public final void l(int i) {
            a0.e eVar;
            a0.e eVar2;
            f0.b();
            d c = f0.c();
            int min = Math.min(this.p, Math.max(0, i));
            if (this == c.t && (eVar2 = c.u) != null) {
                eVar2.f(min);
                return;
            }
            HashMap hashMap = c.x;
            if (!hashMap.isEmpty() && (eVar = (a0.e) hashMap.get(this.c)) != null) {
                eVar.f(min);
            }
        }

        public final void m(int i) {
            a0.e eVar;
            a0.e eVar2;
            f0.b();
            if (i != 0) {
                d c = f0.c();
                if (this == c.t && (eVar2 = c.u) != null) {
                    eVar2.i(i);
                    return;
                }
                HashMap hashMap = c.x;
                if (!hashMap.isEmpty() && (eVar = (a0.e) hashMap.get(this.c)) != null) {
                    eVar.i(i);
                }
            }
        }

        public final void n() {
            f0.b();
            f0.c().k(this, 3);
        }

        public final boolean o(String str) {
            f0.b();
            ArrayList<IntentFilter> arrayList = this.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        public final void p(Collection<a0.b.a> collection) {
            this.u.clear();
            if (this.v == null) {
                this.v = new com.amazon.aps.iva.x.a();
            }
            this.v.clear();
            for (a0.b.a aVar : collection) {
                h a2 = this.a.a(aVar.a.e());
                if (a2 != null) {
                    this.v.put(a2.c, aVar);
                    int i = aVar.b;
                    if (i == 2 || i == 3) {
                        this.u.add(a2);
                    }
                }
            }
            f0.c().n.b(259, this);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
            sb.append(this.c);
            sb.append(", name=");
            sb.append(this.d);
            sb.append(", description=");
            sb.append(this.e);
            sb.append(", iconUri=");
            sb.append(this.f);
            sb.append(", enabled=");
            sb.append(this.g);
            sb.append(", connectionState=");
            sb.append(this.h);
            sb.append(", canDisconnect=");
            sb.append(this.i);
            sb.append(", playbackType=");
            sb.append(this.k);
            sb.append(", playbackStream=");
            sb.append(this.l);
            sb.append(", deviceType=");
            sb.append(this.m);
            sb.append(", volumeHandling=");
            sb.append(this.n);
            sb.append(", volume=");
            sb.append(this.o);
            sb.append(", volumeMax=");
            sb.append(this.p);
            sb.append(", presentationDisplayId=");
            sb.append(this.q);
            sb.append(", extras=");
            sb.append(this.r);
            sb.append(", settingsIntent=");
            sb.append(this.s);
            sb.append(", providerPackageName=");
            sb.append(this.a.d.a.getPackageName());
            if (g()) {
                sb.append(", members=[");
                int size = this.u.size();
                for (int i = 0; i < size; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    if (this.u.get(i) != this) {
                        sb.append(((h) this.u.get(i)).c);
                    }
                }
                sb.append(']');
            }
            sb.append(" }");
            return sb.toString();
        }
    }

    static {
        Log.isLoggable("MediaRouter", 3);
    }

    public f0(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
    }

    public static d c() {
        d dVar = c;
        if (dVar == null) {
            return null;
        }
        if (!dVar.b) {
            dVar.b = true;
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            Context context = dVar.a;
            if (i >= 30) {
                int i2 = r0.a;
                Intent intent = new Intent(context, r0.class);
                intent.setPackage(context.getPackageName());
                if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                    z = true;
                }
                dVar.e = z;
            } else {
                dVar.e = false;
            }
            if (dVar.e) {
                dVar.f = new r(context, new d.e());
            } else {
                dVar.f = null;
            }
            dVar.c = new w0.a(context, dVar);
            dVar.p = new j0(new g0(dVar));
            dVar.a(dVar.c, true);
            r rVar = dVar.f;
            if (rVar != null) {
                dVar.a(rVar, true);
            }
            u0 u0Var = new u0(context, dVar);
            dVar.d = u0Var;
            if (!u0Var.f) {
                u0Var.f = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                Handler handler = u0Var.c;
                u0.a aVar = u0Var.g;
                Context context2 = u0Var.a;
                if (i < 33) {
                    context2.registerReceiver(aVar, intentFilter, null, handler);
                } else {
                    u0.c.a(context2, aVar, intentFilter, handler, 4);
                }
                handler.post(u0Var.h);
            }
        }
        return c;
    }

    public static f0 d(Context context) {
        if (context != null) {
            b();
            if (c == null) {
                c = new d(context.getApplicationContext());
            }
            ArrayList<WeakReference<f0>> arrayList = c.g;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    f0 f0Var = arrayList.get(size).get();
                    if (f0Var == null) {
                        arrayList.remove(size);
                    } else if (f0Var.a == context) {
                        return f0Var;
                    }
                } else {
                    f0 f0Var2 = new f0(context);
                    arrayList.add(new WeakReference<>(f0Var2));
                    return f0Var2;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static MediaSessionCompat.Token e() {
        d dVar = c;
        if (dVar != null) {
            d.C0244d c0244d = dVar.D;
            if (c0244d != null) {
                MediaSessionCompat mediaSessionCompat = c0244d.a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.a.b;
                }
            } else {
                MediaSessionCompat mediaSessionCompat2 = dVar.E;
                if (mediaSessionCompat2 != null) {
                    return mediaSessionCompat2.a.b;
                }
            }
        }
        return null;
    }

    public static List f() {
        b();
        d c2 = c();
        if (c2 == null) {
            return Collections.emptyList();
        }
        return c2.h;
    }

    public static h g() {
        b();
        return c().f();
    }

    public static boolean h() {
        Bundle bundle;
        if (c == null) {
            return false;
        }
        q0 q0Var = c().q;
        if (q0Var != null && (bundle = q0Var.e) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
            return false;
        }
        return true;
    }

    public static void j(h hVar) {
        if (hVar != null) {
            b();
            c().k(hVar, 3);
            return;
        }
        throw new IllegalArgumentException("route must not be null");
    }

    public static void k(q0 q0Var) {
        boolean z;
        b();
        d c2 = c();
        q0 q0Var2 = c2.q;
        c2.q = q0Var;
        if (c2.g()) {
            if (c2.f == null) {
                r rVar = new r(c2.a, new d.e());
                c2.f = rVar;
                c2.a(rVar, true);
                c2.m();
                u0 u0Var = c2.d;
                u0Var.c.post(u0Var.h);
            }
            boolean z2 = false;
            if (q0Var2 != null && q0Var2.d) {
                z = true;
            } else {
                z = false;
            }
            if (q0Var.d) {
                z2 = true;
            }
            if (z != z2) {
                r rVar2 = c2.f;
                rVar2.f = c2.z;
                if (!rVar2.g) {
                    rVar2.g = true;
                    rVar2.d.sendEmptyMessage(2);
                }
            }
        } else {
            r rVar3 = c2.f;
            if (rVar3 != null) {
                c2.j(rVar3);
                c2.f = null;
                u0 u0Var2 = c2.d;
                u0Var2.c.post(u0Var2.h);
            }
        }
        c2.n.b(769, q0Var);
    }

    public static void l(int i) {
        if (i >= 0 && i <= 3) {
            b();
            d c2 = c();
            h c3 = c2.c();
            if (c2.f() != c3) {
                c2.k(c3, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Unsupported reason to unselect route");
    }

    public final void a(e0 e0Var, a aVar, int i) {
        b bVar;
        if (e0Var != null) {
            if (aVar != null) {
                b();
                ArrayList<b> arrayList = this.b;
                int size = arrayList.size();
                boolean z = false;
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        if (arrayList.get(i2).b == aVar) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                if (i2 < 0) {
                    bVar = new b(this, aVar);
                    arrayList.add(bVar);
                } else {
                    bVar = arrayList.get(i2);
                }
                boolean z2 = true;
                if (i != bVar.d) {
                    bVar.d = i;
                    z = true;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((i & 1) != 0) {
                    z = true;
                }
                bVar.e = elapsedRealtime;
                e0 e0Var2 = bVar.c;
                e0Var2.a();
                e0Var.a();
                if (!e0Var2.b.containsAll(e0Var.b)) {
                    e0.a aVar2 = new e0.a(bVar.c);
                    aVar2.a(e0Var.c());
                    bVar.c = aVar2.b();
                } else {
                    z2 = z;
                }
                if (z2) {
                    c().m();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("callback must not be null");
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void i(a aVar) {
        if (aVar != null) {
            b();
            ArrayList<b> arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (arrayList.get(i).b == aVar) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                arrayList.remove(i);
                c().m();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    /* compiled from: MediaRouter.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public void a(Bundle bundle) {
        }

        public void b(Bundle bundle) {
        }
    }
}
