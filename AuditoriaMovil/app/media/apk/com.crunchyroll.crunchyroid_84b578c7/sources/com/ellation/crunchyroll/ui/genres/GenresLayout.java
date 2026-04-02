package com.ellation.crunchyroll.ui.genres;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.f70.b;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.List;
import kotlin.Metadata;
/* compiled from: GenresLayout.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0016R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/ui/genres/GenresLayout;", "Landroid/widget/LinearLayout;", "Lcom/ellation/crunchyroll/ui/genres/GenresView;", "", "genre", "", "addSeparator", "Lcom/amazon/aps/iva/kb0/q;", "addGenre", "", "genres", "bind", "Lcom/amazon/aps/iva/f70/b;", "binding", "Lcom/amazon/aps/iva/f70/b;", "getBinding", "()Lcom/amazon/aps/iva/f70/b;", "setBinding", "(Lcom/amazon/aps/iva/f70/b;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class GenresLayout extends LinearLayout implements GenresView {
    public static final int $stable = 8;
    private b binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GenresLayout(Context context) {
        this(context, null, 0, 6, null);
        j.f(context, "context");
    }

    private final void addGenre(String str, boolean z) {
        View inflate = View.inflate(getContext(), R.layout.genre_tag, null);
        j.d(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText(str);
        if (z) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.selector_diamond, 0);
        }
        this.binding.a.addView(textView);
    }

    @Override // com.ellation.crunchyroll.ui.genres.GenresView
    public void bind(List<String> list) {
        boolean z;
        j.f(list, "genres");
        this.binding.a.removeAllViews();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) obj;
                if (i != f1.B(list)) {
                    z = true;
                } else {
                    z = false;
                }
                addGenre(str, z);
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
    }

    public final b getBinding() {
        return this.binding;
    }

    public final void setBinding(b bVar) {
        j.f(bVar, "<set-?>");
        this.binding = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GenresLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j.f(context, "context");
    }

    public /* synthetic */ GenresLayout(Context context, AttributeSet attributeSet, int i, int i2, e eVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenresLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.genres_layout, (ViewGroup) this, false);
        addView(inflate);
        if (inflate != null) {
            this.binding = new b((LinearLayout) inflate);
            return;
        }
        throw new NullPointerException("rootView");
    }
}
