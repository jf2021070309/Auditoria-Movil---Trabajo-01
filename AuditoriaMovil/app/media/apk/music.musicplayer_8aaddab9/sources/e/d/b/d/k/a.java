package e.d.b.d.k;

import android.annotation.TargetApi;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.material.chip.Chip;
/* loaded from: classes2.dex */
public class a extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public a(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public void getOutline(View view, Outline outline) {
        b bVar = this.a.f4609g;
        if (bVar != null) {
            bVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
