package com.amazon.aps.iva.r70;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.ellation.crunchyroll.ui.R;
/* compiled from: DraggableViewHolder.kt */
/* loaded from: classes2.dex */
public abstract class a extends RecyclerView.f0 {
    public a(ComposeView composeView) {
        super(composeView);
    }

    public abstract void G4();

    public void U2() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), R.anim.item_scale_in);
        this.itemView.startAnimation(loadAnimation);
        loadAnimation.setFillAfter(true);
        this.itemView.setSelected(false);
        b1();
    }

    public abstract void b1();
}
