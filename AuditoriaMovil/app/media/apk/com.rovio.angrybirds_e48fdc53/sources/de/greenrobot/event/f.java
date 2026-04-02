package de.greenrobot.event;

import java.lang.reflect.Method;
/* loaded from: classes4.dex */
final class f {
    final Method a;
    final ThreadMode b;
    final Class<?> c;
    String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Method method, ThreadMode threadMode, Class<?> cls) {
        this.a = method;
        this.b = threadMode;
        this.c = cls;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            a();
            f fVar = (f) obj;
            fVar.a();
            return this.d.equals(fVar.d);
        }
        return false;
    }

    private synchronized void a() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.a.getDeclaringClass().getName());
            sb.append('#').append(this.a.getName());
            sb.append('(').append(this.c.getName());
            this.d = sb.toString();
        }
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
