package com.android.support.v4.main;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
/* loaded from: classes3.dex */
public class aa {
    public static AlertDialog.Builder alert;
    private static TextView but;
    private static TextView but1;
    private static LinearLayout button;
    private static LinearLayout dialog;
    static boolean drk = false;
    private static TextView message;
    private static TextView title;

    /* loaded from: classes3.dex */
    public static class desl {
        /* JADX WARN: Type inference failed for: r5v11, types: [com.android.support.v4.main.aa$desl$100000000] */
        public static char[] dsl() {
            new String();
            String lllI = !aa.drk ? o.lllI(433) : o.lllI(421);
            try {
                aa.alert.getClass().getDeclaredMethod(o.lllI(450), Boolean.TYPE).invoke(aa.alert, new Boolean(false));
                aa.button.setLayoutParams(aa.access$1000011());
                aa.button.setPadding(0, 0, 0, 0);
                aa.dialog.setPadding(50, 50, 50, 50);
                aa.dialog.setElevation(0.0f);
                aa.dialog.setOrientation(1);
                aa.dialog.setBackgroundDrawable(new GradientDrawable() { // from class: com.android.support.v4.main.aa.desl.100000000
                    public GradientDrawable getIns(int i2, String str) {
                        setCornerRadius(i2);
                        setColor(Color.parseColor(str));
                        return this;
                    }
                }.getIns(0, lllI));
                aa.dialog.setLayoutParams(aa.access$1000011());
                return new char[]{'a', 'h', '6', '8', 'd', 'g', 'o', 'l', 'd', 'e', 'n', 'b', 'o', 'o', 't'};
            } catch (Exception e2) {
                Log.e(o.lllI(483), e2.toString());
                throw null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class dest {
        public static byte[] dst() {
            aa.title.setPadding(5, 10, 0, 50);
            aa.title.setGravity(17);
            aa.title.setTextSize(18.0f);
            aa.title.setTextColor(Color.parseColor(new String(a.he(new String(g.a)))));
            aa.title.setLayoutParams(aa.access$1000011());
            aa.message.setLayoutParams(aa.access$1000011());
            aa.message.setGravity(17);
            aa.message.setPadding(5, 10, 5, 10);
            aa.message.setTextSize(16.0f);
            new String();
            aa.message.setTextColor(Color.parseColor(!aa.drk ? o.lllI(872) : o.lllI(860)));
            aa.but.setGravity(3);
            aa.but1.setGravity(5);
            aa.but.setTextSize(15.0f);
            aa.but.setPadding(20, 5, 20, 5);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 15, 0);
            aa.but.setLayoutParams(layoutParams);
            aa.but1.setLayoutParams(aa.access$1000011());
            aa.but1.setPadding(20, 5, 20, 5);
            aa.but.setTextColor(-1);
            aa.but1.setTextSize(15.0f);
            aa.but1.setTextColor(-1);
            return new byte[]{(byte) 68, (byte) 47, (byte) 67, (byte) 87, (byte) 67};
        }
    }

    /* loaded from: classes3.dex */
    public static class fn {
        public static byte[] fne() {
            return new byte[]{(byte) 97, (byte) 110, (byte) 100, (byte) 114, (byte) FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, (byte) 105, (byte) 100, (byte) 46, (byte) 97, (byte) SyslogConstants.LOG_ALERT, (byte) SyslogConstants.LOG_ALERT, (byte) 46, (byte) 68, (byte) 105, (byte) 97, (byte) 108, (byte) FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, (byte) FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT};
        }
    }

    /* loaded from: classes3.dex */
    public static class o {
        static String lllI(int i2) {
            if (i2 != -1 || i2 == -2 || i2 == -3 || i2 == -4) {
            }
            try {
                if (i2 == 421) {
                    byte[] bArr = new byte[7];
                    bArr[0] = (byte) (-122);
                    bArr[1] = (byte) (-107);
                    bArr[2] = (byte) (-107);
                    bArr[3] = (byte) (-107);
                    bArr[4] = (byte) (-107);
                    bArr[5] = (byte) (-107);
                    bArr[6] = (byte) (-107);
                    for (int i3 = 0; i3 < bArr.length; i3++) {
                        bArr[i3] = (byte) (bArr[i3] ^ i2);
                    }
                    return new String(bArr, "UTF-8");
                } else if (i2 == 433) {
                    byte[] bArr2 = new byte[7];
                    bArr2[0] = (byte) (-110);
                    bArr2[1] = (byte) (-41);
                    bArr2[2] = (byte) (-41);
                    bArr2[3] = (byte) (-41);
                    bArr2[4] = (byte) (-41);
                    bArr2[5] = (byte) (-41);
                    bArr2[6] = (byte) (-41);
                    for (int i4 = 0; i4 < bArr2.length; i4++) {
                        bArr2[i4] = (byte) (bArr2[i4] ^ i2);
                    }
                    return new String(bArr2, "UTF-8");
                } else if (i2 == 450) {
                    byte[] bArr3 = new byte[13];
                    bArr3[0] = (byte) (-79);
                    bArr3[1] = (byte) (-89);
                    bArr3[2] = (byte) (-74);
                    bArr3[3] = (byte) (-127);
                    bArr3[4] = (byte) (-93);
                    bArr3[5] = (byte) (-84);
                    bArr3[6] = (byte) (-95);
                    bArr3[7] = (byte) (-89);
                    bArr3[8] = (byte) (-82);
                    bArr3[9] = (byte) (-93);
                    bArr3[10] = (byte) (-96);
                    bArr3[11] = (byte) (-82);
                    bArr3[12] = (byte) (-89);
                    for (int i5 = 0; i5 < bArr3.length; i5++) {
                        bArr3[i5] = (byte) (bArr3[i5] ^ i2);
                    }
                    return new String(bArr3, "UTF-8");
                } else if (i2 == 483) {
                    byte[] bArr4 = new byte[11];
                    bArr4[0] = (byte) (-128);
                    bArr4[1] = (byte) (-126);
                    bArr4[2] = (byte) (-115);
                    bArr4[3] = (byte) (-128);
                    bArr4[4] = (byte) (-122);
                    bArr4[5] = (byte) (-113);
                    bArr4[6] = (byte) (-90);
                    bArr4[7] = (byte) (-111);
                    bArr4[8] = (byte) (-111);
                    bArr4[9] = (byte) (-116);
                    bArr4[10] = (byte) (-111);
                    for (int i6 = 0; i6 < bArr4.length; i6++) {
                        bArr4[i6] = (byte) (bArr4[i6] ^ i2);
                    }
                    return new String(bArr4, "UTF-8");
                } else if (i2 == 860) {
                    byte[] bArr5 = new byte[7];
                    bArr5[0] = (byte) 127;
                    bArr5[1] = (byte) 58;
                    bArr5[2] = (byte) 58;
                    bArr5[3] = (byte) 58;
                    bArr5[4] = (byte) 58;
                    bArr5[5] = (byte) 58;
                    bArr5[6] = (byte) 58;
                    for (int i7 = 0; i7 < bArr5.length; i7++) {
                        bArr5[i7] = (byte) (bArr5[i7] ^ i2);
                    }
                    return new String(bArr5, "UTF-8");
                } else if (i2 == 872) {
                    byte[] bArr6 = new byte[7];
                    bArr6[0] = (byte) 75;
                    bArr6[1] = (byte) 88;
                    bArr6[2] = (byte) 88;
                    bArr6[3] = (byte) 88;
                    bArr6[4] = (byte) 88;
                    bArr6[5] = (byte) 88;
                    bArr6[6] = (byte) 88;
                    for (int i8 = 0; i8 < bArr6.length; i8++) {
                        bArr6[i8] = (byte) (bArr6[i8] ^ i2);
                    }
                    return new String(bArr6, "UTF-8");
                } else if (i2 == 1096) {
                    byte[] bArr7 = new byte[0];
                    for (int i9 = 0; i9 < bArr7.length; i9++) {
                        bArr7[i9] = (byte) (bArr7[i9] ^ i2);
                    }
                    return new String(bArr7, "UTF-8");
                } else if (i2 == 1104) {
                    byte[] bArr8 = new byte[0];
                    for (int i10 = 0; i10 < bArr8.length; i10++) {
                        bArr8[i10] = (byte) (bArr8[i10] ^ i2);
                    }
                    return new String(bArr8, "UTF-8");
                } else if (i2 == 1117) {
                    byte[] bArr9 = new byte[3];
                    bArr9[0] = (byte) FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION;
                    bArr9[1] = (byte) FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
                    bArr9[2] = (byte) FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD;
                    for (int i11 = 0; i11 < bArr9.length; i11++) {
                        bArr9[i11] = (byte) (bArr9[i11] ^ i2);
                    }
                    return new String(bArr9, "UTF-8");
                } else if (i2 == 1127) {
                    byte[] bArr10 = new byte[0];
                    for (int i12 = 0; i12 < bArr10.length; i12++) {
                        bArr10[i12] = (byte) (bArr10[i12] ^ i2);
                    }
                    return new String(bArr10, "UTF-8");
                } else if (i2 == 1139) {
                    byte[] bArr11 = new byte[0];
                    for (int i13 = 0; i13 < bArr11.length; i13++) {
                        bArr11[i13] = (byte) (bArr11[i13] ^ i2);
                    }
                    return new String(bArr11, "UTF-8");
                } else if (i2 == 1146) {
                    byte[] bArr12 = new byte[0];
                    for (int i14 = 0; i14 < bArr12.length; i14++) {
                        bArr12[i14] = (byte) (bArr12[i14] ^ i2);
                    }
                    return new String(bArr12, "UTF-8");
                } else if (i2 == 1154) {
                    byte[] bArr13 = new byte[0];
                    for (int i15 = 0; i15 < bArr13.length; i15++) {
                        bArr13[i15] = (byte) (bArr13[i15] ^ i2);
                    }
                    return new String(bArr13, "UTF-8");
                } else if (i2 == 1275) {
                    byte[] bArr14 = new byte[9];
                    bArr14[0] = (byte) (-113);
                    bArr14[1] = (byte) (-110);
                    bArr14[2] = (byte) (-113);
                    bArr14[3] = (byte) (-105);
                    bArr14[4] = (byte) (-98);
                    bArr14[5] = (byte) (-43);
                    bArr14[6] = (byte) (-113);
                    bArr14[7] = (byte) (-113);
                    bArr14[8] = (byte) (-99);
                    for (int i16 = 0; i16 < bArr14.length; i16++) {
                        bArr14[i16] = (byte) (bArr14[i16] ^ i2);
                    }
                    return new String(bArr14, "UTF-8");
                } else if (i2 == 1298) {
                    byte[] bArr15 = new byte[11];
                    bArr15[0] = (byte) 127;
                    bArr15[1] = (byte) 119;
                    bArr15[2] = (byte) 97;
                    bArr15[3] = (byte) 97;
                    bArr15[4] = (byte) 115;
                    bArr15[5] = (byte) 117;
                    bArr15[6] = (byte) 119;
                    bArr15[7] = (byte) 60;
                    bArr15[8] = (byte) FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
                    bArr15[9] = (byte) FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH;
                    bArr15[10] = (byte) 116;
                    for (int i17 = 0; i17 < bArr15.length; i17++) {
                        bArr15[i17] = (byte) (bArr15[i17] ^ i2);
                    }
                    return new String(bArr15, "UTF-8");
                } else if (i2 == 1321) {
                    byte[] bArr16 = new byte[10];
                    bArr16[0] = (byte) 75;
                    bArr16[1] = (byte) 92;
                    bArr16[2] = (byte) 93;
                    bArr16[3] = (byte) 93;
                    bArr16[4] = (byte) 70;
                    bArr16[5] = (byte) 71;
                    bArr16[6] = (byte) 7;
                    bArr16[7] = (byte) 93;
                    bArr16[8] = (byte) 93;
                    bArr16[9] = (byte) 79;
                    for (int i18 = 0; i18 < bArr16.length; i18++) {
                        bArr16[i18] = (byte) (bArr16[i18] ^ i2);
                    }
                    return new String(bArr16, "UTF-8");
                } else if (i2 == 1344) {
                    byte[] bArr17 = new byte[10];
                    bArr17[0] = (byte) 34;
                    bArr17[1] = (byte) 53;
                    bArr17[2] = (byte) 52;
                    bArr17[3] = (byte) 52;
                    bArr17[4] = (byte) 47;
                    bArr17[5] = (byte) 46;
                    bArr17[6] = (byte) 110;
                    bArr17[7] = (byte) 52;
                    bArr17[8] = (byte) 52;
                    bArr17[9] = (byte) 38;
                    for (int i19 = 0; i19 < bArr17.length; i19++) {
                        bArr17[i19] = (byte) (bArr17[i19] ^ i2);
                    }
                    return new String(bArr17, "UTF-8");
                } else if (i2 == 1717) {
                    byte[] bArr18 = new byte[7];
                    bArr18[0] = (byte) (-47);
                    bArr18[1] = (byte) (-36);
                    bArr18[2] = (byte) (-58);
                    bArr18[3] = (byte) (-40);
                    bArr18[4] = (byte) (-36);
                    bArr18[5] = (byte) (-58);
                    bArr18[6] = (byte) (-58);
                    for (int i20 = 0; i20 < bArr18.length; i20++) {
                        bArr18[i20] = (byte) (bArr18[i20] ^ i2);
                    }
                    return new String(bArr18, "UTF-8");
                } else if (i2 == 1732) {
                    byte[] bArr19 = new byte[13];
                    bArr19[0] = (byte) (-73);
                    bArr19[1] = (byte) (-80);
                    bArr19[2] = (byte) (-91);
                    bArr19[3] = (byte) (-74);
                    bArr19[4] = (byte) (-80);
                    bArr19[5] = (byte) (-123);
                    bArr19[6] = (byte) (-89);
                    bArr19[7] = (byte) (-80);
                    bArr19[8] = (byte) (-83);
                    bArr19[9] = (byte) (-78);
                    bArr19[10] = (byte) (-83);
                    bArr19[11] = (byte) (-80);
                    bArr19[12] = (byte) (-67);
                    for (int i21 = 0; i21 < bArr19.length; i21++) {
                        bArr19[i21] = (byte) (bArr19[i21] ^ i2);
                    }
                    return new String(bArr19, "UTF-8");
                } else if (i2 == 1816) {
                    byte[] bArr20 = new byte[13];
                    bArr20[0] = (byte) 124;
                    bArr20[1] = (byte) 113;
                    bArr20[2] = (byte) FacebookMediationAdapter.ERROR_NULL_CONTEXT;
                    bArr20[3] = (byte) 117;
                    bArr20[4] = (byte) 113;
                    bArr20[5] = (byte) FacebookMediationAdapter.ERROR_NULL_CONTEXT;
                    bArr20[6] = (byte) FacebookMediationAdapter.ERROR_NULL_CONTEXT;
                    bArr20[7] = (byte) 42;
                    bArr20[8] = (byte) 93;
                    bArr20[9] = (byte) 106;
                    bArr20[10] = (byte) 106;
                    bArr20[11] = (byte) 119;
                    bArr20[12] = (byte) 106;
                    for (int i22 = 0; i22 < bArr20.length; i22++) {
                        bArr20[i22] = (byte) (bArr20[i22] ^ i2);
                    }
                    return new String(bArr20, "UTF-8");
                } else if (i2 == 1884) {
                    byte[] bArr21 = new byte[7];
                    bArr21[0] = (byte) 56;
                    bArr21[1] = (byte) 53;
                    bArr21[2] = (byte) 47;
                    bArr21[3] = (byte) 49;
                    bArr21[4] = (byte) 53;
                    bArr21[5] = (byte) 47;
                    bArr21[6] = (byte) 47;
                    for (int i23 = 0; i23 < bArr21.length; i23++) {
                        bArr21[i23] = (byte) (bArr21[i23] ^ i2);
                    }
                    return new String(bArr21, "UTF-8");
                } else if (i2 == 1909) {
                    byte[] bArr22 = new byte[13];
                    bArr22[0] = (byte) 17;
                    bArr22[1] = (byte) 28;
                    bArr22[2] = (byte) 6;
                    bArr22[3] = (byte) 24;
                    bArr22[4] = (byte) 28;
                    bArr22[5] = (byte) 6;
                    bArr22[6] = (byte) 6;
                    bArr22[7] = (byte) 68;
                    bArr22[8] = (byte) 48;
                    bArr22[9] = (byte) 7;
                    bArr22[10] = (byte) 7;
                    bArr22[11] = (byte) 26;
                    bArr22[12] = (byte) 7;
                    for (int i24 = 0; i24 < bArr22.length; i24++) {
                        bArr22[i24] = (byte) (bArr22[i24] ^ i2);
                    }
                    return new String(bArr22, "UTF-8");
                } else if (i2 == 1945) {
                    byte[] bArr23 = new byte[7];
                    bArr23[0] = (byte) (-22);
                    bArr23[1] = (byte) (-4);
                    bArr23[2] = (byte) (-19);
                    bArr23[3] = (byte) (-51);
                    bArr23[4] = (byte) (-4);
                    bArr23[5] = (byte) (-31);
                    bArr23[6] = (byte) (-19);
                    for (int i25 = 0; i25 < bArr23.length; i25++) {
                        bArr23[i25] = (byte) (bArr23[i25] ^ i2);
                    }
                    return new String(bArr23, "UTF-8");
                } else if (i2 == 1994) {
                    byte[] bArr24 = new byte[7];
                    bArr24[0] = (byte) (-71);
                    bArr24[1] = (byte) (-81);
                    bArr24[2] = (byte) (-66);
                    bArr24[3] = (byte) (-98);
                    bArr24[4] = (byte) (-81);
                    bArr24[5] = (byte) (-78);
                    bArr24[6] = (byte) (-66);
                    for (int i26 = 0; i26 < bArr24.length; i26++) {
                        bArr24[i26] = (byte) (bArr24[i26] ^ i2);
                    }
                    return new String(bArr24, "UTF-8");
                } else if (i2 == 2043) {
                    byte[] bArr25 = new byte[7];
                    bArr25[0] = (byte) (-120);
                    bArr25[1] = (byte) (-98);
                    bArr25[2] = (byte) (-113);
                    bArr25[3] = (byte) (-81);
                    bArr25[4] = (byte) (-98);
                    bArr25[5] = (byte) (-125);
                    bArr25[6] = (byte) (-113);
                    for (int i27 = 0; i27 < bArr25.length; i27++) {
                        bArr25[i27] = (byte) (bArr25[i27] ^ i2);
                    }
                    return new String(bArr25, "UTF-8");
                } else if (i2 == 2092) {
                    byte[] bArr26 = new byte[7];
                    bArr26[0] = (byte) 95;
                    bArr26[1] = (byte) 73;
                    bArr26[2] = (byte) 88;
                    bArr26[3] = (byte) SyslogConstants.LOG_CLOCK;
                    bArr26[4] = (byte) 73;
                    bArr26[5] = (byte) 84;
                    bArr26[6] = (byte) 88;
                    for (int i28 = 0; i28 < bArr26.length; i28++) {
                        bArr26[i28] = (byte) (bArr26[i28] ^ i2);
                    }
                    return new String(bArr26, "UTF-8");
                } else if (i2 == 2147) {
                    byte[] bArr27 = new byte[9];
                    bArr27[0] = (byte) 55;
                    bArr27[1] = (byte) 6;
                    bArr27[2] = (byte) 27;
                    bArr27[3] = (byte) 23;
                    bArr27[4] = (byte) 38;
                    bArr27[5] = (byte) 17;
                    bArr27[6] = (byte) 17;
                    bArr27[7] = (byte) 12;
                    bArr27[8] = (byte) 17;
                    for (int i29 = 0; i29 < bArr27.length; i29++) {
                        bArr27[i29] = (byte) (bArr27[i29] ^ i2);
                    }
                    return new String(bArr27, "UTF-8");
                } else if (i2 == 2177) {
                    byte[] bArr28 = new byte[17];
                    bArr28[0] = (byte) (-14);
                    bArr28[1] = (byte) (-28);
                    bArr28[2] = (byte) (-11);
                    bArr28[3] = (byte) (-52);
                    bArr28[4] = (byte) (-18);
                    bArr28[5] = (byte) (-9);
                    bArr28[6] = (byte) (-28);
                    bArr28[7] = (byte) (-20);
                    bArr28[8] = (byte) (-28);
                    bArr28[9] = (byte) (-17);
                    bArr28[10] = (byte) (-11);
                    bArr28[11] = (byte) (-52);
                    bArr28[12] = (byte) (-28);
                    bArr28[13] = (byte) (-11);
                    bArr28[14] = (byte) (-23);
                    bArr28[15] = (byte) (-18);
                    bArr28[16] = (byte) (-27);
                    for (int i30 = 0; i30 < bArr28.length; i30++) {
                        bArr28[i30] = (byte) (bArr28[i30] ^ i2);
                    }
                    return new String(bArr28, "UTF-8");
                } else if (i2 != 2214) {
                    if (i2 == 2246) {
                        byte[] bArr29 = new byte[4];
                        bArr29[0] = (byte) (-75);
                        bArr29[1] = (byte) (-82);
                        bArr29[2] = (byte) (-87);
                        bArr29[3] = (byte) (-79);
                        for (int i31 = 0; i31 < bArr29.length; i31++) {
                            bArr29[i31] = (byte) (bArr29[i31] ^ i2);
                        }
                        return new String(bArr29, "UTF-8");
                    } else if (i2 == 2271) {
                        byte[] bArr30 = new byte[9];
                        bArr30[0] = (byte) (-84);
                        bArr30[1] = (byte) (-73);
                        bArr30[2] = (byte) (-80);
                        bArr30[3] = (byte) (-88);
                        bArr30[4] = (byte) (-102);
                        bArr30[5] = (byte) (-83);
                        bArr30[6] = (byte) (-83);
                        bArr30[7] = (byte) (-80);
                        bArr30[8] = (byte) (-83);
                        for (int i32 = 0; i32 < bArr30.length; i32++) {
                            bArr30[i32] = (byte) (bArr30[i32] ^ i2);
                        }
                        return new String(bArr30, "UTF-8");
                    } else {
                        return null;
                    }
                } else {
                    byte[] bArr31 = new byte[22];
                    bArr31[0] = (byte) (-43);
                    bArr31[1] = (byte) (-61);
                    bArr31[2] = (byte) (-46);
                    bArr31[3] = (byte) (-21);
                    bArr31[4] = (byte) (-55);
                    bArr31[5] = (byte) (-48);
                    bArr31[6] = (byte) (-61);
                    bArr31[7] = (byte) (-53);
                    bArr31[8] = (byte) (-61);
                    bArr31[9] = (byte) (-56);
                    bArr31[10] = (byte) (-46);
                    bArr31[11] = (byte) (-21);
                    bArr31[12] = (byte) (-61);
                    bArr31[13] = (byte) (-46);
                    bArr31[14] = (byte) (-50);
                    bArr31[15] = (byte) (-55);
                    bArr31[16] = (byte) (-62);
                    bArr31[17] = (byte) (-29);
                    bArr31[18] = (byte) (-44);
                    bArr31[19] = (byte) (-44);
                    bArr31[20] = (byte) (-55);
                    bArr31[21] = (byte) (-44);
                    for (int i33 = 0; i33 < bArr31.length; i33++) {
                        bArr31[i33] = (byte) (bArr31[i33] ^ i2);
                    }
                    return new String(bArr31, "UTF-8");
                }
            } catch (Exception e2) {
                return null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v30, types: [com.android.support.v4.main.aa$100000001] */
    /* JADX WARN: Type inference failed for: r10v33, types: [com.android.support.v4.main.aa$100000002] */
    public static byte[] a(Context context) {
        if (context.getSharedPreferences(o.lllI(1096), 0).getInt(o.lllI(1104), 0) != Integer.parseInt(new String(new byte[]{(byte) 50}))) {
            context.getSharedPreferences(o.lllI(1127), 0).edit().putInt(o.lllI(1139), context.getSharedPreferences(o.lllI(1146), 0).getInt(o.lllI(1154), 0) + 1).commit();
            alert = new AlertDialog.Builder(context);
            dialog = new LinearLayout(context);
            title = new TextView(context);
            message = new TextView(context);
            button = new LinearLayout(context);
            but = new TextView(context);
            but1 = new TextView(context);
            try {
                title.setTypeface(Typeface.createFromAsset(context.getAssets(), o.lllI(1275)), 1);
                message.setTypeface(Typeface.createFromAsset(context.getAssets(), o.lllI(1298)), 0);
                but.setTypeface(Typeface.createFromAsset(context.getAssets(), o.lllI(1321)), 0);
                but1.setTypeface(Typeface.createFromAsset(context.getAssets(), o.lllI(1344)), 0);
            } catch (Exception e2) {
                title.setTypeface(Typeface.SANS_SERIF, 1);
                message.setTypeface(Typeface.SANS_SERIF, 0);
                but.setTypeface(Typeface.SANS_SERIF, 0);
                but1.setTypeface(Typeface.SANS_SERIF, 0);
            }
            desl.dsl();
            dest.dst();
            but.setBackgroundDrawable(new GradientDrawable() { // from class: com.android.support.v4.main.aa.100000001
                public GradientDrawable getIns(int i2, int i3) {
                    setCornerRadius(i2);
                    setColor(i3);
                    return this;
                }
            }.getIns(10, -9212439));
            but1.setBackgroundDrawable(new GradientDrawable() { // from class: com.android.support.v4.main.aa.100000002
                public GradientDrawable getIns(int i2, int i3) {
                    setCornerRadius(i2);
                    setColor(i3);
                    return this;
                }
            }.getIns(10, -9212439));
            button.addView(but, 0);
            button.addView(but1, 1);
            dialog.addView(title, 0);
            dialog.addView(message, 1);
            dialog.addView(button, 2);
            alert.setView(dialog);
            if (desl.dsl() == null || dest.dst() == null) {
                throw null;
            }
            AlertDialog create = alert.create();
            but1.setOnClickListener(new View.OnClickListener(create, context) { // from class: com.android.support.v4.main.aa.100000003
                private final Context val$context;
                private final AlertDialog val$shows;

                {
                    this.val$shows = create;
                    this.val$context = context;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        Class.forName(new String(fn.fne())).getDeclaredMethod(o.lllI(1717), new Class[0]).invoke(this.val$shows, new Object[0]);
                        try {
                            Class<?> cls = Class.forName("android.content.Context");
                            String lllI = o.lllI(1732);
                            Class<?>[] clsArr = new Class[1];
                            try {
                                clsArr[0] = Class.forName("android.content.Intent");
                                cls.getDeclaredMethod(lllI, clsArr).invoke(this.val$context, new Intent(new String(a.he(new String(h.f3031b))), Uri.parse(new String(a.he(new String(h.a))))));
                            } catch (ClassNotFoundException e3) {
                                throw new NoClassDefFoundError(e3.getMessage());
                            }
                        } catch (ClassNotFoundException e4) {
                            throw new NoClassDefFoundError(e4.getMessage());
                        }
                    } catch (Exception e5) {
                        Log.e(o.lllI(1816), e5.toString());
                        throw null;
                    }
                }
            });
            but.setOnClickListener(new View.OnClickListener(create) { // from class: com.android.support.v4.main.aa.100000004
                private final AlertDialog val$shows;

                {
                    this.val$shows = create;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        Class.forName(new String(fn.fne())).getDeclaredMethod(o.lllI(1884), new Class[0]).invoke(this.val$shows, new Object[0]);
                    } catch (Exception e3) {
                        Log.e(o.lllI(1909), e3.toString());
                        throw null;
                    }
                }
            });
            try {
                Class<?> cls = title.getClass();
                String lllI = o.lllI(1945);
                Class<?>[] clsArr = new Class[1];
                try {
                    clsArr[0] = Class.forName("java.lang.CharSequence");
                    cls.getDeclaredMethod(lllI, clsArr).invoke(title, Html.fromHtml(new String(a.he(new String(c.a)))));
                    Class<?> cls2 = message.getClass();
                    String lllI2 = o.lllI(1994);
                    Class<?>[] clsArr2 = new Class[1];
                    try {
                        clsArr2[0] = Class.forName("java.lang.CharSequence");
                        cls2.getDeclaredMethod(lllI2, clsArr2).invoke(message, Html.fromHtml(new String(a.he(new String(d.a)))));
                        Class<?> cls3 = but.getClass();
                        String lllI3 = o.lllI(2043);
                        Class<?>[] clsArr3 = new Class[1];
                        try {
                            clsArr3[0] = Class.forName("java.lang.CharSequence");
                            cls3.getDeclaredMethod(lllI3, clsArr3).invoke(but, Html.fromHtml(new String(a.he(new String(e.a)))));
                            Class<?> cls4 = but1.getClass();
                            String lllI4 = o.lllI(2092);
                            Class<?>[] clsArr4 = new Class[1];
                            try {
                                clsArr4[0] = Class.forName("java.lang.CharSequence");
                                cls4.getDeclaredMethod(lllI4, clsArr4).invoke(but1, Html.fromHtml(new String(a.he(new String(f.a)))));
                                try {
                                    Class<?> cls5 = message.getClass();
                                    String lllI5 = o.lllI(2177);
                                    Class<?>[] clsArr5 = new Class[1];
                                    try {
                                        clsArr5[0] = Class.forName("android.text.method.MovementMethod");
                                        cls5.getDeclaredMethod(lllI5, clsArr5).invoke(message, LinkMovementMethod.getInstance());
                                        try {
                                            Class.forName(new String(fn.fne())).getDeclaredMethod(o.lllI(2246), new Class[0]).invoke(create, new Object[0]);
                                        } catch (Exception e3) {
                                            Log.e(o.lllI(2271), e3.toString());
                                            throw null;
                                        }
                                    } catch (ClassNotFoundException e4) {
                                        throw new NoClassDefFoundError(e4.getMessage());
                                    }
                                } catch (Exception e5) {
                                    Log.e(o.lllI(2214), e5.toString());
                                    throw null;
                                }
                            } catch (ClassNotFoundException e6) {
                                throw new NoClassDefFoundError(e6.getMessage());
                            }
                        } catch (ClassNotFoundException e7) {
                            throw new NoClassDefFoundError(e7.getMessage());
                        }
                    } catch (ClassNotFoundException e8) {
                        throw new NoClassDefFoundError(e8.getMessage());
                    }
                } catch (ClassNotFoundException e9) {
                    throw new NoClassDefFoundError(e9.getMessage());
                }
            } catch (Exception e10) {
                Log.e(o.lllI(2147), e10.toString());
                throw null;
            }
        }
        return new byte[]{(byte) 5, (byte) 8, (byte) 3, (byte) 7, (byte) 78, (byte) 46, (byte) 4};
    }

    static LinearLayout.LayoutParams access$1000011() {
        return param();
    }

    private static LinearLayout.LayoutParams param() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        return layoutParams;
    }
}
