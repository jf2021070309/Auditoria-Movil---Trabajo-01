package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public final class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, HashSet<String> hashSet) {
        List<InputMethodInfo> list;
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        try {
            list = inputMethodManager.getEnabledInputMethodList();
        } catch (Throwable unused) {
            list = null;
        }
        if (list != null) {
            int i = 0;
            for (InputMethodInfo inputMethodInfo : list) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                    if (inputMethodSubtype.getMode().equals("keyboard") && i < 10) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            try {
                                String replace = locale.replace("_", "-");
                                hashSet.add(replace);
                                IAlog.b("Available input language: %s", replace);
                                i++;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a() {
        try {
            String language = Locale.getDefault().getLanguage();
            try {
                IAlog.b("Available device language: %s", language);
                return language;
            } catch (Exception unused) {
                return language;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
