package e.d.b.d.a0;

import android.os.Build;
import android.view.View;
import android.widget.TextView;
import c.i.k.k0.b;
import com.google.android.material.timepicker.ClockFaceView;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class b extends c.i.k.e {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f6312d;

    public b(ClockFaceView clockFaceView) {
        this.f6312d = clockFaceView;
    }

    @Override // c.i.k.e
    public void d(View view, c.i.k.k0.b bVar) {
        this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            TextView textView = this.f6312d.A.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                bVar.f2193b.setTraversalAfter(textView);
            }
        }
        bVar.j(b.c.a(0, 1, intValue, 1, false, view.isSelected()));
    }
}
