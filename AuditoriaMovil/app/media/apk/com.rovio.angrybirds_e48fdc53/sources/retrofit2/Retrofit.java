package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.a;
import retrofit2.h;
/* loaded from: classes4.dex */
public final class Retrofit {
    final Call.Factory a;
    final HttpUrl b;
    final List<Converter.Factory> c;
    final List<CallAdapter.Factory> d;
    final Executor e;
    final boolean f;
    private final Map<Method, h<?, ?>> g = new ConcurrentHashMap();

    Retrofit(Call.Factory factory, HttpUrl httpUrl, List<Converter.Factory> list, List<CallAdapter.Factory> list2, Executor executor, boolean z) {
        this.a = factory;
        this.b = httpUrl;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = executor;
        this.f = z;
    }

    public <T> T create(final Class<T> cls) {
        i.a((Class) cls);
        if (this.f) {
            a((Class<?>) cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1
            private final f c = f.a();

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.c.a(method)) {
                    return this.c.a(method, cls, obj, objArr);
                }
                h<?, ?> a = Retrofit.this.a(method);
                return a.d.adapt(new d(a, objArr));
            }
        });
    }

    private void a(Class<?> cls) {
        Method[] declaredMethods;
        f a = f.a();
        for (Method method : cls.getDeclaredMethods()) {
            if (!a.a(method)) {
                a(method);
            }
        }
    }

    h<?, ?> a(Method method) {
        h hVar = this.g.get(method);
        if (hVar == null) {
            synchronized (this.g) {
                hVar = this.g.get(method);
                if (hVar == null) {
                    hVar = new h.a(this, method).a();
                    this.g.put(method, hVar);
                }
            }
        }
        return hVar;
    }

    public Call.Factory callFactory() {
        return this.a;
    }

    public HttpUrl baseUrl() {
        return this.b;
    }

    public List<CallAdapter.Factory> callAdapterFactories() {
        return this.d;
    }

    public CallAdapter<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public CallAdapter<?, ?> nextCallAdapter(CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        i.a(type, "returnType == null");
        i.a(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf(factory) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            CallAdapter<?, ?> callAdapter = this.d.get(i).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate call adapter for ").append(type).append(".\n");
        if (factory != null) {
            append.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                append.append("\n   * ").append(this.d.get(i2).getClass().getName());
            }
            append.append('\n');
        }
        append.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            append.append("\n   * ").append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(append.toString());
    }

    public List<Converter.Factory> converterFactories() {
        return this.c;
    }

    public <T> Converter<T, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> Converter<T, RequestBody> nextRequestBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        i.a(type, "type == null");
        i.a(annotationArr, "parameterAnnotations == null");
        i.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.c.indexOf(factory) + 1;
        int size = this.c.size();
        for (int i = indexOf; i < size; i++) {
            Converter<T, RequestBody> converter = (Converter<T, RequestBody>) this.c.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate RequestBody converter for ").append(type).append(".\n");
        if (factory != null) {
            append.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                append.append("\n   * ").append(this.c.get(i2).getClass().getName());
            }
            append.append('\n');
        }
        append.append("  Tried:");
        int size2 = this.c.size();
        while (indexOf < size2) {
            append.append("\n   * ").append(this.c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(append.toString());
    }

    public <T> Converter<ResponseBody, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> Converter<ResponseBody, T> nextResponseBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr) {
        i.a(type, "type == null");
        i.a(annotationArr, "annotations == null");
        int indexOf = this.c.indexOf(factory) + 1;
        int size = this.c.size();
        for (int i = indexOf; i < size; i++) {
            Converter<ResponseBody, T> converter = (Converter<ResponseBody, T>) this.c.get(i).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate ResponseBody converter for ").append(type).append(".\n");
        if (factory != null) {
            append.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                append.append("\n   * ").append(this.c.get(i2).getClass().getName());
            }
            append.append('\n');
        }
        append.append("  Tried:");
        int size2 = this.c.size();
        while (indexOf < size2) {
            append.append("\n   * ").append(this.c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(append.toString());
    }

    public <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        i.a(type, "type == null");
        i.a(annotationArr, "annotations == null");
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> converter = (Converter<T, String>) this.c.get(i).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return a.d.a;
    }

    public Executor callbackExecutor() {
        return this.e;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private final f a;
        private Call.Factory b;
        private HttpUrl c;
        private final List<Converter.Factory> d;
        private final List<CallAdapter.Factory> e;
        private Executor f;
        private boolean g;

        Builder(f fVar) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = fVar;
            this.d.add(new a());
        }

        public Builder() {
            this(f.a());
        }

        Builder(Retrofit retrofit) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = f.a();
            this.b = retrofit.a;
            this.c = retrofit.b;
            this.d.addAll(retrofit.c);
            this.e.addAll(retrofit.d);
            this.e.remove(this.e.size() - 1);
            this.f = retrofit.e;
            this.g = retrofit.f;
        }

        public Builder client(OkHttpClient okHttpClient) {
            return callFactory((Call.Factory) i.a(okHttpClient, "client == null"));
        }

        public Builder callFactory(Call.Factory factory) {
            this.b = (Call.Factory) i.a(factory, "factory == null");
            return this;
        }

        public Builder baseUrl(String str) {
            i.a(str, "baseUrl == null");
            HttpUrl parse = HttpUrl.parse(str);
            if (parse == null) {
                throw new IllegalArgumentException("Illegal URL: " + str);
            }
            return baseUrl(parse);
        }

        public Builder baseUrl(HttpUrl httpUrl) {
            i.a(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if (!"".equals(pathSegments.get(pathSegments.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
            }
            this.c = httpUrl;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder addConverterFactory(Converter.Factory factory) {
            this.d.add(i.a(factory, "factory == null"));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder addCallAdapterFactory(CallAdapter.Factory factory) {
            this.e.add(i.a(factory, "factory == null"));
            return this;
        }

        public Builder callbackExecutor(Executor executor) {
            this.f = (Executor) i.a(executor, "executor == null");
            return this;
        }

        public Builder validateEagerly(boolean z) {
            this.g = z;
            return this;
        }

        public Retrofit build() {
            if (this.c == null) {
                throw new IllegalStateException("Base URL required.");
            }
            Call.Factory factory = this.b;
            if (factory == null) {
                factory = new OkHttpClient();
            }
            Executor executor = this.f;
            if (executor == null) {
                executor = this.a.b();
            }
            ArrayList arrayList = new ArrayList(this.e);
            arrayList.add(this.a.a(executor));
            return new Retrofit(factory, this.c, new ArrayList(this.d), arrayList, executor, this.g);
        }
    }
}
