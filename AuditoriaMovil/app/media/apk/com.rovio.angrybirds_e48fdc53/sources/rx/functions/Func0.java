package rx.functions;

import java.util.concurrent.Callable;
/* loaded from: classes4.dex */
public interface Func0<R> extends Callable<R>, Function {
    @Override // java.util.concurrent.Callable
    R call();
}
