package com.ellation.crunchyroll.commenting.commentscount;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.cm.c;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.nu.a;
import com.amazon.aps.iva.nu.b;
import com.amazon.aps.iva.nu.d;
import com.amazon.aps.iva.nu.e;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CommentsCountLayout.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/ellation/crunchyroll/commenting/commentscount/CommentsCountLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/nu/e;", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CommentsCountLayout extends g implements e {
    public final d b;
    public final c c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentsCountLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public final void b1(com.amazon.aps.iva.ez.g<Integer> gVar) {
        j.f(gVar, "commentsCount");
        d dVar = this.b;
        dVar.getClass();
        gVar.c(new a(dVar));
        gVar.b(new b(dVar));
        gVar.e(new com.amazon.aps.iva.nu.c(dVar));
    }

    @Override // com.amazon.aps.iva.nu.e
    public final void p6(String str) {
        j.f(str, "totalComments");
        TextView textView = (TextView) this.c.c;
        textView.setVisibility(0);
        textView.setText(str);
    }

    @Override // com.amazon.aps.iva.nu.e
    public final void r9() {
        TextView textView = (TextView) this.c.c;
        j.e(textView, "binding.commentsCount");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentsCountLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new d(this, new com.amazon.aps.iva.l60.b(context));
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_comments_count, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.comments_count;
        TextView textView = (TextView) z.u(R.id.comments_count, inflate);
        if (textView != null) {
            i2 = R.id.text_comments;
            TextView textView2 = (TextView) z.u(R.id.text_comments, inflate);
            if (textView2 != null) {
                this.c = new c((LinearLayout) inflate, textView, textView2, 1);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.ut.d.a, 0, 0);
                j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                resourceId = resourceId == -1 ? R.string.commenting_comments : resourceId;
                obtainStyledAttributes.recycle();
                textView2.setText(resourceId);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
