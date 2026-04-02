package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.http.Streaming;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class a extends Converter.Factory {
    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == ResponseBody.class) {
            if (i.a(annotationArr, (Class<? extends Annotation>) Streaming.class)) {
                return c.a;
            }
            return C0345a.a;
        } else if (type == Void.class) {
            return e.a;
        } else {
            return null;
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (RequestBody.class.isAssignableFrom(i.a(type))) {
            return b.a;
        }
        return null;
    }

    /* loaded from: classes4.dex */
    static final class e implements Converter<ResponseBody, Void> {
        static final e a = new e();

        e() {
        }

        @Override // retrofit2.Converter
        /* renamed from: a */
        public Void convert(ResponseBody responseBody) {
            responseBody.close();
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class b implements Converter<RequestBody, RequestBody> {
        static final b a = new b();

        b() {
        }

        @Override // retrofit2.Converter
        /* renamed from: a */
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* loaded from: classes4.dex */
    static final class c implements Converter<ResponseBody, ResponseBody> {
        static final c a = new c();

        c() {
        }

        @Override // retrofit2.Converter
        /* renamed from: a */
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* renamed from: retrofit2.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0345a implements Converter<ResponseBody, ResponseBody> {
        static final C0345a a = new C0345a();

        C0345a() {
        }

        @Override // retrofit2.Converter
        /* renamed from: a */
        public ResponseBody convert(ResponseBody responseBody) {
            try {
                return i.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d implements Converter<Object, String> {
        static final d a = new d();

        d() {
        }

        @Override // retrofit2.Converter
        /* renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }
}
