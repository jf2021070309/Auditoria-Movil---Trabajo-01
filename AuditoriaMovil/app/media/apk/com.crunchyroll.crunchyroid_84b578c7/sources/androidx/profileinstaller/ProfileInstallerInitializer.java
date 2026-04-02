package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.amazon.aps.iva.c6.f;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements com.amazon.aps.iva.w8.b<c> {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.amazon.aps.iva.m8.e
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Handler a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    @Override // com.amazon.aps.iva.w8.b
    public final c a(Context context) {
        a.a(new f(5, this, context.getApplicationContext()));
        return new c();
    }

    @Override // com.amazon.aps.iva.w8.b
    public final List<Class<? extends com.amazon.aps.iva.w8.b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
