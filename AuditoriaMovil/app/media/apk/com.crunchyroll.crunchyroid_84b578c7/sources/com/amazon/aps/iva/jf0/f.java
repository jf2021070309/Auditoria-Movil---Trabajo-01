package com.amazon.aps.iva.jf0;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
/* compiled from: Converter.java */
/* loaded from: classes4.dex */
public interface f<F, T> {

    /* compiled from: Converter.java */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public f a(Type type) {
            return null;
        }

        public f<ResponseBody, ?> b(Type type, Annotation[] annotationArr, b0 b0Var) {
            return null;
        }
    }

    T convert(F f) throws IOException;
}
