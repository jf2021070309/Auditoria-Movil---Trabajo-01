package retrofit2;

import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.e;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Url;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class h<R, T> {
    static final Pattern a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    static final Pattern b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    final Call.Factory c;
    final CallAdapter<R, T> d;
    private final HttpUrl e;
    private final Converter<ResponseBody, R> f;
    private final String g;
    private final String h;
    private final Headers i;
    private final MediaType j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final e<?>[] n;

    h(a<R, T> aVar) {
        this.c = aVar.a.callFactory();
        this.d = aVar.w;
        this.e = aVar.a.baseUrl();
        this.f = aVar.v;
        this.g = aVar.m;
        this.h = aVar.q;
        this.i = aVar.r;
        this.j = aVar.s;
        this.k = aVar.n;
        this.l = aVar.o;
        this.m = aVar.p;
        this.n = aVar.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request a(Object... objArr) {
        g gVar = new g(this.g, this.e, this.h, this.i, this.j, this.k, this.l, this.m);
        e<?>[] eVarArr = this.n;
        int length = objArr != null ? objArr.length : 0;
        if (length != eVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + eVarArr.length + ")");
        }
        for (int i = 0; i < length; i++) {
            eVarArr[i].a(gVar, objArr[i]);
        }
        return gVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public R a(ResponseBody responseBody) {
        return this.f.convert(responseBody);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T, R> {
        final Retrofit a;
        final Method b;
        final Annotation[] c;
        final Annotation[][] d;
        final Type[] e;
        Type f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        String m;
        boolean n;
        boolean o;
        boolean p;
        String q;
        Headers r;
        MediaType s;
        Set<String> t;
        e<?>[] u;
        Converter<ResponseBody, T> v;
        CallAdapter<T, R> w;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Retrofit retrofit, Method method) {
            this.a = retrofit;
            this.b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public h a() {
            this.w = b();
            this.f = this.w.responseType();
            if (this.f == Response.class || this.f == okhttp3.Response.class) {
                throw a("'" + i.a(this.f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
            }
            this.v = c();
            for (Annotation annotation : this.c) {
                a(annotation);
            }
            if (this.m == null) {
                throw a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.n) {
                if (this.p) {
                    throw a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.o) {
                    throw a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.d.length;
            this.u = new e[length];
            for (int i = 0; i < length; i++) {
                Type type = this.e[i];
                if (i.d(type)) {
                    throw a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                }
                Annotation[] annotationArr = this.d[i];
                if (annotationArr == null) {
                    throw a(i, "No Retrofit annotation found.", new Object[0]);
                }
                this.u[i] = a(i, type, annotationArr);
            }
            if (this.q == null && !this.l) {
                throw a("Missing either @%s URL or @Url parameter.", this.m);
            }
            if (!this.o && !this.p && !this.n && this.i) {
                throw a("Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (this.o && !this.g) {
                throw a("Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (this.p && !this.h) {
                throw a("Multipart method must contain at least one @Part.", new Object[0]);
            }
            return new h(this);
        }

        private CallAdapter<T, R> b() {
            Type genericReturnType = this.b.getGenericReturnType();
            if (i.d(genericReturnType)) {
                throw a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            }
            if (genericReturnType == Void.TYPE) {
                throw a("Service methods cannot return void.", new Object[0]);
            }
            try {
                return (CallAdapter<T, R>) this.a.callAdapter(genericReturnType, this.b.getAnnotations());
            } catch (RuntimeException e) {
                throw a(e, "Unable to create call adapter for %s", genericReturnType);
            }
        }

        private void a(Annotation annotation) {
            if (annotation instanceof DELETE) {
                a("DELETE", ((DELETE) annotation).value(), false);
            } else if (annotation instanceof GET) {
                a("GET", ((GET) annotation).value(), false);
            } else if (annotation instanceof HEAD) {
                a("HEAD", ((HEAD) annotation).value(), false);
                if (!Void.class.equals(this.f)) {
                    throw a("HEAD method must use Void as response type.", new Object[0]);
                }
            } else if (annotation instanceof PATCH) {
                a("PATCH", ((PATCH) annotation).value(), true);
            } else if (annotation instanceof POST) {
                a("POST", ((POST) annotation).value(), true);
            } else if (annotation instanceof PUT) {
                a("PUT", ((PUT) annotation).value(), true);
            } else if (annotation instanceof OPTIONS) {
                a("OPTIONS", ((OPTIONS) annotation).value(), false);
            } else if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                a(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof retrofit2.http.Headers) {
                String[] value = ((retrofit2.http.Headers) annotation).value();
                if (value.length == 0) {
                    throw a("@Headers annotation is empty.", new Object[0]);
                }
                this.r = a(value);
            } else if (annotation instanceof Multipart) {
                if (this.o) {
                    throw a("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.p = true;
            } else if (annotation instanceof FormUrlEncoded) {
                if (this.p) {
                    throw a("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.o = true;
            }
        }

        private void a(String str, String str2, boolean z) {
            if (this.m != null) {
                throw a("Only one HTTP method is allowed. Found: %s and %s.", this.m, str);
            }
            this.m = str;
            this.n = z;
            if (!str2.isEmpty()) {
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (h.a.matcher(substring).find()) {
                        throw a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.q = str2;
                this.t = h.a(str2);
            }
        }

        private Headers a(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (DownloadUtils.CONTENT_TYPE.equalsIgnoreCase(substring)) {
                    MediaType parse = MediaType.parse(trim);
                    if (parse == null) {
                        throw a("Malformed content type: %s", trim);
                    }
                    this.s = parse;
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        private e<?> a(int i, Type type, Annotation[] annotationArr) {
            e<?> eVar = null;
            for (Annotation annotation : annotationArr) {
                e<?> a = a(i, type, annotationArr, annotation);
                if (a != null) {
                    if (eVar != null) {
                        throw a(i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                    eVar = a;
                }
            }
            if (eVar == null) {
                throw a(i, "No Retrofit annotation found.", new Object[0]);
            }
            return eVar;
        }

        private e<?> a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                if (this.l) {
                    throw a(i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.j) {
                    throw a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.k) {
                    throw a(i, "A @Url parameter must not come after a @Query", new Object[0]);
                }
                if (this.q != null) {
                    throw a(i, "@Url cannot be used with @%s URL", this.m);
                }
                this.l = true;
                if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new e.m();
                }
                throw a(i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            } else if (annotation instanceof Path) {
                if (this.k) {
                    throw a(i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.l) {
                    throw a(i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.q == null) {
                    throw a(i, "@Path can only be used with relative url on @%s", this.m);
                }
                this.j = true;
                Path path = (Path) annotation;
                String value = path.value();
                a(i, value);
                return new e.h(value, this.a.stringConverter(type, annotationArr), path.encoded());
            } else if (annotation instanceof Query) {
                Query query = (Query) annotation;
                String value2 = query.value();
                boolean encoded = query.encoded();
                Class<?> a = i.a(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(a)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a.getSimpleName() + " must include generic type (e.g., " + a.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new e.i(value2, this.a.stringConverter(i.a(0, (ParameterizedType) type), annotationArr), encoded).a();
                } else if (a.isArray()) {
                    return new e.i(value2, this.a.stringConverter(h.a(a.getComponentType()), annotationArr), encoded).b();
                } else {
                    return new e.i(value2, this.a.stringConverter(type, annotationArr), encoded);
                }
            } else if (annotation instanceof QueryName) {
                boolean encoded2 = ((QueryName) annotation).encoded();
                Class<?> a2 = i.a(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(a2)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a2.getSimpleName() + " must include generic type (e.g., " + a2.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new e.k(this.a.stringConverter(i.a(0, (ParameterizedType) type), annotationArr), encoded2).a();
                } else if (a2.isArray()) {
                    return new e.k(this.a.stringConverter(h.a(a2.getComponentType()), annotationArr), encoded2).b();
                } else {
                    return new e.k(this.a.stringConverter(type, annotationArr), encoded2);
                }
            } else if (annotation instanceof QueryMap) {
                Class<?> a3 = i.a(type);
                if (!Map.class.isAssignableFrom(a3)) {
                    throw a(i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type b = i.b(type, a3, Map.class);
                if (!(b instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) b;
                Type a4 = i.a(0, parameterizedType);
                if (String.class != a4) {
                    throw a(i, "@QueryMap keys must be of type String: " + a4, new Object[0]);
                }
                return new e.j(this.a.stringConverter(i.a(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
            } else if (annotation instanceof Header) {
                String value3 = ((Header) annotation).value();
                Class<?> a5 = i.a(type);
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a5.getSimpleName() + " must include generic type (e.g., " + a5.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new e.d(value3, this.a.stringConverter(i.a(0, (ParameterizedType) type), annotationArr)).a();
                } else if (a5.isArray()) {
                    return new e.d(value3, this.a.stringConverter(h.a(a5.getComponentType()), annotationArr)).b();
                } else {
                    return new e.d(value3, this.a.stringConverter(type, annotationArr));
                }
            } else if (annotation instanceof HeaderMap) {
                Class<?> a6 = i.a(type);
                if (!Map.class.isAssignableFrom(a6)) {
                    throw a(i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type b2 = i.b(type, a6, Map.class);
                if (!(b2 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) b2;
                Type a7 = i.a(0, parameterizedType2);
                if (String.class != a7) {
                    throw a(i, "@HeaderMap keys must be of type String: " + a7, new Object[0]);
                }
                return new e.C0348e(this.a.stringConverter(i.a(1, parameterizedType2), annotationArr));
            } else if (annotation instanceof Field) {
                if (!this.o) {
                    throw a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                Field field = (Field) annotation;
                String value4 = field.value();
                boolean encoded3 = field.encoded();
                this.g = true;
                Class<?> a8 = i.a(type);
                if (Iterable.class.isAssignableFrom(a8)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a8.getSimpleName() + " must include generic type (e.g., " + a8.getSimpleName() + "<String>)", new Object[0]);
                    }
                    return new e.b(value4, this.a.stringConverter(i.a(0, (ParameterizedType) type), annotationArr), encoded3).a();
                } else if (a8.isArray()) {
                    return new e.b(value4, this.a.stringConverter(h.a(a8.getComponentType()), annotationArr), encoded3).b();
                } else {
                    return new e.b(value4, this.a.stringConverter(type, annotationArr), encoded3);
                }
            } else if (annotation instanceof FieldMap) {
                if (!this.o) {
                    throw a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> a9 = i.a(type);
                if (!Map.class.isAssignableFrom(a9)) {
                    throw a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type b3 = i.b(type, a9, Map.class);
                if (!(b3 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) b3;
                Type a10 = i.a(0, parameterizedType3);
                if (String.class != a10) {
                    throw a(i, "@FieldMap keys must be of type String: " + a10, new Object[0]);
                }
                Converter<T, String> stringConverter = this.a.stringConverter(i.a(1, parameterizedType3), annotationArr);
                this.g = true;
                return new e.c(stringConverter, ((FieldMap) annotation).encoded());
            } else if (annotation instanceof Part) {
                if (!this.p) {
                    throw a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                Part part = (Part) annotation;
                this.h = true;
                String value5 = part.value();
                Class<?> a11 = i.a(type);
                if (value5.isEmpty()) {
                    if (Iterable.class.isAssignableFrom(a11)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw a(i, a11.getSimpleName() + " must include generic type (e.g., " + a11.getSimpleName() + "<String>)", new Object[0]);
                        }
                        if (!MultipartBody.Part.class.isAssignableFrom(i.a(i.a(0, (ParameterizedType) type)))) {
                            throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return e.l.a.a();
                    } else if (a11.isArray()) {
                        if (!MultipartBody.Part.class.isAssignableFrom(a11.getComponentType())) {
                            throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return e.l.a.b();
                    } else if (MultipartBody.Part.class.isAssignableFrom(a11)) {
                        return e.l.a;
                    } else {
                        throw a(i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                }
                Headers of = Headers.of(DownloadUtils.CONTENT_DISPOSITION, "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", part.encoding());
                if (Iterable.class.isAssignableFrom(a11)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw a(i, a11.getSimpleName() + " must include generic type (e.g., " + a11.getSimpleName() + "<String>)", new Object[0]);
                    }
                    Type a12 = i.a(0, (ParameterizedType) type);
                    if (MultipartBody.Part.class.isAssignableFrom(i.a(a12))) {
                        throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new e.f(of, this.a.requestBodyConverter(a12, annotationArr, this.c)).a();
                } else if (a11.isArray()) {
                    Class<?> a13 = h.a(a11.getComponentType());
                    if (MultipartBody.Part.class.isAssignableFrom(a13)) {
                        throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new e.f(of, this.a.requestBodyConverter(a13, annotationArr, this.c)).b();
                } else if (MultipartBody.Part.class.isAssignableFrom(a11)) {
                    throw a(i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                } else {
                    return new e.f(of, this.a.requestBodyConverter(type, annotationArr, this.c));
                }
            } else if (annotation instanceof PartMap) {
                if (!this.p) {
                    throw a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.h = true;
                Class<?> a14 = i.a(type);
                if (!Map.class.isAssignableFrom(a14)) {
                    throw a(i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type b4 = i.b(type, a14, Map.class);
                if (!(b4 instanceof ParameterizedType)) {
                    throw a(i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) b4;
                Type a15 = i.a(0, parameterizedType4);
                if (String.class != a15) {
                    throw a(i, "@PartMap keys must be of type String: " + a15, new Object[0]);
                }
                Type a16 = i.a(1, parameterizedType4);
                if (MultipartBody.Part.class.isAssignableFrom(i.a(a16))) {
                    throw a(i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                }
                return new e.g(this.a.requestBodyConverter(a16, annotationArr, this.c), ((PartMap) annotation).encoding());
            } else if (annotation instanceof Body) {
                if (this.o || this.p) {
                    throw a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.i) {
                    throw a(i, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    Converter<T, RequestBody> requestBodyConverter = this.a.requestBodyConverter(type, annotationArr, this.c);
                    this.i = true;
                    return new e.a(requestBodyConverter);
                } catch (RuntimeException e) {
                    throw a(e, i, "Unable to create @Body converter for %s", type);
                }
            } else {
                return null;
            }
        }

        private void a(int i, String str) {
            if (!h.b.matcher(str).matches()) {
                throw a(i, "@Path parameter name must match %s. Found: %s", h.a.pattern(), str);
            }
            if (!this.t.contains(str)) {
                throw a(i, "URL \"%s\" does not contain \"{%s}\".", this.q, str);
            }
        }

        private Converter<ResponseBody, T> c() {
            try {
                return this.a.responseBodyConverter(this.f, this.b.getAnnotations());
            } catch (RuntimeException e) {
                throw a(e, "Unable to create converter for %s", this.f);
            }
        }

        private RuntimeException a(String str, Object... objArr) {
            return a((Throwable) null, str, objArr);
        }

        private RuntimeException a(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + this.b.getDeclaringClass().getSimpleName() + "." + this.b.getName(), th);
        }

        private RuntimeException a(Throwable th, int i, String str, Object... objArr) {
            return a(th, str + " (parameter #" + (i + 1) + ")", objArr);
        }

        private RuntimeException a(int i, String str, Object... objArr) {
            return a(str + " (parameter #" + (i + 1) + ")", objArr);
        }
    }

    static Set<String> a(String str) {
        Matcher matcher = a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    static Class<?> a(Class<?> cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }
}
