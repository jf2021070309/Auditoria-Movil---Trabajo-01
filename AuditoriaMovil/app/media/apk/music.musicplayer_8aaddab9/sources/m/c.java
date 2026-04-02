package m;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
/* loaded from: classes2.dex */
public interface c<R, T> {

    /* loaded from: classes.dex */
    public static abstract class a {
        @Nullable
        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, c0 c0Var);
    }

    Type a();

    T b(b<R> bVar);
}
