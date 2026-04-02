package c.c0;

import android.annotation.SuppressLint;
/* loaded from: classes.dex */
public interface u {
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a = new b.c(null);
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0026b f1606b = new b.C0026b(null);

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* renamed from: c.c0.u$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0026b extends b {
            public C0026b(a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {
            public c() {
            }

            public c(a aVar) {
            }

            public String toString() {
                return "SUCCESS";
            }
        }
    }
}
