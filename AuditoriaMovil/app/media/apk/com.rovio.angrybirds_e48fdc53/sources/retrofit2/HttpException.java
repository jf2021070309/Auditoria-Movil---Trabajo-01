package retrofit2;
/* loaded from: classes4.dex */
public class HttpException extends Exception {
    private final int a;
    private final String b;
    private final transient Response<?> c;

    private static String a(Response<?> response) {
        if (response == null) {
            throw new NullPointerException("response == null");
        }
        return "HTTP " + response.code() + " " + response.message();
    }

    public HttpException(Response<?> response) {
        super(a(response));
        this.a = response.code();
        this.b = response.message();
        this.c = response;
    }

    public int code() {
        return this.a;
    }

    public String message() {
        return this.b;
    }

    public Response<?> response() {
        return this.c;
    }
}
