package e.c.a.m.u.d;

import e.c.a.m.r.e;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class a implements e<ByteBuffer> {
    public final ByteBuffer a;

    /* renamed from: e.c.a.m.u.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0127a implements e.a<ByteBuffer> {
        @Override // e.c.a.m.r.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // e.c.a.m.r.e.a
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // e.c.a.m.r.e
    public ByteBuffer a() throws IOException {
        this.a.position(0);
        return this.a;
    }

    @Override // e.c.a.m.r.e
    public void b() {
    }
}
