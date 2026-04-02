package com.kwad.components.core.b;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public final class a implements View.OnClickListener {
    private TextView Ig;
    private ImageView Ih;
    private ImageView Ii;
    private InterfaceC0185a Ij;
    private ViewGroup sA;

    /* renamed from: com.kwad.components.core.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0185a {
        void t(View view);

        void u(View view);
    }

    public a(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ksad_kwad_web_title_bar);
        this.sA = viewGroup2;
        if (viewGroup2 == null) {
            return;
        }
        initView();
    }

    private void initView() {
        this.Ig = (TextView) this.sA.findViewById(R.id.ksad_kwad_titlebar_title);
        this.Ih = (ImageView) this.sA.findViewById(R.id.ksad_kwad_web_navi_back);
        ImageView imageView = (ImageView) this.sA.findViewById(R.id.ksad_kwad_web_navi_close);
        this.Ii = imageView;
        imageView.setOnClickListener(this);
        this.Ih.setOnClickListener(this);
    }

    public final void a(InterfaceC0185a interfaceC0185a) {
        this.Ij = interfaceC0185a;
    }

    public final void a(b bVar) {
        TextView textView;
        if (this.sA == null || (textView = this.Ig) == null) {
            return;
        }
        textView.setText(bVar.getTitle());
    }

    public final void ai(boolean z) {
        ImageView imageView = this.Ii;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final ViewGroup gS() {
        return this.sA;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.Ij == null) {
            return;
        }
        if (view.equals(this.Ii)) {
            this.Ij.u(view);
        } else if (view.equals(this.Ih)) {
            this.Ij.t(view);
        }
    }
}
