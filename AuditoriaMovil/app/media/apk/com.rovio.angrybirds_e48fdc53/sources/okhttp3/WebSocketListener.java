package okhttp3;

import okio.ByteString;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public abstract class WebSocketListener {
    public void onOpen(WebSocket webSocket, Response response) {
    }

    public void onMessage(WebSocket webSocket, String text) {
    }

    public void onMessage(WebSocket webSocket, ByteString bytes) {
    }

    public void onClosing(WebSocket webSocket, int code, String reason) {
    }

    public void onClosed(WebSocket webSocket, int code, String reason) {
    }

    public void onFailure(WebSocket webSocket, Throwable t, Response response) {
    }
}
