package androidx.work;

import android.net.Network;
import android.net.Uri;
import com.amazon.aps.iva.k9.h;
import com.amazon.aps.iva.k9.s;
import com.amazon.aps.iva.k9.w;
import com.amazon.aps.iva.k9.x;
import com.amazon.aps.iva.u9.p;
import com.amazon.aps.iva.u9.r;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final b b;
    public final HashSet c;
    public final a d;
    public final int e;
    public final Executor f;
    public final com.amazon.aps.iva.w9.a g;
    public final x h;
    public final s i;
    public final h j;

    /* loaded from: classes.dex */
    public static class a {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, b bVar, List list, a aVar, int i, ExecutorService executorService, com.amazon.aps.iva.w9.a aVar2, w wVar, r rVar, p pVar) {
        this.a = uuid;
        this.b = bVar;
        this.c = new HashSet(list);
        this.d = aVar;
        this.e = i;
        this.f = executorService;
        this.g = aVar2;
        this.h = wVar;
        this.i = rVar;
        this.j = pVar;
    }
}
