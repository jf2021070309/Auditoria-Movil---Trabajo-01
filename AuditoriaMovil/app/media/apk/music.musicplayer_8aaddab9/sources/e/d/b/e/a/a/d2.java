package e.d.b.e.a.a;

import ch.qos.logback.core.rolling.helper.Compressor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
/* loaded from: classes2.dex */
public final class d2 {
    public static final e.d.b.e.a.c.e a = new e.d.b.e.a.c.e("PatchSliceTaskHandler");

    /* renamed from: b  reason: collision with root package name */
    public final z f6758b;

    /* renamed from: c  reason: collision with root package name */
    public final e.d.b.e.a.c.b0<e3> f6759c;

    /* renamed from: d  reason: collision with root package name */
    public final e.d.b.e.a.b.c f6760d;

    public d2(z zVar, e.d.b.e.a.c.b0<e3> b0Var, e.d.b.e.a.b.c cVar) {
        this.f6758b = zVar;
        this.f6759c = b0Var;
        this.f6760d = cVar;
    }

    public final void a(c2 c2Var) {
        File a2 = this.f6758b.a(c2Var.f6822b, c2Var.f6742c, c2Var.f6743d);
        z zVar = this.f6758b;
        String str = c2Var.f6822b;
        int i2 = c2Var.f6742c;
        long j2 = c2Var.f6743d;
        String str2 = c2Var.f6747h;
        Objects.requireNonNull(zVar);
        File file = new File(new File(zVar.a(str, i2, j2), "_metadata"), str2);
        try {
            InputStream inputStream = c2Var.f6749j;
            if (c2Var.f6746g == 2) {
                inputStream = new GZIPInputStream(inputStream, Compressor.BUFFER_SIZE);
            }
            c0 c0Var = new c0(a2, file);
            if (this.f6760d.a()) {
                File b2 = this.f6758b.b(c2Var.f6822b, c2Var.f6744e, c2Var.f6745f, c2Var.f6747h);
                if (!b2.exists()) {
                    b2.mkdirs();
                }
                g2 g2Var = new g2(this.f6758b, c2Var.f6822b, c2Var.f6744e, c2Var.f6745f, c2Var.f6747h);
                e.d.b.d.a.g(c0Var, inputStream, new s0(b2, g2Var), c2Var.f6748i);
                g2Var.j(0);
            } else {
                File file2 = new File(this.f6758b.n(c2Var.f6822b, c2Var.f6744e, c2Var.f6745f, c2Var.f6747h), "slice.zip.tmp");
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                e.d.b.d.a.g(c0Var, inputStream, new FileOutputStream(file2), c2Var.f6748i);
                if (!file2.renameTo(this.f6758b.l(c2Var.f6822b, c2Var.f6744e, c2Var.f6745f, c2Var.f6747h))) {
                    throw new p0(String.format("Error moving patch for slice %s of pack %s.", c2Var.f6747h, c2Var.f6822b), c2Var.a);
                }
            }
            inputStream.close();
            if (this.f6760d.a()) {
                a.a(4, "Patching and extraction finished for slice %s of pack %s.", new Object[]{c2Var.f6747h, c2Var.f6822b});
            } else {
                a.a(4, "Patching finished for slice %s of pack %s.", new Object[]{c2Var.f6747h, c2Var.f6822b});
            }
            this.f6759c.a().e(c2Var.a, c2Var.f6822b, c2Var.f6747h, 0);
            try {
                c2Var.f6749j.close();
            } catch (IOException unused) {
                a.a(5, "Could not close file for slice %s of pack %s.", new Object[]{c2Var.f6747h, c2Var.f6822b});
            }
        } catch (IOException e2) {
            a.a(6, "IOException during patching %s.", new Object[]{e2.getMessage()});
            throw new p0(String.format("Error patching slice %s of pack %s.", c2Var.f6747h, c2Var.f6822b), e2, c2Var.a);
        }
    }
}
