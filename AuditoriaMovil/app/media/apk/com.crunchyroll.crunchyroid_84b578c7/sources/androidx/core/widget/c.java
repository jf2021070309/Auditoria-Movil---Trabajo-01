package androidx.core.widget;

import android.os.Parcel;
import androidx.core.widget.RemoteViewsCompatService;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: RemoteViewsCompatService.kt */
/* loaded from: classes.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<Parcel, RemoteViewsCompatService.a> {
    public static final c h = new c();

    public c() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final RemoteViewsCompatService.a invoke(Parcel parcel) {
        Parcel parcel2 = parcel;
        j.f(parcel2, "it");
        return new RemoteViewsCompatService.a(parcel2);
    }
}
