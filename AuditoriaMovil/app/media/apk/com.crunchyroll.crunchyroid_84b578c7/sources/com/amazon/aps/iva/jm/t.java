package com.amazon.aps.iva.jm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.jm.r;
import com.amazon.aps.iva.q.c0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
/* compiled from: AvatarsAdapter.kt */
/* loaded from: classes2.dex */
public final class t extends androidx.recyclerview.widget.v<r, RecyclerView.f0> {
    public final u b;

    /* compiled from: AvatarsAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.f0 {
        public final com.amazon.aps.iva.cm.c b;
        public final u c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.cm.c cVar, u uVar) {
            super((ConstraintLayout) cVar.b);
            com.amazon.aps.iva.yb0.j.f(uVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.b = cVar;
            this.c = uVar;
        }

        public final void U2(boolean z) {
            com.amazon.aps.iva.cm.c cVar = this.b;
            if (z) {
                ImageView imageView = (ImageView) cVar.d;
                com.amazon.aps.iva.yb0.j.e(imageView, "binding.avatarSelectionCheckmark");
                imageView.setVisibility(0);
                return;
            }
            ImageView imageView2 = (ImageView) cVar.d;
            com.amazon.aps.iva.yb0.j.e(imageView2, "binding.avatarSelectionCheckmark");
            imageView2.setVisibility(8);
        }

        public final void b1(r.b bVar) {
            this.itemView.setOnClickListener(new s(0, this, bVar));
            ImageUtil imageUtil = ImageUtil.INSTANCE;
            Context context = this.itemView.getContext();
            com.amazon.aps.iva.yb0.j.e(context, "itemView.context");
            String str = bVar.c;
            ImageView imageView = (ImageView) this.b.c;
            com.amazon.aps.iva.yb0.j.e(imageView, "binding.avatarImage");
            imageUtil.loadRoundImage(context, str, imageView, R.drawable.avatar_failure, R.drawable.avatar_selection_placeholder);
            U2(bVar.d);
        }
    }

    /* compiled from: AvatarsAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.f0 {
        public b(com.amazon.aps.iva.cm.d dVar) {
            super(dVar.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar) {
        super(x.a);
        com.amazon.aps.iva.yb0.j.f(uVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.b = uVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i) {
        if (d(i) instanceof r.a) {
            return 10002;
        }
        return 10001;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        if (f0Var instanceof a) {
            r d = d(i);
            com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type com.crunchyroll.profiles.presentation.avatar.AvatarUiModel.RemoteAvatarUiModel");
            ((a) f0Var).b1((r.b) d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.f0 aVar;
        com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
        if (i != 10001) {
            if (i == 10002) {
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.avatar_item_layout_empty, viewGroup, false);
                if (inflate != null) {
                    aVar = new b(new com.amazon.aps.iva.cm.d((ImageView) inflate));
                } else {
                    throw new NullPointerException("rootView");
                }
            } else {
                throw new IllegalArgumentException(c0.a("Invalid view type ", i));
            }
        } else {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.avatar_item_layout, viewGroup, false);
            int i2 = R.id.avatar_image;
            ImageView imageView = (ImageView) z.u(R.id.avatar_image, inflate2);
            if (imageView != null) {
                i2 = R.id.avatar_selection_checkmark;
                ImageView imageView2 = (ImageView) z.u(R.id.avatar_selection_checkmark, inflate2);
                if (imageView2 != null) {
                    aVar = new a(new com.amazon.aps.iva.cm.c((ConstraintLayout) inflate2, imageView, imageView2, 0), this.b);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
        }
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i, List<Object> list) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "holder");
        com.amazon.aps.iva.yb0.j.f(list, "payloads");
        if (f0Var instanceof a) {
            if (list.isEmpty()) {
                r d = d(i);
                com.amazon.aps.iva.yb0.j.d(d, "null cannot be cast to non-null type com.crunchyroll.profiles.presentation.avatar.AvatarUiModel.RemoteAvatarUiModel");
                ((a) f0Var).b1((r.b) d);
                return;
            }
            Object obj = list.get(0);
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            ((a) f0Var).U2(((Boolean) obj).booleanValue());
        }
    }
}
