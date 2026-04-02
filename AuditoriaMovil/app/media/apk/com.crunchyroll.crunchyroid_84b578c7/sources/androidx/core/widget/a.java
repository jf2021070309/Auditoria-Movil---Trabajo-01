package androidx.core.widget;

import android.os.Parcel;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.t3.j;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.i;
/* compiled from: RemoteViewsCompatService.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class a extends i implements p<Parcel, Integer, q> {
    public a(Object obj) {
        super(2, obj, j.c.class, "writeToParcel", "writeToParcel$core_remoteviews_release(Landroid/os/Parcel;I)V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(Parcel parcel, Integer num) {
        Parcel parcel2 = parcel;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(parcel2, "p0");
        j.c cVar = (j.c) this.receiver;
        cVar.getClass();
        long[] jArr = cVar.a;
        parcel2.writeInt(jArr.length);
        parcel2.writeLongArray(jArr);
        parcel2.writeTypedArray(cVar.b, intValue);
        parcel2.writeInt(cVar.c ? 1 : 0);
        parcel2.writeInt(cVar.d);
        return q.a;
    }
}
