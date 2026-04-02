package com.amazon.aps.iva.f8;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.MediaRouter2$TransferCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import android.util.SparseArray;
import com.amazon.aps.iva.f8.a0;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.f8.y;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: MediaRoute2Provider.java */
/* loaded from: classes.dex */
public final class r extends a0 {
    public static final /* synthetic */ int s = 0;
    public final MediaRouter2 j;
    public final a k;
    public final ArrayMap l;
    public final MediaRouter2$RouteCallback m;
    public final g n;
    public final b o;
    public final com.amazon.aps.iva.i2.l0 p;
    public ArrayList q;
    public final ArrayMap r;

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class b extends MediaRouter2$ControllerCallback {
        public b() {
        }

        public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            r.this.t(routingController);
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class c extends a0.b {
        public final String f;
        public final MediaRouter2.RoutingController g;
        public final Messenger h;
        public final Messenger i;
        public final Handler k;
        public y o;
        public final SparseArray<f0.c> j = new SparseArray<>();
        public final AtomicInteger l = new AtomicInteger(1);
        public final com.amazon.aps.iva.e.d m = new com.amazon.aps.iva.e.d(this, 9);
        public int n = -1;

        /* compiled from: MediaRoute2Provider.java */
        /* loaded from: classes.dex */
        public class a extends Handler {
            public a() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                int i2 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                c cVar = c.this;
                f0.c cVar2 = cVar.j.get(i2);
                if (cVar2 == null) {
                    return;
                }
                cVar.j.remove(i2);
                if (i != 3) {
                    if (i == 4) {
                        if (peekData != null) {
                            peekData.getString("error");
                        }
                        cVar2.a((Bundle) obj);
                        return;
                    }
                    return;
                }
                cVar2.b((Bundle) obj);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
            r3 = r3.getControlHints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(android.media.MediaRouter2.RoutingController r3, java.lang.String r4) {
            /*
                r1 = this;
                com.amazon.aps.iva.f8.r.this = r2
                r1.<init>()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                r1.j = r2
                java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
                r0 = 1
                r2.<init>(r0)
                r1.l = r2
                com.amazon.aps.iva.e.d r2 = new com.amazon.aps.iva.e.d
                r0 = 9
                r2.<init>(r1, r0)
                r1.m = r2
                r2 = -1
                r1.n = r2
                r1.g = r3
                r1.f = r4
                int r2 = com.amazon.aps.iva.f8.r.s
                r2 = 0
                if (r3 != 0) goto L2a
                goto L30
            L2a:
                android.os.Bundle r3 = com.amazon.aps.iva.f8.b.b(r3)
                if (r3 != 0) goto L32
            L30:
                r3 = r2
                goto L3a
            L32:
                java.lang.String r4 = "androidx.mediarouter.media.KEY_MESSENGER"
                android.os.Parcelable r3 = r3.getParcelable(r4)
                android.os.Messenger r3 = (android.os.Messenger) r3
            L3a:
                r1.h = r3
                if (r3 != 0) goto L3f
                goto L49
            L3f:
                android.os.Messenger r2 = new android.os.Messenger
                com.amazon.aps.iva.f8.r$c$a r3 = new com.amazon.aps.iva.f8.r$c$a
                r3.<init>()
                r2.<init>(r3)
            L49:
                r1.i = r2
                android.os.Handler r2 = new android.os.Handler
                android.os.Looper r3 = android.os.Looper.getMainLooper()
                r2.<init>(r3)
                r1.k = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f8.r.c.<init>(com.amazon.aps.iva.f8.r, android.media.MediaRouter2$RoutingController, java.lang.String):void");
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void d() {
            this.g.release();
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void f(int i) {
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController != null) {
                routingController.setVolume(i);
                this.n = i;
                Handler handler = this.k;
                com.amazon.aps.iva.e.d dVar = this.m;
                handler.removeCallbacks(dVar);
                handler.postDelayed(dVar, 1000L);
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void i(int i) {
            int volumeMax;
            MediaRouter2.RoutingController routingController = this.g;
            if (routingController == null) {
                return;
            }
            int i2 = this.n;
            if (i2 < 0) {
                i2 = routingController.getVolume();
            }
            int i3 = i2 + i;
            volumeMax = routingController.getVolumeMax();
            int max = Math.max(0, Math.min(i3, volumeMax));
            this.n = max;
            routingController.setVolume(max);
            Handler handler = this.k;
            com.amazon.aps.iva.e.d dVar = this.m;
            handler.removeCallbacks(dVar);
            handler.postDelayed(dVar, 1000L);
        }

        @Override // com.amazon.aps.iva.f8.a0.b
        public final void m(String str) {
            MediaRoute2Info r;
            if (str != null && !str.isEmpty() && (r = r.this.r(str)) != null) {
                this.g.selectRoute(r);
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.b
        public final void n(String str) {
            MediaRoute2Info r;
            if (str != null && !str.isEmpty() && (r = r.this.r(str)) != null) {
                this.g.deselectRoute(r);
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.b
        public final void o(List<String> list) {
            r rVar;
            MediaRoute2Info r;
            if (list != null && !list.isEmpty() && (r = (rVar = r.this).r(list.get(0))) != null) {
                rVar.j.transferTo(r);
            }
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class d extends a0.e {
        public final String a;
        public final c b;

        public d(String str, c cVar) {
            this.a = str;
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void f(int i) {
            c cVar;
            MediaRouter2.RoutingController routingController;
            boolean isReleased;
            Messenger messenger;
            String str = this.a;
            if (str != null && (cVar = this.b) != null && (routingController = cVar.g) != null) {
                isReleased = routingController.isReleased();
                if (!isReleased && (messenger = cVar.h) != null) {
                    int andIncrement = cVar.l.getAndIncrement();
                    Message obtain = Message.obtain();
                    obtain.what = 7;
                    obtain.arg1 = andIncrement;
                    Bundle bundle = new Bundle();
                    bundle.putInt("volume", i);
                    bundle.putString("routeId", str);
                    obtain.setData(bundle);
                    obtain.replyTo = cVar.i;
                    try {
                        messenger.send(obtain);
                    } catch (DeadObjectException | RemoteException unused) {
                    }
                }
            }
        }

        @Override // com.amazon.aps.iva.f8.a0.e
        public final void i(int i) {
            c cVar;
            MediaRouter2.RoutingController routingController;
            boolean isReleased;
            Messenger messenger;
            String str = this.a;
            if (str != null && (cVar = this.b) != null && (routingController = cVar.g) != null) {
                isReleased = routingController.isReleased();
                if (!isReleased && (messenger = cVar.h) != null) {
                    int andIncrement = cVar.l.getAndIncrement();
                    Message obtain = Message.obtain();
                    obtain.what = 8;
                    obtain.arg1 = andIncrement;
                    Bundle bundle = new Bundle();
                    bundle.putInt("volume", i);
                    bundle.putString("routeId", str);
                    obtain.setData(bundle);
                    obtain.replyTo = cVar.i;
                    try {
                        messenger.send(obtain);
                    } catch (DeadObjectException | RemoteException unused) {
                    }
                }
            }
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class e extends MediaRouter2$RouteCallback {
        public e() {
        }

        public final void onRoutesAdded(List<MediaRoute2Info> list) {
            r.this.s();
        }

        public final void onRoutesChanged(List<MediaRoute2Info> list) {
            r.this.s();
        }

        public final void onRoutesRemoved(List<MediaRoute2Info> list) {
            r.this.s();
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class f extends MediaRouter2$RouteCallback {
        public f() {
        }

        public final void onRoutesUpdated(List<MediaRoute2Info> list) {
            r.this.s();
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class g extends MediaRouter2$TransferCallback {
        public g() {
        }

        public final void onStop(MediaRouter2.RoutingController routingController) {
            a0.e eVar = (a0.e) r.this.l.remove(routingController);
            if (eVar != null) {
                f0.d dVar = f0.d.this;
                if (eVar == dVar.u) {
                    f0.h c = dVar.c();
                    if (dVar.f() != c) {
                        dVar.l(c, 2);
                        return;
                    }
                    return;
                }
                f0.d dVar2 = f0.c;
                return;
            }
            Objects.toString(routingController);
        }

        public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
            MediaRouter2.RoutingController systemController;
            List selectedRoutes;
            String id;
            f0.h hVar;
            r.this.l.remove(routingController);
            systemController = r.this.j.getSystemController();
            if (routingController2 != systemController) {
                selectedRoutes = routingController2.getSelectedRoutes();
                if (!selectedRoutes.isEmpty()) {
                    id = com.amazon.aps.iva.f8.a.a(selectedRoutes.get(0)).getId();
                    r.this.l.put(routingController2, new c(routingController2, id));
                    f0.d dVar = f0.d.this;
                    Iterator<f0.h> it = dVar.h.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            hVar = it.next();
                            if (hVar.d() == dVar.f && TextUtils.equals(id, hVar.b)) {
                                break;
                            }
                        } else {
                            hVar = null;
                            break;
                        }
                    }
                    if (hVar != null) {
                        dVar.l(hVar, 3);
                    }
                    r.this.t(routingController2);
                    return;
                }
                return;
            }
            f0.d dVar2 = f0.d.this;
            f0.h c = dVar2.c();
            if (dVar2.f() != c) {
                dVar2.l(c, 3);
            }
        }

        public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
            Objects.toString(mediaRoute2Info);
        }
    }

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public r(Context context, f0.d.e eVar) {
        super(context, null);
        MediaRouter2 mediaRouter2;
        this.l = new ArrayMap();
        this.n = new g();
        this.o = new b();
        this.q = new ArrayList();
        this.r = new ArrayMap();
        mediaRouter2 = MediaRouter2.getInstance(context);
        this.j = mediaRouter2;
        this.k = eVar;
        this.p = new com.amazon.aps.iva.i2.l0(new Handler(Looper.getMainLooper()), 2);
        if (Build.VERSION.SDK_INT >= 34) {
            this.m = new f();
        } else {
            this.m = new e();
        }
    }

    @Override // com.amazon.aps.iva.f8.a0
    public final a0.b l(String str) {
        for (Map.Entry entry : this.l.entrySet()) {
            c cVar = (c) entry.getValue();
            if (TextUtils.equals(str, cVar.f)) {
                return cVar;
            }
        }
        return null;
    }

    @Override // com.amazon.aps.iva.f8.a0
    public final a0.e m(String str) {
        return new d((String) this.r.get(str), null);
    }

    @Override // com.amazon.aps.iva.f8.a0
    public final a0.e n(String str, String str2) {
        String id;
        String str3 = (String) this.r.get(str);
        for (c cVar : this.l.values()) {
            y yVar = cVar.o;
            if (yVar == null) {
                id = cVar.g.getId();
            } else {
                id = yVar.e();
            }
            if (TextUtils.equals(str2, id)) {
                return new d(str3, cVar);
            }
        }
        return new d(str3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    @Override // com.amazon.aps.iva.f8.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(com.amazon.aps.iva.f8.z r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.f8.r.o(com.amazon.aps.iva.f8.z):void");
    }

    public final MediaRoute2Info r(String str) {
        String id;
        if (str == null) {
            return null;
        }
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            MediaRoute2Info a2 = com.amazon.aps.iva.f8.a.a(it.next());
            id = a2.getId();
            if (TextUtils.equals(id, str)) {
                return a2;
            }
        }
        return null;
    }

    public final void s() {
        List<Object> routes;
        Bundle extras;
        String id;
        boolean isSystemRoute;
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        routes = this.j.getRoutes();
        for (Object obj : routes) {
            MediaRoute2Info a2 = com.amazon.aps.iva.f8.a.a(obj);
            if (a2 != null && !arraySet.contains(a2)) {
                isSystemRoute = a2.isSystemRoute();
                if (!isSystemRoute) {
                    arraySet.add(a2);
                    arrayList.add(a2);
                }
            }
        }
        if (arrayList.equals(this.q)) {
            return;
        }
        this.q = arrayList;
        ArrayMap arrayMap = this.r;
        arrayMap.clear();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            MediaRoute2Info a3 = com.amazon.aps.iva.f8.a.a(it.next());
            extras = a3.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                id = a3.getId();
                arrayMap.put(id, extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                a3.toString();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = this.q.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info a4 = com.amazon.aps.iva.f8.a.a(it2.next());
            y b2 = i0.b(a4);
            if (a4 != null) {
                arrayList2.add(b2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                y yVar = (y) it3.next();
                if (yVar != null) {
                    if (!arrayList3.contains(yVar)) {
                        arrayList3.add(yVar);
                    } else {
                        throw new IllegalArgumentException("route descriptor already added");
                    }
                } else {
                    throw new IllegalArgumentException("route must not be null");
                }
            }
        }
        p(new d0(arrayList3, true));
    }

    public final void t(MediaRouter2.RoutingController routingController) {
        List selectedRoutes;
        Bundle controlHints;
        y.a aVar;
        int volume;
        int volumeMax;
        int volumeHandling;
        List selectableRoutes;
        List deselectableRoutes;
        int i;
        String id;
        c cVar = (c) this.l.get(routingController);
        if (cVar != null) {
            selectedRoutes = routingController.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                routingController.toString();
                return;
            }
            ArrayList a2 = i0.a(selectedRoutes);
            y b2 = i0.b(com.amazon.aps.iva.f8.a.a(selectedRoutes.get(0)));
            controlHints = routingController.getControlHints();
            String string = this.b.getString(R.string.mr_dialog_default_group_name);
            y yVar = null;
            if (controlHints != null) {
                try {
                    String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                    if (!TextUtils.isEmpty(string2)) {
                        string = string2;
                    }
                    Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                    if (bundle != null) {
                        yVar = new y(bundle);
                    }
                } catch (Exception unused) {
                }
            }
            if (yVar == null) {
                id = routingController.getId();
                aVar = new y.a(id, string);
                Bundle bundle2 = aVar.a;
                bundle2.putInt("connectionState", 2);
                bundle2.putInt("playbackType", 1);
            } else {
                aVar = new y.a(yVar);
            }
            volume = routingController.getVolume();
            Bundle bundle3 = aVar.a;
            bundle3.putInt("volume", volume);
            volumeMax = routingController.getVolumeMax();
            bundle3.putInt("volumeMax", volumeMax);
            volumeHandling = routingController.getVolumeHandling();
            bundle3.putInt("volumeHandling", volumeHandling);
            aVar.c.clear();
            aVar.a(b2.b());
            ArrayList arrayList = aVar.b;
            arrayList.clear();
            if (!a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                }
            }
            y b3 = aVar.b();
            selectableRoutes = routingController.getSelectableRoutes();
            ArrayList a3 = i0.a(selectableRoutes);
            deselectableRoutes = routingController.getDeselectableRoutes();
            ArrayList a4 = i0.a(deselectableRoutes);
            d0 d0Var = this.h;
            if (d0Var == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            List<y> list = d0Var.a;
            if (!list.isEmpty()) {
                for (y yVar2 : list) {
                    String e2 = yVar2.e();
                    if (a2.contains(e2)) {
                        i = 3;
                    } else {
                        i = 1;
                    }
                    arrayList2.add(new a0.b.a(yVar2, i, a4.contains(e2), a3.contains(e2), true));
                }
            }
            cVar.o = b3;
            cVar.l(b3, arrayList2);
            return;
        }
        Objects.toString(routingController);
    }
}
