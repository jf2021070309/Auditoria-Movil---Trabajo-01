package androidx.core.widget;

import android.os.Parcel;
import androidx.core.widget.RemoteViewsCompatService;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: RemoteViewsCompatService.kt */
/* loaded from: classes.dex */
public final class d extends l implements p<Parcel, Integer, q> {
    public final /* synthetic */ RemoteViewsCompatService.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RemoteViewsCompatService.a aVar) {
        super(2);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(Parcel parcel, Integer num) {
        Parcel parcel2 = parcel;
        num.intValue();
        j.f(parcel2, "parcel");
        RemoteViewsCompatService.a aVar = this.h;
        aVar.getClass();
        byte[] bArr = aVar.a;
        parcel2.writeInt(bArr.length);
        parcel2.writeByteArray(bArr);
        parcel2.writeString(aVar.b);
        parcel2.writeLong(aVar.c);
        return q.a;
    }
}
