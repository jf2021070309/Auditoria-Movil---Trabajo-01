package e.d.d.y.r;
/* loaded from: classes2.dex */
public class p implements e.d.d.y.p {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7802b;

    public p(String str, int i2) {
        this.a = str;
        this.f7802b = i2;
    }

    @Override // e.d.d.y.p
    public int a() {
        return this.f7802b;
    }

    @Override // e.d.d.y.p
    public String b() {
        if (this.f7802b == 0) {
            return "";
        }
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }
}
