package e.c.a.m.u.c;

import android.graphics.Bitmap;
import e.c.a.m.u.c.m;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;
/* loaded from: classes.dex */
public class y implements e.c.a.m.o<InputStream, Bitmap> {
    public final m a;

    /* renamed from: b  reason: collision with root package name */
    public final e.c.a.m.s.c0.b f5901b;

    /* loaded from: classes.dex */
    public static class a implements m.b {
        public final w a;

        /* renamed from: b  reason: collision with root package name */
        public final e.c.a.s.d f5902b;

        public a(w wVar, e.c.a.s.d dVar) {
            this.a = wVar;
            this.f5902b = dVar;
        }

        @Override // e.c.a.m.u.c.m.b
        public void a(e.c.a.m.s.c0.d dVar, Bitmap bitmap) throws IOException {
            IOException iOException = this.f5902b.f6024c;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.d(bitmap);
                }
                throw iOException;
            }
        }

        @Override // e.c.a.m.u.c.m.b
        public void b() {
            w wVar = this.a;
            synchronized (wVar) {
                wVar.f5896c = wVar.a.length;
            }
        }
    }

    public y(m mVar, e.c.a.m.s.c0.b bVar) {
        this.a = mVar;
        this.f5901b = bVar;
    }

    @Override // e.c.a.m.o
    public boolean a(InputStream inputStream, e.c.a.m.m mVar) throws IOException {
        Objects.requireNonNull(this.a);
        return true;
    }

    @Override // e.c.a.m.o
    public e.c.a.m.s.w<Bitmap> b(InputStream inputStream, int i2, int i3, e.c.a.m.m mVar) throws IOException {
        w wVar;
        boolean z;
        e.c.a.s.d poll;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof w) {
            wVar = (w) inputStream2;
            z = false;
        } else {
            wVar = new w(inputStream2, this.f5901b);
            z = true;
        }
        Queue<e.c.a.s.d> queue = e.c.a.s.d.a;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new e.c.a.s.d();
        }
        poll.f6023b = wVar;
        try {
            return this.a.b(new e.c.a.s.h(poll), i2, i3, mVar, new a(wVar, poll));
        } finally {
            poll.release();
            if (z) {
                wVar.release();
            }
        }
    }
}
