package okhttp3.internal.http;

import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public final class RealResponseBody extends ResponseBody {
    private final Headers headers;
    private final BufferedSource source;

    public RealResponseBody(Headers headers, BufferedSource source) {
        this.headers = headers;
        this.source = source;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String contentType = this.headers.get(DownloadUtils.CONTENT_TYPE);
        if (contentType != null) {
            return MediaType.parse(contentType);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return HttpHeaders.contentLength(this.headers);
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        return this.source;
    }
}
