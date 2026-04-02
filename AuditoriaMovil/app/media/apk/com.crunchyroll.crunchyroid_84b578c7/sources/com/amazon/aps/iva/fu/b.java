package com.amazon.aps.iva.fu;

import android.content.Context;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.du.f;
import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.commenting.comments.list.item.repliesbutton.CommentRepliesButton;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.ui.ImageUtil;
/* compiled from: CommentDeletedViewHolder.kt */
/* loaded from: classes2.dex */
public final class b extends a {
    public final com.amazon.aps.iva.du.d b;

    public b(com.amazon.aps.iva.du.d dVar) {
        super(dVar);
        this.b = dVar;
    }

    @Override // com.amazon.aps.iva.fu.a
    public final void b1(x xVar, EventDispatcher<f> eventDispatcher) {
        j.f(eventDispatcher, "eventDispatcher");
        com.amazon.aps.iva.du.d dVar = this.b;
        dVar.getClass();
        com.amazon.aps.iva.pu.d dVar2 = dVar.c;
        dVar2.c.setText(xVar.d);
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = dVar.getContext();
        j.e(context, "context");
        ImageView imageView = dVar2.b;
        j.e(imageView, "binding.commentAuthorAvatar");
        com.amazon.aps.iva.tu.a.a(imageUtil, context, xVar.e, imageView);
        CommentRepliesButton commentRepliesButton = dVar2.e;
        commentRepliesButton.bind(xVar.k);
        dVar2.d.setText(dVar.d.a(xVar.j));
        ConstraintLayout constraintLayout = dVar2.a;
        j.e(constraintLayout, "binding.root");
        constraintLayout.setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(constraintLayout.getContext(), xVar.p));
        commentRepliesButton.setOnClickListener(new com.amazon.aps.iva.du.b(0, eventDispatcher, xVar));
        e.a(this, dVar.getBinding());
    }
}
