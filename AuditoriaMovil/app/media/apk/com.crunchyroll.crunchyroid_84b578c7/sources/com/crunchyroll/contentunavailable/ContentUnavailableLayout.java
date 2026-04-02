package com.crunchyroll.contentunavailable;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.ds.c;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.wf.d;
import com.amazon.aps.iva.wf.e;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xf.b;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: ContentUnavailableLayout.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/crunchyroll/contentunavailable/ContentUnavailableLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/wy/h;", "content-unavailable_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ContentUnavailableLayout extends g implements h {
    public static final /* synthetic */ int c = 0;
    public final b b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentUnavailableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        j.f(context, "context");
    }

    public final void b1(String str, a<q> aVar) {
        j.f(str, "mediaId");
        c cVar = c.b;
        com.amazon.aps.iva.wf.a aVar2 = com.amazon.aps.iva.wf.a.h;
        j.f(aVar2, "createLoadingTimer");
        com.ellation.crunchyroll.mvp.lifecycle.a.b(new e(this, new com.amazon.aps.iva.wf.c(str, cVar, aVar2)), this);
        b bVar = this.b;
        bVar.b.setOnClickListener(new d(0, aVar));
        bVar.c.setNavigationOnClickListener(new com.amazon.aps.iva.c8.j(this, 3));
    }

    public /* synthetic */ ContentUnavailableLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentUnavailableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_content_unavailable, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.content_unavailable_image;
        if (((ImageView) z.u(R.id.content_unavailable_image, inflate)) != null) {
            i2 = R.id.content_unavailable_subtitle;
            if (((TextView) z.u(R.id.content_unavailable_subtitle, inflate)) != null) {
                i2 = R.id.content_unavailable_title;
                if (((TextView) z.u(R.id.content_unavailable_title, inflate)) != null) {
                    i2 = R.id.take_me_home_button;
                    TextView textView = (TextView) z.u(R.id.take_me_home_button, inflate);
                    if (textView != null) {
                        i2 = R.id.toolbar;
                        Toolbar toolbar = (Toolbar) z.u(R.id.toolbar, inflate);
                        if (toolbar != null) {
                            this.b = new b((ConstraintLayout) inflate, textView, toolbar);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
