package com.kwad.framework.filedownloader;

import android.os.Handler;
import android.util.SparseArray;
import java.util.List;
/* loaded from: classes.dex */
final class ab implements w {
    private final SparseArray<Handler> abQ = new SparseArray<>();

    private static void a(Handler handler) {
        handler.sendEmptyMessage(2);
    }

    private static void b(Handler handler) {
        handler.sendEmptyMessage(3);
    }

    @Override // com.kwad.framework.filedownloader.w
    public final boolean bc(int i) {
        return this.abQ.get(i) != null;
    }

    @Override // com.kwad.framework.filedownloader.w
    public final void m(List<Integer> list) {
        for (Integer num : list) {
            b(this.abQ.get(num.intValue()));
        }
    }

    @Override // com.kwad.framework.filedownloader.w
    public final void uf() {
        for (int i = 0; i < this.abQ.size(); i++) {
            a(this.abQ.get(this.abQ.keyAt(i)));
        }
    }

    @Override // com.kwad.framework.filedownloader.w
    public final int ug() {
        return this.abQ.size();
    }
}
