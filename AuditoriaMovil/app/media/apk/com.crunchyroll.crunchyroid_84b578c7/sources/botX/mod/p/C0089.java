package botX.mod.p;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Hex;
/* renamed from: botX.mod.p.ۦۖۧ  reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C0089 {

    /* renamed from: ۨۚۖۗ  reason: not valid java name and contains not printable characters */
    private static final int f3 = 3;

    /* renamed from: ۦۖ۫  reason: contains not printable characters */
    public static void m1(Context context) {
        if (context.getSharedPreferences("", 0).getInt("ShowBlahBlahBotX", 0) != 3) {
            context.getSharedPreferences("", 0).edit().putInt("ShowBlahBlahBotX", context.getSharedPreferences("", 0).getInt("ShowBlahBlahBotX", 0) + 1).commit();
            AlertDialog create = new AlertDialog.Builder(context).create();
            LinearLayout linearLayout = new LinearLayout(context);
            TextView textView = new TextView(context);
            TextView textView2 = new TextView(context);
            LinearLayout linearLayout2 = new LinearLayout(context);
            TextView textView3 = new TextView(context);
            TextView textView4 = new TextView(context);
            View textView5 = new TextView(context);
            textView.setText(m0("159aU7WD3nCHzQ4X4tvWIA==", "MODDER.ME🔥"));
            textView2.setText(m0("52gGXi+NHKJZf7LxCd4ZUyK+w3RVP950ZnV5zZDYpBSpLQLDUBbDU8dAwrh6PddN", "JOIN OUR TELEGRAM CHANNEL FOR PREMIUM UPDATES "));
            textView3.setText(m0("ugLeDG+NQGh0N9qjt1weNw==", "CLOSE"));
            textView4.setText(m0("Y7ZOBhId8BlcaiVQH7AlRQFi5iNkW8+g3L1iCOw+Tjs=", "👉JOIN TELEGRAM "));
            textView.setPadding(0, 0, 0, 50);
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            textView.setGravity(17);
            textView2.setGravity(17);
            textView2.setPadding(0, 0, 0, 50);
            textView.setTextSize(18.0f);
            textView.setTextColor(Color.parseColor("yellow"));
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "title.ttf"), 1);
                textView2.setTypeface(Typeface.createFromAsset(context.getAssets(), "message.ttf"), 0);
                textView3.setTypeface(Typeface.createFromAsset(context.getAssets(), "button.ttf"), 0);
                textView4.setTypeface(Typeface.createFromAsset(context.getAssets(), "button.ttf"), 0);
            } catch (Exception e) {
                textView.setTypeface(Typeface.SANS_SERIF, 1);
                textView2.setTypeface(Typeface.SANS_SERIF, 0);
                textView3.setTypeface(Typeface.SANS_SERIF, 0);
                textView4.setTypeface(Typeface.SANS_SERIF, 0);
            }
            textView2.setTextSize(16.0f);
            textView2.setTextColor(Color.parseColor("#ADD8E6"));
            textView3.setTextSize(15.0f);
            textView3.setPadding(20, 0, 20, 0);
            textView3.setTextColor(Color.parseColor("red"));
            textView4.setTextSize(15.0f);
            textView4.setPadding(30, 0, 30, 0);
            textView4.setTextColor(Color.parseColor("green"));
            linearLayout2.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            layoutParams.weight = 1.0f;
            layoutParams.setMargins(20, 0, 20, 0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 5;
            layoutParams2.weight = 1.0f;
            linearLayout2.setLayoutParams(layoutParams2);
            textView3.setLayoutParams(layoutParams2);
            textView3.setGravity(3);
            linearLayout2.addView(textView5, 0);
            linearLayout2.addView(textView3, 1);
            linearLayout2.addView(textView4, 2);
            linearLayout.addView(textView, 0);
            linearLayout.addView(textView2, 1);
            linearLayout.addView(linearLayout2, 2);
            linearLayout.setPadding(50, 50, 50, 50);
            linearLayout.setElevation(0.0f);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundDrawable(new C0090().m3(25, "black"));
            linearLayout.setLayoutParams(layoutParams);
            create.getWindow().setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), 20));
            create.setView(linearLayout, 20, 0, 20, 0);
            create.setCancelable(false);
            create.requestWindowFeature(1);
            create.getWindow().setSoftInputMode(3);
            textView4.setOnClickListener(new View$OnClickListenerC0087(create, context));
            textView3.setOnClickListener(new View$OnClickListenerC0088(create));
            create.show();
        }
    }

    /* renamed from: ۨ۫ۗۗ  reason: not valid java name and contains not printable characters */
    private static SecretKey m2(String str) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Hex.DEFAULT_CHARSET_NAME);
        messageDigest.update(bytes, 0, bytes.length);
        return new SecretKeySpec(messageDigest.digest(), "AES");
    }

    /* renamed from: ۢۘۤۗ  reason: not valid java name and contains not printable characters */
    private static String m0(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, (SecretKeySpec) m2(str2));
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e) {
            return "";
        }
    }
}
