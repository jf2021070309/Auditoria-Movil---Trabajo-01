package e.h.d;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import e.h.d.e0;
/* loaded from: classes2.dex */
public class d0 extends e0.h<MediaBrowserCompat.MediaItem> {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ResultReceiver f8097e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, Object obj, ResultReceiver resultReceiver) {
        super(obj);
        this.f8097e = resultReceiver;
    }

    @Override // e.h.d.e0.h
    public void b(MediaBrowserCompat.MediaItem mediaItem, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_item", mediaItem);
        b.a.b.b.a aVar = this.f8097e.a;
        if (aVar != null) {
            try {
                aVar.P0(0, bundle);
            } catch (RemoteException unused) {
            }
        }
    }
}
