package retrofit2;

import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class e<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(retrofit2.g gVar, T t);

    e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e<Iterable<T>> a() {
        return new e<Iterable<T>>() { // from class: retrofit2.e.1
            @Override // retrofit2.e
            /* bridge */ /* synthetic */ void a(retrofit2.g gVar, Object obj) {
                a(gVar, (Iterable) ((Iterable) obj));
            }

            void a(retrofit2.g gVar, Iterable<T> iterable) {
                if (iterable != null) {
                    for (T t : iterable) {
                        e.this.a(gVar, t);
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e<Object> b() {
        return new e<Object>() { // from class: retrofit2.e.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.e
            void a(retrofit2.g gVar, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        e.this.a(gVar, Array.get(obj, i2));
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends e<Object> {
        @Override // retrofit2.e
        void a(retrofit2.g gVar, Object obj) {
            gVar.a(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d<T> extends e<T> {
        private final String a;
        private final Converter<T, String> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(String str, Converter<T, String> converter) {
            this.a = (String) retrofit2.i.a(str, "name == null");
            this.b = converter;
        }

        @Override // retrofit2.e
        void a(retrofit2.g gVar, T t) {
            if (t != null) {
                gVar.a(this.a, this.b.convert(t));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h<T> extends e<T> {
        private final String a;
        private final Converter<T, String> b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public h(String str, Converter<T, String> converter, boolean z) {
            this.a = (String) retrofit2.i.a(str, "name == null");
            this.b = converter;
            this.c = z;
        }

        @Override // retrofit2.e
        void a(retrofit2.g gVar, T t) {
            if (t == null) {
                throw new IllegalArgumentException("Path parameter \"" + this.a + "\" value must not be null.");
            }
            gVar.a(this.a, this.b.convert(t), this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i<T> extends e<T> {
        private final String a;
        private final Converter<T, String> b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public i(String str, Converter<T, String> converter, boolean z) {
            this.a = (String) retrofit2.i.a(str, "name == null");
            this.b = converter;
            this.c = z;
        }

        @Override // retrofit2.e
        void a(retrofit2.g gVar, T t) {
            if (t != null) {
                gVar.b(this.a, this.b.convert(t), this.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k<T> extends e<T> {
        private final Converter<T, String> a;
        private final boolean b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public k(Converter<T, String> converter, boolean z) {
            this.a = converter;
            this.b = z;
        }

        @Override // retrofit2.e
        void a(retrofit2.g gVar, T t) {
            if (t != null) {
                gVar.b(this.a.convert(t), null, this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j<T> extends e<Map<String, T>> {
        private final Converter<T, String> a;
        private final boolean b;

        @Override // retrofit2.e
        /* bridge */ /* synthetic */ void a(retrofit2.g gVar, Object obj) {
            a(gVar, (Map) ((Map) obj));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public j(Converter<T, String> converter, boolean z) {
            this.a = converter;
            this.b = z;
        }

        void a(retrofit2.g gVar, Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Query map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Query map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Query map contained null value for key '" + key + "'.");
                }
                gVar.b(key, this.a.convert(value), this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: retrofit2.e$e  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0348e<T> extends e<Map<String, T>> {
        private final Converter<T, String> a;

        @Override // retrofit2.e
        /* bridge */ /* synthetic */ void a(retrofit2.g gVar, Object obj) {
            a(gVar, (Map) ((Map) obj));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0348e(Converter<T, String> converter) {
            this.a = converter;
        }

        void a(retrofit2.g gVar, Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Header map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Header map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Header map contained null value for key '" + key + "'.");
                }
                gVar.a(key, this.a.convert(value));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b<T> extends e<T> {
        private final String a;
        private final Converter<T, String> b;
        private final boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str, Converter<T, String> converter, boolean z) {
            this.a = (String) retrofit2.i.a(str, "name == null");
            this.b = converter;
            this.c = z;
        }

        @Override // retrofit2.e
        void a(retrofit2.g gVar, T t) {
            if (t != null) {
                gVar.c(this.a, this.b.convert(t), this.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c<T> extends e<Map<String, T>> {
        private final Converter<T, String> a;
        private final boolean b;

        @Override // retrofit2.e
        /* bridge */ /* synthetic */ void a(retrofit2.g gVar, Object obj) {
            a(gVar, (Map) ((Map) obj));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Converter<T, String> converter, boolean z) {
            this.a = converter;
            this.b = z;
        }

        void a(retrofit2.g gVar, Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Field map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Field map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Field map contained null value for key '" + key + "'.");
                }
                gVar.c(key, this.a.convert(value), this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f<T> extends e<T> {
        private final Headers a;
        private final Converter<T, RequestBody> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public f(Headers headers, Converter<T, RequestBody> converter) {
            this.a = headers;
            this.b = converter;
        }

        @Override // retrofit2.e
        void a(retrofit2.g gVar, T t) {
            if (t != null) {
                try {
                    gVar.a(this.a, this.b.convert(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends e<MultipartBody.Part> {
        static final l a = new l();

        private l() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.e
        public void a(retrofit2.g gVar, MultipartBody.Part part) {
            if (part != null) {
                gVar.a(part);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g<T> extends e<Map<String, T>> {
        private final Converter<T, RequestBody> a;
        private final String b;

        @Override // retrofit2.e
        /* bridge */ /* synthetic */ void a(retrofit2.g gVar, Object obj) {
            a(gVar, (Map) ((Map) obj));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public g(Converter<T, RequestBody> converter, String str) {
            this.a = converter;
            this.b = str;
        }

        void a(retrofit2.g gVar, Map<String, T> map) {
            if (map == null) {
                throw new IllegalArgumentException("Part map was null.");
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw new IllegalArgumentException("Part map contained null key.");
                }
                T value = entry.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Part map contained null value for key '" + key + "'.");
                }
                gVar.a(Headers.of(DownloadUtils.CONTENT_DISPOSITION, "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.b), this.a.convert(value));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> extends e<T> {
        private final Converter<T, RequestBody> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Converter<T, RequestBody> converter) {
            this.a = converter;
        }

        @Override // retrofit2.e
        void a(retrofit2.g gVar, T t) {
            if (t == null) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
            try {
                gVar.a(this.a.convert(t));
            } catch (IOException e) {
                throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
            }
        }
    }
}
