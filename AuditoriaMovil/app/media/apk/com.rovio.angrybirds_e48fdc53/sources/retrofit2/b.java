package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.CallAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class b extends CallAdapter.Factory {
    static final CallAdapter.Factory a = new b();

    b() {
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (getRawType(type) != Call.class) {
            return null;
        }
        final Type e = i.e(type);
        return new CallAdapter<Object, Call<?>>() { // from class: retrofit2.b.1
            @Override // retrofit2.CallAdapter
            public Type responseType() {
                return e;
            }

            @Override // retrofit2.CallAdapter
            /* renamed from: a */
            public Call<Object> adapt(Call<Object> call) {
                return call;
            }
        };
    }
}
