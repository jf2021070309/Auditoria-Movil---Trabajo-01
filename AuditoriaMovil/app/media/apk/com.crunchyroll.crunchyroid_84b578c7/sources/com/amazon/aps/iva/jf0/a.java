package com.amazon.aps.iva.jf0;

import com.amazon.aps.iva.jf0.f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
/* compiled from: BuiltInConverters.java */
/* loaded from: classes4.dex */
public final class a extends f.a {
    public boolean a = true;

    /* compiled from: BuiltInConverters.java */
    /* renamed from: com.amazon.aps.iva.jf0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0414a implements com.amazon.aps.iva.jf0.f<ResponseBody, ResponseBody> {
        public static final C0414a a = new C0414a();

        @Override // com.amazon.aps.iva.jf0.f
        public final ResponseBody convert(ResponseBody responseBody) throws IOException {
            ResponseBody responseBody2 = responseBody;
            try {
                com.amazon.aps.iva.ef0.e eVar = new com.amazon.aps.iva.ef0.e();
                responseBody2.source().W(eVar);
                return ResponseBody.create(responseBody2.contentType(), responseBody2.contentLength(), eVar);
            } finally {
                responseBody2.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class b implements com.amazon.aps.iva.jf0.f<RequestBody, RequestBody> {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.jf0.f
        public final RequestBody convert(RequestBody requestBody) throws IOException {
            return requestBody;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class c implements com.amazon.aps.iva.jf0.f<ResponseBody, ResponseBody> {
        public static final c a = new c();

        @Override // com.amazon.aps.iva.jf0.f
        public final ResponseBody convert(ResponseBody responseBody) throws IOException {
            return responseBody;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class d implements com.amazon.aps.iva.jf0.f<Object, String> {
        public static final d a = new d();

        @Override // com.amazon.aps.iva.jf0.f
        public final String convert(Object obj) throws IOException {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class e implements com.amazon.aps.iva.jf0.f<ResponseBody, com.amazon.aps.iva.kb0.q> {
        public static final e a = new e();

        @Override // com.amazon.aps.iva.jf0.f
        public final com.amazon.aps.iva.kb0.q convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class f implements com.amazon.aps.iva.jf0.f<ResponseBody, Void> {
        public static final f a = new f();

        @Override // com.amazon.aps.iva.jf0.f
        public final Void convert(ResponseBody responseBody) throws IOException {
            responseBody.close();
            return null;
        }
    }

    @Override // com.amazon.aps.iva.jf0.f.a
    public final com.amazon.aps.iva.jf0.f a(Type type) {
        if (RequestBody.class.isAssignableFrom(f0.e(type))) {
            return b.a;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.jf0.f.a
    public final com.amazon.aps.iva.jf0.f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (type == ResponseBody.class) {
            if (f0.h(annotationArr, com.amazon.aps.iva.lf0.w.class)) {
                return c.a;
            }
            return C0414a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
            if (this.a && type == com.amazon.aps.iva.kb0.q.class) {
                try {
                    return e.a;
                } catch (NoClassDefFoundError unused) {
                    this.a = false;
                    return null;
                }
            }
            return null;
        }
    }
}
