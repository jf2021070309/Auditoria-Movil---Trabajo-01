package e.c.a.m.t;

import android.util.Log;
import e.c.a.m.r.d;
import e.c.a.m.t.n;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class d implements n<File, ByteBuffer> {

    /* loaded from: classes.dex */
    public static final class a implements e.c.a.m.r.d<ByteBuffer> {
        public final File a;

        public a(File file) {
            this.a = file;
        }

        @Override // e.c.a.m.r.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // e.c.a.m.r.d
        public void b() {
        }

        @Override // e.c.a.m.r.d
        public void cancel() {
        }

        @Override // e.c.a.m.r.d
        public e.c.a.m.a d() {
            return e.c.a.m.a.LOCAL;
        }

        @Override // e.c.a.m.r.d
        public void e(e.c.a.f fVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(e.c.a.s.a.a(this.a));
            } catch (IOException e2) {
                Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.c(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // e.c.a.m.t.o
        public n<File, ByteBuffer> b(r rVar) {
            return new d();
        }
    }

    @Override // e.c.a.m.t.n
    public /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // e.c.a.m.t.n
    public n.a<ByteBuffer> b(File file, int i2, int i3, e.c.a.m.m mVar) {
        File file2 = file;
        return new n.a<>(new e.c.a.r.b(file2), new a(file2));
    }
}
