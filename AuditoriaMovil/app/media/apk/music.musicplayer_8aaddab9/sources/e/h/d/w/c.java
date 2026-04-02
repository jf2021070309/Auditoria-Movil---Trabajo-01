package e.h.d.w;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class c<T> {
    public MediaBrowserService.Result a;

    public c(MediaBrowserService.Result result) {
        this.a = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(T t) {
        T t2;
        if (!(t instanceof List)) {
            if (t instanceof Parcel) {
                this.a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel((Parcel) t));
                return;
            }
            return;
        }
        MediaBrowserService.Result result = this.a;
        List<Parcel> list = (List) t;
        if (list == null) {
            t2 = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            t2 = arrayList;
        }
        result.sendResult(t2);
    }
}
