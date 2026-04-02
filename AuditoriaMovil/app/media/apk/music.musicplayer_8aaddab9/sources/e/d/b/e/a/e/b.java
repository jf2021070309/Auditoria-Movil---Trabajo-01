package e.d.b.e.a.e;

import android.os.IBinder;
import android.os.IInterface;
import e.d.b.e.a.c.k;
import e.d.b.e.a.c.q0;
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements k {
    public static final k a = new b();

    @Override // e.d.b.e.a.c.k
    public final Object a(IBinder iBinder) {
        int i2 = e.d.b.e.a.c.a.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof e.d.b.e.a.c.b ? (e.d.b.e.a.c.b) queryLocalInterface : new q0(iBinder);
    }
}
