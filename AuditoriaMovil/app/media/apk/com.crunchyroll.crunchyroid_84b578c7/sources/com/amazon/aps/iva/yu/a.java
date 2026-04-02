package com.amazon.aps.iva.yu;

import com.crunchyroll.crunchyroid.R;
import java.util.Arrays;
/* compiled from: AddToCrunchylistsActionMessage.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.bt.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String[] strArr, int i) {
        super(R.string.crunchylist_add_to_crunchylist_success_already_added_message, null, (String[]) Arrays.copyOf(strArr, strArr.length), 2, null);
        if (i != 1) {
        } else {
            super(R.string.crunchylist_search_add_to_crunchylist_success_message, null, (String[]) Arrays.copyOf(strArr, strArr.length), 2, null);
        }
    }
}
