package com.amazon.aps.iva.uc;

import android.graphics.Bitmap;
import com.amazon.aps.iva.uc.n;
import com.amazon.aps.iva.uc.t;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes.dex */
public final class z implements com.amazon.aps.iva.kc.j<InputStream, Bitmap> {
    public final n a;
    public final com.amazon.aps.iva.oc.b b;

    /* compiled from: StreamBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static class a implements n.b {
        public final x a;
        public final com.amazon.aps.iva.hd.d b;

        public a(x xVar, com.amazon.aps.iva.hd.d dVar) {
            this.a = xVar;
            this.b = dVar;
        }

        @Override // com.amazon.aps.iva.uc.n.b
        public final void a(Bitmap bitmap, com.amazon.aps.iva.oc.c cVar) throws IOException {
            IOException iOException = this.b.c;
            if (iOException != null) {
                if (bitmap != null) {
                    cVar.d(bitmap);
                }
                throw iOException;
            }
        }

        @Override // com.amazon.aps.iva.uc.n.b
        public final void b() {
            x xVar = this.a;
            synchronized (xVar) {
                xVar.d = xVar.b.length;
            }
        }
    }

    public z(n nVar, com.amazon.aps.iva.oc.b bVar) {
        this.a = nVar;
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final com.amazon.aps.iva.nc.w<Bitmap> a(InputStream inputStream, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        x xVar;
        boolean z;
        com.amazon.aps.iva.hd.d dVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof x) {
            z = false;
            xVar = (x) inputStream2;
        } else {
            xVar = new x(inputStream2, this.b);
            z = true;
        }
        ArrayDeque arrayDeque = com.amazon.aps.iva.hd.d.d;
        synchronized (arrayDeque) {
            dVar = (com.amazon.aps.iva.hd.d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new com.amazon.aps.iva.hd.d();
        }
        com.amazon.aps.iva.hd.d dVar2 = dVar;
        dVar2.b = xVar;
        com.amazon.aps.iva.hd.j jVar = new com.amazon.aps.iva.hd.j(dVar2);
        a aVar = new a(xVar, dVar2);
        try {
            n nVar = this.a;
            e a2 = nVar.a(new t.b(nVar.c, jVar, nVar.d), i, i2, hVar, aVar);
            dVar2.c = null;
            dVar2.b = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z) {
                xVar.release();
            }
            return a2;
        } catch (Throwable th) {
            dVar2.c = null;
            dVar2.b = null;
            ArrayDeque arrayDeque2 = com.amazon.aps.iva.hd.d.d;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z) {
                    xVar.release();
                }
                throw th;
            }
        }
    }

    @Override // com.amazon.aps.iva.kc.j
    public final boolean b(InputStream inputStream, com.amazon.aps.iva.kc.h hVar) throws IOException {
        this.a.getClass();
        return true;
    }
}
