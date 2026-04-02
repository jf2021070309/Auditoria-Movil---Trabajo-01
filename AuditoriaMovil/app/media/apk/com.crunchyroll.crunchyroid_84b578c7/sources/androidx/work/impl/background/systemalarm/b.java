package androidx.work.impl.background.systemalarm;

import android.content.Context;
import com.amazon.aps.iva.k9.m;
/* compiled from: ConstraintsCommandHandler.java */
/* loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ int d = 0;
    public final Context a;
    public final int b;
    public final com.amazon.aps.iva.p9.d c;

    static {
        m.e("ConstraintsCmdHandler");
    }

    public b(Context context, int i, d dVar) {
        this.a = context;
        this.b = i;
        this.c = new com.amazon.aps.iva.p9.d(context, dVar.c, null);
    }
}
