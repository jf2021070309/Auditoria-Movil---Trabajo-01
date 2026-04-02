package com.amazon.aps.iva.s1;
/* compiled from: ContentScale.kt */
/* loaded from: classes.dex */
public interface f {

    /* compiled from: ContentScale.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final C0691a a = new C0691a();
        public static final d b = new d();
        public static final c c = new c();
        public static final e d = new e();
        public static final h e = new h();
        public static final b f = new b();

        /* compiled from: ContentScale.kt */
        /* renamed from: com.amazon.aps.iva.s1.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0691a implements f {
            @Override // com.amazon.aps.iva.s1.f
            public final long a(long j, long j2) {
                float max = Math.max(com.amazon.aps.iva.e1.g.d(j2) / com.amazon.aps.iva.e1.g.d(j), com.amazon.aps.iva.e1.g.b(j2) / com.amazon.aps.iva.e1.g.b(j));
                return com.amazon.aps.iva.ab.r.c(max, max);
            }
        }

        /* compiled from: ContentScale.kt */
        /* loaded from: classes.dex */
        public static final class b implements f {
            @Override // com.amazon.aps.iva.s1.f
            public final long a(long j, long j2) {
                return com.amazon.aps.iva.ab.r.c(com.amazon.aps.iva.e1.g.d(j2) / com.amazon.aps.iva.e1.g.d(j), com.amazon.aps.iva.e1.g.b(j2) / com.amazon.aps.iva.e1.g.b(j));
            }
        }

        /* compiled from: ContentScale.kt */
        /* loaded from: classes.dex */
        public static final class c implements f {
            @Override // com.amazon.aps.iva.s1.f
            public final long a(long j, long j2) {
                float d = com.amazon.aps.iva.e1.g.d(j2) / com.amazon.aps.iva.e1.g.d(j);
                return com.amazon.aps.iva.ab.r.c(d, d);
            }
        }

        /* compiled from: ContentScale.kt */
        /* loaded from: classes.dex */
        public static final class d implements f {
            @Override // com.amazon.aps.iva.s1.f
            public final long a(long j, long j2) {
                float min = Math.min(com.amazon.aps.iva.e1.g.d(j2) / com.amazon.aps.iva.e1.g.d(j), com.amazon.aps.iva.e1.g.b(j2) / com.amazon.aps.iva.e1.g.b(j));
                return com.amazon.aps.iva.ab.r.c(min, min);
            }
        }

        /* compiled from: ContentScale.kt */
        /* loaded from: classes.dex */
        public static final class e implements f {
            @Override // com.amazon.aps.iva.s1.f
            public final long a(long j, long j2) {
                if (com.amazon.aps.iva.e1.g.d(j) <= com.amazon.aps.iva.e1.g.d(j2) && com.amazon.aps.iva.e1.g.b(j) <= com.amazon.aps.iva.e1.g.b(j2)) {
                    return com.amazon.aps.iva.ab.r.c(1.0f, 1.0f);
                }
                float min = Math.min(com.amazon.aps.iva.e1.g.d(j2) / com.amazon.aps.iva.e1.g.d(j), com.amazon.aps.iva.e1.g.b(j2) / com.amazon.aps.iva.e1.g.b(j));
                return com.amazon.aps.iva.ab.r.c(min, min);
            }
        }
    }

    long a(long j, long j2);
}
