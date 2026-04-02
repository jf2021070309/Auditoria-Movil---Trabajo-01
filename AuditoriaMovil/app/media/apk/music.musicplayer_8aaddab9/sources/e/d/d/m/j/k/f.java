package e.d.d.m.j.k;

import e.d.d.m.j.k.e;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public class f implements e.d {
    public final /* synthetic */ byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int[] f7250b;

    public f(g gVar, byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.f7250b = iArr;
    }

    @Override // e.d.d.m.j.k.e.d
    public void a(InputStream inputStream, int i2) throws IOException {
        try {
            inputStream.read(this.a, this.f7250b[0], i2);
            int[] iArr = this.f7250b;
            iArr[0] = iArr[0] + i2;
        } finally {
            inputStream.close();
        }
    }
}
