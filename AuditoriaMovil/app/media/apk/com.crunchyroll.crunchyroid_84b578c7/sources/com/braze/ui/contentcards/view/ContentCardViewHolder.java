package com.braze.ui.contentcards.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.j;
import com.braze.ui.R$drawable;
import com.braze.ui.R$id;
import kotlin.Metadata;
/* compiled from: ContentCardViewHolder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "isVisible", "Lcom/amazon/aps/iva/kb0/q;", "setPinnedIconVisible", "setUnreadBarVisible", "setActionHintVisible", "", "text", "setActionHintText", "Landroid/view/View;", "unreadBar", "Landroid/view/View;", "Landroid/widget/ImageView;", "pinnedIcon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "actionHint", "Landroid/widget/TextView;", "view", "showUnreadIndicator", "<init>", "(Landroid/view/View;Z)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class ContentCardViewHolder extends RecyclerView.f0 {
    private final TextView actionHint;
    private final ImageView pinnedIcon;
    private final View unreadBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentCardViewHolder(View view, boolean z) {
        super(view);
        j.f(view, "view");
        View findViewById = view.findViewById(R$id.com_braze_content_cards_unread_bar);
        this.unreadBar = findViewById;
        this.pinnedIcon = (ImageView) view.findViewById(R$id.com_braze_content_cards_pinned_icon);
        this.actionHint = (TextView) view.findViewById(R$id.com_braze_content_cards_action_hint);
        if (z) {
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            if (findViewById != null) {
                findViewById.setBackground(view.getContext().getResources().getDrawable(R$drawable.com_braze_content_cards_unread_bar_background));
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final void setActionHintText(String str) {
        j.f(str, "text");
        TextView textView = this.actionHint;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setActionHintVisible(boolean z) {
        int i;
        TextView textView = this.actionHint;
        if (textView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public final void setPinnedIconVisible(boolean z) {
        int i;
        ImageView imageView = this.pinnedIcon;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public final void setUnreadBarVisible(boolean z) {
        int i;
        View view = this.unreadBar;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
