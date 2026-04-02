package com.crunchyroll.player.settings.reportproblem.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.mj.e;
import com.amazon.aps.iva.ul.b;
import com.amazon.aps.iva.ul.c;
import com.amazon.aps.iva.ul.d;
import com.amazon.aps.iva.ul.f;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: ReportProblemButton.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/crunchyroll/player/settings/reportproblem/button/ReportProblemButton;", "Landroid/widget/LinearLayout;", "Lcom/amazon/aps/iva/ul/f;", "", "drawableId", "Lcom/amazon/aps/iva/kb0/q;", "setInputBackground", "", "getProblemDescription", "Lcom/amazon/aps/iva/mj/e;", "b", "Lcom/amazon/aps/iva/mj/e;", "getBinding", "()Lcom/amazon/aps/iva/mj/e;", "binding", "Lcom/amazon/aps/iva/ul/d;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/ul/d;", "presenter", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ReportProblemButton extends LinearLayout implements f {
    public final e b;
    public final m c;
    public c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportProblemButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_report_problem_button, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.problem_description;
        EditText editText = (EditText) z.u(R.id.problem_description, inflate);
        if (editText != null) {
            i = R.id.report_button;
            FrameLayout frameLayout = (FrameLayout) z.u(R.id.report_button, inflate);
            if (frameLayout != null) {
                this.b = new e((ConstraintLayout) inflate, editText, frameLayout);
                this.c = com.amazon.aps.iva.kb0.f.b(new b(this));
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public static void G(ReportProblemButton reportProblemButton) {
        j.f(reportProblemButton, "this$0");
        reportProblemButton.getPresenter().R5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d getPresenter() {
        return (d) this.c.getValue();
    }

    private final void setInputBackground(int i) {
        this.b.b.setBackground(a.getDrawable(getContext(), i));
    }

    @Override // com.amazon.aps.iva.ul.f
    public final void C9() {
        FrameLayout frameLayout = this.b.c;
        j.e(frameLayout, "binding.reportButton");
        frameLayout.setEnabled(true);
    }

    @Override // com.amazon.aps.iva.ul.f
    public final void Fd() {
        setInputBackground(R.drawable.problem_description_default_background);
    }

    @Override // com.amazon.aps.iva.ul.f
    public final void Kb() {
        this.b.b.setHint(getResources().getString(R.string.problem_description_hint));
    }

    @Override // com.amazon.aps.iva.ul.f
    public final void S5() {
        this.b.b.setHint(getResources().getString(R.string.problem_description_hint_optional));
    }

    public final void U2(boolean z) {
        getPresenter().h3(z);
    }

    @Override // com.amazon.aps.iva.ul.f
    public final void d3() {
        FrameLayout frameLayout = this.b.c;
        j.e(frameLayout, "binding.reportButton");
        frameLayout.setEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
            getPresenter().a();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final e getBinding() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.ul.f
    public String getProblemDescription() {
        return this.b.b.getText().toString();
    }

    @Override // com.amazon.aps.iva.ul.f
    public final void jb() {
        setInputBackground(R.drawable.problem_description_active_background);
    }
}
