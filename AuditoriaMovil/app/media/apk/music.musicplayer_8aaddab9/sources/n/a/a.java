package n.a;

import android.os.Build;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class a {
    public static final c[] a;

    /* renamed from: c  reason: collision with root package name */
    public static volatile c[] f9945c;

    /* renamed from: b  reason: collision with root package name */
    public static final List<c> f9944b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final c f9946d = new C0222a();

    /* renamed from: n.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0222a extends c {
        @Override // n.a.a.c
        public void a(String str, Object... objArr) {
            for (c cVar : a.f9945c) {
                cVar.a(str, objArr);
            }
        }

        @Override // n.a.a.c
        public void b(String str, Object... objArr) {
            for (c cVar : a.f9945c) {
                cVar.b(str, objArr);
            }
        }

        @Override // n.a.a.c
        public void c(Throwable th) {
            for (c cVar : a.f9945c) {
                cVar.c(th);
            }
        }

        @Override // n.a.a.c
        public void d(Throwable th, String str, Object... objArr) {
            for (c cVar : a.f9945c) {
                cVar.d(th, str, objArr);
            }
        }

        @Override // n.a.a.c
        public void g(String str, Object... objArr) {
            for (c cVar : a.f9945c) {
                cVar.g(str, objArr);
            }
        }

        @Override // n.a.a.c
        public void i(int i2, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }

        @Override // n.a.a.c
        public void j(int i2, Throwable th, String str, Object... objArr) {
            for (c cVar : a.f9945c) {
                cVar.j(i2, th, str, objArr);
            }
        }

        @Override // n.a.a.c
        public void l(String str, Object... objArr) {
            for (c cVar : a.f9945c) {
                cVar.l(str, objArr);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends c {

        /* renamed from: b  reason: collision with root package name */
        public static final Pattern f9947b = Pattern.compile("(\\$\\d+)+$");

        @Override // n.a.a.c
        public final String f() {
            String str = this.a.get();
            if (str != null) {
                this.a.remove();
            }
            if (str != null) {
                return str;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                String className = stackTrace[5].getClassName();
                Matcher matcher = f9947b.matcher(className);
                if (matcher.find()) {
                    className = matcher.replaceAll("");
                }
                String substring = className.substring(className.lastIndexOf(46) + 1);
                return (substring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? substring : substring.substring(0, 23);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }

        @Override // n.a.a.c
        public void i(int i2, String str, String str2, Throwable th) {
            int min;
            if (str2.length() < 4000) {
                if (i2 == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i2, str, str2);
                    return;
                }
            }
            int i3 = 0;
            int length = str2.length();
            while (i3 < length) {
                int indexOf = str2.indexOf(10, i3);
                if (indexOf == -1) {
                    indexOf = length;
                }
                while (true) {
                    min = Math.min(indexOf, i3 + 4000);
                    String substring = str2.substring(i3, min);
                    if (i2 == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i2, str, substring);
                    }
                    if (min >= indexOf) {
                        break;
                    }
                    i3 = min;
                }
                i3 = min + 1;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c {
        public final ThreadLocal<String> a = new ThreadLocal<>();

        public void a(String str, Object... objArr) {
            k(3, null, str, objArr);
        }

        public void b(String str, Object... objArr) {
            k(6, null, str, objArr);
        }

        public void c(Throwable th) {
            k(6, th, null, new Object[0]);
        }

        public void d(Throwable th, String str, Object... objArr) {
            k(6, th, str, objArr);
        }

        public final String e(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        public String f() {
            String str = this.a.get();
            if (str != null) {
                this.a.remove();
            }
            return str;
        }

        public void g(String str, Object... objArr) {
            k(4, null, str, objArr);
        }

        public boolean h(String str, int i2) {
            return true;
        }

        public abstract void i(int i2, String str, String str2, Throwable th);

        public void j(int i2, Throwable th, String str, Object... objArr) {
            k(i2, th, str, objArr);
        }

        public final void k(int i2, Throwable th, String str, Object... objArr) {
            String f2 = f();
            if (h(f2, i2)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = String.format(str, objArr);
                    }
                    if (th != null) {
                        StringBuilder A = e.a.d.a.a.A(str, "\n");
                        A.append(e(th));
                        str = A.toString();
                    }
                } else if (th == null) {
                    return;
                } else {
                    str = e(th);
                }
                i(i2, f2, str, th);
            }
        }

        public void l(String str, Object... objArr) {
            k(5, null, str, objArr);
        }
    }

    static {
        c[] cVarArr = new c[0];
        a = cVarArr;
        f9945c = cVarArr;
    }

    public static void a(c cVar) {
        if (cVar == f9946d) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        List<c> list = f9944b;
        synchronized (list) {
            list.add(cVar);
            f9945c = (c[]) list.toArray(new c[list.size()]);
        }
    }

    public static c b(String str) {
        for (c cVar : f9945c) {
            cVar.a.set(str);
        }
        return f9946d;
    }
}
