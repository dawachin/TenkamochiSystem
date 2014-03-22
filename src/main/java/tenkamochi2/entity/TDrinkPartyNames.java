package tenkamochi2.entity;

import java.util.Date;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;
import tenkamochi2.entity.TPartyNames._TPartyNames;

/**
 * {@link TDrinkParty}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/03/23 0:38:56")
public class TDrinkPartyNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * drunkTimeのプロパティ名を返します。
     * 
     * @return drunkTimeのプロパティ名
     */
    public static PropertyName<Date> drunkTime() {
        return new PropertyName<Date>("drunkTime");
    }

    /**
     * drunkRoomのプロパティ名を返します。
     * 
     * @return drunkRoomのプロパティ名
     */
    public static PropertyName<String> drunkRoom() {
        return new PropertyName<String>("drunkRoom");
    }

    /**
     * drunkMemoのプロパティ名を返します。
     * 
     * @return drunkMemoのプロパティ名
     */
    public static PropertyName<String> drunkMemo() {
        return new PropertyName<String>("drunkMemo");
    }

    /**
     * drunkDeadlineのプロパティ名を返します。
     * 
     * @return drunkDeadlineのプロパティ名
     */
    public static PropertyName<Date> drunkDeadline() {
        return new PropertyName<Date>("drunkDeadline");
    }

    /**
     * tPartyのプロパティ名を返します。
     * 
     * @return tPartyのプロパティ名
     */
    public static _TPartyNames tParty() {
        return new _TPartyNames("tParty");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _TDrinkPartyNames extends PropertyName<TDrinkParty> {

        /**
         * インスタンスを構築します。
         */
        public _TDrinkPartyNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _TDrinkPartyNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _TDrinkPartyNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * drunkTimeのプロパティ名を返します。
         *
         * @return drunkTimeのプロパティ名
         */
        public PropertyName<Date> drunkTime() {
            return new PropertyName<Date>(this, "drunkTime");
        }

        /**
         * drunkRoomのプロパティ名を返します。
         *
         * @return drunkRoomのプロパティ名
         */
        public PropertyName<String> drunkRoom() {
            return new PropertyName<String>(this, "drunkRoom");
        }

        /**
         * drunkMemoのプロパティ名を返します。
         *
         * @return drunkMemoのプロパティ名
         */
        public PropertyName<String> drunkMemo() {
            return new PropertyName<String>(this, "drunkMemo");
        }

        /**
         * drunkDeadlineのプロパティ名を返します。
         *
         * @return drunkDeadlineのプロパティ名
         */
        public PropertyName<Date> drunkDeadline() {
            return new PropertyName<Date>(this, "drunkDeadline");
        }

        /**
         * tPartyのプロパティ名を返します。
         * 
         * @return tPartyのプロパティ名
         */
        public _TPartyNames tParty() {
            return new _TPartyNames(this, "tParty");
        }
    }
}