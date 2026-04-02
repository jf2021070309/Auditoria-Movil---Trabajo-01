package e.e.a.c.c.b;

import e.e.a.c.b.l;
import java.util.Objects;
/* loaded from: classes.dex */
public final class f implements e.e.a.c.c.a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final l f7966b;

    public f(String str, e.e.a.c.a aVar) {
        this.a = str;
        this.f7966b = aVar.f7945l;
    }

    @Override // e.e.a.c.c.a
    public byte[] a() {
        l lVar = this.f7966b;
        String str = this.a;
        Objects.requireNonNull(lVar);
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[bytes.length + 1];
        bArr[0] = -2;
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        return bArr;
    }
}
