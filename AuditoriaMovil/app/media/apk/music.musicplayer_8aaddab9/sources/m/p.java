package m;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class p<T> implements d<T> {
    public final /* synthetic */ i.a.j a;

    public p(i.a.j jVar) {
        this.a = jVar;
    }

    @Override // m.d
    public void a(b<T> bVar, Throwable th) {
        h.o.c.j.f(bVar, "call");
        h.o.c.j.f(th, "t");
        this.a.resumeWith(e.j.d.w.y(th));
    }

    @Override // m.d
    public void b(b<T> bVar, a0<T> a0Var) {
        h.o.c.j.f(bVar, "call");
        h.o.c.j.f(a0Var, "response");
        if (!a0Var.a()) {
            this.a.resumeWith(e.j.d.w.y(new l(a0Var)));
            return;
        }
        T t = a0Var.f9842b;
        if (t != null) {
            this.a.resumeWith(t);
            return;
        }
        Object cast = n.class.cast(bVar.M().f9605e.get(n.class));
        if (cast == null) {
            h.o.c.j.j();
            throw null;
        }
        h.o.c.j.b(cast, "call.request().tag(Invocation::class.java)!!");
        Method method = ((n) cast).a;
        StringBuilder sb = new StringBuilder();
        sb.append("Response from ");
        h.o.c.j.b(method, "method");
        Class<?> declaringClass = method.getDeclaringClass();
        h.o.c.j.b(declaringClass, "method.declaringClass");
        sb.append(declaringClass.getName());
        sb.append(CoreConstants.DOT);
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        this.a.resumeWith(e.j.d.w.y(new h.b(sb.toString())));
    }
}
