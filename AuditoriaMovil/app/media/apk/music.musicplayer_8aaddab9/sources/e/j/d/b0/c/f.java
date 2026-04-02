package e.j.d.b0.c;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c.b.c.v;
import c.m.b.o;
import c.p.q;
import ch.qos.logback.core.joran.action.Action;
import e.j.d.b;
import e.j.d.b0.c.g;
import e.j.d.c0.c0;
import e.j.d.i;
import e.j.d.k;
import e.j.d.w;
import h.o.c.j;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class f extends v {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public g.a f8577b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8578c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8579d;

    @Override // c.m.b.n, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if ((arguments == null ? -1 : arguments.getInt("theme", -1)) != -1) {
            setStyle(1, getTheme());
        }
    }

    @Override // c.b.c.v, c.m.b.n
    public Dialog onCreateDialog(Bundle bundle) {
        k.a aVar = k.a;
        int rateDialogLayout = aVar.a().f8812i.J.getRateDialogLayout();
        if (rateDialogLayout == 0) {
            n.a.a.b("PremiumHelper").b("Using default Rate dialog layout. Please set R.attr.rate_dialog_layout for custom rate dialog.", new Object[0]);
            rateDialogLayout = R.layout.ph_default_dialog_rate;
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(rateDialogLayout, (ViewGroup) null);
        j.d(inflate, "from(activity).inflate(layoutId, null)");
        inflate.findViewById(R.id.rate_dialog_positive_button).setOnClickListener(new View.OnClickListener() { // from class: e.j.d.b0.c.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar = f.this;
                int i2 = f.a;
                j.e(fVar, "this$0");
                o requireActivity = fVar.requireActivity();
                j.d(requireActivity, "requireActivity()");
                Bundle arguments = fVar.getArguments();
                boolean z = arguments == null ? false : arguments.getBoolean("from_relaunch", false);
                j.e(requireActivity, "activity");
                w.Y(q.a(requireActivity), null, null, new c0(z, requireActivity, null), 3, null);
                k.a aVar2 = k.a;
                i iVar = aVar2.a().f8811h;
                Objects.requireNonNull(iVar);
                j.e("rate_intent", Action.KEY_ATTRIBUTE);
                j.e("positive", "value");
                SharedPreferences.Editor edit = iVar.a.edit();
                edit.putString("rate_intent", "positive");
                edit.apply();
                aVar2.a().f8813j.o("Rate_us_positive", new Bundle[0]);
                fVar.f8578c = true;
                fVar.dismissAllowingStateLoss();
            }
        });
        inflate.findViewById(R.id.rate_dialog_negative_button).setOnClickListener(new View.OnClickListener() { // from class: e.j.d.b0.c.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar = f.this;
                int i2 = f.a;
                j.e(fVar, "this$0");
                i iVar = k.a.a().f8811h;
                Objects.requireNonNull(iVar);
                j.e("rate_intent", Action.KEY_ATTRIBUTE);
                j.e("negative", "value");
                SharedPreferences.Editor edit = iVar.a.edit();
                edit.putString("rate_intent", "negative");
                edit.apply();
                fVar.f8579d = true;
                fVar.dismissAllowingStateLoss();
            }
        });
        View findViewById = inflate.findViewById(R.id.rate_dialog_dismiss_button);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: e.j.d.b0.c.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f fVar = f.this;
                    int i2 = f.a;
                    j.e(fVar, "this$0");
                    fVar.dismissAllowingStateLoss();
                }
            });
        }
        e.j.d.b bVar = aVar.a().f8813j;
        h.r.f<Object>[] fVarArr = e.j.d.b.a;
        bVar.m(b.a.DIALOG);
        AlertDialog create = new AlertDialog.Builder(getActivity()).setView(inflate).create();
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        j.d(create, "dialog");
        return create;
    }

    @Override // c.m.b.n, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        j.e(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        g.c cVar = this.f8578c ? g.c.DIALOG : g.c.NONE;
        g.a aVar = this.f8577b;
        if (aVar == null) {
            return;
        }
        aVar.a(cVar, this.f8579d);
    }
}
