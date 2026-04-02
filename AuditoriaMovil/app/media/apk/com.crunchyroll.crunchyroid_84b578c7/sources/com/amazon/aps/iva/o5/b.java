package com.amazon.aps.iva.o5;

import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import com.amazon.aps.iva.c3.m;
import com.amazon.aps.iva.c3.w;
import com.amazon.aps.iva.c3.x;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class b extends w {
    public int[] a = null;
    public MediaSessionCompat.Token b;

    @Override // com.amazon.aps.iva.c3.w
    public final void apply(m mVar) {
        a.d(((x) mVar).b, a.b(a.a(), this.a, this.b));
    }

    @Override // com.amazon.aps.iva.c3.w
    public final RemoteViews makeBigContentView(m mVar) {
        return null;
    }

    @Override // com.amazon.aps.iva.c3.w
    public final RemoteViews makeContentView(m mVar) {
        return null;
    }
}
