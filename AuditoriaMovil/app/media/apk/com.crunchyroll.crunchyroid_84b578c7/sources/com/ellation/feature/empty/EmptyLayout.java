package com.ellation.feature.empty;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.j60.d;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaTrack;
import kotlin.Metadata;
/* compiled from: EmptyView.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/ellation/feature/empty/EmptyLayout;", "Lcom/amazon/aps/iva/wy/g;", "Landroid/content/res/TypedArray;", "Lcom/amazon/aps/iva/kb0/q;", "setUpImage", "Landroid/util/AttributeSet;", "b", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Landroid/widget/TextView;", "c", "Lcom/amazon/aps/iva/bc0/b;", "getTitle", "()Landroid/widget/TextView;", "title", "d", "getSubtitle", MediaTrack.ROLE_SUBTITLE, "feature_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EmptyLayout extends g {
    public static final /* synthetic */ l<Object>[] e = {q.a(EmptyLayout.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(EmptyLayout.class, MediaTrack.ROLE_SUBTITLE, "getSubtitle()Landroid/widget/TextView;", 0)};
    public final AttributeSet b;
    public final v c;
    public final v d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final TextView getSubtitle() {
        return (TextView) this.d.getValue(this, e[1]);
    }

    private final TextView getTitle() {
        return (TextView) this.c.getValue(this, e[0]);
    }

    private final void setUpImage(TypedArray typedArray) {
        ImageView imageView = (ImageView) findViewById(R.id.empty_view_image);
        imageView.setImageResource(typedArray.getResourceId(0, 0));
        imageView.setVisibility(typedArray.getInt(1, 0));
    }

    public final void b1(d dVar) {
        getTitle().setText(dVar.a);
        getSubtitle().setText(dVar.b);
    }

    public final AttributeSet getAttrs() {
        return this.b;
    }

    public final void p() {
        getTitle().setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = attributeSet;
        this.c = com.amazon.aps.iva.xw.g.c(R.id.empty_view_title, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.empty_view_subtitle, this);
        View.inflate(context, R.layout.layout_empty_view, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.i60.d.a, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setUpImage(obtainStyledAttributes);
        x.g0(getTitle(), obtainStyledAttributes, 3, -1);
        x.g0(getSubtitle(), obtainStyledAttributes, 2, -1);
        getTitle().setVisibility(obtainStyledAttributes.getInt(4, 0));
        obtainStyledAttributes.recycle();
    }
}
