package com.kwad.components.core.video;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class VideoAdapters {

    /* renamed from: com.kwad.components.core.video.VideoAdapters$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] SS;

        static {
            int[] iArr = new int[AdaptType.values().length];
            SS = iArr;
            try {
                iArr[AdaptType.PORTRAIT_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                SS[AdaptType.LANDSCAPE_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                SS[AdaptType.PORTRAIT_HORIZONTAL.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                SS[AdaptType.LANDSCAPE_VERTICAL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* loaded from: classes.dex */
    enum AdaptType {
        PORTRAIT_VERTICAL,
        PORTRAIT_HORIZONTAL,
        LANDSCAPE_VERTICAL,
        LANDSCAPE_HORIZONTAL
    }

    /* loaded from: classes.dex */
    public static abstract class a implements com.kwad.components.core.video.c {
        private static boolean b(View view, View view2, int i, int i2) {
            if (view == null || i == 0 || i2 == 0 || view2 == null) {
                return false;
            }
            return (view2.getWidth() == 0 || view2.getHeight() == 0) ? false : true;
        }

        @Override // com.kwad.components.core.video.c
        public final void a(View view, View view2, int i, int i2) {
            if (!b(view, view2, i, i2)) {
                com.kwad.sdk.core.e.c.d("AbstractVideoViewAdapter", "adaptVideo checkArguments invalid");
                return;
            }
            d dVar = new d(view2.getWidth(), view2.getHeight());
            d dVar2 = new d(i, i2);
            boolean z = dVar2.getRatio() >= 1.0f;
            boolean z2 = dVar.getRatio() >= 1.0f;
            AdaptType adaptType = (z2 && z) ? AdaptType.PORTRAIT_VERTICAL : z2 ? AdaptType.PORTRAIT_HORIZONTAL : z ? AdaptType.LANDSCAPE_VERTICAL : AdaptType.LANDSCAPE_HORIZONTAL;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            a(adaptType, layoutParams, dVar, dVar2);
            view.setLayoutParams(layoutParams);
        }

        protected abstract void a(AdaptType adaptType, ViewGroup.LayoutParams layoutParams, d dVar, d dVar2);
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        private float ST = 0.8f;
        private float SU = 0.9375f;
        private float SV = 1.1046f;

        @Override // com.kwad.components.core.video.VideoAdapters.a
        protected final void a(AdaptType adaptType, ViewGroup.LayoutParams layoutParams, d dVar, d dVar2) {
            float rb;
            float f;
            float rc = dVar.rc();
            float rc2 = dVar2.rc();
            float rb2 = dVar.rb();
            float ra = dVar.ra();
            com.kwad.sdk.core.e.c.d("FullHeightAdapter", "onAdaptVideo containerSize: " + ra + ", " + rb2);
            int i = AnonymousClass1.SS[adaptType.ordinal()];
            if (i == 1 || i == 2) {
                if (rc > rc2) {
                    float ra2 = dVar.ra();
                    float f2 = ra2 / rc2;
                    float f3 = this.ST;
                    if (rb2 / f2 >= f3) {
                        f = ra2;
                        rb = f2;
                    } else {
                        rb = rb2 / f3;
                        f = rb * rc2;
                    }
                } else {
                    rb = dVar.rb();
                    f = rc2 * rb;
                    float f4 = this.SU;
                    if (ra / f < f4) {
                        f = ra / f4;
                        rb = f / rc2;
                    }
                }
            } else if (i == 3 || i == 4) {
                f = rb2 * this.SV;
                rb = f / rc2;
            } else {
                rb = -2.14748365E9f;
                f = -2.14748365E9f;
            }
            com.kwad.sdk.core.e.c.d("FullHeightAdapter", "onAdaptVideo result: " + f + ", " + rb);
            if (f == -2.14748365E9f || rb == -2.14748365E9f) {
                return;
            }
            int i2 = (int) rb;
            if (dVar2.getHeight() >= dVar2.getWidth()) {
                layoutParams.width = i2;
                layoutParams.height = (int) f;
                return;
            }
            layoutParams.height = i2;
            layoutParams.width = (int) f;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends a {
        @Override // com.kwad.components.core.video.VideoAdapters.a
        protected final void a(AdaptType adaptType, ViewGroup.LayoutParams layoutParams, d dVar, d dVar2) {
            float ra;
            float rb;
            float rc = dVar.rc();
            float rc2 = dVar2.rc();
            int i = AnonymousClass1.SS[adaptType.ordinal()];
            if (i == 1 || i == 2) {
                if (rc >= rc2) {
                    rb = dVar.rb();
                    ra = rb * rc2;
                } else {
                    ra = dVar.ra();
                    rb = ra / rc2;
                }
            } else if (i == 3 || i == 4) {
                ra = dVar.rb();
                rb = ra / rc2;
            } else {
                ra = 0.0f;
                rb = -2.14748365E9f;
            }
            if (rb == -2.14748365E9f || ra == -2.14748365E9f) {
                return;
            }
            int i2 = (int) rb;
            if (dVar2.getHeight() > dVar2.getWidth()) {
                layoutParams.width = i2;
                layoutParams.height = (int) ra;
                return;
            }
            layoutParams.height = i2;
            layoutParams.width = (int) ra;
        }
    }

    /* loaded from: classes.dex */
    static class d {
        float SW;
        float height;
        float width;

        public d(float f, float f2) {
            this.SW = -1.0f;
            this.width = f;
            this.height = f2;
            if (f <= 0.0f || f2 <= 0.0f) {
                return;
            }
            this.SW = f2 / f;
        }

        private boolean isValid() {
            return this.width > 0.0f && this.height > 0.0f;
        }

        public final float getHeight() {
            return this.height;
        }

        public final float getRatio() {
            return this.SW;
        }

        public final float getWidth() {
            return this.width;
        }

        public final float ra() {
            if (isValid()) {
                return Math.max(this.width, this.height);
            }
            return -1.0f;
        }

        public final float rb() {
            if (isValid()) {
                return Math.min(this.width, this.height);
            }
            return -1.0f;
        }

        public final float rc() {
            if (isValid()) {
                float f = this.height;
                float f2 = this.width;
                return f > f2 ? f / f2 : f2 / f;
            }
            return -1.0f;
        }

        public final String toString() {
            return "ViewSize{width=" + this.width + ", height=" + this.height + ", ratio=" + this.SW + '}';
        }
    }
}
