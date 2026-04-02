package com.kwad.sdk.utils;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes3.dex */
public final class ac {

    /* loaded from: classes3.dex */
    public static class a {
        private int aIR;
        private int aIS;
        private int aIT;
        private int aIU;
        private int mHeight;
        private int mWidth;

        public a() {
            this.mWidth = -1;
            this.mHeight = -1;
            this.aIR = -1;
            this.aIS = -1;
            this.aIT = -1;
            this.aIU = -1;
        }

        public a(int i, int i2) {
            this.mWidth = -1;
            this.mHeight = -1;
            this.aIR = -1;
            this.aIS = -1;
            this.aIT = -1;
            this.aIU = -1;
            this.mWidth = i;
            this.mHeight = i2;
        }

        public final int IG() {
            return this.aIR;
        }

        public final int IH() {
            return this.aIS;
        }

        public final int II() {
            return this.aIT;
        }

        public final int IJ() {
            return this.aIU;
        }

        public final void f(float f, float f2) {
            this.aIR = (int) f;
            this.aIS = (int) f2;
        }

        public final void g(float f, float f2) {
            this.aIT = (int) f;
            this.aIU = (int) f2;
        }

        public final int getHeight() {
            return this.mHeight;
        }

        public final int getWidth() {
            return this.mWidth;
        }

        public final String toString() {
            return "TouchCoords{mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + ", mDownX=" + this.aIR + ", mDownY=" + this.aIS + ", mUpX=" + this.aIT + ", mUpY=" + this.aIU + '}';
        }

        public final void x(int i, int i2) {
            this.mWidth = i;
            this.mHeight = i2;
        }
    }

    public static String a(String str, a aVar) {
        return (TextUtils.isEmpty(str) || aVar == null) ? str : str.replace("__WIDTH__", dd(aVar.getWidth())).replace("__HEIGHT__", dd(aVar.getHeight())).replace("__DOWN_X__", dd(aVar.IG())).replace("__DOWN_Y__", dd(aVar.IH())).replace("__UP_X__", dd(aVar.II())).replace("__UP_Y__", dd(aVar.IJ()));
    }

    public static String aj(Context context, String str) {
        return TextUtils.isEmpty(str) ? str : str.replace("__SCREEN_WIDTH__", String.valueOf(k.getScreenWidth(context))).replace("__SCREEN_HEIGHT__", String.valueOf(k.getScreenHeight(context))).replace("__DEVICE_WIDTH__", String.valueOf(k.bU(context))).replace("__DEVICE_HEIGHT__", String.valueOf(k.bV(context)));
    }

    public static String c(Context context, String str, boolean z) {
        return str.replace("__TS__", String.valueOf(bg.v(context, z)));
    }

    private static String dd(int i) {
        return i >= 0 ? String.valueOf(i) : "-999";
    }
}
