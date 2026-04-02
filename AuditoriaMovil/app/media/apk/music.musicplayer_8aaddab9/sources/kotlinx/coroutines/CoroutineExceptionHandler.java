package kotlinx.coroutines;

import h.m.f;
/* loaded from: classes2.dex */
public interface CoroutineExceptionHandler extends f.a {
    public static final /* synthetic */ int S = 0;

    /* loaded from: classes2.dex */
    public static final class a implements f.b<CoroutineExceptionHandler> {
        public static final /* synthetic */ a a = new a();
    }

    void handleException(f fVar, Throwable th);
}
