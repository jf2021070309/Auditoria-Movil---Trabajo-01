package okhttp3;

import java.io.IOException;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public interface Callback {
    void onFailure(Call call, IOException iOException);

    void onResponse(Call call, Response response) throws IOException;
}
