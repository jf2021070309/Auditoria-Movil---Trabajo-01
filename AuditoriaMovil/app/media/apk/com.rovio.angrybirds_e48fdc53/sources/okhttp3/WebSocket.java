package okhttp3;

import javax.annotation.Nullable;
import okio.ByteString;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public interface WebSocket {

    /* JADX WARN: Classes with same name are omitted:
      classes4.dex
     */
    /* loaded from: classes3.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i, @Nullable String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(ByteString byteString);
}
