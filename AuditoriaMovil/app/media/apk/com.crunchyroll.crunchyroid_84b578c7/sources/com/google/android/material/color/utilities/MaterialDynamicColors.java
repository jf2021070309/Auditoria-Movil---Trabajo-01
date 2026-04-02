package com.google.android.material.color.utilities;

import com.amazon.aps.iva.t80.a0;
import com.amazon.aps.iva.t80.b0;
import com.amazon.aps.iva.t80.c0;
import com.amazon.aps.iva.t80.d0;
import com.amazon.aps.iva.t80.h;
import com.amazon.aps.iva.t80.n;
import com.amazon.aps.iva.t80.o;
import com.amazon.aps.iva.t80.p;
import com.amazon.aps.iva.t80.q;
import com.amazon.aps.iva.t80.r;
import com.amazon.aps.iva.t80.s;
import com.amazon.aps.iva.t80.t;
import com.amazon.aps.iva.t80.u;
import com.amazon.aps.iva.t80.v;
import com.amazon.aps.iva.t80.w;
import com.amazon.aps.iva.t80.x;
import com.amazon.aps.iva.t80.y;
import com.amazon.aps.iva.t80.z;
/* loaded from: classes3.dex */
public final class MaterialDynamicColors {
    private static final double CONTAINER_ACCENT_TONE_DELTA = 15.0d;

    public static double findDesiredChromaByTone(double d, double d2, double d3, boolean z) {
        double d4;
        Hct from = Hct.from(d, d2, d3);
        if (from.getChroma() < d2) {
            Hct hct = from;
            double chroma = from.getChroma();
            double d5 = d3;
            while (hct.getChroma() < d2) {
                if (z) {
                    d4 = -1.0d;
                } else {
                    d4 = 1.0d;
                }
                double d6 = d5 + d4;
                Hct from2 = Hct.from(d, d2, d6);
                if (chroma <= from2.getChroma() && Math.abs(from2.getChroma() - d2) >= 0.4d) {
                    if (Math.abs(from2.getChroma() - d2) < Math.abs(hct.getChroma() - d2)) {
                        hct = from2;
                    }
                    chroma = Math.max(chroma, from2.getChroma());
                    d5 = d6;
                } else {
                    return d6;
                }
            }
            return d5;
        }
        return d3;
    }

