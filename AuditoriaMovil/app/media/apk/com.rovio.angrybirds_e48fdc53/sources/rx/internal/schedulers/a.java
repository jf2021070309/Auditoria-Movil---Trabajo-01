package rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import rx.functions.Func0;
import rx.internal.util.RxThreadFactory;
import rx.plugins.RxJavaHooks;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public enum a {
    ;
    
    static final RxThreadFactory a = new RxThreadFactory("RxScheduledExecutorPool-");

    static ThreadFactory a() {
        return a;
    }

    public static ScheduledExecutorService b() {
        Func0<? extends ScheduledExecutorService> onGenericScheduledExecutorService = RxJavaHooks.getOnGenericScheduledExecutorService();
        return onGenericScheduledExecutorService == null ? c() : onGenericScheduledExecutorService.call();
    }

    static ScheduledExecutorService c() {
        return Executors.newScheduledThreadPool(1, a());
    }
}
