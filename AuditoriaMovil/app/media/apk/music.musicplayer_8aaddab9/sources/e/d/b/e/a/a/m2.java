package e.d.b.e.a.a;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class m2 {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final long f6859b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6860c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6861d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f6862e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f6863f;

    public m2() {
    }

    public m2(String str, long j2, int i2, boolean z, boolean z2, byte[] bArr) {
        this.a = str;
        this.f6859b = j2;
        this.f6860c = i2;
        this.f6861d = z;
        this.f6862e = z2;
        this.f6863f = bArr;
    }

    public final boolean a() {
        String str = this.a;
        if (str == null) {
            return false;
        }
        return str.endsWith("/");
    }

    public final boolean b() {
        return this.f6860c == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            String str = this.a;
            if (str != null ? str.equals(m2Var.a) : m2Var.a == null) {
                if (this.f6859b == m2Var.f6859b && this.f6860c == m2Var.f6860c && this.f6861d == m2Var.f6861d && this.f6862e == m2Var.f6862e && Arrays.equals(this.f6863f, m2Var.f6863f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f6859b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f6860c) * 1000003) ^ (true != this.f6861d ? 1237 : 1231)) * 1000003) ^ (true == this.f6862e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f6863f);
    }

    public String toString() {
        String str = this.a;
        long j2 = this.f6859b;
        int i2 = this.f6860c;
        boolean z = this.f6861d;
        boolean z2 = this.f6862e;
        String arrays = Arrays.toString(this.f6863f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        e.a.d.a.a.L(sb, "ZipEntry{name=", str, ", size=");
        sb.append(j2);
        sb.append(", compressionMethod=");
        sb.append(i2);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        return e.a.d.a.a.s(sb, ", headerBytes=", arrays, "}");
    }
}
