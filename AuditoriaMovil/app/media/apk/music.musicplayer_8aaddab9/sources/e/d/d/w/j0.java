package e.d.d.w;

import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public class j0 {
    public final Executor a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, Task<String>> f7679b = new c.f.a();

    public j0(Executor executor) {
        this.a = executor;
    }
}
