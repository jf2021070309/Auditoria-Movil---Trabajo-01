package c.c0;

import android.util.Log;
/* loaded from: classes.dex */
public abstract class r {
    public static r a;

    /* loaded from: classes.dex */
    public static class a extends r {

        /* renamed from: b  reason: collision with root package name */
        public int f1605b;

        public a(int i2) {
            this.f1605b = i2;
        }

        @Override // c.c0.r
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f1605b > 3 || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // c.c0.r
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f1605b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // c.c0.r
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f1605b > 4 || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // c.c0.r
        public void f(String str, String str2, Throwable... thArr) {
            if (this.f1605b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public static synchronized r c() {
        r rVar;
        synchronized (r.class) {
            if (a == null) {
                a = new a(3);
            }
            rVar = a;
        }
        return rVar;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder v = e.a.d.a.a.v(23, "WM-");
        if (length >= 20) {
            v.append(str.substring(0, 20));
        } else {
            v.append(str);
        }
        return v.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void f(String str, String str2, Throwable... thArr);
}
