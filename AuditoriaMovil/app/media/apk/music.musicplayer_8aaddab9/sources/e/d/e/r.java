package e.d.e;
/* loaded from: classes2.dex */
public final class r extends o {
    public final e.d.e.c0.s<String, o> a = new e.d.e.c0.s<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof r) && ((r) obj).a.equals(this.a));
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
