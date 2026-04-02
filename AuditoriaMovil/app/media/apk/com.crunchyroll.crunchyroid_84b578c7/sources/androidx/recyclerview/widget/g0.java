package androidx.recyclerview.widget;
/* compiled from: StableIdStorage.java */
/* loaded from: classes.dex */
public interface g0 {

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes.dex */
    public static class a implements g0 {
        public long a = 0;

        /* compiled from: StableIdStorage.java */
        /* renamed from: androidx.recyclerview.widget.g0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0057a implements d {
            public final com.amazon.aps.iva.x.f<Long> a = new com.amazon.aps.iva.x.f<>();

            public C0057a() {
            }

            @Override // androidx.recyclerview.widget.g0.d
            public final long a(long j) {
                com.amazon.aps.iva.x.f<Long> fVar = this.a;
                Long l = (Long) fVar.d(j, null);
                if (l == null) {
                    a aVar = a.this;
                    long j2 = aVar.a;
                    aVar.a = 1 + j2;
                    l = Long.valueOf(j2);
                    fVar.f(j, l);
                }
                return l.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.g0
        public final d a() {
            return new C0057a();
        }
    }

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes.dex */
    public static class b implements g0 {
        public final a a = new a();

        /* compiled from: StableIdStorage.java */
        /* loaded from: classes.dex */
        public class a implements d {
            @Override // androidx.recyclerview.widget.g0.d
            public final long a(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.g0
        public final d a() {
            return this.a;
        }
    }

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes.dex */
    public interface d {
        long a(long j);
    }

    d a();

    /* compiled from: StableIdStorage.java */
    /* loaded from: classes.dex */
    public static class c implements g0 {
        public final a a = new a();

        @Override // androidx.recyclerview.widget.g0
        public final d a() {
            return this.a;
        }

        /* compiled from: StableIdStorage.java */
        /* loaded from: classes.dex */
        public class a implements d {
            @Override // androidx.recyclerview.widget.g0.d
            public final long a(long j) {
                return j;
            }
        }
    }
}
