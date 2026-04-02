package c.b.i;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import c.i.k.g;
/* loaded from: classes.dex */
public class t implements c.i.k.m0.d {
    public final /* synthetic */ View a;

    public t(View view) {
        this.a = view;
    }

    public boolean a(c.i.k.m0.e eVar, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                eVar.a.b();
                InputContentInfo inputContentInfo = (InputContentInfo) eVar.a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e2) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ClipData clipData = new ClipData(eVar.a.getDescription(), new ClipData.Item(eVar.a.a()));
        g.b aVar = Build.VERSION.SDK_INT >= 31 ? new g.a(clipData, 2) : new g.c(clipData, 2);
        aVar.a(eVar.a.c());
        aVar.setExtras(bundle);
        return c.i.k.d0.u(this.a, aVar.build()) == null;
    }
}
