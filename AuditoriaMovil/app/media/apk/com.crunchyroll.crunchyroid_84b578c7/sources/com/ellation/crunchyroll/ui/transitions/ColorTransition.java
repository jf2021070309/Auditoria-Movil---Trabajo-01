package com.ellation.crunchyroll.ui.transitions;

import android.graphics.Color;
import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import kotlin.Metadata;
/* compiled from: ColorTransition.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0013\u0012\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J'\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0014J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0014R\u0017\u0010\u0004\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lcom/ellation/crunchyroll/ui/transitions/ColorTransition;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/ellation/crunchyroll/ui/transitions/Transition;", "", "startColor", "endColor", "", "progressFraction", "evaluateColor", "transitionProgress", "viewModelIn", "viewModelOut", "Lcom/amazon/aps/iva/kb0/q;", "modifyView", "(FLjava/lang/Object;Ljava/lang/Object;)V", "applyModificationForSameView", "evaluatedColorForViewIn", "evaluatedColorForViewOut", "applyModificationForDifferentViews", "", "Ljava/lang/String;", "getStartColor", "()Ljava/lang/String;", "getEndColor", "parsedStartColor", "I", "getParsedStartColor", "()I", "parsedEndColor", "getParsedEndColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class ColorTransition<T> extends Transition<T> {
    public static final int $stable = 0;
    private final String endColor;
    private final int parsedEndColor;
    private final int parsedStartColor;
    private final String startColor;

    public ColorTransition(String str, String str2) {
        j.f(str, "startColor");
        j.f(str2, "endColor");
        this.startColor = str;
        this.endColor = str2;
        this.parsedStartColor = Color.parseColor(str);
        this.parsedEndColor = Color.parseColor(str2);
    }

    private final int evaluateColor(int i, int i2, float f) {
        Integer evaluate = ArgbEvaluatorCompat.getInstance().evaluate(f, Integer.valueOf(i), Integer.valueOf(i2));
        j.e(evaluate, "getInstance().evaluate(p…on, startColor, endColor)");
        return evaluate.intValue();
    }

    public void applyModificationForDifferentViews(int i, int i2) {
        View viewIn = getViewIn();
        if (viewIn != null) {
            viewIn.setBackgroundColor(i);
        }
        View viewOut = getViewOut();
        if (viewOut != null) {
            viewOut.setBackgroundColor(i2);
        }
    }

    public void applyModificationForSameView() {
        View viewIn = getViewIn();
        if (viewIn != null) {
            viewIn.setBackgroundColor(this.parsedEndColor);
        }
        View viewOut = getViewOut();
        if (viewOut != null) {
            viewOut.setBackgroundColor(this.parsedStartColor);
        }
    }

    public final String getEndColor() {
        return this.endColor;
    }

    public final int getParsedEndColor() {
        return this.parsedEndColor;
    }

    public final int getParsedStartColor() {
        return this.parsedStartColor;
    }

    public final String getStartColor() {
        return this.startColor;
    }

    @Override // com.ellation.crunchyroll.ui.transitions.Transition
    public void modifyView(float f, T t, T t2) {
        if (!j.a(t, t2)) {
            float f2 = f / 100;
            applyModificationForDifferentViews(evaluateColor(this.parsedStartColor, this.parsedEndColor, f2), evaluateColor(this.parsedEndColor, this.parsedStartColor, f2));
            return;
        }
        applyModificationForSameView();
    }
}
