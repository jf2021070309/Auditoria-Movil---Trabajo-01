package com.amazon.aps.iva.q;

import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.metrics.types.MetricEvent;
import com.amazon.aps.iva.metrics.types.Severity;
import com.amazon.aps.iva.util.LogUtils;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import com.ellation.widgets.input.datainputbutton.DataInputButton;
import java.io.File;
import java.util.Set;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((Toolbar) obj).invalidateMenu();
                return;
            case 1:
                ((Fragment) obj).lambda$performCreateView$0();
                return;
            case 2:
                Set<Integer> set = com.amazon.aps.iva.h6.o.Z;
                ((com.amazon.aps.iva.h6.o) obj).D();
                return;
            case 3:
                com.amazon.aps.iva.wa.b bVar = (com.amazon.aps.iva.wa.b) obj;
                bVar.getClass();
                try {
                    if (bVar.a != null) {
                        bVar.b.setVisibility(8);
                        bVar.a.setVisibility(8);
                        bVar.a.clearFocus();
                        return;
                    }
                    return;
                } catch (RuntimeException e) {
                    LogUtils.e("a", String.format("Unexpected exception in getHideAdOverlayRunnable: %s", e));
                    bVar.i.a(new MetricEvent("apsIva-runnableException", Severity.ERROR));
                    return;
                }
            case 4:
                com.amazon.aps.iva.br.a aVar = (com.amazon.aps.iva.br.a) obj;
                int i3 = com.amazon.aps.iva.br.a.r;
                com.amazon.aps.iva.yb0.j.f(aVar, "this$0");
                File file = aVar.l;
                try {
                    if (com.amazon.aps.iva.tp.b.b(file)) {
                        try {
                            File[] fileArr = (File[]) com.amazon.aps.iva.tp.b.f(file, null, com.amazon.aps.iva.tp.g.h);
                            if (fileArr != null) {
                                int length = fileArr.length;
                                while (i < length) {
                                    File file2 = fileArr[i];
                                    i++;
                                    String name = file2.getName();
                                    if (name != null) {
                                        int hashCode = name.hashCode();
                                        com.amazon.aps.iva.tp.l lVar = aVar.i;
                                        switch (hashCode) {
                                            case -528983909:
                                                if (!name.equals("network_information")) {
                                                    break;
                                                } else {
                                                    aVar.p = com.amazon.aps.iva.br.a.d(file2, lVar);
                                                    continue;
                                                }
                                            case 75377097:
                                                if (!name.equals("last_view_event")) {
                                                    break;
                                                } else {
                                                    aVar.m = com.amazon.aps.iva.br.a.d(file2, lVar);
                                                    continue;
                                                }
                                            case 408381112:
                                                if (!name.equals("user_information")) {
                                                    break;
                                                } else {
                                                    aVar.n = com.amazon.aps.iva.br.a.d(file2, lVar);
                                                    continue;
                                                }
                                            case 1847397036:
                                                if (!name.equals("crash_log")) {
                                                    break;
                                                } else {
                                                    aVar.o = com.amazon.aps.iva.tp.b.e(file2);
                                                    continue;
                                                }
                                        }
                                    }
                                }
                            }
                        } catch (SecurityException e2) {
                            com.amazon.aps.iva.e4.l1.z(aVar.g, "Error while trying to read the NDK crash directory", e2, 4);
                        }
                        return;
                    }
                    return;
                } finally {
                    aVar.b();
                }
            case 5:
                com.amazon.aps.iva.xx.f fVar = (com.amazon.aps.iva.xx.f) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.xx.f.d;
                com.amazon.aps.iva.yb0.j.f(fVar, "this$0");
                ((RecyclerView) fVar.c.getValue(fVar, com.amazon.aps.iva.xx.f.d[0])).scrollToPosition(fVar.b.get(fVar.getBindingAdapterPosition()));
                return;
            case 6:
                EditText editText = (EditText) obj;
                com.amazon.aps.iva.yb0.j.f(editText, "$it");
                editText.clearFocus();
                return;
            case 7:
                AnimationUtil.fadeIn$lambda$1((com.amazon.aps.iva.xb0.a) obj);
                return;
            case 8:
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = DataInputButton.h;
                ((TextView) obj).setVisibility(8);
                return;
            default:
                ((WebView) obj).destroy();
                return;
        }
    }
}
