package com.amazon.aps.iva.bc;

import android.view.View;
import com.amazon.aps.iva.nv.e;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.CaptionedImageCard;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.braze.ui.widget.CaptionedImageCardView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                InAppMessageFullView.c((InAppMessageFullView) obj2, (View) obj, view);
                return;
            case 1:
                CaptionedImageCardView.c((CaptionedImageCardView) obj2, (CaptionedImageCard) obj, view);
                return;
            default:
                l lVar = (l) obj2;
                e eVar = (e) obj;
                int i2 = com.amazon.aps.iva.av.b.d;
                j.f(lVar, "$onCrunchylistItemClick");
                j.f(eVar, "$crunchylistItemUiModel");
                lVar.invoke(eVar);
                return;
        }
    }
}
