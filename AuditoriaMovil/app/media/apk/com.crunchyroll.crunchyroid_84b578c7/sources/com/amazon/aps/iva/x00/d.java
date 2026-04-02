package com.amazon.aps.iva.x00;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.presentation.download.button.DownloadButton;
/* compiled from: DownloadButton.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ DownloadButton h;
    public final /* synthetic */ Canvas i;
    public final /* synthetic */ Paint j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Canvas canvas, Paint paint, DownloadButton downloadButton) {
        super(0);
        this.h = downloadButton;
        this.i = canvas;
        this.j = paint;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        int progress;
        DownloadButton downloadButton = this.h;
        float f = downloadButton.j;
        progress = downloadButton.getProgress();
        float f2 = f * progress * downloadButton.k;
        Canvas canvas = this.i;
        RectF rectF = downloadButton.g;
        if (rectF != null) {
            canvas.drawArc(rectF, downloadButton.h, f2, false, this.j);
            return q.a;
        }
        j.m("progressRect");
        throw null;
    }
}
