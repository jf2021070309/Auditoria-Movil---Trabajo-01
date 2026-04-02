package com.google.android.material.color.utilities;

import com.amazon.aps.iva.t80.a;
import com.amazon.aps.iva.t80.c;
import com.amazon.aps.iva.t80.c0;
import com.amazon.aps.iva.t80.h;
import com.amazon.aps.iva.t80.p;
import com.amazon.aps.iva.t80.r;
import com.amazon.aps.iva.t80.s;
import com.amazon.aps.iva.t80.t;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.TonalPalette;
import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;
/* loaded from: classes3.dex */
public final class DynamicColor {
    public final Function<DynamicScheme, DynamicColor> background;
    public final Function<DynamicScheme, Double> chroma;
    private final HashMap<DynamicScheme, Hct> hctCache = new HashMap<>();
    public final Function<DynamicScheme, Double> hue;
    public final Function<DynamicScheme, Double> opacity;
    public final Function<DynamicScheme, Double> tone;
    public final Function<DynamicScheme, ToneDeltaConstraint> toneDeltaConstraint;
    public final Function<DynamicScheme, Double> toneMaxContrast;
    public final Function<DynamicScheme, Double> toneMinContrast;

    /* renamed from: com.google.android.material.color.utilities.DynamicColor$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$material$color$utilities$TonePolarity;

        static {
            int[] iArr = new int[TonePolarity.values().length];
            $SwitchMap$com$google$android$material$color$utilities$TonePolarity = iArr;
            try {
                iArr[TonePolarity.DARKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$TonePolarity[TonePolarity.LIGHTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$android$material$color$utilities$TonePolarity[TonePolarity.NO_PREFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public DynamicColor(Function<DynamicScheme, Double> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, Double> function3, Function<DynamicScheme, Double> function4, Function<DynamicScheme, DynamicColor> function5, Function<DynamicScheme, Double> function6, Function<DynamicScheme, Double> function7, Function<DynamicScheme, ToneDeltaConstraint> function8) {
        this.hue = function;
        this.chroma = function2;
        this.tone = function3;
        this.opacity = function4;
        this.background = function5;
        this.toneMinContrast = function6;
        this.toneMaxContrast = function7;
        this.toneDeltaConstraint = function8;
    }

    public static double calculateDynamicTone(DynamicScheme dynamicScheme, Function<DynamicScheme, Double> function, Function<DynamicColor, Double> function2, BiFunction<Double, Double, Double> biFunction, Function<DynamicScheme, DynamicColor> function3, Function<DynamicScheme, ToneDeltaConstraint> function4, Function<Double, Double> function5, Function<Double, Double> function6) {
        DynamicColor apply;
        double doubleValue;
        double enableLightForeground;
        double doubleValue2 = function.apply(dynamicScheme).doubleValue();
        if (function3 == null) {
            apply = null;
        } else {
            apply = function3.apply(dynamicScheme);
        }
        if (apply == null) {
            return doubleValue2;
        }
        double ratioOfTones = Contrast.ratioOfTones(doubleValue2, apply.tone.apply(dynamicScheme).doubleValue());
        double doubleValue3 = function2.apply(apply).doubleValue();
        double doubleValue4 = biFunction.apply(Double.valueOf(ratioOfTones), Double.valueOf(doubleValue3)).doubleValue();
        double ratioOfTones2 = Contrast.ratioOfTones(doubleValue3, doubleValue4);
        double d = 1.0d;
        if (function5 != null && function5.apply(Double.valueOf(ratioOfTones)) != null) {
            d = function5.apply(Double.valueOf(ratioOfTones)).doubleValue();
        }
        if (function6 == null || function6.apply(Double.valueOf(ratioOfTones)) == null) {
            doubleValue = 21.0d;
        } else {
            doubleValue = function6.apply(Double.valueOf(ratioOfTones)).doubleValue();
        }
        double clampDouble = MathUtils.clampDouble(d, doubleValue, ratioOfTones2);
        if (clampDouble != ratioOfTones2) {
            doubleValue4 = contrastingTone(doubleValue3, clampDouble);
        }
        Function<DynamicScheme, DynamicColor> function7 = apply.background;
        if (function7 != null && function7.apply(dynamicScheme) != null) {
            enableLightForeground = doubleValue4;
        } else {
            enableLightForeground = enableLightForeground(doubleValue4);
        }
        return ensureToneDelta(enableLightForeground, doubleValue2, dynamicScheme, function4, function2);
    }

    public static double contrastingTone(double d, double d2) {
        boolean z;
        double lighterUnsafe = Contrast.lighterUnsafe(d, d2);
        double darkerUnsafe = Contrast.darkerUnsafe(d, d2);
        double ratioOfTones = Contrast.ratioOfTones(lighterUnsafe, d);
        double ratioOfTones2 = Contrast.ratioOfTones(darkerUnsafe, d);
        if (tonePrefersLightForeground(d)) {
            if (Math.abs(ratioOfTones - ratioOfTones2) < 0.1d && ratioOfTones < d2 && ratioOfTones2 < d2) {
                z = true;
            } else {
                z = false;
            }
            if (ratioOfTones < d2 && ratioOfTones < ratioOfTones2 && !z) {
                return darkerUnsafe;
            }
            return lighterUnsafe;
        } else if (ratioOfTones2 >= d2 || ratioOfTones2 >= ratioOfTones) {
            return darkerUnsafe;
        } else {
            return lighterUnsafe;
        }
    }

    public static double enableLightForeground(double d) {
        if (tonePrefersLightForeground(d) && !toneAllowsLightForeground(d)) {
            return 49.0d;
        }
        return d;
    }

    public static double ensureToneDelta(double d, double d2, DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function, Function<DynamicColor, Double> function2) {
        ToneDeltaConstraint apply;
        boolean z;
        if (function == null) {
            apply = null;
        } else {
            apply = function.apply(dynamicScheme);
        }
        if (apply == null) {
            return d;
        }
        double d3 = apply.delta;
        double doubleValue = function2.apply(apply.keepAway).doubleValue();
        double abs = Math.abs(d - doubleValue);
        if (abs >= d3) {
            return d;
        }
        int i = AnonymousClass1.$SwitchMap$com$google$android$material$color$utilities$TonePolarity[apply.keepAwayPolarity.ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return d;
                }
                if (d2 > apply.keepAway.tone.apply(dynamicScheme).doubleValue()) {
                    z = true;
                } else {
                    z = false;
                }
                double abs2 = Math.abs(abs - d3);
                if (!z ? d >= abs2 : d + abs2 > 100.0d) {
                    z2 = false;
                }
                if (z2) {
                    return d + abs2;
                }
                return d - abs2;
            }
            return MathUtils.clampDouble(0.0d, 100.0d, doubleValue - d3);
        }
        return MathUtils.clampDouble(0.0d, 100.0d, doubleValue + d3);
    }

    public static DynamicColor fromArgb(int i) {
        return fromPalette(new c0(TonalPalette.fromInt(i), 5), new s(Hct.fromInt(i), 7));
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2) {
        return fromPalette(function, function2, null, null);
    }

    public static /* synthetic */ Double lambda$fromArgb$1(Hct hct, DynamicScheme dynamicScheme) {
        return Double.valueOf(hct.getTone());
    }

