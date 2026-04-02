package e.c.a.m.u.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import e.c.a.m.q;
import e.c.a.m.s.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class g {
    public final e.c.a.l.a a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5923b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f5924c;

    /* renamed from: d  reason: collision with root package name */
    public final e.c.a.i f5925d;

    /* renamed from: e  reason: collision with root package name */
    public final e.c.a.m.s.c0.d f5926e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5927f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5928g;

    /* renamed from: h  reason: collision with root package name */
    public e.c.a.h<Bitmap> f5929h;

    /* renamed from: i  reason: collision with root package name */
    public a f5930i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5931j;

    /* renamed from: k  reason: collision with root package name */
    public a f5932k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f5933l;

    /* renamed from: m  reason: collision with root package name */
    public q<Bitmap> f5934m;

    /* renamed from: n  reason: collision with root package name */
    public a f5935n;
    public int o;
    public int p;
    public int q;

    /* loaded from: classes.dex */
    public static class a extends e.c.a.q.h.c<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        public final Handler f5936d;

        /* renamed from: e  reason: collision with root package name */
        public final int f5937e;

        /* renamed from: f  reason: collision with root package name */
        public final long f5938f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap f5939g;

        public a(Handler handler, int i2, long j2) {
            this.f5936d = handler;
            this.f5937e = i2;
            this.f5938f = j2;
        }

        @Override // e.c.a.q.h.h
        public void b(Object obj, e.c.a.q.i.b bVar) {
            this.f5939g = (Bitmap) obj;
            this.f5936d.sendMessageAtTime(this.f5936d.obtainMessage(1, this), this.f5938f);
        }

        @Override // e.c.a.q.h.h
        public void g(Drawable drawable) {
            this.f5939g = null;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                g.this.b((a) message.obj);
                return true;
            } else if (i2 == 2) {
                g.this.f5925d.i((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public g(e.c.a.b bVar, e.c.a.l.a aVar, int i2, int i3, q<Bitmap> qVar, Bitmap bitmap) {
        e.c.a.m.s.c0.d dVar = bVar.f5437c;
        Context baseContext = bVar.f5439e.getBaseContext();
        Objects.requireNonNull(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        e.c.a.i d2 = e.c.a.b.b(baseContext).f5442h.d(baseContext);
        Context baseContext2 = bVar.f5439e.getBaseContext();
        Objects.requireNonNull(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        e.c.a.i d3 = e.c.a.b.b(baseContext2).f5442h.d(baseContext2);
        Objects.requireNonNull(d3);
        e.c.a.h<Bitmap> a2 = new e.c.a.h(d3.f5478b, d3, Bitmap.class, d3.f5479c).a(e.c.a.i.a).a(e.c.a.q.e.t(k.f5698b).s(true).p(true).k(i2, i3));
        this.f5924c = new ArrayList();
        this.f5925d = d2;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f5926e = dVar;
        this.f5923b = handler;
        this.f5929h = a2;
        this.a = aVar;
        c(qVar, bitmap);
    }

    public final void a() {
        if (!this.f5927f || this.f5928g) {
            return;
        }
        a aVar = this.f5935n;
        if (aVar != null) {
            this.f5935n = null;
            b(aVar);
            return;
        }
        this.f5928g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.a.d();
        this.a.b();
        this.f5932k = new a(this.f5923b, this.a.f(), uptimeMillis);
        e.c.a.h<Bitmap> a2 = this.f5929h.a(new e.c.a.q.e().o(new e.c.a.r.b(Double.valueOf(Math.random()))));
        a2.F = this.a;
        a2.I = true;
        a2.w(this.f5932k, null, a2, e.c.a.s.e.a);
    }

    public void b(a aVar) {
        this.f5928g = false;
        if (this.f5931j) {
            this.f5923b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f5927f) {
            this.f5935n = aVar;
        } else {
            if (aVar.f5939g != null) {
                Bitmap bitmap = this.f5933l;
                if (bitmap != null) {
                    this.f5926e.d(bitmap);
                    this.f5933l = null;
                }
                a aVar2 = this.f5930i;
                this.f5930i = aVar;
                int size = this.f5924c.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f5924c.get(size).a();
                }
                if (aVar2 != null) {
                    this.f5923b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public void c(q<Bitmap> qVar, Bitmap bitmap) {
        Objects.requireNonNull(qVar, "Argument must not be null");
        this.f5934m = qVar;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f5933l = bitmap;
        this.f5929h = this.f5929h.a(new e.c.a.q.e().q(qVar, true));
        this.o = e.c.a.s.j.d(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
