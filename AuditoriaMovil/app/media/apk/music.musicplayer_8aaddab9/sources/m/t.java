package m;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import m.j;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class t extends j.a {
    public static final j.a a = new t();

    @IgnoreJRERequirement
    /* loaded from: classes2.dex */
    public static final class a<T> implements j<j.f0, Optional<T>> {
        public final j<j.f0, T> a;

        public a(j<j.f0, T> jVar) {
            this.a = jVar;
        }

        @Override // m.j
        public Object a(j.f0 f0Var) throws IOException {
            return Optional.ofNullable(this.a.a(f0Var));
        }
    }

    @Override // m.j.a
    @Nullable
    public j<j.f0, ?> b(Type type, Annotation[] annotationArr, c0 c0Var) {
        if (g0.f(type) != Optional.class) {
            return null;
        }
        return new a(c0Var.d(g0.e(0, (ParameterizedType) type), annotationArr));
    }
}
