package retrofit2;

import com.flurry.android.Constants;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class g {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String b;
    private final HttpUrl c;
    private String d;
    private HttpUrl.Builder e;
    private final Request.Builder f = new Request.Builder();
    private MediaType g;
    private final boolean h;
    private MultipartBody.Builder i;
    private FormBody.Builder j;
    private RequestBody k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.b = str;
        this.c = httpUrl;
        this.d = str2;
        this.g = mediaType;
        this.h = z;
        if (headers != null) {
            this.f.headers(headers);
        }
        if (z2) {
            this.j = new FormBody.Builder();
        } else if (z3) {
            this.i = new MultipartBody.Builder();
            this.i.setType(MultipartBody.FORM);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("@Url parameter is null.");
        }
        this.d = obj.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        if (DownloadUtils.CONTENT_TYPE.equalsIgnoreCase(str)) {
            MediaType parse = MediaType.parse(str2);
            if (parse == null) {
                throw new IllegalArgumentException("Malformed content type: " + str2);
            }
            this.g = parse;
            return;
        }
        this.f.addHeader(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z) {
        if (this.d == null) {
            throw new AssertionError();
        }
        this.d = this.d.replace("{" + str + "}", a(str2, z));
    }

    private static String a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 32 && codePointAt < 127 && " \"<>^`{}|\\?#".indexOf(codePointAt) == -1 && (z || (codePointAt != 47 && codePointAt != 37))) {
                i += Character.charCount(codePointAt);
            } else {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i);
                a(buffer, str, i, length, z);
                return buffer.readUtf8();
            }
        }
        return str;
    }

    private static void a(Buffer buffer, String str, int i, int i2, boolean z) {
        Buffer buffer2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(codePointAt);
                    while (!buffer2.exhausted()) {
                        int readByte = buffer2.readByte() & Constants.UNKNOWN;
                        buffer.writeByte(37);
                        buffer.writeByte((int) a[(readByte >> 4) & 15]);
                        buffer.writeByte((int) a[readByte & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str, String str2, boolean z) {
        if (this.d != null) {
            this.e = this.c.newBuilder(this.d);
            if (this.e == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.c + ", Relative: " + this.d);
            }
            this.d = null;
        }
        if (z) {
            this.e.addEncodedQueryParameter(str, str2);
        } else {
            this.e.addQueryParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(String str, String str2, boolean z) {
        if (z) {
            this.j.addEncoded(str, str2);
        } else {
            this.j.add(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Headers headers, RequestBody requestBody) {
        this.i.addPart(headers, requestBody);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MultipartBody.Part part) {
        this.i.addPart(part);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RequestBody requestBody) {
        this.k = requestBody;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Request a() {
        HttpUrl resolve;
        HttpUrl.Builder builder = this.e;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = this.c.resolve(this.d);
            if (resolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.c + ", Relative: " + this.d);
            }
        }
        a aVar = this.k;
        if (aVar == null) {
            if (this.j != null) {
                aVar = this.j.build();
            } else if (this.i != null) {
                aVar = this.i.build();
            } else if (this.h) {
                aVar = RequestBody.create((MediaType) null, new byte[0]);
            }
        }
        MediaType mediaType = this.g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.f.addHeader(DownloadUtils.CONTENT_TYPE, mediaType.toString());
            }
        }
        return this.f.url(resolve).method(this.b, aVar).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class a extends RequestBody {
        private final RequestBody a;
        private final MediaType b;

        a(RequestBody requestBody, MediaType mediaType) {
            this.a = requestBody;
            this.b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return this.b;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.a.contentLength();
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) {
            this.a.writeTo(bufferedSink);
        }
    }
}
