package i.a;
/* loaded from: classes2.dex */
public final class s0 implements b1 {
    public final boolean a;

    public s0(boolean z) {
        this.a = z;
    }

    @Override // i.a.b1
    public boolean a() {
        return this.a;
    }

    @Override // i.a.b1
    public q1 c() {
        return null;
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("Empty{");
        y.append(this.a ? "Active" : "New");
        y.append('}');
        return y.toString();
    }
}
