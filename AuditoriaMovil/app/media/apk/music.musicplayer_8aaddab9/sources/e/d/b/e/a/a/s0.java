package e.d.b.e.a.a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class s0 extends OutputStream {
    public final s1 a = new s1();

    /* renamed from: b  reason: collision with root package name */
    public final File f6927b;

    /* renamed from: c  reason: collision with root package name */
    public final g2 f6928c;

    /* renamed from: d  reason: collision with root package name */
    public long f6929d;

    /* renamed from: e  reason: collision with root package name */
    public long f6930e;

    /* renamed from: f  reason: collision with root package name */
    public FileOutputStream f6931f;

    /* renamed from: g  reason: collision with root package name */
    public m2 f6932g;

    public s0(File file, g2 g2Var) {
        this.f6927b = file;
        this.f6928c = g2Var;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        write(new byte[]{(byte) i2});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        int min;
        while (i3 > 0) {
            if (this.f6929d == 0 && this.f6930e == 0) {
                int b2 = this.a.b(bArr, i2, i3);
                if (b2 == -1) {
                    return;
                }
                i2 += b2;
                i3 -= b2;
                m2 c2 = this.a.c();
                this.f6932g = c2;
                if (c2.f6862e) {
                    this.f6929d = 0L;
                    g2 g2Var = this.f6928c;
                    byte[] bArr2 = c2.f6863f;
                    g2Var.k(bArr2, bArr2.length);
                    this.f6930e = this.f6932g.f6863f.length;
                } else if (!c2.b() || this.f6932g.a()) {
                    byte[] bArr3 = this.f6932g.f6863f;
                    this.f6928c.k(bArr3, bArr3.length);
                    this.f6929d = this.f6932g.f6859b;
                } else {
                    this.f6928c.f(this.f6932g.f6863f);
                    File file = new File(this.f6927b, this.f6932g.a);
                    file.getParentFile().mkdirs();
                    this.f6929d = this.f6932g.f6859b;
                    this.f6931f = new FileOutputStream(file);
                }
            }
            if (!this.f6932g.a()) {
                m2 m2Var = this.f6932g;
                if (m2Var.f6862e) {
                    this.f6928c.c(this.f6930e, bArr, i2, i3);
                    this.f6930e += i3;
                    min = i3;
                } else if (m2Var.b()) {
                    min = (int) Math.min(i3, this.f6929d);
                    this.f6931f.write(bArr, i2, min);
                    long j2 = this.f6929d - min;
                    this.f6929d = j2;
                    if (j2 == 0) {
                        this.f6931f.close();
                    }
                } else {
                    min = (int) Math.min(i3, this.f6929d);
                    m2 m2Var2 = this.f6932g;
                    this.f6928c.c((m2Var2.f6863f.length + m2Var2.f6859b) - this.f6929d, bArr, i2, min);
                    this.f6929d -= min;
                }
                i2 += min;
                i3 -= min;
            }
        }
    }
}
