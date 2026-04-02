package de.greenrobot.event;
/* loaded from: classes4.dex */
final class h {
    final Object a;
    final f b;
    final int c;
    volatile boolean d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Object obj, f fVar, int i) {
        this.a = obj;
        this.b = fVar;
        this.c = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.a == hVar.a && this.b.equals(hVar.b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.d.hashCode();
    }
}
