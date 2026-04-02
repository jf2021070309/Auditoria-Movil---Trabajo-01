package com.amazon.aps.iva.r4;

import android.os.Build;
import android.widget.RemoteViews;
import com.amazon.aps.iva.b5.c;
/* compiled from: ApplyModifiers.kt */
/* loaded from: classes.dex */
public final class c {
    public static final c a = new c();

    public final void a(RemoteViews remoteViews, int i, com.amazon.aps.iva.b5.c cVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        com.amazon.aps.iva.yb0.j.f(cVar, "radius");
        if (Build.VERSION.SDK_INT >= 31) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            remoteViews.setBoolean(i, "setClipToOutline", true);
            if (cVar instanceof c.a) {
                remoteViews.setViewOutlinePreferredRadius(i, ((c.a) cVar).a, 1);
                return;
            } else if (cVar instanceof c.d) {
                c.d dVar = (c.d) cVar;
                remoteViews.setViewOutlinePreferredRadiusDimen(i, 0);
                return;
            } else {
                throw new IllegalStateException(("Rounded corners should not be " + cVar.getClass().getCanonicalName()).toString());
            }
        }
        throw new IllegalArgumentException(("setClipToOutline is only available on SDK 31 and higher").toString());
    }

    public final void b(RemoteViews remoteViews, int i, com.amazon.aps.iva.b5.c cVar) {
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        com.amazon.aps.iva.yb0.j.f(cVar, "height");
        if (cVar instanceof c.e) {
            remoteViews.setViewLayoutHeight(i, -2.0f, 0);
        } else if (cVar instanceof c.b) {
            remoteViews.setViewLayoutHeight(i, 0.0f, 0);
        } else if (cVar instanceof c.a) {
            remoteViews.setViewLayoutHeight(i, ((c.a) cVar).a, 1);
        } else if (cVar instanceof c.d) {
            c.d dVar = (c.d) cVar;
            remoteViews.setViewLayoutHeightDimen(i, 0);
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, c.C0130c.a)) {
            remoteViews.setViewLayoutHeight(i, -1.0f, 0);
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
    }

    public final void c(RemoteViews remoteViews, int i, com.amazon.aps.iva.b5.c cVar) {
        com.amazon.aps.iva.yb0.j.f(remoteViews, "rv");
        com.amazon.aps.iva.yb0.j.f(cVar, "width");
        if (cVar instanceof c.e) {
            remoteViews.setViewLayoutWidth(i, -2.0f, 0);
        } else if (cVar instanceof c.b) {
            remoteViews.setViewLayoutWidth(i, 0.0f, 0);
        } else if (cVar instanceof c.a) {
            remoteViews.setViewLayoutWidth(i, ((c.a) cVar).a, 1);
        } else if (cVar instanceof c.d) {
            c.d dVar = (c.d) cVar;
            remoteViews.setViewLayoutWidthDimen(i, 0);
        } else if (com.amazon.aps.iva.yb0.j.a(cVar, c.C0130c.a)) {
            remoteViews.setViewLayoutWidth(i, -1.0f, 0);
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
    }
}
