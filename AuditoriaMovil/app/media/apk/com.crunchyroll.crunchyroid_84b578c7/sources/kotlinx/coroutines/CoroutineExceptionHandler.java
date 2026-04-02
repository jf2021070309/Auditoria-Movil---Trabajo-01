package kotlinx.coroutines;

import com.amazon.aps.iva.ob0.g;
import kotlin.Metadata;
/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lcom/amazon/aps/iva/ob0/g$b;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public interface CoroutineExceptionHandler extends g.b {

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes4.dex */
    public static final class a implements g.c<CoroutineExceptionHandler> {
        public static final /* synthetic */ a b = new a();
    }

    void handleException(g gVar, Throwable th);
}
