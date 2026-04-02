package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.q.o;
import com.crunchyroll.crunchyroid.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends o {
    public final AnimationDrawable b;
    public final AnimationDrawable c;
    public final String d;
    public final String e;
    public boolean f;
    public View.OnClickListener g;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
            boolean z = !mediaRouteExpandCollapseButton.f;
            mediaRouteExpandCollapseButton.f = z;
            if (z) {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.b);
                mediaRouteExpandCollapseButton.b.start();
                mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.e);
            } else {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.c);
                mediaRouteExpandCollapseButton.c.start();
                mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.d);
            }
            View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.g;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        AnimationDrawable animationDrawable = (AnimationDrawable) com.amazon.aps.iva.d3.a.getDrawable(context, R.drawable.mr_group_expand);
        this.b = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) com.amazon.aps.iva.d3.a.getDrawable(context, R.drawable.mr_group_collapse);
        this.c = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d.c(context), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(R.string.mr_controller_expand_group);
        this.d = string;
        this.e = context.getString(R.string.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new a());
    }
}
