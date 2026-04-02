package com.amazon.aps.iva.z00;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.c8.k;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i60.c;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.google.android.gms.cast.MediaTrack;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: MaturityRestrictionDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/z00/b;", "Lcom/amazon/aps/iva/i60/c;", "<init>", "()V", "a", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends c {
    public final v d;
    public final v e;
    public final v f;
    public final v g;
    public final v h;
    public final v i;
    public final s j;
    public static final /* synthetic */ l<Object>[] l = {q.a(b.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(b.class, MediaTrack.ROLE_SUBTITLE, "getSubtitle()Landroid/widget/TextView;", 0), q.a(b.class, "positiveButton", "getPositiveButton()Landroid/widget/TextView;", 0), q.a(b.class, "negativeButton", "getNegativeButton()Landroid/widget/TextView;", 0), q.a(b.class, "closeButton", "getCloseButton()Landroid/view/View;", 0), q.a(b.class, "imageViewPoster", "getImageViewPoster()Landroid/widget/ImageView;", 0), e.b(b.class, "asset", "getAsset()Lcom/ellation/crunchyroll/model/PlayableAsset;", 0)};
    public static final a k = new a();

    /* compiled from: MaturityRestrictionDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    public b() {
        super(Integer.valueOf((int) R.layout.dialog_mature_content), (int) R.dimen.mature_content_dialog_width, 4);
        this.d = g.e(this, R.id.mature_content_dialog_header);
        this.e = g.e(this, R.id.mature_content_dialog_subtitle);
        this.f = g.e(this, R.id.positive_button);
        this.g = g.e(this, R.id.negative_button);
        this.h = g.e(this, R.id.mature_content_dialog_close_button);
        this.i = g.e(this, R.id.mature_content_dialog_image_view_poster);
        this.j = new s("asset");
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
        l<?>[] lVarArr = l;
        imageUtil.loadImageIntoView(requireContext, ((PlayableAsset) this.j.getValue(this, lVarArr[6])).getImages().getPosterWideMediumThumbnailUrl(), (ImageView) this.i.getValue(this, lVarArr[5]));
        ((TextView) this.d.getValue(this, lVarArr[0])).setText(R.string.restricted_by_maturity_title);
        ((TextView) this.e.getValue(this, lVarArr[1])).setText(R.string.restricted_by_maturity_message);
        l<?> lVar = lVarArr[2];
        v vVar = this.f;
        ((TextView) vVar.getValue(this, lVar)).setText(R.string.restricted_by_maturity_cta);
        l<?> lVar2 = lVarArr[3];
        v vVar2 = this.g;
        ((TextView) vVar2.getValue(this, lVar2)).setText(R.string.cancel);
        ((TextView) vVar.getValue(this, lVarArr[2])).setOnClickListener(new k(this, 13));
        ((TextView) vVar2.getValue(this, lVarArr[3])).setOnClickListener(new r(this, 13));
        ((View) this.h.getValue(this, lVarArr[4])).setOnClickListener(new com.amazon.aps.iva.c8.s(this, 14));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return b0.b;
    }
}
