package com.amazon.aps.iva.jf0;

import com.amazon.aps.iva.jf0.a;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
/* compiled from: ParameterHandler.java */
/* loaded from: classes4.dex */
public abstract class w<T> {

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class a<T> extends w<T> {
        public final Method a;
        public final int b;
        public final com.amazon.aps.iva.jf0.f<T, RequestBody> c;

        public a(Method method, int i, com.amazon.aps.iva.jf0.f<T, RequestBody> fVar) {
            this.a = method;
            this.b = i;
            this.c = fVar;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, T t) {
            int i = this.b;
            Method method = this.a;
            if (t != null) {
                try {
                    yVar.k = this.c.convert(t);
                    return;
                } catch (IOException e) {
                    throw f0.k(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            }
            throw f0.j(method, i, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class b<T> extends w<T> {
        public final String a;
        public final com.amazon.aps.iva.jf0.f<T, String> b;
        public final boolean c;

        public b(String str, boolean z) {
            a.d dVar = a.d.a;
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = dVar;
            this.c = z;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.b.convert(t)) == null) {
                return;
            }
            String str = this.a;
            boolean z = this.c;
            FormBody.Builder builder = yVar.j;
            if (z) {
                builder.addEncoded(str, convert);
            } else {
                builder.add(str, convert);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class c<T> extends w<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public c(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                boolean z = this.c;
                                FormBody.Builder builder = yVar.j;
                                if (z) {
                                    builder.addEncoded(str, obj2);
                                } else {
                                    builder.add(str, obj2);
                                }
                            } else {
                                throw f0.j(method, i, "Field map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw f0.j(method, i, defpackage.e.e("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw f0.j(method, i, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw f0.j(method, i, "Field map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class d<T> extends w<T> {
        public final String a;
        public final com.amazon.aps.iva.jf0.f<T, String> b;

        public d(String str) {
            a.d dVar = a.d.a;
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = dVar;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.b.convert(t)) == null) {
                return;
            }
            yVar.a(this.a, convert);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class e<T> extends w<Map<String, T>> {
        public final Method a;
        public final int b;

        public e(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            yVar.a(str, value.toString());
                        } else {
                            throw f0.j(method, i, defpackage.e.e("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw f0.j(method, i, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw f0.j(method, i, "Header map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class f extends w<Headers> {
        public final Method a;
        public final int b;

        public f(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, Headers headers) throws IOException {
            Headers headers2 = headers;
            if (headers2 != null) {
                yVar.f.addAll(headers2);
                return;
            }
            throw f0.j(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class g<T> extends w<T> {
        public final Method a;
        public final int b;
        public final Headers c;
        public final com.amazon.aps.iva.jf0.f<T, RequestBody> d;

        public g(Method method, int i, Headers headers, com.amazon.aps.iva.jf0.f<T, RequestBody> fVar) {
            this.a = method;
            this.b = i;
            this.c = headers;
            this.d = fVar;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, T t) {
            if (t == null) {
                return;
            }
            try {
                yVar.i.addPart(this.c, this.d.convert(t));
            } catch (IOException e) {
                throw f0.j(this.a, this.b, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class h<T> extends w<Map<String, T>> {
        public final Method a;
        public final int b;
        public final com.amazon.aps.iva.jf0.f<T, RequestBody> c;
        public final String d;

        public h(Method method, int i, com.amazon.aps.iva.jf0.f<T, RequestBody> fVar, String str) {
            this.a = method;
            this.b = i;
            this.c = fVar;
            this.d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            yVar.i.addPart(Headers.of(HttpHeaders.CONTENT_DISPOSITION, defpackage.e.e("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d), (RequestBody) this.c.convert(value));
                        } else {
                            throw f0.j(method, i, defpackage.e.e("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw f0.j(method, i, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw f0.j(method, i, "Part map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class i<T> extends w<T> {
        public final Method a;
        public final int b;
        public final String c;
        public final com.amazon.aps.iva.jf0.f<T, String> d;
        public final boolean e;

        public i(Method method, int i, String str, boolean z) {
            a.d dVar = a.d.a;
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = dVar;
            this.e = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
        @Override // com.amazon.aps.iva.jf0.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(com.amazon.aps.iva.jf0.y r18, T r19) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jf0.w.i.a(com.amazon.aps.iva.jf0.y, java.lang.Object):void");
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class j<T> extends w<T> {
        public final String a;
        public final com.amazon.aps.iva.jf0.f<T, String> b;
        public final boolean c;

        public j(String str, boolean z) {
            a.d dVar = a.d.a;
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = dVar;
            this.c = z;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.b.convert(t)) == null) {
                return;
            }
            yVar.b(this.a, convert, this.c);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class k<T> extends w<Map<String, T>> {
        public final Method a;
        public final int b;
        public final boolean c;

        public k(Method method, int i, boolean z) {
            this.a = method;
            this.b = i;
            this.c = z;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, Object obj) throws IOException {
            Map map = (Map) obj;
            int i = this.b;
            Method method = this.a;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                yVar.b(str, obj2, this.c);
                            } else {
                                throw f0.j(method, i, "Query map value '" + value + "' converted to null by " + a.d.class.getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw f0.j(method, i, defpackage.e.e("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw f0.j(method, i, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw f0.j(method, i, "Query map was null", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class l<T> extends w<T> {
        public final boolean a;

        public l(boolean z) {
            this.a = z;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, T t) throws IOException {
            if (t == null) {
                return;
            }
            yVar.b(t.toString(), null, this.a);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class m extends w<MultipartBody.Part> {
        public static final m a = new m();

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, MultipartBody.Part part) throws IOException {
            MultipartBody.Part part2 = part;
            if (part2 != null) {
                yVar.i.addPart(part2);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class n extends w<Object> {
        public final Method a;
        public final int b;

        public n(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, Object obj) {
            if (obj != null) {
                yVar.c = obj.toString();
                return;
            }
            int i = this.b;
            throw f0.j(this.a, i, "@Url parameter is null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class o<T> extends w<T> {
        public final Class<T> a;

        public o(Class<T> cls) {
            this.a = cls;
        }

        @Override // com.amazon.aps.iva.jf0.w
        public final void a(y yVar, T t) {
            yVar.e.tag(this.a, t);
        }
    }

    public abstract void a(y yVar, T t) throws IOException;
}
