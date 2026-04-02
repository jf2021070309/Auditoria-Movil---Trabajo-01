package e.h.d;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import e.h.d.e0;
import e.h.g.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class c0 extends e0.h<List<MediaBrowserCompat.MediaItem>> {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e0.b f8093e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f8094f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Bundle f8095g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e0 f8096h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, Object obj, e0.b bVar, String str, Bundle bundle) {
        super(obj);
        this.f8096h = e0Var;
        this.f8093e = bVar;
        this.f8094f = str;
        this.f8095g = bundle;
    }

    @Override // e.h.d.e0.h
    public void b(List<MediaBrowserCompat.MediaItem> list, int i2) {
        List<MediaBrowserCompat.MediaItem> list2 = list;
        if (this.f8096h.f8100n.get(((e0.k) this.f8093e.a).a()) != this.f8093e) {
            return;
        }
        if ((i2 & 1) != 0) {
            e0 e0Var = this.f8096h;
            Bundle bundle = this.f8095g;
            Objects.requireNonNull(e0Var);
            if (list2 == null) {
                list2 = null;
            } else {
                int i3 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i4 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i3 != -1 || i4 != -1) {
                    int i5 = i4 * i3;
                    int i6 = i5 + i4;
                    if (i3 < 0 || i4 < 1 || i5 >= list2.size()) {
                        list2 = Collections.EMPTY_LIST;
                    } else {
                        if (i6 > list2.size()) {
                            i6 = list2.size();
                        }
                        list2 = list2.subList(i5, i6);
                    }
                }
            }
        }
        try {
            e0.j jVar = this.f8093e.a;
            String str = this.f8094f;
            Bundle bundle2 = this.f8095g;
            e0.k kVar = (e0.k) jVar;
            Objects.requireNonNull(kVar);
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle2);
            if (list2 != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
            }
            kVar.c(3, bundle3);
        } catch (RemoteException unused) {
            StringBuilder y = e.a.d.a.a.y("Calling onLoadChildren() failed for id=");
            y.append(this.f8094f);
            y.append(" package=");
            y.append(this.f8093e.f8102b);
            s1.m(y.toString());
        }
    }
}
