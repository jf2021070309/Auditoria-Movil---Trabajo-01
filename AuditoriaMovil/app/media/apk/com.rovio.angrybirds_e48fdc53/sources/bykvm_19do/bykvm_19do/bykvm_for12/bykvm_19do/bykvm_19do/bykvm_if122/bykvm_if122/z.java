package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122;

import java.io.IOException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends z {
        final /* synthetic */ u a;
        final /* synthetic */ int b;
        final /* synthetic */ byte[] c;
        final /* synthetic */ int d;

        a(u uVar, int i, byte[] bArr, int i2) {
            this.a = uVar;
            this.b = i;
            this.c = bArr;
            this.d = i2;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.z
        public long a() {
            return this.b;
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.z
        public void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d dVar) throws IOException {
            dVar.write(this.c, this.d, this.b);
        }

        @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.z
        public u b() {
            return this.a;
        }
    }

    public static z a(u uVar, String str) {
        Charset charset = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.i;
        if (uVar != null && (charset = uVar.a()) == null) {
            charset = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.i;
            uVar = u.a(uVar + "; charset=utf-8");
        }
        return a(uVar, str.getBytes(charset));
    }

    public static z a(u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public static z a(u uVar, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(bArr.length, i, i2);
            return new a(uVar, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    public abstract long a() throws IOException;

    public abstract void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d dVar) throws IOException;

    public abstract u b();
}
