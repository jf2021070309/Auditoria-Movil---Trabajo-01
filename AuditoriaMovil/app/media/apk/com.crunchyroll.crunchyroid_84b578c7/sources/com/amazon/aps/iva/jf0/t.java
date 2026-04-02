package com.amazon.aps.iva.jf0;

import com.amazon.aps.iva.jf0.f;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.ResponseBody;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: OptionalConverterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class t extends f.a {
    public static final t a = new t();

    /* compiled from: OptionalConverterFactory.java */
    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class a<T> implements f<ResponseBody, Optional<T>> {
        public final f<ResponseBody, T> a;

        public a(f<ResponseBody, T> fVar) {
            this.a = fVar;
        }

        @Override // com.amazon.aps.iva.jf0.f
        public final Object convert(ResponseBody responseBody) throws IOException {
            return Optional.ofNullable(this.a.convert(responseBody));
        }
    }

    @Override // com.amazon.aps.iva.jf0.f.a
    public final f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
        if (f0.e(type) != Optional.class) {
            return null;
        }
        return new a(b0Var.e(f0.d(0, (ParameterizedType) type), annotationArr));
    }
}
