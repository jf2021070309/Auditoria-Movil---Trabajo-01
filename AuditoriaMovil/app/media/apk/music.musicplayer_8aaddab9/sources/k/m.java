package k;

import java.io.IOException;
import java.util.zip.Inflater;
/* loaded from: classes2.dex */
public final class m implements x {
    public final g a;

    /* renamed from: b  reason: collision with root package name */
    public final Inflater f9630b;

    /* renamed from: c  reason: collision with root package name */
    public int f9631c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9632d;

    public m(g gVar, Inflater inflater) {
        h.o.c.j.e(gVar, "source");
        h.o.c.j.e(inflater, "inflater");
        this.a = gVar;
        this.f9630b = inflater;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c A[SYNTHETIC] */
    @Override // k.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long S(k.d r10, long r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.m.S(k.d, long):long");
    }

    @Override // k.x
    public y c() {
        return this.a.c();
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f9632d) {
            return;
        }
        this.f9630b.end();
        this.f9632d = true;
        this.a.close();
    }
}
