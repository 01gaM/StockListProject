package ru.billing.client;

import ru.itmo.exceptions.CatalogLoadException;
import ru.billing.stocklist.ItemCatalog;

public interface CatalogLoader {
    public void load(ItemCatalog cat) throws CatalogLoadException;
}
