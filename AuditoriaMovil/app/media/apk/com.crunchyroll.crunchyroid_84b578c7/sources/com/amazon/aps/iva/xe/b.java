package com.amazon.aps.iva.xe;

import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: ModelCache.kt */
/* loaded from: classes.dex */
public interface b<T> {
    Object clear(com.amazon.aps.iva.ob0.d<? super q> dVar);

    Object deleteItem(String str, com.amazon.aps.iva.ob0.d<? super q> dVar);

    Object readAllItems(com.amazon.aps.iva.ob0.d<? super List<? extends T>> dVar);

    Object readAllKeys(com.amazon.aps.iva.ob0.d<? super List<String>> dVar);

    Object readItem(String str, com.amazon.aps.iva.ob0.d<? super T> dVar);

    Object readRawItem(String str, com.amazon.aps.iva.ob0.d<? super T> dVar);

    Object saveItem(T t, com.amazon.aps.iva.ob0.d<? super q> dVar);

    Object saveItems(List<? extends T> list, com.amazon.aps.iva.ob0.d<? super q> dVar);
}
