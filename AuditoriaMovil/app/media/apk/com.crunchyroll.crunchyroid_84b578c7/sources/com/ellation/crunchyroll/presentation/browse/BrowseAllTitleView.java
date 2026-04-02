package com.ellation.crunchyroll.presentation.browse;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: BrowseAllTitleView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ellation/crunchyroll/presentation/browse/BrowseAllTitleView;", "Landroidx/appcompat/widget/AppCompatTextView;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class BrowseAllTitleView extends AppCompatTextView {
    public BrowseAllTitleView() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseAllTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
    }

    public final void U2(h.d dVar) {
        boolean z;
        j.f(dVar, "item");
        setText("");
        String str = dVar.b;
        boolean z2 = true;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = dVar.c;
        if (!z) {
            if (str2.length() <= 0) {
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        setText(getContext().getResources().getString(R.string.browse_all_item_title, str, str2));
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        boolean z;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            String obj = charSequence.toString();
            String string = getContext().getString(R.string.browse_all_is_for);
            j.e(string, "context.getString(R.string.browse_all_is_for)");
            super.setText(m0.b(com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.cr_silver), obj, string), bufferType);
            return;
        }
        super.setText(charSequence, bufferType);
    }
}
