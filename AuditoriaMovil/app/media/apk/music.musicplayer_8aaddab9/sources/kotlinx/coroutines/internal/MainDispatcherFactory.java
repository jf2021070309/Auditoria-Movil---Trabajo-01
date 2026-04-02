package kotlinx.coroutines.internal;

import i.a.p1;
import java.util.List;
/* loaded from: classes2.dex */
public interface MainDispatcherFactory {
    p1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
