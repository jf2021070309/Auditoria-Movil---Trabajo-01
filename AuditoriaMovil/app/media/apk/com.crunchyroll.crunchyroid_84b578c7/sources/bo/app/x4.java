package bo.app;

import com.braze.support.BrazeLogger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* loaded from: classes.dex */
public final class x4 implements com.amazon.aps.iva.se0.g0 {
    public static final x4 a = new x4();
    private static x0 b;
    private static final CoroutineExceptionHandler c;
    private static final com.amazon.aps.iva.se0.b1 d;
    private static final com.amazon.aps.iva.ob0.g e;

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.b = th;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Child job of SerialCoroutineScope got exception: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.ob0.a implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.a aVar) {
            super(aVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(com.amazon.aps.iva.ob0.g gVar, Throwable th) {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                x4 x4Var = x4.a;
                brazeLogger.brazelog(x4Var, BrazeLogger.Priority.E, th, new b(th));
                x0 b = x4Var.b();
                if (b != null) {
                    b.a(th, Throwable.class);
                }
            } catch (Exception unused) {
            }
        }
    }

    static {
        c cVar = new c(CoroutineExceptionHandler.a.b);
        c = cVar;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        com.amazon.aps.iva.yb0.j.e(newSingleThreadExecutor, "newSingleThreadExecutor()");
        com.amazon.aps.iva.se0.c1 c1Var = new com.amazon.aps.iva.se0.c1(newSingleThreadExecutor);
        d = c1Var;
        e = c1Var.plus(cVar).plus(com.amazon.aps.iva.se0.i.a());
    }

    private x4() {
    }

    public final void a(x0 x0Var) {
        b = x0Var;
    }

    public final x0 b() {
        return b;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return e;
    }
}
