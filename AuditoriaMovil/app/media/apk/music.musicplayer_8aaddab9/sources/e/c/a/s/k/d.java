package e.c.a.s.k;
/* loaded from: classes.dex */
public abstract class d {

    /* loaded from: classes.dex */
    public static class b extends d {
        public volatile boolean a;

        public b() {
            super(null);
        }

        @Override // e.c.a.s.k.d
        public void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public d(a aVar) {
    }

    public abstract void a();
}
