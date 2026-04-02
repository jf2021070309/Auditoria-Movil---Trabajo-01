package com.ellation.crunchyroll.ui.labels;

import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.o0.j;
import com.amazon.aps.iva.o0.j2;
import kotlin.Metadata;
/* compiled from: DurationLabel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"", "durationText", "Lcom/amazon/aps/iva/a1/f;", "modifier", "Lcom/amazon/aps/iva/kb0/q;", "DurationLabel", "(Ljava/lang/String;Lcom/amazon/aps/iva/a1/f;Lcom/amazon/aps/iva/o0/i;II)V", "WatchedPreview", "(Lcom/amazon/aps/iva/o0/i;I)V", "TimeLeftPreview", "widgets_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DurationLabelKt {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DurationLabel(java.lang.String r30, com.amazon.aps.iva.a1.f r31, com.amazon.aps.iva.o0.i r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.crunchyroll.ui.labels.DurationLabelKt.DurationLabel(java.lang.String, com.amazon.aps.iva.a1.f, com.amazon.aps.iva.o0.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimeLeftPreview(i iVar, int i) {
        j g = iVar.g(-1126993407);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            DurationLabel("10m", null, g, 6, 2);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new DurationLabelKt$TimeLeftPreview$1(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WatchedPreview(i iVar, int i) {
        j g = iVar.g(-1725720929);
        if (i == 0 && g.h()) {
            g.A();
        } else {
            e0.b bVar = e0.a;
            DurationLabel(null, null, g, 6, 2);
        }
        j2 X = g.X();
        if (X != null) {
            X.d = new DurationLabelKt$WatchedPreview$1(i);
        }
    }
}
