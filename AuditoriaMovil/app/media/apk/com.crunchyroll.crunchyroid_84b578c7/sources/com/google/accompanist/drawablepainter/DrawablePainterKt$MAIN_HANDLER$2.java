package com.google.accompanist.drawablepainter;

import android.os.Handler;
import android.os.Looper;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.l;
import kotlin.Metadata;
/* compiled from: DrawablePainter.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class DrawablePainterKt$MAIN_HANDLER$2 extends l implements a<Handler> {
    public static final DrawablePainterKt$MAIN_HANDLER$2 INSTANCE = new DrawablePainterKt$MAIN_HANDLER$2();

    public DrawablePainterKt$MAIN_HANDLER$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.aps.iva.xb0.a
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
