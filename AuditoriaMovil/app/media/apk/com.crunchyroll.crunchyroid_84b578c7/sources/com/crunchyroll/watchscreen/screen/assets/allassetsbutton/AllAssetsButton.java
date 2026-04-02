package com.crunchyroll.watchscreen.screen.assets.allassetsbutton;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.to.a;
import com.amazon.aps.iva.to.b;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: AllAssetsButton.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/crunchyroll/watchscreen/screen/assets/allassetsbutton/AllAssetsButton;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/amazon/aps/iva/to/b;", "watch-screen_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AllAssetsButton extends AppCompatTextView implements b {
    public final a b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AllAssetsButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.to.b
    public final void F5() {
        setText(R.string.watch_page_view_all_videos);
    }

    @Override // com.amazon.aps.iva.to.b
    public final void t9() {
        setText(R.string.watch_page_view_all_episodes);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllAssetsButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = new a(this);
    }
}
