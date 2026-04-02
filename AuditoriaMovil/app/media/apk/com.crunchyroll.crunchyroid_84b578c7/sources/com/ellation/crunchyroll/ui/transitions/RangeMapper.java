package com.ellation.crunchyroll.ui.transitions;

import com.amazon.aps.iva.e4.t0;
import kotlin.Metadata;
/* compiled from: FadeTransition.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/ui/transitions/RangeMapper;", "", "inStart", "", "inEnd", "outStart", "outEnd", "(FFFF)V", "convert", "input", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RangeMapper {
    private final float inEnd;
    private final float inStart;
    private final float outEnd;
    private final float outStart;

    public RangeMapper(float f, float f2, float f3, float f4) {
        this.inStart = f;
        this.inEnd = f2;
        this.outStart = f3;
        this.outEnd = f4;
    }

    public final float convert(float f) {
        float f2 = this.outStart;
        float f3 = this.inEnd;
        float f4 = this.inStart;
        return t0.a(f, f4, (this.outEnd - f2) / (f3 - f4), f2);
    }
}
