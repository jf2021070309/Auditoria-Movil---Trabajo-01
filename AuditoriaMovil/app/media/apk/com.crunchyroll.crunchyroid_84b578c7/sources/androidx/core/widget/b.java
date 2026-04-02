package androidx.core.widget;

import android.os.Parcel;
import com.amazon.aps.iva.t3.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: RemoteViewsCompatService.kt */
/* loaded from: classes.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<Parcel, j.c> {
    public static final b h = new b();

    public b() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final j.c invoke(Parcel parcel) {
        Parcel parcel2 = parcel;
        com.amazon.aps.iva.yb0.j.f(parcel2, "it");
        return new j.c(parcel2);
    }
}
