package com.amazon.aps.iva.f8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.amazon.aps.iva.f8.a0;
import com.amazon.aps.iva.f8.f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* compiled from: RegisteredMediaRouteProvider.java */
/* loaded from: classes.dex */
public final class t0 extends a0 implements ServiceConnection {
    public static final /* synthetic */ int r = 0;
    public final ComponentName j;
    public final d k;
    public final ArrayList<c> l;
    public boolean m;
    public boolean n;
    public a o;
    public boolean p;
    public b q;

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public final class a implements IBinder.DeathRecipient {
        public final Messenger b;
        public final e c;
        public final Messenger d;
        public int g;
        public int h;
        public int e = 1;
        public int f = 1;
        public final SparseArray<f0.c> i = new SparseArray<>();

        /* compiled from: RegisteredMediaRouteProvider.java */
        /* renamed from: com.amazon.aps.iva.f8.t0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0245a implements Runnable {
            public RunnableC0245a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                t0 t0Var = t0.this;
                if (t0Var.o == aVar) {
                    t0Var.t();
                }
            }
        }

        public a(Messenger messenger) {
            this.b = messenger;
            e eVar = new e(this);
            this.c = eVar;
            this.d = new Messenger(eVar);
        }

        public final void a(int i) {
            int i2 = this.e;
            this.e = i2 + 1;
            b(5, i2, i, null, null);
        }

        public final boolean b(int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            obtain.obj = bundle;
            obtain.setData(bundle2);
            obtain.replyTo = this.d;
            try {
                this.b.send(obtain);
                return true;
            } catch (DeadObjectException | RemoteException unused) {
                return false;
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t0.this.k.post(new RunnableC0245a());
        }

        public final void c(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.e;
            this.e = i3 + 1;
            b(7, i3, i, null, bundle);
        }

        public final void d(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.e;
            this.e = i3 + 1;
            b(8, i3, i, null, bundle);
        }
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(a aVar);

        int b();

        void c();
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static final class d extends Handler {
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static final class e extends Handler {
        public final WeakReference<a> a;

        public e(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            y yVar;
            y yVar2;
            a0.b.a aVar;
            a aVar2 = this.a.get();
            if (aVar2 != null) {
                int i = message.what;
                int i2 = message.arg1;
                int i3 = message.arg2;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                SparseArray<f0.c> sparseArray = aVar2.i;
                boolean z = true;
                f fVar = null;
                t0 t0Var = t0.this;
                switch (i) {
                    case 0:
                        if (i2 == aVar2.h) {
                            aVar2.h = 0;
                            if (t0Var.o == aVar2) {
                                t0Var.u();
                            }
                        }
                        f0.c cVar = sparseArray.get(i2);
                        if (cVar != null) {
                            sparseArray.remove(i2);
                            cVar.a(null);
                            break;
                        }
                        break;
                    case 1:
                        break;
                    case 2:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle = (Bundle) obj;
                            if (aVar2.g == 0 && i2 == aVar2.h && i3 >= 1) {
                                aVar2.h = 0;
                                aVar2.g = i3;
                                d0 a = d0.a(bundle);
                                if (t0Var.o == aVar2) {
                                    t0Var.p(a);
                                }
                                if (t0Var.o == aVar2) {
                                    t0Var.p = true;
                                    ArrayList<c> arrayList = t0Var.l;
                                    int size = arrayList.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        arrayList.get(i4).a(t0Var.o);
                                    }
                                    z zVar = t0Var.f;
                                    if (zVar != null) {
                                        a aVar3 = t0Var.o;
                                        int i5 = aVar3.e;
                                        aVar3.e = i5 + 1;
                                        aVar3.b(10, i5, 0, zVar.a, null);
                                        break;
                                    }
                                }
                            }
                        }
                        z = false;
                        break;
                    case 3:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle2 = (Bundle) obj;
                            f0.c cVar2 = sparseArray.get(i2);
                            if (cVar2 != null) {
                                sparseArray.remove(i2);
                                cVar2.b(bundle2);
                                break;
                            }
                        }
                        z = false;
                        break;
                    case 4:
                        if (obj == null || (obj instanceof Bundle)) {
                            if (peekData != null) {
                                peekData.getString("error");
                            }
                            Bundle bundle3 = (Bundle) obj;
                            f0.c cVar3 = sparseArray.get(i2);
                            if (cVar3 != null) {
                                sparseArray.remove(i2);
                                cVar3.a(bundle3);
                                break;
                            }
                        }
                        z = false;
                        break;
                    case 5:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle4 = (Bundle) obj;
                            if (aVar2.g != 0) {
                                d0 a2 = d0.a(bundle4);
                                if (t0Var.o == aVar2) {
                                    t0Var.p(a2);
                                    break;
                                }
                            }
                        }
                        z = false;
                        break;
                    case 6:
                        if (obj instanceof Bundle) {
                            Bundle bundle5 = (Bundle) obj;
                            f0.c cVar4 = sparseArray.get(i2);
                            if (bundle5 != null && bundle5.containsKey("routeId")) {
                                sparseArray.remove(i2);
                                cVar4.b(bundle5);
                            } else {
                                cVar4.a(bundle5);
                            }
                        }
                        z = false;
                        break;
                    case 7:
                        if (obj == null || (obj instanceof Bundle)) {
                            Bundle bundle6 = (Bundle) obj;
                            if (aVar2.g != 0) {
                                Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                if (bundle7 != null) {
                                    yVar = new y(bundle7);
                                } else {
                                    yVar = null;
                                }
                                ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = parcelableArrayList.iterator();
                                while (it.hasNext()) {
                                    Bundle bundle8 = (Bundle) it.next();
                                    if (bundle8 == null) {
                                        aVar = null;
                                    } else {
                                        Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                        if (bundle9 != null) {
                                            yVar2 = new y(bundle9);
                                        } else {
                                            yVar2 = null;
                                        }
                                        aVar = new a0.b.a(yVar2, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                    }
                                    arrayList2.add(aVar);
                                }
                                if (t0Var.o == aVar2) {
                                    Iterator<c> it2 = t0Var.l.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            c next = it2.next();
                                            if (next.b() == i3) {
                                                fVar = next;
                                            }
                                        }
                                    }
                                    if (fVar instanceof f) {
                                        fVar.l(yVar, arrayList2);
                                        break;
                                    }
                                }
                            }
                        }
                        z = false;
                        break;
                    case 8:
                        if (t0Var.o == aVar2) {
                            ArrayList<c> arrayList3 = t0Var.l;
                            Iterator<c> it3 = arrayList3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    c next2 = it3.next();
                                    if (next2.b() == i3) {
                                        fVar = next2;
                                    }
                                }
                            }
                            b bVar = t0Var.q;
                            if (bVar != null && (fVar instanceof a0.e)) {
                                a0.e eVar = (a0.e) fVar;
                                f0.d dVar = (f0.d) ((u0) ((com.amazon.aps.iva.n4.e) bVar).c).b;
                                if (dVar.u == eVar) {
                                    dVar.k(dVar.c(), 2);
                                }
                            }
                            arrayList3.remove(fVar);
                            fVar.c();
                            t0Var.v();
                        }
                        z = false;
                        break;
                    default:
                        z = false;
                        break;
                }
                if (!z) {
                    int i6 = t0.r;
                }
            }
        }
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public final class f extends a0.b implements c {
        public final String f;
        public String g;
        public String h;
        public boolean i;
        public int k;
        public a l;
        public int j = -1;
        public int m = -1;

        /* compiled from: RegisteredMediaRouteProvider.java */
        /* loaded from: classes.dex */
        public class a extends f0.c {
            public a() {
            }

            @Override // com.amazon.aps.iva.f8.f0.c
            public final void a(Bundle bundle) {
                Objects.toString(bundle);
            }

            @Override // com.amazon.aps.iva.f8.f0.c
            public final void b(Bundle bundle) {
                String string = bundle.getString("groupableTitle");
                f fVar = f.this;
                fVar.g = string;
                fVar.h = bundle.getString("transferableTitle");
            }
        }

        public f(String str) {
            this.f = str;
        }

        @Override // com.amazon.aps.iva.f8.t0.c
        public final void a(a aVar) {
            a aVar2 = new a();
            this.l = aVar;
            int i = aVar.f;
            aVar.f = i + 1;
            int i2 = aVar.e;
            aVar.e = i2 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", this.f);
            aVar.b(11, i2, i, null, bundle);
            aVar.i.put(i2, aVar2);
            this.m = i;
            if (this.i) {
                aVar.a(i);
                int i3 = this.j;
                if (i3 >= 0) {
                    aVar.c(this.m, i3);
                    this.j = -1;
                }
                int i4 = this.k;
                if (i4 != 0) {
                    aVar.d(this.m, i4);
                    this.k = 0;
                }
            }
        }

        @Override // com.amazon.aps.iva.f8.t0.c
        public final int b() {
            return this.m;
        }

        @Override // com.amazon.aps.iva.f8.t0.c
        public final void c() {
            a aVar = this.l;
            if (aVar != null) {
                int i = this.m;
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(4, i2, i, null, null);
                this.l = null;
                this.m = 0;
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void d() {
            t0 t0Var = t0.this;
            t0Var.l.remove(this);
            c();
            t0Var.v();
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void e() {
            this.i = true;
            a aVar = this.l;
            if (aVar != null) {
                aVar.a(this.m);
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void f(int i) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.c(this.m, i);
                return;
            }
            this.j = i;
            this.k = 0;
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void g() {
            h(0);
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void h(int i) {
            this.i = false;
            a aVar = this.l;
            if (aVar != null) {
                int i2 = this.m;
                Bundle bundle = new Bundle();
                bundle.putInt("unselectReason", i);
                int i3 = aVar.e;
                aVar.e = i3 + 1;
                aVar.b(6, i3, i2, null, bundle);
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void i(int i) {
            a aVar = this.l;
            if (aVar != null) {
                aVar.d(this.m, i);
            } else {
                this.k += i;
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.b
        public final String j() {
            return this.g;
        }

        @Override // com.amazon.aps.iva.f8.a0.b
        public final String k() {
            return this.h;
        }

        @Override // com.amazon.aps.iva.f8.a0.b
        public final void m(String str) {
            a aVar = this.l;
            if (aVar != null) {
                int i = this.m;
                Bundle bundle = new Bundle();
                bundle.putString("memberRouteId", str);
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(12, i2, i, null, bundle);
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.b
        public final void n(String str) {
            a aVar = this.l;
            if (aVar != null) {
                int i = this.m;
                Bundle bundle = new Bundle();
                bundle.putString("memberRouteId", str);
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(13, i2, i, null, bundle);
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.b
        public final void o(List<String> list) {
            a aVar = this.l;
            if (aVar != null) {
                int i = this.m;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(14, i2, i, null, bundle);
            }
        }
    }

    /* compiled from: RegisteredMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public final class g extends a0.e implements c {
        public final String a;
        public final String b;
        public boolean c;
        public int d = -1;
        public int e;
        public a f;
        public int g;

        public g(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // com.amazon.aps.iva.f8.t0.c
        public final void a(a aVar) {
            this.f = aVar;
            int i = aVar.f;
            aVar.f = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", this.a);
            bundle.putString("routeGroupId", this.b);
            int i2 = aVar.e;
            aVar.e = i2 + 1;
            aVar.b(3, i2, i, null, bundle);
            this.g = i;
            if (this.c) {
                aVar.a(i);
                int i3 = this.d;
                if (i3 >= 0) {
                    aVar.c(this.g, i3);
                    this.d = -1;
                }
                int i4 = this.e;
                if (i4 != 0) {
                    aVar.d(this.g, i4);
                    this.e = 0;
                }
            }
        }

        @Override // com.amazon.aps.iva.f8.t0.c
        public final int b() {
            return this.g;
        }

        @Override // com.amazon.aps.iva.f8.t0.c
        public final void c() {
            a aVar = this.f;
            if (aVar != null) {
                int i = this.g;
                int i2 = aVar.e;
                aVar.e = i2 + 1;
                aVar.b(4, i2, i, null, null);
                this.f = null;
                this.g = 0;
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void d() {
            t0 t0Var = t0.this;
            t0Var.l.remove(this);
            c();
            t0Var.v();
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void e() {
            this.c = true;
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(this.g);
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void f(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.c(this.g, i);
                return;
            }
            this.d = i;
            this.e = 0;
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void g() {
            h(0);
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void h(int i) {
            this.c = false;
            a aVar = this.f;
            if (aVar != null) {
                int i2 = this.g;
                Bundle bundle = new Bundle();
                bundle.putInt("unselectReason", i);
                int i3 = aVar.e;
                aVar.e = i3 + 1;
                aVar.b(6, i3, i2, null, bundle);
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void i(int i) {
            a aVar = this.f;
            if (aVar != null) {
                aVar.d(this.g, i);
            } else {
                this.e += i;
            }
        }
    }

    static {
        Log.isLoggable("MediaRouteProviderProxy", 3);
    }

    public t0(Context context, ComponentName componentName) {
        super(context, new a0.d(componentName));
        this.l = new ArrayList<>();
        this.j = componentName;
        this.k = new d();
    }

    @Override // com.amazon.aps.iva.f8.a0
    public final a0.b l(String str) {
        if (str != null) {
            d0 d0Var = this.h;
            if (d0Var != null) {
                List<y> list = d0Var.a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (list.get(i).e().equals(str)) {
                        f fVar = new f(str);
                        this.l.add(fVar);
                        if (this.p) {
                            fVar.a(this.o);
                        }
                        v();
                        return fVar;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // com.amazon.aps.iva.f8.a0
    public final a0.e m(String str) {
        if (str != null) {
            return s(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // com.amazon.aps.iva.f8.a0
    public final a0.e n(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                return s(str, str2);
            }
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // com.amazon.aps.iva.f8.a0
    public final void o(z zVar) {
        Bundle bundle;
        if (this.p) {
            a aVar = this.o;
            int i = aVar.e;
            aVar.e = i + 1;
            if (zVar != null) {
                bundle = zVar.a;
            } else {
                bundle = null;
            }
            aVar.b(10, i, 0, bundle, null);
        }
        v();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r9, android.os.IBinder r10) {
        /*
            r8 = this;
            boolean r9 = r8.n
            if (r9 == 0) goto L4e
            r8.t()
            if (r10 == 0) goto Lf
            android.os.Messenger r9 = new android.os.Messenger
            r9.<init>(r10)
            goto L10
        Lf:
            r9 = 0
        L10:
            r10 = 1
            r0 = 0
            if (r9 == 0) goto L1c
            android.os.IBinder r1 = r9.getBinder()     // Catch: java.lang.NullPointerException -> L1c
            if (r1 == 0) goto L1c
            r1 = r10
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 == 0) goto L4b
            com.amazon.aps.iva.f8.t0$a r1 = new com.amazon.aps.iva.f8.t0$a
            r1.<init>(r9)
            int r4 = r1.e
            int r9 = r4 + 1
            r1.e = r9
            r1.h = r4
            r3 = 1
            r5 = 4
            r6 = 0
            r7 = 0
            r2 = r1
            boolean r9 = r2.b(r3, r4, r5, r6, r7)
            if (r9 != 0) goto L38
            goto L45
        L38:
            android.os.Messenger r9 = r1.b     // Catch: android.os.RemoteException -> L42
            android.os.IBinder r9 = r9.getBinder()     // Catch: android.os.RemoteException -> L42
            r9.linkToDeath(r1, r0)     // Catch: android.os.RemoteException -> L42
            goto L46
        L42:
            r1.binderDied()
        L45:
            r10 = r0
        L46:
            if (r10 == 0) goto L4e
            r8.o = r1
            goto L4e
        L4b:
            r8.toString()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f8.t0.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        t();
    }

    public final void r() {
        int i;
        if (!this.n) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.j);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    i = 4097;
                } else {
                    i = 1;
                }
                this.n = this.b.bindService(intent, this, i);
            } catch (SecurityException unused) {
            }
        }
    }

    public final g s(String str, String str2) {
        d0 d0Var = this.h;
        if (d0Var != null) {
            List<y> list = d0Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).e().equals(str)) {
                    g gVar = new g(str, str2);
                    this.l.add(gVar);
                    if (this.p) {
                        gVar.a(this.o);
                    }
                    v();
                    return gVar;
                }
            }
            return null;
        }
        return null;
    }

    public final void t() {
        if (this.o != null) {
            p(null);
            this.p = false;
            ArrayList<c> arrayList = this.l;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).c();
            }
            a aVar = this.o;
            aVar.b(2, 0, 0, null, null);
            aVar.c.a.clear();
            aVar.b.getBinder().unlinkToDeath(aVar, 0);
            t0.this.k.post(new s0(aVar));
            this.o = null;
        }
    }

    public final String toString() {
        return "Service connection " + this.j.flattenToShortString();
    }

    public final void u() {
        if (this.n) {
            this.n = false;
            t();
            try {
                this.b.unbindService(this);
            } catch (IllegalArgumentException unused) {
                toString();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2.l.isEmpty() == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v() {
        /*
            r2 = this;
            boolean r0 = r2.m
            if (r0 == 0) goto L13
            com.amazon.aps.iva.f8.z r0 = r2.f
            r1 = 1
            if (r0 == 0) goto La
            goto L14
        La:
            java.util.ArrayList<com.amazon.aps.iva.f8.t0$c> r0 = r2.l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            if (r1 == 0) goto L1a
            r2.r()
            goto L1d
        L1a:
            r2.u()
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f8.t0.v():void");
    }
}
