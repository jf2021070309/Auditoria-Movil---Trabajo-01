package e.d.b.e.a.c;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class c extends g0 implements d {
    public c() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // e.d.b.e.a.c.g0
    public final boolean s0(int i2, Parcel parcel) throws RemoteException {
        if (i2 == 2) {
            e.d.b.e.a.e.d dVar = (e.d.b.e.a.e.d) this;
            dVar.f7018c.f7019b.a();
            dVar.a.a(4, "onGetLaunchReviewFlowInfo", new Object[0]);
            dVar.f7017b.b(new com.google.android.play.core.review.a((PendingIntent) ((Bundle) h0.a(parcel, Bundle.CREATOR)).get("confirmation_intent")));
            return true;
        }
        return false;
    }
}
