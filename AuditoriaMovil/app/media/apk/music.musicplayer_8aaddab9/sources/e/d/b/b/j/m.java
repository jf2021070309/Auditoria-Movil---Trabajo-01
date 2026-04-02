package e.d.b.b.j;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class m {
    public final e.d.b.b.b a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f6280b;

    public m(e.d.b.b.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.a = bVar;
        this.f6280b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.a.equals(mVar.a)) {
                return Arrays.equals(this.f6280b, mVar.f6280b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6280b);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("EncodedPayload{encoding=");
        y.append(this.a);
        y.append(", bytes=[...]}");
        return y.toString();
    }
}
