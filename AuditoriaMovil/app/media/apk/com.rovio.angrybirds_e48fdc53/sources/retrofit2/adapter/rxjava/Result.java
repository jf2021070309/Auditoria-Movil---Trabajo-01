package retrofit2.adapter.rxjava;

import retrofit2.Response;
/* loaded from: classes4.dex */
public final class Result<T> {
    private final Response<T> a;
    private final Throwable b;

    public static <T> Result<T> error(Throwable th) {
        if (th == null) {
            throw new NullPointerException("error == null");
        }
        return new Result<>(null, th);
    }

    public static <T> Result<T> response(Response<T> response) {
        if (response == null) {
            throw new NullPointerException("response == null");
        }
        return new Result<>(response, null);
    }

    private Result(Response<T> response, Throwable th) {
        this.a = response;
        this.b = th;
    }

    public Response<T> response() {
        return this.a;
    }

    public Throwable error() {
        return this.b;
    }

    public boolean isError() {
        return this.b != null;
    }

    public String toString() {
        return this.b != null ? "Result{isError=true, error=\"" + this.b + "\"}" : "Result{isError=false, response=" + this.a + '}';
    }
}
