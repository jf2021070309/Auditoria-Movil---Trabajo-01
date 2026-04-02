package okhttp3;

import java.io.IOException;
import javax.annotation.Nullable;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public interface Authenticator {
    public static final Authenticator NONE = new Authenticator() { // from class: okhttp3.Authenticator.1
        @Override // okhttp3.Authenticator
        public Request authenticate(Route route, Response response) {
            return null;
        }
    };

    @Nullable
    Request authenticate(Route route, Response response) throws IOException;
}
