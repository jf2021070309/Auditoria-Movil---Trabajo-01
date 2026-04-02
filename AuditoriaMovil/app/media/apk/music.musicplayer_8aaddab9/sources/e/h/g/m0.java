package e.h.g;

import java.util.Locale;
/* loaded from: classes2.dex */
public class m0 {
    public static boolean a;

    static {
        String language = Locale.getDefault().getLanguage();
        language.equals(Locale.JAPANESE.getLanguage());
        a = language.equals(Locale.ENGLISH.getLanguage());
        language.equals(Locale.KOREAN.getLanguage());
        language.equals(Locale.CHINESE.getLanguage());
    }
}
