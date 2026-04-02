package e.c.a.m.t;

import e.c.a.m.r.d;
import e.c.a.m.t.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class b<Data> implements n<byte[], Data> {
    public final InterfaceC0122b<Data> a;

    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: e.c.a.m.t.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0121a implements InterfaceC0122b<ByteBuffer> {
            public C0121a(a aVar) {
            }

            @Override // e.c.a.m.t.b.InterfaceC0122b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // e.c.a.m.t.b.InterfaceC0122b
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // e.c.a.m.t.o
        public n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0121a(this));
        }
    }

    /* renamed from: e.c.a.m.t.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0122b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* loaded from: classes.dex */
    public static class c<Data> implements e.c.a.m.r.d<Data> {
        public final byte[] a;

        /* renamed from: b  reason: collision with root package name */
        public final InterfaceC0122b<Data> f5784b;

        public c(byte[] bArr, InterfaceC0122b<Data> interfaceC0122b) {
            this.a = bArr;
            this.f5784b = interfaceC0122b;
        }

        @Override // e.c.a.m.r.d
        public Class<Data> a() {
            return this.f5784b.a();
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
        public void e(e.c.a.f fVar, d.a<? super Data> aVar) {
            aVar.f((Data) this.f5784b.b(this.a));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* loaded from: classes.dex */
        public class a implements InterfaceC0122b<InputStream> {
            public a(d dVar) {
            }

            @Override // e.c.a.m.t.b.InterfaceC0122b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // e.c.a.m.t.b.InterfaceC0122b
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // e.c.a.m.t.o
        public n<byte[], InputStream> b(r rVar) {
            return new b(new a(this));
        }
    }

    public b(InterfaceC0122b<Data> interfaceC0122b) {
        this.a = interfaceC0122b;
    }

    @Override // e.c.a.m.t.n
    public /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // e.c.a.m.t.n
    public n.a b(byte[] bArr, int i2, int i3, e.c.a.m.m mVar) {
        byte[] bArr2 = bArr;
        return new n.a(new e.c.a.r.b(bArr2), new c(bArr2, this.a));
    }
}
