package com.amazon.aps.iva.mf0;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: Timber.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final C0515a a = new C0515a();
    public static final ArrayList<b> b = new ArrayList<>();
    public static volatile b[] c = new b[0];

    /* compiled from: Timber.kt */
    /* renamed from: com.amazon.aps.iva.mf0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0515a extends b {
        @Override // com.amazon.aps.iva.mf0.a.b
        public final void a(String str, Object... objArr) {
            j.f(objArr, "args");
            for (b bVar : a.c) {
                bVar.a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // com.amazon.aps.iva.mf0.a.b
        public final void b(Throwable th) {
            for (b bVar : a.c) {
                bVar.b(th);
            }
        }

        @Override // com.amazon.aps.iva.mf0.a.b
        public final void c(String str, Object... objArr) {
            j.f(objArr, "args");
            for (b bVar : a.c) {
                bVar.c(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // com.amazon.aps.iva.mf0.a.b
        public final void d(Throwable th) {
            for (b bVar : a.c) {
                bVar.d(th);
            }
        }

        @Override // com.amazon.aps.iva.mf0.a.b
        public final void f(String str, Object... objArr) {
            j.f(objArr, "args");
            for (b bVar : a.c) {
                bVar.f(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // com.amazon.aps.iva.mf0.a.b
        public final void h(String str, int i, String str2, Throwable th) {
            j.f(str2, "message");
            throw new AssertionError();
        }

        @Override // com.amazon.aps.iva.mf0.a.b
        public final void j(String str, Object... objArr) {
            j.f(objArr, "args");
            for (b bVar : a.c) {
                bVar.j(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // com.amazon.aps.iva.mf0.a.b
        public final void k(Exception exc, String str, Object... objArr) {
            j.f(objArr, "args");
            for (b bVar : a.c) {
                bVar.k(exc, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // com.amazon.aps.iva.mf0.a.b
        public final void l(String str, Object... objArr) {
            j.f(objArr, "args");
            for (b bVar : a.c) {
                bVar.l(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // com.amazon.aps.iva.mf0.a.b
        public final void m(Throwable th) {
            for (b bVar : a.c) {
                bVar.m(th);
            }
        }

        public final void n(b bVar) {
            boolean z;
            j.f(bVar, "tree");
            if (bVar != this) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ArrayList<b> arrayList = a.b;
                synchronized (arrayList) {
                    arrayList.add(bVar);
                    Object[] array = arrayList.toArray(new b[0]);
                    if (array != null) {
                        a.c = (b[]) array;
                        q qVar = q.a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
        }

        public final void o(String str) {
            b[] bVarArr = a.c;
            int length = bVarArr.length;
            int i = 0;
            while (i < length) {
                b bVar = bVarArr[i];
                i++;
                bVar.a.set(str);
            }
        }
    }

    /* compiled from: Timber.kt */
    /* loaded from: classes4.dex */
    public static abstract class b {
        public final ThreadLocal<String> a = new ThreadLocal<>();

        public static String e(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            j.e(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        public void a(String str, Object... objArr) {
            j.f(objArr, "args");
            i(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void b(Throwable th) {
            i(3, th, null, new Object[0]);
        }

        public void c(String str, Object... objArr) {
            j.f(objArr, "args");
            i(6, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(Throwable th) {
            i(6, th, null, new Object[0]);
        }

        public void f(String str, Object... objArr) {
            j.f(objArr, "args");
            i(4, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public boolean g(int i) {
            return true;
        }

        public abstract void h(String str, int i, String str2, Throwable th);

        public final void i(int i, Throwable th, String str, Object... objArr) {
            boolean z;
            ThreadLocal<String> threadLocal = this.a;
            String str2 = threadLocal.get();
            if (str2 != null) {
                threadLocal.remove();
            }
            if (!g(i)) {
                return;
            }
            boolean z2 = false;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (th == null) {
                    return;
                }
                str = e(th);
            } else {
                if (objArr.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    j.f(str, "message");
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                    j.e(str, "java.lang.String.format(this, *args)");
                }
                if (th != null) {
                    str = ((Object) str) + '\n' + e(th);
                }
            }
            h(str2, i, str, th);
        }

        public void j(String str, Object... objArr) {
            j.f(objArr, "args");
            i(5, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void k(Exception exc, String str, Object... objArr) {
            j.f(objArr, "args");
            i(7, exc, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void l(String str, Object... objArr) {
            j.f(objArr, "args");
            i(7, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void m(Throwable th) {
            i(7, th, null, new Object[0]);
        }
    }
}
