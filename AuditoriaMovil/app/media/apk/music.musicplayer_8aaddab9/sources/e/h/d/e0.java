package e.h.d;

import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import e.h.d.e0;
import e.h.d.w.g;
import e.h.g.s1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class e0 extends e.h.g.o1.d {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f8098l = 0;

    /* renamed from: m  reason: collision with root package name */
    public MediaSessionCompat.Token f8099m;

    /* renamed from: n  reason: collision with root package name */
    public final HashMap<IBinder, b> f8100n;
    public final l o;
    public c p;

    /* loaded from: classes2.dex */
    public static final class a {
        public final Bundle a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8101b;

        public a(String str, Bundle bundle) {
            this.f8101b = str;
            this.a = bundle;
        }
    }

    /* loaded from: classes2.dex */
    public class b {
        public j a;

        /* renamed from: b  reason: collision with root package name */
        public String f8102b;

        /* renamed from: c  reason: collision with root package name */
        public a f8103c;

        /* renamed from: d  reason: collision with root package name */
        public HashMap<String, List<c.i.j.b<IBinder, Bundle>>> f8104d = new HashMap<>();

        public b(e0 e0Var, c0 c0Var) {
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void b();

        IBinder e(Intent intent);

        void g(MediaSessionCompat.Token token);
    }

    /* loaded from: classes2.dex */
    public class d implements c, e.h.d.w.d {
        public Messenger a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8105b;

        /* loaded from: classes2.dex */
        public class a extends h<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ e.h.d.w.c f8107e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, Object obj, e.h.d.w.c cVar) {
                super(obj);
                this.f8107e = cVar;
            }

            @Override // e.h.d.e0.h
            public void a() {
                this.f8107e.a.detach();
            }

            @Override // e.h.d.e0.h
            public void b(List<MediaBrowserCompat.MediaItem> list, int i2) {
                ArrayList arrayList;
                List<MediaBrowserCompat.MediaItem> list2 = list;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f8107e.a(arrayList);
            }
        }

        public d() {
        }

        @Override // e.h.d.e0.c
        public void b() {
            e.h.d.w.b bVar = new e.h.d.w.b(e0.this, this);
            this.f8105b = bVar;
            bVar.onCreate();
        }

        @Override // e.h.d.w.d
        public void d(String str, e.h.d.w.c<List<Parcel>> cVar) {
            e0.this.p(str, new a(this, str, cVar));
        }

        @Override // e.h.d.e0.c
        public IBinder e(Intent intent) {
            return ((MediaBrowserService) this.f8105b).onBind(intent);
        }

        @Override // e.h.d.w.d
        public e.h.d.w.a f(String str, int i2, Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.a = new Messenger(e0.this.o);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 1);
                bundle2.putBinder("extra_messenger", this.a.getBinder());
            }
            a o = e0.this.o(str, i2, bundle);
            if (bundle2 == null) {
                bundle2 = o.a;
            } else {
                Bundle bundle3 = o.a;
                if (bundle3 != null) {
                    bundle2.putAll(bundle3);
                }
            }
            return new e.h.d.w.a(o.f8101b, bundle2);
        }

        @Override // e.h.d.e0.c
        public void g(MediaSessionCompat.Token token) {
            ((MediaBrowserService) this.f8105b).setSessionToken((MediaSession.Token) token.f24b);
        }
    }

    /* loaded from: classes2.dex */
    public class e extends d implements e.h.d.w.f {

        /* loaded from: classes2.dex */
        public class a extends h<MediaBrowserCompat.MediaItem> {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ e.h.d.w.c f8109e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Object obj, e.h.d.w.c cVar) {
                super(obj);
                this.f8109e = cVar;
            }

            @Override // e.h.d.e0.h
            public void a() {
                this.f8109e.a.detach();
            }

            @Override // e.h.d.e0.h
            public void b(MediaBrowserCompat.MediaItem mediaItem, int i2) {
                Parcel obtain = Parcel.obtain();
                mediaItem.writeToParcel(obtain, 0);
                this.f8109e.a(obtain);
            }
        }

        public e() {
            super();
        }

        @Override // e.h.d.w.f
        public void a(String str, e.h.d.w.c<Parcel> cVar) {
            e0.this.r(new a(this, str, cVar));
        }

        @Override // e.h.d.e0.d, e.h.d.e0.c
        public void b() {
            e.h.d.w.e eVar = new e.h.d.w.e(e0.this, this);
            this.f8105b = eVar;
            eVar.onCreate();
        }
    }

    /* loaded from: classes2.dex */
    public class f extends e implements g.c {

        /* loaded from: classes2.dex */
        public class a extends h<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ g.b f8111e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, Object obj, g.b bVar) {
                super(obj);
                this.f8111e = bVar;
            }

            @Override // e.h.d.e0.h
            public void a() {
                this.f8111e.a.detach();
            }

            @Override // e.h.d.e0.h
            public void b(List<MediaBrowserCompat.MediaItem> list, int i2) {
                ArrayList<Parcel> arrayList;
                List<MediaBrowserCompat.MediaItem> list2 = list;
                ArrayList arrayList2 = null;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem mediaItem : list2) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                g.b bVar = this.f8111e;
                Objects.requireNonNull(bVar);
                try {
                    e.h.d.w.g.a.setInt(bVar.a, i2);
                } catch (IllegalAccessException e2) {
                    Log.w("MBSCompatApi24", e2);
                }
                MediaBrowserService.Result result = bVar.a;
                if (arrayList != null) {
                    arrayList2 = new ArrayList();
                    for (Parcel parcel : arrayList) {
                        parcel.setDataPosition(0);
                        arrayList2.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                result.sendResult(arrayList2);
            }
        }

        public f() {
            super();
        }

        @Override // e.h.d.e0.e, e.h.d.e0.d, e.h.d.e0.c
        public void b() {
            e0 e0Var = e0.this;
            Field field = e.h.d.w.g.a;
            g.a aVar = new g.a(e0Var, this);
            this.f8105b = aVar;
            aVar.onCreate();
        }

        @Override // e.h.d.w.g.c
        public void c(String str, g.b bVar, Bundle bundle) {
            e0.this.q(str, new a(this, str, bVar));
        }
    }

    /* loaded from: classes2.dex */
    public class g implements c {
        public Messenger a;

        public g() {
        }

        @Override // e.h.d.e0.c
        public void b() {
            this.a = new Messenger(e0.this.o);
        }

        @Override // e.h.d.e0.c
        public IBinder e(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.a.getBinder();
            }
            return null;
        }

        @Override // e.h.d.e0.c
        public void g(final MediaSessionCompat.Token token) {
            e0.this.o.post(new Runnable() { // from class: e.h.d.h
                @Override // java.lang.Runnable
                public final void run() {
                    e0.g gVar = e0.g.this;
                    MediaSessionCompat.Token token2 = token;
                    for (IBinder iBinder : e0.this.f8100n.keySet()) {
                        e0.b bVar = e0.this.f8100n.get(iBinder);
                        try {
                            e0.j jVar = bVar.a;
                            e0.a aVar = bVar.f8103c;
                            ((e0.k) jVar).b(aVar.f8101b, token2, aVar.a);
                        } catch (RemoteException e2) {
                            s1.l(e2, true);
                            e0.this.f8100n.remove(iBinder);
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static class h<T> {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f8113b;

        /* renamed from: c  reason: collision with root package name */
        public int f8114c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8115d;

        public h(Object obj) {
            this.a = obj;
        }

        public void a() {
            if (this.f8113b) {
                StringBuilder y = e.a.d.a.a.y("detach() called when detach() had already been called for: ");
                y.append(this.a);
                throw new IllegalStateException(y.toString());
            } else if (!this.f8115d) {
                this.f8113b = true;
            } else {
                StringBuilder y2 = e.a.d.a.a.y("detach() called when sendResult() had already been called for: ");
                y2.append(this.a);
                throw new IllegalStateException(y2.toString());
            }
        }

        public void b(T t, int i2) {
            throw null;
        }

        public void c(T t) {
            if (this.f8115d) {
                StringBuilder y = e.a.d.a.a.y("sendResult() called twice for: ");
                y.append(this.a);
                throw new IllegalStateException(y.toString());
            }
            this.f8115d = true;
            b(t, this.f8114c);
        }
    }

    /* loaded from: classes2.dex */
    public class i {
        public i(c0 c0Var) {
        }
    }

    /* loaded from: classes2.dex */
    public interface j {
    }

    /* loaded from: classes2.dex */
    public class k implements j {
        public final Messenger a;

        public k(e0 e0Var, Messenger messenger) {
            this.a = messenger;
        }

        public IBinder a() {
            return this.a.getBinder();
        }

        public void b(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 1);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            c(1, bundle2);
        }

        public final void c(int i2, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i2;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            this.a.send(obtain);
        }
    }

    /* loaded from: classes2.dex */
    public final class l extends Handler {
        public final i a;

        public l(c0 c0Var) {
            this.a = new i(null);
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r12) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e.h.d.e0.l.handleMessage(android.os.Message):void");
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j2) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            return super.sendMessageAtTime(message, j2);
        }
    }

    public e0(String str, boolean z) {
        super(str, z);
        this.f8100n = new HashMap<>();
        this.o = new l(null);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public MediaSessionCompat.Token n() {
        return this.f8099m;
    }

    public abstract a o(String str, int i2, Bundle bundle);

    @Override // e.h.g.o1.c, android.app.Service
    public void onCreate() {
        super.onCreate();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 24) {
            if (!(i2 >= 24)) {
                if (i2 >= 23) {
                    this.p = new e();
                } else if (i2 >= 21) {
                    this.p = new d();
                } else {
                    this.p = new g();
                }
                this.p.b();
            }
        }
        this.p = new f();
        this.p.b();
    }

    public abstract void p(String str, h<List<MediaBrowserCompat.MediaItem>> hVar);

    public void q(String str, h hVar) {
        hVar.f8114c = 1;
        p(str, hVar);
    }

    public void r(h hVar) {
        hVar.c(null);
    }
}
