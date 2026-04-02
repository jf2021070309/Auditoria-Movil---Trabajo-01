package okhttp3.internal.http;

import kotlin.Metadata;
import okhttp3.Interceptor;
/* compiled from: CallServerInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int i) {
        boolean z;
        if (i == 100) {
            return true;
        }
        if (102 <= i && i < 200) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[Catch: IOException -> 0x019b, TryCatch #1 {IOException -> 0x019b, blocks: (B:39:0x00aa, B:41:0x00b3, B:42:0x00b7, B:44:0x00e1, B:46:0x00ea, B:47:0x00ed, B:48:0x0111, B:52:0x011c, B:54:0x013b, B:56:0x0149, B:63:0x015f, B:65:0x0165, B:69:0x0172, B:71:0x0187, B:72:0x018f, B:73:0x0199, B:58:0x0154, B:53:0x012b), top: B:84:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165 A[Catch: IOException -> 0x019b, TryCatch #1 {IOException -> 0x019b, blocks: (B:39:0x00aa, B:41:0x00b3, B:42:0x00b7, B:44:0x00e1, B:46:0x00ea, B:47:0x00ed, B:48:0x0111, B:52:0x011c, B:54:0x013b, B:56:0x0149, B:63:0x015f, B:65:0x0165, B:69:0x0172, B:71:0x0187, B:72:0x018f, B:73:0x0199, B:58:0x0154, B:53:0x012b), top: B:84:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172 A[Catch: IOException -> 0x019b, TryCatch #1 {IOException -> 0x019b, blocks: (B:39:0x00aa, B:41:0x00b3, B:42:0x00b7, B:44:0x00e1, B:46:0x00ea, B:47:0x00ed, B:48:0x0111, B:52:0x011c, B:54:0x013b, B:56:0x0149, B:63:0x015f, B:65:0x0165, B:69:0x0172, B:71:0x0187, B:72:0x018f, B:73:0x0199, B:58:0x0154, B:53:0x012b), top: B:84:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.CallServerInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
