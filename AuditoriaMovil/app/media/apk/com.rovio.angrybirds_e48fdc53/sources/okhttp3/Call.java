package okhttp3;

import java.io.IOException;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public interface Call extends Cloneable {

    /* JADX WARN: Classes with same name are omitted:
      classes4.dex
     */
    /* loaded from: classes3.dex */
    public interface Factory {
        Call newCall(Request request);
    }

    void cancel();

    /* renamed from: clone */
    Call mo23clone();

    void enqueue(Callback callback);

    Response execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    Request request();
}
