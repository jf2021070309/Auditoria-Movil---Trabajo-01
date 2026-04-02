package e.a.c;

import android.app.Activity;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;
import com.android.music.DeleteItems;
import e.h.b.o;
import e.h.g.j0;
import java.util.HashSet;
import music.musicplayer.R;
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements j0.b {
    public final /* synthetic */ Activity a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long[] f5074b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o.a f5075c;

    public /* synthetic */ h0(Activity activity, long[] jArr, o.a aVar) {
        this.a = activity;
        this.f5074b = jArr;
        this.f5075c = aVar;
    }

    @Override // e.h.g.j0.b
    public final void a() {
        Activity activity = this.a;
        final long[] jArr = this.f5074b;
        final o.a aVar = this.f5075c;
        int i2 = DeleteItems.a;
        Uri uri = z6.a;
        HashSet hashSet = new HashSet(jArr.length);
        for (long j2 : jArr) {
            hashSet.add(ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, Long.valueOf(j2).longValue()));
        }
        o.a aVar2 = new o.a() { // from class: e.a.c.t3
            @Override // e.h.b.o.a
            public final void a(boolean z) {
                final long[] jArr2 = jArr;
                o.a aVar3 = aVar;
                if (z) {
                    e.h.g.j0.g(new j0.b() { // from class: e.a.c.f4
                        @Override // e.h.g.j0.b
                        public final void a() {
                            long[] jArr3 = jArr2;
                            e.h.b.n.f(jArr3);
                            z6.Z(e.h.g.q1.c(R.plurals.nnntracksdeleted, jArr3.length), 0);
                        }
                    });
                }
                if (aVar3 != null) {
                    aVar3.a(z);
                }
            }
        };
        o.b bVar = e.h.b.o.a;
        e.h.g.j0.d(new e.h.b.k(activity, hashSet, aVar2));
    }
}
