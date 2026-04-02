package com.amazon.aps.iva.k20;

import android.graphics.Rect;
import android.view.View;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue.CancellationRescueActivity;
import com.ellation.crunchyroll.presentation.multitiersubscription.upsellv2.UpsellV2Activity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnScrollChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.amazon.aps.iva.i60.b b;

    public /* synthetic */ a(com.amazon.aps.iva.i60.b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        int i5 = this.a;
        com.amazon.aps.iva.i60.b bVar = this.b;
        switch (i5) {
            case 0:
                CancellationRescueActivity cancellationRescueActivity = (CancellationRescueActivity) bVar;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = CancellationRescueActivity.s;
                com.amazon.aps.iva.yb0.j.f(cancellationRescueActivity, "this$0");
                Rect rect = new Rect();
                cancellationRescueActivity.mi().e.getHitRect(rect);
                if (cancellationRescueActivity.mi().f.d.getLocalVisibleRect(rect)) {
                    if (cancellationRescueActivity.r) {
                        cancellationRescueActivity.setTitle((CharSequence) null);
                        cancellationRescueActivity.r = false;
                    }
                } else if (!cancellationRescueActivity.r) {
                    cancellationRescueActivity.setTitle(R.string.cancellation_rescue_title);
                    cancellationRescueActivity.r = true;
                }
                cancellationRescueActivity.mi().h.G(i2);
                return;
            default:
                UpsellV2Activity upsellV2Activity = (UpsellV2Activity) bVar;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = UpsellV2Activity.s;
                com.amazon.aps.iva.yb0.j.f(upsellV2Activity, "this$0");
                upsellV2Activity.ni().j.G(i2);
                return;
        }
    }
}
