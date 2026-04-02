package m.h0.a;

import j.c0;
import j.f0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import m.j;
/* loaded from: classes2.dex */
public final class a extends j.a {
    public final e.d.e.j a;

    public a(e.d.e.j jVar) {
        this.a = jVar;
    }

    @Override // m.j.a
    public j<?, c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, m.c0 c0Var) {
        return new b(this.a, this.a.c(new e.d.e.d0.a(type)));
    }

    @Override // m.j.a
    public j<f0, ?> b(Type type, Annotation[] annotationArr, m.c0 c0Var) {
        return new c(this.a, this.a.c(new e.d.e.d0.a(type)));
    }
}
