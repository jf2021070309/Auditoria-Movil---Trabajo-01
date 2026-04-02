package retrofit2;

import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* loaded from: classes4.dex */
public final class Response<T> {
    private final okhttp3.Response a;
    private final T b;
    private final ResponseBody c;

    public static <T> Response<T> success(T t) {
        return success(t, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> Response<T> success(T t, Headers headers) {
        if (headers == null) {
            throw new NullPointerException("headers == null");
        }
        return success(t, new Response.Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> Response<T> success(T t, okhttp3.Response response) {
        if (response == null) {
            throw new NullPointerException("rawResponse == null");
        }
        if (!response.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        return new Response<>(response, t, null);
    }

    public static <T> Response<T> error(int i, ResponseBody responseBody) {
        if (i < 400) {
            throw new IllegalArgumentException("code < 400: " + i);
        }
        return error(responseBody, new Response.Builder().code(i).protocol(Protocol.HTTP_1_1).request(new Request.Builder().url("http://localhost/").build()).build());
    }

    public static <T> Response<T> error(ResponseBody responseBody, okhttp3.Response response) {
        if (responseBody == null) {
            throw new NullPointerException("body == null");
        }
        if (response == null) {
            throw new NullPointerException("rawResponse == null");
        }
        if (response.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new Response<>(response, null, responseBody);
    }

    private Response(okhttp3.Response response, T t, ResponseBody responseBody) {
        this.a = response;
        this.b = t;
        this.c = responseBody;
    }

    public okhttp3.Response raw() {
        return this.a;
    }

    public int code() {
        return this.a.code();
    }

    public String message() {
        return this.a.message();
    }

    public Headers headers() {
        return this.a.headers();
    }

    public boolean isSuccessful() {
        return this.a.isSuccessful();
    }

    public T body() {
        return this.b;
    }

    public ResponseBody errorBody() {
        return this.c;
    }

    public String toString() {
        return this.a.toString();
    }
}
