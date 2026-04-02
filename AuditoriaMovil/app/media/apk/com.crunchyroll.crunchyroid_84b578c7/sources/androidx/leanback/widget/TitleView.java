package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.SearchOrbView;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class TitleView extends FrameLayout {
    public final ImageView b;
    public final TextView c;
    public final SearchOrbView d;
    public final int e;
    public boolean f;
    public final a g;

    /* loaded from: classes.dex */
    public class a extends androidx.leanback.widget.a {
    }

    public TitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.browseTitleViewStyle);
        this.e = 6;
        this.f = false;
        this.g = new a();
        View inflate = LayoutInflater.from(context).inflate(R.layout.lb_title_view, this);
        this.b = (ImageView) inflate.findViewById(R.id.title_badge);
        this.c = (TextView) inflate.findViewById(R.id.title_text);
        this.d = (SearchOrbView) inflate.findViewById(R.id.title_orb);
        setClipToPadding(false);
        setClipChildren(false);
    }

    public Drawable getBadgeDrawable() {
        return this.b.getDrawable();
    }

    public SearchOrbView.c getSearchAffordanceColors() {
        return this.d.getOrbColors();
    }

    public View getSearchAffordanceView() {
        return this.d;
    }

    public CharSequence getTitle() {
        return this.c.getText();
    }

    public androidx.leanback.widget.a getTitleViewAdapter() {
        return this.g;
    }

    public void setBadgeDrawable(Drawable drawable) {
        ImageView imageView = this.b;
        imageView.setImageDrawable(drawable);
        Drawable drawable2 = imageView.getDrawable();
        TextView textView = this.c;
        if (drawable2 != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
            return;
        }
        imageView.setVisibility(8);
        textView.setVisibility(0);
    }

    public void setOnSearchClickedListener(View.OnClickListener onClickListener) {
        boolean z;
        int i = 0;
        if (onClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        SearchOrbView searchOrbView = this.d;
        searchOrbView.setOnOrbClickedListener(onClickListener);
        if (!this.f || (this.e & 4) != 4) {
            i = 4;
        }
        searchOrbView.setVisibility(i);
    }

    public void setSearchAffordanceColors(SearchOrbView.c cVar) {
        this.d.setOrbColors(cVar);
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.c;
        textView.setText(charSequence);
        ImageView imageView = this.b;
        if (imageView.getDrawable() != null) {
            imageView.setVisibility(0);
            textView.setVisibility(8);
            return;
        }
        imageView.setVisibility(8);
        textView.setVisibility(0);
    }
}
