package com.amazon.aps.iva.z00;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.c8.h;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i60.c;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.ui.ImageUtil;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: MatureContentDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/z00/a;", "Lcom/amazon/aps/iva/i60/c;", "<init>", "()V", "a", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends c {
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public final s h;
    public static final /* synthetic */ l<Object>[] j = {q.a(a.class, "positiveButton", "getPositiveButton()Landroid/widget/TextView;", 0), q.a(a.class, "negativeButton", "getNegativeButton()Landroid/widget/TextView;", 0), q.a(a.class, "closeButton", "getCloseButton()Landroid/view/View;", 0), q.a(a.class, "imageViewPoster", "getImageViewPoster()Landroid/widget/ImageView;", 0), e.b(a.class, "asset", "getAsset()Lcom/ellation/crunchyroll/model/PlayableAsset;", 0)};
    public static final C0907a i = new C0907a();

    /* compiled from: MatureContentDialog.kt */
    /* renamed from: com.amazon.aps.iva.z00.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0907a {
    }

    public a() {
        super(Integer.valueOf((int) R.layout.dialog_mature_content), (int) R.dimen.mature_content_dialog_width, 4);
        this.d = g.e(this, R.id.positive_button);
        this.e = g.e(this, R.id.negative_button);
        this.f = g.e(this, R.id.mature_content_dialog_close_button);
        this.g = g.e(this, R.id.mature_content_dialog_image_view_poster);
        this.h = new s("asset");
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        if (bundle != null) {
            dismiss();
            return;
        }
        super.onViewCreated(view, bundle);
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        l<?>[] lVarArr = j;
        imageUtil.loadImageIntoView(requireContext, ((PlayableAsset) this.h.getValue(this, lVarArr[4])).getImages().getPosterWideMediumThumbnailUrl(), (ImageView) this.g.getValue(this, lVarArr[3]));
        l<?> lVar = lVarArr[0];
        v vVar = this.d;
        ((TextView) vVar.getValue(this, lVar)).setText(R.string.confirm_maturity_age);
        ((TextView) vVar.getValue(this, lVarArr[0])).setOnClickListener(new h(this, 14));
        l<?> lVar2 = lVarArr[1];
        v vVar2 = this.e;
        ((TextView) vVar2.getValue(this, lVar2)).setText(R.string.no);
        ((TextView) vVar2.getValue(this, lVarArr[1])).setOnClickListener(new com.amazon.aps.iva.fe.a(this, 9));
        ((View) this.f.getValue(this, lVarArr[2])).setOnClickListener(new com.amazon.aps.iva.c8.j(this, 13));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return b0.b;
    }
}
