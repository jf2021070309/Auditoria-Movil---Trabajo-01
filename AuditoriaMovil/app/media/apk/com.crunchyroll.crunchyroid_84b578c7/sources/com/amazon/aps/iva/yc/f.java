package com.amazon.aps.iva.yc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.amazon.aps.iva.kc.l;
import java.util.ArrayList;
/* compiled from: GifFrameLoader.java */
/* loaded from: classes.dex */
public final class f {
    public final com.amazon.aps.iva.gc.a a;
    public final Handler b;
    public final ArrayList c;
    public final com.amazon.aps.iva.ec.g d;
    public final com.amazon.aps.iva.oc.c e;
    public boolean f;
    public boolean g;
    public com.amazon.aps.iva.ec.f<Bitmap> h;
    public a i;
    public boolean j;
    public a k;
    public Bitmap l;
    public l<Bitmap> m;
    public a n;
    public int o;
    public int p;
    public int q;

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public static class a extends com.amazon.aps.iva.ed.c<Bitmap> {
        public final Handler e;
        public final int f;
        public final long g;
        public Bitmap h;

        public a(Handler handler, int i, long j) {
            this.e = handler;
            this.f = i;
            this.g = j;
        }

        @Override // com.amazon.aps.iva.ed.h
        public final void onLoadCleared(Drawable drawable) {
            this.h = null;
        }

        @Override // com.amazon.aps.iva.ed.h
        public final void onResourceReady(Object obj, com.amazon.aps.iva.fd.d dVar) {
            this.h = (Bitmap) obj;
            Handler handler = this.e;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.g);
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            f fVar = f.this;
            if (i == 1) {
                fVar.b((a) message.obj);
                return true;
            } else if (i == 2) {
                fVar.d.a((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public f(com.bumptech.glide.a aVar, com.amazon.aps.iva.gc.e eVar, int i, int i2, com.amazon.aps.iva.tc.b bVar, Bitmap bitmap) {
        com.amazon.aps.iva.oc.c cVar = aVar.b;
        com.bumptech.glide.c cVar2 = aVar.d;
        Context baseContext = cVar2.getBaseContext();
        com.amazon.aps.iva.ec.g b2 = com.bumptech.glide.a.b(baseContext).b(baseContext);
        Context baseContext2 = cVar2.getBaseContext();
        com.amazon.aps.iva.ec.g b3 = com.bumptech.glide.a.b(baseContext2).b(baseContext2);
        b3.getClass();
        com.amazon.aps.iva.ec.f<Bitmap> y = new com.amazon.aps.iva.ec.f(b3.b, b3, Bitmap.class, b3.c).y(com.amazon.aps.iva.ec.g.l).y(((com.amazon.aps.iva.dd.h) new com.amazon.aps.iva.dd.h().d(com.amazon.aps.iva.nc.l.b).w()).s(true).j(i, i2));
        this.c = new ArrayList();
        this.d = b2;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.e = cVar;
        this.b = handler;
        this.h = y;
        this.a = eVar;
        c(bVar, bitmap);
    }

    public final void a() {
        if (this.f && !this.g) {
            a aVar = this.n;
            if (aVar != null) {
                this.n = null;
                b(aVar);
                return;
            }
            this.g = true;
            com.amazon.aps.iva.gc.a aVar2 = this.a;
            long uptimeMillis = SystemClock.uptimeMillis() + aVar2.d();
            aVar2.b();
            this.k = new a(this.b, aVar2.e(), uptimeMillis);
            com.amazon.aps.iva.ec.f<Bitmap> E = this.h.y((com.amazon.aps.iva.dd.h) new com.amazon.aps.iva.dd.h().r(new com.amazon.aps.iva.gd.b(Double.valueOf(Math.random())))).E(aVar2);
            E.C(this.k, null, E, com.amazon.aps.iva.hd.e.a);
        }
    }

    public final void b(a aVar) {
        this.g = false;
        boolean z = this.j;
        Handler handler = this.b;
        if (z) {
            handler.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f) {
            this.n = aVar;
        } else {
            if (aVar.h != null) {
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    this.e.d(bitmap);
                    this.l = null;
                }
                a aVar2 = this.i;
                this.i = aVar;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) arrayList.get(size)).a();
                }
                if (aVar2 != null) {
                    handler.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public final void c(l<Bitmap> lVar, Bitmap bitmap) {
        defpackage.i.l(lVar);
        this.m = lVar;
        defpackage.i.l(bitmap);
        this.l = bitmap;
        this.h = this.h.y(new com.amazon.aps.iva.dd.h().t(lVar, true));
        this.o = com.amazon.aps.iva.hd.l.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }
}
