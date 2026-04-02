package com.amazon.aps.iva.f8;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import com.amazon.aps.iva.f8.a0;
import com.amazon.aps.iva.f8.f0;
import com.amazon.aps.iva.f8.y;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.CredentialsData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: SystemMediaRouteProvider.java */
/* loaded from: classes.dex */
public abstract class w0 extends a0 {

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // com.amazon.aps.iva.f8.w0.d, com.amazon.aps.iva.f8.w0.c, com.amazon.aps.iva.f8.w0.b
        @SuppressLint({"WrongConstant"})
        public void x(b.C0246b c0246b, y.a aVar) {
            super.x(c0246b, aVar);
            aVar.a.putInt("deviceType", c0246b.a.getDeviceType());
        }
    }

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static class c extends b implements o0 {
        public boolean G(b.C0246b c0246b) {
            throw null;
        }

        @Override // com.amazon.aps.iva.f8.o0
        public final void d(MediaRouter.RouteInfo routeInfo) {
            Display display;
            int i;
            int s = s(routeInfo);
            if (s >= 0) {
                b.C0246b c0246b = this.r.get(s);
                try {
                    display = routeInfo.getPresentationDisplay();
                } catch (NoSuchMethodError unused) {
                    display = null;
                }
                if (display != null) {
                    i = display.getDisplayId();
                } else {
                    i = -1;
                }
                if (i != c0246b.c.a.getInt("presentationDisplayId", -1)) {
                    y yVar = c0246b.c;
                    new ArrayList();
                    new ArrayList();
                    new HashSet();
                    if (yVar != null) {
                        Bundle bundle = new Bundle(yVar.a);
                        ArrayList c = yVar.c();
                        ArrayList b = yVar.b();
                        HashSet a = yVar.a();
                        bundle.putInt("presentationDisplayId", i);
                        bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c));
                        bundle.putStringArrayList("allowedPackages", new ArrayList<>(a));
                        c0246b.c = new y(bundle);
                        B();
                        return;
                    }
                    throw new IllegalArgumentException("descriptor must not be null");
                }
            }
        }

        @Override // com.amazon.aps.iva.f8.w0.b
        public void x(b.C0246b c0246b, y.a aVar) {
            Display display;
            super.x(c0246b, aVar);
            MediaRouter.RouteInfo routeInfo = c0246b.a;
            boolean isEnabled = routeInfo.isEnabled();
            Bundle bundle = aVar.a;
            if (!isEnabled) {
                bundle.putBoolean("enabled", false);
            }
            if (G(c0246b)) {
                bundle.putInt("connectionState", 1);
            }
            try {
                display = routeInfo.getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                display = null;
            }
            if (display != null) {
                bundle.putInt("presentationDisplayId", display.getDisplayId());
            }
        }
    }

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        @Override // com.amazon.aps.iva.f8.w0.b
        public void C(MediaRouter.RouteInfo routeInfo) {
            this.k.selectRoute(8388611, routeInfo);
        }

        @Override // com.amazon.aps.iva.f8.w0.b
        public void D() {
            boolean z = this.q;
            MediaRouter.Callback callback = this.l;
            MediaRouter mediaRouter = this.k;
            if (z) {
                mediaRouter.removeCallback(callback);
            }
            this.q = true;
            mediaRouter.addCallback(this.o, callback, (this.p ? 1 : 0) | 2);
        }

        @Override // com.amazon.aps.iva.f8.w0.b
        public void F(b.c cVar) {
            super.F(cVar);
            cVar.b.setDescription(cVar.a.e);
        }

        @Override // com.amazon.aps.iva.f8.w0.c
        public boolean G(b.C0246b c0246b) {
            return c0246b.a.isConnecting();
        }

        @Override // com.amazon.aps.iva.f8.w0.b
        /* renamed from: H */
        public MediaRouter.RouteInfo v() {
            return this.k.getDefaultRoute();
        }

        @Override // com.amazon.aps.iva.f8.w0.c, com.amazon.aps.iva.f8.w0.b
        public void x(b.C0246b c0246b, y.a aVar) {
            super.x(c0246b, aVar);
            CharSequence description = c0246b.a.getDescription();
            if (description != null) {
                aVar.a.putString("status", description.toString());
            }
        }
    }

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    public w0(Context context) {
        super(context, new a0.d(new ComponentName(CredentialsData.CREDENTIALS_TYPE_ANDROID, w0.class.getName())));
    }

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static class b extends w0 implements k0, m0 {
        public static final ArrayList<IntentFilter> t;
        public static final ArrayList<IntentFilter> u;
        public final e j;
        public final MediaRouter k;
        public final MediaRouter.Callback l;
        public final n0 m;
        public final MediaRouter.RouteCategory n;
        public int o;
        public boolean p;
        public boolean q;
        public final ArrayList<C0246b> r;
        public final ArrayList<c> s;

        /* compiled from: SystemMediaRouteProvider.java */
        /* loaded from: classes.dex */
        public static final class a extends a0.e {
            public final MediaRouter.RouteInfo a;

            public a(MediaRouter.RouteInfo routeInfo) {
                this.a = routeInfo;
            }

            @Override // com.amazon.aps.iva.f8.a0.e
            public final void f(int i) {
                this.a.requestSetVolume(i);
            }

            @Override // com.amazon.aps.iva.f8.a0.e
            public final void i(int i) {
                this.a.requestUpdateVolume(i);
            }
        }

        /* compiled from: SystemMediaRouteProvider.java */
        /* renamed from: com.amazon.aps.iva.f8.w0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0246b {
            public final MediaRouter.RouteInfo a;
            public final String b;
            public y c;

            public C0246b(MediaRouter.RouteInfo routeInfo, String str) {
                this.a = routeInfo;
                this.b = str;
            }
        }

        /* compiled from: SystemMediaRouteProvider.java */
        /* loaded from: classes.dex */
        public static final class c {
            public final f0.h a;
            public final MediaRouter.UserRouteInfo b;

            public c(f0.h hVar, MediaRouter.UserRouteInfo userRouteInfo) {
                this.a = hVar;
                this.b = userRouteInfo;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            t = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            u = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, f0.d dVar) {
            super(context);
            this.r = new ArrayList<>();
            this.s = new ArrayList<>();
            this.j = dVar;
            MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
            this.k = mediaRouter;
            this.l = new p0((c) this);
            this.m = new n0(this);
            this.n = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
            E();
        }

        public static c w(MediaRouter.RouteInfo routeInfo) {
            Object tag = routeInfo.getTag();
            if (tag instanceof c) {
                return (c) tag;
            }
            return null;
        }

        public final void A(f0.h hVar) {
            if (!hVar.i()) {
                return;
            }
            if (hVar.d() != this) {
                int u2 = u(hVar);
                if (u2 >= 0) {
                    C(this.s.get(u2).b);
                    return;
                }
                return;
            }
            int t2 = t(hVar.b);
            if (t2 >= 0) {
                C(this.r.get(t2).a);
            }
        }

        public final void B() {
            ArrayList arrayList = new ArrayList();
            ArrayList<C0246b> arrayList2 = this.r;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                y yVar = arrayList2.get(i).c;
                if (yVar != null) {
                    if (!arrayList.contains(yVar)) {
                        arrayList.add(yVar);
                    } else {
                        throw new IllegalArgumentException("route descriptor already added");
                    }
                } else {
                    throw new IllegalArgumentException("route must not be null");
                }
            }
            p(new d0(arrayList, false));
        }

        public void C(MediaRouter.RouteInfo routeInfo) {
            throw null;
        }

        public void D() {
            throw null;
        }

        public final void E() {
            D();
            MediaRouter mediaRouter = this.k;
            int routeCount = mediaRouter.getRouteCount();
            ArrayList arrayList = new ArrayList(routeCount);
            boolean z = false;
            for (int i = 0; i < routeCount; i++) {
                arrayList.add(mediaRouter.getRouteAt(i));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z |= r((MediaRouter.RouteInfo) it.next());
            }
            if (z) {
                B();
            }
        }

        public void F(c cVar) {
            MediaRouter.UserRouteInfo userRouteInfo = cVar.b;
            f0.h hVar = cVar.a;
            userRouteInfo.setName(hVar.d);
            int i = hVar.k;
            MediaRouter.UserRouteInfo userRouteInfo2 = cVar.b;
            userRouteInfo2.setPlaybackType(i);
            userRouteInfo2.setPlaybackStream(hVar.l);
            userRouteInfo2.setVolume(hVar.o);
            userRouteInfo2.setVolumeMax(hVar.p);
            userRouteInfo2.setVolumeHandling(hVar.e());
        }

        @Override // com.amazon.aps.iva.f8.k0
        public final void b(MediaRouter.RouteInfo routeInfo) {
            if (r(routeInfo)) {
                B();
            }
        }

        @Override // com.amazon.aps.iva.f8.k0
        public final void c(MediaRouter.RouteInfo routeInfo) {
            int s;
            if (w(routeInfo) == null && (s = s(routeInfo)) >= 0) {
                this.r.remove(s);
                B();
            }
        }

        @Override // com.amazon.aps.iva.f8.m0
        public final void e(MediaRouter.RouteInfo routeInfo, int i) {
            c w = w(routeInfo);
            if (w != null) {
                w.a.m(i);
            }
        }

        @Override // com.amazon.aps.iva.f8.k0
        public final void f(MediaRouter.RouteInfo routeInfo) {
            int s;
            String str;
            if (w(routeInfo) == null && (s = s(routeInfo)) >= 0) {
                C0246b c0246b = this.r.get(s);
                String str2 = c0246b.b;
                CharSequence name = c0246b.a.getName(this.b);
                if (name != null) {
                    str = name.toString();
                } else {
                    str = "";
                }
                y.a aVar = new y.a(str2, str);
                x(c0246b, aVar);
                c0246b.c = aVar.b();
                B();
            }
        }

        @Override // com.amazon.aps.iva.f8.k0
        public final void g(MediaRouter.RouteInfo routeInfo) {
            f0.h a2;
            if (routeInfo != this.k.getSelectedRoute(8388611)) {
                return;
            }
            c w = w(routeInfo);
            if (w != null) {
                w.a.n();
                return;
            }
            int s = s(routeInfo);
            if (s >= 0) {
                String str = this.r.get(s).b;
                f0.d dVar = (f0.d) this.j;
                dVar.n.removeMessages(262);
                f0.g d = dVar.d(dVar.c);
                if (d != null && (a2 = d.a(str)) != null) {
                    a2.n();
                }
            }
        }

        @Override // com.amazon.aps.iva.f8.m0
        public final void i(MediaRouter.RouteInfo routeInfo, int i) {
            c w = w(routeInfo);
            if (w != null) {
                w.a.l(i);
            }
        }

        @Override // com.amazon.aps.iva.f8.k0
        public final void j(MediaRouter.RouteInfo routeInfo) {
            int s;
            if (w(routeInfo) == null && (s = s(routeInfo)) >= 0) {
                C0246b c0246b = this.r.get(s);
                int volume = routeInfo.getVolume();
                if (volume != c0246b.c.a.getInt("volume")) {
                    y yVar = c0246b.c;
                    new ArrayList();
                    new ArrayList();
                    new HashSet();
                    if (yVar != null) {
                        Bundle bundle = new Bundle(yVar.a);
                        ArrayList c2 = yVar.c();
                        ArrayList b = yVar.b();
                        HashSet a2 = yVar.a();
                        bundle.putInt("volume", volume);
                        bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b));
                        bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c2));
                        bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                        c0246b.c = new y(bundle);
                        B();
                        return;
                    }
                    throw new IllegalArgumentException("descriptor must not be null");
                }
            }
        }

        @Override // com.amazon.aps.iva.f8.a0
        public final a0.e m(String str) {
            int t2 = t(str);
            if (t2 >= 0) {
                return new a(this.r.get(t2).a);
            }
            return null;
        }

        @Override // com.amazon.aps.iva.f8.a0
        public final void o(z zVar) {
            boolean z;
            int i = 0;
            if (zVar != null) {
                zVar.a();
                ArrayList c2 = zVar.b.c();
                int size = c2.size();
                int i2 = 0;
                while (i < size) {
                    String str = (String) c2.get(i);
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        i2 |= 1;
                    } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                        i2 |= 2;
                    } else {
                        i2 |= 8388608;
                    }
                    i++;
                }
                z = zVar.b();
                i = i2;
            } else {
                z = false;
            }
            if (this.o != i || this.p != z) {
                this.o = i;
                this.p = z;
                E();
            }
        }

        public final boolean r(MediaRouter.RouteInfo routeInfo) {
            String str;
            String format;
            String format2;
            boolean z = false;
            if (w(routeInfo) != null || s(routeInfo) >= 0) {
                return false;
            }
            if (v() == routeInfo) {
                z = true;
            }
            String str2 = "";
            Context context = this.b;
            if (z) {
                format = "DEFAULT_ROUTE";
            } else {
                Locale locale = Locale.US;
                CharSequence name = routeInfo.getName(context);
                if (name == null) {
                    str = "";
                } else {
                    str = name.toString();
                }
                format = String.format(locale, "ROUTE_%08x", Integer.valueOf(str.hashCode()));
            }
            String str3 = format;
            if (t(str3) >= 0) {
                int i = 2;
                while (true) {
                    format2 = String.format(Locale.US, "%s_%d", str3, Integer.valueOf(i));
                    if (t(format2) < 0) {
                        break;
                    }
                    i++;
                }
                str3 = format2;
            }
            C0246b c0246b = new C0246b(routeInfo, str3);
            CharSequence name2 = routeInfo.getName(context);
            if (name2 != null) {
                str2 = name2.toString();
            }
            y.a aVar = new y.a(str3, str2);
            x(c0246b, aVar);
            c0246b.c = aVar.b();
            this.r.add(c0246b);
            return true;
        }

        public final int s(MediaRouter.RouteInfo routeInfo) {
            ArrayList<C0246b> arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i).a == routeInfo) {
                    return i;
                }
            }
            return -1;
        }

        public final int t(String str) {
            ArrayList<C0246b> arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public final int u(f0.h hVar) {
            ArrayList<c> arrayList = this.s;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i).a == hVar) {
                    return i;
                }
            }
            return -1;
        }

        public Object v() {
            throw null;
        }

        public void x(C0246b c0246b, y.a aVar) {
            int supportedTypes = c0246b.a.getSupportedTypes();
            if ((supportedTypes & 1) != 0) {
                aVar.a(t);
            }
            if ((supportedTypes & 2) != 0) {
                aVar.a(u);
            }
            MediaRouter.RouteInfo routeInfo = c0246b.a;
            aVar.a.putInt("playbackType", routeInfo.getPlaybackType());
            int playbackStream = routeInfo.getPlaybackStream();
            Bundle bundle = aVar.a;
            bundle.putInt("playbackStream", playbackStream);
            bundle.putInt("volume", routeInfo.getVolume());
            bundle.putInt("volumeMax", routeInfo.getVolumeMax());
            bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        }

        public final void y(f0.h hVar) {
            a0 d = hVar.d();
            MediaRouter mediaRouter = this.k;
            if (d != this) {
                MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.n);
                c cVar = new c(hVar, createUserRoute);
                createUserRoute.setTag(cVar);
                createUserRoute.setVolumeCallback(this.m);
                F(cVar);
                this.s.add(cVar);
                mediaRouter.addUserRoute(createUserRoute);
                return;
            }
            int s = s(mediaRouter.getSelectedRoute(8388611));
            if (s >= 0 && this.r.get(s).b.equals(hVar.b)) {
                hVar.n();
            }
        }

        public final void z(f0.h hVar) {
            int u2;
            if (hVar.d() != this && (u2 = u(hVar)) >= 0) {
                c remove = this.s.remove(u2);
                remove.b.setTag(null);
                MediaRouter.UserRouteInfo userRouteInfo = remove.b;
                userRouteInfo.setVolumeCallback(null);
                try {
                    this.k.removeUserRoute(userRouteInfo);
                } catch (IllegalArgumentException unused) {
                }
            }
        }

        @Override // com.amazon.aps.iva.f8.k0
        public final void a() {
        }

        @Override // com.amazon.aps.iva.f8.k0
        public final void h() {
        }

        @Override // com.amazon.aps.iva.f8.k0
        public final void k() {
        }
    }
}
