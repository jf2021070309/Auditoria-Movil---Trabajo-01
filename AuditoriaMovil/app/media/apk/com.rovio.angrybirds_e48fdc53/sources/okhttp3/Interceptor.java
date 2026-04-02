package okhttp3;

import java.io.IOException;
import javax.annotation.Nullable;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public interface Interceptor {

    /* JADX WARN: Classes with same name are omitted:
      classes4.dex
     */
    /* loaded from: classes3.dex */
    public interface Chain {
        @Nullable
        Connection connection();

        Response proceed(Request request) throws IOException;

        Request request();
    }

    Response intercept(Chain chain) throws IOException;
}
