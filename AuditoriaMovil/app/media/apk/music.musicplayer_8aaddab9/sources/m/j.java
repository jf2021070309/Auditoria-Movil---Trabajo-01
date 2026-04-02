package m;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public interface j<F, T> {

    /* loaded from: classes.dex */
    public static abstract class a {
        @Nullable
        public j<?, j.c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, c0 c0Var) {
            return null;
        }

        @Nullable
        public j<j.f0, ?> b(Type type, Annotation[] annotationArr, c0 c0Var) {
            return null;
        }
    }

    @Nullable
    T a(F f2) throws IOException;
}
