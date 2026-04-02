package com.ellation.crunchyroll.crunchylists.addtocrunchylistbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import com.amazon.aps.iva.bv.a;
import com.amazon.aps.iva.bv.c;
import com.amazon.aps.iva.bv.d;
import com.amazon.aps.iva.gv.b;
import com.amazon.aps.iva.gv.i;
import com.amazon.aps.iva.ov.f;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: AddToCrunchylistButton.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/crunchylists/addtocrunchylistbutton/AddToCrunchylistButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/amazon/aps/iva/bv/c;", "Landroidx/fragment/app/h;", "getParentActivity", "()Landroidx/fragment/app/h;", "parentActivity", "crunchylists_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AddToCrunchylistButton extends ConstraintLayout implements c {
    public static final /* synthetic */ int d = 0;
    public final f b;
    public final a c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddToCrunchylistButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final h getParentActivity() {
        Context context = getContext();
        j.d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (h) context;
    }

    @Override // com.amazon.aps.iva.bv.c
    public final void hide() {
        TextView textView = (TextView) this.b.b;
        j.e(textView, "binding.root");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.bv.c
    public final void oe(d dVar) {
        FragmentManager supportFragmentManager = getParentActivity().getSupportFragmentManager();
        androidx.fragment.app.a a = b.a(supportFragmentManager, supportFragmentManager);
        b.a aVar = b.e;
        i.a aVar2 = new i.a(dVar);
        aVar.getClass();
        a.d(0, b.a.a(aVar2), "crunchylists", 1);
        a.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((TextView) this.b.b).setOnClickListener(new com.amazon.aps.iva.ne.a(this, 13));
    }

    @Override // com.amazon.aps.iva.bv.c
    public final void show() {
        TextView textView = (TextView) this.b.b;
        j.e(textView, "binding.root");
        textView.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCrunchylistButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_add_to_crunchylist_button, (ViewGroup) this, false);
        addView(inflate);
        if (inflate != null) {
            this.b = new f((TextView) inflate, 0);
            com.amazon.aps.iva.bv.b bVar = new com.amazon.aps.iva.bv.b(this);
            com.ellation.crunchyroll.mvp.lifecycle.a.b(bVar, this);
            this.c = bVar;
            return;
        }
        throw new NullPointerException("rootView");
    }
}
