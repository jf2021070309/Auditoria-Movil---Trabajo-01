package e.b.a.a.y;

import android.util.Log;
/* loaded from: classes.dex */
public class c {
    public static e.b.a.a.y.a a = new b();

    /* loaded from: classes.dex */
    public static class a implements e.b.a.a.y.a {
        @Override // e.b.a.a.y.a
        public void a(String str, Object... objArr) {
        }

        @Override // e.b.a.a.y.a
        public void b(String str, Object... objArr) {
        }

        @Override // e.b.a.a.y.a
        public void c(String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr));
        }

        @Override // e.b.a.a.y.a
        public void d(Throwable th, String str, Object... objArr) {
            Log.e("JobManager", String.format(str, objArr), th);
        }

        @Override // e.b.a.a.y.a
        public boolean isDebugEnabled() {
            return false;
        }
    }

    public static boolean a() {
        return a.isDebugEnabled();
    }
}
