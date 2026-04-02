package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public interface CallAdapter<R, T> {
    T adapt(Call<R> call);

    Type responseType();

    /* loaded from: classes4.dex */
    public static abstract class Factory {
        public abstract CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit);

        /* JADX INFO: Access modifiers changed from: protected */
        public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
            return i.a(i, parameterizedType);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static Class<?> getRawType(Type type) {
            return i.a(type);
        }
    }
}
