package com.habisofttech.ceronne.gestion.contracts;

import android.provider.BaseColumns;



public class DepenseContract {

    public static final class DepenseEntry implements BaseColumns{
        public static final String TABLE_NAME = "depense";
        public static final String LABEL = "depenselabel";
        public static final String MONTANT = "montant";
        public static final String DATE = "date";
        public static final String CATEGORIE = "depensecategorie";

    }

    public static final class CategorieEntry implements BaseColumns{
        public static final String TABLE_NAME = "categorie";
        public static final String LABEL = "categorielabel";
    }
}