    private static boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant = dynamicScheme.variant;
        if (variant != Variant.FIDELITY && variant != Variant.CONTENT) {
            return false;
        }
        return true;
    }

    private static boolean isMonochrome(DynamicScheme dynamicScheme) {
        if (dynamicScheme.variant == Variant.MONOCHROME) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 6.0d;
        } else {
            d = 98.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$controlActivated$131(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$controlHighlight$134(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    public static /* synthetic */ Double lambda$controlHighlight$135(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    public static /* synthetic */ Double lambda$controlHighlight$136(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 100.0d;
        } else {
            d = 0.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$controlHighlight$137(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 0.2d;
        } else {
            d = 0.12d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$controlHighlight$138(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 100.0d;
        } else {
            d = 0.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$controlHighlight$139(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMinContrastDefault(new x(12), null, dynamicScheme, null));
    }

    public static /* synthetic */ Double lambda$controlHighlight$140(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 100.0d;
        } else {
            d = 0.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$controlHighlight$141(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMaxContrastDefault(new z(1), null, dynamicScheme, null));
    }

    public static /* synthetic */ Double lambda$controlNormal$133(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 30.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$error$95(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ ToneDeltaConstraint lambda$error$96(DynamicScheme dynamicScheme) {
        TonePolarity tonePolarity;
        DynamicColor errorContainer = errorContainer();
        if (dynamicScheme.isDark) {
            tonePolarity = TonePolarity.DARKER;
        } else {
            tonePolarity = TonePolarity.LIGHTER;
        }
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, errorContainer, tonePolarity);
    }

    public static /* synthetic */ Double lambda$errorContainer$90(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$inverseOnSurface$36(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            d = 95.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$inverseOnSurface$37(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    public static /* synthetic */ Double lambda$inversePrimary$62(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 40.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$inversePrimary$63(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    public static /* synthetic */ Double lambda$inverseSurface$18(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            d = 20.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralPalette.getKeyColor().getTone());
    }

    public static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralVariantPalette.getKeyColor().getTone());
    }

    public static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onBackground$14(DynamicScheme dynamicScheme) {
        return background();
    }

    public static /* synthetic */ Double lambda$onError$98(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onError$99(DynamicScheme dynamicScheme) {
        return error();
    }

    public static /* synthetic */ Double lambda$onErrorContainer$92(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onErrorContainer$93(DynamicScheme dynamicScheme) {
        return errorContainer();
    }

    public static /* synthetic */ Double lambda$onPrimary$65(DynamicScheme dynamicScheme) {
        double d;
        double d2;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d2 = 10.0d;
            } else {
                d2 = 90.0d;
            }
            return Double.valueOf(d2);
        }
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onPrimary$66(DynamicScheme dynamicScheme) {
        return primary();
    }

    public /* synthetic */ Double lambda$onPrimaryContainer$56(DynamicScheme dynamicScheme) {
        double d;
        double d2;
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(primaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d2 = 0.0d;
            } else {
                d2 = 100.0d;
            }
            return Double.valueOf(d2);
        }
        if (dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onPrimaryContainer$57(DynamicScheme dynamicScheme) {
        return primaryContainer();
    }

    public static /* synthetic */ Double lambda$onPrimaryFixed$105(DynamicScheme dynamicScheme) {
        double d = 10.0d;
        if (isMonochrome(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d = 90.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(10.0d);
    }

    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$106(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    public static /* synthetic */ Double lambda$onPrimaryFixedVariant$108(DynamicScheme dynamicScheme) {
        double d = 30.0d;
        if (isMonochrome(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d = 70.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(30.0d);
    }

    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$109(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    public static /* synthetic */ Double lambda$onSecondary$76(DynamicScheme dynamicScheme) {
        double d = 100.0d;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 10.0d;
            }
            return Double.valueOf(d);
        }
        if (dynamicScheme.isDark) {
            d = 20.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onSecondary$77(DynamicScheme dynamicScheme) {
        return secondary();
    }

    public /* synthetic */ Double lambda$onSecondaryContainer$70(DynamicScheme dynamicScheme) {
        double d;
        if (!isFidelity(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 90.0d;
            } else {
                d = 10.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(DynamicColor.contrastingTone(secondaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
    }

    public /* synthetic */ DynamicColor lambda$onSecondaryContainer$71(DynamicScheme dynamicScheme) {
        return secondaryContainer();
    }

    public static /* synthetic */ Double lambda$onSecondaryFixed$115(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$116(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    public static /* synthetic */ Double lambda$onSecondaryFixedVariant$118(DynamicScheme dynamicScheme) {
        double d;
        if (isMonochrome(dynamicScheme)) {
            d = 25.0d;
        } else {
            d = 30.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$119(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    public static /* synthetic */ Double lambda$onSurface$34(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$onSurfaceVariant$41(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 30.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onSurfaceVariant$42(DynamicScheme dynamicScheme) {
        return surfaceVariant();
    }

    public static /* synthetic */ Double lambda$onTertiary$87(DynamicScheme dynamicScheme) {
        double d;
        double d2;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d2 = 10.0d;
            } else {
                d2 = 90.0d;
            }
            return Double.valueOf(d2);
        }
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onTertiary$88(DynamicScheme dynamicScheme) {
        return tertiary();
    }

    public /* synthetic */ Double lambda$onTertiaryContainer$81(DynamicScheme dynamicScheme) {
        double d;
        double d2;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d2 = 0.0d;
            } else {
                d2 = 100.0d;
            }
            return Double.valueOf(d2);
        } else if (!isFidelity(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 90.0d;
            } else {
                d = 10.0d;
            }
            return Double.valueOf(d);
        } else {
            return Double.valueOf(DynamicColor.contrastingTone(tertiaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
    }

    public /* synthetic */ DynamicColor lambda$onTertiaryContainer$82(DynamicScheme dynamicScheme) {
        return tertiaryContainer();
    }

    public static /* synthetic */ Double lambda$onTertiaryFixed$125(DynamicScheme dynamicScheme) {
        double d;
        if (isMonochrome(dynamicScheme)) {
            d = 90.0d;
        } else {
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$126(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    public static /* synthetic */ Double lambda$onTertiaryFixedVariant$128(DynamicScheme dynamicScheme) {
        double d;
        if (isMonochrome(dynamicScheme)) {
            d = 70.0d;
        } else {
            d = 30.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$129(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    public static /* synthetic */ Double lambda$outline$44(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 60.0d;
        } else {
            d = 50.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$outlineVariant$46(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$primary$59(DynamicScheme dynamicScheme) {
        double d;
        double d2;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d2 = 100.0d;
            } else {
                d2 = 0.0d;
            }
            return Double.valueOf(d2);
        }
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ ToneDeltaConstraint lambda$primary$60(DynamicScheme dynamicScheme) {
        TonePolarity tonePolarity;
        DynamicColor primaryContainer = primaryContainer();
        if (dynamicScheme.isDark) {
            tonePolarity = TonePolarity.DARKER;
        } else {
            tonePolarity = TonePolarity.LIGHTER;
        }
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, primaryContainer, tonePolarity);
    }

    public static /* synthetic */ Double lambda$primaryContainer$54(DynamicScheme dynamicScheme) {
        double d;
        double d2;
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
        }
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d2 = 85.0d;
            } else {
                d2 = 25.0d;
            }
            return Double.valueOf(d2);
        }
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$primaryFixed$101(DynamicScheme dynamicScheme) {
        double d;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 100.0d;
            } else {
                d = 10.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(90.0d);
    }

    public static /* synthetic */ Double lambda$primaryFixedDim$103(DynamicScheme dynamicScheme) {
        double d;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 90.0d;
            } else {
                d = 20.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(80.0d);
    }

    public static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.primaryPalette.getKeyColor().getTone());
    }

    public static /* synthetic */ Double lambda$scrim$50(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    public static /* synthetic */ Double lambda$secondary$73(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ ToneDeltaConstraint lambda$secondary$74(DynamicScheme dynamicScheme) {
        TonePolarity tonePolarity;
        DynamicColor secondaryContainer = secondaryContainer();
        if (dynamicScheme.isDark) {
            tonePolarity = TonePolarity.DARKER;
        } else {
            tonePolarity = TonePolarity.LIGHTER;
        }
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, secondaryContainer, tonePolarity);
    }

    public static /* synthetic */ Double lambda$secondaryContainer$68(DynamicScheme dynamicScheme) {
        double d = 30.0d;
        if (isMonochrome(dynamicScheme)) {
            if (!dynamicScheme.isDark) {
                d = 85.0d;
            }
            return Double.valueOf(d);
        }
        if (!dynamicScheme.isDark) {
            d = 90.0d;
        }
        double d2 = d;
        if (!isFidelity(dynamicScheme)) {
            return Double.valueOf(d2);
        }
        return Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d2, !dynamicScheme.isDark)), dynamicScheme));
    }

    public static /* synthetic */ Double lambda$secondaryFixed$111(DynamicScheme dynamicScheme) {
        double d;
        if (isMonochrome(dynamicScheme)) {
            d = 80.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$secondaryFixedDim$113(DynamicScheme dynamicScheme) {
        double d;
        if (isMonochrome(dynamicScheme)) {
            d = 70.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.secondaryPalette.getKeyColor().getTone());
    }

    public static /* synthetic */ Double lambda$shadow$48(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    public static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 6.0d;
        } else {
            d = 98.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 24.0d;
        } else {
            d = 98.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$surfaceContainer$28(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 12.0d;
        } else {
            d = 94.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$surfaceContainerHigh$30(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 17.0d;
        } else {
            d = 92.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$surfaceContainerHighest$32(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 22.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$surfaceContainerLow$26(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 96.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$surfaceContainerLowest$24(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 4.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$surfaceDim$22(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 6.0d;
        } else {
            d = 87.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$surfaceTint$52(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$surfaceVariant$39(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$tertiary$84(DynamicScheme dynamicScheme) {
        double d;
        double d2;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d2 = 90.0d;
            } else {
                d2 = 25.0d;
            }
            return Double.valueOf(d2);
        }
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    public /* synthetic */ ToneDeltaConstraint lambda$tertiary$85(DynamicScheme dynamicScheme) {
        TonePolarity tonePolarity;
        DynamicColor tertiaryContainer = tertiaryContainer();
        if (dynamicScheme.isDark) {
            tonePolarity = TonePolarity.DARKER;
        } else {
            tonePolarity = TonePolarity.LIGHTER;
        }
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, tertiaryContainer, tonePolarity);
    }

    public static /* synthetic */ Double lambda$tertiaryContainer$79(DynamicScheme dynamicScheme) {
        double d;
        double d2;
        if (isMonochrome(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d2 = 60.0d;
            } else {
                d2 = 49.0d;
            }
            return Double.valueOf(d2);
        } else if (!isFidelity(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 30.0d;
            } else {
                d = 90.0d;
            }
            return Double.valueOf(d);
        } else {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
    }

    public static /* synthetic */ Double lambda$tertiaryFixed$121(DynamicScheme dynamicScheme) {
        double d;
        if (isMonochrome(dynamicScheme)) {
            d = 40.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$tertiaryFixedDim$123(DynamicScheme dynamicScheme) {
        double d;
        if (isMonochrome(dynamicScheme)) {
            d = 30.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.tertiaryPalette.getKeyColor().getTone());
    }

    public static /* synthetic */ Double lambda$textHintInverse$151(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$textPrimaryInverse$143(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$147(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$145(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$149(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static double performAlbers(Hct hct, DynamicScheme dynamicScheme) {
        Hct inViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        if (DynamicColor.tonePrefersLightForeground(hct.getTone()) && !DynamicColor.toneAllowsLightForeground(inViewingConditions.getTone())) {
            return DynamicColor.enableLightForeground(hct.getTone());
        }
        return DynamicColor.enableLightForeground(inViewingConditions.getTone());
    }

    private static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 80.0d;
        }
        return ViewingConditions.defaultWithBackgroundLstar(d);
    }

    public DynamicColor background() {
        return DynamicColor.fromPalette(new q(9), new x(9));
    }

    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette(new d0(3), new o(3), null);
    }

    public DynamicColor controlHighlight() {
        return new DynamicColor(new q(5), new x(6), new y(10), new h(8), null, new z(5), new d0(9), null);
    }

    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette(new n(10), new v(10));
    }

    public DynamicColor error() {
        return DynamicColor.fromPalette(new n(2), new v(3), new w(this, 2), new r(this, 1));
    }

    public DynamicColor errorContainer() {
        return DynamicColor.fromPalette(new h(13), new z(10), new a0(this, 3));
    }

    public DynamicColor highestSurface(DynamicScheme dynamicScheme) {
        if (dynamicScheme.isDark) {
            return surfaceBright();
        }
        return surfaceDim();
    }

    public DynamicColor inverseOnSurface() {
        return DynamicColor.fromPalette(new z(9), new d0(12), new b0(this, 2));
    }

    public DynamicColor inversePrimary() {
        return DynamicColor.fromPalette(new o(2), new n(3), new t(this, 0));
    }

    public DynamicColor inverseSurface() {
        return DynamicColor.fromPalette(new d0(1), new o(1));
    }

    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette(new v(12), new q(10));
    }

    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette(new h(5), new z(3));
    }

    public DynamicColor onBackground() {
        return DynamicColor.fromPalette(new h(14), new z(11), new a0(this, 4));
    }

    public DynamicColor onError() {
        return DynamicColor.fromPalette(new v(7), new q(3), new r(this, 2));
    }

    public DynamicColor onErrorContainer() {
        return DynamicColor.fromPalette(new d0(0), new o(0), new p(this, 0));
    }

    public DynamicColor onPrimary() {
        return DynamicColor.fromPalette(new d0(4), new o(4), new p(this, 1));
    }

    public DynamicColor onPrimaryContainer() {
        return DynamicColor.fromPalette(new q(12), new r(this, 5), new u(this, 3), null);
    }

    public DynamicColor onPrimaryFixed() {
        return DynamicColor.fromPalette(new n(5), new v(6), new w(this, 4));
    }

    public DynamicColor onPrimaryFixedVariant() {
        return DynamicColor.fromPalette(new h(9), new z(6), new a0(this, 1));
    }

    public DynamicColor onSecondary() {
        return DynamicColor.fromPalette(new d0(7), new o(7), new p(this, 2));
    }

    public DynamicColor onSecondaryContainer() {
        return DynamicColor.fromPalette(new y(14), new c0(this, 4), new s(this, 6));
    }

    public DynamicColor onSecondaryFixed() {
        return DynamicColor.fromPalette(new x(1), new y(1), new c0(this, 0));
    }

    public DynamicColor onSecondaryFixedVariant() {
        return DynamicColor.fromPalette(new q(11), new x(11), new u(this, 2));
    }

    public DynamicColor onSurface() {
        return DynamicColor.fromPalette(new y(4), new h(4), new s(this, 1));
    }

    public DynamicColor onSurfaceVariant() {
        return DynamicColor.fromPalette(new y(8), new h(6), new s(this, 3));
    }

    public DynamicColor onTertiary() {
        return DynamicColor.fromPalette(new y(9), new h(7), new s(this, 4));
    }

    public DynamicColor onTertiaryContainer() {
        return DynamicColor.fromPalette(new q(7), new r(this, 4), new u(this, 1));
    }

    public DynamicColor onTertiaryFixed() {
        return DynamicColor.fromPalette(new v(8), new q(4), new r(this, 3));
    }

    public DynamicColor onTertiaryFixedVariant() {
        return DynamicColor.fromPalette(new o(13), new n(14), new t(this, 3));
    }

    public DynamicColor outline() {
        return DynamicColor.fromPalette(new x(10), new y(13), new c0(this, 3));
    }

    public DynamicColor outlineVariant() {
        return DynamicColor.fromPalette(new x(5), new y(7), new c0(this, 2));
    }

    public DynamicColor primary() {
        return DynamicColor.fromPalette(new x(3), new y(5), new c0(this, 1), new s(this, 2));
    }

    public DynamicColor primaryContainer() {
        return DynamicColor.fromPalette(new n(0), new v(0), new w(this, 0));
    }

    public DynamicColor primaryFixed() {
        return DynamicColor.fromPalette(new v(2), new q(0), new r(this, 0));
    }

    public DynamicColor primaryFixedDim() {
        return DynamicColor.fromPalette(new n(4), new v(4), new w(this, 3));
    }

    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette(new q(1), new x(2));
    }

    public DynamicColor scrim() {
        return DynamicColor.fromPalette(new d0(5), new o(5));
    }

    public DynamicColor secondary() {
        return DynamicColor.fromPalette(new h(1), new z(0), new a0(this, 0), new b0(this, 0));
    }

    public DynamicColor secondaryContainer() {
        return DynamicColor.fromPalette(new y(11), new h(11), new s(this, 5));
    }

    public DynamicColor secondaryFixed() {
        return DynamicColor.fromPalette(new n(1), new v(1), new w(this, 1));
    }

    public DynamicColor secondaryFixedDim() {
        return DynamicColor.fromPalette(new y(2), new h(2), new s(this, 0));
    }

    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette(new y(3), new h(3));
    }

    public DynamicColor shadow() {
        return DynamicColor.fromPalette(new d0(8), new o(8));
    }

    public DynamicColor surface() {
        return DynamicColor.fromPalette(new z(8), new d0(11));
    }

    public DynamicColor surfaceBright() {
        return DynamicColor.fromPalette(new d0(10), new o(11));
    }

    public DynamicColor surfaceContainer() {
        return DynamicColor.fromPalette(new o(6), new n(6));
    }

    public DynamicColor surfaceContainerHigh() {
        return DynamicColor.fromPalette(new n(11), new v(11));
    }

    public DynamicColor surfaceContainerHighest() {
        return DynamicColor.fromPalette(new y(12), new h(12));
    }

    public DynamicColor surfaceContainerLow() {
        return DynamicColor.fromPalette(new z(4), new d0(6));
    }

    public DynamicColor surfaceContainerLowest() {
        return DynamicColor.fromPalette(new v(5), new q(2));
    }

    public DynamicColor surfaceDim() {
        return DynamicColor.fromPalette(new o(12), new n(12));
    }

    public DynamicColor surfaceTint() {
        return DynamicColor.fromPalette(new z(2), new d0(2));
    }

    public DynamicColor surfaceVariant() {
        return DynamicColor.fromPalette(new v(14), new q(13));
    }

    public DynamicColor tertiary() {
        return DynamicColor.fromPalette(new h(10), new z(7), new a0(this, 2), new b0(this, 1));
    }

    public DynamicColor tertiaryContainer() {
        return DynamicColor.fromPalette(new q(6), new x(7), new u(this, 0));
    }

    public DynamicColor tertiaryFixed() {
        return DynamicColor.fromPalette(new o(10), new n(9), new t(this, 2));
    }

    public DynamicColor tertiaryFixedDim() {
        return DynamicColor.fromPalette(new o(9), new n(8), new t(this, 1));
    }

    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette(new o(14), new n(15));
    }

    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette(new q(8), new x(8));
    }

    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette(new x(4), new y(6));
    }

    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette(new n(13), new v(13));
    }

    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette(new x(0), new y(0));
    }

    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette(new n(7), new v(9));
    }
}
