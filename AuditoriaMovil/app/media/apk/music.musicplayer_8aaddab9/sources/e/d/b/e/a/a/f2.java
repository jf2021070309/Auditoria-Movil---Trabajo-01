package e.d.b.e.a.a;
/* loaded from: classes2.dex */
public final class f2 {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6786b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6787c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6788d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6789e;

    public f2() {
    }

    public f2(int i2, String str, long j2, long j3, int i3) {
        this.a = i2;
        this.f6786b = str;
        this.f6787c = j2;
        this.f6788d = j3;
        this.f6789e = i3;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f2) {
            f2 f2Var = (f2) obj;
            if (this.a == f2Var.a && ((str = this.f6786b) != null ? str.equals(f2Var.f6786b) : f2Var.f6786b == null) && this.f6787c == f2Var.f6787c && this.f6788d == f2Var.f6788d && this.f6789e == f2Var.f6789e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = (this.a ^ 1000003) * 1000003;
        String str = this.f6786b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f6787c;
        long j3 = this.f6788d;
        return ((((((i2 ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f6789e;
    }

    public String toString() {
        int i2 = this.a;
        String str = this.f6786b;
        long j2 = this.f6787c;
        long j3 = this.f6788d;
        int i3 = this.f6789e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i2);
        sb.append(", filePath=");
        sb.append(str);
        e.a.d.a.a.K(sb, ", fileOffset=", j2, ", remainingBytes=");
        sb.append(j3);
        sb.append(", previousChunk=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
