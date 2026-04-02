package com.amazon.aps.iva.b8;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.amazon.aps.iva.b8.m0;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.n5.b;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: MediaSessionLegacyStub.java */
/* loaded from: classes.dex */
public final class m0 extends MediaSessionCompat.a {
    public static final int n;
    public final com.amazon.aps.iva.b8.e<b.C0529b> a;
    public final t b;
    public final com.amazon.aps.iva.n5.b c;
    public final d d;
    public final b e;
    public final f f;
    public final MediaSessionCompat g;
    public final String h;
    public final e i;
    public final boolean j;
    public volatile long k;
    public FutureCallback<Bitmap> l;
    public int m;

    /* compiled from: MediaSessionLegacyStub.java */
    /* loaded from: classes.dex */
    public static class b extends Handler {
        public final com.amazon.aps.iva.b8.e<b.C0529b> a;

        public b(Looper looper, com.amazon.aps.iva.b8.e<b.C0529b> eVar) {
            super(looper);
            this.a = eVar;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            q.d dVar = (q.d) message.obj;
            com.amazon.aps.iva.b8.e<b.C0529b> eVar = this.a;
            if (eVar.g(dVar)) {
                try {
                    q.c cVar = dVar.d;
                    com.amazon.aps.iva.cq.b.D(cVar);
                    cVar.d();
                } catch (RemoteException unused) {
                }
                eVar.k(dVar);
            }
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* loaded from: classes.dex */
    public static final class c implements q.c {
        public final b.C0529b a;

        public c(b.C0529b c0529b) {
            this.a = c0529b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == c.class) {
                return com.amazon.aps.iva.t5.g0.a(this.a, ((c) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return com.amazon.aps.iva.o3.b.b(this.a);
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* loaded from: classes.dex */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            KeyEvent keyEvent;
            if (!com.amazon.aps.iva.t5.g0.a(intent.getAction(), "android.intent.action.MEDIA_BUTTON")) {
                return;
            }
            Uri data = intent.getData();
            if (!com.amazon.aps.iva.t5.g0.a(data, data) || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null) {
                return;
            }
            m0.this.g.b.a.a.dispatchMediaButtonEvent(keyEvent);
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* loaded from: classes.dex */
    public class f extends Handler {
        public f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            m0 m0Var = m0.this;
            m0Var.f.removeMessages(1002);
            m0Var.c(1, (b.C0529b) message.obj, new c0(m0Var, 0));
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* loaded from: classes.dex */
    public interface g {
        void b(q.d dVar) throws RemoteException;
    }

    static {
        int i;
        if (com.amazon.aps.iva.t5.g0.a >= 31) {
            i = 33554432;
        } else {
            i = 0;
        }
        n = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
        if (r2 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(com.amazon.aps.iva.b8.t r9, android.net.Uri r10, android.os.Handler r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b8.m0.<init>(com.amazon.aps.iva.b8.t, android.net.Uri, android.os.Handler):void");
    }

    public static void a(m0 m0Var, v1 v1Var) {
        int i;
        m0Var.getClass();
        if (v1Var.V(20)) {
            i = 4;
        } else {
            i = 0;
        }
        if (m0Var.m != i) {
            m0Var.m = i;
            m0Var.g.a.a.setFlags(i | 1 | 2);
        }
    }

    public static com.amazon.aps.iva.q5.b0 b(String str, Uri uri, String str2, Bundle bundle) {
        b0.b bVar = new b0.b();
        if (str == null) {
            str = "";
        }
        bVar.a = str;
        b0.h.a aVar = new b0.h.a();
        aVar.a = uri;
        aVar.b = str2;
        aVar.c = bundle;
        bVar.m = new b0.h(aVar);
        return bVar.a();
    }

    public static ComponentName e(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        }
        return null;
    }

    public final void c(int i, b.C0529b c0529b, g gVar) {
        t tVar = this.b;
        if (tVar.g()) {
            return;
        }
        if (c0529b == null) {
            com.amazon.aps.iva.t5.p.b();
        } else {
            com.amazon.aps.iva.t5.g0.U(tVar.j, new a0(this, i, c0529b, gVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(final int r9, final com.amazon.aps.iva.n5.b.C0529b r10, final com.amazon.aps.iva.b8.m0.g r11, final com.amazon.aps.iva.b8.x1 r12) {
        /*
            r8 = this;
            if (r10 != 0) goto Lf
            if (r12 != 0) goto L8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
        L8:
            java.util.Objects.toString(r12)
            com.amazon.aps.iva.t5.p.b()
            return
        Lf:
            com.amazon.aps.iva.b8.t r0 = r8.b
            android.os.Handler r0 = r0.j
            com.amazon.aps.iva.b8.b0 r7 = new com.amazon.aps.iva.b8.b0
            r1 = r7
            r2 = r8
            r3 = r12
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>()
            com.amazon.aps.iva.t5.g0.U(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b8.m0.d(int, com.amazon.aps.iva.n5.b$b, com.amazon.aps.iva.b8.m0$g, com.amazon.aps.iva.b8.x1):void");
    }

    public final void f(final com.amazon.aps.iva.q5.b0 b0Var, final boolean z) {
        c(31, this.g.b(), new g() { // from class: com.amazon.aps.iva.b8.z
            @Override // com.amazon.aps.iva.b8.m0.g
            public final void b(q.d dVar) {
                m0 m0Var = m0.this;
                Futures.addCallback(m0Var.b.j(ImmutableList.of(b0Var), -1, -9223372036854775807L), new m0.a(dVar, z), MoreExecutors.directExecutor());
            }
        });
    }

    public final q.d g(b.C0529b c0529b) {
        q.d e2 = this.a.e(c0529b);
        if (e2 == null) {
            c cVar = new c(c0529b);
            com.amazon.aps.iva.n5.b bVar = this.c;
            if (c0529b != null) {
                boolean a2 = bVar.a.a(c0529b.a);
                Bundle bundle = Bundle.EMPTY;
                q.d dVar = new q.d(c0529b, 0, a2, cVar);
                t tVar = this.b;
                q.b g2 = tVar.c.g(tVar.i, dVar);
                com.amazon.aps.iva.cq.b.B(g2, "Callback.onConnect must return non-null future");
                if (!g2.a) {
                    return null;
                }
                this.a.a(c0529b, dVar, g2.b, g2.c);
                e2 = dVar;
            } else {
                bVar.getClass();
                throw new IllegalArgumentException("userInfo should not be null");
            }
        }
        b bVar2 = this.e;
        long j = this.k;
        bVar2.removeMessages(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, e2);
        bVar2.sendMessageDelayed(bVar2.obtainMessage(WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, e2), j);
        return e2;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        c(20, this.g.b(), new y(this, mediaDescriptionCompat, -1));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onCommand(String str, final Bundle bundle, final ResultReceiver resultReceiver) {
        com.amazon.aps.iva.cq.b.D(str);
        if (TextUtils.equals("androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN", str) && resultReceiver != null) {
            resultReceiver.send(0, this.b.h.toBundle());
            return;
        }
        final x1 x1Var = new x1(str, Bundle.EMPTY);
        d(0, this.g.b(), new g(x1Var, bundle, resultReceiver) { // from class: com.amazon.aps.iva.b8.d0
            public final /* synthetic */ Bundle c;
            public final /* synthetic */ ResultReceiver d;

            {
                this.c = bundle;
                this.d = resultReceiver;
            }

            @Override // com.amazon.aps.iva.b8.m0.g
            public final void b(q.d dVar) {
                Bundle bundle2 = this.c;
                m0 m0Var = m0.this;
                if (bundle2 == null) {
                    m0Var.getClass();
                    Bundle bundle3 = Bundle.EMPTY;
                }
                m0Var.b.c.getClass();
                ListenableFuture d2 = q.a.d();
                com.amazon.aps.iva.cq.b.B(d2, "Callback.onCustomCommandOnHandler must return non-null future");
                ResultReceiver resultReceiver2 = this.d;
                if (resultReceiver2 != null) {
                    d2.addListener(new com.amazon.aps.iva.o4.b(5, d2, resultReceiver2), MoreExecutors.directExecutor());
                }
            }
        }, x1Var);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onCustomAction(String str, Bundle bundle) {
        x1 x1Var = new x1(str, Bundle.EMPTY);
        d(0, this.g.b(), new com.amazon.aps.iva.b6.i0(this, x1Var, bundle, 2), x1Var);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onFastForward() {
        c(12, this.g.b(), new e0(this, 1));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final boolean onMediaButtonEvent(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return false;
        }
        b.C0529b b2 = this.g.b();
        int keyCode = keyEvent.getKeyCode();
        f fVar = this.f;
        if (keyCode != 79 && keyCode != 85) {
            if (fVar.hasMessages(1002)) {
                fVar.removeMessages(1002);
                c(1, b2, new c0(this, 0));
            }
            return false;
        }
        if (!this.h.equals(b2.a.a) && keyEvent.getRepeatCount() == 0) {
            if (fVar.hasMessages(1002)) {
                fVar.removeMessages(1002);
                onSkipToNext();
            } else {
                fVar.sendMessageDelayed(fVar.obtainMessage(1002, b2), ViewConfiguration.getDoubleTapTimeout());
            }
        } else {
            fVar.removeMessages(1002);
            c(1, b2, new c0(this, 0));
        }
        return true;
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onPause() {
        c(1, this.g.b(), new c0(this, 1));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onPlay() {
        c(1, this.g.b(), new com.amazon.aps.iva.f1.c0(this, 4));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        f(b(str, null, null, bundle), true);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onPlayFromSearch(String str, Bundle bundle) {
        f(b(null, null, str, bundle), true);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        f(b(null, uri, null, bundle), true);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onPrepare() {
        c(2, this.g.b(), new e0(this, 0));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        f(b(str, null, null, bundle), false);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        f(b(null, null, str, bundle), false);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        f(b(null, uri, null, bundle), false);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        c(20, this.g.b(), new com.amazon.aps.iva.b6.f(4, this, mediaDescriptionCompat));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onRemoveQueueItemAt(int i) {
        c(20, this.g.b(), new f0(this, i, 0));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onRewind() {
        c(11, this.g.b(), new g0(this, 1));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSeekTo(final long j) {
        c(5, this.g.b(), new g() { // from class: com.amazon.aps.iva.b8.j0
            @Override // com.amazon.aps.iva.b8.m0.g
            public final void b(q.d dVar) {
                m0.this.b.o.c(j);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSetPlaybackSpeed(final float f2) {
        c(13, this.g.b(), new g() { // from class: com.amazon.aps.iva.b8.k0
            @Override // com.amazon.aps.iva.b8.m0.g
            public final void b(q.d dVar) {
                m0.this.b.o.k(f2);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSetRating(RatingCompat ratingCompat) {
        onSetRating(ratingCompat, null);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSetRepeatMode(int i) {
        c(15, this.g.b(), new f0(this, i, 1));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSetShuffleMode(int i) {
        c(14, this.g.b(), new u(this, i));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSkipToNext() {
        boolean V = this.b.o.V(9);
        MediaSessionCompat mediaSessionCompat = this.g;
        if (V) {
            c(9, mediaSessionCompat.b(), new g0(this, 0));
            return;
        }
        c(8, mediaSessionCompat.b(), new h0(this, 0));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSkipToPrevious() {
        boolean V = this.b.o.V(7);
        MediaSessionCompat mediaSessionCompat = this.g;
        if (V) {
            c(7, mediaSessionCompat.b(), new h0(this, 1));
            return;
        }
        c(6, mediaSessionCompat.b(), new com.amazon.aps.iva.g1.o(this, 7));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSkipToQueueItem(final long j) {
        c(10, this.g.b(), new g() { // from class: com.amazon.aps.iva.b8.i0
            @Override // com.amazon.aps.iva.b8.m0.g
            public final void b(q.d dVar) {
                m0.this.b.o.B0((int) j);
            }
        });
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onStop() {
        c(3, this.g.b(), new e0(this, 2));
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        com.amazon.aps.iva.q5.n0 f2 = q1.f(ratingCompat);
        if (f2 == null) {
            Objects.toString(ratingCompat);
            com.amazon.aps.iva.t5.p.g();
            return;
        }
        d(40010, this.g.b(), new com.amazon.aps.iva.b6.f(5, this, f2), null);
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        if (mediaDescriptionCompat == null) {
            return;
        }
        c(20, this.g.b(), new y(this, mediaDescriptionCompat, i));
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* loaded from: classes.dex */
    public final class d implements q.c {
        public Uri c;
        public com.amazon.aps.iva.q5.d0 a = com.amazon.aps.iva.q5.d0.J;
        public String b = "";
        public long d = -9223372036854775807L;

        /* compiled from: MediaSessionLegacyStub.java */
        /* loaded from: classes.dex */
        public class a implements FutureCallback<Bitmap> {
            public final /* synthetic */ com.amazon.aps.iva.q5.d0 a;
            public final /* synthetic */ String b;
            public final /* synthetic */ Uri c;
            public final /* synthetic */ long d;

            public a(com.amazon.aps.iva.q5.d0 d0Var, String str, Uri uri, long j) {
                this.a = d0Var;
                this.b = str;
                this.c = uri;
                this.d = j;
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public final void onFailure(Throwable th) {
                if (this != m0.this.l) {
                    return;
                }
                th.getMessage();
                com.amazon.aps.iva.t5.p.g();
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public final void onSuccess(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                d dVar = d.this;
                m0 m0Var = m0.this;
                if (this == m0Var.l) {
                    m0Var.g.g(q1.c(this.a, this.b, this.c, this.d, bitmap2));
                    t tVar = m0.this.b;
                    com.amazon.aps.iva.t5.g0.U(tVar.m, new com.amazon.aps.iva.e.h(tVar, 3));
                }
            }
        }

        public d() {
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void A() throws RemoteException {
            t tVar = m0.this.b;
            tVar.f.g.h(tVar.o.X0());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void B() {
            int i;
            int i2;
            u1 u1Var;
            int i3;
            com.amazon.aps.iva.q5.f fVar;
            m0 m0Var = m0.this;
            v1 v1Var = m0Var.b.o;
            if (v1Var.v0().b == 0) {
                u1Var = null;
            } else {
                l0.a j0 = v1Var.j0();
                if (j0.b.a(26, 34)) {
                    if (j0.b.a(25, 33)) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    i = i3;
                } else {
                    i = 0;
                }
                Handler handler = new Handler(v1Var.c0());
                if (v1Var.V(23)) {
                    i2 = v1Var.g0();
                } else {
                    i2 = 0;
                }
                com.amazon.aps.iva.q5.q v0 = v1Var.v0();
                u1Var = new u1(v1Var, i, v0.d, i2, v0.e, handler);
            }
            m0Var.getClass();
            MediaSessionCompat mediaSessionCompat = m0Var.g;
            if (u1Var == null) {
                if (v1Var.V(21)) {
                    fVar = v1Var.u0();
                } else {
                    fVar = com.amazon.aps.iva.q5.f.h;
                }
                mediaSessionCompat.i(q1.h(fVar));
                return;
            }
            mediaSessionCompat.j(u1Var);
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void C(com.amazon.aps.iva.q5.b0 b0Var) throws RemoteException {
            j();
            m0 m0Var = m0.this;
            if (b0Var == null) {
                m0Var.g.a.a.setRatingType(0);
            } else {
                MediaSessionCompat mediaSessionCompat = m0Var.g;
                mediaSessionCompat.a.a.setRatingType(q1.i(b0Var.e.i));
            }
            t tVar = m0Var.b;
            tVar.f.g.h(tVar.o.X0());
        }

        public final void b() throws RemoteException {
            t tVar = m0.this.b;
            tVar.f.g.h(tVar.o.X0());
        }

        public final void c() {
            t tVar = m0.this.b;
            tVar.f.g.h(tVar.o.X0());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void e(com.amazon.aps.iva.q5.f fVar) {
            m0 m0Var = m0.this;
            if (m0Var.b.o.v0().b == 0) {
                m0Var.g.i(q1.h(fVar));
            }
        }

        public final void f() throws RemoteException {
            t tVar = m0.this.b;
            tVar.f.g.h(tVar.o.X0());
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003f A[ORIG_RETURN, RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(int r5) throws android.os.RemoteException {
            /*
                r4 = this;
                com.amazon.aps.iva.b8.m0 r0 = com.amazon.aps.iva.b8.m0.this
                com.amazon.aps.iva.b8.t r0 = r0.b
                com.amazon.aps.iva.b8.m0 r0 = r0.f
                android.support.v4.media.session.MediaSessionCompat r0 = r0.g
                if (r5 == 0) goto L13
                r1 = 1
                if (r5 == r1) goto L14
                r1 = 2
                if (r5 == r1) goto L14
                com.amazon.aps.iva.t5.p.g()
            L13:
                r1 = 0
            L14:
                android.support.v4.media.session.MediaSessionCompat$d r5 = r0.a
                int r0 = r5.j
                if (r0 == r1) goto L3f
                r5.j = r1
                java.lang.Object r0 = r5.c
                monitor-enter(r0)
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r2 = r5.f     // Catch: java.lang.Throwable -> L3c
                int r2 = r2.beginBroadcast()     // Catch: java.lang.Throwable -> L3c
            L25:
                int r2 = r2 + (-1)
                if (r2 < 0) goto L35
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r3 = r5.f     // Catch: java.lang.Throwable -> L3c
                android.os.IInterface r3 = r3.getBroadcastItem(r2)     // Catch: java.lang.Throwable -> L3c
                android.support.v4.media.session.a r3 = (android.support.v4.media.session.a) r3     // Catch: java.lang.Throwable -> L3c
                r3.w(r1)     // Catch: android.os.RemoteException -> L25 java.lang.Throwable -> L3c
                goto L25
            L35:
                android.os.RemoteCallbackList<android.support.v4.media.session.a> r5 = r5.f     // Catch: java.lang.Throwable -> L3c
                r5.finishBroadcast()     // Catch: java.lang.Throwable -> L3c
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                goto L3f
            L3c:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
                throw r5
            L3f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b8.m0.d.g(int):void");
        }

        public final void h(boolean z) throws RemoteException {
            MediaSessionCompat.d dVar = m0.this.b.f.g.a;
            if (dVar.k != z) {
                dVar.k = z ? 1 : 0;
                synchronized (dVar.c) {
                    int beginBroadcast = dVar.f.beginBroadcast();
                    while (true) {
                        beginBroadcast--;
                        if (beginBroadcast >= 0) {
                            try {
                                dVar.f.getBroadcastItem(beginBroadcast).H(z ? 1 : 0);
                            } catch (RemoteException unused) {
                            }
                        } else {
                            dVar.f.finishBroadcast();
                        }
                    }
                }
            }
        }

        public final void i(final com.amazon.aps.iva.q5.r0 r0Var) throws RemoteException {
            boolean r = r0Var.r();
            m0 m0Var = m0.this;
            if (r) {
                m0Var.g.k(null);
                return;
            }
            final ArrayList arrayList = new ArrayList();
            r0.d dVar = new r0.d();
            for (int i = 0; i < r0Var.q(); i++) {
                arrayList.add(r0Var.o(i, dVar).d);
            }
            final ArrayList arrayList2 = new ArrayList();
            final AtomicInteger atomicInteger = new AtomicInteger(0);
            Runnable runnable = new Runnable() { // from class: com.amazon.aps.iva.b8.o0
                @Override // java.lang.Runnable
                public final void run() {
                    Bitmap bitmap;
                    m0.d dVar2 = m0.d.this;
                    dVar2.getClass();
                    int incrementAndGet = atomicInteger.incrementAndGet();
                    List list = arrayList;
                    if (incrementAndGet == list.size()) {
                        ArrayList arrayList3 = new ArrayList();
                        int i2 = 0;
                        while (true) {
                            List list2 = arrayList2;
                            if (i2 >= list2.size()) {
                                break;
                            }
                            ListenableFuture listenableFuture = (ListenableFuture) list2.get(i2);
                            if (listenableFuture != null) {
                                try {
                                    bitmap = (Bitmap) Futures.getDone(listenableFuture);
                                } catch (CancellationException | ExecutionException e) {
                                    com.amazon.aps.iva.t5.p.a("Failed to get bitmap", e);
                                    com.amazon.aps.iva.t5.p.b();
                                }
                                arrayList3.add(new MediaSessionCompat.QueueItem(null, q1.b((com.amazon.aps.iva.q5.b0) list.get(i2), bitmap), q1.e(i2)));
                                i2++;
                            }
                            bitmap = null;
                            arrayList3.add(new MediaSessionCompat.QueueItem(null, q1.b((com.amazon.aps.iva.q5.b0) list.get(i2), bitmap), q1.e(i2)));
                            i2++;
                        }
                        int i3 = com.amazon.aps.iva.t5.g0.a;
                        m0 m0Var2 = m0.this;
                        if (i3 < 21) {
                            ArrayList l = q1.l(arrayList3);
                            int size = l.size();
                            com.amazon.aps.iva.q5.r0 r0Var2 = r0Var;
                            if (size != r0Var2.q()) {
                                l.size();
                                r0Var2.q();
                                com.amazon.aps.iva.t5.p.f();
                            }
                            m0Var2.g.k(l);
                            return;
                        }
                        m0Var2.g.k(arrayList3);
                    }
                }
            };
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                byte[] bArr = ((com.amazon.aps.iva.q5.b0) arrayList.get(i2)).e.k;
                if (bArr == null) {
                    arrayList2.add(null);
                    runnable.run();
                } else {
                    ListenableFuture<Bitmap> c = m0Var.b.k.c(bArr);
                    arrayList2.add(c);
                    final Handler handler = m0Var.b.j;
                    Objects.requireNonNull(handler);
                    c.addListener(runnable, new Executor() { // from class: com.amazon.aps.iva.b8.n
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable2) {
                            ((Handler) handler).post(runnable2);
                        }
                    });
                }
            }
            j();
        }

        public final void j() {
            long j;
            String str;
            Uri uri;
            Bitmap bitmap;
            b0.g gVar;
            m0 m0Var = m0.this;
            v1 v1Var = m0Var.b.o;
            com.amazon.aps.iva.q5.b0 b1 = v1Var.b1();
            com.amazon.aps.iva.q5.d0 d1 = v1Var.d1();
            if (v1Var.V(16)) {
                j = v1Var.getDuration();
            } else {
                j = -9223372036854775807L;
            }
            long j2 = j;
            if (b1 != null) {
                str = b1.b;
            } else {
                str = "";
            }
            String str2 = str;
            if (b1 != null && (gVar = b1.c) != null) {
                uri = gVar.b;
            } else {
                uri = null;
            }
            if (Objects.equals(this.a, d1) && Objects.equals(this.b, str2) && Objects.equals(this.c, uri) && this.d == j2) {
                return;
            }
            this.b = str2;
            this.c = uri;
            this.a = d1;
            this.d = j2;
            t tVar = m0Var.b;
            ListenableFuture<Bitmap> a2 = tVar.k.a(d1);
            if (a2 != null) {
                m0Var.l = null;
                if (a2.isDone()) {
                    try {
                        bitmap = (Bitmap) Futures.getDone(a2);
                    } catch (ExecutionException e) {
                        e.getMessage();
                        com.amazon.aps.iva.t5.p.g();
                    }
                    m0Var.g.g(q1.c(d1, str2, uri, j2, bitmap));
                }
                a aVar = new a(d1, str2, uri, j2);
                m0Var.l = aVar;
                Handler handler = tVar.j;
                Objects.requireNonNull(handler);
                Futures.addCallback(a2, aVar, new com.amazon.aps.iva.s6.n(handler));
            }
            bitmap = null;
            m0Var.g.g(q1.c(d1, str2, uri, j2, bitmap));
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void p(com.amazon.aps.iva.q5.d0 d0Var) throws RemoteException {
            m0 m0Var = m0.this;
            CharSequence queueTitle = m0Var.g.b.a.a.getQueueTitle();
            CharSequence charSequence = d0Var.b;
            if (!TextUtils.equals(queueTitle, charSequence)) {
                m0Var.g.a.a.setQueueTitle(charSequence);
            }
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void q() throws RemoteException {
            t tVar = m0.this.b;
            tVar.f.g.h(tVar.o.X0());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void s(int i, l0.a aVar) {
            m0 m0Var = m0.this;
            v1 v1Var = m0Var.b.o;
            m0.a(m0Var, v1Var);
            m0Var.b.f.g.h(v1Var.X0());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void t() throws RemoteException {
            t tVar = m0.this.b;
            tVar.f.g.h(tVar.o.X0());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void v() throws RemoteException {
            t tVar = m0.this.b;
            tVar.f.g.h(tVar.o.X0());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void w() {
            j();
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
            if (com.amazon.aps.iva.t5.g0.a(r2, r0) == false) goto L37;
         */
        @Override // com.amazon.aps.iva.b8.q.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void x(int r2, com.amazon.aps.iva.b8.v1 r3, com.amazon.aps.iva.b8.v1 r4) throws android.os.RemoteException {
            /*
                r1 = this;
                com.amazon.aps.iva.q5.r0 r2 = r4.c1()
                if (r3 == 0) goto L10
                com.amazon.aps.iva.q5.r0 r0 = r3.c1()
                boolean r0 = com.amazon.aps.iva.t5.g0.a(r0, r2)
                if (r0 != 0) goto L13
            L10:
                r1.i(r2)
            L13:
                r2 = 18
                boolean r0 = r4.V(r2)
                if (r0 == 0) goto L20
                com.amazon.aps.iva.q5.d0 r0 = r4.I0()
                goto L22
            L20:
                com.amazon.aps.iva.q5.d0 r0 = com.amazon.aps.iva.q5.d0.J
            L22:
                if (r3 == 0) goto L37
                boolean r2 = r3.V(r2)
                if (r2 == 0) goto L2f
                com.amazon.aps.iva.q5.d0 r2 = r3.I0()
                goto L31
            L2f:
                com.amazon.aps.iva.q5.d0 r2 = com.amazon.aps.iva.q5.d0.J
            L31:
                boolean r2 = com.amazon.aps.iva.t5.g0.a(r2, r0)
                if (r2 != 0) goto L3a
            L37:
                r1.p(r0)
            L3a:
                com.amazon.aps.iva.q5.d0 r2 = r4.d1()
                if (r3 == 0) goto L4a
                com.amazon.aps.iva.q5.d0 r0 = r3.d1()
                boolean r2 = com.amazon.aps.iva.t5.g0.a(r0, r2)
                if (r2 != 0) goto L4d
            L4a:
                r1.j()
            L4d:
                if (r3 == 0) goto L59
                boolean r2 = r3.Q0()
                boolean r0 = r4.Q0()
                if (r2 == r0) goto L60
            L59:
                boolean r2 = r4.Q0()
                r1.h(r2)
            L60:
                if (r3 == 0) goto L6c
                int r2 = r3.n()
                int r0 = r4.n()
                if (r2 == r0) goto L73
            L6c:
                int r2 = r4.n()
                r1.g(r2)
            L73:
                r4.v0()
                r1.B()
                com.amazon.aps.iva.b8.m0 r2 = com.amazon.aps.iva.b8.m0.this
                com.amazon.aps.iva.b8.m0.a(r2, r4)
                com.amazon.aps.iva.q5.b0 r0 = r4.b1()
                if (r3 == 0) goto L99
                com.amazon.aps.iva.q5.b0 r3 = r3.b1()
                boolean r3 = com.amazon.aps.iva.t5.g0.a(r3, r0)
                if (r3 != 0) goto L8f
                goto L99
            L8f:
                android.support.v4.media.session.PlaybackStateCompat r3 = r4.X0()
                android.support.v4.media.session.MediaSessionCompat r2 = r2.g
                r2.h(r3)
                goto L9c
            L99:
                r1.C(r0)
            L9c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b8.m0.d.x(int, com.amazon.aps.iva.b8.v1, com.amazon.aps.iva.b8.v1):void");
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void z(int i, z1 z1Var, boolean z, boolean z2) throws RemoteException {
            t tVar = m0.this.b;
            tVar.f.g.h(tVar.o.X0());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void d() throws RemoteException {
        }
    }

    /* compiled from: MediaSessionLegacyStub.java */
    /* loaded from: classes.dex */
    public class a implements FutureCallback<q.e> {
        public final /* synthetic */ q.d a;
        public final /* synthetic */ boolean b;

        public a(q.d dVar, boolean z) {
            this.a = dVar;
            this.b = z;
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onSuccess(q.e eVar) {
            final q.e eVar2 = eVar;
            t tVar = m0.this.b;
            Handler handler = tVar.j;
            final boolean z = this.b;
            com.amazon.aps.iva.t5.g0.U(handler, tVar.a(this.a, new Runnable() { // from class: com.amazon.aps.iva.b8.l0
                @Override // java.lang.Runnable
                public final void run() {
                    v1 v1Var = m0.this.b.o;
                    q1.k(v1Var, eVar2);
                    int h = v1Var.h();
                    if (h == 1) {
                        if (v1Var.V(2)) {
                            v1Var.g();
                        }
                    } else if (h == 4 && v1Var.V(4)) {
                        v1Var.w();
                    }
                    if (z && v1Var.V(1)) {
                        v1Var.b();
                    }
                }
            }));
        }

        @Override // com.google.common.util.concurrent.FutureCallback
        public final void onFailure(Throwable th) {
        }
    }

    @Override // android.support.v4.media.session.MediaSessionCompat.a
    public final void onSetCaptioningEnabled(boolean z) {
    }
}
