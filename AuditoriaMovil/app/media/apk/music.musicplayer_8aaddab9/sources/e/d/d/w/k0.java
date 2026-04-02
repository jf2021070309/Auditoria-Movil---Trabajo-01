package e.d.d.w;

import java.util.Locale;
/* loaded from: classes2.dex */
public final class k0 extends Exception {
    public k0(String str) {
        super(str);
        if (str == null) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    return;
                }
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    return;
                }
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    return;
                }
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    return;
                }
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    return;
                }
                break;
        }
    }
}
