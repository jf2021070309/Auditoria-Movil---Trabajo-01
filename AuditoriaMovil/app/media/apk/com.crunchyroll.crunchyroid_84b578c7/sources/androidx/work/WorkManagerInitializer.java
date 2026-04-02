package androidx.work;

import android.content.Context;
import androidx.work.a;
import com.amazon.aps.iva.k9.m;
import com.amazon.aps.iva.k9.u;
import com.amazon.aps.iva.l9.k;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements com.amazon.aps.iva.w8.b<u> {
    static {
        m.e("WrkMgrInitializer");
    }

    @Override // com.amazon.aps.iva.w8.b
    public final u a(Context context) {
        m.c().a(new Throwable[0]);
        k.d(context, new a(new a.C0061a()));
        return k.c(context);
    }

    @Override // com.amazon.aps.iva.w8.b
    public final List<Class<? extends com.amazon.aps.iva.w8.b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
