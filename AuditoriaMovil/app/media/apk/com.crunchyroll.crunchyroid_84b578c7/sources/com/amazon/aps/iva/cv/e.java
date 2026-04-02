package com.amazon.aps.iva.cv;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItemLocation;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItemPositionUpdateRequest;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListItemRequest;
/* compiled from: CrunchylistInteractor.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.a implements d {
    public final EtpContentService b;

    /* compiled from: CrunchylistInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.AFTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.BEFORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public e(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    @Override // com.amazon.aps.iva.cv.d
    public final Object k(String str, String str2, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object addItemToCustomList = this.b.addItemToCustomList(str, new CustomListItemRequest(str2), dVar);
        if (addItemToCustomList == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return addItemToCustomList;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.cv.d
    public final Object k1(String str, String str2, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object deleteItemFromCustomList = this.b.deleteItemFromCustomList(str, str2, dVar);
        if (deleteItemFromCustomList == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deleteItemFromCustomList;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.cv.d
    public final Object n0(String str, String str2, String str3, f fVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        CustomListItemLocation customListItemLocation;
        int i = a.a[fVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                customListItemLocation = CustomListItemLocation.BEFORE;
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
        } else {
            customListItemLocation = CustomListItemLocation.AFTER;
        }
        Object changeCustomListItemPosition = this.b.changeCustomListItemPosition(str, str2, new CustomListItemPositionUpdateRequest(str3, customListItemLocation), dVar);
        if (changeCustomListItemPosition == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return changeCustomListItemPosition;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.cv.d
    public final Object y(String str, com.amazon.aps.iva.ob0.d dVar) {
        return EtpContentService.DefaultImpls.getCustomListItems$default(this.b, str, 1, 100, null, null, dVar, 24, null);
    }
}
