package e.d.d.m.j.l;

import e.d.d.m.j.l.a0;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class f extends a0.d.a {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7385b;

    public f(String str, byte[] bArr, a aVar) {
        this.a = str;
        this.f7385b = bArr;
    }

    @Override // e.d.d.m.j.l.a0.d.a
    public byte[] a() {
        return this.f7385b;
    }

    @Override // e.d.d.m.j.l.a0.d.a
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d.a) {
            a0.d.a aVar = (a0.d.a) obj;
            if (this.a.equals(aVar.b())) {
                if (Arrays.equals(this.f7385b, aVar instanceof f ? ((f) aVar).f7385b : aVar.a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7385b);
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("File{filename=");
        y.append(this.a);
        y.append(", contents=");
        y.append(Arrays.toString(this.f7385b));
        y.append("}");
        return y.toString();
    }
}