    public static /* synthetic */ Double lambda$fromPalette$5(Function function, DynamicScheme dynamicScheme) {
        return Double.valueOf(((TonalPalette) function.apply(dynamicScheme)).getHue());
    }

    public static /* synthetic */ Double lambda$fromPalette$6(Function function, DynamicScheme dynamicScheme) {
        return Double.valueOf(((TonalPalette) function.apply(dynamicScheme)).getChroma());
    }

    public static /* synthetic */ Double lambda$fromPalette$7(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMinContrastDefault(function, function2, dynamicScheme, function3));
    }

    public static /* synthetic */ Double lambda$fromPalette$8(Function function, Function function2, Function function3, DynamicScheme dynamicScheme) {
        return Double.valueOf(toneMaxContrastDefault(function, function2, dynamicScheme, function3));
    }

    public static /* synthetic */ Double lambda$getTone$9(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return Double.valueOf(dynamicColor.getTone(dynamicScheme));
    }

    public static /* synthetic */ Double lambda$toneMaxContrastDefault$17(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return dynamicColor.toneMaxContrast.apply(dynamicScheme);
    }

    public static /* synthetic */ Double lambda$toneMaxContrastDefault$18(Function function, DynamicScheme dynamicScheme, Double d, Double d2) {
        boolean z;
        if (function != null && function.apply(dynamicScheme) != null && ((DynamicColor) function.apply(dynamicScheme)).background != null && ((DynamicColor) function.apply(dynamicScheme)).background.apply(dynamicScheme) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Double.valueOf(contrastingTone(d2.doubleValue(), 7.0d));
        }
        return Double.valueOf(contrastingTone(d2.doubleValue(), Math.max(7.0d, d.doubleValue())));
    }

    public static /* synthetic */ Double lambda$toneMinContrastDefault$14(DynamicScheme dynamicScheme, DynamicColor dynamicColor) {
        return dynamicColor.toneMinContrast.apply(dynamicScheme);
    }

    public static /* synthetic */ Double lambda$toneMinContrastDefault$15(Function function, DynamicScheme dynamicScheme, Function function2, Double d, Double d2) {
        boolean z;
        double doubleValue = ((Double) function.apply(dynamicScheme)).doubleValue();
        if (d.doubleValue() >= 7.0d) {
            doubleValue = contrastingTone(d2.doubleValue(), 4.5d);
        } else if (d.doubleValue() >= 3.0d) {
            doubleValue = contrastingTone(d2.doubleValue(), 3.0d);
        } else {
            if (function2 != null && function2.apply(dynamicScheme) != null && ((DynamicColor) function2.apply(dynamicScheme)).background != null && ((DynamicColor) function2.apply(dynamicScheme)).background.apply(dynamicScheme) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                doubleValue = contrastingTone(d2.doubleValue(), d.doubleValue());
            }
        }
        return Double.valueOf(doubleValue);
    }

    public static boolean toneAllowsLightForeground(double d) {
        if (Math.round(d) <= 49) {
            return true;
        }
        return false;
    }

    public static double toneMaxContrastDefault(Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new c(dynamicScheme, 0), new BiFunction() { // from class: com.amazon.aps.iva.t80.d
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double lambda$toneMaxContrastDefault$18;
                lambda$toneMaxContrastDefault$18 = DynamicColor.lambda$toneMaxContrastDefault$18(function2, dynamicScheme, (Double) obj, (Double) obj2);
                return lambda$toneMaxContrastDefault$18;
            }
        }, function2, function3, null, null);
    }

    public static double toneMinContrastDefault(final Function<DynamicScheme, Double> function, final Function<DynamicScheme, DynamicColor> function2, final DynamicScheme dynamicScheme, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return calculateDynamicTone(dynamicScheme, function, new r(dynamicScheme, 6), new BiFunction() { // from class: com.amazon.aps.iva.t80.g
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double lambda$toneMinContrastDefault$15;
                lambda$toneMinContrastDefault$15 = DynamicColor.lambda$toneMinContrastDefault$15(function, dynamicScheme, function2, (Double) obj, (Double) obj2);
                return lambda$toneMinContrastDefault$15;
            }
        }, function2, function3, null, new h(0));
    }

    public static boolean tonePrefersLightForeground(double d) {
        if (Math.round(d) < 60) {
            return true;
        }
        return false;
    }

    public int getArgb(DynamicScheme dynamicScheme) {
        int i = getHct(dynamicScheme).toInt();
        Function<DynamicScheme, Double> function = this.opacity;
        if (function == null) {
            return i;
        }
        return (MathUtils.clampInt(0, 255, (int) Math.round(function.apply(dynamicScheme).doubleValue() * 255.0d)) << 24) | (i & 16777215);
    }

    public Hct getHct(DynamicScheme dynamicScheme) {
        Hct hct = this.hctCache.get(dynamicScheme);
        if (hct != null) {
            return hct;
        }
        Hct from = Hct.from(this.hue.apply(dynamicScheme).doubleValue(), this.chroma.apply(dynamicScheme).doubleValue(), getTone(dynamicScheme));
        if (this.hctCache.size() > 4) {
            this.hctCache.clear();
        }
        this.hctCache.put(dynamicScheme, from);
        return from;
    }

    public double getTone(DynamicScheme dynamicScheme) {
        boolean z;
        DynamicColor apply;
        final double d;
        Function<DynamicScheme, Double> function;
        final double doubleValue = this.tone.apply(dynamicScheme).doubleValue();
        double d2 = dynamicScheme.contrastLevel;
        boolean z2 = false;
        if (d2 < 0.0d) {
            z = true;
        } else {
            z = false;
        }
        if (d2 != 0.0d) {
            double doubleValue2 = this.tone.apply(dynamicScheme).doubleValue();
            if (z) {
                function = this.toneMinContrast;
            } else {
                function = this.toneMaxContrast;
            }
            doubleValue = doubleValue2 + (Math.abs(dynamicScheme.contrastLevel) * (function.apply(dynamicScheme).doubleValue() - doubleValue2));
        }
        Function<DynamicScheme, DynamicColor> function2 = this.background;
        if (function2 == null) {
            apply = null;
        } else {
            apply = function2.apply(dynamicScheme);
        }
        final double d3 = 1.0d;
        if (apply != null) {
            Function<DynamicScheme, DynamicColor> function3 = apply.background;
            if (function3 != null && function3.apply(dynamicScheme) != null) {
                z2 = true;
            }
            d = Contrast.ratioOfTones(this.tone.apply(dynamicScheme).doubleValue(), apply.tone.apply(dynamicScheme).doubleValue());
            if (z) {
                double ratioOfTones = Contrast.ratioOfTones(this.toneMinContrast.apply(dynamicScheme).doubleValue(), apply.toneMinContrast.apply(dynamicScheme).doubleValue());
                if (z2) {
                    d3 = ratioOfTones;
                }
            } else {
                double ratioOfTones2 = Contrast.ratioOfTones(this.toneMaxContrast.apply(dynamicScheme).doubleValue(), apply.toneMaxContrast.apply(dynamicScheme).doubleValue());
                if (z2) {
                    d3 = Math.min(ratioOfTones2, d);
                }
                if (z2) {
                    d = Math.max(ratioOfTones2, d);
                }
            }
            return calculateDynamicTone(dynamicScheme, this.tone, new a(dynamicScheme, 1), new BiFunction() { // from class: com.amazon.aps.iva.t80.k
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Double valueOf;
                    Double d4 = (Double) obj;
                    Double d5 = (Double) obj2;
                    valueOf = Double.valueOf(doubleValue);
                    return valueOf;
                }
            }, new t(apply, 4), this.toneDeltaConstraint, new Function() { // from class: com.amazon.aps.iva.t80.l
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Double valueOf;
                    Double d4 = (Double) obj;
                    valueOf = Double.valueOf(d3);
                    return valueOf;
                }
            }, new Function() { // from class: com.amazon.aps.iva.t80.m
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Double valueOf;
                    Double d4 = (Double) obj;
                    valueOf = Double.valueOf(d);
                    return valueOf;
                }
            });
        }
        d = 21.0d;
        return calculateDynamicTone(dynamicScheme, this.tone, new a(dynamicScheme, 1), new BiFunction() { // from class: com.amazon.aps.iva.t80.k
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Double valueOf;
                Double d4 = (Double) obj;
                Double d5 = (Double) obj2;
                valueOf = Double.valueOf(doubleValue);
                return valueOf;
            }
        }, new t(apply, 4), this.toneDeltaConstraint, new Function() { // from class: com.amazon.aps.iva.t80.l
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                Double d4 = (Double) obj;
                valueOf = Double.valueOf(d3);
                return valueOf;
            }
        }, new Function() { // from class: com.amazon.aps.iva.t80.m
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                Double d4 = (Double) obj;
                valueOf = Double.valueOf(d);
                return valueOf;
            }
        });
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, Function<DynamicScheme, Double> function2, Function<DynamicScheme, DynamicColor> function3) {
        return fromPalette(function, function2, function3, null);
    }

    public static DynamicColor fromPalette(Function<DynamicScheme, TonalPalette> function, final Function<DynamicScheme, Double> function2, final Function<DynamicScheme, DynamicColor> function3, final Function<DynamicScheme, ToneDeltaConstraint> function4) {
        return new DynamicColor(new a(function, 0), new p(function, 3), function2, null, function3, new Function() { // from class: com.amazon.aps.iva.t80.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromPalette$7;
                lambda$fromPalette$7 = DynamicColor.lambda$fromPalette$7(function2, function3, function4, (DynamicScheme) obj);
                return lambda$fromPalette$7;
            }
        }, new Function() { // from class: com.amazon.aps.iva.t80.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double lambda$fromPalette$8;
                lambda$fromPalette$8 = DynamicColor.lambda$fromPalette$8(function2, function3, function4, (DynamicScheme) obj);
                return lambda$fromPalette$8;
            }
        }, function4);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function) {
        return fromPalette(new Function() { // from class: com.amazon.aps.iva.t80.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i);
                return fromInt;
            }
        }, function);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2) {
        return fromPalette(new Function() { // from class: com.amazon.aps.iva.t80.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i);
                return fromInt;
            }
        }, function, function2);
    }

    public static DynamicColor fromArgb(final int i, Function<DynamicScheme, Double> function, Function<DynamicScheme, DynamicColor> function2, Function<DynamicScheme, ToneDeltaConstraint> function3) {
        return fromPalette(new Function() { // from class: com.amazon.aps.iva.t80.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                TonalPalette fromInt;
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                fromInt = TonalPalette.fromInt(i);
                return fromInt;
            }
        }, function, function2, function3);
    }

    public static /* synthetic */ Double lambda$toneMinContrastDefault$16(Double d) {
        return d;
    }

    public static /* synthetic */ TonalPalette lambda$fromArgb$0(TonalPalette tonalPalette, DynamicScheme dynamicScheme) {
        return tonalPalette;
    }

    public static /* synthetic */ DynamicColor lambda$getTone$11(DynamicColor dynamicColor, DynamicScheme dynamicScheme) {
        return dynamicColor;
    }
}
